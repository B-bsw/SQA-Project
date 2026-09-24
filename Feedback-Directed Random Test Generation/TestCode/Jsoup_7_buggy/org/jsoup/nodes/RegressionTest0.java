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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element3.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = element3.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = element3.hasAttr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = element3.getAllElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        java.lang.String str13 = element12.className();
        org.jsoup.select.Elements elements15 = element12.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int4 = element3.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element3.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element3.getElementsContainingText("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueEnding("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element10.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document6.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("#document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        org.jsoup.nodes.Element element14 = document12.parent();
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!  #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!  #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        java.lang.String str10 = element5.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset(charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        org.jsoup.select.Elements elements11 = element8.parents();
        org.jsoup.select.Elements elements13 = element8.getElementsByClass("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element8.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueNot("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings3.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.charset(charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValueStarting("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element6.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("");
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
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element3.getElementsMatchingOwnText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
            element7.remove();
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
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        boolean boolean4 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValueStarting("", "hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        java.lang.String str9 = element3.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.select.Elements elements9 = element7.parents();
        java.lang.String str10 = element7.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document1.after("hi!  #document");
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
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#document", pattern11);
        boolean boolean13 = element5.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.before("hi!  #document");
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
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.Class<?> wildcardClass16 = element5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.charset("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!  #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.parser.Tag tag8 = element6.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueEnding("", "<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = document14.addClass("#document");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.parent();
        boolean boolean23 = element19.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) element19);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.before("");
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
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.before("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document4.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.html("hi!");
        org.jsoup.select.Elements elements14 = element11.parents();
        org.jsoup.select.Elements elements16 = element11.getElementsByClass("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        java.lang.String str12 = element10.id();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag10 = element9.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Element element10 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValue("hi!", "");
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
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
            org.jsoup.select.Elements elements18 = element16.getElementsByAttribute("hi!  #document");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.nodes.Element element14 = element9.html("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document1.select("");
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
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.jsoup.nodes.Element element18 = element16.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.select("#root");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasClass("");
        org.jsoup.nodes.Element element12 = document1.empty();
        java.lang.Integer int13 = element12.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        // The following exception was thrown during execution in test generation
        try {
            document17.remove();
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        org.jsoup.nodes.Element element19 = element5.getElementById("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag20 = element19.tag();
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueContaining("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Document document0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings1 = document0.new OutputSettings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jsoup.nodes.Document$OutputSettings with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueNot("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.String str9 = document1.tagName();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        element3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element3.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueEnding("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!  #document" + "'", str16, "hi!  #document");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element5.getElementsMatchingText(pattern18);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.select("hi!  #document");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!  #document': unexpected token at '!  #document'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        org.jsoup.nodes.Element element9 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValue("", "<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("#document", "hi!  #document");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = document1.getElementsMatchingText(pattern19);
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
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element10.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Document document11 = element3.ownerDocument();
        java.util.Set<java.lang.String> strSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document11.classNames(strSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element6.dataset();
        org.jsoup.nodes.Element element9 = element6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByAttributeStarting("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        java.nio.charset.Charset charset10 = outputSettings8.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
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
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Node node11 = element8.nextSibling();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet14 = document13.classNames();
        boolean boolean15 = document13.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) document13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element3.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        java.lang.Integer int8 = element3.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.child((int) (byte) -1);
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        java.lang.String str2 = document1.id();
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsMatchingText(pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.lang.String str23 = element12.absUrl("#document");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document1.getElementById("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        boolean boolean3 = document1.hasClass("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
            org.jsoup.nodes.Element element20 = document1.createElement("");
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
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueStarting("hi!", "hi!  #document");
        java.lang.Class<?> wildcardClass13 = elements12.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = element6.ownerDocument();
        boolean boolean11 = document9.hasAttr("");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element5.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        boolean boolean14 = element12.hasClass("#document");
        org.jsoup.select.Elements elements15 = element12.parents();
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element12.prependChild((org.jsoup.nodes.Node) element22);
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.charset("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!  #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        boolean boolean3 = document1.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.prependText("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
            org.jsoup.select.Elements elements19 = element7.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        org.jsoup.parser.Tag tag22 = element21.tag();
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
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("hi!  #document", "#document");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        org.jsoup.select.Elements elements9 = document5.getElementsContainingText("");
        org.jsoup.nodes.Element element11 = document5.prependText("hi!");
        document5.setBaseUri("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document15.html("");
        java.lang.String str18 = element17.className();
        org.jsoup.nodes.Element element19 = element17.empty();
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Node node21 = element19.nextSibling();
        java.lang.String str22 = element19.className();
        org.jsoup.select.Elements elements23 = element19.getAllElements();
        org.jsoup.nodes.Element element24 = document5.prependChild((org.jsoup.nodes.Node) element19);
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.data();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element3.after("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Node node8 = element6.removeAttr("hi!  #document");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.charset("#document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #document");
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
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element9 = element7.empty();
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Node node11 = element9.nextSibling();
        org.jsoup.nodes.Element element14 = element9.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("hi!  #document", "#root");
        java.lang.String str14 = document1.absUrl("hi!");
        boolean boolean16 = document1.hasClass("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element5.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("", pattern4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element3.appendText("#root");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) document13);
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
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.Integer int3 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueEnding("", "<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        java.lang.Class<?> wildcardClass7 = nodeList6.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsContainingText("hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        java.lang.Class<?> wildcardClass4 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        java.lang.String str13 = document11.outerHtml();
        java.lang.Integer int14 = document11.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = document11.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document11);
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
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingOwnText("hi!");
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        boolean boolean5 = document1.hasClass("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("#document", "#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        // The following exception was thrown during execution in test generation
        try {
            element26.remove();
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
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.title();
        org.jsoup.nodes.Attributes attributes13 = document1.attributes();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
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
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        java.lang.String str9 = element3.baseUri();
        java.lang.String str10 = element3.tagName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = document1.getElementsMatchingText(pattern17);
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
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element10 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element10.lastElementSibling();
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        boolean boolean17 = document1.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = document1.getElementsByAttributeValueStarting("#document", "");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        java.lang.String str8 = element3.className();
        element3.setBaseUri("hi!  #document");
        org.jsoup.select.Elements elements13 = element3.getElementsByAttributeValueStarting("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("", "hi!  #document");
        org.jsoup.nodes.Element element12 = element7.removeClass("hi!  #document");
        org.jsoup.nodes.Element element14 = element7.toggleClass("hi!  #document");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", "#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.val("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings3.charset("#root");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan((int) (byte) 0);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("#root", pattern11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = element5.siblingNodes();
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
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = element2.getElementsMatchingOwnText("");
        org.jsoup.select.Elements elements6 = element2.getElementsByTag("hi!  #document");
        org.jsoup.select.Elements elements8 = element2.getElementsByIndexEquals((int) 'a');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        java.lang.Class<?> wildcardClass8 = document1.getClass();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        java.lang.String str10 = element5.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.after("#document");
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
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements27 = document24.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document24.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            element18.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.before("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        org.jsoup.nodes.Element element10 = element3.parent();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element3.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element3.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document10.head();
        java.lang.String str12 = document10.outerHtml();
        java.lang.Integer int13 = document10.elementSiblingIndex();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document10.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element18 = document15.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str19 = element18.data();
        java.lang.String str20 = element18.val();
        java.lang.String str21 = element18.tagName();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueMatching("hi!  #document", "#root");
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.String str22 = element3.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element3.appendElement("");
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element3.prependChild(node14);
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
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element13.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.util.regex.Pattern pattern21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element17.getElementsMatchingText(pattern21);
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
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element12.tagName();
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document1.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.String str10 = element9.html();
        org.jsoup.select.Elements elements12 = element9.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = elements12.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.html();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements11 = element9.getElementsByTag("#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element5 = document3.html("");
        org.jsoup.select.Elements elements7 = document3.getElementsContainingText("");
        org.jsoup.nodes.Element element9 = document3.prependText("hi!");
        org.jsoup.nodes.Element element11 = document3.html("");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueEnding("hi!  #document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("#document", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element5.before("hi!");
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
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element5.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.head();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = document1.getElementsMatchingOwnText(pattern19);
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
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.html("");
        java.lang.String str24 = element23.className();
        org.jsoup.nodes.Element element25 = element23.empty();
        org.jsoup.nodes.Attributes attributes26 = element25.attributes();
        org.jsoup.select.Elements elements29 = element25.getElementsByAttributeValueContaining("#document", "#root");
        org.jsoup.select.Elements elements32 = element25.getElementsByAttributeValueEnding("#document", "#document");
        // The following exception was thrown during execution in test generation
        try {
            element19.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element3.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        boolean boolean9 = document1.hasClass("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.nodes.Element element8 = document1.val("#root");
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.prependChild(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements7 = document1.getElementsMatchingText("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        int int15 = outputSettings14.indentAmount();
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.select("");
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
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        boolean boolean12 = element3.hasText();
        java.lang.String str13 = element3.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.nodes.Node node5 = element4.nextSibling();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeStarting("#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.charset("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!  #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element5.getElementsByAttributeValue("#root", "");
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
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", " #document");
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.jsoup.parser.Tag tag21 = document1.tag();
        java.lang.String str22 = document1.ownText();
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
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Node node11 = element8.nextSibling();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("", "hi!  #document");
        org.jsoup.nodes.Element element12 = element7.removeClass("hi!  #document");
        org.jsoup.nodes.Element element14 = element7.toggleClass("hi!  #document");
        java.lang.String str15 = element14.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.html("");
        org.jsoup.nodes.Element element9 = element7.removeClass("#document");
        org.jsoup.nodes.Element element10 = document1.prependChild((org.jsoup.nodes.Node) element7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!  #document");
        org.jsoup.nodes.Element element8 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.title();
        org.jsoup.nodes.Element element14 = document1.prependElement("#root");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        java.lang.String str7 = element3.attr("");
        java.lang.String str9 = element3.attr("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.lang.String str58 = element55.attr(" #document");
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Element element4 = document1.createElement("#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.jsoup.nodes.Element element24 = element3.html("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element3.getElementById("");
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
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.util.regex.Pattern pattern32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements33 = element28.getElementsMatchingOwnText(pattern32);
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        java.lang.String str9 = element7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element7.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element15.attr("", "hi!  #document");
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.lang.Class<?> wildcardClass12 = element6.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        boolean boolean19 = element17.hasClass(" #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.wrap("");
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasClass("");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.lang.String str12 = element8.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element8.after("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.jsoup.parser.Tag tag17 = element13.tag();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document19.head();
        java.lang.String str21 = document19.outerHtml();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        java.lang.String str23 = document19.nodeName();
        org.jsoup.select.Elements elements26 = document19.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements28 = document19.getElementsByTag("hi!");
        org.jsoup.nodes.Node node29 = document19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((int) (byte) 1);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        org.jsoup.select.Elements elements7 = element3.getElementsMatchingText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element15.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsContainingOwnText("#document");
        java.lang.Class<?> wildcardClass14 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            element19.remove();
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.id();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document10.getElementsMatchingText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element17.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document1.appendElement("");
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
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element9.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        org.jsoup.select.Elements elements13 = document9.getElementsContainingText("");
        org.jsoup.select.Elements elements15 = document9.getElementsByIndexGreaterThan(10);
        java.lang.String str16 = document9.className();
        org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueNot("hi!", "#root");
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.select.Elements elements14 = element12.getElementsMatchingText("hi!  #document");
        org.jsoup.select.Elements elements17 = element12.getElementsByAttributeValueStarting("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element5.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.before("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        java.lang.String str12 = document1.tagName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        org.jsoup.nodes.Element element12 = element7.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element12.text();
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document12.getElementsMatchingText(pattern13);
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
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueMatching("#document", "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document1.childNode((int) (short) 10);
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
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        java.lang.String str9 = element5.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.before("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.lang.Class<?> wildcardClass9 = outputSettings8.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueMatching("#root", pattern13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element8.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.nodes.Element element11 = element9.addClass("hi!  #document");
        boolean boolean12 = element11.hasText();
        org.jsoup.select.Elements elements14 = element11.getElementsContainingText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        org.jsoup.parser.Tag tag17 = element13.tag();
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element13.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.String str13 = document12.nodeName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!  #document");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#document");
        java.lang.String str9 = node8.baseUri();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element23.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#root");
        java.lang.String str9 = document1.html();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.charset("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body></body>?</html>");
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
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.String str31 = element28.absUrl("#document");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.select.Elements elements6 = document1.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        org.jsoup.nodes.Element element7 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<#root></#root>hi!", pattern9);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        java.lang.String str6 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.before("hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.jsoup.nodes.Element element25 = element12.addClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element12.before("<#root></#root>hi!");
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
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.nodes.Element element8 = document6.toggleClass("");
        java.util.Set<java.lang.String> strSet9 = document6.classNames();
        org.jsoup.select.Elements elements11 = document6.getElementsContainingOwnText(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        // The following exception was thrown during execution in test generation
        try {
            element19.remove();
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element3.getElementsByIndexLessThan(100);
        org.jsoup.select.Elements elements15 = element3.getElementsByClass(" #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        java.lang.String str9 = document1.text();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element28 = document14.classNames((java.util.Set<java.lang.String>) strSet25);
        java.lang.String str29 = document14.className();
        org.jsoup.nodes.Element element30 = document14.empty();
        java.lang.String str31 = document14.ownText();
        // The following exception was thrown during execution in test generation
        try {
            document12.replaceWith((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!  #document" + "'", str29, "hi!  #document");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.nodes.Element element7 = element5.appendElement("hi!");
        java.lang.Integer int8 = element5.siblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        boolean boolean10 = element5.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element5.removeAttr("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document1.attr("hi!  #document", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean8 = element7.isBlock();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document6.after("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        boolean boolean11 = element5.hasAttr("");
        java.lang.String str12 = element5.baseUri();
        org.jsoup.nodes.Node node13 = element5.nextSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        java.lang.String str7 = element5.text();
        java.lang.String str9 = element5.attr("#root");
        org.jsoup.select.Elements elements11 = element5.getElementsByIndexGreaterThan((int) '#');
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            element17.remove();
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
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element18.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element3.after(" #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("#root");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.String str44 = element6.baseUri();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.id();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.val("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.body();
        java.lang.String str10 = document1.nodeName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.jsoup.nodes.Node node16 = element15.nextSibling();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.lang.String str7 = element6.tagName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueNot("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Integer int12 = element9.elementSiblingIndex();
        boolean boolean13 = element9.isBlock();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element9.getElementsMatchingOwnText(pattern14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.getElementsMatchingOwnText(pattern19);
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
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
            element12.remove();
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
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.removeClass("#document");
        java.lang.String str6 = element3.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str6 = document1.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.nodes.Element element8 = document6.toggleClass("");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element4.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        java.lang.Class<?> wildcardClass12 = element9.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = element40.after(" #document");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.String str16 = element13.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsMatchingText(pattern12);
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
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("hi!", "<#root></#root>hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element5.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = document1.wrap("");
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
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        java.lang.String str10 = element9.html();
        java.lang.Class<?> wildcardClass11 = element9.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        org.jsoup.select.Elements elements13 = element3.getElementsMatchingOwnText("#root");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.id();
        org.jsoup.select.Elements elements15 = element10.getElementsMatchingText(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element10.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document13 = element12.ownerDocument();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Node node8 = element6.removeAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = node8.removeAttr(" #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
            org.jsoup.select.Elements elements18 = element16.getElementsByAttributeStarting("<#root></#root>hi!");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
            java.lang.String str17 = element15.absUrl("");
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        org.jsoup.nodes.Element element6 = document1.html("#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.jsoup.nodes.Element element23 = document22.head();
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str12 = document11.title();
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element13.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element9.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document7.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueEnding("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.jsoup.nodes.Element element16 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.toggleClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.nodes.Element element10 = element5.getElementById("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.removeClass("#root");
        java.lang.String str8 = document1.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.lang.String str18 = element17.tagName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings5.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(charsetEncoder6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeStarting("#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document1.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element15.getElementsMatchingOwnText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        boolean boolean5 = document1.hasAttr("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements10 = element5.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueMatching("#document", pattern7);
        boolean boolean9 = element3.isBlock();
        java.lang.String str10 = element3.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueEnding("#root", "hi!  #document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document1.before("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.jsoup.nodes.Node node24 = element22.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = element22.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = element7.html();
        java.lang.String str9 = element7.toString();
        org.jsoup.nodes.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.appendChild(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str7 = element3.attr("hi!  #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
            java.lang.String str15 = element5.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.removeClass("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueContaining(" #document", "<#root></#root>hi!");
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        java.lang.Class<?> wildcardClass8 = nodeList7.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueContaining("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        org.jsoup.nodes.Element element11 = element9.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element20.getElementsByAttributeValue("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element3 = document1.empty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements10 = document5.getElementsContainingText("hi!  #document");
        boolean boolean12 = document5.hasAttr("#document");
        org.jsoup.nodes.Element element13 = element3.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element3.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        java.lang.String str9 = element5.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int12 = element9.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.before("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.before("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
            java.lang.String str42 = element41.text();
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        boolean boolean19 = element13.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element13.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        java.lang.Class<?> wildcardClass13 = element8.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.html("");
        boolean boolean22 = element20.hasClass("#document");
        org.jsoup.select.Elements elements23 = element20.parents();
        org.jsoup.select.Elements elements26 = element20.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.html("");
        java.lang.String str31 = element30.className();
        org.jsoup.nodes.Element element32 = element20.prependChild((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element33 = element30.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = document1.appendChild((org.jsoup.nodes.Node) element33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(element33);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        int int14 = outputSettings13.indentAmount();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.jsoup.select.Elements elements24 = element22.getElementsContainingText("#root");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.jsoup.select.Elements elements41 = element39.getElementsContainingOwnText("#document");
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
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root></#root>hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        element12.setBaseUri("<#root></#root>hi!");
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
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("<#root></#root>hi!");
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
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document15.absUrl("#document");
        org.jsoup.nodes.Attributes attributes18 = document15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            document13.replaceWith((org.jsoup.nodes.Node) document15);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document1.attr("hi!  #document", "#document");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.select.Elements elements13 = element11.children();
        org.jsoup.nodes.Element element14 = element11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.appendElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element3.getElementsByAttributeValueContaining("", "hi!");
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
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        boolean boolean15 = outputSettings14.prettyPrint();
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
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        java.nio.charset.Charset charset9 = outputSettings8.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.charset("#document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #document");
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
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining(" #document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element15.getElementsByAttributeValue("#document", "");
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
            org.jsoup.nodes.Element element18 = element16.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.outerHtml();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean5 = element4.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element4.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        org.jsoup.nodes.Element element6 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueContaining("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "hi!  #document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        org.jsoup.select.Elements elements11 = element3.getElementsContainingOwnText("#document");
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
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        java.lang.String str8 = element3.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element3.select("hi!  #document");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!  #document': unexpected token at '!  #document'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.jsoup.nodes.Element element25 = element12.addClass("#root");
        org.jsoup.select.Elements elements27 = element12.getElementsContainingText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document10.text("hi!  #document");
        org.jsoup.select.Elements elements13 = document10.parents();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("", pattern10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass20 = tag19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.wrap("hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.wrap("");
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
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element21.getElementsMatchingText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.String str33 = element28.attr("hi!#root");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.parent();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.html("");
        org.jsoup.select.Elements elements11 = document7.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = document7.prependText("hi!");
        document7.setBaseUri("");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.html("");
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.empty();
        java.lang.String str22 = element21.className();
        org.jsoup.nodes.Node node23 = element21.nextSibling();
        java.lang.String str24 = element21.className();
        org.jsoup.select.Elements elements25 = element21.getAllElements();
        org.jsoup.nodes.Element element26 = document7.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element28 = element21.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueContaining("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str16 = element10.id();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueEnding("hi!  #document", "#document");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        java.lang.String str8 = element7.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document1.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.jsoup.parser.Tag tag17 = element9.tag();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.util.regex.Pattern pattern20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element5.getElementsMatchingOwnText(pattern20);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        java.lang.String str32 = element3.absUrl("<#root></#root>hi!");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.jsoup.nodes.Element element24 = document22.createElement("hi!");
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
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.select.Elements elements13 = element10.siblingElements();
        org.jsoup.nodes.Element element14 = element10.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.nodes.Element element12 = element7.prependElement(" #document");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.getElementsMatchingOwnText(pattern13);
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
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.lang.Integer int11 = element8.elementSiblingIndex();
        java.lang.String str12 = element8.tagName();
        org.jsoup.nodes.Element element14 = element8.wrap("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependText("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("#document");
        java.lang.String str13 = element10.html();
        org.jsoup.select.Elements elements15 = element10.getElementsContainingOwnText("");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#documenthi!" + "'", str13, "#documenthi!");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.createElement(" #document");
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
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
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        boolean boolean12 = element3.hasText();
        java.lang.String str13 = element3.html();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element3.getElementsMatchingOwnText(pattern14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        boolean boolean6 = element4.hasAttr("hi!  #document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str16 = element15.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root></#root>" + "'", str16, "<#root></#root>");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        java.lang.String str7 = element3.toString();
        org.jsoup.nodes.Element element9 = element3.prepend("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.select("<#root></#root>hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>hi!': unexpected token at '<#root></#root>hi!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element16.text();
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element20.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        java.lang.Integer int8 = element3.elementSiblingIndex();
        element3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element3.getElementsContainingOwnText("<#root></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element9 = element5.prependText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.String str16 = element3.ownText();
        java.lang.String str18 = element3.absUrl("<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element5.after("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.new OutputSettings();
        java.lang.String str4 = document1.id();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.removeClass("#root");
        java.lang.String str8 = document1.baseUri();
        boolean boolean10 = document1.hasClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.createElement("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.util.regex.Pattern pattern27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = document1.getElementsMatchingOwnText(pattern27);
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element5.id();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.lang.Integer int6 = element5.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.select("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head>?  <title>#root</title>? </head>? <body></body>?</html>': unexpected token at '<html>? <head>?  <title>#root</title>? </head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.html("");
        org.jsoup.nodes.Element element14 = element12.html("#document");
        org.jsoup.nodes.Element element16 = element14.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) element14);
        java.lang.String str18 = element14.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element14.childNode((int) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.jsoup.select.Elements elements41 = element30.siblingElements();
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
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jsoup.nodes.Element element28 = document22.prependText("hi!  #document");
        java.lang.String str29 = element28.val();
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
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!  #document");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.String str18 = document1.nodeName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.jsoup.nodes.Element element24 = document22.removeClass("hi!#root");
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
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        boolean boolean6 = document1.hasClass("hi!");
        java.lang.String str7 = document1.data();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.String str20 = element19.html();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element15.getElementsMatchingText(pattern19);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element31.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList57);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean9 = element3.hasClass("#document");
        org.jsoup.nodes.Element element12 = element3.attr("#document", "#root");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueMatching("", "<#root hi!  #document=\"#document\"></#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.jsoup.nodes.Node node23 = element22.nextSibling();
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            element17.replaceWith(node20);
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
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements8 = element3.getElementsContainingOwnText("#root");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Element element8 = document1.appendText("<#root></#root>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.jsoup.nodes.Element element24 = element3.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements26 = element3.getElementsContainingOwnText("#documenthi!");
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        int int8 = outputSettings7.indentAmount();
        int int9 = outputSettings7.indentAmount();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        org.jsoup.select.Elements elements17 = element7.select(" #document");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
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
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element10 = element5.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str11 = element5.ownText();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.html("");
        boolean boolean17 = element15.hasClass("#document");
        java.lang.String str18 = element15.html();
        org.jsoup.select.Elements elements20 = element15.getElementsMatchingText("");
        org.jsoup.nodes.Element element21 = element5.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements23 = element15.getElementsContainingOwnText("\n<head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        org.jsoup.select.Elements elements13 = document9.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document9.outputSettings();
        org.jsoup.select.Elements elements16 = document9.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document9.outputSettings();
        org.jsoup.select.Elements elements20 = document9.getElementsByAttributeValueMatching("hi!  #document", "#root");
        java.lang.String str22 = document9.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element23.before("hi!  #document");
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings3.charset("<#root></#root>hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>hi!");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings9.encoder();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        org.jsoup.nodes.Element element12 = document1.val("");
        org.jsoup.nodes.Element element14 = document1.addClass("hi!");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByClass("");
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        java.lang.String str7 = element3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element3.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Node node4 = document1.removeAttr("#document");
        java.lang.String str5 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        boolean boolean4 = outputSettings3.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings3.encoder();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document7.nextSibling();
        java.lang.String str12 = document7.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document7.outputSettings();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document15.head();
        java.lang.String str17 = document15.outerHtml();
        java.lang.Integer int18 = document15.elementSiblingIndex();
        java.lang.String str19 = document15.nodeName();
        org.jsoup.nodes.Element element21 = document15.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document15.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings3.escapeMode(escapeMode25);
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document29.head();
        java.lang.String str31 = document29.outerHtml();
        java.lang.Integer int32 = document29.elementSiblingIndex();
        java.lang.String str33 = document29.nodeName();
        org.jsoup.nodes.Element element35 = document29.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document29.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings27.escapeMode(escapeMode37);
        boolean boolean39 = outputSettings27.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.html("hi!");
        boolean boolean11 = element9.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        org.jsoup.select.Elements elements14 = element9.getElementsByAttribute("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element9.childNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.jsoup.select.Elements elements26 = document22.getElementsByAttributeValueEnding("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>", " #document");
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
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasAttr("");
        java.lang.String str12 = document1.baseUri();
        org.jsoup.nodes.Element element14 = document1.html("hi!  #document");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document1.getElementsMatchingText(pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.jsoup.nodes.Element element20 = element17.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueStarting("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int17 = outputSettings16.indentAmount();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "#document" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Element element11 = element8.attr("#root", "hi!");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueContaining("<#root></#root>", "\n<head></head>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValue("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        java.lang.String str10 = element5.className();
        element5.setBaseUri("");
        org.jsoup.select.Elements elements14 = element5.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        java.lang.String str4 = document1.ownText();
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str11 = document1.absUrl("hi!");
        java.lang.String str12 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        java.lang.Integer int8 = element3.elementSiblingIndex();
        element3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str11 = element3.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.toString();
        java.lang.String str7 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.after(" #document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.charset("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body></body>?</html>");
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
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document15.nextSibling();
        java.lang.String str20 = document15.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document15.outputSettings();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document23.head();
        java.lang.String str25 = document23.outerHtml();
        java.lang.Integer int26 = document23.elementSiblingIndex();
        java.lang.String str27 = document23.nodeName();
        org.jsoup.nodes.Element element29 = document23.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = document23.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings21.escapeMode(escapeMode33);
        java.nio.charset.Charset charset35 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings12.charset(charset35);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.prepend("<#root></#root>hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document1.before("");
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
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jsoup.select.Elements elements29 = document14.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = document14.createElement("");
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
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element9 = element3.val("hi! #document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document1.getElementsMatchingOwnText(pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        boolean boolean6 = document5.isBlock();
        java.lang.String str7 = document5.tagName();
        org.jsoup.select.Elements elements10 = document5.getElementsByAttributeValueNot("hi!", "&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = document6.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document6.prependText("#root");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("#document");
        java.lang.String str14 = element11.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root <html> <head></head> <body></body> </html>" + "'", str14, "#root <html> <head></head> <body></body> </html>");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        java.lang.String str11 = element7.toString();
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element7.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("hi!");
        org.jsoup.nodes.Element element12 = document1.append("#root");
        org.jsoup.nodes.Element element14 = element12.val(" #document");
        org.jsoup.nodes.Element element16 = element12.wrap("<#root></#root>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean6 = document1.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.select("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>': unexpected token at '<#root></#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.toString();
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Element element9 = document1.appendText("#document");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.after("\n<head></head>");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Node node9 = document1.removeAttr("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document7.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        org.jsoup.nodes.Element element6 = document1.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str7 = document1.text();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element7.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.nodes.Element element7 = element5.appendElement("hi!");
        element7.setBaseUri("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
            java.lang.String str16 = element15.text();
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.parser.Tag tag6 = element5.tag();
        element5.setBaseUri("\n<head></head>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str14 = element10.attr("hi!  #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element10.child((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str5 = document1.absUrl("hi!");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element9);
    }
}

