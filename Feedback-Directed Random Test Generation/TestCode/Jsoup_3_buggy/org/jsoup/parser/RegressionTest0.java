package org.jsoup.parser;

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
            org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "hi!", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag3, "", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document2.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        java.util.Set<java.lang.String> strSet6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document2.classNames(strSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document2.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document2.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag5.isValidParent(tag7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "#document");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element4.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.Class<?> wildcardClass8 = element7.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document2.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        element6.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        java.lang.Class<?> wildcardClass7 = elements6.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element6.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = element6.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element11.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = elements6.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.lang.String str10 = element6.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.select.Elements elements14 = document12.getAllElements();
        java.lang.String str15 = document12.id();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        org.jsoup.nodes.Element element20 = document12.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element28 = document18.appendChild((org.jsoup.nodes.Node) element27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Element element12 = element11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueEnding("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        java.lang.Class<?> wildcardClass11 = element10.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document9.attributes();
        org.jsoup.parser.Tag tag12 = document9.tag();
        // The following exception was thrown during execution in test generation
        try {
            element6.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueNot("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueEnding("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueEnding("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean10 = element8.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element8.attr("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element11.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document2.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element8.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Element element12 = element11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValue("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag3.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element9.attr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        java.lang.String str10 = document2.baseUri();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Element element15 = document13.empty();
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        java.lang.Class<?> wildcardClass27 = tag1.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        org.jsoup.select.Elements elements11 = element4.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element4.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        java.lang.String str15 = element14.baseUri();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document18.child((int) (short) 0);
        org.jsoup.nodes.Element element24 = document18.empty();
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, "");
        java.lang.String[] strArray31 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element28.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element35 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        // The following exception was thrown during execution in test generation
        try {
            element14.replaceWith((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document2.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        java.lang.Class<?> wildcardClass11 = element6.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        org.jsoup.nodes.Element element13 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = document16.prependText("#document");
        org.jsoup.nodes.Element element23 = element21.prependElement("#document");
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element6.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Element element12 = element11.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element12.hasText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.append("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element10 = element8.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element10.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document2.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "#document");
        org.jsoup.nodes.Element element3 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = element3.hasText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        java.lang.String str5 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.select.Elements elements16 = element15.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document9.child((int) (short) 0);
        boolean boolean15 = tag1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        org.jsoup.select.Elements elements12 = element6.getElementsByIndexLessThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element6.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        // The following exception was thrown during execution in test generation
        try {
            element11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element11.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = element19.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.child(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element7.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element11.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements16 = element4.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element4.select("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? hi! ?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements15 = element14.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.lang.String str9 = element8.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.util.Set<java.lang.String> strSet12 = document9.classNames();
        org.jsoup.nodes.Element element13 = element4.classNames(strSet12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element13.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str13 = document9.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" + "'", str13, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        java.lang.String str10 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document2.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        java.lang.String str4 = tag1.getName();
        boolean boolean5 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueStarting("hi!#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean10 = element8.hasAttr("");
        java.lang.Class<?> wildcardClass11 = element8.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.nodeName();
        org.jsoup.select.Elements elements7 = document5.getAllElements();
        java.lang.String str8 = document5.id();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
        org.jsoup.nodes.Element element13 = document5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element21 = document11.appendChild((org.jsoup.nodes.Node) element20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document2.prependChild((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        java.lang.Class<?> wildcardClass13 = element11.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document2.text("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element4.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        java.lang.Class<?> wildcardClass11 = element4.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element13 = element10.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.select.Elements elements18 = document16.getAllElements();
        java.lang.String str19 = document16.id();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        org.jsoup.nodes.Element element24 = document16.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements27 = document22.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element13.appendChild((org.jsoup.nodes.Node) document22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        java.lang.Integer int13 = document2.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element3.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = document2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag9, "");
        java.lang.String[] strArray14 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = element11.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = element11.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element11.childNodes();
        java.util.Set<java.lang.String> strSet21 = element11.classNames();
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.getName();
        java.lang.String str5 = tag1.toString();
        boolean boolean6 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueStarting("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.toString();
        java.lang.Class<?> wildcardClass9 = element6.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.parser.Tag tag15 = element12.tag();
        java.lang.String str16 = element12.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element9 = document2.appendText("hi!");
        org.jsoup.nodes.Element element11 = document2.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.select("hi!#document");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!#document");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        org.jsoup.nodes.Element element13 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = element13.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element15.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        java.lang.String str11 = element4.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        org.jsoup.nodes.Element element12 = element6.appendElement("body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.nodes.Element element9 = element7.prependElement("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element20 = element14.appendText("hi!");
        org.jsoup.nodes.Element element23 = element14.attr("#root", "#document");
        org.jsoup.select.Elements elements25 = element14.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = element7.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        org.jsoup.select.Elements elements14 = element11.getElementsByAttribute("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.parser.Tag tag18 = element4.tag();
        boolean boolean19 = tag18.isInline();
        boolean boolean20 = tag18.preserveWhitespace();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag18, "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueContaining("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element12.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.nodes.Element element9 = document2.parent();
        java.lang.String str10 = document2.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexGreaterThan((int) (byte) 1);
        boolean boolean13 = element6.hasClass("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        org.jsoup.nodes.Node node22 = element17.nextSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str10 = document2.val();
        java.lang.String str11 = document2.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element12 = document10.text("hi!");
        org.jsoup.select.Elements elements14 = element12.select("#document");
        boolean boolean15 = tag1.equals((java.lang.Object) "#document");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element12.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document2.select("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>? hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element7 = document5.text("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements14 = document12.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element15 = element7.prependChild((org.jsoup.nodes.Node) document12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements31 = element17.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element31 = document29.text("hi!");
        java.lang.String str32 = document29.outerHtml();
        java.lang.String str33 = document29.data();
        boolean boolean34 = tag1.equals((java.lang.Object) document29);
        boolean boolean35 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str32, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        boolean boolean15 = tag1.canContainBlock();
        boolean boolean16 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        java.lang.String str10 = element7.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str10, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        boolean boolean24 = element23.isBlock();
        boolean boolean25 = element23.hasText();
        org.jsoup.parser.Tag tag26 = element23.tag();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        org.jsoup.nodes.Element element29 = document8.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.removeClass("#document");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet55 = element50.classNames();
        org.jsoup.nodes.Element element56 = element34.classNames(strSet55);
        org.jsoup.nodes.Element element57 = element29.classNames(strSet55);
        boolean boolean59 = element57.hasAttr("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document7.child((int) (short) 0);
        org.jsoup.nodes.Element element13 = document7.empty();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "");
        java.lang.String[] strArray20 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element17.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element25 = document2.classNames((java.util.Set<java.lang.String>) strSet21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element25.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        java.lang.String str22 = element21.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag3.preserveWhitespace();
        boolean boolean5 = tag3.isInline();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        boolean boolean14 = tag3.equals((java.lang.Object) "#document");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str19 = tag18.toString();
        org.jsoup.parser.Tag tag20 = tag18.getImplicitParent();
        boolean boolean21 = tag16.equals((java.lang.Object) tag18);
        java.lang.String str22 = tag16.toString();
        java.lang.String str23 = tag16.toString();
        boolean boolean24 = tag3.canContain(tag16);
        boolean boolean25 = tag3.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = element13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        boolean boolean8 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        boolean boolean10 = tag9.preserveWhitespace();
        java.lang.String str11 = tag9.toString();
        boolean boolean12 = tag9.isEmpty();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = document19.appendText("hi!");
        org.jsoup.nodes.Attributes attributes26 = document19.attributes();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag14, "hi!", attributes26);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        document31.setBaseUri("hi!");
        org.jsoup.nodes.Element element35 = document31.empty();
        org.jsoup.nodes.Element element37 = document31.appendText("hi!");
        org.jsoup.nodes.Attributes attributes38 = document31.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag14, "#document", attributes38);
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document42.childNodes();
        document42.setBaseUri("hi!");
        org.jsoup.nodes.Element element46 = document42.empty();
        org.jsoup.nodes.Element element48 = element46.append("");
        org.jsoup.parser.Tag tag49 = element46.tag();
        boolean boolean50 = tag14.canContain(tag49);
        boolean boolean51 = tag14.preserveWhitespace();
        boolean boolean52 = tag14.isBlock();
        boolean boolean53 = tag14.isInline();
        boolean boolean54 = tag14.preserveWhitespace();
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str57 = tag56.toString();
        boolean boolean58 = tag14.equals((java.lang.Object) tag56);
        boolean boolean59 = tag9.canContain(tag14);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str20 = element13.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str20, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = element17.select("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>? <head>? </head>? <body>?  hi! ? </body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        java.lang.String str15 = element14.baseUri();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document18.child((int) (short) 0);
        java.lang.String str25 = document18.attr("#document");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Element element30 = document28.empty();
        java.lang.String str31 = element30.val();
        org.jsoup.nodes.Element element32 = document18.prependChild((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element33 = element30.firstElementSibling();
        org.jsoup.select.Elements elements35 = element30.getElementsByClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element14.prependChild((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        java.lang.String str13 = element8.text();
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.nodes.Element element9 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element4.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element41.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element30 = element22.getElementById("#root");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element38 = document33.prependText("#document");
        org.jsoup.nodes.Element element40 = element38.prependElement("#document");
        org.jsoup.select.Elements elements42 = element40.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element22.prependChild((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.nodes.Element element14 = element8.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element14.isBlock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str18 = tag17.toString();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        boolean boolean20 = tag15.equals((java.lang.Object) tag17);
        boolean boolean21 = tag15.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag15, "#root");
        boolean boolean24 = tag15.preserveWhitespace();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes30 = document28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag15, "#root", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag10, "#document", attributes30);
        java.lang.String str33 = tag10.getName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        org.jsoup.nodes.Element element22 = element17.empty();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        org.jsoup.nodes.Element element27 = document25.empty();
        java.lang.String str28 = element27.val();
        org.jsoup.nodes.Attributes attributes29 = element27.attributes();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str33 = document32.nodeName();
        org.jsoup.select.Elements elements34 = document32.getAllElements();
        java.lang.String str35 = document32.id();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document38.childNodes();
        org.jsoup.nodes.Element element40 = document32.appendChild((org.jsoup.nodes.Node) document38);
        java.lang.String str42 = document32.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element44 = document32.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean45 = element27.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements47 = element27.getElementsByAttribute("hi!#document");
        org.jsoup.nodes.Element element48 = element17.appendChild((org.jsoup.nodes.Node) element27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element17.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element4.removeClass("#root");
        org.jsoup.nodes.Element element22 = element21.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = element22.html();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = document2.data();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element18.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = element14.isBlock();
        boolean boolean17 = element14.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element13.select("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        element11.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueContaining("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        org.jsoup.nodes.Element element13 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.text("body");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = document2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str21 = tag20.toString();
        org.jsoup.parser.Tag tag22 = tag20.getImplicitParent();
        boolean boolean23 = tag18.equals((java.lang.Object) tag20);
        boolean boolean24 = tag18.isBlock();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag18, "#root");
        boolean boolean27 = tag18.preserveWhitespace();
        boolean boolean28 = element16.equals((java.lang.Object) tag18);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag18, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        org.jsoup.nodes.Element element35 = document33.empty();
        java.lang.String str36 = element35.id();
        org.jsoup.parser.Tag tag37 = element35.tag();
        org.jsoup.parser.Tag tag38 = tag37.getImplicitParent();
        boolean boolean39 = tag18.isValidParent(tag38);
        boolean boolean40 = tag3.equals((java.lang.Object) tag38);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueNot("#root", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.Class<?> wildcardClass15 = elements14.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements11 = element9.children();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element9.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        java.lang.String str11 = document2.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag14.isValidParent(tag16);
        boolean boolean18 = tag16.isBlock();
        boolean boolean20 = tag16.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag16, "#document");
        org.jsoup.nodes.Element element23 = element12.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.Class<?> wildcardClass24 = element12.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element29.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByIndexGreaterThan(0);
        java.lang.Class<?> wildcardClass16 = element4.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Element element18 = element16.text("hi!");
        org.jsoup.select.Elements elements20 = element16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element22 = element16.appendText("hi!");
        org.jsoup.nodes.Element element25 = element16.attr("#root", "#document");
        org.jsoup.nodes.Element element27 = element16.removeClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        java.lang.String str7 = document2.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!#document");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = document9.appendText("hi!");
        org.jsoup.select.Elements elements17 = document9.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element19 = document9.appendText("#document");
        boolean boolean21 = document9.hasClass("hi!");
        org.jsoup.nodes.Element element22 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element23 = document9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = document9.select("hi!#document");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!#document");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Element element12 = element9.empty();
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document2.classNames(strSet13);
        org.jsoup.nodes.Element element17 = element14.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean19 = element17.hasClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements23 = document2.getElementsByIndexGreaterThan(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = document2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.util.Set<java.lang.String> strSet5 = document2.classNames();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.nodeName();
        org.jsoup.select.Elements elements10 = document8.getAllElements();
        java.lang.String str11 = document8.id();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Element element16 = document8.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element24 = document14.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element29 = document27.text("hi!");
        boolean boolean30 = element29.isBlock();
        boolean boolean31 = element29.hasText();
        org.jsoup.parser.Tag tag32 = element29.tag();
        org.jsoup.nodes.Element element34 = element29.addClass("");
        org.jsoup.nodes.Element element35 = document14.appendChild((org.jsoup.nodes.Node) element29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = document2.prependChild((org.jsoup.nodes.Node) element29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element14 = element11.attr("body", "");
        org.jsoup.select.Elements elements15 = element11.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        org.jsoup.nodes.Element element22 = element17.empty();
        java.lang.String str23 = element17.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element4.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        java.lang.String str9 = element8.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueEnding("#root", "#document");
        org.jsoup.nodes.Element element13 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element14.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = element45.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.Integer int42 = element41.elementSiblingIndex();
        org.jsoup.select.Elements elements44 = element41.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element41.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        boolean boolean12 = element11.isBlock();
        boolean boolean13 = element11.hasText();
        org.jsoup.parser.Tag tag14 = element11.tag();
        element11.setBaseUri("#root");
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        org.jsoup.nodes.Element element10 = document2.getElementById("hi!hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element15 = document13.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document13.prepend("hi!#document");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = element24.append("");
        org.jsoup.nodes.Element element27 = element24.empty();
        java.util.Set<java.lang.String> strSet28 = element27.classNames();
        org.jsoup.nodes.Element element29 = document13.classNames(strSet28);
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) element29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag9.isValidParent(tag11);
        boolean boolean13 = tag1.canContain(tag11);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = document20.appendText("hi!");
        org.jsoup.nodes.Attributes attributes27 = document20.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag15, "hi!", attributes27);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = document32.childNodes();
        document32.setBaseUri("hi!");
        org.jsoup.nodes.Element element36 = document32.empty();
        org.jsoup.nodes.Element element38 = document32.appendText("hi!");
        org.jsoup.nodes.Attributes attributes39 = document32.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag15, "#document", attributes39);
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element45 = document43.text("hi!");
        java.lang.String str46 = document43.outerHtml();
        java.lang.String str47 = document43.data();
        boolean boolean48 = tag15.equals((java.lang.Object) document43);
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element53 = document51.text("hi!");
        org.jsoup.nodes.Element element55 = element53.text("hi!");
        org.jsoup.nodes.Element element57 = element53.prepend("");
        boolean boolean58 = tag15.equals((java.lang.Object) "");
        boolean boolean59 = tag11.isValidParent(tag15);
        boolean boolean60 = tag11.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str46, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.child(0);
        java.lang.String str9 = element7.attr("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document2.select("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag9.isValidParent(tag11);
        boolean boolean13 = tag1.canContain(tag11);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = document20.appendText("hi!");
        org.jsoup.nodes.Attributes attributes27 = document20.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag15, "hi!", attributes27);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = document32.childNodes();
        document32.setBaseUri("hi!");
        org.jsoup.nodes.Element element36 = document32.empty();
        org.jsoup.nodes.Element element38 = document32.appendText("hi!");
        org.jsoup.nodes.Attributes attributes39 = document32.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag15, "#document", attributes39);
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element45 = document43.text("hi!");
        java.lang.String str46 = document43.outerHtml();
        java.lang.String str47 = document43.data();
        boolean boolean48 = tag15.equals((java.lang.Object) document43);
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element53 = document51.text("hi!");
        org.jsoup.nodes.Element element55 = element53.text("hi!");
        org.jsoup.nodes.Element element57 = element53.prepend("");
        boolean boolean58 = tag15.equals((java.lang.Object) "");
        boolean boolean59 = tag11.isValidParent(tag15);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag11, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        java.lang.String str62 = tag11.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str46, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        java.lang.String str13 = element12.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element19.appendElement("hi!#document");
        org.jsoup.nodes.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element29.appendChild(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element13 = element11.append("");
        org.jsoup.nodes.Element element14 = element11.empty();
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes15);
        boolean boolean17 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.String str29 = element28.id();
        java.lang.String str30 = element28.outerHtml();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>" + "'", str30, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements11 = element9.children();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) '4');
        org.jsoup.select.Elements elements14 = element9.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.select.Elements elements10 = element7.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        java.lang.String str22 = document2.tagName();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.nodeName();
        org.jsoup.select.Elements elements27 = document25.getAllElements();
        java.lang.String str28 = document25.id();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        org.jsoup.nodes.Element element33 = document25.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        document36.setBaseUri("hi!");
        org.jsoup.nodes.Element element40 = document36.empty();
        org.jsoup.nodes.Element element41 = document31.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements42 = element40.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = document2.appendChild((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element6.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.parser.Tag tag6 = element4.tag();
        boolean boolean7 = tag6.canContainBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element6.removeAttr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str6 = element5.tagName();
        java.lang.Class<?> wildcardClass7 = element5.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element4.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.toggleClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements9 = element8.parents();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element8.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        java.lang.String str18 = element17.id();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.nodes.Element element9 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = element9.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        boolean boolean24 = element23.isBlock();
        boolean boolean25 = element23.hasText();
        org.jsoup.parser.Tag tag26 = element23.tag();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        org.jsoup.nodes.Element element29 = document8.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.removeClass("#document");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet55 = element50.classNames();
        org.jsoup.nodes.Element element56 = element34.classNames(strSet55);
        org.jsoup.nodes.Element element57 = element29.classNames(strSet55);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = element29.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag9.isValidParent(tag11);
        boolean boolean13 = tag1.canContain(tag11);
        boolean boolean14 = tag11.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.nodeName();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.lang.String str12 = document9.id();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        org.jsoup.nodes.Element element17 = document9.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element19 = document15.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node20 = element19.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        org.jsoup.nodes.Element element7 = document5.empty();
        java.lang.String str8 = element7.id();
        org.jsoup.parser.Tag tag9 = element7.tag();
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag1.canContain(tag9);
        boolean boolean12 = tag9.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.prependText("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element4.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = element12.val();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes11 = element4.attributes();
        org.jsoup.parser.Tag tag12 = element4.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element4.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.select.Elements elements3 = document2.children();
        org.jsoup.nodes.Element element5 = document2.wrap("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        org.jsoup.nodes.Element element10 = element4.wrap("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.nodeName();
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        java.lang.String str16 = document13.id();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        org.jsoup.nodes.Element element21 = document13.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document24.empty();
        org.jsoup.nodes.Element element29 = document19.appendChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.appendElement("#root");
        org.jsoup.nodes.Element element46 = element45.empty();
        org.jsoup.nodes.Attributes attributes47 = element46.attributes();
        org.jsoup.nodes.Element element49 = element46.appendElement("hi!");
        element29.replaceWith((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element52 = element29.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.jsoup.nodes.Element element68 = document55.classNames((java.util.Set<java.lang.String>) strSet66);
        org.jsoup.nodes.Element element69 = element29.classNames((java.util.Set<java.lang.String>) strSet66);
        org.jsoup.nodes.Element element70 = element4.appendChild((org.jsoup.nodes.Node) element69);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements72 = element4.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag12.canContainBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = element23.append("");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element16.classNames(strSet26);
        boolean boolean28 = element8.equals((java.lang.Object) element27);
        org.jsoup.select.Elements elements31 = element27.getElementsByAttributeValueStarting("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.String str29 = element28.id();
        org.jsoup.select.Elements elements31 = element28.getElementsByIndexEquals(100);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        org.jsoup.nodes.Element element19 = element16.appendElement("hi!");
        org.jsoup.nodes.Element element21 = element16.prepend("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element21.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.attr("hi!");
        java.util.Set<java.lang.String> strSet11 = element4.classNames();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.html();
        java.lang.Class<?> wildcardClass4 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        java.lang.String str13 = element12.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str13 = tag12.toString();
        org.jsoup.parser.Tag tag14 = tag12.getImplicitParent();
        boolean boolean15 = tag10.equals((java.lang.Object) tag12);
        boolean boolean16 = tag10.isBlock();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag10, "#root");
        boolean boolean19 = tag10.preserveWhitespace();
        boolean boolean20 = element8.equals((java.lang.Object) tag10);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.select.Elements elements32 = document25.parents();
        org.jsoup.parser.Tag tag33 = document25.tag();
        org.jsoup.parser.Tag tag34 = tag33.getImplicitParent();
        boolean boolean35 = tag10.isValidParent(tag34);
        org.jsoup.parser.Tag tag36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = tag34.isValidParent(tag36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str15 = element12.className();
        java.lang.String str17 = element12.absUrl("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        java.lang.String str6 = document2.data();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = element13.append("");
        org.jsoup.nodes.Element element16 = element13.empty();
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element19 = element16.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByIndexLessThan((int) 'a');
        boolean boolean22 = document2.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.nodes.Element element9 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        java.lang.String str11 = document2.data();
        org.jsoup.nodes.Element element13 = document2.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str14 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("hi!#document");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = element13.append("");
        org.jsoup.nodes.Element element16 = element13.empty();
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        java.lang.Class<?> wildcardClass19 = strSet17.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexGreaterThan(1);
        java.lang.String str19 = element13.attr("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element13.getElementsByAttributeValueContaining("", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        org.jsoup.nodes.Element element7 = document5.empty();
        java.lang.String str8 = element7.id();
        org.jsoup.parser.Tag tag9 = element7.tag();
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag1.canContain(tag9);
        boolean boolean12 = tag9.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.nodeName();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.id();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        org.jsoup.nodes.Element element22 = document14.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element24.getElementsByIndexGreaterThan(10);
        boolean boolean27 = element11.equals((java.lang.Object) 10);
        element11.setBaseUri("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan(100);
        org.jsoup.select.Elements elements21 = element17.getElementsByTag("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = element17.getElementsByClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.getElementById("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        java.lang.String str12 = element11.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.String str29 = element28.id();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element28.childNodes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element14 = document8.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document8.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.getElementById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element4.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes14 = element9.attributes();
        org.jsoup.nodes.Element element16 = element9.appendText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element9.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependText("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element11.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element4.getElementById("#root");
        element4.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element4.getElementsByIndexEquals((int) (short) 10);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag3.preserveWhitespace();
        boolean boolean5 = tag3.isInline();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        boolean boolean14 = tag3.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag3, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean17 = tag3.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        java.lang.String str14 = element12.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
        org.jsoup.select.Elements elements19 = element17.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element17.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.lang.Class<?> wildcardClass22 = element17.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document2.select("\n<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <hi!>?</hi!>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element4.select("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <hi!>?</hi!><#root>?<html>? <head>? </head>? <body>?  hi! ? </body>?</html>?</#root>?<html>?<head>?</head>?<body>? hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        java.lang.String str23 = element21.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str24 = element21.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element4.hasText();
        java.lang.Class<?> wildcardClass17 = element4.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        boolean boolean12 = element4.hasClass("#document");
        org.jsoup.select.Elements elements14 = element4.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element15 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element15.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element4.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element12.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements23 = document2.getElementsByIndexGreaterThan(1);
        java.lang.Class<?> wildcardClass24 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        java.lang.String str10 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueContaining("#root", "hi!");
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element3.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element3.children();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByIndexGreaterThan(100);
        java.lang.String str16 = element11.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        java.lang.String str7 = document2.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueEnding("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n<#root>\n</#root>\n</hi!>");
        java.lang.String str7 = element6.baseUri();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>\n<#root>\n</#root>\n</hi!>" + "'", str7, "<hi!>\n<#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element17 = document15.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element9.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Elements elements20 = element9.getElementsByIndexLessThan((int) 'a');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element10.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        boolean boolean7 = element6.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = document2.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document2.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.nodeName();
        org.jsoup.select.Elements elements20 = document18.getAllElements();
        java.lang.String str21 = document18.id();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        org.jsoup.nodes.Element element26 = document18.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element34 = document24.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element39 = document37.text("hi!");
        org.jsoup.nodes.Element element41 = element39.text("hi!");
        org.jsoup.select.Elements elements43 = element39.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element45 = element39.appendText("hi!");
        org.jsoup.nodes.Element element48 = element39.attr("#root", "#document");
        org.jsoup.nodes.Element element50 = element39.appendElement("#root");
        org.jsoup.nodes.Element element51 = element50.empty();
        org.jsoup.nodes.Attributes attributes52 = element51.attributes();
        org.jsoup.nodes.Element element54 = element51.appendElement("hi!");
        element34.replaceWith((org.jsoup.nodes.Node) element54);
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str59 = document58.nodeName();
        org.jsoup.select.Elements elements60 = document58.getAllElements();
        java.util.Set<java.lang.String> strSet61 = document58.classNames();
        org.jsoup.nodes.Element element62 = element34.classNames(strSet61);
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#document" + "'", str59, "#document");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.select.Elements elements21 = element8.getElementsByAttribute("#root");
        org.jsoup.nodes.Node node23 = element8.removeAttr("#document");
        java.lang.String str24 = node23.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element18 = element16.append("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        java.lang.String str29 = element23.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str30 = element23.html();
        // The following exception was thrown during execution in test generation
        try {
            element16.replaceWith((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element8.val("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element4.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements13 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document2.getElementsByAttributeValueNot("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Element element18 = element16.text("hi!");
        org.jsoup.nodes.Element element20 = element16.getElementById("#document");
        org.jsoup.nodes.Element element22 = element16.wrap("hi!");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.nodeName();
        org.jsoup.select.Elements elements27 = document25.getAllElements();
        java.lang.String str28 = document25.id();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        org.jsoup.nodes.Element element33 = document25.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        document36.setBaseUri("hi!");
        org.jsoup.nodes.Element element40 = document36.empty();
        org.jsoup.nodes.Element element41 = document31.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element46 = document44.text("hi!");
        org.jsoup.nodes.Element element48 = element46.text("hi!");
        org.jsoup.select.Elements elements50 = element46.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element52 = element46.appendText("hi!");
        org.jsoup.nodes.Element element55 = element46.attr("#root", "#document");
        org.jsoup.nodes.Element element57 = element46.appendElement("#root");
        org.jsoup.nodes.Element element58 = element57.empty();
        org.jsoup.nodes.Attributes attributes59 = element58.attributes();
        org.jsoup.nodes.Element element61 = element58.appendElement("hi!");
        element41.replaceWith((org.jsoup.nodes.Node) element61);
        org.jsoup.nodes.Element element64 = element41.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.jsoup.nodes.Element element80 = document67.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element81 = element41.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element82 = element16.appendChild((org.jsoup.nodes.Node) element81);
        boolean boolean83 = element4.equals((java.lang.Object) element82);
        org.jsoup.nodes.Element element85 = element4.append("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(element85);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str44 = element43.html();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements29 = element22.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements31 = element22.select("<hi!>\n<#root>\n</#root>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <hi!>?<#root>?</#root>?</hi!>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.jsoup.select.Elements elements10 = element4.getElementsByAttribute("#document");
        boolean boolean12 = element4.hasClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str10 = element4.data();
        boolean boolean12 = element4.hasAttr("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        boolean boolean24 = element23.isBlock();
        boolean boolean25 = element23.hasText();
        org.jsoup.parser.Tag tag26 = element23.tag();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        org.jsoup.nodes.Element element29 = document8.appendChild((org.jsoup.nodes.Node) element23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = document8.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements18 = element15.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element20 = element15.append("hi!#document");
        java.lang.String str21 = element20.id();
        org.jsoup.nodes.Node node23 = element20.removeAttr("body");
        org.jsoup.select.Elements elements25 = element20.getElementsByClass("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        boolean boolean11 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        java.lang.String str13 = element6.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document2.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        org.jsoup.nodes.Element element11 = element9.text("hi!");
        org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = element9.appendText("hi!");
        org.jsoup.nodes.Element element17 = element15.text("");
        boolean boolean18 = tag1.equals((java.lang.Object) element17);
        org.jsoup.select.Elements elements19 = element17.parents();
        org.jsoup.select.Elements elements20 = element17.children();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        boolean boolean12 = element4.hasClass("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = element22.append("");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element27 = element24.append("");
        org.jsoup.nodes.Element element29 = element27.wrap("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element4.hasText();
        org.jsoup.nodes.Element element18 = element4.val("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str44 = element41.className();
        org.jsoup.nodes.Element element46 = element41.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element47 = element46.empty();
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element52 = document50.text("hi!");
        boolean boolean53 = element52.isBlock();
        boolean boolean54 = element52.hasText();
        java.lang.String str55 = element52.data();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element52.childNodes();
        java.lang.String str57 = element52.toString();
        org.jsoup.nodes.Element element59 = element52.prependElement("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element60 = element47.prependChild((org.jsoup.nodes.Node) element59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str57, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("#root");
        org.jsoup.nodes.Element element15 = element6.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element7.attr("hi!hi!", "#root");
        java.lang.String str15 = element14.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document hi!" + "'", str15, "#document hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element3.childNodes();
        boolean boolean14 = element3.hasAttr("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        java.lang.String str10 = element4.attr("#root");
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document");
        java.lang.String str13 = element12.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document2.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueContaining("hi!", "#root");
        boolean boolean15 = element9.hasClass("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements18 = element15.getElementsByIndexEquals((int) 'a');
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element15.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element15.select("hi!hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        org.jsoup.nodes.Element element9 = document7.empty();
        java.lang.String str10 = element9.id();
        org.jsoup.parser.Tag tag11 = element9.tag();
        org.jsoup.parser.Tag tag12 = tag11.getImplicitParent();
        java.lang.String str13 = tag12.toString();
        boolean boolean14 = tag1.isValidParent(tag12);
        boolean boolean15 = tag12.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str14 = document8.val();
        document8.remove();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        org.jsoup.select.Elements elements17 = document2.getElementsByAttributeValueEnding("\n<hi!>\n</hi!>", "#document hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document2.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Element element12 = element9.empty();
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document2.classNames(strSet13);
        org.jsoup.nodes.Element element17 = element14.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element17.val("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element19.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.removeClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.Integer int30 = element29.elementSiblingIndex();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag7.isValidParent(tag9);
        boolean boolean11 = tag9.canContainBlock();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.nodes.Element element15 = element13.toggleClass("");
        org.jsoup.nodes.Element element17 = element13.append("hi!");
        boolean boolean18 = tag5.equals((java.lang.Object) element17);
        boolean boolean19 = tag5.isInline();
        java.lang.String str20 = tag5.toString();
        boolean boolean21 = tag1.canContain(tag5);
        java.lang.String str22 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = document9.appendText("hi!");
        org.jsoup.select.Elements elements17 = document9.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element19 = document9.appendText("#document");
        boolean boolean21 = document9.hasClass("hi!");
        org.jsoup.nodes.Element element22 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element23 = document9.parent();
        java.lang.Class<?> wildcardClass24 = element23.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        org.jsoup.nodes.Element element17 = element4.classNames(strSet16);
        boolean boolean18 = element4.isBlock();
        java.lang.String str19 = element4.baseUri();
        org.jsoup.select.Elements elements21 = element4.getElementsByIndexGreaterThan(1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag12.canContainBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = element23.append("");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element16.classNames(strSet26);
        boolean boolean28 = element8.equals((java.lang.Object) element27);
        org.jsoup.nodes.Element element30 = element8.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str31 = element30.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Element element11 = element4.prependElement("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        java.lang.String str12 = element4.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        org.jsoup.select.Elements elements11 = element4.parents();
        java.lang.String str12 = element4.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.parser.Tag tag17 = document14.tag();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.parser.Tag tag19 = document14.tag();
        org.jsoup.nodes.Element element20 = element11.appendChild((org.jsoup.nodes.Node) document14);
        element20.setBaseUri("#document hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.className();
        org.jsoup.nodes.Element element8 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node10 = element8.removeAttr("#document");
        org.jsoup.select.Elements elements11 = element8.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element15 = document8.addClass("hi!hi!");
        org.jsoup.select.Elements elements16 = element15.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.parser.Tag tag10 = element4.tag();
        org.jsoup.nodes.Element element12 = element4.append("body");
        java.lang.Class<?> wildcardClass13 = element4.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean47 = element45.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean5 = element3.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document8.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        java.lang.String str30 = element14.html();
        java.util.Set<java.lang.String> strSet31 = element14.classNames();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.prependText("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = document8.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element11.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = element9.absUrl("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Node node17 = element4.removeAttr("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str44 = element41.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = element41.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.parser.Tag tag10 = element4.tag();
        org.jsoup.select.Elements elements13 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "hi!hi!");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.select.Elements elements18 = document16.getAllElements();
        java.lang.String str19 = document16.id();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        org.jsoup.nodes.Element element24 = document16.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.childNodes();
        document27.setBaseUri("hi!");
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.nodes.Element element32 = document22.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element37 = document35.text("hi!");
        org.jsoup.nodes.Element element39 = element37.text("hi!");
        org.jsoup.select.Elements elements41 = element37.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = element37.appendText("hi!");
        org.jsoup.nodes.Element element46 = element37.attr("#root", "#document");
        org.jsoup.nodes.Element element48 = element37.appendElement("#root");
        org.jsoup.nodes.Element element49 = element48.empty();
        org.jsoup.nodes.Attributes attributes50 = element49.attributes();
        org.jsoup.nodes.Element element52 = element49.appendElement("hi!");
        element32.replaceWith((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Element element55 = element32.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList62 = document61.childNodes();
        document61.setBaseUri("hi!");
        org.jsoup.nodes.Element element65 = document61.empty();
        org.jsoup.nodes.Element element67 = element65.append("");
        org.jsoup.nodes.Element element68 = element65.empty();
        java.util.Set<java.lang.String> strSet69 = element68.classNames();
        org.jsoup.nodes.Element element70 = document58.classNames(strSet69);
        org.jsoup.nodes.Element element73 = element70.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element74 = element32.appendChild((org.jsoup.nodes.Node) element70);
        org.jsoup.select.Elements elements76 = element32.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element78 = element32.removeClass("#document ");
        org.jsoup.nodes.Document document81 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element83 = document81.text("hi!");
        org.jsoup.nodes.Element element85 = element83.text("hi!");
        org.jsoup.nodes.Element element86 = element85.empty();
        java.lang.String str87 = element86.tagName();
        org.jsoup.select.Elements elements88 = element86.children();
        org.jsoup.select.Elements elements90 = element86.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element91 = element32.appendChild((org.jsoup.nodes.Node) element86);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element92 = element4.appendChild((org.jsoup.nodes.Node) element86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "#root" + "'", str87, "#root");
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(elements90);
        org.junit.Assert.assertNotNull(element91);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.prependText("#root");
        java.lang.String str9 = document2.toString();
        java.lang.String str10 = document2.html();
        java.lang.Class<?> wildcardClass11 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str9, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str10, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element8.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        boolean boolean12 = element4.hasClass("#document");
        org.jsoup.select.Elements elements14 = element4.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element15 = element4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element15.getAllElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        boolean boolean15 = element10.hasText();
        org.jsoup.select.Elements elements16 = element10.getAllElements();
        boolean boolean17 = document2.equals((java.lang.Object) element10);
        org.jsoup.nodes.Element element19 = document2.prependText("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan(100);
        org.jsoup.select.Elements elements21 = element17.getElementsByTag("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.Class<?> wildcardClass22 = elements21.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.nodeName();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.id();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        org.jsoup.nodes.Element element22 = document14.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element24.getElementsByIndexGreaterThan(10);
        boolean boolean27 = element11.equals((java.lang.Object) 10);
        org.jsoup.select.Elements elements30 = element11.getElementsByAttributeValue("hi!#document", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.prependElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.select("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>? hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        boolean boolean24 = element23.isBlock();
        boolean boolean25 = element23.hasText();
        org.jsoup.parser.Tag tag26 = element23.tag();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        org.jsoup.nodes.Element element29 = document8.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.removeClass("#document");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet55 = element50.classNames();
        org.jsoup.nodes.Element element56 = element34.classNames(strSet55);
        org.jsoup.nodes.Element element57 = element29.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element29.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements61 = element29.select("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html> ?<head> ?</head> ?<body>?  hi!  ?</body>?</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(element59);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        org.jsoup.nodes.Element element19 = element16.appendElement("hi!");
        java.lang.Class<?> wildcardClass20 = element16.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.getName();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element10 = document8.text("hi!");
        org.jsoup.nodes.Element element12 = element10.text("hi!");
        org.jsoup.nodes.Element element14 = element10.html("#root");
        org.jsoup.select.Elements elements16 = element10.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes17 = element10.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag1, "hi!#document", attributes17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean21 = element20.hasText();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        boolean boolean6 = document2.isBlock();
        org.jsoup.nodes.Element element8 = document2.html("#document ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag9.isValidParent(tag11);
        boolean boolean13 = tag1.canContain(tag11);
        java.lang.String str14 = tag11.getName();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str19 = tag18.toString();
        org.jsoup.parser.Tag tag20 = tag18.getImplicitParent();
        boolean boolean21 = tag16.equals((java.lang.Object) tag18);
        boolean boolean22 = tag16.isBlock();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag16, "#root");
        boolean boolean25 = tag16.isInline();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element30 = document28.text("hi!");
        org.jsoup.nodes.Element element32 = element30.text("hi!");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element36 = element30.appendText("hi!");
        org.jsoup.nodes.Element element39 = element30.attr("#root", "#document");
        org.jsoup.nodes.Node node41 = element30.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element43 = element30.append("");
        org.jsoup.parser.Tag tag44 = element30.tag();
        boolean boolean45 = tag16.canContain(tag44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        boolean boolean51 = element50.isBlock();
        boolean boolean52 = element50.hasText();
        org.jsoup.parser.Tag tag53 = element50.tag();
        org.jsoup.nodes.Element element55 = element50.addClass("");
        org.jsoup.parser.Tag tag56 = element50.tag();
        boolean boolean57 = tag44.isValidParent(tag56);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag56, "\n<hi!>\n</hi!>");
        boolean boolean60 = tag11.canContain(tag56);
        boolean boolean61 = tag11.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.text("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element21.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element31 = document26.child((int) (short) 0);
        java.lang.String str33 = document26.attr("#document");
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        org.jsoup.nodes.Element element38 = document36.empty();
        java.lang.String str39 = element38.val();
        org.jsoup.nodes.Element element40 = document26.prependChild((org.jsoup.nodes.Node) element38);
        org.jsoup.select.Elements elements41 = element40.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        document2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(0);
        java.lang.String str14 = document2.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str14, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        java.lang.String str8 = tag7.toString();
        boolean boolean9 = tag7.canContainBlock();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element22 = document16.appendText("hi!");
        org.jsoup.nodes.Attributes attributes23 = document16.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag11, "hi!", attributes23);
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        document28.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = document28.empty();
        org.jsoup.nodes.Element element34 = document28.appendText("hi!");
        org.jsoup.nodes.Attributes attributes35 = document28.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag11, "#document", attributes35);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = document39.childNodes();
        document39.setBaseUri("hi!");
        org.jsoup.nodes.Element element43 = document39.empty();
        org.jsoup.nodes.Element element45 = element43.append("");
        org.jsoup.parser.Tag tag46 = element43.tag();
        boolean boolean47 = tag11.canContain(tag46);
        boolean boolean48 = tag11.preserveWhitespace();
        boolean boolean49 = tag11.isBlock();
        boolean boolean50 = tag11.isInline();
        boolean boolean51 = tag11.preserveWhitespace();
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str54 = tag53.toString();
        boolean boolean55 = tag11.equals((java.lang.Object) tag53);
        boolean boolean56 = tag7.isValidParent(tag53);
        boolean boolean57 = tag53.isData();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str16 = tag15.toString();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        java.lang.String str18 = tag15.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element24 = document22.text("hi!");
        org.jsoup.nodes.Element element26 = element24.text("hi!");
        org.jsoup.nodes.Element element28 = element24.html("#root");
        org.jsoup.select.Elements elements30 = element24.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes31 = element24.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag15, "hi!#document", attributes31);
        org.jsoup.nodes.Element element33 = document2.prependChild((org.jsoup.nodes.Node) element32);
        java.lang.String str35 = element33.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n<#root>\n</#root>\n</hi!>");
        java.lang.String str7 = element6.text();
        java.lang.String str8 = element6.baseUri();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>\n<#root>\n</#root>\n</hi!>" + "'", str8, "<hi!>\n<#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.select.Elements elements37 = element34.getElementsByIndexEquals((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element38 = element13.prependChild((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = element4.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element8.toggleClass("#root");
        java.lang.String str15 = element13.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int16 = element13.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueEnding("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        java.lang.String str18 = element14.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.nodes.Element element20 = element14.html("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element20.prependChild(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.appendText("hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Element element15 = document13.empty();
        java.lang.String str16 = element15.id();
        java.lang.String str17 = element15.text();
        org.jsoup.nodes.Element element19 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element6.prependChild((org.jsoup.nodes.Node) element19);
        java.lang.String str24 = element19.text();
        java.util.Set<java.lang.String> strSet25 = element19.classNames();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.select.Elements elements13 = element4.select("#document hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((int) '#');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag3.isValidParent(tag5);
        boolean boolean7 = tag5.canContainBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.nodes.Element element11 = element9.toggleClass("");
        org.jsoup.nodes.Element element13 = element9.append("hi!");
        boolean boolean14 = tag1.equals((java.lang.Object) element13);
        boolean boolean15 = tag1.isInline();
        boolean boolean16 = tag1.isInline();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag1, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element19 = element18.parent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        org.jsoup.nodes.Element element8 = document2.addClass("");
        java.lang.Integer int9 = document2.elementSiblingIndex();
        java.lang.String str10 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        java.lang.String str10 = tag1.toString();
        boolean boolean11 = tag1.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element11.children();
        org.jsoup.select.Elements elements16 = element11.getElementsByIndexGreaterThan((int) 'a');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Element element16 = document14.empty();
        java.lang.String str17 = element16.text();
        org.jsoup.select.Elements elements19 = element16.getElementsByTag("hi!");
        org.jsoup.nodes.Element element20 = element11.prependChild((org.jsoup.nodes.Node) element16);
        java.lang.Integer int21 = element20.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean16 = element14.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueEnding("hi!hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements22 = element14.getElementsByAttributeValueContaining("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element14.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.select.Elements elements17 = document12.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element19 = document12.appendText("hi!");
        org.jsoup.nodes.Element element20 = element9.prependChild((org.jsoup.nodes.Node) element19);
        boolean boolean21 = element9.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexEquals((int) ' ');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        java.lang.String str19 = document8.outerHtml();
        java.lang.String str20 = document8.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>" + "'", str19, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        java.lang.Class<?> wildcardClass6 = attributes5.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean7 = element3.hasClass("hi!#document");
        org.jsoup.nodes.Element element8 = element3.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str13 = tag12.toString();
        org.jsoup.parser.Tag tag14 = tag12.getImplicitParent();
        boolean boolean15 = tag10.equals((java.lang.Object) tag12);
        boolean boolean16 = tag10.isBlock();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag10, "#root");
        boolean boolean19 = tag10.preserveWhitespace();
        boolean boolean20 = element8.equals((java.lang.Object) tag10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element8.select("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? hi!#document?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str16 = tag15.toString();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        java.lang.String str18 = tag15.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element24 = document22.text("hi!");
        org.jsoup.nodes.Element element26 = element24.text("hi!");
        org.jsoup.nodes.Element element28 = element24.html("#root");
        org.jsoup.select.Elements elements30 = element24.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes31 = element24.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag15, "hi!#document", attributes31);
        org.jsoup.nodes.Element element33 = document2.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        org.jsoup.nodes.Element element38 = document36.empty();
        java.lang.String str39 = element38.id();
        java.lang.String str40 = element38.text();
        org.jsoup.nodes.Element element42 = element38.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = document2.appendChild((org.jsoup.nodes.Node) element38);
        boolean boolean45 = element43.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        org.jsoup.nodes.Element element22 = element17.parent();
        java.lang.String str23 = element17.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        java.lang.String str10 = document2.baseUri();
        java.lang.Class<?> wildcardClass11 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueNot("hi!", "body");
        java.lang.String str13 = element9.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element9.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        boolean boolean5 = document2.hasText();
        org.jsoup.nodes.Element element7 = document2.toggleClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document21.childNodes();
        document21.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = document21.empty();
        org.jsoup.nodes.Element element27 = element25.append("");
        org.jsoup.nodes.Element element28 = element27.empty();
        org.jsoup.nodes.Element element30 = element27.append("");
        java.lang.String str31 = element27.className();
        org.jsoup.select.Elements elements33 = element27.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element34 = element17.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element36 = element34.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        java.lang.String str19 = element18.className();
        java.lang.String str20 = element18.toString();
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag22, "");
        java.lang.String[] strArray27 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element24.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element32 = element24.toggleClass("");
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueContaining("#root", "#document");
        org.jsoup.nodes.Element element36 = element32.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = element18.appendChild((org.jsoup.nodes.Node) element36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>\n<#root>\n</#root>\n</hi!>" + "'", str20, "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNull(element36);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueNot("hi!", "body");
        java.lang.String str16 = element11.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
        document11.setBaseUri("hi!");
        org.jsoup.nodes.Element element15 = document11.empty();
        org.jsoup.nodes.Element element17 = document11.appendText("hi!");
        org.jsoup.nodes.Attributes attributes18 = document11.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag6, "hi!", attributes18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element29 = document23.appendText("hi!");
        org.jsoup.nodes.Attributes attributes30 = document23.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag6, "#document", attributes30);
        boolean boolean32 = tag6.preserveWhitespace();
        boolean boolean33 = element4.equals((java.lang.Object) boolean32);
        org.jsoup.select.Elements elements35 = element4.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.isInline();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document42.childNodes();
        org.jsoup.nodes.Element element44 = document42.empty();
        org.jsoup.select.Elements elements46 = document42.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements48 = document42.getElementsByIndexEquals((int) 'a');
        boolean boolean49 = tag39.equals((java.lang.Object) 'a');
        org.jsoup.parser.Tag tag50 = tag39.getImplicitParent();
        java.lang.String str51 = tag50.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "html" + "'", str51, "html");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.select.Elements elements11 = element4.getElementsByIndexEquals(100);
        java.lang.String str12 = element4.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        boolean boolean24 = element23.isBlock();
        boolean boolean25 = element23.hasText();
        org.jsoup.parser.Tag tag26 = element23.tag();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        org.jsoup.nodes.Element element29 = document8.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.removeClass("#document");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet55 = element50.classNames();
        org.jsoup.nodes.Element element56 = element34.classNames(strSet55);
        org.jsoup.nodes.Element element57 = element29.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element29.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements62 = element29.getElementsByAttributeValueEnding("#document", "#document");
        java.lang.String str63 = element29.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "#root" + "'", str63, "#root");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean29 = element28.hasText();
        org.jsoup.nodes.Attributes attributes30 = element28.attributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.select.Elements elements14 = document9.getElementsByAttributeValueStarting("hi!", "#document");
        boolean boolean15 = tag6.equals((java.lang.Object) elements14);
        org.jsoup.parser.Tag tag16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tag6.canContain(tag16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.select.Elements elements16 = element9.getElementsByIndexEquals((int) (short) 100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "#document");
        boolean boolean3 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element6.hasClass("hi!");
        java.lang.String str9 = element6.val();
        org.jsoup.nodes.Node node11 = element6.removeAttr("\n<hi!>\n</hi!>");
        java.lang.String str12 = node11.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        org.jsoup.nodes.Element element44 = element41.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element46 = element41.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element46.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        java.lang.String str30 = element14.html();
        org.jsoup.nodes.Attributes attributes31 = element14.attributes();
        org.jsoup.select.Elements elements34 = element14.getElementsByAttributeValueContaining("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.nodes.Element element9 = element7.prependElement("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element20 = element14.appendText("hi!");
        org.jsoup.nodes.Element element23 = element14.attr("#root", "#document");
        org.jsoup.select.Elements elements25 = element14.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = element7.appendChild((org.jsoup.nodes.Node) element14);
        java.util.Set<java.lang.String> strSet27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element26.classNames(strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.jsoup.select.Elements elements10 = element4.getElementsByAttribute("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element4.childNodes();
        boolean boolean13 = element4.hasClass("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.parser.Tag tag18 = element4.tag();
        boolean boolean19 = tag18.isInline();
        boolean boolean20 = tag18.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element21 = element8.removeClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        org.jsoup.nodes.Attributes attributes26 = document24.attributes();
        java.lang.String str27 = document24.text();
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan((-1));
        java.lang.String str17 = element12.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        java.lang.String str13 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document2.addClass("#root");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document18.prependText("#document");
        org.jsoup.select.Elements elements25 = element23.getElementsByClass("hi!");
        org.jsoup.nodes.Element element27 = element23.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Element element16 = element4.empty();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str16 = tag15.toString();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        java.lang.String str18 = tag15.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element24 = document22.text("hi!");
        org.jsoup.nodes.Element element26 = element24.text("hi!");
        org.jsoup.nodes.Element element28 = element24.html("#root");
        org.jsoup.select.Elements elements30 = element24.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes31 = element24.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag15, "hi!#document", attributes31);
        org.jsoup.nodes.Element element33 = document2.prependChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements35 = document2.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.select.Elements elements36 = document2.parents();
        java.lang.Class<?> wildcardClass37 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        org.jsoup.select.Elements elements8 = element7.getAllElements();
        org.jsoup.nodes.Element element10 = element7.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element12 = element7.wrap("#document");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element17 = document15.text("hi!");
        org.jsoup.nodes.Element element19 = element17.text("hi!");
        org.jsoup.select.Elements elements21 = element17.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements24 = element17.getElementsByAttributeValueEnding("#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Element element17 = element13.empty();
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element21 = element8.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element8.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueContaining("#root", "hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Element element18 = element16.text("hi!");
        org.jsoup.select.Elements elements20 = element16.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet21 = element16.classNames();
        org.jsoup.nodes.Element element23 = element16.val("");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element30 = element17.appendElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements32 = element17.getElementsByIndexEquals(1);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag3.isValidParent(tag5);
        boolean boolean7 = tag5.canContainBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.nodes.Element element11 = element9.toggleClass("");
        org.jsoup.nodes.Element element13 = element9.append("hi!");
        boolean boolean14 = tag1.equals((java.lang.Object) element13);
        boolean boolean15 = tag1.isInline();
        boolean boolean16 = tag1.canContainBlock();
        boolean boolean17 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Element element18 = element16.text("hi!");
        org.jsoup.nodes.Element element20 = element16.getElementById("#document");
        org.jsoup.nodes.Element element22 = element16.wrap("hi!");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.nodeName();
        org.jsoup.select.Elements elements27 = document25.getAllElements();
        java.lang.String str28 = document25.id();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        org.jsoup.nodes.Element element33 = document25.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        document36.setBaseUri("hi!");
        org.jsoup.nodes.Element element40 = document36.empty();
        org.jsoup.nodes.Element element41 = document31.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element46 = document44.text("hi!");
        org.jsoup.nodes.Element element48 = element46.text("hi!");
        org.jsoup.select.Elements elements50 = element46.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element52 = element46.appendText("hi!");
        org.jsoup.nodes.Element element55 = element46.attr("#root", "#document");
        org.jsoup.nodes.Element element57 = element46.appendElement("#root");
        org.jsoup.nodes.Element element58 = element57.empty();
        org.jsoup.nodes.Attributes attributes59 = element58.attributes();
        org.jsoup.nodes.Element element61 = element58.appendElement("hi!");
        element41.replaceWith((org.jsoup.nodes.Node) element61);
        org.jsoup.nodes.Element element64 = element41.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.jsoup.nodes.Element element80 = document67.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element81 = element41.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element82 = element16.appendChild((org.jsoup.nodes.Node) element81);
        boolean boolean83 = element4.equals((java.lang.Object) element82);
        org.jsoup.nodes.Element element85 = element4.wrap("#document hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(element85);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document2.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        java.lang.String str4 = tag1.getName();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag8.isValidParent(tag10);
        boolean boolean12 = tag10.canContainBlock();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.nodes.Element element16 = element14.toggleClass("");
        org.jsoup.nodes.Element element18 = element14.append("hi!");
        boolean boolean19 = tag6.equals((java.lang.Object) element18);
        boolean boolean20 = tag6.isInline();
        java.lang.String str21 = tag6.toString();
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag25.isValidParent(tag27);
        boolean boolean29 = tag27.canContainBlock();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Element element33 = element31.toggleClass("");
        org.jsoup.nodes.Element element35 = element31.append("hi!");
        boolean boolean36 = tag23.equals((java.lang.Object) element35);
        boolean boolean37 = tag23.isInline();
        java.lang.String str38 = tag23.toString();
        boolean boolean39 = tag6.canContain(tag23);
        boolean boolean40 = tag1.canContain(tag6);
        java.lang.String str41 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document2.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document21.childNodes();
        document21.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = document21.empty();
        org.jsoup.nodes.Element element27 = document21.appendText("hi!");
        org.jsoup.select.Elements elements29 = document21.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element31 = document21.appendText("#document");
        org.jsoup.nodes.Element element33 = element31.append("");
        boolean boolean34 = element10.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements37 = element10.getElementsByAttributeValueNot("\n<hi!>\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("#document", "body");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        java.lang.String str9 = element4.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag5.isValidParent(tag7);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "#document");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueEnding("hi!#document", "#root");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.getElementsByIndexLessThan((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        boolean boolean7 = element4.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        java.lang.String str12 = element11.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Element element19 = element17.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueStarting("#document hi!", "#document ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValue("hi!hi!", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element7.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        java.lang.Class<?> wildcardClass12 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag14.isValidParent(tag16);
        boolean boolean18 = tag16.isBlock();
        boolean boolean20 = tag16.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag16, "#document");
        org.jsoup.nodes.Element element23 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element24 = element23.empty();
        // The following exception was thrown during execution in test generation
        try {
            element23.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element17 = document15.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element9.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        boolean boolean9 = element4.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements18 = element15.getElementsByIndexEquals((int) 'a');
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element15.siblingNodes();
        org.jsoup.select.Elements elements21 = element15.getElementsByIndexLessThan((int) ' ');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Node node23 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean25 = node23.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements19 = document2.getElementsByAttributeValueNot("#root", "hi!hi!");
        java.lang.String str20 = document2.val();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document23.prependText("#document");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.nodes.Element element32 = element28.prependElement("hi!");
        org.jsoup.nodes.Element element34 = element32.toggleClass("body");
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.select.Elements elements45 = document37.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element47 = document37.appendText("#document");
        boolean boolean49 = document37.hasClass("hi!");
        boolean boolean51 = document37.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element54 = document37.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "body");
        org.jsoup.nodes.Element element55 = element32.prependChild((org.jsoup.nodes.Node) element54);
        java.lang.String str56 = element55.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element57 = document2.appendChild((org.jsoup.nodes.Node) element55);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str18 = tag17.toString();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        boolean boolean20 = tag15.equals((java.lang.Object) tag17);
        boolean boolean21 = tag15.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag15, "#root");
        boolean boolean24 = tag15.preserveWhitespace();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes30 = document28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag15, "#root", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag10, "#document", attributes30);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.nodeName();
        org.jsoup.select.Elements elements37 = document35.getAllElements();
        java.lang.String str38 = document35.id();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        org.jsoup.nodes.Element element43 = document35.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document46.childNodes();
        document46.setBaseUri("hi!");
        org.jsoup.nodes.Element element50 = document46.empty();
        org.jsoup.nodes.Element element51 = document41.appendChild((org.jsoup.nodes.Node) element50);
        java.lang.String str52 = document41.className();
        // The following exception was thrown during execution in test generation
        try {
            element32.replaceWith((org.jsoup.nodes.Node) document41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValue("hi!#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        document2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(0);
        java.lang.String str14 = document2.html();
        org.jsoup.nodes.Element element16 = document2.appendElement("#document hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str14, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements23 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element25 = document2.appendElement("hi!");
        org.jsoup.nodes.Element element26 = element25.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element26.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.addClass("body");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueEnding("hi!hi!", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document hi!", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueEnding("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.nodes.Element element9 = element7.prependElement("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element20 = element14.appendText("hi!");
        org.jsoup.nodes.Element element23 = element14.attr("#root", "#document");
        org.jsoup.select.Elements elements25 = element14.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = element7.appendChild((org.jsoup.nodes.Node) element14);
        java.lang.Integer int27 = element7.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueNot("hi!", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element14 = element3.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.prependText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        boolean boolean10 = tag3.canContainBlock();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = document17.empty();
        org.jsoup.nodes.Element element23 = document17.appendText("hi!");
        org.jsoup.nodes.Attributes attributes24 = document17.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag12, "hi!", attributes24);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = document29.appendText("hi!");
        org.jsoup.nodes.Attributes attributes36 = document29.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag12, "#document", attributes36);
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element46 = element44.append("");
        org.jsoup.parser.Tag tag47 = element44.tag();
        boolean boolean48 = tag12.canContain(tag47);
        boolean boolean49 = tag12.preserveWhitespace();
        boolean boolean50 = tag12.isBlock();
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document57.childNodes();
        document57.setBaseUri("hi!");
        org.jsoup.nodes.Element element61 = document57.empty();
        org.jsoup.nodes.Element element63 = document57.appendText("hi!");
        org.jsoup.nodes.Attributes attributes64 = document57.attributes();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag52, "hi!", attributes64);
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList70 = document69.childNodes();
        document69.setBaseUri("hi!");
        org.jsoup.nodes.Element element73 = document69.empty();
        org.jsoup.nodes.Element element75 = document69.appendText("hi!");
        org.jsoup.nodes.Attributes attributes76 = document69.attributes();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag52, "#document", attributes76);
        org.jsoup.nodes.Document document80 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList81 = document80.childNodes();
        document80.setBaseUri("hi!");
        org.jsoup.nodes.Element element84 = document80.empty();
        org.jsoup.nodes.Element element86 = element84.append("");
        org.jsoup.parser.Tag tag87 = element84.tag();
        boolean boolean88 = tag52.canContain(tag87);
        boolean boolean89 = tag52.preserveWhitespace();
        boolean boolean90 = tag52.isBlock();
        boolean boolean91 = tag52.isInline();
        boolean boolean92 = tag52.preserveWhitespace();
        org.jsoup.nodes.Element element94 = new org.jsoup.nodes.Element(tag52, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        boolean boolean95 = tag12.isValidParent(tag52);
        boolean boolean96 = tag3.isValidParent(tag52);
        boolean boolean97 = tag3.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Attributes attributes18 = element4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element4.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.prepend("hi!#document");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document24.prependText("#document");
        org.jsoup.select.Elements elements31 = document24.getElementsByIndexEquals((int) (short) 0);
        boolean boolean32 = element21.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "");
        java.lang.String[] strArray25 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element22.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element30 = element22.prepend("#document");
        org.jsoup.nodes.Element element32 = element22.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element18.replaceWith((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        java.lang.String str12 = element11.val();
        org.jsoup.nodes.Element element14 = element11.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        java.lang.String str12 = element7.className();
        org.jsoup.select.Elements elements14 = element7.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element16 = element7.prependText("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        java.lang.String str8 = element4.absUrl("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element11 = element4.attr("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document2.getElementsByAttribute("#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str2 = tag1.getName();
        java.lang.String str3 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str2, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str3, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        java.lang.String str23 = element21.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element21.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element24.childNodes();
        java.lang.String str26 = element24.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str9 = tag8.toString();
        org.jsoup.parser.Tag tag10 = tag8.getImplicitParent();
        boolean boolean11 = tag6.equals((java.lang.Object) tag8);
        boolean boolean12 = tag6.isBlock();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag6, "#root");
        boolean boolean15 = tag6.preserveWhitespace();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        org.jsoup.nodes.Attributes attributes21 = document19.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag6, "#root", attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes21);
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan((int) (short) 1);
        java.lang.String str26 = element23.val();
        org.jsoup.nodes.Node node28 = element23.removeAttr("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element16 = element11.attr("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element11.id();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str10 = element4.data();
        java.lang.String str11 = element4.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        java.lang.String str8 = element7.html();
        java.lang.String str9 = element7.nodeName();
        java.lang.Integer int10 = element7.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str8, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        boolean boolean17 = document2.isBlock();
        org.jsoup.select.Elements elements18 = document2.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!#document");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<hi!>\n<#root>\n</#root>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document2.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        java.lang.String str11 = document2.data();
        org.jsoup.nodes.Element element13 = document2.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str14 = document2.data();
        org.jsoup.nodes.Node node16 = document2.childNode(0);
        boolean boolean18 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        org.jsoup.nodes.Element element11 = element9.text("hi!");
        org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = element9.appendText("hi!");
        org.jsoup.nodes.Element element17 = element15.text("");
        boolean boolean18 = tag1.equals((java.lang.Object) element17);
        java.lang.String str19 = element17.baseUri();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "hi!hi!");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str10 = tag9.toString();
        org.jsoup.parser.Tag tag11 = tag9.getImplicitParent();
        java.lang.String str12 = tag9.getName();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element18 = document16.text("hi!");
        org.jsoup.nodes.Element element20 = element18.text("hi!");
        org.jsoup.nodes.Element element22 = element18.html("#root");
        org.jsoup.select.Elements elements24 = element18.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes25 = element18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag9, "hi!#document", attributes25);
        org.jsoup.nodes.Element element27 = element7.prependChild((org.jsoup.nodes.Node) element26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = element27.select("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? hi!?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element6.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element15 = element13.text("#document hi!");
        java.lang.String str17 = element15.attr("");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        java.lang.String str19 = element3.text();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.select.Elements elements24 = document22.getAllElements();
        java.lang.String str25 = document22.id();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Element element30 = document22.appendChild((org.jsoup.nodes.Node) document28);
        java.lang.String str32 = document22.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element33 = element3.appendChild((org.jsoup.nodes.Node) document22);
        java.lang.String str34 = element3.outerHtml();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>" + "'", str34, "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.text("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element26 = document24.text("hi!");
        org.jsoup.nodes.Element element28 = element26.text("hi!");
        org.jsoup.select.Elements elements30 = element26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element32 = element26.appendText("hi!");
        org.jsoup.nodes.Element element34 = element32.text("");
        boolean boolean35 = element34.hasText();
        org.jsoup.nodes.Element element36 = element34.empty();
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean47 = element41.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element52 = document50.text("hi!");
        org.jsoup.nodes.Element element54 = element52.text("hi!");
        org.jsoup.select.Elements elements56 = element52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element58 = element52.appendText("hi!");
        org.jsoup.nodes.Element element60 = element58.text("");
        boolean boolean61 = element60.hasText();
        org.jsoup.nodes.Element element63 = element60.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean64 = element41.equals((java.lang.Object) "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element4.removeClass("#root");
        java.lang.String str22 = element21.val();
        org.jsoup.nodes.Element element24 = element21.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        java.lang.String str8 = tag1.toString();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag1.canContain(tag10);
        java.lang.String str15 = tag10.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element11.children();
        java.lang.String str15 = element11.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueEnding("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element21 = element16.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element21.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element14 = element11.attr("body", "");
        org.jsoup.nodes.Element element16 = element11.prependText("hi!#document");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexEquals((int) (byte) 100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element4.getElementsByAttributeValueNot("", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        org.jsoup.nodes.Element element13 = element3.text("body");
        java.lang.String str14 = element13.html();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.getName();
        java.lang.String str5 = tag1.toString();
        boolean boolean6 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding("html", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        java.lang.String str7 = element6.html();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValue("body", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean11 = element7.hasText();
        java.lang.String str13 = element7.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean46 = element41.isBlock();
        org.jsoup.nodes.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = element41.prependChild(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        org.jsoup.select.Elements elements13 = element7.select("#document");
        java.util.Set<java.lang.String> strSet14 = element7.classNames();
        org.jsoup.nodes.Element element16 = element7.addClass("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        boolean boolean18 = element16.hasClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        org.jsoup.nodes.Element element19 = element16.appendElement("hi!");
        org.jsoup.nodes.Element element21 = element16.prepend("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element23 = element21.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements24 = element23.siblingElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.isEmpty();
        java.lang.String str5 = tag1.getName();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = document9.appendText("hi!");
        org.jsoup.select.Elements elements17 = document9.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "");
        java.lang.String[] strArray24 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = element21.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element28 = document9.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.select.Elements elements30 = document9.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element32 = document9.appendElement("hi!");
        java.lang.String str33 = document9.className();
        boolean boolean34 = tag1.equals((java.lang.Object) str33);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document " + "'", str33, "#document ");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        boolean boolean11 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        org.jsoup.nodes.Element element14 = element6.removeClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.select.Elements elements15 = element6.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.child(0);
        // The following exception was thrown during execution in test generation
        try {
            element41.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "#document");
        java.lang.String str3 = document2.toString();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.html(" body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes15 = document13.attributes();
        org.jsoup.parser.Tag tag16 = document13.tag();
        org.jsoup.nodes.Element element18 = document13.text("#root");
        boolean boolean19 = element4.equals((java.lang.Object) "#root");
        java.lang.String str20 = element4.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        java.lang.String str8 = tag1.toString();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag1.canContain(tag10);
        boolean boolean15 = tag1.isInline();
        boolean boolean16 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.select("\n<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <hi!>?</hi!>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }
}

