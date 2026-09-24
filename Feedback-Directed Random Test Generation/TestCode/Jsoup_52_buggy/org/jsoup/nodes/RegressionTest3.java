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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) 'a', outputSettings15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<?hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str12 = xmlDeclaration3.absUrl("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        org.jsoup.nodes.Node node14 = node12.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.baseUri();
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        org.jsoup.nodes.Node node23 = node22.parent();
        org.jsoup.nodes.Node node24 = node22.clone();
        org.jsoup.nodes.Node node25 = node22.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration14.siblingNodes();
        int int19 = xmlDeclaration14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration3.attr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration13.removeAttr("<?<?>>");
        java.lang.String str22 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str23 = xmlDeclaration13.outerHtml();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
            boolean boolean23 = xmlTreeBuilder0.processStartTag("<?>", attributes22);
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "#declaration");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<!<!>>");
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (byte) -1, outputSettings13);
        xmlDeclaration3.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.wrap("<!>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str13 = xmlDeclaration3.absUrl("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        xmlDeclaration3.setBaseUri("hi!");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str11 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.clone();
        org.jsoup.nodes.Node node24 = node23.clone();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        // The following exception was thrown during execution in test generation
        try {
            node24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration13.outerHtmlTail(appendable21, (int) ' ', outputSettings23);
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        int int12 = node11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        int int4 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        java.lang.String str15 = node12.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.unwrap();
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
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration3.name();
        java.lang.String str21 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str22 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.wrap("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str15 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration19.outerHtmlTail(appendable24, 100, outputSettings26);
        java.lang.String str28 = xmlDeclaration19.toString();
        xmlDeclaration19.setBaseUri("#declaration");
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration19.outerHtmlTail(appendable31, (int) ' ', outputSettings33);
        org.jsoup.nodes.Node node35 = xmlDeclaration19.parent();
        java.lang.String str36 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node37 = xmlDeclaration19.parent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration20.siblingNodes();
        org.jsoup.nodes.Attributes attributes25 = xmlDeclaration20.attributes();
        java.lang.String str27 = xmlDeclaration20.attr("");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.jsoup.nodes.Document document20 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document20.wrap("<?<?>>");
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
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, 0, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", false);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        org.jsoup.nodes.Node node11 = xmlDeclaration8.nextSibling();
        xmlDeclaration8.setBaseUri("<!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration8.outerHtmlTail(appendable14, 100, outputSettings16);
        boolean boolean19 = xmlDeclaration8.hasAttr("#declaration");
        java.lang.String str20 = xmlDeclaration8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration8.childNodes();
        java.lang.String str22 = xmlDeclaration8.baseUri();
        java.lang.String str23 = xmlDeclaration8.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!hi!>" + "'", str4, "<!hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        java.lang.String str9 = node5.attr("hi!");
        org.jsoup.nodes.Node node11 = node5.removeAttr("<?>");
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("hi!", "");
        java.lang.String str16 = xmlDeclaration3.absUrl("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.lang.String str25 = xmlDeclaration3.toString();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable26, (int) ' ', outputSettings28);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        int int14 = node12.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.baseUri();
        xmlDeclaration3.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node5.before((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("#declaration", "<!>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        int int11 = xmlDeclaration5.childNodeSize();
        java.lang.String str13 = xmlDeclaration5.absUrl("hi!");
        java.lang.String str15 = xmlDeclaration5.absUrl("<!>");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration5.outerHtmlTail(appendable16, (int) (byte) 1, outputSettings18);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xmlTreeBuilder0.processStartTag("<!<!>>", attributes20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document5 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = document5.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        int int14 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.lang.String str12 = node11.baseUri();
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
        int int33 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration16.childNodes();
        java.lang.String str35 = xmlDeclaration16.toString();
        boolean boolean36 = node11.equals((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", false);
        java.lang.String str41 = xmlDeclaration40.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration16.after((org.jsoup.nodes.Node) xmlDeclaration40);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!hi!>" + "'", str41, "<!hi!>");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        java.lang.String str11 = xmlDeclaration8.outerHtml();
        java.lang.String str12 = xmlDeclaration8.getWholeDeclaration();
        org.jsoup.nodes.Node node13 = xmlDeclaration8.clone();
        org.jsoup.nodes.Node node14 = node13.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node4.after(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?<?hi!>>" + "'", str4, "<?<?hi!>>");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        boolean boolean24 = xmlDeclaration16.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<!hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", false);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.wrap("<?hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?hi!>" + "'", str4, "<?hi!>");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!>");
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node11.removeAttr("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!<?>>", true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.String str25 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node28 = xmlDeclaration3.attr("<?<?>>", "<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        java.lang.String str35 = xmlDeclaration32.outerHtml();
        org.jsoup.nodes.Node node36 = xmlDeclaration32.clone();
        java.lang.String str37 = node36.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration41.childNodes();
        org.jsoup.nodes.Node node45 = xmlDeclaration41.nextSibling();
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        xmlDeclaration41.outerHtmlTail(appendable46, 100, outputSettings48);
        boolean boolean50 = node36.equals((java.lang.Object) xmlDeclaration41);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        java.lang.String str57 = xmlDeclaration54.outerHtml();
        org.jsoup.nodes.Node node58 = xmlDeclaration54.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = node58.childNodes();
        boolean boolean61 = node58.hasAttr("hi!");
        boolean boolean62 = xmlDeclaration41.equals((java.lang.Object) "hi!");
        java.lang.String str63 = xmlDeclaration41.toString();
        org.jsoup.nodes.Node node64 = xmlDeclaration41.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration68 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str70 = xmlDeclaration68.attr("");
        org.jsoup.nodes.Node node71 = xmlDeclaration68.nextSibling();
        xmlDeclaration68.setBaseUri("hi!");
        boolean boolean74 = node64.hasSameValue((java.lang.Object) xmlDeclaration68);
        org.jsoup.nodes.Node node76 = xmlDeclaration68.removeAttr("<?<?>>");
        java.lang.String str78 = xmlDeclaration68.attr("#declaration");
        boolean boolean80 = xmlDeclaration68.hasAttr("<!>");
        boolean boolean81 = node28.hasSameValue((java.lang.Object) xmlDeclaration68);
        java.lang.String str82 = xmlDeclaration68.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!>" + "'", str63, "<!>");
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<!>" + "'", str82, "<!>");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        int int18 = xmlDeclaration12.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration12.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration14.outerHtmlTail(appendable20, 100, outputSettings22);
        boolean boolean25 = xmlDeclaration14.hasAttr("#declaration");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration14.outerHtmlTail(appendable26, (int) ' ', outputSettings28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.parentNode();
        org.jsoup.nodes.Node node8 = node6.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        boolean boolean16 = xmlDeclaration11.hasAttr("<!>");
        org.jsoup.nodes.Node node18 = xmlDeclaration11.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration11.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList19);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        org.jsoup.nodes.Node node27 = xmlDeclaration24.nextSibling();
        xmlDeclaration24.setBaseUri("<!>");
        int int30 = xmlDeclaration24.siblingIndex();
        org.jsoup.nodes.Node node32 = xmlDeclaration24.removeAttr("<?>");
        java.lang.String str33 = xmlDeclaration24.name();
        org.jsoup.nodes.Node node34 = xmlDeclaration24.clone();
        boolean boolean35 = xmlDeclaration3.hasSameValue((java.lang.Object) node34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node34.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        org.jsoup.nodes.Node node13 = xmlDeclaration10.clone();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration10.outerHtmlTail(appendable14, 10, outputSettings16);
        java.lang.String str18 = xmlDeclaration10.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!hi!>" + "'", str6, "<!hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.String str18 = xmlDeclaration13.toString();
        java.lang.String str19 = xmlDeclaration13.toString();
        java.lang.String str20 = xmlDeclaration13.baseUri();
        java.lang.String str21 = xmlDeclaration13.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "#declaration");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "hi!", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        org.jsoup.nodes.Node node24 = xmlDeclaration21.clone();
        org.jsoup.nodes.Document document25 = node24.ownerDocument();
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) document25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.String str25 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document26 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document26.clone();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.nextSibling();
        xmlDeclaration13.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.Node node21 = xmlDeclaration13.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.String str30 = xmlDeclaration25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.siblingNodes();
        boolean boolean32 = node21.hasSameValue((java.lang.Object) nodeList31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration3.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.lang.String str26 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str27 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str33 = xmlDeclaration31.attr("");
        int int34 = xmlDeclaration31.siblingIndex();
        org.jsoup.nodes.Node node35 = xmlDeclaration31.nextSibling();
        java.lang.String str36 = xmlDeclaration31.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration31.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration41.childNodes();
        java.lang.String str45 = xmlDeclaration41.getWholeDeclaration();
        java.lang.String str46 = xmlDeclaration41.toString();
        boolean boolean47 = xmlDeclaration31.equals((java.lang.Object) xmlDeclaration41);
        org.jsoup.nodes.Node node48 = xmlDeclaration31.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = xmlDeclaration3.before(node48);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration17.outerHtmlTail(appendable23, 100, outputSettings25);
        boolean boolean28 = xmlDeclaration17.hasAttr("#declaration");
        int int29 = xmlDeclaration17.childNodeSize();
        org.jsoup.nodes.Node node30 = xmlDeclaration17.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.after(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node22.hasAttr("<!<?>>");
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        org.jsoup.nodes.Document document20 = xmlDeclaration3.ownerDocument();
        java.lang.String str22 = xmlDeclaration3.attr("#declaration");
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("<!hi!>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = node15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        int int10 = xmlDeclaration5.siblingIndex();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        int int12 = xmlDeclaration5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.processStartTag("<?<?hi!>>", attributes16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodesCopy();
        int int13 = node7.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        int int23 = xmlDeclaration17.childNodeSize();
        org.jsoup.nodes.Node node24 = xmlDeclaration17.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node7.before((org.jsoup.nodes.Node) xmlDeclaration17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes14 = node13.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("<?>");
        node9.setBaseUri("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node17.hasAttr("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration23.baseUri();
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration23);
        java.lang.String str30 = xmlDeclaration3.attr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration34.childNodes();
        java.lang.String str38 = xmlDeclaration34.nodeName();
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration34.outerHtmlTail(appendable39, (int) (short) 100, outputSettings41);
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration34.outerHtmlTail(appendable43, (int) '4', outputSettings45);
        org.jsoup.nodes.Node node48 = xmlDeclaration34.removeAttr("<!<?>>");
        boolean boolean50 = xmlDeclaration34.hasAttr("<!hi!>");
        boolean boolean51 = xmlDeclaration3.hasSameValue((java.lang.Object) boolean50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = xmlDeclaration3.attr("", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<?>" + "'", str26, "<?>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.parent();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.removeAttr("hi!");
        org.jsoup.nodes.Node node15 = node13.removeAttr("#declaration");
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.processStartTag("", attributes16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
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
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration3.outerHtmlTail(appendable24, (int) (byte) 0, outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes8 = document7.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        int int7 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        int int17 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration11.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration11.attributes();
        java.lang.String str22 = xmlDeclaration11.toString();
        java.lang.String str23 = xmlDeclaration11.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration5.outerHtmlTail(appendable9, 10, outputSettings11);
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.siblingNodes();
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
        int int28 = xmlDeclaration3.childNodeSize();
        java.lang.String str30 = xmlDeclaration3.absUrl("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.lang.String str37 = xmlDeclaration34.name();
        java.lang.String str38 = xmlDeclaration34.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Class<?> wildcardClass11 = node10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?#declaration>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        boolean boolean18 = xmlDeclaration3.equals((java.lang.Object) int17);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.childNodes();
        java.lang.String str20 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.lang.String str28 = xmlDeclaration24.getWholeDeclaration();
        int int29 = xmlDeclaration24.siblingIndex();
        java.lang.String str30 = xmlDeclaration24.getWholeDeclaration();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration24.outerHtmlTail(appendable31, (int) (byte) 1, outputSettings33);
        java.lang.String str36 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration24.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        int int44 = xmlDeclaration41.siblingIndex();
        java.lang.String str46 = xmlDeclaration41.absUrl("<!>");
        org.jsoup.nodes.Document document47 = xmlDeclaration41.ownerDocument();
        boolean boolean48 = xmlDeclaration24.hasSameValue((java.lang.Object) xmlDeclaration41);
        boolean boolean50 = xmlDeclaration24.hasAttr("<!<?>>");
        boolean boolean52 = xmlDeclaration24.hasAttr("#declaration");
        org.jsoup.nodes.Node node53 = xmlDeclaration24.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        boolean boolean15 = xmlDeclaration3.hasSameValue((java.lang.Object) str14);
        boolean boolean17 = xmlDeclaration3.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.siblingNodes();
        xmlDeclaration3.setBaseUri("<!<!>>");
        org.jsoup.nodes.Node node24 = xmlDeclaration3.removeAttr("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node24.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.removeAttr("<!<!>>");
        java.lang.String str19 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?<?>>" + "'", str4, "<?<?>>");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        java.lang.String str47 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration37.attributes();
        boolean boolean49 = node29.hasSameValue((java.lang.Object) xmlDeclaration37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = xmlDeclaration37.before("<!<?>>");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = document10.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        boolean boolean21 = xmlDeclaration16.hasAttr("<!>");
        boolean boolean22 = node12.hasSameValue((java.lang.Object) "<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration36.childNodes();
        java.lang.String str40 = xmlDeclaration36.getWholeDeclaration();
        java.lang.String str41 = xmlDeclaration36.toString();
        boolean boolean42 = xmlDeclaration26.equals((java.lang.Object) xmlDeclaration36);
        org.jsoup.nodes.Attributes attributes43 = xmlDeclaration26.attributes();
        java.lang.String str44 = xmlDeclaration26.name();
        java.lang.String str46 = xmlDeclaration26.attr("<!<?>>");
        boolean boolean47 = node12.hasSameValue((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration26.replaceWith(node48);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("<?hi!>");
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.lang.String str28 = xmlDeclaration24.getWholeDeclaration();
        int int29 = xmlDeclaration24.siblingIndex();
        java.lang.String str30 = xmlDeclaration24.getWholeDeclaration();
        org.jsoup.nodes.Node node31 = xmlDeclaration24.clone();
        java.lang.String str33 = node31.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.lang.String str40 = xmlDeclaration37.outerHtml();
        java.lang.String str41 = xmlDeclaration37.getWholeDeclaration();
        int int42 = xmlDeclaration37.siblingIndex();
        java.lang.String str43 = xmlDeclaration37.getWholeDeclaration();
        int int44 = xmlDeclaration37.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration37.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration37.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration37.siblingNodes();
        boolean boolean48 = node31.hasSameValue((java.lang.Object) xmlDeclaration37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration37);
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
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration14.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean23 = node9.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodes();
        boolean boolean34 = node31.hasAttr("hi!");
        boolean boolean35 = xmlDeclaration14.equals((java.lang.Object) "hi!");
        java.lang.String str36 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node37 = xmlDeclaration14.clone();
        org.jsoup.nodes.Attributes attributes38 = node37.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = xmlTreeBuilder0.processStartTag("<?<?>>", attributes38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?<?hi!>>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        int int21 = node20.childNodeSize();
        int int22 = node20.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node20.before("<!<!>>");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
            org.jsoup.nodes.Node node13 = node12.previousSibling();
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        java.lang.String str17 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = node18.attr("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration24.nextSibling();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node37 = xmlDeclaration3.attr("<?hi!>", "");
        java.lang.String str38 = node37.baseUri();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration13.outerHtmlTail(appendable18, (-1), outputSettings20);
        org.jsoup.nodes.Document document22 = xmlDeclaration13.ownerDocument();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Node node15 = node12.attr("<!hi!>", "<!#declaration>");
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
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration3.outerHtmlTail(appendable20, (int) (byte) 100, outputSettings22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?#declaration>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        java.lang.String str9 = node5.attr("hi!");
        java.lang.Class<?> wildcardClass10 = node5.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.name();
        int int13 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, (int) (byte) 100, outputSettings18);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.jsoup.nodes.Node node25 = xmlDeclaration15.clone();
        java.lang.String str26 = node25.outerHtml();
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass8 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node24.clone();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration17.outerHtmlTail(appendable23, 100, outputSettings25);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) appendable23);
        org.jsoup.nodes.Node node30 = xmlDeclaration3.attr("hi!", "");
        org.jsoup.nodes.Node node32 = node30.removeAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.siblingNodes();
        java.lang.Class<?> wildcardClass34 = nodeList33.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        org.jsoup.nodes.Node node29 = xmlDeclaration20.nextSibling();
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        java.lang.Class<?> wildcardClass31 = xmlDeclaration20.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        int int12 = node10.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.siblingNodes();
        boolean boolean21 = node10.equals((java.lang.Object) nodeList20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (short) 1, outputSettings14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, (int) 'a', outputSettings18);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration32.childNodes();
        java.lang.String str36 = xmlDeclaration32.nodeName();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration32.outerHtmlTail(appendable37, (int) (short) 100, outputSettings39);
        boolean boolean41 = xmlDeclaration3.equals((java.lang.Object) outputSettings39);
        java.lang.Class<?> wildcardClass42 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Node node16 = node13.removeAttr("<!>");
        org.jsoup.nodes.Node node19 = node13.attr("<!<!>>", "<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node13.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
            org.jsoup.nodes.Node node16 = document14.wrap("hi!");
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration5.parent();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xmlTreeBuilder0.processStartTag("<!<!>>", attributes9);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration17.siblingNodes();
        boolean boolean25 = node13.hasSameValue((java.lang.Object) nodeList24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) -1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = node19.attr("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.parent();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node26 = xmlDeclaration18.removeAttr("hi!");
        org.jsoup.nodes.Node node28 = node26.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration32.childNodes();
        org.jsoup.nodes.Node node36 = xmlDeclaration32.nextSibling();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration32.outerHtmlTail(appendable37, 100, outputSettings39);
        java.lang.String str41 = xmlDeclaration32.toString();
        xmlDeclaration32.setBaseUri("#declaration");
        boolean boolean44 = node28.hasSameValue((java.lang.Object) xmlDeclaration32);
        java.lang.String str45 = xmlDeclaration32.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration32.childNodesCopy();
        boolean boolean47 = xmlDeclaration3.equals((java.lang.Object) nodeList46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        boolean boolean7 = xmlDeclaration3.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node16.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.jsoup.nodes.Attributes attributes46 = xmlDeclaration39.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = xmlDeclaration39.traverse(nodeVisitor47);
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
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        java.lang.String str9 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration14.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean23 = node9.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodes();
        boolean boolean34 = node31.hasAttr("hi!");
        boolean boolean35 = xmlDeclaration14.equals((java.lang.Object) "hi!");
        java.lang.String str36 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node37 = xmlDeclaration14.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        org.jsoup.nodes.Node node44 = xmlDeclaration41.nextSibling();
        xmlDeclaration41.setBaseUri("hi!");
        boolean boolean47 = node37.hasSameValue((java.lang.Object) xmlDeclaration41);
        org.jsoup.nodes.Node node48 = node37.parent();
        org.jsoup.nodes.Attributes attributes49 = node37.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = xmlTreeBuilder0.processStartTag("<?hi!>", attributes49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(attributes49);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        int int19 = xmlDeclaration3.siblingIndex();
        java.lang.String str20 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node19 = xmlDeclaration16.attr("#declaration", "<!>");
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) node19);
        org.jsoup.nodes.Node node21 = node19.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = node21.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.siblingNodes();
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "", false);
        java.lang.String str4 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        org.jsoup.nodes.Node node13 = xmlDeclaration10.nextSibling();
        xmlDeclaration10.setBaseUri("<!>");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration10.outerHtmlTail(appendable16, 100, outputSettings18);
        java.lang.String str20 = xmlDeclaration10.outerHtml();
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration10.attributes();
        org.jsoup.nodes.Node node22 = xmlDeclaration10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) '4', outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        boolean boolean14 = node11.hasAttr("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        java.lang.String str14 = xmlDeclaration3.outerHtml();
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?hi!>", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        java.lang.String str9 = node7.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node7.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node15 = node12.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node12.clone();
        org.jsoup.nodes.Attributes attributes17 = node12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?<?>>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.wrap("<!<!>>");
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        java.lang.String str30 = xmlDeclaration11.name();
        org.jsoup.nodes.Document document31 = xmlDeclaration11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = document31.attr("<!hi!>", "<?<?hi!>>");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node14.after((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration13.outerHtmlTail(appendable18, (-1), outputSettings20);
        org.jsoup.nodes.Document document22 = xmlDeclaration13.ownerDocument();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<?>");
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        int int15 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.before("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 0, outputSettings9);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable11, (int) (short) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str13 = node11.attr("");
        boolean boolean15 = node11.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node11.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration15.clone();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.Node node11 = node8.removeAttr("<!>");
        org.jsoup.nodes.Attributes attributes12 = node8.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xmlTreeBuilder0.processStartTag("<?<?>>", attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node21 = node20.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.jsoup.nodes.Node node30 = xmlDeclaration3.attr("<!>", "<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean36 = xmlDeclaration34.equals((java.lang.Object) (byte) 10);
        boolean boolean38 = xmlDeclaration34.hasAttr("#declaration");
        java.lang.String str39 = xmlDeclaration34.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration34);
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
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<?#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.Class<?> wildcardClass14 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        org.jsoup.nodes.Document document23 = xmlDeclaration18.ownerDocument();
        xmlDeclaration18.setBaseUri("hi!");
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration18);
        xmlDeclaration18.setBaseUri("<!>");
        xmlDeclaration18.setBaseUri("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.lang.String str26 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node27 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str23 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.parentNode();
        org.jsoup.nodes.Node node10 = node7.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        java.lang.String str18 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.nextSibling();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration14.outerHtmlTail(appendable20, (int) '4', outputSettings22);
        java.lang.String str24 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Document document25 = xmlDeclaration14.ownerDocument();
        java.lang.String str26 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str27 = xmlDeclaration14.name();
        boolean boolean28 = node7.hasSameValue((java.lang.Object) str27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 0, outputSettings12);
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document17 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        org.jsoup.nodes.Node node24 = xmlDeclaration21.nextSibling();
        xmlDeclaration21.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.childNodesCopy();
        org.jsoup.nodes.Node node29 = xmlDeclaration21.clone();
        org.jsoup.nodes.Node node30 = node29.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node30.childNodesCopy();
        org.jsoup.nodes.Node node33 = node30.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = document17.after(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.jsoup.nodes.Attributes attributes30 = node13.attributes();
        org.jsoup.nodes.Node node32 = node13.removeAttr("<?<?>>");
        java.lang.String str34 = node13.attr("<!>");
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
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.lang.String str21 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str25 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        boolean boolean26 = xmlDeclaration3.hasAttr("");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration3.outerHtmlTail(appendable27, (int) (byte) 0, outputSettings29);
        org.jsoup.nodes.Node node33 = xmlDeclaration3.attr("hi!", "<?<?>>");
        java.lang.String str34 = node33.baseUri();
        org.jsoup.nodes.Document document35 = node33.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        int int9 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str31 = xmlDeclaration12.getWholeDeclaration();
        org.jsoup.nodes.Document document32 = xmlDeclaration12.ownerDocument();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable33, (int) (byte) 1, outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        int int26 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean32 = xmlDeclaration30.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node33 = xmlDeclaration30.nextSibling();
        org.jsoup.nodes.Attributes attributes34 = xmlDeclaration30.attributes();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        xmlDeclaration30.outerHtmlTail(appendable35, 0, outputSettings37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration12.after((org.jsoup.nodes.Node) xmlDeclaration30);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.jsoup.nodes.Node node23 = xmlDeclaration12.parentNode();
        java.lang.String str25 = xmlDeclaration12.absUrl("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.String str21 = xmlDeclaration16.absUrl("<!>");
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        org.jsoup.nodes.Node node23 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node24 = xmlDeclaration16.clone();
        org.jsoup.nodes.Attributes attributes25 = xmlDeclaration16.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration16);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) -1, outputSettings25);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration3.outerHtmlTail(appendable27, (int) (byte) 10, outputSettings29);
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.traverse(nodeVisitor31);
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
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        int int13 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node21 = node20.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.jsoup.nodes.Node node31 = node7.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node33 = node31.removeAttr("<!>");
        java.lang.String str34 = node33.baseUri();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = document13.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) '4', outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.String str17 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "hi!");
        boolean boolean19 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<?<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.after("<?<?hi!>>");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration3.outerHtmlTail(appendable17, (int) (short) 0, outputSettings19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.lang.String str22 = xmlDeclaration19.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration19.childNodes();
        int int24 = xmlDeclaration19.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.lang.String str31 = xmlDeclaration28.outerHtml();
        org.jsoup.nodes.Node node32 = xmlDeclaration28.clone();
        boolean boolean33 = xmlDeclaration19.equals((java.lang.Object) xmlDeclaration28);
        int int34 = xmlDeclaration28.siblingIndex();
        boolean boolean35 = node15.hasSameValue((java.lang.Object) xmlDeclaration28);
        java.lang.String str36 = xmlDeclaration28.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodes();
        java.lang.String str18 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<?>>" + "'", str4, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.toString();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Node node22 = xmlDeclaration14.wrap("<!>");
        java.lang.String str23 = xmlDeclaration14.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
            xmlDeclaration3.outerHtmlHead(appendable21, (int) (byte) -1, outputSettings23);
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
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!<?>>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.String str9 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.clone();
        java.lang.String str32 = node31.baseUri();
        boolean boolean33 = xmlDeclaration19.equals((java.lang.Object) str32);
        org.jsoup.nodes.Node node36 = xmlDeclaration19.attr("hi!", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            document15.replaceWith((org.jsoup.nodes.Node) xmlDeclaration19);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node12.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("#declaration");
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", false);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?hi!>" + "'", str4, "<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?hi!>" + "'", str5, "<?hi!>");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        java.lang.String str25 = xmlDeclaration20.absUrl("<!>");
        org.jsoup.nodes.Document document26 = xmlDeclaration20.ownerDocument();
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration20);
        boolean boolean29 = xmlDeclaration3.hasAttr("<!<?>>");
        boolean boolean31 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str32 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = xmlDeclaration3.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        boolean boolean21 = xmlDeclaration16.hasAttr("<!>");
        boolean boolean22 = node12.hasSameValue((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document23 = node12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.attr("<!hi!>", "<!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.attr("hi!");
        java.lang.String str19 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = node20.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
            org.jsoup.nodes.Node node13 = node10.unwrap();
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
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str13 = xmlDeclaration3.absUrl("<!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) (byte) 1, outputSettings16);
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        int int17 = node13.siblingIndex();
        org.jsoup.nodes.Node node18 = node13.clone();
        node18.setBaseUri("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        java.lang.String str20 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration16.outerHtmlTail(appendable22, (int) '4', outputSettings24);
        int int26 = xmlDeclaration16.siblingIndex();
        xmlDeclaration16.setBaseUri("hi!");
        java.lang.String str29 = xmlDeclaration16.toString();
        java.lang.String str30 = xmlDeclaration16.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration24.nextSibling();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node37 = xmlDeclaration3.attr("<?hi!>", "");
        java.lang.String str38 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = xmlDeclaration3.before("hi!");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        boolean boolean17 = xmlDeclaration3.hasAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        java.lang.String str33 = xmlDeclaration30.outerHtml();
        boolean boolean35 = xmlDeclaration30.hasAttr("<!>");
        org.jsoup.nodes.Node node37 = xmlDeclaration30.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = xmlDeclaration3.before(node37);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        java.lang.String str47 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration37.attributes();
        boolean boolean49 = node29.hasSameValue((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Attributes attributes50 = node29.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        java.lang.String str57 = xmlDeclaration54.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration54.childNodes();
        java.lang.String str59 = xmlDeclaration54.name();
        org.jsoup.nodes.Node node60 = xmlDeclaration54.parent();
        xmlDeclaration54.setBaseUri("<?hi!>");
        boolean boolean63 = node29.equals((java.lang.Object) "<?hi!>");
        java.lang.String str65 = node29.absUrl("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node67 = node29.traverse(nodeVisitor66);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.attr("#declaration", "<!#declaration>");
        java.lang.String str8 = xmlDeclaration3.toString();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?hi!>" + "'", str8, "<?hi!>");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        xmlDeclaration11.setBaseUri("");
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration11.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration11.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        java.lang.String str29 = xmlDeclaration25.toString();
        org.jsoup.nodes.Node node30 = xmlDeclaration25.nextSibling();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration25.outerHtmlTail(appendable31, (int) '4', outputSettings33);
        java.lang.String str35 = xmlDeclaration25.nodeName();
        org.jsoup.nodes.Document document36 = xmlDeclaration25.ownerDocument();
        java.lang.String str38 = xmlDeclaration25.absUrl("#declaration");
        java.lang.String str40 = xmlDeclaration25.absUrl("hi!");
        java.lang.String str41 = xmlDeclaration25.name();
        java.lang.String str43 = xmlDeclaration25.absUrl("<!hi!>");
        boolean boolean44 = xmlDeclaration11.hasSameValue((java.lang.Object) str43);
        boolean boolean45 = xmlDeclaration3.equals((java.lang.Object) str43);
        org.jsoup.nodes.Node node46 = xmlDeclaration3.clone();
        java.lang.String str47 = node46.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node46.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        java.lang.String str25 = xmlDeclaration3.toString();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration3.outerHtmlTail(appendable26, 100, outputSettings28);
        java.lang.String str30 = xmlDeclaration3.baseUri();
        boolean boolean32 = xmlDeclaration3.hasAttr("<?hi!>");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        java.lang.String str34 = xmlDeclaration12.getWholeDeclaration();
        int int35 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node36 = xmlDeclaration12.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node42 = xmlDeclaration40.removeAttr("#declaration");
        java.lang.String str43 = xmlDeclaration40.baseUri();
        java.lang.String str44 = xmlDeclaration40.outerHtml();
        org.jsoup.nodes.Node node46 = xmlDeclaration40.wrap("<?>");
        java.lang.String str48 = xmlDeclaration40.absUrl("<?>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.replaceWith((org.jsoup.nodes.Node) xmlDeclaration40);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration13.parentNode();
        org.jsoup.nodes.Node node20 = xmlDeclaration13.removeAttr("<!>");
        org.jsoup.nodes.Node node21 = xmlDeclaration13.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        boolean boolean27 = xmlDeclaration13.hasSameValue((java.lang.Object) "<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        int int21 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration15.attr("<!>", "<!>");
        int int25 = node24.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        boolean boolean13 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        java.lang.String str21 = xmlDeclaration17.getWholeDeclaration();
        int int22 = xmlDeclaration17.siblingIndex();
        java.lang.String str23 = xmlDeclaration17.getWholeDeclaration();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration17.outerHtmlTail(appendable24, (int) (byte) 1, outputSettings26);
        java.lang.String str29 = xmlDeclaration17.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        org.jsoup.nodes.Node node36 = xmlDeclaration33.nextSibling();
        xmlDeclaration33.setBaseUri("<!>");
        int int39 = xmlDeclaration33.siblingIndex();
        org.jsoup.nodes.Node node42 = xmlDeclaration33.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes43 = xmlDeclaration33.attributes();
        java.lang.String str44 = xmlDeclaration33.toString();
        java.lang.String str45 = xmlDeclaration33.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration33.childNodes();
        boolean boolean47 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!>" + "'", str45, "<!>");
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 0, outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration5.parent();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = xmlTreeBuilder0.processStartTag("<?<?hi!>>", attributes9);
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        int int9 = xmlDeclaration3.childNodeSize();
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
        org.jsoup.nodes.Node node31 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node32 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node33 = xmlDeclaration13.clone();
        org.jsoup.nodes.Node node34 = xmlDeclaration13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str11 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<?>");
        int int15 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node16.setBaseUri("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        int int17 = xmlDeclaration11.childNodeSize();
        int int18 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration11.childNodesCopy();
        boolean boolean21 = xmlDeclaration3.equals((java.lang.Object) nodeList20);
        java.lang.String str23 = xmlDeclaration3.absUrl("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.before("<?>");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass16 = attributes15.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node14 = node10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("<!<?>>");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node9.attr("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration17.outerHtmlTail(appendable29, (int) (short) 100, outputSettings31);
        int int33 = xmlDeclaration17.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration17.after("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            node22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        int int13 = node12.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        org.jsoup.nodes.Node node14 = node12.clone();
        org.jsoup.nodes.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before(node15);
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.String str22 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        boolean boolean30 = xmlDeclaration26.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration26.childNodesCopy();
        java.lang.String str32 = xmlDeclaration26.nodeName();
        boolean boolean33 = xmlDeclaration12.hasSameValue((java.lang.Object) str32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        boolean boolean9 = xmlDeclaration3.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration13.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration13.parent();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration13.attributes();
        boolean boolean18 = xmlDeclaration3.equals((java.lang.Object) attributes17);
        java.lang.Class<?> wildcardClass19 = attributes17.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.before("");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodes();
        boolean boolean35 = xmlDeclaration3.hasAttr("<?hi!>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Document document29 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        node20.setBaseUri("<!#declaration>");
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        int int21 = node20.childNodeSize();
        org.jsoup.nodes.Node node22 = node20.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node22.attr("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        java.lang.String str20 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document21 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.lang.String str34 = xmlDeclaration12.getWholeDeclaration();
        int int35 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node36 = xmlDeclaration12.parent();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable37, (int) '4', outputSettings39);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        java.lang.String str30 = xmlDeclaration17.toString();
        org.jsoup.nodes.Attributes attributes31 = xmlDeclaration17.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration17.traverse(nodeVisitor32);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass16 = nodeList15.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "<?<?hi!>>", false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        java.lang.String str21 = xmlDeclaration17.toString();
        org.jsoup.nodes.Node node22 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration17.outerHtmlTail(appendable23, (int) '4', outputSettings25);
        java.lang.String str27 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Document document28 = xmlDeclaration17.ownerDocument();
        java.lang.String str30 = xmlDeclaration17.absUrl("#declaration");
        java.lang.String str32 = xmlDeclaration17.absUrl("hi!");
        java.lang.String str33 = xmlDeclaration17.name();
        java.lang.String str35 = xmlDeclaration17.absUrl("<!hi!>");
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) str35);
        org.jsoup.nodes.Node node37 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = node37.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
            java.lang.String str12 = node11.baseUri();
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.Node node18 = node16.parent();
        org.jsoup.nodes.Node node19 = node16.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        java.lang.Object obj12 = null;
        boolean boolean13 = xmlDeclaration3.equals(obj12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("<!hi!>");
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node16.childNodeSize();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        boolean boolean18 = xmlDeclaration3.equals((java.lang.Object) int17);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.childNodes();
        java.lang.String str20 = xmlDeclaration3.baseUri();
        java.lang.String str21 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("<!<!>>");
        org.jsoup.nodes.Node node24 = node23.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.siblingNodes();
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable29, (int) (byte) 10, outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        int int10 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        boolean boolean12 = node9.hasAttr("<?hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        org.jsoup.nodes.Node node21 = xmlDeclaration18.nextSibling();
        xmlDeclaration18.setBaseUri("<!>");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, 100, outputSettings26);
        boolean boolean29 = xmlDeclaration18.hasAttr("#declaration");
        java.lang.String str30 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration18.nextSibling();
        org.jsoup.nodes.Node node33 = xmlDeclaration18.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration18.siblingNodes();
        org.jsoup.nodes.Node node37 = xmlDeclaration18.attr("<?>", "hi!");
        org.jsoup.nodes.Node node38 = node37.parent();
        org.jsoup.nodes.Node node40 = node37.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        xmlDeclaration3.setBaseUri("<?hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        java.lang.String str9 = node5.attr("hi!");
        org.jsoup.nodes.Node node11 = node5.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        java.lang.String str14 = node11.absUrl("<!#declaration>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        boolean boolean17 = xmlDeclaration3.hasAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document19 = xmlDeclaration3.ownerDocument();
        java.lang.Class<?> wildcardClass20 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.lang.String str12 = node10.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.lang.String str20 = xmlDeclaration16.getWholeDeclaration();
        int int21 = xmlDeclaration16.siblingIndex();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        int int23 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration16.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration16.siblingNodes();
        boolean boolean27 = node10.hasSameValue((java.lang.Object) xmlDeclaration16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node10.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.siblingNodes();
        org.jsoup.nodes.Node node26 = xmlDeclaration17.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.traverse(nodeVisitor30);
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
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.baseUri();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration16.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Attributes attributes27 = xmlDeclaration16.attributes();
        xmlDeclaration16.setBaseUri("hi!");
        java.lang.String str31 = xmlDeclaration16.absUrl("<!hi!>");
        boolean boolean32 = node11.hasSameValue((java.lang.Object) "<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node11.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("hi!", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        java.lang.String str22 = xmlDeclaration18.getWholeDeclaration();
        int int23 = xmlDeclaration18.siblingIndex();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        int int25 = xmlDeclaration18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration18.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        org.jsoup.nodes.Node node33 = xmlDeclaration30.nextSibling();
        xmlDeclaration30.setBaseUri("<!>");
        xmlDeclaration30.setBaseUri("#declaration");
        boolean boolean38 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration30);
        org.jsoup.nodes.Document document39 = xmlDeclaration30.ownerDocument();
        org.jsoup.nodes.Node node40 = xmlDeclaration30.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.attr("hi!");
        java.lang.String str19 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.attr("hi!", "<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.Node node14 = node11.attr("hi!", "");
        int int15 = node14.childNodeSize();
        org.jsoup.nodes.Node node16 = node14.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        boolean boolean17 = xmlDeclaration3.hasAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document19 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document19.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("#declaration");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.lang.String str8 = xmlDeclaration3.baseUri();
        boolean boolean10 = xmlDeclaration3.hasAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        boolean boolean21 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        java.lang.String str23 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node20 = node19.clone();
        node20.setBaseUri("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document11.after(node12);
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
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?hi!>>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        java.lang.String str33 = node7.attr("<!<!>>");
        org.jsoup.nodes.Node node34 = node7.clone();
        org.jsoup.nodes.Node node35 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node35.attr("", "<?#declaration>");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        org.jsoup.nodes.Node node10 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = document24.parentNode();
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
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        boolean boolean11 = xmlDeclaration3.hasAttr("");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        xmlDeclaration3.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "#declaration", false);
        xmlDeclaration3.setBaseUri("<!<?>>");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!hi!>", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        int int21 = node20.childNodeSize();
        java.lang.String str22 = node20.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node20.after("<!>");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        int int4 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = node5.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        boolean boolean16 = xmlDeclaration11.hasAttr("<!>");
        org.jsoup.nodes.Node node18 = xmlDeclaration11.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration11.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList19);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        org.jsoup.nodes.Node node27 = xmlDeclaration24.nextSibling();
        xmlDeclaration24.setBaseUri("<!>");
        int int30 = xmlDeclaration24.siblingIndex();
        org.jsoup.nodes.Node node32 = xmlDeclaration24.removeAttr("<?>");
        java.lang.String str33 = xmlDeclaration24.name();
        org.jsoup.nodes.Node node34 = xmlDeclaration24.clone();
        boolean boolean35 = xmlDeclaration3.hasSameValue((java.lang.Object) node34);
        org.jsoup.nodes.Document document36 = node34.ownerDocument();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(document36);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        java.lang.String str10 = node5.absUrl("<?hi!>");
        node5.setBaseUri("<!<!>>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration18.attr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        org.jsoup.nodes.Node node25 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node25.before((org.jsoup.nodes.Node) xmlDeclaration29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
            org.jsoup.nodes.Node node37 = xmlDeclaration12.before("<?#declaration>");
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        java.lang.String str47 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration37.attributes();
        boolean boolean49 = node29.hasSameValue((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Attributes attributes50 = node29.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        java.lang.String str57 = xmlDeclaration54.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration54.childNodes();
        java.lang.String str59 = xmlDeclaration54.name();
        org.jsoup.nodes.Node node60 = xmlDeclaration54.parent();
        xmlDeclaration54.setBaseUri("<?hi!>");
        boolean boolean63 = node29.equals((java.lang.Object) "<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList64 = node29.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = node29.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList65);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = node8.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.siblingNodes();
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.nextSibling();
        xmlDeclaration32.setBaseUri("<!>");
        xmlDeclaration32.setBaseUri("#declaration");
        java.lang.String str41 = xmlDeclaration32.attr("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        boolean boolean21 = xmlDeclaration16.hasAttr("<!>");
        boolean boolean22 = node12.hasSameValue((java.lang.Object) "<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node12.before("<?hi!>");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) (byte) 10, outputSettings17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str19 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration18.nextSibling();
        java.lang.String str21 = xmlDeclaration18.nodeName();
        int int22 = xmlDeclaration18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.attr("<?>");
        int int16 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 10, outputSettings10);
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
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes23 = node22.attributes();
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
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<?<?hi!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        int int21 = node20.childNodeSize();
        java.lang.String str23 = node20.attr("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.lang.String str17 = xmlDeclaration3.baseUri();
        java.lang.String str18 = xmlDeclaration3.nodeName();
        java.lang.String str19 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes5 = node4.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.parentNode();
        org.jsoup.nodes.Node node10 = node7.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        org.jsoup.nodes.Node node22 = xmlDeclaration19.nextSibling();
        xmlDeclaration19.setBaseUri("<!>");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration19.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean30 = xmlDeclaration19.hasAttr("#declaration");
        java.lang.String str32 = xmlDeclaration19.absUrl("#declaration");
        java.lang.String str34 = xmlDeclaration19.attr("hi!");
        java.lang.String str35 = xmlDeclaration19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration19.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration19.childNodes();
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration19);
        org.jsoup.nodes.Node node41 = xmlDeclaration3.attr("<?#declaration>", "<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = node13.attributes();
        java.lang.String str17 = node13.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        java.lang.String str26 = xmlDeclaration21.absUrl("<!>");
        java.lang.String str28 = xmlDeclaration21.absUrl("hi!");
        org.jsoup.nodes.Node node29 = xmlDeclaration21.clone();
        org.jsoup.nodes.Node node31 = node29.removeAttr("<!<!>>");
        java.lang.String str32 = node29.outerHtml();
        org.jsoup.nodes.Node node33 = node29.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.before(node33);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        int int17 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration11.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration11.attributes();
        java.lang.String str22 = xmlDeclaration11.toString();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        java.lang.String str24 = xmlDeclaration11.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        int int31 = xmlDeclaration28.siblingIndex();
        java.lang.String str32 = xmlDeclaration28.toString();
        org.jsoup.nodes.Node node33 = xmlDeclaration28.parent();
        java.lang.String str34 = xmlDeclaration28.getWholeDeclaration();
        xmlDeclaration28.setBaseUri("<!>");
        org.jsoup.nodes.Node node37 = xmlDeclaration28.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration11.replaceWith((org.jsoup.nodes.Node) xmlDeclaration28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        java.lang.String str15 = xmlDeclaration3.name();
        java.lang.String str16 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Node node16 = node13.removeAttr("<!>");
        org.jsoup.nodes.Node node19 = node13.attr("<!<!>>", "<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parentNode();
        java.lang.String str25 = xmlDeclaration3.outerHtml();
        java.lang.String str26 = xmlDeclaration3.outerHtml();
        java.lang.String str27 = xmlDeclaration3.baseUri();
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        java.lang.String str20 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document21 = xmlDeclaration3.ownerDocument();
        java.lang.String str22 = xmlDeclaration3.toString();
        java.lang.Class<?> wildcardClass23 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?>" + "'", str22, "<?>");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str21 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node22 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable23, 10, outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration13.childNodes();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) nodeList14);
        int int16 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) 'a', outputSettings14);
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration30.childNodes();
        java.lang.String str34 = xmlDeclaration30.getWholeDeclaration();
        java.lang.String str35 = xmlDeclaration30.toString();
        boolean boolean36 = xmlDeclaration20.equals((java.lang.Object) xmlDeclaration30);
        org.jsoup.nodes.Attributes attributes37 = xmlDeclaration20.attributes();
        org.jsoup.nodes.Node node38 = xmlDeclaration20.previousSibling();
        org.jsoup.nodes.Node node39 = xmlDeclaration20.previousSibling();
        org.jsoup.nodes.Node node40 = xmlDeclaration20.clone();
        int int41 = xmlDeclaration20.siblingIndex();
        java.lang.String str42 = xmlDeclaration20.toString();
        org.jsoup.nodes.Node node43 = xmlDeclaration20.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration47 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str48 = xmlDeclaration47.toString();
        xmlDeclaration47.setBaseUri("#declaration");
        org.jsoup.nodes.Node node52 = xmlDeclaration47.removeAttr("<?<?>>");
        boolean boolean53 = xmlDeclaration20.hasSameValue((java.lang.Object) xmlDeclaration47);
        // The following exception was thrown during execution in test generation
        try {
            node16.replaceWith((org.jsoup.nodes.Node) xmlDeclaration47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!hi!>");
        boolean boolean15 = xmlDeclaration3.hasAttr("<!hi!>");
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        int int15 = xmlDeclaration3.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<!<!>>");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, 10, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node13 = xmlDeclaration10.attr("<!hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) node13);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node13.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.wrap("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        java.lang.String str21 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration3.outerHtmlTail(appendable22, (int) (short) 10, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after("<?#declaration>");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.siblingNodes();
        org.jsoup.nodes.Node node26 = xmlDeclaration17.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        int int15 = xmlDeclaration12.siblingIndex();
        java.lang.String str16 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node17 = xmlDeclaration12.parent();
        java.lang.String str18 = xmlDeclaration12.getWholeDeclaration();
        org.jsoup.nodes.Node node20 = xmlDeclaration12.removeAttr("hi!");
        boolean boolean21 = xmlDeclaration5.hasSameValue((java.lang.Object) node20);
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.parentNode();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node6.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration3.attr("#declaration");
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        java.lang.String str19 = xmlDeclaration3.attr("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration3.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration3.siblingNodes();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        int int14 = xmlDeclaration13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
            node25.remove();
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<?>>" + "'", str4, "<!<?>>");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        int int22 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration16.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodes();
        org.jsoup.nodes.Node node26 = node24.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?#declaration>", "<!<!>>", false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        java.lang.String str17 = xmlDeclaration3.baseUri();
        java.lang.String str18 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.attr("", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 0, outputSettings12);
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.removeAttr("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.clone();
        java.lang.String str21 = node19.attr("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) 'a', outputSettings16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.attr("hi!", "<!>");
        int int8 = node7.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "hi!");
        boolean boolean19 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str22 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.lang.String str22 = xmlDeclaration5.name();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes24 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xmlTreeBuilder0.processStartTag("", attributes24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parentNode();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.removeAttr("<!>");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration15.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.Node node12 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.siblingNodes();
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
        int int28 = xmlDeclaration3.childNodeSize();
        java.lang.String str30 = xmlDeclaration3.absUrl("#declaration");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) "");
        org.jsoup.nodes.Node node29 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node29.clone();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.wrap("<!<!>>");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration17.outerHtmlTail(appendable23, 100, outputSettings25);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) appendable23);
        int int28 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node29 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.siblingNodes();
        org.jsoup.nodes.Node node26 = xmlDeclaration17.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.attr("<!<?>>", "<!<?>>");
        org.jsoup.nodes.Node node34 = node32.removeAttr("#declaration");
        org.jsoup.nodes.Node node35 = node32.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass5 = nodeList4.getClass();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        java.lang.String str17 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.lang.String str26 = xmlDeclaration3.outerHtml();
        java.lang.Object obj27 = null;
        boolean boolean28 = xmlDeclaration3.hasSameValue(obj27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str10 = xmlDeclaration5.absUrl("<!>");
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.String str22 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean23 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Attributes attributes24 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xmlTreeBuilder0.processStartTag("<!>", attributes24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        int int10 = xmlDeclaration5.siblingIndex();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        int int12 = xmlDeclaration5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        org.jsoup.nodes.Node node22 = xmlDeclaration19.nextSibling();
        xmlDeclaration19.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration19.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        java.lang.String str32 = xmlDeclaration29.outerHtml();
        java.lang.String str33 = xmlDeclaration29.getWholeDeclaration();
        int int34 = xmlDeclaration29.siblingIndex();
        java.lang.String str35 = xmlDeclaration29.getWholeDeclaration();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        xmlDeclaration29.outerHtmlTail(appendable36, (int) (byte) 1, outputSettings38);
        boolean boolean40 = xmlDeclaration19.hasSameValue((java.lang.Object) outputSettings38);
        boolean boolean42 = xmlDeclaration19.hasAttr("<?>");
        boolean boolean43 = xmlDeclaration5.equals((java.lang.Object) "<?>");
        org.jsoup.nodes.Attributes attributes44 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.processStartTag("hi!", attributes44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document12.before("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        java.lang.String str20 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document21 = xmlDeclaration3.ownerDocument();
        java.lang.String str22 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (int) (short) 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!>>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.removeAttr("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration3.outerHtmlTail(appendable19, (int) '4', outputSettings21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration36.childNodes();
        java.lang.String str40 = xmlDeclaration36.getWholeDeclaration();
        java.lang.String str41 = xmlDeclaration36.toString();
        boolean boolean42 = xmlDeclaration26.equals((java.lang.Object) xmlDeclaration36);
        int int43 = xmlDeclaration26.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration48 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str50 = xmlDeclaration48.attr("");
        java.lang.String str51 = xmlDeclaration48.outerHtml();
        org.jsoup.nodes.Node node52 = xmlDeclaration48.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = node52.childNodes();
        boolean boolean55 = node52.hasAttr("hi!");
        boolean boolean56 = xmlDeclaration26.hasSameValue((java.lang.Object) node52);
        int int57 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node58 = xmlDeclaration26.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!>" + "'", str51, "<!>");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration17.clone();
        java.lang.String str21 = node20.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node13.before(node20);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.siblingNodes();
        org.jsoup.nodes.Node node26 = xmlDeclaration17.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Document document29 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node33 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "hi!");
        java.lang.String str18 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node4.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str17 = xmlDeclaration3.absUrl("hi!");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, 0, outputSettings20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration15.siblingNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.parent();
        xmlDeclaration15.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str31 = xmlDeclaration12.name();
        java.lang.String str32 = xmlDeclaration12.nodeName();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration12.outerHtmlTail(appendable33, 10, outputSettings35);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        int int43 = xmlDeclaration40.siblingIndex();
        org.jsoup.nodes.Document document44 = xmlDeclaration40.ownerDocument();
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        xmlDeclaration40.outerHtmlTail(appendable45, 100, outputSettings47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = xmlDeclaration12.after((org.jsoup.nodes.Node) xmlDeclaration40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(document44);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (byte) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        java.lang.String str30 = xmlDeclaration25.absUrl("<!>");
        java.lang.String str31 = xmlDeclaration25.getWholeDeclaration();
        int int32 = xmlDeclaration25.childNodeSize();
        java.lang.String str34 = xmlDeclaration25.absUrl("<?hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node21.before((org.jsoup.nodes.Node) xmlDeclaration25);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        org.jsoup.nodes.Node node32 = xmlDeclaration28.nextSibling();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration28.outerHtmlTail(appendable33, 100, outputSettings35);
        org.jsoup.nodes.Node node37 = xmlDeclaration28.nextSibling();
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) node37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList39 = node37.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        java.lang.String str30 = xmlDeclaration11.nodeName();
        java.lang.String str32 = xmlDeclaration11.absUrl("<!hi!>");
        xmlDeclaration11.setBaseUri("<?hi!>");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.before("");
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
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration3.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str31 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration3.after("<!hi!>");
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes10);
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "#declaration");
        java.lang.String str17 = node15.attr("#declaration");
        java.lang.String str18 = node15.baseUri();
        org.jsoup.nodes.Node node20 = node15.removeAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        boolean boolean24 = xmlDeclaration12.hasAttr("<?hi!>");
        org.jsoup.nodes.Node node25 = xmlDeclaration12.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node12.childNodeSize();
        boolean boolean15 = node12.hasAttr("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration12.childNodesCopy();
        java.lang.String str17 = xmlDeclaration12.baseUri();
        boolean boolean18 = node8.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        java.lang.String str9 = node5.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<?<?>>", attributes12);
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        java.lang.String str11 = xmlDeclaration3.name();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        java.lang.String str21 = xmlDeclaration16.absUrl("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.Node node24 = xmlDeclaration16.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.name();
        int int11 = xmlDeclaration3.siblingIndex();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        int int11 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str9 = xmlDeclaration3.absUrl("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        java.lang.String str23 = xmlDeclaration19.toString();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parent();
        java.lang.String str25 = xmlDeclaration19.getWholeDeclaration();
        org.jsoup.nodes.Node node27 = xmlDeclaration19.removeAttr("hi!");
        org.jsoup.nodes.Node node29 = node27.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration33.childNodes();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.nextSibling();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration33.outerHtmlTail(appendable38, 100, outputSettings40);
        java.lang.String str42 = xmlDeclaration33.toString();
        xmlDeclaration33.setBaseUri("#declaration");
        boolean boolean45 = node29.hasSameValue((java.lang.Object) xmlDeclaration33);
        boolean boolean46 = xmlDeclaration3.equals((java.lang.Object) node29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = node29.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Node node29 = xmlDeclaration26.nextSibling();
        xmlDeclaration26.setBaseUri("<!>");
        int int32 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node35 = xmlDeclaration26.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration26.childNodes();
        java.lang.String str37 = xmlDeclaration26.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node22.before((org.jsoup.nodes.Node) xmlDeclaration26);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node13 = xmlDeclaration10.attr("<!hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) node13);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node13.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        java.lang.String str18 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.clone();
        org.jsoup.nodes.Node node24 = node21.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node27 = node24.attr("<!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            document10.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        java.lang.Class<?> wildcardClass9 = node5.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        org.jsoup.nodes.Document document17 = node16.ownerDocument();
        org.jsoup.nodes.Node node19 = node16.removeAttr("<?<?hi!>>");
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node16.traverse(nodeVisitor20);
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
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
            boolean boolean27 = node25.hasAttr("<?hi!>");
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) '#', outputSettings16);
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        java.lang.String str18 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes19 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(nodeList20);
    }
}

