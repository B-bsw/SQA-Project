package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str13 = xmlDeclaration3.attr("<!#declaration>");
        java.lang.String str14 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        java.lang.String str37 = xmlDeclaration23.outerHtml();
        java.lang.String str38 = xmlDeclaration23.name();
        org.jsoup.nodes.Node node39 = xmlDeclaration23.parent();
        java.lang.String str40 = xmlDeclaration23.name();
        boolean boolean42 = xmlDeclaration23.hasAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = xmlDeclaration23.after("<!<?>>");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        int int22 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node25 = node23.wrap("<!>");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration28.toString();
        boolean boolean34 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration28);
        int int35 = xmlDeclaration18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration18.childNodes();
        org.jsoup.nodes.Node node37 = xmlDeclaration18.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration18.childNodes();
        xmlDeclaration18.setBaseUri("<!<!>>");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.Node node42 = xmlDeclaration18.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        int int82 = xmlDeclaration68.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?<!<?>>>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.lang.String str36 = xmlDeclaration33.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.clone();
        boolean boolean38 = xmlDeclaration24.equals((java.lang.Object) xmlDeclaration33);
        boolean boolean39 = xmlDeclaration3.hasSameValue((java.lang.Object) boolean38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        xmlDeclaration3.outerHtmlTail(appendable41, (int) (byte) 100, outputSettings43);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        org.jsoup.nodes.Node node27 = xmlDeclaration3.parentNode();
        java.lang.String str28 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str7 = node5.absUrl("<?<?>>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<!>");
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?<!hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "<!hi!>", false);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<?<?hi!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<?#declaration>", "<!>");
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!<?<?hi!>>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        org.jsoup.nodes.Node node21 = xmlDeclaration18.nextSibling();
        xmlDeclaration18.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.Node node26 = xmlDeclaration18.clone();
        java.lang.String str27 = xmlDeclaration18.name();
        int int28 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.nextSibling();
        xmlDeclaration32.setBaseUri("<!>");
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration32.outerHtmlTail(appendable38, 100, outputSettings40);
        boolean boolean42 = xmlDeclaration18.hasSameValue((java.lang.Object) appendable38);
        org.jsoup.nodes.Node node45 = xmlDeclaration18.attr("hi!", "");
        org.jsoup.nodes.Node node47 = node45.removeAttr("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration51 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str53 = xmlDeclaration51.attr("");
        int int54 = xmlDeclaration51.siblingIndex();
        java.lang.String str56 = xmlDeclaration51.absUrl("<!>");
        java.lang.String str57 = xmlDeclaration51.getWholeDeclaration();
        org.jsoup.nodes.Node node58 = xmlDeclaration51.parentNode();
        java.lang.String str60 = xmlDeclaration51.attr("");
        boolean boolean61 = node45.equals((java.lang.Object) xmlDeclaration51);
        org.jsoup.nodes.Node node62 = node45.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = node14.after(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str13 = xmlDeclaration3.baseUri();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration3.attr("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node13.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, 100, outputSettings8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.lang.String str16 = xmlDeclaration13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.childNodes();
        java.lang.String str18 = xmlDeclaration13.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        org.jsoup.nodes.Node node25 = xmlDeclaration22.nextSibling();
        xmlDeclaration22.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration22.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration22.childNodes();
        boolean boolean30 = xmlDeclaration13.hasSameValue((java.lang.Object) xmlDeclaration22);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.lang.String str37 = xmlDeclaration34.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration34.childNodes();
        int int39 = xmlDeclaration34.childNodeSize();
        boolean boolean40 = xmlDeclaration22.hasSameValue((java.lang.Object) xmlDeclaration34);
        java.lang.String str41 = xmlDeclaration22.nodeName();
        java.lang.String str42 = xmlDeclaration22.getWholeDeclaration();
        java.lang.String str43 = xmlDeclaration22.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node10.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        java.lang.String str8 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node20 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = node20.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!>>", "<?<?hi!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node23 = node22.parent();
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node10 = node8.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = node10.hasAttr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!<!>>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.Class<?> wildcardClass5 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str11 = xmlDeclaration3.attr("<!hi!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("<?hi!>", "");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        java.lang.Object obj15 = null;
        boolean boolean16 = xmlDeclaration3.hasSameValue(obj15);
        java.lang.String str17 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        java.lang.String str49 = node48.baseUri();
        org.jsoup.nodes.Document document50 = node48.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(document50);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.processStartTag("hi!", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration12.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        int int16 = xmlDeclaration12.siblingIndex();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<?>");
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration3.outerHtmlTail(appendable16, 10, outputSettings18);
        java.lang.String str20 = xmlDeclaration3.toString();
        java.lang.String str21 = xmlDeclaration3.nodeName();
        java.lang.String str22 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
        org.jsoup.nodes.Document document36 = xmlDeclaration3.ownerDocument();
        java.lang.String str37 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<!>");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        java.lang.String str6 = xmlDeclaration5.toString();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("#declaration", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!hi!>" + "'", str6, "<!hi!>");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!>>", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration9.childNodes();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.nextSibling();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration9.outerHtmlTail(appendable14, 100, outputSettings16);
        org.jsoup.nodes.Node node18 = xmlDeclaration9.nextSibling();
        java.lang.String str19 = xmlDeclaration9.name();
        org.jsoup.nodes.Node node22 = xmlDeclaration9.attr("<!<?>>", "<!hi!>");
        boolean boolean23 = node5.equals((java.lang.Object) "<!<?>>");
        boolean boolean25 = node5.hasAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        xmlDeclaration3.setBaseUri("<!<!>>");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node27 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node28 = node27.previousSibling();
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.childNodes();
        org.jsoup.nodes.Document document21 = xmlDeclaration16.ownerDocument();
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Node node24 = xmlDeclaration3.wrap("<!<?>>");
        java.lang.String str25 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration3.outerHtmlTail(appendable26, 1, outputSettings28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        java.lang.String str14 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        java.lang.String str38 = xmlDeclaration3.absUrl("#declaration");
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable39, (int) (byte) 10, outputSettings41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("hi!");
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        boolean boolean8 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
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
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node17.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.toString();
        java.lang.String str32 = xmlDeclaration26.toString();
        java.lang.String str33 = xmlDeclaration26.baseUri();
        org.jsoup.nodes.Node node35 = xmlDeclaration26.removeAttr("<!>");
        boolean boolean36 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        java.lang.String str37 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node40 = xmlDeclaration3.attr("<!hi!>", "<?<!<?>>>");
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
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before("<?<?>>");
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
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        java.lang.String str34 = xmlDeclaration17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration17.childNodesCopy();
        java.lang.String str36 = xmlDeclaration17.outerHtml();
        java.lang.String str38 = xmlDeclaration17.attr("<!<!>>");
        org.jsoup.nodes.Node node39 = xmlDeclaration17.parent();
        java.lang.String str40 = xmlDeclaration17.baseUri();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        xmlDeclaration17.outerHtmlTail(appendable41, 1, outputSettings43);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        org.jsoup.nodes.Document document27 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node32 = xmlDeclaration31.parent();
        java.lang.String str33 = xmlDeclaration31.toString();
        java.lang.String str35 = xmlDeclaration31.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        java.lang.String str42 = xmlDeclaration39.outerHtml();
        boolean boolean44 = xmlDeclaration39.hasAttr("<!>");
        org.jsoup.nodes.Node node46 = xmlDeclaration39.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration39.childNodes();
        boolean boolean48 = xmlDeclaration31.hasSameValue((java.lang.Object) nodeList47);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        org.jsoup.nodes.Node node55 = xmlDeclaration52.nextSibling();
        xmlDeclaration52.setBaseUri("<!>");
        int int58 = xmlDeclaration52.siblingIndex();
        org.jsoup.nodes.Node node60 = xmlDeclaration52.removeAttr("<?>");
        java.lang.String str61 = xmlDeclaration52.name();
        org.jsoup.nodes.Node node62 = xmlDeclaration52.clone();
        boolean boolean63 = xmlDeclaration31.hasSameValue((java.lang.Object) node62);
        org.jsoup.nodes.Node node66 = xmlDeclaration31.attr("<!hi!>", "hi!");
        java.lang.String str67 = xmlDeclaration31.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration71 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration75 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean76 = xmlDeclaration71.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes77 = xmlDeclaration71.attributes();
        org.jsoup.nodes.Node node79 = xmlDeclaration71.wrap("<!#declaration>");
        java.lang.String str80 = xmlDeclaration71.name();
        java.lang.String str81 = xmlDeclaration71.name();
        boolean boolean82 = xmlDeclaration31.hasSameValue((java.lang.Object) xmlDeclaration71);
        boolean boolean83 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration71);
        java.lang.String str84 = xmlDeclaration3.nodeName();
        java.lang.String str85 = xmlDeclaration3.nodeName();
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
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "#declaration" + "'", str84, "#declaration");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "#declaration" + "'", str85, "#declaration");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, 10, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration3.hasAttr("<?>");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '#', outputSettings14);
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration20.siblingNodes();
        org.jsoup.nodes.Document document28 = xmlDeclaration20.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.after((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration15.outerHtmlTail(appendable21, 100, outputSettings23);
        java.lang.String str25 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Attributes attributes26 = xmlDeclaration15.attributes();
        xmlDeclaration15.setBaseUri("hi!");
        java.lang.String str30 = xmlDeclaration15.absUrl("<!hi!>");
        org.jsoup.nodes.Node node32 = xmlDeclaration15.wrap("<!#declaration>");
        boolean boolean33 = xmlDeclaration3.equals((java.lang.Object) "<!#declaration>");
        org.jsoup.nodes.Document document34 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = document34.absUrl("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(document34);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!<?>>>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        xmlDeclaration3.setBaseUri("<!hi!>");
        int int18 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Attributes attributes19 = xmlDeclaration3.attributes();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?<?hi!>>>", "<!>", true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
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
        int int34 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node35 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node36 = xmlDeclaration3.parentNode();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        java.lang.String str22 = node10.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.previousSibling();
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parent();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        int int9 = node8.childNodeSize();
        java.lang.String str11 = node8.absUrl("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        int int13 = node8.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        java.lang.String str9 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        org.jsoup.nodes.Node node31 = node29.removeAttr("<!#declaration>");
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
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        int int13 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodesCopy();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        org.jsoup.nodes.Node node22 = xmlDeclaration19.clone();
        int int23 = xmlDeclaration19.childNodeSize();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parentNode();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration19.outerHtmlTail(appendable25, (int) '4', outputSettings27);
        java.lang.String str29 = xmlDeclaration19.toString();
        java.lang.String str30 = xmlDeclaration19.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
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
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str11 = xmlDeclaration3.attr("<!hi!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("<?hi!>", "");
        boolean boolean16 = xmlDeclaration3.hasAttr("");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (int) (short) 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        xmlDeclaration3.outerHtmlTail(appendable5, (int) (short) 100, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.siblingNodes();
        org.jsoup.nodes.Node node17 = node13.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node20 = node17.attr("<?<!>>", "<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.String str30 = xmlDeclaration25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.childNodesCopy();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        java.lang.String str33 = xmlDeclaration25.name();
        java.lang.String str34 = xmlDeclaration25.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        java.lang.String str14 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration28.toString();
        boolean boolean34 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration28);
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration18.attributes();
        org.jsoup.nodes.Node node36 = xmlDeclaration18.previousSibling();
        org.jsoup.nodes.Node node37 = xmlDeclaration18.previousSibling();
        org.jsoup.nodes.Node node38 = xmlDeclaration18.clone();
        int int39 = xmlDeclaration18.siblingIndex();
        java.lang.String str40 = xmlDeclaration18.toString();
        java.lang.String str42 = xmlDeclaration18.absUrl("hi!");
        boolean boolean43 = xmlDeclaration3.hasSameValue((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.wrap("<!>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
            boolean boolean29 = node27.hasAttr("<?<?hi!>>");
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
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        java.lang.String str17 = xmlDeclaration3.toString();
        java.lang.String str19 = xmlDeclaration3.attr("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.lang.String str40 = xmlDeclaration37.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration37.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration37.childNodesCopy();
        org.jsoup.nodes.Node node44 = xmlDeclaration37.removeAttr("<?<?>>");
        boolean boolean45 = xmlDeclaration17.equals((java.lang.Object) "<?<?>>");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        java.lang.String str21 = node19.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node19.before("<?>");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        int int22 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) -1, outputSettings25);
        java.lang.Class<?> wildcardClass27 = xmlDeclaration3.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#declaration", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node6 = node4.removeAttr("<?<?>>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, 100, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodes();
        java.lang.String str22 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.lang.String str29 = xmlDeclaration26.outerHtml();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.clone();
        java.lang.String str31 = node30.baseUri();
        boolean boolean32 = xmlDeclaration18.equals((java.lang.Object) str31);
        org.jsoup.nodes.Node node35 = xmlDeclaration18.attr("hi!", "#declaration");
        org.jsoup.nodes.Node node37 = node35.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        int int44 = xmlDeclaration41.siblingIndex();
        org.jsoup.nodes.Node node45 = xmlDeclaration41.nextSibling();
        org.jsoup.nodes.Node node46 = xmlDeclaration41.parentNode();
        org.jsoup.nodes.Node node48 = xmlDeclaration41.removeAttr("<!>");
        org.jsoup.nodes.Node node49 = xmlDeclaration41.previousSibling();
        boolean boolean50 = node35.equals((java.lang.Object) xmlDeclaration41);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node32 = xmlDeclaration31.parent();
        java.lang.String str33 = xmlDeclaration31.toString();
        java.lang.String str35 = xmlDeclaration31.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        java.lang.String str42 = xmlDeclaration39.outerHtml();
        boolean boolean44 = xmlDeclaration39.hasAttr("<!>");
        org.jsoup.nodes.Node node46 = xmlDeclaration39.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration39.childNodes();
        boolean boolean48 = xmlDeclaration31.hasSameValue((java.lang.Object) nodeList47);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        org.jsoup.nodes.Node node55 = xmlDeclaration52.nextSibling();
        xmlDeclaration52.setBaseUri("<!>");
        int int58 = xmlDeclaration52.siblingIndex();
        org.jsoup.nodes.Node node60 = xmlDeclaration52.removeAttr("<?>");
        java.lang.String str61 = xmlDeclaration52.name();
        org.jsoup.nodes.Node node62 = xmlDeclaration52.clone();
        boolean boolean63 = xmlDeclaration31.hasSameValue((java.lang.Object) node62);
        boolean boolean64 = node26.hasSameValue((java.lang.Object) node62);
        java.lang.String str66 = node26.attr("<?>");
        org.jsoup.nodes.Attributes attributes67 = node26.attributes();
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
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(attributes67);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.after("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        xmlDeclaration11.setBaseUri("<?#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration11.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        int int24 = xmlDeclaration21.siblingIndex();
        java.lang.String str25 = xmlDeclaration21.toString();
        org.jsoup.nodes.Node node26 = xmlDeclaration21.parent();
        java.lang.String str27 = xmlDeclaration21.getWholeDeclaration();
        org.jsoup.nodes.Node node29 = xmlDeclaration21.removeAttr("hi!");
        org.jsoup.nodes.Node node31 = node29.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration35.childNodes();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.nextSibling();
        java.lang.Appendable appendable40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        xmlDeclaration35.outerHtmlTail(appendable40, 100, outputSettings42);
        java.lang.String str44 = xmlDeclaration35.toString();
        xmlDeclaration35.setBaseUri("#declaration");
        boolean boolean47 = node31.hasSameValue((java.lang.Object) xmlDeclaration35);
        java.lang.String str48 = xmlDeclaration35.toString();
        org.jsoup.nodes.Attributes attributes49 = xmlDeclaration35.attributes();
        boolean boolean50 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes49);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        java.lang.String str25 = node23.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean31 = xmlDeclaration29.equals((java.lang.Object) (byte) 10);
        boolean boolean33 = xmlDeclaration29.hasAttr("#declaration");
        org.jsoup.nodes.Node node35 = xmlDeclaration29.removeAttr("#declaration");
        org.jsoup.nodes.Node node37 = node35.removeAttr("<!<!>>");
        boolean boolean38 = node23.equals((java.lang.Object) "<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        int int45 = xmlDeclaration42.siblingIndex();
        org.jsoup.nodes.Node node46 = xmlDeclaration42.nextSibling();
        java.lang.String str47 = xmlDeclaration42.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlDeclaration42.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlDeclaration42.siblingNodes();
        org.jsoup.nodes.Document document50 = xmlDeclaration42.ownerDocument();
        org.jsoup.nodes.Node node52 = xmlDeclaration42.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node53 = xmlDeclaration42.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration57 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str59 = xmlDeclaration57.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlDeclaration57.childNodes();
        java.lang.String str61 = xmlDeclaration57.getWholeDeclaration();
        java.lang.String str62 = xmlDeclaration57.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlDeclaration57.childNodesCopy();
        org.jsoup.nodes.Node node64 = xmlDeclaration57.parent();
        java.lang.String str65 = xmlDeclaration57.name();
        int int66 = xmlDeclaration57.siblingIndex();
        boolean boolean67 = xmlDeclaration42.hasSameValue((java.lang.Object) xmlDeclaration57);
        java.lang.String str68 = xmlDeclaration42.outerHtml();
        boolean boolean69 = node23.equals((java.lang.Object) xmlDeclaration42);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#declaration" + "'", str47, "#declaration");
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!>" + "'", str62, "<!>");
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<!>" + "'", str68, "<!>");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("<!<?<?>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.wrap("<!<!>>");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node12.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        org.jsoup.nodes.Node node16 = node12.wrap("<?<!hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("<!hi!>");
        java.lang.String str14 = xmlDeclaration3.attr("");
        java.lang.String str16 = xmlDeclaration3.attr("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
        int int49 = node48.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
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
        org.jsoup.nodes.Node node31 = xmlDeclaration3.nextSibling();
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
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        java.lang.String str39 = xmlDeclaration26.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        org.jsoup.nodes.Document document37 = xmlDeclaration12.ownerDocument();
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
        org.junit.Assert.assertNull(document37);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("<!hi!>");
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        java.lang.String str24 = xmlDeclaration3.baseUri();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        org.jsoup.nodes.Node node32 = xmlDeclaration3.wrap("<?>");
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!<?<?>>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        int int5 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        org.jsoup.nodes.Node node31 = xmlDeclaration26.parentNode();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.removeAttr("<!>");
        org.jsoup.nodes.Node node34 = xmlDeclaration26.previousSibling();
        boolean boolean35 = node20.equals((java.lang.Object) xmlDeclaration26);
        // The following exception was thrown during execution in test generation
        try {
            node20.remove();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
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
        int int22 = xmlDeclaration13.childNodeSize();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration13.outerHtmlTail(appendable23, (int) (byte) 10, outputSettings25);
        org.jsoup.nodes.Node node27 = xmlDeclaration13.clone();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration3.outerHtmlTail(appendable19, (int) (short) 10, outputSettings21);
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
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration26.outerHtmlTail(appendable31, 100, outputSettings33);
        org.jsoup.nodes.Node node35 = xmlDeclaration26.nextSibling();
        boolean boolean36 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Node node39 = xmlDeclaration5.attr("<?hi!>", "");
        org.jsoup.nodes.Node node41 = xmlDeclaration5.removeAttr("<?>");
        java.lang.Appendable appendable42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        xmlDeclaration5.outerHtmlTail(appendable42, (int) '4', outputSettings44);
        org.jsoup.nodes.Attributes attributes46 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = xmlTreeBuilder0.processStartTag("<?<!<?>>>", attributes46);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node28 = xmlDeclaration3.attr("<!<!>>", "<!<?>>");
        java.lang.String str29 = xmlDeclaration3.toString();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration3.outerHtmlTail(appendable30, 1, outputSettings32);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<?#declaration>", "<!>");
        node10.setBaseUri("<?hi!>");
        boolean boolean14 = node10.hasAttr("<?#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration28.toString();
        boolean boolean34 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration28);
        int int35 = xmlDeclaration18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration18.childNodes();
        java.lang.String str38 = xmlDeclaration18.absUrl("#declaration");
        org.jsoup.nodes.Attributes attributes39 = xmlDeclaration18.attributes();
        java.lang.String str41 = xmlDeclaration18.attr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.Node node44 = xmlDeclaration18.removeAttr("<?<!hi!>>");
        boolean boolean45 = node10.hasSameValue((java.lang.Object) xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        boolean boolean7 = xmlDeclaration3.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("<!<?>>");
        int int13 = xmlDeclaration3.siblingIndex();
        java.lang.String str14 = xmlDeclaration3.name();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!>", "");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, 10, outputSettings15);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node21 = xmlDeclaration20.parent();
        java.lang.String str22 = xmlDeclaration20.toString();
        java.lang.String str24 = xmlDeclaration20.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.lang.String str31 = xmlDeclaration28.outerHtml();
        boolean boolean33 = xmlDeclaration28.hasAttr("<!>");
        org.jsoup.nodes.Node node35 = xmlDeclaration28.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration28.childNodes();
        boolean boolean37 = xmlDeclaration20.hasSameValue((java.lang.Object) nodeList36);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        org.jsoup.nodes.Node node44 = xmlDeclaration41.nextSibling();
        xmlDeclaration41.setBaseUri("<!>");
        int int47 = xmlDeclaration41.siblingIndex();
        org.jsoup.nodes.Node node49 = xmlDeclaration41.removeAttr("<?>");
        java.lang.String str50 = xmlDeclaration41.name();
        org.jsoup.nodes.Node node51 = xmlDeclaration41.clone();
        boolean boolean52 = xmlDeclaration20.hasSameValue((java.lang.Object) node51);
        org.jsoup.nodes.Node node55 = xmlDeclaration20.attr("<!hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = xmlDeclaration3.before(node55);
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        org.jsoup.nodes.Node node32 = xmlDeclaration3.clone();
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
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node12.hasAttr("<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        node13.setBaseUri("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.after("<!<?<?hi!>>>");
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
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration5.childNodesCopy();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.attr("hi!", "");
        org.jsoup.nodes.Node node14 = xmlDeclaration5.previousSibling();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (-1.0f));
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        int int14 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        org.jsoup.nodes.Node node19 = node8.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<!<!>>>", "<!<!>>", false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        boolean boolean30 = xmlDeclaration18.hasAttr("<?>");
        java.lang.String str32 = xmlDeclaration18.absUrl("<!#declaration>");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?<!<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        int int16 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration9.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        org.jsoup.nodes.Node node30 = node10.attr("<?<?hi!>>", "hi!");
        org.jsoup.nodes.Node node32 = node10.removeAttr("<!<?<?hi!>>>");
        int int33 = node10.childNodeSize();
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.lang.String str16 = xmlDeclaration13.outerHtml();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        int int18 = xmlDeclaration13.siblingIndex();
        java.lang.String str19 = xmlDeclaration13.getWholeDeclaration();
        int int20 = xmlDeclaration13.childNodeSize();
        org.jsoup.nodes.Node node21 = xmlDeclaration13.nextSibling();
        int int22 = xmlDeclaration13.childNodeSize();
        java.lang.Class<?> wildcardClass23 = xmlDeclaration13.getClass();
        boolean boolean24 = node9.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.absUrl("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<?<!<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        org.jsoup.nodes.Document document27 = xmlDeclaration3.ownerDocument();
        java.lang.String str28 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.before("<?<!hi!>>");
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration8.nextSibling();
        java.lang.String str13 = xmlDeclaration8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration8.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration8.siblingNodes();
        org.jsoup.nodes.Document document16 = xmlDeclaration8.ownerDocument();
        org.jsoup.nodes.Node node18 = xmlDeclaration8.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node19 = xmlDeclaration8.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration23.childNodesCopy();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.parent();
        java.lang.String str31 = xmlDeclaration23.name();
        int int32 = xmlDeclaration23.siblingIndex();
        boolean boolean33 = xmlDeclaration8.hasSameValue((java.lang.Object) xmlDeclaration23);
        boolean boolean35 = xmlDeclaration23.hasAttr("<?>");
        java.lang.String str36 = xmlDeclaration23.name();
        java.lang.String str37 = xmlDeclaration23.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<?>>" + "'", str4, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = document32.parent();
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
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        org.jsoup.nodes.Node node25 = xmlDeclaration15.removeAttr("<!<!>>");
        org.jsoup.nodes.Node node26 = xmlDeclaration15.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration15.before("<!hi!>");
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration50 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str52 = xmlDeclaration50.attr("");
        java.lang.String str53 = xmlDeclaration50.outerHtml();
        org.jsoup.nodes.Node node54 = xmlDeclaration50.clone();
        xmlDeclaration50.setBaseUri("<!>");
        int int57 = xmlDeclaration50.siblingIndex();
        java.lang.String str58 = xmlDeclaration50.name();
        int int59 = xmlDeclaration50.childNodeSize();
        int int60 = xmlDeclaration50.childNodeSize();
        org.jsoup.nodes.Attributes attributes61 = xmlDeclaration50.attributes();
        boolean boolean62 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration50);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!>" + "'", str53, "<!>");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.nextSibling();
        java.lang.String str18 = node13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node13.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<?>>", false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node15 = xmlDeclaration14.clone();
        org.jsoup.nodes.Node node16 = node15.clone();
        java.lang.String str18 = node16.attr("");
        java.lang.String str20 = node16.attr("hi!");
        org.jsoup.nodes.Node node22 = node16.removeAttr("<?>");
        org.jsoup.nodes.Node node23 = node16.clone();
        java.lang.String str25 = node23.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, 100, outputSettings8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.Node node20 = xmlDeclaration13.parent();
        org.jsoup.nodes.Document document21 = xmlDeclaration13.ownerDocument();
        boolean boolean22 = xmlDeclaration3.hasSameValue((java.lang.Object) document21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Node node29 = xmlDeclaration26.nextSibling();
        xmlDeclaration26.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration26.childNodesCopy();
        org.jsoup.nodes.Node node34 = xmlDeclaration26.clone();
        java.lang.String str35 = xmlDeclaration26.name();
        int int36 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        org.jsoup.nodes.Node node43 = xmlDeclaration40.nextSibling();
        xmlDeclaration40.setBaseUri("<!>");
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        xmlDeclaration40.outerHtmlTail(appendable46, 100, outputSettings48);
        boolean boolean50 = xmlDeclaration26.hasSameValue((java.lang.Object) appendable46);
        org.jsoup.nodes.Node node53 = xmlDeclaration26.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = document21.hasSameValue((java.lang.Object) node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        int int39 = xmlDeclaration36.siblingIndex();
        java.lang.String str40 = xmlDeclaration36.toString();
        org.jsoup.nodes.Node node41 = xmlDeclaration36.parent();
        java.lang.String str42 = xmlDeclaration36.getWholeDeclaration();
        boolean boolean44 = xmlDeclaration36.hasSameValue((java.lang.Object) (-1.0f));
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration36.childNodes();
        boolean boolean46 = node31.equals((java.lang.Object) nodeList45);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration50 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str52 = xmlDeclaration50.attr("");
        org.jsoup.nodes.Node node53 = xmlDeclaration50.clone();
        java.lang.Appendable appendable54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = null;
        xmlDeclaration50.outerHtmlTail(appendable54, 10, outputSettings56);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration61 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str63 = xmlDeclaration61.attr("");
        org.jsoup.nodes.Node node64 = xmlDeclaration61.nextSibling();
        xmlDeclaration61.setBaseUri("<!>");
        int int67 = xmlDeclaration61.siblingIndex();
        org.jsoup.nodes.Node node70 = xmlDeclaration61.attr("<!>", "<!>");
        boolean boolean71 = xmlDeclaration50.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document72 = xmlDeclaration50.ownerDocument();
        org.jsoup.nodes.Node node73 = xmlDeclaration50.previousSibling();
        boolean boolean74 = node31.hasSameValue((java.lang.Object) xmlDeclaration50);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(document72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<?<!>>", false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node29 = xmlDeclaration28.parent();
        java.lang.String str30 = xmlDeclaration28.toString();
        java.lang.String str32 = xmlDeclaration28.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.lang.String str39 = xmlDeclaration36.outerHtml();
        boolean boolean41 = xmlDeclaration36.hasAttr("<!>");
        org.jsoup.nodes.Node node43 = xmlDeclaration36.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration36.childNodes();
        boolean boolean45 = xmlDeclaration28.hasSameValue((java.lang.Object) nodeList44);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str51 = xmlDeclaration49.attr("");
        org.jsoup.nodes.Node node52 = xmlDeclaration49.nextSibling();
        xmlDeclaration49.setBaseUri("<!>");
        int int55 = xmlDeclaration49.siblingIndex();
        org.jsoup.nodes.Node node57 = xmlDeclaration49.removeAttr("<?>");
        java.lang.String str58 = xmlDeclaration49.name();
        org.jsoup.nodes.Node node59 = xmlDeclaration49.clone();
        boolean boolean60 = xmlDeclaration28.hasSameValue((java.lang.Object) node59);
        org.jsoup.nodes.Node node63 = xmlDeclaration28.attr("<!hi!>", "hi!");
        java.lang.String str64 = node63.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration68 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node70 = xmlDeclaration68.removeAttr("#declaration");
        java.lang.String str71 = xmlDeclaration68.baseUri();
        java.lang.String str72 = xmlDeclaration68.outerHtml();
        org.jsoup.nodes.Node node74 = xmlDeclaration68.wrap("<?<?>>");
        java.lang.String str75 = xmlDeclaration68.outerHtml();
        boolean boolean76 = node63.equals((java.lang.Object) str75);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node77 = node23.after(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "#declaration" + "'", str64, "#declaration");
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!>" + "'", str72, "<!>");
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!>" + "'", str75, "<!>");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?<!hi!>>", true);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.attr("<!<?>>", "<!<?<?>>>");
        java.lang.String str18 = node16.attr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("<!<?<?hi!>>>", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.nextSibling();
        int int16 = xmlDeclaration10.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration20.siblingNodes();
        org.jsoup.nodes.Attributes attributes25 = xmlDeclaration20.attributes();
        org.jsoup.nodes.Document document26 = xmlDeclaration20.ownerDocument();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration20.outerHtmlTail(appendable27, 0, outputSettings29);
        org.jsoup.nodes.Node node31 = xmlDeclaration20.parent();
        boolean boolean32 = xmlDeclaration10.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration10.siblingNodes();
        java.lang.String str34 = xmlDeclaration10.getWholeDeclaration();
        int int35 = xmlDeclaration10.childNodeSize();
        org.jsoup.nodes.Node node38 = xmlDeclaration10.attr("<!<!>>", "<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration3.after(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node10 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str20 = xmlDeclaration15.absUrl("<!>");
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.clone();
        org.jsoup.nodes.Attributes attributes24 = xmlDeclaration15.attributes();
        org.jsoup.nodes.Node node26 = xmlDeclaration15.wrap("<?<?>>");
        boolean boolean27 = xmlDeclaration3.equals((java.lang.Object) node26);
        xmlDeclaration3.setBaseUri("<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        boolean boolean5 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) -1, outputSettings10);
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("<!>", "");
        int int15 = node14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node12 = node10.wrap("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration3.attr("<!#declaration>", "<?<?>>");
        java.lang.String str23 = xmlDeclaration3.attr("<!<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!>>", "<?<!<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!hi!>>", "<?<!<!>>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("<?<!hi!>>", "<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        int int26 = xmlDeclaration23.siblingIndex();
        java.lang.String str28 = xmlDeclaration23.absUrl("<!>");
        java.lang.String str29 = xmlDeclaration23.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.parentNode();
        java.lang.String str32 = xmlDeclaration23.attr("");
        java.lang.String str33 = xmlDeclaration23.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node19.before((org.jsoup.nodes.Node) xmlDeclaration23);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration12.wrap("<?>");
        org.jsoup.nodes.Node node30 = xmlDeclaration12.parentNode();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        boolean boolean11 = xmlDeclaration3.hasAttr("");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        boolean boolean14 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str15 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration3.outerHtmlTail(appendable17, (int) (short) 0, outputSettings19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Object obj11 = null;
        boolean boolean12 = xmlDeclaration3.equals(obj11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, 0, outputSettings15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
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
            node12.remove();
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
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        java.lang.String str15 = node11.attr("");
        node11.setBaseUri("");
        org.jsoup.nodes.Node node18 = node11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node18.attr("<?<?hi!>>", "<?<?>>");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!hi!>", "<?<!<?>>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.wrap("");
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
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?<?hi!>>>", "<!<!>>", false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?<?hi!>>>", "<?>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
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
        org.jsoup.nodes.Node node16 = node12.wrap("<?<?hi!>>");
        org.jsoup.nodes.Node node17 = node12.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
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
        xmlDeclaration11.setBaseUri("<?#declaration>");
        int int27 = xmlDeclaration11.childNodeSize();
        java.lang.String str28 = xmlDeclaration11.name();
        xmlDeclaration11.setBaseUri("<?<!hi!>>");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, 100, outputSettings19);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?<?hi!>>>", "<!<?<?hi!>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
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
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.wrap("<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration8.nextSibling();
        java.lang.String str13 = xmlDeclaration8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration8.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodes();
        java.lang.String str22 = xmlDeclaration18.getWholeDeclaration();
        java.lang.String str23 = xmlDeclaration18.toString();
        boolean boolean24 = xmlDeclaration8.equals((java.lang.Object) xmlDeclaration18);
        int int25 = xmlDeclaration8.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration8.childNodesCopy();
        org.jsoup.nodes.Node node28 = xmlDeclaration8.removeAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node28.siblingNodes();
        boolean boolean30 = node4.hasSameValue((java.lang.Object) node28);
        java.lang.String str31 = node28.baseUri();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node10 = xmlDeclaration9.parent();
        java.lang.String str11 = xmlDeclaration9.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        boolean boolean20 = xmlDeclaration9.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node22 = node19.removeAttr("<!>");
        org.jsoup.nodes.Node node25 = node19.attr("<!<!>>", "<?>");
        org.jsoup.nodes.Node node27 = node19.removeAttr("<!<!>>");
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node29 = xmlDeclaration3.clone();
        java.lang.String str31 = node29.attr("<?#declaration>");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "<!hi!>", false);
        int int22 = xmlDeclaration21.siblingIndex();
        java.lang.String str24 = xmlDeclaration21.attr("<?>");
        boolean boolean25 = node17.equals((java.lang.Object) xmlDeclaration21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration26.outerHtmlTail(appendable31, 100, outputSettings33);
        org.jsoup.nodes.Node node35 = xmlDeclaration26.nextSibling();
        boolean boolean36 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Node node39 = xmlDeclaration5.attr("<?hi!>", "");
        java.lang.String str40 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node41 = xmlDeclaration5.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str47 = xmlDeclaration45.attr("");
        org.jsoup.nodes.Node node48 = xmlDeclaration45.clone();
        org.jsoup.nodes.Node node49 = node48.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration53 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str55 = xmlDeclaration53.attr("");
        int int56 = xmlDeclaration53.siblingIndex();
        org.jsoup.nodes.Node node57 = xmlDeclaration53.nextSibling();
        java.lang.String str58 = xmlDeclaration53.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlDeclaration53.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration63 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str65 = xmlDeclaration63.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlDeclaration63.childNodes();
        java.lang.String str67 = xmlDeclaration63.getWholeDeclaration();
        java.lang.String str68 = xmlDeclaration63.toString();
        boolean boolean69 = xmlDeclaration53.equals((java.lang.Object) xmlDeclaration63);
        org.jsoup.nodes.Attributes attributes70 = xmlDeclaration53.attributes();
        boolean boolean71 = node49.equals((java.lang.Object) xmlDeclaration53);
        java.lang.String str72 = xmlDeclaration53.name();
        org.jsoup.nodes.Document document73 = xmlDeclaration53.ownerDocument();
        org.jsoup.nodes.Attributes attributes74 = xmlDeclaration53.attributes();
        boolean boolean75 = xmlDeclaration5.hasSameValue((java.lang.Object) attributes74);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = xmlTreeBuilder0.processStartTag("<?<!<?>>>", attributes74);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#declaration" + "'", str58, "#declaration");
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<!>" + "'", str68, "<!>");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(document73);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        int int35 = node34.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        java.lang.String str42 = xmlDeclaration39.outerHtml();
        org.jsoup.nodes.Node node43 = xmlDeclaration39.clone();
        java.lang.String str44 = node43.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration48 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str50 = xmlDeclaration48.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlDeclaration48.childNodes();
        org.jsoup.nodes.Node node52 = xmlDeclaration48.nextSibling();
        java.lang.Appendable appendable53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = null;
        xmlDeclaration48.outerHtmlTail(appendable53, 100, outputSettings55);
        boolean boolean57 = node43.equals((java.lang.Object) xmlDeclaration48);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration61 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str63 = xmlDeclaration61.attr("");
        java.lang.String str64 = xmlDeclaration61.outerHtml();
        org.jsoup.nodes.Node node65 = xmlDeclaration61.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList66 = node65.childNodes();
        boolean boolean68 = node65.hasAttr("hi!");
        boolean boolean69 = xmlDeclaration48.equals((java.lang.Object) "hi!");
        java.lang.String str70 = xmlDeclaration48.toString();
        org.jsoup.nodes.Node node71 = xmlDeclaration48.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration75 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str77 = xmlDeclaration75.attr("");
        org.jsoup.nodes.Node node78 = xmlDeclaration75.nextSibling();
        xmlDeclaration75.setBaseUri("hi!");
        boolean boolean81 = node71.hasSameValue((java.lang.Object) xmlDeclaration75);
        org.jsoup.nodes.Node node83 = xmlDeclaration75.removeAttr("<?<?>>");
        java.lang.String str85 = xmlDeclaration75.attr("#declaration");
        boolean boolean87 = xmlDeclaration75.hasAttr("<!>");
        boolean boolean88 = node34.hasSameValue((java.lang.Object) boolean87);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!>" + "'", str64, "<!>");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!>" + "'", str70, "<!>");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
        org.jsoup.nodes.Node node49 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        xmlDeclaration3.outerHtmlTail(appendable50, 1, outputSettings52);
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
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
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
        java.lang.String str66 = xmlDeclaration3.nodeName();
        java.lang.String str67 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "#declaration" + "'", str66, "#declaration");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!>" + "'", str67, "<!>");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!<!>>>", "<?<!hi!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.name();
        int int15 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str11 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<?>");
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", false);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
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
        java.lang.String str29 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.attr("<?<?hi!>>", "<?hi!>");
        java.lang.String str34 = xmlDeclaration3.absUrl("<?<!hi!>>");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
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
        java.lang.String str33 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node34 = xmlDeclaration3.nextSibling();
        java.lang.String str35 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration42.childNodes();
        org.jsoup.nodes.Node node46 = xmlDeclaration42.nextSibling();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        xmlDeclaration42.outerHtmlTail(appendable47, 100, outputSettings49);
        org.jsoup.nodes.Node node51 = xmlDeclaration42.nextSibling();
        boolean boolean52 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration42);
        boolean boolean53 = node16.hasSameValue((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration57 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str59 = xmlDeclaration57.attr("");
        org.jsoup.nodes.Node node60 = xmlDeclaration57.clone();
        org.jsoup.nodes.Node node61 = node60.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration65 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str67 = xmlDeclaration65.attr("");
        int int68 = xmlDeclaration65.siblingIndex();
        org.jsoup.nodes.Node node69 = xmlDeclaration65.nextSibling();
        java.lang.String str70 = xmlDeclaration65.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlDeclaration65.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration75 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str77 = xmlDeclaration75.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlDeclaration75.childNodes();
        java.lang.String str79 = xmlDeclaration75.getWholeDeclaration();
        java.lang.String str80 = xmlDeclaration75.toString();
        boolean boolean81 = xmlDeclaration65.equals((java.lang.Object) xmlDeclaration75);
        org.jsoup.nodes.Attributes attributes82 = xmlDeclaration65.attributes();
        boolean boolean83 = node61.equals((java.lang.Object) xmlDeclaration65);
        org.jsoup.nodes.Node node85 = node61.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node87 = node85.wrap("<!<?<?hi!>>>");
        boolean boolean88 = xmlDeclaration21.hasSameValue((java.lang.Object) node85);
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlDeclaration21.childNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "#declaration" + "'", str70, "#declaration");
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "<!>" + "'", str80, "<!>");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(attributes82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(nodeList89);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
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
        org.jsoup.nodes.Document document24 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration3.outerHtmlTail(appendable25, (int) ' ', outputSettings27);
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
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "#declaration", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node32 = xmlDeclaration31.parent();
        java.lang.String str33 = xmlDeclaration31.toString();
        java.lang.String str35 = xmlDeclaration31.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        java.lang.String str42 = xmlDeclaration39.outerHtml();
        boolean boolean44 = xmlDeclaration39.hasAttr("<!>");
        org.jsoup.nodes.Node node46 = xmlDeclaration39.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration39.childNodes();
        boolean boolean48 = xmlDeclaration31.hasSameValue((java.lang.Object) nodeList47);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        org.jsoup.nodes.Node node55 = xmlDeclaration52.nextSibling();
        xmlDeclaration52.setBaseUri("<!>");
        int int58 = xmlDeclaration52.siblingIndex();
        org.jsoup.nodes.Node node60 = xmlDeclaration52.removeAttr("<?>");
        java.lang.String str61 = xmlDeclaration52.name();
        org.jsoup.nodes.Node node62 = xmlDeclaration52.clone();
        boolean boolean63 = xmlDeclaration31.hasSameValue((java.lang.Object) node62);
        boolean boolean64 = node26.hasSameValue((java.lang.Object) node62);
        java.lang.String str66 = node26.absUrl("<?<!hi!>>");
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
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
        int int37 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration3.outerHtmlTail(appendable38, 0, outputSettings40);
        java.lang.String str42 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        int int5 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        java.lang.String str13 = xmlDeclaration10.outerHtml();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.clone();
        xmlDeclaration10.setBaseUri("<!>");
        org.jsoup.nodes.Node node17 = xmlDeclaration10.clone();
        boolean boolean19 = xmlDeclaration10.hasAttr("<?>");
        org.jsoup.nodes.Node node20 = xmlDeclaration10.parentNode();
        boolean boolean21 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration10);
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.nextSibling();
        xmlDeclaration5.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.siblingNodes();
        java.lang.String str12 = xmlDeclaration5.nodeName();
        java.lang.String str13 = xmlDeclaration5.nodeName();
        java.lang.String str14 = xmlDeclaration5.toString();
        java.lang.String str15 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Node node16 = xmlDeclaration5.previousSibling();
        int int17 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.processStartTag("<?<!<?>>>", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?<?>>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        java.lang.String str13 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration9.clone();
        org.jsoup.nodes.Node node15 = node14.parentNode();
        java.lang.String str17 = node14.absUrl("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        int int5 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration12.attr("<?<!>>", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?<?hi!>>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<?hi!>");
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str9 = xmlDeclaration3.absUrl("<!>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "hi!", false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
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
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration37.siblingNodes();
        java.lang.String str44 = xmlDeclaration37.nodeName();
        java.lang.String str45 = xmlDeclaration37.nodeName();
        java.lang.String str46 = xmlDeclaration37.toString();
        org.jsoup.nodes.Node node47 = xmlDeclaration37.previousSibling();
        int int48 = xmlDeclaration37.childNodeSize();
        boolean boolean49 = xmlDeclaration12.hasSameValue((java.lang.Object) int48);
        org.jsoup.nodes.Node node50 = xmlDeclaration12.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#declaration" + "'", str44, "#declaration");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#declaration" + "'", str45, "#declaration");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = node8.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        java.lang.String str29 = xmlDeclaration25.getWholeDeclaration();
        int int30 = xmlDeclaration25.siblingIndex();
        java.lang.String str31 = xmlDeclaration25.getWholeDeclaration();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        xmlDeclaration25.outerHtmlTail(appendable32, (int) (byte) 1, outputSettings34);
        boolean boolean36 = xmlDeclaration15.hasSameValue((java.lang.Object) outputSettings34);
        boolean boolean38 = xmlDeclaration15.hasAttr("<?>");
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration15.outerHtmlTail(appendable39, (int) '4', outputSettings41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node13.siblingNodes();
        org.jsoup.nodes.Node node32 = node13.wrap("<!<?<?>>>");
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
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("<?<!hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("<!#declaration>", "<?<?>>");
        java.lang.String str14 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (byte) -1, outputSettings13);
        org.jsoup.nodes.Node node15 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "<!hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        java.lang.String str28 = xmlDeclaration18.absUrl("<!<!>>");
        org.jsoup.nodes.Node node29 = xmlDeclaration18.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("<!<!>>", "<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.childNodes();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before("<?#declaration>");
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!#declaration>", false);
        java.lang.String str5 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<!<?<?>>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration3.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        boolean boolean9 = xmlDeclaration3.hasAttr("<?<?>>");
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        org.jsoup.nodes.Node node24 = xmlDeclaration21.clone();
        int int25 = xmlDeclaration21.childNodeSize();
        boolean boolean27 = xmlDeclaration21.equals((java.lang.Object) (-1.0f));
        java.lang.String str28 = xmlDeclaration21.getWholeDeclaration();
        java.lang.Object obj29 = null;
        boolean boolean30 = xmlDeclaration21.equals(obj29);
        org.jsoup.nodes.Node node32 = xmlDeclaration21.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration21);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str13 = xmlDeclaration3.attr("<!>");
        xmlDeclaration3.setBaseUri("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        java.lang.String str36 = node34.attr("hi!");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
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
        java.lang.String str17 = xmlDeclaration3.absUrl("<?<?>>");
        int int18 = xmlDeclaration3.siblingIndex();
        int int19 = xmlDeclaration3.siblingIndex();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        java.lang.String str27 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.traverse(nodeVisitor28);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<!<?>>>", "<!<?<?hi!>>>", false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        boolean boolean15 = xmlDeclaration3.hasSameValue((java.lang.Object) str14);
        boolean boolean17 = xmlDeclaration3.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        java.lang.String str19 = xmlDeclaration3.outerHtml();
        java.lang.String str20 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str11 = node10.outerHtml();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        org.jsoup.nodes.Node node19 = xmlDeclaration3.nextSibling();
        int int20 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
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
        org.jsoup.nodes.Node node21 = node20.parentNode();
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
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        java.lang.Class<?> wildcardClass13 = node11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
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
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.remove();
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
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        boolean boolean9 = xmlDeclaration3.hasAttr("<?<?>>");
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
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
        java.lang.String str48 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean49 = xmlDeclaration3.equals((java.lang.Object) str48);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration33.childNodes();
        java.lang.String str37 = xmlDeclaration33.getWholeDeclaration();
        java.lang.String str38 = xmlDeclaration33.toString();
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration33.outerHtmlTail(appendable39, (int) (short) 10, outputSettings41);
        java.lang.String str43 = xmlDeclaration33.getWholeDeclaration();
        int int44 = xmlDeclaration33.siblingIndex();
        org.jsoup.nodes.Node node47 = xmlDeclaration33.attr("<!>", "");
        boolean boolean49 = node47.hasAttr("<?>");
        java.lang.String str51 = node47.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = xmlDeclaration17.before(node47);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!>" + "'", str38, "<!>");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.nextSibling();
        xmlDeclaration13.setBaseUri("<!>");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration13.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean24 = xmlDeclaration13.hasAttr("#declaration");
        java.lang.String str25 = xmlDeclaration13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration13.childNodes();
        java.lang.String str27 = xmlDeclaration13.baseUri();
        java.lang.String str28 = xmlDeclaration13.toString();
        java.lang.String str29 = xmlDeclaration13.toString();
        boolean boolean30 = node6.hasSameValue((java.lang.Object) xmlDeclaration13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
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
        org.jsoup.nodes.Node node24 = xmlDeclaration12.clone();
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
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("<!>");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        java.lang.String str24 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.lang.String str31 = xmlDeclaration28.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration28.childNodesCopy();
        org.jsoup.nodes.Node node33 = xmlDeclaration28.clone();
        int int34 = node33.childNodeSize();
        org.jsoup.nodes.Node node35 = node33.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.before(node33);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!hi!>" + "'", str24, "<!hi!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        boolean boolean38 = xmlDeclaration3.hasAttr("");
        java.lang.String str39 = xmlDeclaration3.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.lang.String str22 = xmlDeclaration3.attr("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node32.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass13 = nodeList12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        java.lang.String str15 = node11.attr("");
        org.jsoup.nodes.Node node16 = node11.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<?#declaration>", "<!>");
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!<?<?hi!>>>");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!<?>>" + "'", str15, "<!<?>>");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
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
        org.jsoup.nodes.Document document28 = xmlDeclaration3.ownerDocument();
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
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<!hi!>>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str19 = xmlDeclaration3.absUrl("<!hi!>");
        int int20 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
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
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.before(node20);
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
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, (int) (short) 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<!>");
        int int11 = xmlDeclaration3.childNodeSize();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!hi!>");
        java.lang.String str15 = xmlDeclaration3.attr("<?<!hi!>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        java.lang.String str21 = xmlDeclaration3.attr("<?<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after("<?<!<!>>>");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, 0, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        org.jsoup.nodes.Node node40 = xmlDeclaration36.wrap("<?#declaration>");
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
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!<!>>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("<?<?>>", "#declaration");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) '4', outputSettings16);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("<!>", "<!<?<?>>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        java.lang.String str31 = xmlDeclaration12.nodeName();
        java.lang.String str32 = xmlDeclaration12.name();
        org.jsoup.nodes.Node node34 = xmlDeclaration12.wrap("<?#declaration>");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration29.childNodes();
        java.lang.String str33 = xmlDeclaration29.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.lang.String str40 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Node node41 = xmlDeclaration37.clone();
        java.lang.String str42 = node41.baseUri();
        boolean boolean43 = xmlDeclaration29.equals((java.lang.Object) str42);
        org.jsoup.nodes.Node node46 = xmlDeclaration29.attr("hi!", "#declaration");
        int int47 = node46.childNodeSize();
        org.jsoup.nodes.Node node48 = node46.parentNode();
        boolean boolean49 = xmlDeclaration3.hasSameValue((java.lang.Object) node46);
        java.lang.Appendable appendable50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable50, (int) (byte) 1, outputSettings52);
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
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str14 = xmlDeclaration3.attr("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        org.jsoup.nodes.Node node21 = xmlDeclaration18.nextSibling();
        xmlDeclaration18.setBaseUri("<!>");
        int int24 = xmlDeclaration18.siblingIndex();
        java.lang.String str25 = xmlDeclaration18.name();
        boolean boolean26 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.toString();
        java.lang.String str32 = xmlDeclaration26.toString();
        java.lang.String str33 = xmlDeclaration26.baseUri();
        org.jsoup.nodes.Node node35 = xmlDeclaration26.removeAttr("<!>");
        boolean boolean36 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        java.lang.String str37 = xmlDeclaration3.name();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration3.outerHtmlTail(appendable38, (int) (short) 0, outputSettings40);
        org.jsoup.nodes.Node node42 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node42.traverse(nodeVisitor43);
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
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        java.lang.String str5 = xmlDeclaration3.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodesCopy();
        java.lang.String str17 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        int int4 = xmlDeclaration3.childNodeSize();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        java.lang.String str17 = xmlDeclaration3.toString();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, (int) (byte) 100, outputSettings20);
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
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.after("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean21 = xmlDeclaration19.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node22 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Attributes attributes23 = xmlDeclaration19.attributes();
        java.lang.String str25 = xmlDeclaration19.absUrl("<?<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node15.after((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str10 = node8.attr("hi!");
        int int11 = node8.childNodeSize();
        org.jsoup.nodes.Node node13 = node8.wrap("<?hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.childNodes();
        org.jsoup.nodes.Document document21 = xmlDeclaration16.ownerDocument();
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Node node24 = xmlDeclaration3.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = node24.absUrl("<?>");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("<?hi!>");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
        boolean boolean38 = xmlDeclaration3.hasAttr("");
        boolean boolean40 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node42 = xmlDeclaration3.removeAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
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
        org.jsoup.nodes.Node node35 = xmlDeclaration12.parentNode();
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
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        java.lang.String str15 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
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
        java.lang.String str17 = xmlDeclaration3.name();
        java.lang.String str18 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?#declaration>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
        org.jsoup.nodes.Document document35 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str41 = xmlDeclaration39.attr("");
        org.jsoup.nodes.Node node42 = xmlDeclaration39.nextSibling();
        xmlDeclaration39.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration39.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration39.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration39.childNodes();
        xmlDeclaration39.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes50 = xmlDeclaration39.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = document35.hasSameValue((java.lang.Object) xmlDeclaration39);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<?>");
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
        int int15 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node16.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<?<?hi!>>", false);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.String str6 = xmlDeclaration3.attr("<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
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
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration16.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        org.jsoup.nodes.Node node35 = xmlDeclaration32.clone();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        xmlDeclaration32.outerHtmlTail(appendable36, 10, outputSettings38);
        java.lang.String str40 = xmlDeclaration32.nodeName();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        xmlDeclaration32.outerHtmlTail(appendable41, (-1), outputSettings43);
        boolean boolean45 = xmlDeclaration16.hasSameValue((java.lang.Object) outputSettings43);
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
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration24.siblingNodes();
        xmlDeclaration24.setBaseUri("<!>");
        java.lang.String str38 = xmlDeclaration24.nodeName();
        org.jsoup.nodes.Node node41 = xmlDeclaration24.attr("<!<?>>", "<?hi!>");
        java.lang.Appendable appendable42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        xmlDeclaration24.outerHtmlTail(appendable42, (int) '4', outputSettings44);
        java.lang.String str46 = xmlDeclaration24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration24.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#declaration" + "'", str46, "#declaration");
        org.junit.Assert.assertNotNull(nodeList47);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        int int13 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
        org.jsoup.nodes.Node node31 = xmlDeclaration3.attr("<!<?>>", "");
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
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
        java.lang.String str17 = node15.baseUri();
        org.jsoup.nodes.Node node18 = node15.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.childNodes();
        java.lang.String str21 = xmlDeclaration16.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        org.jsoup.nodes.Node node28 = xmlDeclaration25.nextSibling();
        xmlDeclaration25.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration25.childNodes();
        boolean boolean33 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration25);
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        java.lang.String str36 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        java.lang.String str43 = xmlDeclaration40.outerHtml();
        org.jsoup.nodes.Node node44 = xmlDeclaration40.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = node44.childNodes();
        org.jsoup.nodes.Attributes attributes46 = node44.attributes();
        boolean boolean47 = xmlDeclaration3.equals((java.lang.Object) attributes46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        int int15 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        org.jsoup.nodes.Node node17 = xmlDeclaration12.parentNode();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.removeAttr("<!>");
        xmlDeclaration12.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        boolean boolean25 = xmlDeclaration12.hasAttr("<?>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("<?<?>>");
        java.lang.String str18 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!hi!>" + "'", str4, "<!hi!>");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.Node node37 = xmlDeclaration12.removeAttr("#declaration");
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
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.attr("<!<?<?>>>");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node14 = node11.attr("<?<!<?>>>", "<?<!<!>>>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
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
        java.lang.String str34 = xmlDeclaration11.attr("<?<?hi!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        int int41 = xmlDeclaration38.siblingIndex();
        java.lang.String str42 = xmlDeclaration38.toString();
        org.jsoup.nodes.Node node43 = xmlDeclaration38.nextSibling();
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        xmlDeclaration38.outerHtmlTail(appendable44, (int) '4', outputSettings46);
        java.lang.String str48 = xmlDeclaration38.nodeName();
        java.lang.String str49 = xmlDeclaration38.getWholeDeclaration();
        org.jsoup.nodes.Node node50 = xmlDeclaration38.clone();
        org.jsoup.nodes.Node node51 = xmlDeclaration38.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration55 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str57 = xmlDeclaration55.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration55.childNodes();
        org.jsoup.nodes.Node node59 = xmlDeclaration55.nextSibling();
        java.lang.Appendable appendable60 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = null;
        xmlDeclaration55.outerHtmlTail(appendable60, 100, outputSettings62);
        java.lang.String str64 = xmlDeclaration55.toString();
        xmlDeclaration55.setBaseUri("#declaration");
        java.lang.Appendable appendable67 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = null;
        xmlDeclaration55.outerHtmlTail(appendable67, (int) ' ', outputSettings69);
        org.jsoup.nodes.Node node71 = xmlDeclaration55.clone();
        org.jsoup.nodes.Node node72 = node71.clone();
        org.jsoup.nodes.Attributes attributes73 = node72.attributes();
        boolean boolean74 = xmlDeclaration38.hasSameValue((java.lang.Object) node72);
        boolean boolean75 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration38);
        org.jsoup.nodes.Document document76 = xmlDeclaration11.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!>" + "'", str64, "<!>");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(document76);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.before("<?<?hi!>>");
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
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.attr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str13 = node11.attr("");
        org.jsoup.nodes.Node node14 = node11.parent();
        boolean boolean16 = node11.hasAttr("<!hi!>");
        org.jsoup.nodes.Node node19 = node11.attr("<!<?<?>>>", "<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        java.lang.String str17 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        java.lang.String str28 = node27.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration32.childNodes();
        org.jsoup.nodes.Node node36 = xmlDeclaration32.nextSibling();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration32.outerHtmlTail(appendable37, 100, outputSettings39);
        boolean boolean41 = node27.equals((java.lang.Object) xmlDeclaration32);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str47 = xmlDeclaration45.attr("");
        java.lang.String str48 = xmlDeclaration45.outerHtml();
        org.jsoup.nodes.Node node49 = xmlDeclaration45.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = node49.childNodes();
        boolean boolean52 = node49.hasAttr("hi!");
        boolean boolean53 = xmlDeclaration32.equals((java.lang.Object) "hi!");
        java.lang.String str54 = xmlDeclaration32.toString();
        org.jsoup.nodes.Document document55 = xmlDeclaration32.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = node19.after((org.jsoup.nodes.Node) xmlDeclaration32);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!>" + "'", str54, "<!>");
        org.junit.Assert.assertNull(document55);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.childNodes();
        java.lang.String str21 = xmlDeclaration16.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        org.jsoup.nodes.Node node28 = xmlDeclaration25.nextSibling();
        xmlDeclaration25.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration25.childNodes();
        boolean boolean33 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration25);
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        java.lang.String str36 = xmlDeclaration3.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
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
        org.jsoup.nodes.Node node26 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str31 = xmlDeclaration30.toString();
        xmlDeclaration30.setBaseUri("#declaration");
        org.jsoup.nodes.Node node35 = xmlDeclaration30.removeAttr("<?<?>>");
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration30);
        java.lang.String str37 = xmlDeclaration30.baseUri();
        java.lang.String str38 = xmlDeclaration30.name();
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<!>");
        org.jsoup.nodes.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith(node15);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
        boolean boolean20 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str22 = xmlDeclaration3.absUrl("<?<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?<?hi!>>", true);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        org.jsoup.nodes.Document document35 = xmlDeclaration3.ownerDocument();
        java.lang.String str36 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration3.childNodes();
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
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration3.outerHtmlTail(appendable17, 1, outputSettings19);
        java.lang.String str21 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration3.outerHtmlTail(appendable22, (int) (short) 0, outputSettings24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
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
        java.lang.String str29 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.attr("<?<?hi!>>", "<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass34 = nodeList33.getClass();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        java.lang.String str25 = xmlDeclaration3.baseUri();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
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
        org.jsoup.nodes.Node node18 = xmlDeclaration3.wrap("<!<?<?>>>");
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
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
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration16.childNodes();
        java.lang.String str21 = xmlDeclaration16.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        org.jsoup.nodes.Node node28 = xmlDeclaration25.nextSibling();
        xmlDeclaration25.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration25.childNodes();
        boolean boolean33 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration25);
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        java.lang.String str41 = xmlDeclaration38.outerHtml();
        org.jsoup.nodes.Node node42 = xmlDeclaration38.clone();
        xmlDeclaration38.setBaseUri("<!>");
        boolean boolean46 = xmlDeclaration38.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str47 = xmlDeclaration38.baseUri();
        java.lang.String str48 = xmlDeclaration38.toString();
        java.lang.String str49 = xmlDeclaration38.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlDeclaration38.siblingNodes();
        java.lang.String str51 = xmlDeclaration38.outerHtml();
        java.lang.String str52 = xmlDeclaration38.outerHtml();
        java.lang.String str53 = xmlDeclaration38.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = xmlDeclaration25.after((org.jsoup.nodes.Node) xmlDeclaration38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!>" + "'", str49, "<!>");
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!>" + "'", str51, "<!>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!>" + "'", str52, "<!>");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!>" + "'", str53, "<!>");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
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
        boolean boolean30 = xmlDeclaration18.hasAttr("<?>");
        java.lang.String str32 = xmlDeclaration18.absUrl("<!<?<?>>>");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration32.childNodes();
        java.lang.String str36 = xmlDeclaration32.nodeName();
        org.jsoup.nodes.Node node38 = xmlDeclaration32.wrap("<!>");
        java.lang.String str39 = xmlDeclaration32.toString();
        org.jsoup.nodes.Node node40 = xmlDeclaration32.clone();
        int int41 = node40.siblingIndex();
        java.lang.String str42 = node40.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node40);
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
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        boolean boolean8 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration13.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration13.parent();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration13.attributes();
        java.lang.String str19 = xmlDeclaration13.attr("<?>");
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node21 = xmlDeclaration13.previousSibling();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        java.lang.String str18 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.String str22 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration15.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration15.childNodes();
        java.lang.String str26 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node29 = xmlDeclaration15.attr("hi!", "hi!");
        boolean boolean30 = xmlDeclaration3.hasSameValue((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith(node16);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        boolean boolean9 = node7.hasAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node7.before("<?<!<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes12 = node11.attributes();
        org.jsoup.nodes.Node node14 = node11.wrap("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node14 = node11.attr("<?hi!>", "<?>");
        java.lang.String str15 = node11.baseUri();
        org.jsoup.nodes.Node node17 = node11.removeAttr("<?hi!>");
        org.jsoup.nodes.Node node18 = node11.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "<?<!<?>>>", false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.String str10 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?>>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<!>>", "<!<?<?>>>", true);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<?<?>>", false);
        boolean boolean5 = xmlDeclaration3.hasAttr("<?<!hi!>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node14 = node10.clone();
        org.jsoup.nodes.Node node15 = node14.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        java.lang.String str26 = node24.attr("<!hi!>");
        org.jsoup.nodes.Node node27 = node24.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node27.attr("<?hi!>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?<!<!>>>", true);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
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
        java.lang.String str49 = node48.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = node48.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(nodeList50);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 10, outputSettings11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration19.outerHtmlTail(appendable24, 100, outputSettings26);
        org.jsoup.nodes.Node node28 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Node node29 = xmlDeclaration19.clone();
        org.jsoup.nodes.Node node31 = xmlDeclaration19.removeAttr("<!hi!>");
        java.lang.String str32 = xmlDeclaration19.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.lang.String str39 = xmlDeclaration36.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration36.childNodes();
        int int41 = xmlDeclaration36.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str47 = xmlDeclaration45.attr("");
        java.lang.String str48 = xmlDeclaration45.outerHtml();
        org.jsoup.nodes.Node node49 = xmlDeclaration45.clone();
        boolean boolean50 = xmlDeclaration36.equals((java.lang.Object) xmlDeclaration45);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        int int57 = xmlDeclaration54.siblingIndex();
        java.lang.String str58 = xmlDeclaration54.toString();
        org.jsoup.nodes.Node node59 = xmlDeclaration54.parent();
        java.lang.String str60 = xmlDeclaration54.getWholeDeclaration();
        org.jsoup.nodes.Node node62 = xmlDeclaration54.removeAttr("hi!");
        boolean boolean63 = xmlDeclaration45.hasSameValue((java.lang.Object) node62);
        org.jsoup.nodes.Node node64 = xmlDeclaration45.nextSibling();
        boolean boolean65 = xmlDeclaration19.equals((java.lang.Object) xmlDeclaration45);
        boolean boolean66 = xmlDeclaration3.equals((java.lang.Object) boolean65);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!>" + "'", str58, "<!>");
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        int int14 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) '#', outputSettings17);
        java.lang.String str19 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.attr("<?<!<!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
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
        java.lang.String str20 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?hi!>" + "'", str20, "<?hi!>");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        org.jsoup.nodes.Node node35 = xmlDeclaration12.clone();
        boolean boolean37 = xmlDeclaration12.hasAttr("<!<?>>");
        java.lang.Class<?> wildcardClass38 = xmlDeclaration12.getClass();
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
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
            org.jsoup.nodes.Node node20 = node18.after("<?<!hi!>>");
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
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
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
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str23 = xmlDeclaration3.absUrl("<!#declaration>");
        org.jsoup.nodes.Node node25 = xmlDeclaration3.removeAttr("<?<?hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node25.unwrap();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str14 = xmlDeclaration3.absUrl("<?<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.traverse(nodeVisitor15);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?<!<!>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodesCopy();
        java.lang.String str17 = xmlDeclaration3.toString();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        xmlDeclaration5.setBaseUri("#declaration");
        org.jsoup.nodes.Node node11 = xmlDeclaration5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration5.siblingNodes();
        java.lang.String str13 = xmlDeclaration5.toString();
        java.lang.String str14 = xmlDeclaration5.toString();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<?<!<!>>>", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!<!>>", false);
        int int4 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<?<!>>");
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
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
        xmlDeclaration3.outerHtmlTail(appendable30, (int) '#', outputSettings32);
        org.jsoup.nodes.Attributes attributes34 = xmlDeclaration3.attributes();
        java.lang.String str35 = xmlDeclaration3.outerHtml();
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
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<?<!<?>>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
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
        java.lang.String str29 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!hi!>", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        org.jsoup.nodes.Node node8 = xmlDeclaration7.clone();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration7);
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration14.childNodes();
        java.lang.String str19 = xmlDeclaration14.name();
        java.lang.String str20 = xmlDeclaration14.outerHtml();
        java.lang.String str22 = xmlDeclaration14.attr("<!hi!>");
        org.jsoup.nodes.Node node25 = xmlDeclaration14.attr("<?hi!>", "");
        boolean boolean27 = xmlDeclaration14.hasAttr("");
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.absUrl("<!hi!>");
        int int8 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<?<!<?>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parent();
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
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
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
        int int20 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
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
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        java.lang.String str24 = xmlDeclaration19.absUrl("<!>");
        java.lang.String str26 = xmlDeclaration19.absUrl("hi!");
        org.jsoup.nodes.Node node27 = xmlDeclaration19.clone();
        org.jsoup.nodes.Node node29 = node27.removeAttr("<!<!>>");
        java.lang.String str30 = node27.outerHtml();
        boolean boolean31 = xmlDeclaration3.hasSameValue((java.lang.Object) node27);
        org.jsoup.nodes.Node node32 = node27.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node27.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#declaration", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration8.childNodes();
        java.lang.String str12 = xmlDeclaration8.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration8.childNodesCopy();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration8.attributes();
        org.jsoup.nodes.Node node16 = xmlDeclaration8.parentNode();
        java.lang.String str17 = xmlDeclaration8.name();
        java.lang.String str18 = xmlDeclaration8.baseUri();
        java.lang.String str19 = xmlDeclaration8.toString();
        java.lang.String str20 = xmlDeclaration8.getWholeDeclaration();
        boolean boolean21 = node4.equals((java.lang.Object) xmlDeclaration8);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
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
        java.lang.String str21 = xmlDeclaration3.name();
        java.lang.String str22 = xmlDeclaration3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        boolean boolean12 = node9.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration28.toString();
        boolean boolean34 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration28);
        int int35 = xmlDeclaration18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration18.childNodes();
        java.lang.String str37 = xmlDeclaration18.toString();
        boolean boolean38 = node13.equals((java.lang.Object) xmlDeclaration18);
        org.jsoup.nodes.Attributes attributes39 = node13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = xmlTreeBuilder0.processStartTag("#declaration", attributes39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.after("<?>");
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        java.lang.String str22 = xmlDeclaration3.attr("<!<?<?hi!>>>");
        java.lang.String str23 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?<?hi!>>>", false);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?<?hi!>>>", "#declaration", true);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        boolean boolean8 = xmlDeclaration3.hasAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (short) -1, outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        org.jsoup.nodes.Node node22 = xmlDeclaration19.nextSibling();
        xmlDeclaration19.setBaseUri("<!>");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration19.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean30 = xmlDeclaration19.hasAttr("#declaration");
        java.lang.String str31 = xmlDeclaration19.toString();
        org.jsoup.nodes.Node node32 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Node node34 = xmlDeclaration19.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration19.siblingNodes();
        org.jsoup.nodes.Node node38 = xmlDeclaration19.attr("<?>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration3.before(node38);
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
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("");
        java.lang.String str12 = xmlDeclaration3.absUrl("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration16.childNodes();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration16.outerHtmlTail(appendable21, 100, outputSettings23);
        java.lang.String str25 = xmlDeclaration16.toString();
        xmlDeclaration16.setBaseUri("#declaration");
        java.lang.String str28 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node30 = xmlDeclaration16.removeAttr("<!<!>>");
        java.lang.String str32 = xmlDeclaration16.attr("<?>");
        org.jsoup.nodes.Node node33 = xmlDeclaration16.parentNode();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
        java.lang.String str19 = xmlDeclaration3.outerHtml();
        java.lang.String str20 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!#declaration>", true);
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "<!>");
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        org.jsoup.nodes.Node node8 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.Document document10 = node8.ownerDocument();
        org.jsoup.nodes.Node node11 = node8.parentNode();
        org.jsoup.nodes.Attributes attributes12 = node8.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
        int int27 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node23.baseUri();
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
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) (short) 0, outputSettings15);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, (int) (byte) 10, outputSettings20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        org.jsoup.nodes.Node node24 = xmlDeclaration21.nextSibling();
        xmlDeclaration21.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.siblingNodes();
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration21.attributes();
        java.lang.String str29 = xmlDeclaration21.nodeName();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration21.outerHtmlTail(appendable30, 1, outputSettings32);
        org.jsoup.nodes.Node node34 = xmlDeclaration21.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration21);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node23.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node23.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Node node15 = node12.attr("<!hi!>", "<!#declaration>");
        org.jsoup.nodes.Node node16 = node15.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        java.lang.String str24 = xmlDeclaration20.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration20.toString();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration20.outerHtmlTail(appendable26, (int) (short) 10, outputSettings28);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        int int37 = xmlDeclaration34.siblingIndex();
        org.jsoup.nodes.Node node38 = xmlDeclaration34.nextSibling();
        java.lang.String str39 = xmlDeclaration34.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration34.childNodesCopy();
        org.jsoup.nodes.Document document41 = xmlDeclaration34.ownerDocument();
        java.lang.String str43 = xmlDeclaration34.absUrl("<!>");
        java.lang.String str44 = xmlDeclaration34.name();
        boolean boolean45 = xmlDeclaration20.equals((java.lang.Object) xmlDeclaration34);
        org.jsoup.nodes.Document document46 = xmlDeclaration20.ownerDocument();
        org.jsoup.nodes.Node node48 = xmlDeclaration20.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlDeclaration20.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlDeclaration20.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = node16.before((org.jsoup.nodes.Node) xmlDeclaration20);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
        java.lang.String str14 = xmlDeclaration3.nodeName();
        int int15 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
        java.lang.String str27 = node25.attr("<?<?>>");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        java.lang.String str17 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Document document18 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration3.hasAttr("<?>");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '#', outputSettings14);
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.nodeName();
        int int26 = xmlDeclaration20.childNodeSize();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration20.outerHtmlTail(appendable27, 0, outputSettings29);
        org.jsoup.nodes.Node node31 = xmlDeclaration20.clone();
        boolean boolean32 = xmlDeclaration3.hasSameValue((java.lang.Object) node31);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
        org.jsoup.nodes.Document document23 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.Node node24 = xmlDeclaration12.clone();
        boolean boolean26 = xmlDeclaration12.hasAttr("<?<?>>");
        java.lang.String str27 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration12.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<!#declaration>");
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
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
        int int16 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration20.childNodesCopy();
        org.jsoup.nodes.Node node28 = xmlDeclaration20.attr("hi!", "");
        org.jsoup.nodes.Node node29 = xmlDeclaration20.previousSibling();
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration20.attributes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) attributes30);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.attr("");
        java.lang.String str14 = xmlDeclaration3.attr("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        java.lang.String str22 = xmlDeclaration18.getWholeDeclaration();
        int int23 = xmlDeclaration18.siblingIndex();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration18.outerHtmlTail(appendable25, (int) (byte) 1, outputSettings27);
        java.lang.String str30 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration18.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        int int38 = xmlDeclaration35.siblingIndex();
        java.lang.String str40 = xmlDeclaration35.absUrl("<!>");
        org.jsoup.nodes.Document document41 = xmlDeclaration35.ownerDocument();
        boolean boolean42 = xmlDeclaration18.hasSameValue((java.lang.Object) xmlDeclaration35);
        java.lang.String str44 = xmlDeclaration18.attr("<!<!>>");
        boolean boolean45 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        int int39 = xmlDeclaration36.siblingIndex();
        org.jsoup.nodes.Node node40 = xmlDeclaration36.nextSibling();
        java.lang.String str41 = xmlDeclaration36.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration36.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration36.siblingNodes();
        org.jsoup.nodes.Document document44 = xmlDeclaration36.ownerDocument();
        java.lang.String str45 = xmlDeclaration36.toString();
        java.lang.String str46 = xmlDeclaration36.toString();
        boolean boolean47 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration36);
        java.lang.String str49 = xmlDeclaration36.absUrl("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration53 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "<!hi!>", false);
        int int54 = xmlDeclaration53.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlDeclaration53.childNodes();
        boolean boolean56 = xmlDeclaration36.hasSameValue((java.lang.Object) xmlDeclaration53);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlDeclaration53.childNodes();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!>" + "'", str45, "<!>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(nodeList57);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "hi!", true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!>", true);
        java.lang.String str4 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        java.lang.String str8 = xmlDeclaration3.absUrl("<?<?>>");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        org.jsoup.nodes.Node node34 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        int int41 = xmlDeclaration38.siblingIndex();
        java.lang.String str42 = xmlDeclaration38.toString();
        org.jsoup.nodes.Node node43 = xmlDeclaration38.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration38.childNodes();
        org.jsoup.nodes.Node node45 = xmlDeclaration38.clone();
        org.jsoup.nodes.Node node48 = node45.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node49 = node45.clone();
        org.jsoup.nodes.Attributes attributes50 = node45.attributes();
        boolean boolean51 = xmlDeclaration3.equals((java.lang.Object) node45);
        int int52 = xmlDeclaration3.siblingIndex();
        java.lang.String str53 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.attr("<!<?>>", "");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        java.lang.String str8 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
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
        org.jsoup.nodes.Node node19 = xmlDeclaration3.attr("<!<?>>", "<?<?hi!>>");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration3.outerHtmlTail(appendable20, (int) (short) -1, outputSettings22);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<?<!<!>>>", "<?<!hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
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
        org.jsoup.nodes.Node node38 = xmlDeclaration3.attr("<!hi!>", "hi!");
        java.lang.String str39 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node40 = xmlDeclaration3.clone();
        java.lang.String str42 = node40.attr("<!<?>>");
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = node12.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        java.lang.String str29 = xmlDeclaration17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration17.siblingNodes();
        boolean boolean31 = node12.hasSameValue((java.lang.Object) xmlDeclaration17);
        boolean boolean33 = xmlDeclaration17.hasAttr("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration17.after("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }
}

