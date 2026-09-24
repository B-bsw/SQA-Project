package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.lang.String str29 = xmlDeclaration26.outerHtml();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        int int31 = xmlDeclaration26.siblingIndex();
        java.lang.String str32 = xmlDeclaration26.getWholeDeclaration();
        int int33 = xmlDeclaration26.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration26.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        org.jsoup.nodes.Node node41 = xmlDeclaration38.nextSibling();
        xmlDeclaration38.setBaseUri("<!>");
        xmlDeclaration38.setBaseUri("#declaration");
        boolean boolean46 = xmlDeclaration26.equals((java.lang.Object) xmlDeclaration38);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration26.siblingNodes();
        org.jsoup.nodes.Node node48 = xmlDeclaration26.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) xmlDeclaration26);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node13.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.parentNode();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parent();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) ' ', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str10 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (byte) 1, outputSettings14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration3.outerHtmlTail(appendable16, (int) (byte) 0, outputSettings18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) ' ', outputSettings25);
        java.lang.String str27 = xmlDeclaration3.nodeName();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.jsoup.nodes.Node node19 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        int int26 = xmlDeclaration23.siblingIndex();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.String str28 = xmlDeclaration23.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration23.siblingNodes();
        org.jsoup.nodes.Node node32 = xmlDeclaration23.attr("#declaration", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.lang.String str39 = xmlDeclaration36.outerHtml();
        boolean boolean41 = xmlDeclaration36.hasAttr("<!>");
        boolean boolean42 = node32.hasSameValue((java.lang.Object) "<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration46 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str48 = xmlDeclaration46.attr("");
        int int49 = xmlDeclaration46.siblingIndex();
        org.jsoup.nodes.Node node50 = xmlDeclaration46.nextSibling();
        java.lang.String str51 = xmlDeclaration46.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlDeclaration46.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration56 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str58 = xmlDeclaration56.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlDeclaration56.childNodes();
        java.lang.String str60 = xmlDeclaration56.getWholeDeclaration();
        java.lang.String str61 = xmlDeclaration56.toString();
        boolean boolean62 = xmlDeclaration46.equals((java.lang.Object) xmlDeclaration56);
        org.jsoup.nodes.Attributes attributes63 = xmlDeclaration46.attributes();
        java.lang.String str64 = xmlDeclaration46.name();
        java.lang.String str66 = xmlDeclaration46.attr("<!<?>>");
        boolean boolean67 = node32.hasSameValue((java.lang.Object) xmlDeclaration46);
        boolean boolean68 = node19.hasSameValue((java.lang.Object) boolean67);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#declaration" + "'", str51, "#declaration");
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!>" + "'", str61, "<!>");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodes();
        java.lang.String str22 = xmlDeclaration18.getWholeDeclaration();
        java.lang.String str23 = xmlDeclaration18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.Node node25 = xmlDeclaration18.parent();
        java.lang.String str26 = xmlDeclaration18.name();
        int int27 = xmlDeclaration18.siblingIndex();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str37 = xmlDeclaration36.outerHtml();
        boolean boolean38 = node13.equals((java.lang.Object) xmlDeclaration36);
        org.jsoup.nodes.Node node41 = node13.attr("hi!", "<?#declaration>");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!<?>>" + "'", str37, "<!<?>>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration13.outerHtmlTail(appendable19, (int) (short) 10, outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        int int30 = xmlDeclaration27.siblingIndex();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.nextSibling();
        java.lang.String str32 = xmlDeclaration27.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration27.childNodesCopy();
        org.jsoup.nodes.Document document34 = xmlDeclaration27.ownerDocument();
        java.lang.String str36 = xmlDeclaration27.absUrl("<!>");
        java.lang.String str37 = xmlDeclaration27.name();
        boolean boolean38 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration27);
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration27.outerHtmlTail(appendable39, (int) (short) 100, outputSettings41);
        int int43 = xmlDeclaration27.siblingIndex();
        java.lang.String str44 = xmlDeclaration27.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration27.childNodesCopy();
        java.lang.String str46 = xmlDeclaration27.outerHtml();
        boolean boolean47 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.Node node12 = node10.clone();
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#declaration>" + "'", str4, "<?#declaration>");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
            boolean boolean16 = xmlTreeBuilder0.processStartTag("hi!", attributes15);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.attr("<!#declaration>", "");
        java.lang.String str11 = xmlDeclaration3.absUrl("<?<?hi!>>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str8 = xmlDeclaration3.attr("hi!");
        java.lang.String str10 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str11 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        int int13 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        java.lang.String str29 = xmlDeclaration25.toString();
        org.jsoup.nodes.Node node30 = xmlDeclaration25.nextSibling();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration25.outerHtmlTail(appendable31, (int) '4', outputSettings33);
        java.lang.String str35 = xmlDeclaration25.nodeName();
        java.lang.String str36 = xmlDeclaration25.getWholeDeclaration();
        java.lang.String str38 = xmlDeclaration25.attr("#declaration");
        org.jsoup.nodes.Attributes attributes39 = xmlDeclaration25.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration25);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        java.lang.String str21 = xmlDeclaration17.toString();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.siblingNodes();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration17.before("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.removeAttr("<?#declaration>");
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.parentNode();
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        java.lang.String str28 = xmlDeclaration24.getWholeDeclaration();
        java.lang.String str29 = xmlDeclaration24.toString();
        boolean boolean30 = xmlDeclaration14.equals((java.lang.Object) xmlDeclaration24);
        int int31 = xmlDeclaration14.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration14.childNodes();
        java.lang.String str33 = xmlDeclaration14.toString();
        java.lang.String str34 = xmlDeclaration14.baseUri();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        xmlDeclaration14.outerHtmlTail(appendable35, (int) (byte) -1, outputSettings37);
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration14.outerHtmlTail(appendable39, 10, outputSettings41);
        java.lang.String str44 = xmlDeclaration14.absUrl("<!>");
        int int45 = xmlDeclaration14.siblingIndex();
        boolean boolean46 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable47, (int) (byte) -1, outputSettings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parentNode();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        int int22 = xmlDeclaration16.childNodeSize();
        java.lang.String str24 = xmlDeclaration16.absUrl("hi!");
        java.lang.String str26 = xmlDeclaration16.absUrl("<!>");
        boolean boolean28 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str29 = xmlDeclaration16.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        org.jsoup.nodes.Node node10 = xmlDeclaration7.clone();
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        java.lang.String str29 = xmlDeclaration25.getWholeDeclaration();
        java.lang.String str30 = xmlDeclaration25.toString();
        boolean boolean31 = xmlDeclaration15.equals((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.Attributes attributes32 = xmlDeclaration15.attributes();
        boolean boolean33 = node11.equals((java.lang.Object) xmlDeclaration15);
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) node11);
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.removeAttr("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) 'a', outputSettings15);
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        int int24 = xmlDeclaration3.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
            xmlDeclaration3.outerHtmlHead(appendable26, (int) 'a', outputSettings28);
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        int int22 = xmlDeclaration16.childNodeSize();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration16.outerHtmlTail(appendable23, 0, outputSettings25);
        boolean boolean27 = node7.hasSameValue((java.lang.Object) outputSettings25);
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, 100, outputSettings13);
        boolean boolean16 = xmlDeclaration5.hasAttr("#declaration");
        int int17 = xmlDeclaration5.childNodeSize();
        java.lang.String str19 = xmlDeclaration5.absUrl("#declaration");
        java.lang.String str20 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.before("");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
            boolean boolean21 = xmlTreeBuilder0.processStartTag("<?<?hi!>>", attributes20);
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
            org.jsoup.nodes.Node node17 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = document11.attr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        int int8 = xmlDeclaration3.siblingIndex();
        boolean boolean10 = xmlDeclaration3.hasAttr("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        int int39 = xmlDeclaration36.siblingIndex();
        java.lang.String str41 = xmlDeclaration36.absUrl("<!>");
        java.lang.String str42 = xmlDeclaration36.getWholeDeclaration();
        org.jsoup.nodes.Node node43 = xmlDeclaration36.parentNode();
        java.lang.String str45 = xmlDeclaration36.attr("");
        boolean boolean46 = node30.equals((java.lang.Object) xmlDeclaration36);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration50 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str52 = xmlDeclaration50.attr("");
        org.jsoup.nodes.Node node53 = xmlDeclaration50.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlDeclaration50.childNodes();
        java.lang.String str55 = xmlDeclaration50.name();
        int int56 = xmlDeclaration50.childNodeSize();
        java.lang.String str57 = xmlDeclaration50.outerHtml();
        org.jsoup.nodes.Node node59 = xmlDeclaration50.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = node30.after(node59);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.attr("<!<!>>");
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = node12.baseUri();
        java.lang.String str14 = node12.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "#declaration", true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodesCopy();
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration3.outerHtmlTail(appendable28, 10, outputSettings30);
        java.lang.String str33 = xmlDeclaration3.absUrl("<!>");
        int int34 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Document document35 = xmlDeclaration3.ownerDocument();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, (-1), outputSettings17);
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        int int8 = node7.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        java.lang.String str36 = xmlDeclaration3.nodeName();
        java.lang.String str37 = xmlDeclaration3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) 0, outputSettings13);
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.String str30 = xmlDeclaration25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration35.childNodes();
        java.lang.String str39 = xmlDeclaration35.getWholeDeclaration();
        java.lang.String str40 = xmlDeclaration35.toString();
        boolean boolean41 = xmlDeclaration25.equals((java.lang.Object) xmlDeclaration35);
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration25.attributes();
        org.jsoup.nodes.Node node43 = xmlDeclaration25.previousSibling();
        org.jsoup.nodes.Node node44 = xmlDeclaration25.previousSibling();
        boolean boolean46 = xmlDeclaration25.hasSameValue((java.lang.Object) (-1.0d));
        boolean boolean47 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration51 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str53 = xmlDeclaration51.attr("");
        java.lang.String str54 = xmlDeclaration51.outerHtml();
        org.jsoup.nodes.Node node55 = xmlDeclaration51.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = node55.childNodes();
        org.jsoup.nodes.Attributes attributes57 = node55.attributes();
        org.jsoup.nodes.Node node58 = node55.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration25.replaceWith(node55);
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!>" + "'", str54, "<!>");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean17 = xmlDeclaration12.hasSameValue((java.lang.Object) true);
        java.lang.String str18 = xmlDeclaration12.name();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.jsoup.nodes.Node node31 = xmlDeclaration3.previousSibling();
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
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "<!<?>>", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        org.jsoup.nodes.Node node10 = xmlDeclaration7.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        int int17 = xmlDeclaration14.siblingIndex();
        java.lang.String str18 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.parent();
        java.lang.String str20 = xmlDeclaration14.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration14.removeAttr("hi!");
        boolean boolean23 = xmlDeclaration7.hasSameValue((java.lang.Object) node22);
        java.lang.String str24 = node22.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.lang.String str16 = xmlDeclaration15.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node11.before((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node14 = node10.clone();
        java.lang.Class<?> wildcardClass15 = node10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int15 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration3.outerHtmlTail(appendable16, (int) (short) 10, outputSettings18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node14 = node11.attr("<?hi!>", "<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.jsoup.nodes.Node node32 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.Node node33 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration3.before("<?hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node8 = xmlDeclaration7.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?#declaration>", "", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("<!>", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.parentNode();
        org.jsoup.nodes.Node node10 = node6.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.jsoup.nodes.Node node17 = xmlDeclaration3.removeAttr("<!<?>>");
        boolean boolean19 = xmlDeclaration3.hasAttr("<!hi!>");
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
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
        int int30 = xmlDeclaration13.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration13.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        java.lang.String str38 = xmlDeclaration35.outerHtml();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.childNodes();
        boolean boolean42 = node39.hasAttr("hi!");
        boolean boolean43 = xmlDeclaration13.hasSameValue((java.lang.Object) node39);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration47 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str49 = xmlDeclaration47.attr("");
        org.jsoup.nodes.Node node50 = xmlDeclaration47.nextSibling();
        xmlDeclaration47.setBaseUri("<!>");
        java.lang.Appendable appendable53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = null;
        xmlDeclaration47.outerHtmlTail(appendable53, 100, outputSettings55);
        java.lang.String str57 = xmlDeclaration47.outerHtml();
        org.jsoup.nodes.Attributes attributes58 = xmlDeclaration47.attributes();
        boolean boolean59 = node39.hasSameValue((java.lang.Object) xmlDeclaration47);
        org.jsoup.nodes.Attributes attributes60 = node39.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration64 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str66 = xmlDeclaration64.attr("");
        java.lang.String str67 = xmlDeclaration64.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlDeclaration64.childNodes();
        java.lang.String str69 = xmlDeclaration64.name();
        org.jsoup.nodes.Node node70 = xmlDeclaration64.parent();
        xmlDeclaration64.setBaseUri("<?hi!>");
        boolean boolean73 = node39.equals((java.lang.Object) "<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList74 = node39.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node75 = document9.before(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNull(document9);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!>" + "'", str38, "<!>");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!>" + "'", str67, "<!>");
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(nodeList74);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.lang.Class<?> wildcardClass24 = xmlDeclaration3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes11 = document10.attributes();
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
        boolean boolean12 = node9.hasAttr("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        org.jsoup.nodes.Node node18 = node17.clone();
        java.lang.String str20 = node18.attr("");
        java.lang.String str22 = node18.attr("hi!");
        org.jsoup.nodes.Node node24 = node18.removeAttr("<?>");
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
        boolean boolean46 = xmlDeclaration28.hasSameValue((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node47 = xmlDeclaration28.clone();
        boolean boolean48 = node24.hasSameValue((java.lang.Object) node47);
        int int49 = node24.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = node9.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#declaration", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        java.lang.String str11 = xmlDeclaration8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration8.childNodes();
        int int13 = xmlDeclaration8.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        boolean boolean22 = xmlDeclaration8.equals((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        java.lang.String str30 = xmlDeclaration26.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration26.parent();
        java.lang.String str32 = xmlDeclaration26.getWholeDeclaration();
        org.jsoup.nodes.Node node34 = xmlDeclaration26.removeAttr("hi!");
        boolean boolean35 = xmlDeclaration17.hasSameValue((java.lang.Object) node34);
        org.jsoup.nodes.Node node38 = xmlDeclaration17.attr("<?hi!>", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration42.childNodes();
        org.jsoup.nodes.Node node46 = xmlDeclaration42.nextSibling();
        org.jsoup.nodes.Document document47 = xmlDeclaration42.ownerDocument();
        org.jsoup.nodes.Node node48 = xmlDeclaration42.previousSibling();
        int int49 = xmlDeclaration42.childNodeSize();
        java.lang.String str50 = xmlDeclaration42.baseUri();
        boolean boolean51 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = node4.after((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) 0, outputSettings13);
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.Object obj21 = null;
        boolean boolean22 = xmlDeclaration12.equals(obj21);
        java.lang.String str24 = xmlDeclaration12.attr("#declaration");
        java.lang.Class<?> wildcardClass25 = xmlDeclaration12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node13.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str12 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str13 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node66 = node29.wrap("hi!");
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
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
            org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        java.lang.String str19 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.String str21 = node20.baseUri();
        org.jsoup.nodes.Node node22 = node20.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.baseUri();
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) '4', outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?hi!>>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?>>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.jsoup.nodes.Node node22 = node20.removeAttr("#declaration");
        org.jsoup.nodes.Node node24 = node22.removeAttr("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node24.before((org.jsoup.nodes.Node) xmlDeclaration28);
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        boolean boolean19 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str20 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass22 = nodeList21.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.absUrl("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.jsoup.nodes.Document document19 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.jsoup.nodes.Document document20 = node19.ownerDocument();
        java.lang.String str22 = node19.absUrl("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodes();
        boolean boolean25 = node22.hasAttr("hi!");
        org.jsoup.nodes.Node node26 = node22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node22.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node12.before(node22);
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.clone();
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parentNode();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str13 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        int int4 = xmlDeclaration3.childNodeSize();
        java.lang.String str5 = xmlDeclaration3.name();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        int int11 = node10.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        java.lang.Object obj15 = null;
        boolean boolean16 = xmlDeclaration3.hasSameValue(obj15);
        java.lang.String str17 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.lang.String str24 = xmlDeclaration21.outerHtml();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.clone();
        xmlDeclaration21.setBaseUri("<!>");
        org.jsoup.nodes.Node node28 = xmlDeclaration21.clone();
        boolean boolean30 = xmlDeclaration21.hasAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration21);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) 10, outputSettings25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = node13.removeAttr("<!>");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.jsoup.nodes.Node node17 = node15.clone();
        org.jsoup.nodes.Node node18 = node15.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?<?>>", true);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.Class<?> wildcardClass5 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.traverse(nodeVisitor26);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("<?>");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.traverse(nodeVisitor23);
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<!#declaration>", "<?<?>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
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
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document10.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        java.lang.String str22 = xmlDeclaration20.baseUri();
        java.lang.String str23 = xmlDeclaration20.outerHtml();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.clone();
        java.lang.String str25 = xmlDeclaration20.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node16.after((org.jsoup.nodes.Node) xmlDeclaration20);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?>" + "'", str23, "<?>");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<?>" + "'", str25, "<?>");
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!<?>>", "hi!");
        org.jsoup.nodes.Node node18 = node17.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
            org.jsoup.nodes.Node node17 = node15.after("<!hi!>");
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        java.lang.String str20 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        int int12 = node10.childNodeSize();
        org.jsoup.nodes.Node node13 = node10.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.lang.String str19 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        int int12 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration7.childNodes();
        java.lang.String str11 = xmlDeclaration7.getWholeDeclaration();
        java.lang.String str12 = xmlDeclaration7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration7.childNodesCopy();
        org.jsoup.nodes.Node node14 = xmlDeclaration7.parent();
        java.lang.String str15 = xmlDeclaration7.name();
        java.lang.String str17 = xmlDeclaration7.attr("");
        boolean boolean18 = xmlDeclaration3.hasSameValue((java.lang.Object) "");
        boolean boolean20 = xmlDeclaration3.hasAttr("<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodesCopy();
        org.jsoup.nodes.Node node10 = node7.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        java.lang.String str13 = xmlDeclaration9.getWholeDeclaration();
        int int14 = xmlDeclaration9.siblingIndex();
        java.lang.String str15 = xmlDeclaration9.getWholeDeclaration();
        int int16 = xmlDeclaration9.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration9.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration9.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList18);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str14 = xmlDeclaration13.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str23 = xmlDeclaration18.absUrl("<!>");
        org.jsoup.nodes.Node node24 = xmlDeclaration18.parentNode();
        java.lang.Class<?> wildcardClass25 = xmlDeclaration18.getClass();
        boolean boolean26 = xmlDeclaration13.equals((java.lang.Object) wildcardClass25);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.Node node28 = xmlDeclaration13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node9.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!>", "#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.attr("#declaration", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = node20.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node14 = node10.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str6 = xmlDeclaration5.toString();
        xmlDeclaration5.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.siblingNodes();
        xmlDeclaration5.setBaseUri("<!<?>>");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<?#declaration>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
            org.jsoup.nodes.Node node50 = xmlDeclaration37.unwrap();
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str13 = node11.attr("");
        org.jsoup.nodes.Node node14 = node11.parent();
        org.jsoup.nodes.Node node17 = node11.attr("<?hi!>", "<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node11.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
            org.jsoup.nodes.Node node29 = xmlDeclaration3.unwrap();
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.jsoup.nodes.Node node24 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable25, (-1), outputSettings27);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.jsoup.nodes.Node node22 = node20.removeAttr("#declaration");
        org.jsoup.nodes.Node node23 = node20.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node20.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable11, (int) (byte) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str18 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str19 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        java.lang.Class<?> wildcardClass19 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        java.lang.String str7 = xmlDeclaration3.attr("<!>");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (byte) 10, outputSettings10);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        org.jsoup.nodes.Node node34 = node33.clone();
        java.lang.String str36 = node34.attr("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        org.jsoup.nodes.Node node22 = xmlDeclaration19.clone();
        int int23 = xmlDeclaration19.childNodeSize();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.previousSibling();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.childNodesCopy();
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        boolean boolean9 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        org.jsoup.nodes.Node node14 = node12.clone();
        org.jsoup.nodes.Node node15 = node12.parent();
        org.jsoup.nodes.Node node17 = node12.removeAttr("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.traverse(nodeVisitor18);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.siblingNodes();
        org.jsoup.nodes.Document document29 = xmlDeclaration21.ownerDocument();
        java.lang.String str30 = xmlDeclaration21.toString();
        java.lang.String str31 = xmlDeclaration21.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        int int38 = xmlDeclaration35.siblingIndex();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.nextSibling();
        java.lang.String str40 = xmlDeclaration35.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration35.siblingNodes();
        org.jsoup.nodes.Node node44 = xmlDeclaration35.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes45 = node44.attributes();
        boolean boolean46 = xmlDeclaration21.hasSameValue((java.lang.Object) attributes45);
        int int47 = xmlDeclaration21.childNodeSize();
        boolean boolean48 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        int int55 = xmlDeclaration52.siblingIndex();
        xmlDeclaration52.setBaseUri("#declaration");
        boolean boolean58 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration52);
        org.jsoup.nodes.Node node60 = xmlDeclaration21.removeAttr("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        org.jsoup.nodes.Node node10 = node7.clone();
        node10.setBaseUri("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        org.jsoup.nodes.Node node19 = node16.removeAttr("<?#declaration>");
        org.jsoup.nodes.Node node20 = node19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.unwrap();
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
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", false);
        java.lang.String str37 = xmlDeclaration36.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node32.before((org.jsoup.nodes.Node) xmlDeclaration36);
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
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<?hi!>" + "'", str37, "<?hi!>");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration5.wrap("<!>");
        java.lang.String str12 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.clone();
        org.jsoup.nodes.Attributes attributes14 = node13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.lang.String str21 = xmlDeclaration3.attr("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        int int14 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodes();
        java.lang.String str17 = xmlDeclaration3.absUrl("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.removeAttr("#declaration");
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        java.lang.String str24 = node22.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node22.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        java.lang.String str18 = node17.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        org.jsoup.nodes.Node node25 = xmlDeclaration22.nextSibling();
        xmlDeclaration22.setBaseUri("<!>");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration22.outerHtmlTail(appendable28, 100, outputSettings30);
        boolean boolean33 = xmlDeclaration22.hasAttr("#declaration");
        int int34 = xmlDeclaration22.childNodeSize();
        java.lang.String str36 = xmlDeclaration22.absUrl("#declaration");
        java.lang.String str37 = xmlDeclaration22.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration41.childNodes();
        java.lang.String str45 = xmlDeclaration41.getWholeDeclaration();
        java.lang.String str46 = xmlDeclaration41.toString();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        xmlDeclaration41.outerHtmlTail(appendable47, (int) (short) 10, outputSettings49);
        java.lang.String str51 = xmlDeclaration41.getWholeDeclaration();
        int int52 = xmlDeclaration41.siblingIndex();
        org.jsoup.nodes.Node node54 = xmlDeclaration41.removeAttr("#declaration");
        org.jsoup.nodes.Node node55 = node54.nextSibling();
        boolean boolean56 = xmlDeclaration22.hasSameValue((java.lang.Object) node54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = node17.after((org.jsoup.nodes.Node) xmlDeclaration22);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
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
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<?<?>>");
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) 'a', outputSettings13);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "hi!", false);
        int int4 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("");
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node13 = xmlDeclaration10.attr("<!hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) node13);
        java.lang.String str16 = node13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
            org.jsoup.nodes.Node node17 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        java.lang.String str10 = node7.attr("<?>");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration15.outerHtmlTail(appendable21, 100, outputSettings23);
        boolean boolean26 = xmlDeclaration15.hasAttr("#declaration");
        int int27 = xmlDeclaration15.childNodeSize();
        java.lang.String str29 = xmlDeclaration15.absUrl("#declaration");
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Node node32 = xmlDeclaration15.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.wrap("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        java.lang.String str36 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        int int29 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable30, (int) '4', outputSettings32);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        int int35 = node33.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.String str15 = node13.attr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.jsoup.nodes.Node node47 = xmlDeclaration39.removeAttr("<?<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node47.traverse(nodeVisitor48);
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
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.siblingNodes();
        org.jsoup.nodes.Document document29 = xmlDeclaration21.ownerDocument();
        java.lang.String str30 = xmlDeclaration21.toString();
        java.lang.String str31 = xmlDeclaration21.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        int int38 = xmlDeclaration35.siblingIndex();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.nextSibling();
        java.lang.String str40 = xmlDeclaration35.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration35.siblingNodes();
        org.jsoup.nodes.Node node44 = xmlDeclaration35.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes45 = node44.attributes();
        boolean boolean46 = xmlDeclaration21.hasSameValue((java.lang.Object) attributes45);
        int int47 = xmlDeclaration21.childNodeSize();
        boolean boolean48 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        int int55 = xmlDeclaration52.siblingIndex();
        xmlDeclaration52.setBaseUri("#declaration");
        boolean boolean58 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration52);
        org.jsoup.nodes.Node node59 = xmlDeclaration52.previousSibling();
        java.lang.Appendable appendable60 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = null;
        xmlDeclaration52.outerHtmlTail(appendable60, (int) (short) 1, outputSettings62);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration12.outerHtmlTail(appendable23, 1, outputSettings25);
        java.lang.String str27 = xmlDeclaration12.nodeName();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable28, (int) (byte) 10, outputSettings30);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        org.jsoup.nodes.Node node35 = xmlDeclaration3.attr("<!<?>>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = xmlDeclaration3.after("hi!");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        java.lang.String str30 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration34.childNodes();
        org.jsoup.nodes.Node node38 = xmlDeclaration34.nextSibling();
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration34.outerHtmlTail(appendable39, 100, outputSettings41);
        java.lang.String str43 = xmlDeclaration34.toString();
        int int44 = xmlDeclaration34.siblingIndex();
        org.jsoup.nodes.Node node45 = xmlDeclaration34.previousSibling();
        java.lang.String str46 = xmlDeclaration34.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration34.childNodesCopy();
        boolean boolean48 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList47);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.util.List<org.jsoup.nodes.Node> nodeList82 = node28.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = node28.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(nodeList83);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration17.outerHtmlHead(appendable32, 100, outputSettings34);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("<?<?>>", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int int31 = xmlDeclaration3.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
            org.jsoup.nodes.Node node13 = node12.clone();
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
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, 1, outputSettings13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        org.jsoup.nodes.Node node23 = xmlDeclaration12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node23.remove();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        java.lang.String str27 = xmlDeclaration3.outerHtml();
        xmlDeclaration3.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        int int11 = node9.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        int int22 = xmlDeclaration5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration5.previousSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration5.outerHtmlTail(appendable25, (int) ' ', outputSettings27);
        int int29 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = xmlTreeBuilder0.processStartTag("hi!", attributes30);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        org.jsoup.nodes.Node node16 = xmlDeclaration11.parentNode();
        org.jsoup.nodes.Node node18 = xmlDeclaration11.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        int int25 = xmlDeclaration22.siblingIndex();
        boolean boolean26 = xmlDeclaration11.equals((java.lang.Object) int25);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration11.childNodes();
        java.lang.String str28 = xmlDeclaration11.baseUri();
        java.lang.String str29 = xmlDeclaration11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node7.before((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.siblingNodes();
        boolean boolean22 = node11.hasSameValue((java.lang.Object) nodeList21);
        org.jsoup.nodes.Attributes attributes23 = node11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node11.after("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node4.after(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int24 = xmlDeclaration3.childNodeSize();
        java.lang.String str26 = xmlDeclaration3.absUrl("<!hi!>");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.String str23 = xmlDeclaration3.absUrl("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.siblingNodes();
        java.lang.String str26 = xmlDeclaration3.attr("#declaration");
        org.jsoup.nodes.Document document27 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node28 = xmlDeclaration3.parent();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        int int27 = xmlDeclaration24.siblingIndex();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.String str29 = xmlDeclaration24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration24.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration34.childNodes();
        java.lang.String str38 = xmlDeclaration34.getWholeDeclaration();
        java.lang.String str39 = xmlDeclaration34.toString();
        boolean boolean40 = xmlDeclaration24.equals((java.lang.Object) xmlDeclaration34);
        int int41 = xmlDeclaration24.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration24.childNodes();
        java.lang.String str44 = xmlDeclaration24.absUrl("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration24.siblingNodes();
        org.jsoup.nodes.Node node46 = xmlDeclaration24.parentNode();
        java.lang.String str47 = xmlDeclaration24.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        java.lang.String str26 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
            int int20 = node19.siblingIndex();
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
            org.jsoup.nodes.Node node51 = xmlDeclaration37.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!<?>>");
        org.jsoup.nodes.Node node16 = node14.removeAttr("<?<?hi!>>");
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node19 = node17.removeAttr("<?<?hi!>>");
        org.jsoup.nodes.Node node20 = node17.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        java.lang.String str16 = xmlDeclaration3.name();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.nextSibling();
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.String str21 = xmlDeclaration14.attr("");
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) "");
        java.lang.String str23 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node12.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        xmlDeclaration3.outerHtmlTail(appendable14, 0, outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodesCopy();
        java.lang.String str19 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.previousSibling();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!<?>>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("<!>");
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        int int20 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration24.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str6 = xmlDeclaration3.name();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        java.lang.String str16 = xmlDeclaration11.absUrl("<!>");
        java.lang.String str17 = xmlDeclaration11.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration11.previousSibling();
        org.jsoup.nodes.Node node19 = xmlDeclaration11.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        java.lang.String str16 = xmlDeclaration3.nodeName();
        int int17 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration32.childNodes();
        java.lang.String str36 = xmlDeclaration32.getWholeDeclaration();
        java.lang.String str37 = xmlDeclaration32.toString();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration32.outerHtmlTail(appendable38, (int) (short) 10, outputSettings40);
        int int42 = xmlDeclaration32.siblingIndex();
        boolean boolean43 = xmlDeclaration3.equals((java.lang.Object) int42);
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        xmlDeclaration3.outerHtmlTail(appendable44, (int) '#', outputSettings46);
        org.jsoup.nodes.Node node48 = xmlDeclaration3.parentNode();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodesCopy();
        org.jsoup.nodes.Node node13 = node7.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        boolean boolean21 = xmlDeclaration17.hasAttr("<!>");
        java.lang.String str22 = xmlDeclaration17.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node13.before((org.jsoup.nodes.Node) xmlDeclaration17);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!#declaration>" + "'", str22, "<!#declaration>");
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node27 = node26.clone();
        int int28 = node27.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        java.lang.String str9 = node7.outerHtml();
        org.jsoup.nodes.Node node11 = node7.removeAttr("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        int int25 = node24.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration3.outerHtmlTail(appendable28, 10, outputSettings30);
        java.lang.String str33 = xmlDeclaration3.absUrl("<!>");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        boolean boolean11 = xmlDeclaration3.hasAttr("");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        int int14 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        org.jsoup.nodes.Node node27 = xmlDeclaration25.removeAttr("#declaration");
        int int28 = node27.childNodeSize();
        boolean boolean29 = xmlDeclaration3.equals((java.lang.Object) int28);
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.lang.String str24 = xmlDeclaration12.attr("hi!");
        org.jsoup.nodes.Node node26 = xmlDeclaration12.removeAttr("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        xmlDeclaration3.setBaseUri("<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
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
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable28, (int) '#', outputSettings30);
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
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        boolean boolean10 = xmlDeclaration3.hasAttr("");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 1, outputSettings11);
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!hi!>", "<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        java.lang.String str31 = xmlDeclaration27.getWholeDeclaration();
        int int32 = xmlDeclaration27.siblingIndex();
        java.lang.String str33 = xmlDeclaration27.getWholeDeclaration();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        xmlDeclaration27.outerHtmlTail(appendable34, (int) (byte) 1, outputSettings36);
        boolean boolean38 = xmlDeclaration17.hasSameValue((java.lang.Object) outputSettings36);
        boolean boolean40 = xmlDeclaration17.hasAttr("<?>");
        boolean boolean41 = xmlDeclaration3.equals((java.lang.Object) "<?>");
        java.lang.Appendable appendable42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable42, (-1), outputSettings44);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) '4', outputSettings15);
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
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        java.lang.String str24 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Attributes attributes25 = xmlDeclaration15.attributes();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        int int9 = node8.childNodeSize();
        java.lang.String str11 = node8.absUrl("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        java.lang.Class<?> wildcardClass13 = node8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str14 = xmlDeclaration3.attr("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        java.lang.String str16 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node7.siblingIndex();
        int int14 = node7.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.String str7 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        java.lang.String str18 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable20, (int) (short) 0, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        org.jsoup.nodes.Node node16 = node15.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("hi!");
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        int int24 = xmlDeclaration18.childNodeSize();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration18.outerHtmlTail(appendable25, 0, outputSettings27);
        org.jsoup.nodes.Node node29 = xmlDeclaration18.clone();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
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
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        int int9 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!>");
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
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        xmlDeclaration3.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.outerHtml();
        java.lang.String str19 = xmlDeclaration15.getWholeDeclaration();
        int int20 = xmlDeclaration15.siblingIndex();
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        int int22 = xmlDeclaration15.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration15.siblingNodes();
        java.lang.String str24 = xmlDeclaration15.toString();
        java.lang.String str25 = xmlDeclaration15.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        java.lang.String str9 = xmlDeclaration3.name();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?hi!>>", "hi!", true);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<!<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        boolean boolean19 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str20 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass22 = attributes21.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) (byte) 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, 1, outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parentNode();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.clone();
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) node25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.String str30 = xmlDeclaration25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration35.childNodes();
        java.lang.String str39 = xmlDeclaration35.getWholeDeclaration();
        java.lang.String str40 = xmlDeclaration35.toString();
        boolean boolean41 = xmlDeclaration25.equals((java.lang.Object) xmlDeclaration35);
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration25.attributes();
        org.jsoup.nodes.Node node43 = xmlDeclaration25.previousSibling();
        org.jsoup.nodes.Node node44 = xmlDeclaration25.previousSibling();
        boolean boolean46 = xmlDeclaration25.hasSameValue((java.lang.Object) (-1.0d));
        boolean boolean47 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration51 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str53 = xmlDeclaration51.attr("");
        org.jsoup.nodes.Node node54 = xmlDeclaration51.nextSibling();
        xmlDeclaration51.setBaseUri("<!>");
        boolean boolean58 = xmlDeclaration51.hasAttr("<!>");
        java.lang.String str59 = xmlDeclaration51.name();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlDeclaration51.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = xmlDeclaration25.before((org.jsoup.nodes.Node) xmlDeclaration51);
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(nodeList60);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        int int20 = xmlDeclaration3.siblingIndex();
        java.lang.String str21 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document22 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = document22.hasAttr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
            boolean boolean23 = xmlTreeBuilder0.processStartTag("<!<!>>", attributes22);
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.nextSibling();
        java.lang.String str15 = xmlDeclaration10.nodeName();
        int int16 = xmlDeclaration10.childNodeSize();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration10.outerHtmlTail(appendable17, 0, outputSettings19);
        org.jsoup.nodes.Node node21 = xmlDeclaration10.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.after("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        xmlDeclaration23.setBaseUri("<!>");
        xmlDeclaration23.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        org.jsoup.nodes.Node node38 = xmlDeclaration35.nextSibling();
        xmlDeclaration35.setBaseUri("<!>");
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        xmlDeclaration35.outerHtmlTail(appendable41, 100, outputSettings43);
        boolean boolean46 = xmlDeclaration35.hasAttr("#declaration");
        int int47 = xmlDeclaration35.childNodeSize();
        java.lang.String str49 = xmlDeclaration35.absUrl("#declaration");
        boolean boolean50 = xmlDeclaration23.equals((java.lang.Object) xmlDeclaration35);
        java.lang.String str51 = xmlDeclaration35.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration35);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!>" + "'", str51, "<!>");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        java.lang.String str7 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.nextSibling();
        xmlDeclaration13.setBaseUri("<!>");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration13.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean24 = xmlDeclaration13.hasAttr("#declaration");
        int int25 = xmlDeclaration13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = node9.equals((java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        java.lang.String str34 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.after("#declaration");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration13.clone();
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str17 = node15.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodes();
        boolean boolean28 = node15.hasSameValue((java.lang.Object) nodeList27);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        // The following exception was thrown during execution in test generation
        try {
            node23.remove();
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
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, 1, outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parentNode();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.clone();
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) node25);
        boolean boolean28 = xmlDeclaration3.hasAttr("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!<?>>", false);
        java.lang.Class<?> wildcardClass4 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.lang.String str22 = node18.absUrl("<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        java.lang.String str30 = xmlDeclaration26.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration26.parent();
        java.lang.String str32 = xmlDeclaration26.getWholeDeclaration();
        org.jsoup.nodes.Node node34 = xmlDeclaration26.removeAttr("hi!");
        boolean boolean36 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str37 = xmlDeclaration26.toString();
        boolean boolean38 = node18.hasSameValue((java.lang.Object) xmlDeclaration26);
        java.lang.String str39 = xmlDeclaration26.nodeName();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        org.jsoup.nodes.Node node48 = xmlDeclaration3.removeAttr("<!<!>>");
        java.lang.String str49 = xmlDeclaration3.nodeName();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#declaration" + "'", str49, "#declaration");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        org.jsoup.nodes.Node node34 = node33.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node34.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        int int25 = xmlDeclaration18.siblingIndex();
        boolean boolean26 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration18);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration18.outerHtmlHead(appendable27, (int) (byte) 10, outputSettings29);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before("<!<?>>");
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.jsoup.nodes.Attributes attributes14 = node12.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        int int29 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable30, 100, outputSettings32);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str17 = xmlDeclaration16.toString();
        xmlDeclaration16.setBaseUri("#declaration");
        org.jsoup.nodes.Node node21 = xmlDeclaration16.removeAttr("<?<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node12.after(node21);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
            boolean boolean25 = xmlTreeBuilder0.processStartTag("<?<?hi!>>", attributes24);
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
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
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        boolean boolean25 = node23.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node26 = node23.nextSibling();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        java.lang.String str30 = xmlDeclaration17.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration17.childNodesCopy();
        boolean boolean33 = xmlDeclaration17.hasAttr("<?>");
        java.lang.String str35 = xmlDeclaration17.attr("hi!");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?<?>>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        org.jsoup.nodes.Node node12 = xmlDeclaration9.nextSibling();
        xmlDeclaration9.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration9.siblingNodes();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration9.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.toString();
        boolean boolean26 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration20);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration9);
        boolean boolean29 = xmlDeclaration9.hasAttr("#declaration");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        java.lang.String str9 = node7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        int int16 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node28 = xmlDeclaration27.parentNode();
        int int29 = xmlDeclaration27.siblingIndex();
        boolean boolean30 = node23.hasSameValue((java.lang.Object) xmlDeclaration27);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node35 = xmlDeclaration34.clone();
        org.jsoup.nodes.Node node36 = node35.clone();
        java.lang.String str38 = node36.attr("");
        java.lang.String str40 = node36.attr("hi!");
        org.jsoup.nodes.Node node42 = node36.removeAttr("<?>");
        org.jsoup.nodes.Node node43 = node36.clone();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith(node43);
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
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("<?<?>>", "#declaration");
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
            boolean boolean45 = xmlTreeBuilder0.processStartTag("<?<?>>", attributes44);
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration12.outerHtmlTail(appendable26, 0, outputSettings28);
        org.jsoup.nodes.Node node30 = xmlDeclaration12.parent();
        xmlDeclaration12.setBaseUri("<?<?>>");
        org.jsoup.nodes.Node node33 = xmlDeclaration12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration12.before("<?<?hi!>>");
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
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        java.lang.String str21 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<?<?hi!>>");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable24, (int) (byte) 0, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        java.lang.String str44 = xmlDeclaration41.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration41.childNodes();
        java.lang.String str46 = xmlDeclaration41.name();
        java.lang.String str47 = xmlDeclaration41.outerHtml();
        java.lang.String str49 = xmlDeclaration41.attr("<!hi!>");
        org.jsoup.nodes.Node node52 = xmlDeclaration41.attr("<?hi!>", "");
        org.jsoup.nodes.Node node55 = node52.attr("<!#declaration>", "<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = xmlDeclaration3.before(node52);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        org.jsoup.nodes.Node node19 = node16.removeAttr("<?#declaration>");
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
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str13 = node11.attr("");
        boolean boolean15 = node11.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = node11.clone();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.removeAttr("<?>");
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        org.jsoup.nodes.Node node22 = xmlDeclaration16.parent();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        org.jsoup.nodes.Node node30 = xmlDeclaration27.nextSibling();
        xmlDeclaration27.setBaseUri("<!>");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration27.outerHtmlTail(appendable33, 100, outputSettings35);
        boolean boolean38 = xmlDeclaration27.hasAttr("#declaration");
        org.jsoup.nodes.Node node39 = xmlDeclaration27.previousSibling();
        boolean boolean40 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration27);
        java.lang.Class<?> wildcardClass41 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 1, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodes();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node22 = xmlDeclaration21.parentNode();
        int int23 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.wrap("<!<?>>");
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) node25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        org.jsoup.nodes.Node node31 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        org.jsoup.nodes.Node node33 = xmlDeclaration30.clone();
        int int34 = xmlDeclaration30.childNodeSize();
        boolean boolean36 = xmlDeclaration30.equals((java.lang.Object) (-1.0f));
        java.lang.String str37 = xmlDeclaration30.nodeName();
        org.jsoup.nodes.Node node38 = xmlDeclaration30.parentNode();
        java.lang.String str39 = xmlDeclaration30.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration30.childNodesCopy();
        boolean boolean41 = xmlDeclaration3.equals((java.lang.Object) nodeList40);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = node9.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.lang.String str14 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        java.lang.String str24 = xmlDeclaration12.attr("hi!");
        java.lang.String str25 = xmlDeclaration12.nodeName();
        java.lang.String str26 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node28 = xmlDeclaration12.removeAttr("<?#declaration>");
        org.jsoup.nodes.Document document29 = xmlDeclaration12.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration12.traverse(nodeVisitor30);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        java.lang.String str29 = xmlDeclaration25.getWholeDeclaration();
        java.lang.String str30 = xmlDeclaration25.toString();
        boolean boolean31 = xmlDeclaration15.equals((java.lang.Object) xmlDeclaration25);
        int int32 = xmlDeclaration15.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration15.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.lang.String str40 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Node node41 = xmlDeclaration37.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node41.childNodes();
        boolean boolean44 = node41.hasAttr("hi!");
        boolean boolean45 = xmlDeclaration15.hasSameValue((java.lang.Object) node41);
        int int46 = xmlDeclaration15.siblingIndex();
        boolean boolean47 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        xmlDeclaration3.outerHtmlTail(appendable14, (int) 'a', outputSettings16);
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?#declaration>", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("<?hi!>");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.clone();
        org.jsoup.nodes.Node node21 = node20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Document document5 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.after("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.lang.String str34 = node31.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
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
            org.jsoup.nodes.Node node32 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<?<?hi!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<?hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "#declaration");
        org.jsoup.nodes.Node node13 = node12.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.attr("#declaration", "");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) '4', outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration23.outerHtmlTail(appendable29, (int) (short) 10, outputSettings31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration23.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        int int40 = xmlDeclaration37.siblingIndex();
        org.jsoup.nodes.Node node41 = xmlDeclaration37.nextSibling();
        java.lang.String str42 = xmlDeclaration37.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration37.childNodesCopy();
        org.jsoup.nodes.Document document44 = xmlDeclaration37.ownerDocument();
        java.lang.String str46 = xmlDeclaration37.absUrl("<!>");
        java.lang.String str47 = xmlDeclaration37.name();
        boolean boolean48 = xmlDeclaration23.equals((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Document document49 = xmlDeclaration23.ownerDocument();
        org.jsoup.nodes.Node node51 = xmlDeclaration23.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlDeclaration23.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = node19.before((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#declaration" + "'", str42, "#declaration");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        java.lang.Class<?> wildcardClass21 = attributes20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!>", "");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("<!#declaration>");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before("");
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
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.lang.String str14 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node15.setBaseUri("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        java.lang.String str13 = xmlDeclaration10.outerHtml();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.clone();
        xmlDeclaration10.setBaseUri("<!>");
        xmlDeclaration10.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        org.jsoup.nodes.Node node25 = xmlDeclaration22.nextSibling();
        xmlDeclaration22.setBaseUri("<!>");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration22.outerHtmlTail(appendable28, 100, outputSettings30);
        boolean boolean33 = xmlDeclaration22.hasAttr("#declaration");
        int int34 = xmlDeclaration22.childNodeSize();
        java.lang.String str36 = xmlDeclaration22.absUrl("#declaration");
        boolean boolean37 = xmlDeclaration10.equals((java.lang.Object) xmlDeclaration22);
        org.jsoup.nodes.Node node39 = xmlDeclaration22.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration12.outerHtmlTail(appendable23, 1, outputSettings25);
        java.lang.String str28 = xmlDeclaration12.absUrl("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.nextSibling();
        xmlDeclaration32.setBaseUri("<!>");
        int int38 = xmlDeclaration32.siblingIndex();
        org.jsoup.nodes.Node node41 = xmlDeclaration32.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration32.attributes();
        java.lang.String str43 = xmlDeclaration32.toString();
        java.lang.String str44 = xmlDeclaration32.baseUri();
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        xmlDeclaration32.outerHtmlTail(appendable45, (int) '4', outputSettings47);
        java.lang.Appendable appendable49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        xmlDeclaration32.outerHtmlTail(appendable49, (int) (byte) 100, outputSettings51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = xmlDeclaration12.after((org.jsoup.nodes.Node) xmlDeclaration32);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable27, (int) '#', outputSettings29);
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
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parent();
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.removeAttr("hi!");
        boolean boolean24 = node11.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Node node25 = node23.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        int int14 = xmlDeclaration3.siblingIndex();
        java.lang.String str15 = xmlDeclaration3.name();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        java.lang.String str28 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.Document document29 = xmlDeclaration3.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass11 = nodeList10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Node node16 = node13.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        org.jsoup.nodes.Node node18 = node16.nextSibling();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.nextSibling();
        java.lang.String str15 = xmlDeclaration10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration10.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        java.lang.String str24 = xmlDeclaration20.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration20.toString();
        boolean boolean26 = xmlDeclaration10.equals((java.lang.Object) xmlDeclaration20);
        int int27 = xmlDeclaration10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration10.childNodes();
        java.lang.String str29 = xmlDeclaration10.toString();
        java.lang.String str30 = xmlDeclaration10.baseUri();
        java.lang.String str31 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean32 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration10);
        org.jsoup.nodes.Node node33 = xmlDeclaration10.clone();
        org.jsoup.nodes.Node node34 = xmlDeclaration10.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        java.lang.String str41 = xmlDeclaration38.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration38.childNodes();
        org.jsoup.nodes.Document document43 = xmlDeclaration38.ownerDocument();
        org.jsoup.nodes.Node node46 = xmlDeclaration38.attr("<?hi!>", "<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node34.after(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        int int22 = xmlDeclaration5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration5.childNodes();
        java.lang.String str25 = xmlDeclaration5.absUrl("#declaration");
        org.jsoup.nodes.Attributes attributes26 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.processStartTag("#declaration", attributes26);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        int int22 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node25 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?<?hi!>>", false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        int int34 = xmlDeclaration12.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration12.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.absUrl("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = node8.attr("<!<!>>", "<!>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.name();
        int int14 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) (short) 100, outputSettings17);
        java.lang.String str20 = xmlDeclaration3.absUrl("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node12 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node12.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("<!hi!>");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!hi!>" + "'", str13, "<!hi!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!>");
        java.lang.String str13 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.before("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        org.jsoup.nodes.Node node22 = node20.removeAttr("#declaration");
        org.jsoup.nodes.Node node23 = node22.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node22.attr("", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        int int10 = xmlDeclaration7.siblingIndex();
        java.lang.String str12 = xmlDeclaration7.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration7.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        xmlDeclaration17.setBaseUri("<!>");
        java.lang.String str24 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean25 = xmlDeclaration7.hasSameValue((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Attributes attributes26 = xmlDeclaration7.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!>>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.childNodes();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.parentNode();
        java.lang.String str14 = xmlDeclaration5.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        java.lang.String str22 = xmlDeclaration18.getWholeDeclaration();
        int int23 = xmlDeclaration18.siblingIndex();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        int int25 = xmlDeclaration18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration18.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration18.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.nextSibling();
        xmlDeclaration32.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration32.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.lang.String str45 = xmlDeclaration42.outerHtml();
        java.lang.String str46 = xmlDeclaration42.getWholeDeclaration();
        int int47 = xmlDeclaration42.siblingIndex();
        java.lang.String str48 = xmlDeclaration42.getWholeDeclaration();
        java.lang.Appendable appendable49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        xmlDeclaration42.outerHtmlTail(appendable49, (int) (byte) 1, outputSettings51);
        boolean boolean53 = xmlDeclaration32.hasSameValue((java.lang.Object) outputSettings51);
        boolean boolean55 = xmlDeclaration32.hasAttr("<?>");
        boolean boolean56 = xmlDeclaration18.equals((java.lang.Object) "<?>");
        org.jsoup.nodes.Attributes attributes57 = xmlDeclaration18.attributes();
        boolean boolean58 = xmlDeclaration5.hasSameValue((java.lang.Object) attributes57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes57);
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!>" + "'", str45, "<!>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        int int13 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "<!<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        int int9 = node8.childNodeSize();
        org.jsoup.nodes.Node node10 = node8.parent();
        java.lang.String str11 = node8.baseUri();
        java.lang.String str12 = node8.outerHtml();
        java.lang.String str13 = node8.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
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
        boolean boolean31 = node9.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node33 = node9.wrap("<!>");
        org.jsoup.nodes.Attributes attributes34 = node9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        java.lang.String str31 = xmlDeclaration27.getWholeDeclaration();
        int int32 = xmlDeclaration27.siblingIndex();
        java.lang.String str33 = xmlDeclaration27.getWholeDeclaration();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        xmlDeclaration27.outerHtmlTail(appendable34, (int) (byte) 1, outputSettings36);
        boolean boolean38 = xmlDeclaration17.hasSameValue((java.lang.Object) outputSettings36);
        boolean boolean40 = xmlDeclaration17.hasAttr("<?>");
        boolean boolean41 = xmlDeclaration3.equals((java.lang.Object) "<?>");
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration3.attributes();
        java.lang.String str43 = xmlDeclaration3.outerHtml();
        int int44 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration12.outerHtmlTail(appendable23, 1, outputSettings25);
        org.jsoup.nodes.Node node27 = xmlDeclaration12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node27.remove();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
            boolean boolean17 = xmlTreeBuilder0.processStartTag("<?#declaration>", attributes16);
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
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        xmlDeclaration3.setBaseUri("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.lang.String str21 = node20.baseUri();
        java.lang.String str23 = node20.absUrl("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.String str21 = xmlDeclaration14.attr("");
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) "");
        java.lang.String str23 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration3.attr("<!hi!>");
        java.lang.Class<?> wildcardClass26 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!<?>>");
        org.jsoup.nodes.Node node16 = node14.removeAttr("<?<?hi!>>");
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node19 = node17.removeAttr("<?<?hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node17.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", false);
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str17 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        org.jsoup.nodes.Node node24 = xmlDeclaration21.nextSibling();
        xmlDeclaration21.setBaseUri("<!>");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration21.outerHtmlTail(appendable27, 100, outputSettings29);
        boolean boolean32 = xmlDeclaration21.hasAttr("#declaration");
        java.lang.String str33 = xmlDeclaration21.toString();
        org.jsoup.nodes.Document document34 = xmlDeclaration21.ownerDocument();
        boolean boolean35 = xmlDeclaration3.equals((java.lang.Object) document34);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = document34.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!hi!>", false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        int int10 = xmlDeclaration5.siblingIndex();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        int int12 = xmlDeclaration5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration5.siblingNodes();
        java.lang.String str14 = xmlDeclaration5.toString();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
            java.lang.Class<?> wildcardClass12 = node11.getClass();
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration3.nextSibling();
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node13.setBaseUri("<!#declaration>");
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
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, (int) '4', outputSettings13);
        java.lang.String str15 = xmlDeclaration5.nodeName();
        java.lang.String str16 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration5.attr("#declaration");
        org.jsoup.nodes.Attributes attributes19 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xmlTreeBuilder0.processStartTag("<!>", attributes19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!hi!>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.lang.String str10 = xmlDeclaration7.outerHtml();
        org.jsoup.nodes.Node node11 = xmlDeclaration7.clone();
        xmlDeclaration7.setBaseUri("<!>");
        java.lang.String str14 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration7.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration7.childNodes();
        java.lang.String str18 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration7.attr("hi!", "hi!");
        org.jsoup.nodes.Node node23 = xmlDeclaration7.removeAttr("<!hi!>");
        boolean boolean25 = xmlDeclaration7.hasAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) (byte) 0, outputSettings16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node7.siblingIndex();
        int int14 = node7.childNodeSize();
        org.jsoup.nodes.Node node16 = node7.wrap("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("hi!");
        boolean boolean10 = xmlDeclaration3.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        org.jsoup.nodes.Node node26 = xmlDeclaration3.previousSibling();
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Node node16 = node13.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.traverse(nodeVisitor19);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, (int) (short) 10, outputSettings20);
        java.lang.String str22 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.Class<?> wildcardClass6 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<?>>" + "'", str4, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?hi!>", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?hi!>" + "'", str4, "<?hi!>");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parent();
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.removeAttr("hi!");
        boolean boolean24 = node11.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Node node25 = node23.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = node25.hasSameValue((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.lang.String str16 = xmlDeclaration13.outerHtml();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.clone();
        xmlDeclaration13.setBaseUri("<!>");
        java.lang.String str20 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration3.outerHtmlTail(appendable22, (int) (short) 100, outputSettings24);
        java.lang.String str27 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str33 = xmlDeclaration31.attr("");
        int int34 = xmlDeclaration31.siblingIndex();
        java.lang.String str35 = xmlDeclaration31.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        int int15 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration3.attributes();
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
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        java.lang.String str20 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.parent();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        org.jsoup.nodes.Node node24 = xmlDeclaration16.removeAttr("hi!");
        org.jsoup.nodes.Node node26 = node24.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration30.childNodes();
        org.jsoup.nodes.Node node34 = xmlDeclaration30.nextSibling();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        xmlDeclaration30.outerHtmlTail(appendable35, 100, outputSettings37);
        java.lang.String str39 = xmlDeclaration30.toString();
        xmlDeclaration30.setBaseUri("#declaration");
        boolean boolean42 = node26.hasSameValue((java.lang.Object) xmlDeclaration30);
        java.lang.String str43 = xmlDeclaration30.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = document12.after((org.jsoup.nodes.Node) xmlDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        int int46 = node35.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = node35.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        int int28 = xmlDeclaration23.siblingIndex();
        java.lang.String str29 = xmlDeclaration23.getWholeDeclaration();
        int int30 = xmlDeclaration23.childNodeSize();
        int int31 = xmlDeclaration23.childNodeSize();
        java.lang.String str32 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration23.nodeName();
        java.lang.String str35 = xmlDeclaration23.absUrl("<?>");
        org.jsoup.nodes.Attributes attributes36 = xmlDeclaration23.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration23.childNodesCopy();
        boolean boolean38 = xmlDeclaration3.equals((java.lang.Object) nodeList37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str6 = xmlDeclaration5.toString();
        xmlDeclaration5.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.siblingNodes();
        xmlDeclaration5.setBaseUri("<!<?>>");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.attr("<!>");
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str18 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str19 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "<?hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        int int12 = xmlDeclaration9.siblingIndex();
        java.lang.String str13 = xmlDeclaration9.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration9.parent();
        java.lang.String str15 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration9.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node17.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration23.outerHtmlTail(appendable28, 100, outputSettings30);
        java.lang.String str32 = xmlDeclaration23.toString();
        xmlDeclaration23.setBaseUri("#declaration");
        boolean boolean35 = node19.hasSameValue((java.lang.Object) xmlDeclaration23);
        boolean boolean36 = node4.equals((java.lang.Object) xmlDeclaration23);
        // The following exception was thrown during execution in test generation
        try {
            node4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.String str24 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<?hi!>", false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!>", "");
        int int12 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        java.lang.String str16 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.lang.String str23 = xmlDeclaration20.outerHtml();
        java.lang.String str24 = xmlDeclaration20.getWholeDeclaration();
        int int25 = xmlDeclaration20.siblingIndex();
        java.lang.String str26 = xmlDeclaration20.getWholeDeclaration();
        int int27 = xmlDeclaration20.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration20.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.nextSibling();
        xmlDeclaration32.setBaseUri("<!>");
        xmlDeclaration32.setBaseUri("#declaration");
        boolean boolean40 = xmlDeclaration20.equals((java.lang.Object) xmlDeclaration32);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        boolean boolean45 = xmlDeclaration20.hasSameValue((java.lang.Object) "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str51 = xmlDeclaration49.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlDeclaration49.childNodes();
        java.lang.String str53 = xmlDeclaration49.getWholeDeclaration();
        java.lang.String str54 = xmlDeclaration49.toString();
        java.lang.Appendable appendable55 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = null;
        xmlDeclaration49.outerHtmlTail(appendable55, (int) (short) 10, outputSettings57);
        int int59 = xmlDeclaration49.siblingIndex();
        boolean boolean60 = xmlDeclaration20.equals((java.lang.Object) int59);
        java.lang.Appendable appendable61 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = null;
        xmlDeclaration20.outerHtmlTail(appendable61, (int) '#', outputSettings63);
        boolean boolean65 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration20);
        boolean boolean67 = xmlDeclaration3.hasAttr("<!<?>>");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!>" + "'", str54, "<!>");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        org.jsoup.nodes.Document document28 = xmlDeclaration21.ownerDocument();
        java.lang.String str30 = xmlDeclaration21.absUrl("<!>");
        java.lang.String str31 = xmlDeclaration21.name();
        xmlDeclaration21.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node17.after((org.jsoup.nodes.Node) xmlDeclaration21);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.nextSibling();
        xmlDeclaration17.setBaseUri("<!>");
        int int23 = xmlDeclaration17.childNodeSize();
        int int24 = xmlDeclaration17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration17.childNodesCopy();
        java.lang.String str26 = xmlDeclaration17.name();
        org.jsoup.nodes.Node node27 = xmlDeclaration17.parent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        int int4 = xmlDeclaration3.childNodeSize();
        int int5 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        int int12 = xmlDeclaration9.siblingIndex();
        java.lang.String str13 = xmlDeclaration9.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration9.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration9.outerHtmlTail(appendable15, (int) '4', outputSettings17);
        java.lang.String str19 = xmlDeclaration9.nodeName();
        org.jsoup.nodes.Document document20 = xmlDeclaration9.ownerDocument();
        java.lang.String str22 = xmlDeclaration9.absUrl("#declaration");
        java.lang.String str24 = xmlDeclaration9.absUrl("hi!");
        java.lang.String str25 = xmlDeclaration9.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        org.jsoup.nodes.Node node32 = xmlDeclaration29.nextSibling();
        xmlDeclaration29.setBaseUri("<!>");
        int int35 = xmlDeclaration29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration29.childNodesCopy();
        boolean boolean37 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        int int10 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.attr("<!>", "");
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        node17.setBaseUri("<!#declaration>");
        org.jsoup.nodes.Node node20 = node17.parentNode();
        org.jsoup.nodes.Node node21 = node17.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parent();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.String str34 = node32.attr("<!<?>>");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!<?>>" + "'", str34, "<!<?>>");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        int int19 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.lang.String str26 = xmlDeclaration23.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration23.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration23.childNodesCopy();
        org.jsoup.nodes.Node node29 = xmlDeclaration23.previousSibling();
        org.jsoup.nodes.Document document30 = xmlDeclaration23.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) document30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        // The following exception was thrown during execution in test generation
        try {
            node22.remove();
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
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = node13.attributes();
        org.jsoup.nodes.Node node17 = node13.wrap("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.String str23 = xmlDeclaration3.absUrl("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.siblingNodes();
        java.lang.String str26 = xmlDeclaration3.attr("#declaration");
        org.jsoup.nodes.Node node29 = xmlDeclaration3.attr("<?<?>>", "<?#declaration>");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.String str9 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        xmlDeclaration3.outerHtmlTail(appendable5, 0, outputSettings7);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        java.lang.String str49 = xmlDeclaration26.attr("");
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str13 = xmlDeclaration3.attr("<!>");
        java.lang.String str14 = xmlDeclaration3.baseUri();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<!<?>>");
        xmlDeclaration3.setBaseUri("<?<?>>");
        boolean boolean15 = xmlDeclaration3.hasAttr("#declaration");
        xmlDeclaration3.setBaseUri("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.String str16 = node15.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }
}

