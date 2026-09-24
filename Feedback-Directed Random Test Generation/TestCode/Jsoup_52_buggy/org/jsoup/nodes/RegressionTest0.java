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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        java.lang.String str13 = xmlDeclaration10.outerHtml();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable7, (int) '4', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration11.childNodes();
        java.lang.String str15 = xmlDeclaration11.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, (int) (byte) -1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.Document document9 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes10 = document9.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        java.lang.String str18 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable11, (int) (short) 1, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        xmlDeclaration10.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Class<?> wildcardClass8 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable22, (int) (short) -1, outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration15.childNodes();
        java.lang.String str19 = xmlDeclaration15.getWholeDeclaration();
        java.lang.String str20 = xmlDeclaration15.toString();
        boolean boolean21 = xmlDeclaration5.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = xmlTreeBuilder0.processStartTag("<!>", attributes22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node7.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        boolean boolean18 = node15.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node6.before(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        int int11 = xmlDeclaration5.childNodeSize();
        int int12 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.lang.String str20 = xmlDeclaration16.getWholeDeclaration();
        int int21 = xmlDeclaration16.siblingIndex();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration10.childNodes();
        java.lang.String str14 = xmlDeclaration10.getWholeDeclaration();
        java.lang.String str15 = xmlDeclaration10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node6.after((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        java.lang.String str18 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration20.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable11, 10, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration11.childNodes();
        java.lang.String str15 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.lang.String str22 = xmlDeclaration19.outerHtml();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.clone();
        java.lang.String str24 = node23.baseUri();
        boolean boolean25 = xmlDeclaration11.equals((java.lang.Object) str24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node6.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass10 = nodeList9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = document10.absUrl("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        java.lang.String str18 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (short) -1, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node4.absUrl("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration13.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.String str20 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node19 = xmlDeclaration18.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.String str12 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node4.before((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.Document document9 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node7.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = node10.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.wrap("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration12.wrap("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.lang.Class<?> wildcardClass21 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        org.jsoup.nodes.Attributes attributes11 = node9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Class<?> wildcardClass9 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = document10.hasAttr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration20.outerHtmlHead(appendable32, (int) (short) 1, outputSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, 0, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        int int10 = xmlDeclaration7.siblingIndex();
        java.lang.String str11 = xmlDeclaration7.toString();
        java.lang.String str12 = xmlDeclaration7.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.lang.String str20 = xmlDeclaration16.getWholeDeclaration();
        int int21 = xmlDeclaration16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (short) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        java.lang.Class<?> wildcardClass24 = node23.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.lang.String str29 = xmlDeclaration26.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration26.childNodes();
        java.lang.String str31 = xmlDeclaration26.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node18 = xmlDeclaration17.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        java.lang.Class<?> wildcardClass9 = node7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, (int) 'a', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        int int15 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.String str17 = xmlDeclaration12.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, (int) '#', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasAttr("");
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node7.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("<!>", "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node7.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.siblingNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("#declaration", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        java.lang.String str34 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node35 = xmlDeclaration12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = xmlDeclaration12.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        java.lang.String str10 = xmlDeclaration3.name();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable11, (int) (short) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (-1), outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node16 = xmlDeclaration15.parent();
        java.lang.String str17 = xmlDeclaration15.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.lang.String str24 = xmlDeclaration21.outerHtml();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.clone();
        boolean boolean26 = xmlDeclaration15.equals((java.lang.Object) node25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document11.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        java.lang.String str9 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        org.jsoup.nodes.Node node11 = xmlDeclaration8.nextSibling();
        xmlDeclaration8.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration8.childNodesCopy();
        org.jsoup.nodes.Node node16 = xmlDeclaration8.clone();
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceWith((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        java.lang.Class<?> wildcardClass23 = nodeList22.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        boolean boolean29 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration23);
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration13.attributes();
        java.lang.String str31 = xmlDeclaration13.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Attributes attributes33 = xmlDeclaration16.attributes();
        java.lang.String str34 = xmlDeclaration16.name();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        java.lang.Class<?> wildcardClass13 = node10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.Class<?> wildcardClass6 = node4.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.lang.String str21 = xmlDeclaration15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node11.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        java.lang.String str16 = xmlDeclaration11.absUrl("<!>");
        java.lang.String str17 = xmlDeclaration11.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        int int18 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration12.attr("<!>", "<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node7.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable24, (int) (byte) 100, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("hi!");
        java.lang.String str24 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.removeAttr("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("hi!", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.String str12 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("#declaration", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = xmlDeclaration12.before((org.jsoup.nodes.Node) xmlDeclaration37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.childNodes();
        boolean boolean24 = node21.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = node21.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration12.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, (int) (short) 100, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = node10.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node11.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration12.outerHtmlTail(appendable22, (int) (byte) 0, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = xmlDeclaration12.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        java.lang.String str21 = xmlDeclaration3.name();
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Class<?> wildcardClass9 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        boolean boolean29 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration23);
        boolean boolean31 = xmlDeclaration13.hasSameValue((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable20, (int) (byte) 100, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = node8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = node15.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        java.lang.String str9 = xmlDeclaration3.name();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        int int30 = xmlDeclaration27.siblingIndex();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.nextSibling();
        java.lang.String str32 = xmlDeclaration27.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration27.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration37.childNodes();
        java.lang.String str41 = xmlDeclaration37.getWholeDeclaration();
        java.lang.String str42 = xmlDeclaration37.toString();
        boolean boolean43 = xmlDeclaration27.equals((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Attributes attributes44 = xmlDeclaration27.attributes();
        org.jsoup.nodes.Node node45 = xmlDeclaration27.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        org.jsoup.nodes.Node node25 = xmlDeclaration16.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes26 = node25.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.String str20 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) str16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass11 = nodeList10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) ' ', outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, 10, outputSettings14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, 0, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration12.outerHtmlTail(appendable22, (int) (byte) 0, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration12.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        int int13 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (short) 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration12.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        java.lang.String str18 = xmlDeclaration13.absUrl("<!>");
        java.lang.String str19 = xmlDeclaration13.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, 1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.String str12 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("<!>", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = node13.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean10 = xmlDeclaration5.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Document document23 = xmlDeclaration19.ownerDocument();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) document23);
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = document23.traverse(nodeVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        int int10 = xmlDeclaration7.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration7.nextSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration7.parentNode();
        org.jsoup.nodes.Node node14 = xmlDeclaration7.removeAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.nextSibling();
        xmlDeclaration13.setBaseUri("<!>");
        java.lang.String str20 = xmlDeclaration13.attr("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = node9.equals((java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Node node29 = xmlDeclaration26.nextSibling();
        xmlDeclaration26.setBaseUri("<!>");
        java.lang.String str33 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Document document34 = xmlDeclaration26.ownerDocument();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) document34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = document34.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        java.lang.String str9 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        java.lang.String str38 = xmlDeclaration35.outerHtml();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.childNodes();
        org.jsoup.nodes.Attributes attributes41 = node39.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!>" + "'", str38, "<!>");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.String str24 = xmlDeclaration19.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration19.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration29.childNodes();
        java.lang.String str33 = xmlDeclaration29.getWholeDeclaration();
        java.lang.String str34 = xmlDeclaration29.toString();
        boolean boolean35 = xmlDeclaration19.equals((java.lang.Object) xmlDeclaration29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node10.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.String str12 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("hi!", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Class<?> wildcardClass6 = node5.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration11.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        java.lang.String str21 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.lang.String str30 = node29.baseUri();
        boolean boolean31 = xmlDeclaration17.equals((java.lang.Object) str30);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        java.lang.String str20 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration16.outerHtmlTail(appendable22, (int) '4', outputSettings24);
        java.lang.String str26 = xmlDeclaration16.nodeName();
        org.jsoup.nodes.Document document27 = xmlDeclaration16.ownerDocument();
        java.lang.String str29 = xmlDeclaration16.absUrl("#declaration");
        java.lang.String str31 = xmlDeclaration16.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node7.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        java.lang.String str21 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) (byte) 1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = document11.equals((java.lang.Object) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        int int15 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) (byte) -1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes15 = node14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        int int12 = xmlDeclaration9.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.nextSibling();
        java.lang.String str14 = xmlDeclaration9.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration9.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        java.lang.String str23 = xmlDeclaration19.getWholeDeclaration();
        java.lang.String str24 = xmlDeclaration19.toString();
        boolean boolean25 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration19);
        org.jsoup.nodes.Node node26 = xmlDeclaration9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str22 = xmlDeclaration12.toString();
        java.lang.Class<?> wildcardClass23 = xmlDeclaration12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) (byte) -1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.Class<?> wildcardClass9 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration16.childNodes();
        java.lang.String str20 = xmlDeclaration16.nodeName();
        xmlDeclaration16.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node12.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.childNodes();
        boolean boolean23 = node20.hasAttr("hi!");
        org.jsoup.nodes.Node node24 = node20.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration17.parentNode();
        org.jsoup.nodes.Node node24 = xmlDeclaration17.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) (short) 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        org.jsoup.nodes.Document document14 = xmlDeclaration10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node6.after((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        int int12 = xmlDeclaration5.siblingIndex();
        java.lang.String str13 = xmlDeclaration5.name();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.String str12 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = node11.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        int int14 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        java.lang.Object obj11 = null;
        boolean boolean12 = node7.equals(obj11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node15 = xmlDeclaration14.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str13 = xmlDeclaration3.absUrl("<!>");
        boolean boolean15 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 10, outputSettings12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration17.traverse(nodeVisitor30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        org.jsoup.nodes.Node node14 = node12.parentNode();
        org.jsoup.nodes.Node node15 = node12.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        org.jsoup.nodes.Node node21 = xmlDeclaration18.nextSibling();
        xmlDeclaration18.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration18.childNodes();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration18.outerHtmlTail(appendable26, (int) (short) 0, outputSettings28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        xmlDeclaration3.outerHtmlTail(appendable5, 0, outputSettings7);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        xmlDeclaration12.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (int) ' ', outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.Class<?> wildcardClass4 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        int int36 = xmlDeclaration33.siblingIndex();
        java.lang.String str38 = xmlDeclaration33.absUrl("<!>");
        org.jsoup.nodes.Node node39 = xmlDeclaration33.parentNode();
        java.lang.String str40 = xmlDeclaration33.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration11.replaceWith((org.jsoup.nodes.Node) xmlDeclaration33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        int int15 = xmlDeclaration3.childNodeSize();
        java.lang.String str17 = xmlDeclaration3.absUrl("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (byte) 10, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        boolean boolean18 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.String str28 = xmlDeclaration23.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration23.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node19.before((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (byte) -1, outputSettings11);
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        java.lang.String str20 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration16.outerHtmlTail(appendable22, (int) '4', outputSettings24);
        java.lang.String str26 = xmlDeclaration16.nodeName();
        org.jsoup.nodes.Document document27 = xmlDeclaration16.ownerDocument();
        java.lang.String str29 = xmlDeclaration16.absUrl("#declaration");
        java.lang.String str31 = xmlDeclaration16.absUrl("hi!");
        java.lang.String str32 = xmlDeclaration16.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node11.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes15 = node14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("#declaration", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration12.outerHtmlTail(appendable22, (int) (byte) 0, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration27.childNodes();
        java.lang.String str31 = xmlDeclaration27.getWholeDeclaration();
        java.lang.String str32 = xmlDeclaration27.toString();
        boolean boolean33 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration27);
        org.jsoup.nodes.Node node34 = xmlDeclaration27.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration3.before(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        java.lang.String str21 = node20.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration25.outerHtmlTail(appendable30, 100, outputSettings32);
        boolean boolean34 = node20.equals((java.lang.Object) xmlDeclaration25);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration25.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        org.jsoup.nodes.Node node13 = xmlDeclaration10.clone();
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.Document document15 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean33 = xmlDeclaration28.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes34 = xmlDeclaration28.attributes();
        java.lang.String str35 = xmlDeclaration28.outerHtml();
        boolean boolean36 = xmlDeclaration3.equals((java.lang.Object) str35);
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable37, (int) ' ', outputSettings39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.parent();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration10.removeAttr("hi!");
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        org.jsoup.nodes.Node node20 = node18.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        int int27 = xmlDeclaration24.siblingIndex();
        java.lang.String str29 = xmlDeclaration24.absUrl("<!>");
        org.jsoup.nodes.Node node30 = xmlDeclaration24.parentNode();
        org.jsoup.nodes.Node node33 = xmlDeclaration24.attr("#declaration", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node20.before((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration17.outerHtmlHead(appendable30, (int) (short) 0, outputSettings32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("hi!", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        int int31 = xmlDeclaration28.siblingIndex();
        java.lang.String str32 = xmlDeclaration28.toString();
        org.jsoup.nodes.Node node33 = xmlDeclaration28.nextSibling();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        xmlDeclaration28.outerHtmlTail(appendable34, (int) '4', outputSettings36);
        int int38 = xmlDeclaration28.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        xmlDeclaration5.setBaseUri("");
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        java.lang.String str22 = node21.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration26.outerHtmlTail(appendable31, 100, outputSettings33);
        boolean boolean35 = node21.equals((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        java.lang.String str42 = xmlDeclaration39.outerHtml();
        org.jsoup.nodes.Node node43 = xmlDeclaration39.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = node43.childNodes();
        boolean boolean46 = node43.hasAttr("hi!");
        boolean boolean47 = xmlDeclaration26.equals((java.lang.Object) "hi!");
        java.lang.String str48 = xmlDeclaration26.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node13.setBaseUri("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.lang.String str10 = xmlDeclaration7.outerHtml();
        org.jsoup.nodes.Node node11 = xmlDeclaration7.clone();
        xmlDeclaration7.setBaseUri("<!>");
        xmlDeclaration7.setBaseUri("hi!");
        java.lang.String str16 = xmlDeclaration7.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.parent();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration10.removeAttr("hi!");
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node18.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.parent();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration10.removeAttr("hi!");
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        java.lang.String str20 = node18.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.parent();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.removeAttr("hi!");
        org.jsoup.nodes.Node node15 = node13.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration19.outerHtmlTail(appendable24, 100, outputSettings26);
        java.lang.String str28 = xmlDeclaration19.toString();
        xmlDeclaration19.setBaseUri("#declaration");
        boolean boolean31 = node15.hasSameValue((java.lang.Object) xmlDeclaration19);
        org.jsoup.nodes.Attributes attributes32 = node15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xmlTreeBuilder0.processStartTag("<?>", attributes32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = node5.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!hi!>" + "'", str6, "<!hi!>");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = node11.hasAttr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node14.attr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes12 = node11.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = document13.attr("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        int int11 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.removeAttr("<?>");
        org.jsoup.nodes.Attributes attributes14 = node13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("<!>", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "#declaration", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration3.outerHtmlTail(appendable16, (int) '4', outputSettings18);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        int int26 = xmlDeclaration23.siblingIndex();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.String str28 = xmlDeclaration23.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration23.childNodesCopy();
        org.jsoup.nodes.Document document30 = xmlDeclaration23.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parentNode();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodesCopy();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) nodeList23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node20 = xmlDeclaration13.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = node20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.Node node14 = node11.attr("hi!", "");
        java.lang.Class<?> wildcardClass15 = node11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.wrap("<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Document document24 = xmlDeclaration15.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        int int31 = xmlDeclaration28.siblingIndex();
        org.jsoup.nodes.Node node32 = xmlDeclaration28.nextSibling();
        java.lang.String str33 = xmlDeclaration28.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration28.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration38.childNodes();
        java.lang.String str42 = xmlDeclaration38.getWholeDeclaration();
        java.lang.String str43 = xmlDeclaration38.toString();
        boolean boolean44 = xmlDeclaration28.equals((java.lang.Object) xmlDeclaration38);
        org.jsoup.nodes.Attributes attributes45 = xmlDeclaration28.attributes();
        org.jsoup.nodes.Node node46 = xmlDeclaration28.previousSibling();
        org.jsoup.nodes.Node node47 = xmlDeclaration28.previousSibling();
        org.jsoup.nodes.Node node48 = xmlDeclaration28.clone();
        int int49 = xmlDeclaration28.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration15.replaceWith((org.jsoup.nodes.Node) xmlDeclaration28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        java.lang.String str33 = xmlDeclaration24.toString();
        xmlDeclaration24.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.clone();
        xmlDeclaration18.setBaseUri("<!>");
        boolean boolean26 = xmlDeclaration18.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        int int11 = xmlDeclaration5.childNodeSize();
        int int12 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.removeAttr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.name();
        boolean boolean16 = xmlDeclaration3.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        org.jsoup.nodes.Node node25 = xmlDeclaration20.parentNode();
        org.jsoup.nodes.Node node27 = xmlDeclaration20.removeAttr("<!>");
        xmlDeclaration20.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, 100, outputSettings13);
        java.lang.String str15 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.processStartTag("#declaration", attributes16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration16.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node10.after((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Node node30 = node13.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, (int) (short) -1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.Node node31 = node7.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        java.lang.String str34 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node35 = xmlDeclaration12.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        org.jsoup.nodes.Node node42 = xmlDeclaration39.nextSibling();
        xmlDeclaration39.setBaseUri("hi!");
        boolean boolean45 = node35.hasSameValue((java.lang.Object) xmlDeclaration39);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str51 = xmlDeclaration49.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlDeclaration49.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlDeclaration49.siblingNodes();
        org.jsoup.nodes.Attributes attributes54 = xmlDeclaration49.attributes();
        org.jsoup.nodes.Document document55 = xmlDeclaration49.ownerDocument();
        java.lang.Appendable appendable56 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = null;
        xmlDeclaration49.outerHtmlTail(appendable56, 0, outputSettings58);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration39.replaceWith((org.jsoup.nodes.Node) xmlDeclaration49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNull(document55);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        boolean boolean21 = node18.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = node18.clone();
        java.lang.String str23 = node22.baseUri();
        boolean boolean24 = xmlDeclaration3.hasSameValue((java.lang.Object) node22);
        java.lang.String str26 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        org.jsoup.nodes.Attributes attributes11 = node9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("#declaration", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        java.lang.String str34 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node35 = xmlDeclaration12.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        org.jsoup.nodes.Node node42 = xmlDeclaration39.nextSibling();
        xmlDeclaration39.setBaseUri("hi!");
        boolean boolean45 = node35.hasSameValue((java.lang.Object) xmlDeclaration39);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node50 = xmlDeclaration49.previousSibling();
        java.lang.Appendable appendable51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = null;
        xmlDeclaration49.outerHtmlTail(appendable51, 0, outputSettings53);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = xmlDeclaration39.after((org.jsoup.nodes.Node) xmlDeclaration49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodesCopy();
        org.jsoup.nodes.Document document21 = xmlDeclaration14.ownerDocument();
        java.lang.String str23 = xmlDeclaration14.absUrl("<!>");
        org.jsoup.nodes.Document document24 = xmlDeclaration14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.attr("<!>");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, 100, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.siblingNodes();
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration15.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration15.equals((java.lang.Object) xmlDeclaration26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.removeAttr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node7.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.lang.String str29 = xmlDeclaration26.outerHtml();
        boolean boolean31 = xmlDeclaration26.hasAttr("<!>");
        org.jsoup.nodes.Node node33 = xmlDeclaration26.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.replaceWith(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.lang.String str7 = xmlDeclaration5.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        boolean boolean16 = xmlDeclaration5.equals((java.lang.Object) node15);
        org.jsoup.nodes.Attributes attributes17 = node15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.processStartTag("<?>", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        java.lang.Class<?> wildcardClass4 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable7, (int) 'a', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str8 = xmlDeclaration3.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = node13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        int int17 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration11.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration11.attributes();
        java.lang.String str22 = xmlDeclaration11.toString();
        java.lang.String str23 = xmlDeclaration11.toString();
        org.jsoup.nodes.Node node25 = xmlDeclaration11.wrap("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration11.childNodes();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration11.outerHtmlTail(appendable19, (int) (short) 0, outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.String str22 = xmlDeclaration3.toString();
        java.lang.String str23 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        org.jsoup.nodes.Node node30 = xmlDeclaration27.nextSibling();
        xmlDeclaration27.setBaseUri("<!>");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration27.outerHtmlTail(appendable33, 100, outputSettings35);
        boolean boolean38 = xmlDeclaration27.hasAttr("#declaration");
        int int39 = xmlDeclaration27.childNodeSize();
        java.lang.String str41 = xmlDeclaration27.absUrl("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (short) 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.lang.String str22 = xmlDeclaration19.outerHtml();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodes();
        org.jsoup.nodes.Attributes attributes25 = node23.attributes();
        java.lang.String str26 = node23.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = document8.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("");
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        boolean boolean18 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        int int24 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        org.jsoup.nodes.Node node14 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Node node25 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        boolean boolean7 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        xmlDeclaration11.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        int int11 = xmlDeclaration5.childNodeSize();
        int int12 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("<!>", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Node node29 = xmlDeclaration26.nextSibling();
        xmlDeclaration26.setBaseUri("<!>");
        java.lang.String str33 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Document document34 = xmlDeclaration26.ownerDocument();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) document34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = document34.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document25 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node26 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node28.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        java.lang.String str17 = xmlDeclaration13.toString();
        org.jsoup.nodes.Node node18 = xmlDeclaration13.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration13.outerHtmlTail(appendable19, (int) '4', outputSettings21);
        java.lang.String str23 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Document document24 = xmlDeclaration13.ownerDocument();
        java.lang.String str26 = xmlDeclaration13.absUrl("#declaration");
        java.lang.String str28 = xmlDeclaration13.absUrl("hi!");
        java.lang.String str29 = xmlDeclaration13.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes13 = node12.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node22.attr("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str33 = xmlDeclaration31.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration31.childNodes();
        java.lang.String str35 = xmlDeclaration31.getWholeDeclaration();
        java.lang.String str36 = xmlDeclaration31.toString();
        boolean boolean37 = xmlDeclaration21.equals((java.lang.Object) xmlDeclaration31);
        org.jsoup.nodes.Attributes attributes38 = xmlDeclaration21.attributes();
        boolean boolean39 = node17.equals((java.lang.Object) xmlDeclaration21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node9.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        int int15 = xmlDeclaration3.siblingIndex();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass17 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        boolean boolean17 = xmlDeclaration12.hasAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = node8.equals((java.lang.Object) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration8.childNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration8.nextSibling();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration8.outerHtmlTail(appendable13, 100, outputSettings15);
        java.lang.String str17 = xmlDeclaration8.toString();
        int int18 = xmlDeclaration8.siblingIndex();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) int18);
        int int20 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable21, (int) (byte) 10, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, (int) (byte) 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (-1), outputSettings14);
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        java.lang.String str17 = xmlDeclaration3.name();
        java.lang.String str18 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable19, (int) (short) 100, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration5.parent();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xmlTreeBuilder0.processStartTag("#declaration", attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration17.outerHtmlTail(appendable23, 100, outputSettings25);
        boolean boolean28 = xmlDeclaration17.hasAttr("#declaration");
        java.lang.String str29 = xmlDeclaration17.toString();
        org.jsoup.nodes.Node node30 = xmlDeclaration17.nextSibling();
        org.jsoup.nodes.Node node32 = xmlDeclaration17.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration17.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration15.outerHtmlTail(appendable21, 100, outputSettings23);
        boolean boolean26 = xmlDeclaration15.hasAttr("#declaration");
        java.lang.String str27 = xmlDeclaration15.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str33 = xmlDeclaration31.attr("");
        int int34 = xmlDeclaration31.siblingIndex();
        org.jsoup.nodes.Document document35 = xmlDeclaration31.ownerDocument();
        boolean boolean36 = xmlDeclaration15.equals((java.lang.Object) document35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node7.before((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        org.jsoup.nodes.Node node23 = xmlDeclaration20.nextSibling();
        xmlDeclaration20.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration20.childNodesCopy();
        org.jsoup.nodes.Node node28 = xmlDeclaration20.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node13.after(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass13 = attributes12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

