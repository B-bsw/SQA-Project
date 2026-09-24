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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.Class<?> wildcardClass2 = document1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
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
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueEnding("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element7.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document5.getElementsByAttributeValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        org.jsoup.nodes.Element element8 = document1.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element3.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.nodes.Element element21 = element10.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueContaining("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        element3.setBaseUri("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueNot("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document5.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.prepend("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document9.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueContaining("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.nodes.Element element8 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = element8.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueStarting("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document1.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = element18.prependText("");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element27 = document25.appendText("");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        java.lang.String str31 = document29.outerHtml();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.nodes.Element element35 = document29.appendChild((org.jsoup.nodes.Node) document33);
        boolean boolean36 = element27.equals((java.lang.Object) document33);
        org.jsoup.select.Elements elements38 = document33.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element40 = document33.appendElement("hi!");
        org.jsoup.nodes.Element element42 = element40.prependElement("hi!");
        org.jsoup.select.Elements elements45 = element42.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element46 = element23.prependChild((org.jsoup.nodes.Node) element42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element6.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.appendElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = element9.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element6.hasClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.Class<?> wildcardClass8 = document1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.toggleClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element6.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document7.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = document1.attr("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        java.lang.String str8 = element7.toString();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.appendElement("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.nodes.Element element37 = document9.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements39 = document9.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.appendText("");
        java.lang.String str31 = element30.text();
        org.jsoup.select.Elements elements33 = element30.getElementsByTag("hi!");
        org.jsoup.select.Elements elements35 = element30.getElementsByIndexEquals(10);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element10.hasAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element17.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Node node4 = document1.removeAttr("hi!");
        java.lang.Class<?> wildcardClass5 = node4.getClass();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueNot("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        org.jsoup.select.Elements elements19 = document1.getElementsByIndexLessThan(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element7 = element3.wrap("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueNot("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValueContaining("#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueEnding("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element5.parent();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Element element11 = document8.body();
        java.lang.String str12 = document8.title();
        java.lang.String str13 = document8.nodeName();
        org.jsoup.nodes.Element element15 = document8.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element6.appendChild((org.jsoup.nodes.Node) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        org.jsoup.nodes.Element element10 = document1.html("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueStarting("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document13.hasClass("hi!");
        java.lang.Integer int16 = document13.elementSiblingIndex();
        org.jsoup.nodes.Node node18 = document13.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) document13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        org.jsoup.nodes.Element element11 = element9.appendElement("<#root>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element6.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueContaining("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexEquals((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        java.lang.String str5 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.id();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element17.attr("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element9.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element6 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.select("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.select.Elements elements34 = element3.getElementsByAttributeValueEnding("#root", "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element16 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element16.attr("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.appendText("");
        java.lang.String str10 = document7.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        boolean boolean11 = element7.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int12 = element7.elementSiblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str15 = element14.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element14.getElementsByAttributeValueContaining("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueStarting("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element8.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        org.jsoup.nodes.Element element10 = document1.html("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = document5.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element6.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttribute("#root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements40 = document36.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document1.appendChild(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.parser.Tag tag5 = document1.tag();
        document1.setBaseUri("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element2.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.body();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.nodes.Element element7 = document5.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.appendChild((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.prependChild(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.appendChild(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = element8.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        java.lang.String str12 = element6.id();
        org.jsoup.select.Elements elements13 = element6.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element6.getElementsByAttributeValueContaining("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        java.util.Set<java.lang.String> strSet28 = document1.classNames();
        org.jsoup.nodes.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element5 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.append("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        java.lang.String str11 = document1.className();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.Integer int9 = element6.elementSiblingIndex();
        java.lang.String str10 = element6.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element6.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("#document");
        java.lang.Class<?> wildcardClass10 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements48 = element43.select("<#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        java.lang.String str8 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.nodes.Element element12 = document6.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.select.Elements elements17 = document14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element19 = document14.val("");
        org.jsoup.nodes.Node node21 = document14.removeAttr("#root");
        boolean boolean22 = document6.equals((java.lang.Object) node21);
        java.lang.String str23 = document6.data();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            document8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        java.lang.Class<?> wildcardClass5 = document1.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.html();
        java.lang.String str10 = element6.data();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.Class<?> wildcardClass26 = element25.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.appendText("");
        org.jsoup.nodes.Element element9 = document1.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document1.className();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element11.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element31.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueContaining("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document12.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document1.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document12.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.nodes.Element element24 = element13.wrap("hi!");
        org.jsoup.nodes.Attributes attributes25 = element13.attributes();
        element13.setBaseUri("#root");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        element6.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        org.jsoup.nodes.Element element12 = element6.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element12 = element10.val("#root");
        java.lang.String str13 = element10.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueNot("", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        java.lang.String str31 = document1.toString();
        org.jsoup.select.Elements elements34 = document1.getElementsByAttributeValueStarting("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element6.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        java.lang.String str11 = document1.absUrl("<#root>\n</#root>");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        java.lang.String str37 = document9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = document9.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        java.lang.String str31 = document1.toString();
        java.lang.Class<?> wildcardClass32 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.util.Set<java.lang.String> strSet18 = document1.classNames();
        org.jsoup.nodes.Element element19 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = document1.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element7.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.Class<?> wildcardClass11 = element5.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.appendElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        java.lang.Class<?> wildcardClass31 = strSet28.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element13 = element9.removeClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.getElementById("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document6.val("");
        org.jsoup.nodes.Element element13 = document6.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element4.prependChild((org.jsoup.nodes.Node) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        java.lang.String str12 = element6.id();
        org.jsoup.select.Elements elements13 = element6.children();
        org.jsoup.select.Elements elements15 = element6.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes3 = element2.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element6.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element6.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValue("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element16 = document1.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValue("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        java.lang.Object obj44 = null;
        boolean boolean45 = element43.equals(obj44);
        boolean boolean46 = element43.hasText();
        java.lang.String[] strArray50 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.jsoup.nodes.Element element53 = element43.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Element element54 = document9.classNames((java.util.Set<java.lang.String>) strSet51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = document9.text("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.nodes.Element element37 = document9.nextElementSibling();
        org.jsoup.nodes.Element element39 = element37.prependElement("#document");
        org.jsoup.nodes.Element element41 = element37.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements43 = element37.getElementsByTag("#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document23.hasClass("hi!");
        boolean boolean27 = document23.hasClass("hi!");
        org.jsoup.nodes.Element element29 = document23.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element31 = element29.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        java.lang.Class<?> wildcardClass20 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element13 = element9.removeClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.parser.Tag tag8 = document1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.select.Elements elements28 = element8.getElementsByIndexLessThan((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = element8.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean13 = document1.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        org.jsoup.select.Elements elements18 = document15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element20 = document15.val("");
        org.jsoup.nodes.Element element22 = document15.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.prependText("hi!");
        org.jsoup.select.Elements elements26 = document21.getElementsByAttributeValueContaining("#root", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element19.replaceWith((org.jsoup.nodes.Node) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        element17.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element17.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Node node6 = document1.removeAttr("#document");
        boolean boolean8 = document1.hasClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document1.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        boolean boolean3 = document1.isBlock();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexGreaterThan((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        org.jsoup.select.Elements elements23 = document20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element25 = document20.val("");
        org.jsoup.nodes.Node node27 = document20.removeAttr("#root");
        boolean boolean28 = document12.equals((java.lang.Object) node27);
        org.jsoup.nodes.Element element29 = document12.body();
        // The following exception was thrown during execution in test generation
        try {
            document10.replaceWith((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueStarting("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document1.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        java.lang.String str10 = element7.val();
        java.lang.Class<?> wildcardClass11 = element7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element5 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag6 = element5.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        java.lang.Class<?> wildcardClass6 = elements5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element31.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueNot("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.appendText("");
        java.lang.String str10 = document7.title();
        org.jsoup.nodes.Element element12 = document7.removeClass("hi!");
        org.jsoup.nodes.Element element14 = element12.removeClass("");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        java.lang.Object obj22 = null;
        boolean boolean23 = element21.equals(obj22);
        boolean boolean24 = element21.hasText();
        java.lang.String[] strArray28 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = element21.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = element14.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element33 = document1.classNames((java.util.Set<java.lang.String>) strSet29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList34 = element33.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        java.lang.Object obj18 = null;
        boolean boolean19 = element17.equals(obj18);
        boolean boolean20 = element17.hasText();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element17);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.siblingNodes();
        java.lang.String str23 = element17.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element12 = element10.val("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element10.addClass("#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = element6.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.appendElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean32 = document1.hasAttr("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = document1.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValue("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueStarting("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "#root");
        boolean boolean34 = element30.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = element30.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        java.lang.Class<?> wildcardClass32 = element18.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        java.lang.String str8 = document1.toString();
        org.jsoup.nodes.Element element10 = document1.getElementById("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element19.empty();
        // The following exception was thrown during execution in test generation
        try {
            element20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.toggleClass("#root");
        java.lang.Class<?> wildcardClass15 = element14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.select.Elements elements5 = document4.getAllElements();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.appendText("");
        java.lang.String str10 = document7.title();
        org.jsoup.nodes.Element element12 = document7.removeClass("hi!");
        org.jsoup.nodes.Element element14 = element12.removeClass("");
        org.jsoup.select.Elements elements16 = element12.getElementsByTag("#document");
        org.jsoup.nodes.Element element17 = element12.empty();
        // The following exception was thrown during execution in test generation
        try {
            document4.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document8.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        java.lang.String str31 = document1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = document1.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.Object obj16 = null;
        boolean boolean17 = element15.equals(obj16);
        boolean boolean18 = element15.hasText();
        java.lang.String[] strArray22 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element8.classNames((java.util.Set<java.lang.String>) strSet23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element8.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        org.jsoup.nodes.Element element12 = element7.prependText("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element7.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.select("<#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        org.jsoup.nodes.Element element12 = element7.prependText("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass13 = element12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        java.lang.String str23 = document20.html();
        org.jsoup.nodes.Element element24 = element17.prependChild((org.jsoup.nodes.Node) document20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = document20.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.appendText("");
        java.lang.String str10 = document7.title();
        org.jsoup.nodes.Element element12 = document7.removeClass("hi!");
        org.jsoup.nodes.Element element14 = element12.removeClass("");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        java.lang.Object obj22 = null;
        boolean boolean23 = element21.equals(obj22);
        boolean boolean24 = element21.hasText();
        java.lang.String[] strArray28 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = element21.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = element14.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element33 = document1.classNames((java.util.Set<java.lang.String>) strSet29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList34 = document1.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByIndexEquals((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = document6.getElementsByAttributeValueContaining("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.removeClass("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Element element15 = document11.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element15.parent();
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int15 = element3.elementSiblingIndex();
        java.lang.String str16 = element3.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexEquals((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.text("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.String str7 = document1.nodeName();
        boolean boolean9 = document1.hasAttr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str11 = document1.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.jsoup.nodes.Element element10 = element7.removeClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueEnding("hi!", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        java.lang.String str6 = document1.id();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.text();
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = document5.body();
        org.jsoup.select.Elements elements11 = document5.getElementsByAttributeValueContaining("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.select("<#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        element6.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        java.lang.Class<?> wildcardClass12 = element6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element41 = document39.appendText("");
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        java.lang.String str44 = document43.baseUri();
        java.lang.String str45 = document43.outerHtml();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        java.lang.String str48 = document47.baseUri();
        org.jsoup.nodes.Element element49 = document43.appendChild((org.jsoup.nodes.Node) document47);
        boolean boolean50 = element41.equals((java.lang.Object) document47);
        org.jsoup.nodes.Element element52 = element41.wrap("hi!");
        org.jsoup.nodes.Attributes attributes53 = element41.attributes();
        org.jsoup.nodes.Element element55 = element41.appendElement("#root");
        org.jsoup.nodes.Node node57 = element41.childNode(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element58 = element37.appendChild(node57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(element52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = node6.removeAttr("#document");
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document1.parent();
        java.lang.String str32 = document1.title();
        boolean boolean33 = document1.isBlock();
        org.jsoup.select.Elements elements35 = document1.getElementsByIndexLessThan(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        java.lang.Class<?> wildcardClass12 = element11.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        java.lang.String str8 = document1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element13 = document1.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element7 = element3.wrap("#document");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Node node14 = document9.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet15 = document9.classNames();
        java.lang.Integer int16 = document9.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = document9.getAllElements();
        org.jsoup.nodes.Element element19 = document9.html("hi!hi!");
        org.jsoup.nodes.Element element20 = element3.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.appendText("");
        org.jsoup.nodes.Element element25 = document22.body();
        java.lang.String str26 = document22.title();
        java.lang.String str27 = document22.nodeName();
        org.jsoup.nodes.Element element29 = document22.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document9.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.body();
        org.jsoup.select.Elements elements16 = document12.getElementsByAttributeValueStarting("#root", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.nodes.Element element41 = element37.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements43 = element41.select("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>? <head>? </head>? <body>? </body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        org.jsoup.nodes.Element element32 = element6.val("#root");
        org.jsoup.select.Elements elements35 = element6.getElementsByAttributeValueStarting("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.text("#document");
        document1.title("<#root>\n</#root>");
        java.lang.String str13 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root>\n</#root>" + "'", str13, "<#root>\n</#root>");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document3.data();
        org.jsoup.nodes.Element element9 = document3.attr("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.childNodes();
        org.jsoup.nodes.Element element20 = element18.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str5 = document1.text();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        java.lang.String str12 = element10.data();
        org.jsoup.nodes.Element element13 = element10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        boolean boolean8 = document1.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.select("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element3 = document1.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element3.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.nodes.Element element19 = document13.appendChild((org.jsoup.nodes.Node) document17);
        boolean boolean20 = element11.equals((java.lang.Object) document17);
        org.jsoup.nodes.Element element22 = element11.wrap("hi!");
        org.jsoup.nodes.Attributes attributes23 = element11.attributes();
        org.jsoup.nodes.Element element25 = element11.appendElement("#root");
        org.jsoup.nodes.Node node27 = element11.childNode(1);
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        org.jsoup.select.Elements elements32 = document29.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element34 = document29.getElementById("hi!");
        org.jsoup.nodes.Element element35 = element11.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements36 = document29.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = document7.appendChild((org.jsoup.nodes.Node) document29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Element element15 = element13.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element13.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        java.lang.String str8 = document1.title();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = element10.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document10.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        java.lang.String str38 = document36.outerHtml();
        org.jsoup.nodes.Element element40 = document36.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements43 = document36.getElementsByAttributeValueStarting("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n <head>\n </head>\n <body>\n </body>\n</html>" + "'", str38, "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.html("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        java.lang.Class<?> wildcardClass5 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        boolean boolean7 = element3.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element9 = element3.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element27.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        java.lang.String str17 = element11.tagName();
        org.jsoup.select.Elements elements20 = element11.getElementsByAttributeValueEnding("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element26 = document19.appendElement("hi!");
        org.jsoup.nodes.Element element28 = element26.prependElement("hi!");
        org.jsoup.select.Elements elements31 = element28.getElementsByAttributeValueEnding("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element33 = element28.prependText("");
        boolean boolean35 = element33.hasAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str37 = element33.attr("");
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean13 = document1.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document8.createElement("hi!");
        java.lang.String str28 = document8.nodeName();
        java.lang.String str29 = document8.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<#root>\n</#root>" + "'", str29, "<#root>\n</#root>");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        java.lang.String str14 = document10.html();
        java.lang.String str15 = document10.outerHtml();
        org.jsoup.select.Elements elements17 = document10.getElementsByTag("#document");
        java.lang.String str18 = document10.title();
        org.jsoup.nodes.Element element19 = document10.parent();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document10);
        java.lang.String str21 = document1.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element4.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.Integer int9 = element6.elementSiblingIndex();
        java.lang.String str10 = element6.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element6.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueNot("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element33.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = element33.attr("", "#document hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document10.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document1.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document8.createElement("hi!");
        java.lang.String str28 = document8.nodeName();
        org.jsoup.nodes.Element element29 = document8.empty();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        java.lang.String str32 = document31.baseUri();
        java.lang.String str33 = document31.outerHtml();
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        java.lang.String str36 = document35.baseUri();
        org.jsoup.nodes.Element element37 = document31.appendChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        java.lang.String str40 = document39.baseUri();
        org.jsoup.select.Elements elements42 = document39.getElementsByAttribute("hi!");
        java.lang.String str43 = document39.html();
        org.jsoup.parser.Tag tag44 = document39.tag();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element48 = document46.appendText("");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        java.lang.String str51 = document50.baseUri();
        java.lang.String str52 = document50.outerHtml();
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("");
        java.lang.String str55 = document54.baseUri();
        org.jsoup.nodes.Element element56 = document50.appendChild((org.jsoup.nodes.Node) document54);
        boolean boolean57 = element48.equals((java.lang.Object) document54);
        org.jsoup.select.Elements elements59 = document54.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element61 = document54.appendElement("hi!");
        org.jsoup.nodes.Element element63 = element61.prependElement("hi!");
        boolean boolean64 = document39.equals((java.lang.Object) element63);
        org.jsoup.nodes.Element element65 = document31.prependChild((org.jsoup.nodes.Node) document39);
        org.jsoup.nodes.Element element66 = document39.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            document8.replaceWith((org.jsoup.nodes.Node) element66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNull(element66);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        element3.setBaseUri("#root");
        org.jsoup.nodes.Attributes attributes18 = element3.attributes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.prependElement("<#root>\n</#root>");
        boolean boolean9 = element7.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean32 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements34 = document1.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element35 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = element35.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNull(element35);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.select.Elements elements17 = element3.getElementsByAttributeValueNot("<#root>\n</#root>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element3.prependElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element19.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.text();
        java.lang.String str10 = element6.toString();
        java.lang.String str11 = element6.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element6.getElementsByAttributeValue("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Element element15 = element7.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag18 = document17.tag();
        org.jsoup.nodes.Document document19 = document17.normalise();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        org.jsoup.nodes.Element element12 = element7.prependText("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element7.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.nodes.Element element44 = document36.html("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element46 = element44.val("#document hi!");
        org.jsoup.select.Elements elements48 = element46.getElementsByAttribute("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet40 = element37.classNames();
        org.jsoup.nodes.Element element41 = element37.lastElementSibling();
        org.jsoup.nodes.Element element43 = element41.wrap("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = element43.absUrl("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(element43);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str13 = document1.attr("#root");
        org.jsoup.nodes.Element element14 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("#document hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element7.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        element17.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        java.lang.String str25 = element23.attr("#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document4.children();
        org.jsoup.nodes.Element element7 = document4.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document9.hasClass("hi!");
        boolean boolean13 = document9.hasClass("hi!");
        org.jsoup.nodes.Element element14 = document9.head();
        boolean boolean15 = document4.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements17 = document9.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = element4.data();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = element13.appendChild((org.jsoup.nodes.Node) document15);
        java.lang.Class<?> wildcardClass17 = element13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.prependText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.Class<?> wildcardClass15 = document1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document9.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean15 = element14.hasText();
        org.jsoup.nodes.Element element17 = element14.prependText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element24 = document19.val("");
        org.jsoup.nodes.Element element26 = document19.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str27 = document19.tagName();
        java.lang.String str28 = document19.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            element17.replaceWith((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str28, "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes35 = element34.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        java.lang.String str12 = document1.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        java.lang.String str16 = document14.outerHtml();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.nodes.Element element20 = document14.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.baseUri();
        org.jsoup.select.Elements elements25 = document22.getElementsByAttribute("hi!");
        java.lang.String str26 = document22.html();
        org.jsoup.parser.Tag tag27 = document22.tag();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element31 = document29.appendText("");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        java.lang.String str35 = document33.outerHtml();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        java.lang.String str38 = document37.baseUri();
        org.jsoup.nodes.Element element39 = document33.appendChild((org.jsoup.nodes.Node) document37);
        boolean boolean40 = element31.equals((java.lang.Object) document37);
        org.jsoup.select.Elements elements42 = document37.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element44 = document37.appendElement("hi!");
        org.jsoup.nodes.Element element46 = element44.prependElement("hi!");
        boolean boolean47 = document22.equals((java.lang.Object) element46);
        org.jsoup.nodes.Element element48 = document14.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Node node49 = document22.previousSibling();
        org.jsoup.nodes.Element element50 = document22.nextElementSibling();
        org.jsoup.nodes.Element element52 = element50.prependElement("#document");
        org.jsoup.nodes.Element element54 = element50.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element55 = document1.prependChild((org.jsoup.nodes.Node) element54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements48 = document36.select("hi! <html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! <html> <head> </head> <body> </body> </html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document8.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = document8.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        java.lang.String str5 = element3.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        java.lang.String str20 = document1.outerHtml();
        java.lang.String str21 = document1.outerHtml();
        org.jsoup.nodes.Element element22 = document1.empty();
        org.jsoup.select.Elements elements24 = document1.getElementsByClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document1.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n</#root>" + "'", str20, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<#root>\n</#root>" + "'", str21, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodes();
        org.jsoup.nodes.Element element8 = element5.getElementById("#document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document10.val("");
        org.jsoup.select.Elements elements18 = document10.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element19 = document10.head();
        org.jsoup.nodes.Element element20 = document10.parent();
        org.jsoup.select.Elements elements23 = document10.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str26 = document25.outerHtml();
        java.util.Set<java.lang.String> strSet27 = document25.classNames();
        org.jsoup.nodes.Element element28 = document10.classNames(strSet27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = element8.equals((java.lang.Object) strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        java.lang.String str12 = element7.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>" + "'", str12, "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = document5.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.append("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean15 = element14.hasText();
        java.lang.String str16 = element14.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element4.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.nodes.Element element44 = document36.html("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.util.Set<java.lang.String> strSet45 = element44.classNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.select("hi!hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.toString();
        java.lang.String str9 = document1.baseUri();
        java.lang.String str10 = document1.data();
        org.jsoup.nodes.Document document11 = document1.normalise();
        java.lang.Class<?> wildcardClass12 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements7 = document5.getElementsByAttribute("hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        boolean boolean9 = document5.hasAttr("");
        org.jsoup.select.Elements elements11 = document5.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int12 = document5.elementSiblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.select("hi! <html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! <html> <head> </head> <body> </body> </html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str11 = document1.text();
        java.lang.String str12 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean32 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements34 = document1.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element35 = document1.body();
        java.lang.String str36 = document1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element6.wrap("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element20.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element6.wrap("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = element20.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = element14.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttribute("hi!");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.toggleClass("#root");
        org.jsoup.nodes.Element element16 = element14.prependText("#document hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element14.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.toString();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "hi!hi!");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.parser.Tag tag17 = element16.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element16.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.select("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>? <head>? </head>? <body>? </body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
        java.lang.String str12 = element9.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Element element21 = element17.removeClass("#root");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document1.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        org.jsoup.nodes.Element element9 = element7.parent();
        boolean boolean11 = element7.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag12 = element7.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element26 = document8.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element26.removeClass("hi! <html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        boolean boolean26 = element25.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str11 = document1.absUrl("#document");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document13.hasClass("hi!");
        java.lang.Integer int16 = document13.elementSiblingIndex();
        org.jsoup.nodes.Node node18 = document13.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document13.appendElement("hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = element11.html();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Node node29 = element18.removeAttr("hi!");
        org.jsoup.nodes.Element element30 = element11.appendChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element18.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>" + "'", str14, "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        java.lang.String str14 = document10.html();
        java.lang.String str15 = document10.outerHtml();
        org.jsoup.select.Elements elements17 = document10.getElementsByTag("#document");
        java.lang.String str18 = document10.title();
        org.jsoup.nodes.Element element19 = document10.parent();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document10.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str11 = document1.absUrl("#document");
        java.lang.String str12 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element12 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.appendText("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        java.util.Set<java.lang.String> strSet28 = document1.classNames();
        org.jsoup.nodes.Document document29 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = document1.getElementsByAttributeValueNot("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str27 = document1.attr("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.jsoup.nodes.Element element10 = element7.removeClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValue("", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.createElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean13 = document1.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.select("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodes();
        org.jsoup.nodes.Element element8 = element5.getElementById("#document");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element5.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = element6.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements38 = element37.getAllElements();
        java.lang.String str39 = element37.baseUri();
        java.lang.String str40 = element37.toString();
        java.lang.Integer int41 = element37.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        java.lang.String str9 = element3.text();
        org.jsoup.select.Elements elements11 = element3.getElementsByAttribute("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.Integer int12 = element3.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        boolean boolean24 = document8.equals((java.lang.Object) node23);
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element27 = document8.createElement("hi!");
        org.jsoup.select.Elements elements30 = document8.getElementsByAttributeValueEnding("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "hi!hi!");
        java.lang.String str31 = document8.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Attributes attributes14 = element7.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element7.childNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        java.lang.String str17 = element3.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.lang.Class<?> wildcardClass11 = element6.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.replaceWith(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        org.jsoup.nodes.Element element18 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            element18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        java.lang.String str16 = document9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueContaining("", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.className();
        java.lang.String str9 = element7.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element7.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str14 = element10.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element19.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        java.lang.String str13 = element3.id();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeValue("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        org.jsoup.nodes.Element element42 = document36.val("<#root>\n</#root>");
        org.jsoup.parser.Tag tag43 = element42.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(tag43);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = document1.prepend("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        java.lang.String str11 = element7.attr("");
        org.jsoup.nodes.Element element13 = element7.append("");
        org.jsoup.nodes.Attributes attributes14 = element7.attributes();
        java.lang.String str15 = element7.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element3.siblingNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.toggleClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element9 = document5.addClass("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Element element16 = document1.val("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.childNodes();
        org.jsoup.nodes.Element element21 = element18.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        boolean boolean23 = element21.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element3.parent();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.appendText("");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        java.lang.String str41 = document40.baseUri();
        java.lang.String str42 = document40.outerHtml();
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        java.lang.String str45 = document44.baseUri();
        org.jsoup.nodes.Element element46 = document40.appendChild((org.jsoup.nodes.Node) document44);
        boolean boolean47 = element38.equals((java.lang.Object) document44);
        org.jsoup.select.Elements elements49 = document44.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element51 = document44.appendElement("hi!");
        org.jsoup.nodes.Element element53 = element51.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element53.siblingNodes();
        java.lang.String str55 = element53.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = element3.prependChild((org.jsoup.nodes.Node) element53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\n <hi!>\n </hi!>" + "'", str55, "\n <hi!>\n </hi!>");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Node node10 = element7.removeAttr("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        java.lang.String str19 = element16.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements58 = document48.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element29.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element5 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexEquals(1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element14.isBlock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.val("");
        java.lang.Object obj27 = null;
        boolean boolean28 = element26.equals(obj27);
        boolean boolean29 = element26.hasText();
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueContaining("#root", "#document");
        boolean boolean33 = document1.equals((java.lang.Object) element26);
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        boolean boolean37 = document35.hasClass("hi!");
        java.lang.String str38 = document35.tagName();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.appendText("");
        org.jsoup.nodes.Element element43 = document35.appendChild((org.jsoup.nodes.Node) document40);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        java.lang.String str10 = element9.tagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document12.hasClass("hi!");
        java.lang.String str15 = document12.tagName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.appendText("");
        org.jsoup.nodes.Element element20 = document12.appendChild((org.jsoup.nodes.Node) document17);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document17.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        boolean boolean9 = document1.isBlock();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.baseUri();
        java.lang.String str17 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.nodes.Element element21 = document15.appendChild((org.jsoup.nodes.Node) document19);
        boolean boolean22 = element13.equals((java.lang.Object) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexLessThan((int) ' ');
        boolean boolean25 = element9.equals((java.lang.Object) document19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = document19.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.prependText("hi!");
        java.lang.String str24 = document21.nodeName();
        org.jsoup.select.Elements elements26 = document21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.select.Elements elements39 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element41 = document36.val("");
        org.jsoup.nodes.Node node43 = document36.removeAttr("#root");
        boolean boolean44 = document28.equals((java.lang.Object) node43);
        org.jsoup.nodes.Element element45 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements46 = element45.getAllElements();
        boolean boolean47 = document1.equals((java.lang.Object) element45);
        org.jsoup.nodes.Node node49 = element45.removeAttr("hi!");
        org.jsoup.nodes.Element element51 = element45.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element6.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Class<?> wildcardClass19 = element6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document8.attr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document8.empty();
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.id();
        java.lang.String str8 = document1.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.body();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element17.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = document1.attributes();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.select.Elements elements20 = document17.getElementsByAttribute("hi!");
        java.lang.String str21 = document17.html();
        org.jsoup.parser.Tag tag22 = document17.tag();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.appendText("");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        boolean boolean35 = element26.equals((java.lang.Object) document32);
        org.jsoup.select.Elements elements37 = document32.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element39 = document32.appendElement("hi!");
        org.jsoup.nodes.Element element41 = element39.prependElement("hi!");
        boolean boolean42 = document17.equals((java.lang.Object) element41);
        org.jsoup.nodes.Element element43 = document9.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document44 = document17.normalise();
        org.jsoup.select.Elements elements46 = document44.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element48 = document44.val("");
        org.jsoup.parser.Tag tag49 = document44.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = document1.prependChild((org.jsoup.nodes.Node) document44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        org.jsoup.select.Elements elements8 = element6.children();
        boolean boolean10 = element6.hasAttr("hi!");
        java.lang.String str12 = element6.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.appendText("#document");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValue("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.tagName();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.appendText("");
        java.lang.String str13 = document10.title();
        org.jsoup.nodes.Node node15 = document10.removeAttr("hi!");
        java.lang.String str16 = document10.className();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        boolean boolean26 = document10.equals((java.lang.Object) element23);
        org.jsoup.nodes.Attributes attributes27 = element23.attributes();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet30 = document29.classNames();
        org.jsoup.nodes.Element element31 = element23.classNames(strSet30);
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        org.jsoup.nodes.Element element16 = element14.getElementById("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element16.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.select.Elements elements7 = element5.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexEquals((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element17 = document9.empty();
        org.jsoup.nodes.Element element19 = document9.html("#document");
        org.jsoup.nodes.Element element20 = document9.body();
        org.jsoup.nodes.Element element21 = document9.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element21.val("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.lang.String str12 = document11.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.String str7 = element6.id();
        boolean boolean8 = element6.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element6.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        java.lang.String str12 = document1.title();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.baseUri();
        org.jsoup.select.Elements elements7 = document4.getElementsByAttribute("hi!");
        java.lang.String str8 = document4.html();
        org.jsoup.nodes.Element element10 = document4.val("");
        org.jsoup.nodes.Element element12 = document4.prependElement("#root");
        org.jsoup.select.Elements elements14 = document4.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean16 = document4.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document4.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = document4.text();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.select("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>?<html>?<head>? <title>&lt;#root&gt;?&lt;/#root&gt;</title>?</head>?<body>? #document?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.parser.Tag tag37 = document9.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.nodes.Element element13 = document6.empty();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document8.prependText("hi!");
        java.lang.String str11 = document8.nodeName();
        document8.title("#root");
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element16 = document1.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Element element19 = element16.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.setBaseUri("#document");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.select.Elements elements20 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element22 = document1.prependText("#root");
        org.jsoup.nodes.Element element24 = element22.append("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element22.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.select.Elements elements15 = document8.getElementsByIndexEquals((int) '#');
        java.lang.Class<?> wildcardClass16 = document8.getClass();
        boolean boolean17 = document1.equals((java.lang.Object) wildcardClass16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.parser.Tag tag20 = document19.tag();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element23 = document1.createElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str24 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.children();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element8 = document1.wrap("hi! #root hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        org.jsoup.nodes.Element element14 = element10.appendElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("", "hi! #root hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        java.lang.String str17 = document13.html();
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        org.jsoup.nodes.Document document20 = document13.normalise();
        org.jsoup.nodes.Element element22 = document20.wrap("#root");
        org.jsoup.nodes.Element element23 = element6.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements26 = document20.getElementsByAttributeValueContaining("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document20.wrap("hi! #root hi!");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n <hi!>\n </hi!>");
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str6 = document1.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueContaining("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.select("<#root>\n</#root><#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root><#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str36 = document9.val();
        java.lang.String str37 = document9.baseUri();
        org.jsoup.nodes.Element element39 = document9.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements41 = document9.select("<#root>\n</#root><#root>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root><#root>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        boolean boolean9 = element6.hasText();
        java.lang.String[] strArray13 = new java.lang.String[] { "#root", "#root", "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueStarting("", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "#root", "#root", "#root" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = element4.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        org.jsoup.nodes.Element element13 = document8.html("");
        org.jsoup.nodes.Document document14 = document8.normalise();
        org.jsoup.nodes.Element element16 = document8.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = document8.val();
        boolean boolean18 = element4.equals((java.lang.Object) str17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.Object obj7 = null;
        boolean boolean8 = element6.equals(obj7);
        java.lang.String str9 = element6.baseUri();
        org.jsoup.nodes.Element element11 = element6.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element6.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element6.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Element element49 = document36.attr("<#root>\n</#root>", "#root");
        org.jsoup.nodes.Node node51 = document36.removeAttr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        element7.setBaseUri("hi!");
        java.lang.String str10 = element7.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element7.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element5 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! #root hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.nodes.Element element18 = element14.removeClass("#root");
        java.util.Set<java.lang.String> strSet19 = element14.classNames();
        org.jsoup.nodes.Element element20 = document1.classNames(strSet19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        org.jsoup.nodes.Element element19 = document1.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str20 = element19.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element16 = document1.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element18.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.html("<#root>\n</#root>");
        java.lang.String str19 = element16.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>" + "'", str19, "<#root>");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.nodes.Element element11 = element9.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Node node20 = document13.removeAttr("#root");
        org.jsoup.nodes.Element element22 = document13.html("#root");
        boolean boolean23 = element9.equals((java.lang.Object) "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element9.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        org.jsoup.select.Elements elements57 = document48.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet7 = element3.classNames();
        org.jsoup.nodes.Element element9 = element3.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.select("hi! #root hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! #root hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.append("");
        java.lang.String str30 = document21.id();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str13 = document1.attr("#root");
        org.jsoup.nodes.Element element14 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.getElementById("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.select.Elements elements17 = document9.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element18 = document9.head();
        org.jsoup.nodes.Element element19 = document9.parent();
        org.jsoup.select.Elements elements22 = document9.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str25 = document24.outerHtml();
        java.util.Set<java.lang.String> strSet26 = document24.classNames();
        org.jsoup.nodes.Element element27 = document9.classNames(strSet26);
        org.jsoup.nodes.Element element28 = element7.appendChild((org.jsoup.nodes.Node) element27);
        element27.setBaseUri("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element27.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.Class<?> wildcardClass3 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.head();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.nodes.Element element19 = document13.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = document21.html();
        org.jsoup.parser.Tag tag26 = document21.tag();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.appendText("");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        java.lang.String str34 = document32.outerHtml();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.nodes.Element element38 = document32.appendChild((org.jsoup.nodes.Node) document36);
        boolean boolean39 = element30.equals((java.lang.Object) document36);
        org.jsoup.select.Elements elements41 = document36.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element43 = document36.appendElement("hi!");
        org.jsoup.nodes.Element element45 = element43.prependElement("hi!");
        boolean boolean46 = document21.equals((java.lang.Object) element45);
        org.jsoup.nodes.Element element47 = document13.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document document48 = document21.normalise();
        org.jsoup.nodes.Element element49 = document48.lastElementSibling();
        org.jsoup.select.Elements elements51 = element49.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet52 = element49.classNames();
        org.jsoup.nodes.Element element53 = element49.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element54 = element11.prependChild((org.jsoup.nodes.Node) element53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document19.hasClass("hi!");
        java.lang.String str22 = document19.className();
        org.jsoup.nodes.Element element24 = document19.html("");
        org.jsoup.nodes.Document document25 = document19.normalise();
        org.jsoup.nodes.Element element27 = document19.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document9.replaceWith((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element29 = document9.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = element29.text();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean17 = document1.equals((java.lang.Object) element14);
        org.jsoup.select.Elements elements19 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.prependText("hi!");
        java.lang.String str24 = document21.nodeName();
        org.jsoup.select.Elements elements26 = document21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.baseUri();
        java.lang.String str30 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.baseUri();
        org.jsoup.nodes.Element element34 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.lang.String str37 = document36.baseUri();
        org.jsoup.select.Elements elements39 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element41 = document36.val("");
        org.jsoup.nodes.Node node43 = document36.removeAttr("#root");
        boolean boolean44 = document28.equals((java.lang.Object) node43);
        org.jsoup.nodes.Element element45 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements46 = element45.getAllElements();
        boolean boolean47 = document1.equals((java.lang.Object) element45);
        org.jsoup.nodes.Node node49 = element45.removeAttr("hi!");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element53 = document51.appendText("");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        java.lang.String str56 = document55.baseUri();
        java.lang.String str57 = document55.outerHtml();
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        java.lang.String str60 = document59.baseUri();
        org.jsoup.nodes.Element element61 = document55.appendChild((org.jsoup.nodes.Node) document59);
        boolean boolean62 = element53.equals((java.lang.Object) document59);
        org.jsoup.nodes.Element element64 = document59.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = element45.appendChild((org.jsoup.nodes.Node) document59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Element element20 = element17.addClass("#document hi!");
        org.jsoup.nodes.Element element21 = element20.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements38 = element37.getAllElements();
        org.jsoup.nodes.Element element39 = element37.firstElementSibling();
        org.jsoup.nodes.Element element40 = element39.nextElementSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = document36.val("");
        java.lang.String str41 = document36.text();
        document36.title("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        java.lang.Integer int20 = element3.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.String str11 = element5.baseUri();
        org.jsoup.nodes.Element element13 = element5.prepend("<#root>\n</#root>");
        java.lang.String str14 = element5.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        boolean boolean16 = document9.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = document9.val("#root");
        java.lang.Integer int19 = element18.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        java.lang.String str4 = document3.toString();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        boolean boolean15 = element14.hasText();
        org.jsoup.select.Elements elements17 = element14.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element14.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element14.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueNot("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element33.remove();
        org.jsoup.select.Elements elements38 = element33.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element18 = element11.appendText("hi!");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.siblingNodes();
        boolean boolean38 = document36.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document36.childNodes();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        boolean boolean43 = document41.hasClass("hi!");
        java.lang.String str44 = document41.className();
        org.jsoup.nodes.Element element46 = document41.html("");
        org.jsoup.select.Elements elements48 = document41.getElementsByIndexEquals((int) '#');
        boolean boolean50 = document41.hasAttr("#root");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        java.lang.String str53 = document52.baseUri();
        org.jsoup.select.Elements elements55 = document52.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element57 = document52.val("");
        org.jsoup.nodes.Element element59 = element57.removeClass("");
        element57.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet62 = element57.classNames();
        org.jsoup.nodes.Element element63 = document41.classNames(strSet62);
        org.jsoup.nodes.Element element64 = document36.classNames(strSet62);
        org.jsoup.select.Elements elements66 = element64.select(" #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements68 = element64.select("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!?<html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! #root hi!");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueContaining("#root", "hi!");
        java.util.Set<java.lang.String> strSet8 = element3.classNames();
        java.lang.Integer int9 = element3.elementSiblingIndex();
        java.lang.Class<?> wildcardClass10 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        java.lang.String str18 = document9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document9.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n</#root>" + "'", str18, "<#root>\n</#root>");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Element element36 = element30.attr("<#document hi!>\n</#document hi!>", "<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element38 = element36.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element10.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document16 = document9.normalise();
        org.jsoup.nodes.Element element18 = document9.text("#document");
        java.lang.String str19 = document9.html();
        org.jsoup.nodes.Element element20 = document1.appendChild((org.jsoup.nodes.Node) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str19, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element32 = element3.parent();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Element element7 = document5.prependElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element9 = document5.addClass("hi!");
        org.jsoup.nodes.Element element11 = document5.toggleClass("hi! #root hi!");
        org.jsoup.select.Elements elements13 = document5.getElementsByClass("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueNot("hi! #root hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        java.lang.String str33 = element3.attr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.Class<?> wildcardClass34 = element3.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element16 = document9.appendElement("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element19.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.select.Elements elements12 = element6.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element6.addClass("#root");
        org.jsoup.select.Elements elements15 = element14.children();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.id();
        org.jsoup.nodes.Element element14 = element11.prependElement("#document");
        org.jsoup.nodes.Element element16 = element14.getElementById("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        java.lang.String str58 = document57.baseUri();
        org.jsoup.select.Elements elements60 = document57.getElementsByAttribute("hi!");
        java.lang.String str61 = document57.html();
        org.jsoup.nodes.Element element63 = document57.prependText("hi!");
        java.lang.String str64 = document57.id();
        org.jsoup.select.Elements elements66 = document57.getElementsByClass("#document");
        org.jsoup.nodes.Element element67 = document48.appendChild((org.jsoup.nodes.Node) document57);
        org.jsoup.nodes.Element element69 = document48.html("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes70 = document48.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(attributes70);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean10 = document1.hasText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element14 = document9.val("");
        org.jsoup.nodes.Node node16 = document9.removeAttr("#root");
        boolean boolean17 = document1.equals((java.lang.Object) node16);
        java.lang.String str18 = document1.data();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.appendText("");
        java.lang.String str23 = document20.title();
        org.jsoup.nodes.Node node25 = document20.removeAttr("hi!");
        java.lang.Integer int26 = document20.elementSiblingIndex();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements29 = element27.getElementsByTag("#root");
        org.jsoup.select.Elements elements32 = element27.getElementsByAttributeValueStarting("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        org.jsoup.nodes.Document document11 = document7.normalise();
        org.jsoup.select.Elements elements14 = document7.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.prependChild((org.jsoup.nodes.Node) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        java.lang.String str47 = element43.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document7.children();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element15 = document7.val("hi!");
        org.jsoup.nodes.Element element17 = document7.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.prependText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str15 = element14.val();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Node node15 = document9.previousSibling();
        org.jsoup.nodes.Element element17 = document9.prependElement("#root");
        java.lang.String str18 = document9.toString();
        java.lang.String str19 = document9.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n</#root>" + "'", str18, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element4 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Node node36 = document9.previousSibling();
        org.jsoup.nodes.Element element37 = document9.nextElementSibling();
        org.jsoup.nodes.Element element39 = element37.prependElement("#document");
        org.jsoup.nodes.Element element41 = element37.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node42 = element37.nextSibling();
        org.jsoup.select.Elements elements44 = element37.getElementsByIndexLessThan((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element12 = element9.attr("#document", "#document");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        java.lang.String str20 = document16.html();
        java.lang.String str21 = document16.html();
        org.jsoup.nodes.Element element22 = document16.empty();
        org.jsoup.nodes.Document document23 = document16.normalise();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document25.hasClass("hi!");
        boolean boolean29 = document25.hasClass("hi!");
        java.lang.String str30 = document25.outerHtml();
        boolean boolean31 = document25.hasText();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.select.Elements elements36 = document33.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element38 = document33.val("");
        org.jsoup.nodes.Element element40 = element38.removeClass("");
        org.jsoup.nodes.Element element42 = element38.removeClass("#root");
        java.util.Set<java.lang.String> strSet43 = element38.classNames();
        org.jsoup.nodes.Element element44 = document25.classNames(strSet43);
        org.jsoup.nodes.Element element45 = document23.classNames(strSet43);
        org.jsoup.nodes.Element element46 = element9.prependChild((org.jsoup.nodes.Node) element45);
        java.lang.String str47 = element46.text();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        java.lang.String str8 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.nodes.Element element12 = document6.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.select.Elements elements17 = document14.getElementsByAttribute("hi!");
        java.lang.String str18 = document14.html();
        org.jsoup.parser.Tag tag19 = document14.tag();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document21.appendText("");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.baseUri();
        java.lang.String str27 = document25.outerHtml();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        org.jsoup.nodes.Element element31 = document25.appendChild((org.jsoup.nodes.Node) document29);
        boolean boolean32 = element23.equals((java.lang.Object) document29);
        org.jsoup.select.Elements elements34 = document29.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element36 = document29.appendElement("hi!");
        org.jsoup.nodes.Element element38 = element36.prependElement("hi!");
        boolean boolean39 = document14.equals((java.lang.Object) element38);
        org.jsoup.nodes.Element element40 = document6.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Node node41 = document14.previousSibling();
        org.jsoup.nodes.Element element42 = document14.nextElementSibling();
        java.lang.String str44 = document14.attr("#root");
        boolean boolean45 = document14.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = element3.appendChild((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("hi!");
        java.util.Set<java.lang.String> strSet14 = element10.classNames();
        org.jsoup.nodes.Element element15 = element6.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element18 = element15.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Attributes attributes21 = element18.attributes();
        org.jsoup.nodes.Element element23 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.nodes.Element element15 = document9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document16 = document9.normalise();
        org.jsoup.nodes.Element element18 = document9.text("#document");
        java.lang.String str19 = document9.html();
        org.jsoup.nodes.Element element20 = document1.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element21 = document1.head();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str19, "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.lang.String str13 = document1.className();
        org.jsoup.select.Elements elements14 = document1.children();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Element element37 = document36.lastElementSibling();
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        org.jsoup.parser.Tag tag40 = element37.tag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(tag40);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Node node10 = document1.removeAttr("#document");
        java.lang.String str11 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element4 = element3.empty();
        org.jsoup.select.Elements elements5 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass10 = document1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = element13.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("hi!", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        java.lang.String str14 = document9.html();
        org.jsoup.nodes.Element element15 = document9.empty();
        org.jsoup.nodes.Element element17 = element15.appendText("hi!");
        java.util.Set<java.lang.String> strSet18 = element15.classNames();
        boolean boolean19 = document7.equals((java.lang.Object) strSet18);
        org.jsoup.nodes.Element element21 = document7.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = document7.nodeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Node node14 = element3.removeAttr("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.nodes.Element element29 = element18.wrap("hi!");
        org.jsoup.nodes.Attributes attributes30 = element18.attributes();
        boolean boolean31 = element3.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element33 = element3.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element34.addClass("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document16.appendText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        java.lang.String str21 = document20.baseUri();
        java.lang.String str22 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        java.lang.String str25 = document24.baseUri();
        org.jsoup.nodes.Element element26 = document20.appendChild((org.jsoup.nodes.Node) document24);
        boolean boolean27 = element18.equals((java.lang.Object) document24);
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element31 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        boolean boolean34 = document9.equals((java.lang.Object) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document36 = document9.normalise();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.select.Elements elements41 = document38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = document38.val("");
        org.jsoup.nodes.Element element45 = element43.removeClass("");
        org.jsoup.nodes.Element element46 = document36.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        java.lang.String str49 = document48.baseUri();
        java.lang.String str50 = document48.outerHtml();
        org.jsoup.parser.Tag tag51 = document48.tag();
        org.jsoup.select.Elements elements53 = document48.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        element43.replaceWith((org.jsoup.nodes.Node) document48);
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.select.Elements elements56 = document48.getAllElements();
        java.lang.String str57 = document48.title();
        org.jsoup.nodes.Element element59 = document48.html("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        java.lang.String str31 = document1.toString();
        org.jsoup.nodes.Element element33 = document1.prependElement("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = document1.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.html("#root");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueContaining("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str9 = element3.baseUri();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.lang.String str8 = element6.html();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = element6.classNames(strSet28);
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> </body> </html>", "#root");
        boolean boolean34 = element30.isBlock();
        java.lang.String str35 = element30.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.html("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        boolean boolean14 = document10.hasClass("hi!");
        java.lang.String str15 = document10.outerHtml();
        boolean boolean16 = document10.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        org.jsoup.nodes.Element element27 = element23.removeClass("#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = document10.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document1.parent();
        java.lang.String str33 = document1.attr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = element2.getElementsByIndexEquals((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.id();
        java.lang.String str10 = document1.attr("<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

