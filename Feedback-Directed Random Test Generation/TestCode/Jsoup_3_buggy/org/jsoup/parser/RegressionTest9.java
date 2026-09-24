package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        org.jsoup.select.Elements elements23 = element9.getElementsByAttributeValueContaining("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element9.prependText("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements26 = element25.children();
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.text("#root");
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.nodes.Node node10 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        java.lang.String str24 = element20.tagName();
        org.jsoup.nodes.Element element26 = element20.html("<#root>\n</#root>");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag43 = tag41.getImplicitParent();
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag39.isValidParent(tag43);
        org.jsoup.parser.Tag tag46 = tag39.getImplicitParent();
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
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str11 = tag10.toString();
        org.jsoup.parser.Tag tag12 = tag10.getImplicitParent();
        boolean boolean13 = tag8.equals((java.lang.Object) tag10);
        boolean boolean14 = tag8.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag8, "#root");
        java.lang.String str17 = tag8.toString();
        boolean boolean18 = tag1.isValidParent(tag8);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document24.empty();
        org.jsoup.nodes.Element element30 = element28.append("");
        org.jsoup.nodes.Element element31 = element28.empty();
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.select.Elements elements35 = element31.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes36 = element31.attributes();
        org.jsoup.nodes.Attributes attributes37 = element31.attributes();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes37);
        java.lang.String str39 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document2.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        org.jsoup.nodes.Element element36 = element34.prependElement("< > >");
        org.jsoup.nodes.Element element38 = element36.wrap("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements39 = element36.getAllElements();
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
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.isInline();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        org.jsoup.nodes.Element element17 = element15.text("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = element15.appendText("hi!");
        org.jsoup.nodes.Element element24 = element15.attr("#root", "#document");
        org.jsoup.nodes.Node node26 = element15.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element28 = element15.append("");
        org.jsoup.parser.Tag tag29 = element15.tag();
        boolean boolean30 = tag1.canContain(tag29);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element35 = document33.text("hi!");
        boolean boolean36 = element35.isBlock();
        boolean boolean37 = element35.hasText();
        org.jsoup.parser.Tag tag38 = element35.tag();
        org.jsoup.nodes.Element element40 = element35.addClass("");
        org.jsoup.parser.Tag tag41 = element35.tag();
        boolean boolean42 = tag29.isValidParent(tag41);
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str47 = tag46.toString();
        org.jsoup.parser.Tag tag48 = tag46.getImplicitParent();
        boolean boolean49 = tag44.equals((java.lang.Object) tag46);
        boolean boolean50 = tag29.canContain(tag46);
        java.lang.String str51 = tag46.getName();
        boolean boolean52 = tag46.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        boolean boolean22 = element21.hasText();
        org.jsoup.nodes.Element element24 = element21.prependText("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element21.prependText("#document hi!\n<html>\n<head>\n</head>\n<body>\n hi! \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str7 = tag6.toString();
        org.jsoup.parser.Tag tag8 = tag6.getImplicitParent();
        boolean boolean9 = tag4.equals((java.lang.Object) tag6);
        java.lang.String str10 = tag4.toString();
        java.lang.String str11 = tag4.toString();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Attributes attributes20 = document15.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag4, "body", attributes20);
        org.jsoup.nodes.Element element23 = element21.prependElement("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes24 = element21.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag1, " body", attributes24);
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValue(" <hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi!#document&lt;#root #root=&quot;#document&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  hi! \n  </body>\n </html>\n</body>\n</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str11 = tag10.toString();
        org.jsoup.parser.Tag tag12 = tag10.getImplicitParent();
        boolean boolean13 = tag8.equals((java.lang.Object) tag10);
        boolean boolean14 = tag8.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag8, "#root");
        java.lang.String str17 = tag8.toString();
        boolean boolean18 = tag1.isValidParent(tag8);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document24.empty();
        org.jsoup.nodes.Element element30 = element28.append("");
        org.jsoup.nodes.Element element31 = element28.empty();
        org.jsoup.nodes.Attributes attributes32 = element31.attributes();
        org.jsoup.select.Elements elements35 = element31.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes36 = element31.attributes();
        org.jsoup.nodes.Attributes attributes37 = element31.attributes();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes37);
        boolean boolean40 = element38.hasClass("body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements43 = element38.getElementsByAttributeValueStarting("", "<#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;/#root&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element12 = document2.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueEnding("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>", "<#root>\n</#root>hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        boolean boolean39 = tag1.isBlock();
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document46.childNodes();
        document46.setBaseUri("hi!");
        org.jsoup.nodes.Element element50 = document46.empty();
        org.jsoup.nodes.Element element52 = document46.appendText("hi!");
        org.jsoup.nodes.Attributes attributes53 = document46.attributes();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag41, "hi!", attributes53);
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList59 = document58.childNodes();
        document58.setBaseUri("hi!");
        org.jsoup.nodes.Element element62 = document58.empty();
        org.jsoup.nodes.Element element64 = document58.appendText("hi!");
        org.jsoup.nodes.Attributes attributes65 = document58.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag41, "#document", attributes65);
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList70 = document69.childNodes();
        document69.setBaseUri("hi!");
        org.jsoup.nodes.Element element73 = document69.empty();
        org.jsoup.nodes.Element element75 = element73.append("");
        org.jsoup.parser.Tag tag76 = element73.tag();
        boolean boolean77 = tag41.canContain(tag76);
        boolean boolean78 = tag41.preserveWhitespace();
        boolean boolean79 = tag41.isBlock();
        boolean boolean80 = tag41.isInline();
        boolean boolean81 = tag41.preserveWhitespace();
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element(tag41, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        boolean boolean84 = tag1.isValidParent(tag41);
        boolean boolean85 = tag1.isBlock();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        boolean boolean38 = tag36.isBlock();
        boolean boolean39 = tag36.isEmpty();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        java.lang.String str9 = document2.text();
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements14 = document2.getElementsByAttributeValueStarting("hi!\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        org.jsoup.nodes.Element element34 = element32.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str35 = element34.data();
        org.jsoup.select.Elements elements36 = element34.parents();
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
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        boolean boolean20 = tag18.canContainBlock();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        java.lang.String str9 = element4.html();
        org.jsoup.nodes.Element element11 = element4.wrap("hi!hi!");
        org.jsoup.nodes.Element element13 = element4.addClass("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        boolean boolean14 = element13.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        java.lang.String str9 = element8.val();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.text("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element15 = element13.text("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
        boolean boolean16 = element15.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        document8.setBaseUri("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document8.children();
        org.jsoup.select.Elements elements23 = document8.getElementsByClass("<head>\n</head>\n<body>\n hi!\n</body>");
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueEnding("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        org.jsoup.nodes.Element element19 = element17.val(" <hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.prependElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!&lt;\n<html> \n<head> \n</head> \n<body>  &gt;  \n <head> \n </head> \n <body>  &gt;\n </body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element19.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        boolean boolean8 = element7.isBlock();
        org.jsoup.nodes.Element element10 = element7.wrap("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element10.setBaseUri("html");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element10.childNodes();
        org.jsoup.nodes.Element element15 = element10.addClass("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element17 = element10.addClass("<hi! class=\"\">\nhi!\n</hi!>");
        boolean boolean18 = element10.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValue("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n<&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!>\n</&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>", " <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi!hi!");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document2.addClass("<html>\n<head>\n</head>\n<body>\n &amp;lt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &amp;lt;/&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.prependElement("<hi!#document>\n&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</hi!#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element4.hasText();
        org.jsoup.select.Elements elements18 = element4.getElementsByIndexEquals((-1));
        java.lang.Integer int19 = element4.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element4.prependText("<hi! class=\"\">\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        java.lang.String str11 = element4.text();
        org.jsoup.nodes.Element element13 = element4.prependText("hi! hi!");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements21 = document16.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element24 = document16.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element26 = element13.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str30 = document29.nodeName();
        org.jsoup.select.Elements elements31 = document29.getAllElements();
        java.lang.String str32 = document29.id();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = document35.childNodes();
        org.jsoup.nodes.Element element37 = document29.appendChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element45 = document35.appendChild((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Element element48 = element44.attr("#root", "#document");
        org.jsoup.nodes.Element element49 = element44.empty();
        org.jsoup.select.Elements elements52 = element44.getElementsByAttributeValueNot("body", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element57 = document55.text("hi!");
        org.jsoup.nodes.Element element59 = element57.text("hi!");
        org.jsoup.select.Elements elements61 = element57.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element63 = element57.appendText("hi!");
        element44.replaceWith((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element66 = element57.appendText("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements69 = element66.getElementsByAttributeValueEnding("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList73 = document72.childNodes();
        document72.setBaseUri("hi!");
        org.jsoup.nodes.Element element76 = document72.empty();
        org.jsoup.nodes.Element element78 = element76.append("");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag82 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str83 = tag82.toString();
        org.jsoup.parser.Tag tag84 = tag82.getImplicitParent();
        boolean boolean85 = tag80.equals((java.lang.Object) tag82);
        boolean boolean86 = tag80.isBlock();
        org.jsoup.nodes.Element element88 = new org.jsoup.nodes.Element(tag80, "#root");
        boolean boolean89 = tag80.preserveWhitespace();
        boolean boolean90 = element78.equals((java.lang.Object) tag80);
        java.util.Set<java.lang.String> strSet91 = element78.classNames();
        org.jsoup.nodes.Element element92 = element66.classNames(strSet91);
        org.jsoup.nodes.Element element93 = element25.classNames(strSet91);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertNotNull(element93);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        java.lang.String str31 = element8.baseUri();
        org.jsoup.nodes.Element element33 = element8.toggleClass("<html> <head> </head> <body> hi! </body> </html>");
        java.lang.String str35 = element33.absUrl("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        org.jsoup.nodes.Element element27 = document25.empty();
        java.lang.String str28 = element27.id();
        org.jsoup.parser.Tag tag29 = element27.tag();
        org.jsoup.parser.Tag tag30 = tag29.getImplicitParent();
        boolean boolean31 = tag10.isValidParent(tag30);
        java.lang.String str32 = tag10.toString();
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str35 = tag34.toString();
        org.jsoup.parser.Tag tag36 = tag34.getImplicitParent();
        boolean boolean37 = tag36.preserveWhitespace();
        boolean boolean38 = tag36.isInline();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        document41.setBaseUri("hi!");
        org.jsoup.nodes.Element element46 = document41.prependText("#document");
        boolean boolean47 = tag36.equals((java.lang.Object) "#document");
        boolean boolean48 = tag10.equals((java.lang.Object) tag36);
        java.lang.String str49 = tag10.toString();
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str52 = tag51.toString();
        org.jsoup.parser.Tag tag53 = tag51.getImplicitParent();
        boolean boolean54 = tag53.preserveWhitespace();
        boolean boolean55 = tag53.isInline();
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList59 = document58.childNodes();
        document58.setBaseUri("hi!");
        org.jsoup.nodes.Element element63 = document58.prependText("#document");
        boolean boolean64 = tag53.equals((java.lang.Object) "#document");
        boolean boolean65 = tag10.equals((java.lang.Object) tag53);
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        org.jsoup.select.Elements elements24 = element13.getElementsByAttributeValueNot("<hi!>\n</hi!>#document", "<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element18 = element16.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements23 = element18.getElementsByAttributeValue("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;", "<html>\n<head>\n</head>\n<body>\n &amp;lt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &amp;lt;/&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str11 = tag10.toString();
        org.jsoup.parser.Tag tag12 = tag10.getImplicitParent();
        boolean boolean13 = tag8.equals((java.lang.Object) tag10);
        boolean boolean14 = tag8.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag8, "#root");
        java.lang.String str17 = tag8.toString();
        boolean boolean18 = tag1.isValidParent(tag8);
        boolean boolean19 = tag1.isEmpty();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag1, "body");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag23.isValidParent(tag25);
        boolean boolean27 = tag25.isEmpty();
        java.lang.String str28 = tag25.toString();
        boolean boolean29 = tag1.equals((java.lang.Object) tag25);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = document33.empty();
        org.jsoup.nodes.Element element39 = document33.appendText("hi!");
        org.jsoup.nodes.Attributes attributes40 = document33.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!", attributes40);
        boolean boolean42 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        java.lang.String str11 = document2.outerHtml();
        java.lang.Integer int12 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document2.getElementsByAttributeValueEnding("<html> <head> </head> <body> hi! </body> </html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt; hi!", "<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element32 = document30.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document30.prepend("hi!#document");
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = element41.append("");
        org.jsoup.nodes.Element element44 = element41.empty();
        java.util.Set<java.lang.String> strSet45 = element44.classNames();
        org.jsoup.nodes.Element element46 = document30.classNames(strSet45);
        org.jsoup.nodes.Element element47 = element19.classNames(strSet45);
        org.jsoup.select.Elements elements48 = element19.getAllElements();
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
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        java.lang.String str21 = element16.baseUri();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        org.jsoup.nodes.Element element32 = element8.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
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
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str11 = element10.baseUri();
        java.lang.Class<?> wildcardClass12 = element10.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        org.jsoup.nodes.Element element17 = element14.prepend("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.tagName();
        java.lang.String str19 = element17.baseUri();
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueEnding("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements23 = element17.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        org.jsoup.parser.Tag tag27 = element14.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag27, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = document32.childNodes();
        document32.setBaseUri("hi!");
        org.jsoup.nodes.Element element36 = document32.empty();
        org.jsoup.nodes.Element element38 = element36.append("");
        org.jsoup.nodes.Element element39 = element38.empty();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element43 = element38.toggleClass("#root");
        org.jsoup.nodes.Element element44 = element29.appendChild((org.jsoup.nodes.Node) element43);
        java.util.Set<java.lang.String> strSet45 = element29.classNames();
        org.jsoup.nodes.Element element47 = element29.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str15 = element12.className();
        org.jsoup.nodes.Node node17 = element12.removeAttr("hi!hi!");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.select.Elements elements23 = document20.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element25 = document20.text("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element26 = element12.prependChild((org.jsoup.nodes.Node) element25);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = document33.empty();
        org.jsoup.nodes.Element element39 = document33.appendText("hi!");
        org.jsoup.select.Elements elements41 = document33.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element43 = document33.appendText("#document");
        org.jsoup.select.Elements elements45 = element43.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str46 = element43.className();
        org.jsoup.nodes.Node node48 = element43.removeAttr("hi!hi!");
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = document51.childNodes();
        document51.setBaseUri("hi!");
        org.jsoup.nodes.Element element56 = document51.prepend("#root");
        java.lang.String str57 = document51.tagName();
        boolean boolean58 = document51.isBlock();
        org.jsoup.nodes.Element element59 = element43.prependChild((org.jsoup.nodes.Node) document51);
        org.jsoup.nodes.Element element60 = element29.appendChild((org.jsoup.nodes.Node) element59);
        org.jsoup.nodes.Element element62 = element60.appendElement("<html>\n<head>\n</head>\n<body>\n hi!#document&lt;#root #root=&quot;#document&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  hi! \n  </body>\n </html>\n</body>\n</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
        org.jsoup.parser.Tag tag63 = element60.tag();
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
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root" + "'", str57, "#root");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(tag63);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        boolean boolean10 = tag3.isEmpty();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        boolean boolean16 = element15.isBlock();
        boolean boolean17 = element15.hasText();
        org.jsoup.parser.Tag tag18 = element15.tag();
        boolean boolean19 = tag3.canContain(tag18);
        java.lang.String str20 = tag18.getName();
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str23 = tag22.toString();
        org.jsoup.parser.Tag tag24 = tag22.getImplicitParent();
        boolean boolean25 = tag24.preserveWhitespace();
        boolean boolean26 = tag24.isInline();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document29.prependText("#document");
        boolean boolean35 = tag24.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document38.childNodes();
        document38.setBaseUri("hi!");
        org.jsoup.nodes.Element element43 = document38.prependText("#document");
        java.lang.String str45 = document38.attr("#document");
        org.jsoup.nodes.Element element47 = document38.prependText("");
        boolean boolean48 = tag24.equals((java.lang.Object) element47);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = document52.childNodes();
        org.jsoup.nodes.Element element54 = document52.empty();
        java.lang.String str55 = element54.id();
        org.jsoup.parser.Tag tag56 = element54.tag();
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str60 = document59.nodeName();
        org.jsoup.select.Elements elements61 = document59.getAllElements();
        java.util.Set<java.lang.String> strSet62 = document59.classNames();
        org.jsoup.nodes.Element element63 = element54.classNames(strSet62);
        org.jsoup.nodes.Attributes attributes64 = element54.attributes();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag24, "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", attributes64);
        boolean boolean66 = tag18.isValidParent(tag24);
        java.lang.String str67 = tag24.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#document" + "'", str60, "#document");
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "body" + "'", str67, "body");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean2 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str5 = tag4.toString();
        boolean boolean6 = tag4.isBlock();
        boolean boolean7 = tag4.isEmpty();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str12 = tag11.toString();
        org.jsoup.parser.Tag tag13 = tag11.getImplicitParent();
        boolean boolean14 = tag9.equals((java.lang.Object) tag11);
        boolean boolean15 = tag9.isBlock();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag9, "#root");
        boolean boolean18 = tag9.isInline();
        boolean boolean19 = tag4.isValidParent(tag9);
        boolean boolean20 = tag1.isValidParent(tag4);
        boolean boolean21 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag3.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document hi!");
        boolean boolean10 = tag3.isData();
        boolean boolean11 = tag3.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((int) (short) 10);
        java.lang.String str9 = element6.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!#document <html> <head> </head> <body> </body> </html>" + "'", str9, "hi!#document <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        org.jsoup.nodes.Element element22 = element21.firstElementSibling();
        org.jsoup.parser.Tag tag23 = element21.tag();
        org.jsoup.nodes.Element element25 = element21.prepend("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element27 = element25.append("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements29 = element27.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
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
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag1, "\n<body>\nhi!\n</body>");
        org.jsoup.select.Elements elements38 = element36.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Element element40 = element36.addClass("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        org.jsoup.nodes.Element element41 = element36.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet42 = element41.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str32, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(element41);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element11 = document2.toggleClass("<hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!&lt;\n<html> \n<head> \n</head> \n<body>  &gt;  \n <head> \n </head> \n <body>  &gt;\n </body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag1.canContainBlock();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Element element10 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element13 = element10.empty();
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueNot(" <html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>", "<hi! class=\"#document &lt;hi! class=&quot;#document &quot; #document=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt;\n#root#document\n&lt;/hi!&gt;\">\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        boolean boolean21 = document18.hasClass("");
        boolean boolean22 = document18.hasText();
        org.jsoup.select.Elements elements24 = document18.getElementsByTag("hi!#document");
        java.lang.String str25 = document18.html();
        java.lang.String str26 = document18.nodeName();
        org.jsoup.nodes.Element element27 = element15.appendChild((org.jsoup.nodes.Node) document18);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        java.lang.String str15 = document2.toString();
        java.lang.String str16 = document2.toString();
        java.lang.String str17 = document2.html();
        org.jsoup.nodes.Element element19 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.parser.Tag tag21 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag20, "<< > >>\n</< > >>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!#document" + "'", str15, "hi!#document");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!#document" + "'", str16, "hi!#document");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!#document" + "'", str17, "hi!#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        java.lang.Object obj15 = null;
        boolean boolean16 = document2.equals(obj15);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element29 = document23.appendText("hi!");
        org.jsoup.nodes.Attributes attributes30 = document23.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag18, "hi!", attributes30);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element36 = document34.text("hi!");
        org.jsoup.nodes.Element element38 = element36.text("hi!");
        org.jsoup.select.Elements elements40 = element36.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet41 = element36.classNames();
        java.lang.String str42 = element36.data();
        org.jsoup.select.Elements elements43 = element36.parents();
        boolean boolean44 = element31.equals((java.lang.Object) element36);
        org.jsoup.nodes.Element element46 = element31.html("hi!");
        java.lang.String str47 = element31.html();
        org.jsoup.nodes.Attributes attributes48 = element31.attributes();
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = document51.childNodes();
        document51.setBaseUri("hi!");
        org.jsoup.nodes.Element element55 = document51.empty();
        org.jsoup.nodes.Element element57 = element55.append("");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag61 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str62 = tag61.toString();
        org.jsoup.parser.Tag tag63 = tag61.getImplicitParent();
        boolean boolean64 = tag59.equals((java.lang.Object) tag61);
        boolean boolean65 = tag59.isBlock();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag59, "#root");
        boolean boolean68 = tag59.preserveWhitespace();
        boolean boolean69 = element57.equals((java.lang.Object) tag59);
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag59, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document74 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList75 = document74.childNodes();
        org.jsoup.nodes.Element element76 = document74.empty();
        java.lang.String str77 = element76.id();
        org.jsoup.parser.Tag tag78 = element76.tag();
        org.jsoup.parser.Tag tag79 = tag78.getImplicitParent();
        boolean boolean80 = tag59.isValidParent(tag79);
        boolean boolean81 = element31.equals((java.lang.Object) tag59);
        boolean boolean82 = document2.equals((java.lang.Object) element31);
        org.jsoup.nodes.Element element84 = element31.appendElement("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.nodes.Document document87 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element89 = document87.text("hi!");
        boolean boolean90 = element89.isBlock();
        boolean boolean91 = element89.hasText();
        org.jsoup.parser.Tag tag92 = element89.tag();
        element89.setBaseUri("#root");
        org.jsoup.nodes.Element element96 = element89.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element97 = element31.prependChild((org.jsoup.nodes.Node) element89);
        java.lang.String str98 = element31.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node99 = element31.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(tag92);
        org.junit.Assert.assertNotNull(element96);
        org.junit.Assert.assertNotNull(element97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        org.jsoup.select.Elements elements25 = element17.getElementsByAttributeValueNot("body", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str26 = element17.val();
        org.jsoup.select.Elements elements29 = element17.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!", "<< > >>\n</< > >>");
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element21 = element19.addClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.select.Elements elements22 = element19.getAllElements();
        java.lang.String str24 = element19.absUrl("<#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>hi!#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueStarting("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>");
        boolean boolean29 = element25.isBlock();
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
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        java.lang.String str22 = document2.absUrl("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements24 = document2.getElementsByIndexGreaterThan((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        boolean boolean4 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.prepend("<#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>hi!#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements24 = element14.getElementsByAttribute("#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        java.lang.String str17 = element12.nodeName();
        org.jsoup.nodes.Attributes attributes18 = element12.attributes();
        java.lang.String str19 = element12.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str3 = document2.html();
        java.lang.String str5 = document2.attr("hi!#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        java.lang.String str43 = element41.tagName();
        org.jsoup.nodes.Attributes attributes44 = element41.attributes();
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
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "body" + "'", str43, "body");
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.parser.Tag tag34 = element20.tag();
        boolean boolean35 = tag34.isEmpty();
        boolean boolean36 = tag34.isInline();
        boolean boolean37 = tag34.isBlock();
        boolean boolean38 = tag34.canContainBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        java.lang.String str8 = tag7.toString();
        boolean boolean9 = tag7.canContainBlock();
        boolean boolean10 = tag7.preserveWhitespace();
        java.lang.String str11 = tag7.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "body" + "'", str11, "body");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document24.empty();
        org.jsoup.nodes.Element element30 = document24.appendText("hi!");
        org.jsoup.select.Elements elements32 = document24.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag34, "");
        java.lang.String[] strArray39 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element36.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element43 = document24.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.select.Elements elements45 = document24.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element47 = document24.appendElement("hi!");
        org.jsoup.nodes.Element element48 = element47.lastElementSibling();
        org.jsoup.nodes.Element element50 = element47.removeClass("<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>");
        org.jsoup.nodes.Node node51 = element50.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = element19.appendChild(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str26 = tag25.toString();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        boolean boolean28 = tag23.equals((java.lang.Object) tag25);
        java.lang.String str29 = tag23.toString();
        java.lang.String str30 = tag23.toString();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document34.childNodes();
        document34.setBaseUri("hi!");
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.nodes.Attributes attributes39 = document34.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag23, "body", attributes39);
        element21.replaceWith((org.jsoup.nodes.Node) element40);
        boolean boolean42 = element40.hasText();
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
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("");
        org.jsoup.nodes.Node node11 = document2.removeAttr("body");
        org.jsoup.nodes.Element element13 = document2.val("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        boolean boolean10 = element8.hasAttr("");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = document13.child((int) (short) 0);
        org.jsoup.nodes.Element element19 = element8.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.select.Elements elements24 = document22.getAllElements();
        java.lang.String str25 = document22.id();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Element element30 = document22.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element32 = document28.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node33 = element32.previousSibling();
        org.jsoup.nodes.Element element36 = element32.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Node node37 = element32.previousSibling();
        java.lang.String str38 = element32.toString();
        java.lang.String str39 = element32.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = document13.appendChild((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>" + "'", str38, "<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.select.Elements elements9 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str14 = element13.nodeName();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueEnding("<hi!>\n<#root>\n</#root>\n</hi!>", "hi!#document");
        org.jsoup.nodes.Element element18 = element13.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(" hi!hi!", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str9 = tag8.toString();
        org.jsoup.parser.Tag tag10 = tag8.getImplicitParent();
        boolean boolean11 = tag6.equals((java.lang.Object) tag8);
        boolean boolean12 = tag6.isBlock();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag6, "#root");
        boolean boolean15 = tag6.isInline();
        boolean boolean16 = tag1.isValidParent(tag6);
        boolean boolean17 = tag6.canContainBlock();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag20, "hi!", attributes32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.nodes.Attributes attributes44 = document37.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, "#document", attributes44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = element52.append("");
        org.jsoup.parser.Tag tag55 = element52.tag();
        boolean boolean56 = tag20.canContain(tag55);
        boolean boolean57 = tag20.preserveWhitespace();
        org.jsoup.parser.Tag tag58 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements61 = element60.getAllElements();
        org.jsoup.nodes.Element element63 = element60.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements65 = element60.getElementsByIndexEquals(1);
        java.lang.String str66 = element60.tagName();
        org.jsoup.nodes.Attributes attributes67 = element60.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag6, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", attributes67);
        org.jsoup.nodes.Element element70 = element68.addClass("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.lang.String str71 = element68.nodeName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "body" + "'", str66, "body");
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Node node14 = document5.previousSibling();
        java.lang.String str15 = document5.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag3.isBlock();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        document14.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = document14.empty();
        org.jsoup.nodes.Element element20 = document14.appendText("hi!");
        org.jsoup.nodes.Attributes attributes21 = document14.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag9, "hi!", attributes21);
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = document26.appendText("hi!");
        org.jsoup.nodes.Attributes attributes33 = document26.attributes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag9, "#document", attributes33);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = element41.append("");
        org.jsoup.parser.Tag tag44 = element41.tag();
        boolean boolean45 = tag9.canContain(tag44);
        boolean boolean46 = tag9.preserveWhitespace();
        org.jsoup.parser.Tag tag47 = tag9.getImplicitParent();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag47, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements50 = element49.getAllElements();
        org.jsoup.nodes.Element element52 = element49.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements54 = element49.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element56 = element49.prependText("#document<html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element58 = element56.html("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        boolean boolean59 = tag3.equals((java.lang.Object) element58);
        boolean boolean60 = tag3.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element4.hasText();
        boolean boolean17 = element4.hasText();
        boolean boolean19 = element4.hasAttr("<#root>");
        java.lang.String str20 = element4.baseUri();
        org.jsoup.select.Elements elements22 = element4.getElementsByAttribute("<<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>>\n</<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>>");
        java.lang.String str23 = element4.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.prepend("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        java.lang.String str9 = element4.baseUri();
        org.jsoup.nodes.Element element11 = element4.val("<#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;/#root&gt;");
        org.jsoup.nodes.Element element13 = element11.prependText("\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element14.data();
        org.jsoup.select.Elements elements18 = element14.parents();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        org.jsoup.nodes.Element element20 = document8.toggleClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document8.childNodes();
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        java.lang.String str38 = tag1.toString();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag42, "");
        boolean boolean45 = tag42.isEmpty();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = document49.childNodes();
        document49.setBaseUri("hi!");
        org.jsoup.nodes.Element element53 = document49.empty();
        org.jsoup.nodes.Element element55 = document49.appendText("hi!");
        org.jsoup.select.Elements elements56 = document49.parents();
        org.jsoup.nodes.Attributes attributes57 = document49.attributes();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag42, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", attributes57);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag39, "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", attributes57);
        boolean boolean60 = element59.isBlock();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag11 = element8.tag();
        element8.setBaseUri(" body");
        org.jsoup.nodes.Node node15 = element8.removeAttr("<#root>");
        java.lang.String str16 = element8.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        boolean boolean39 = tag1.isBlock();
        boolean boolean40 = tag1.isInline();
        boolean boolean41 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str44 = tag43.toString();
        boolean boolean45 = tag1.equals((java.lang.Object) tag43);
        boolean boolean46 = tag43.isData();
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag48.isValidParent(tag50);
        boolean boolean52 = tag50.isBlock();
        boolean boolean54 = tag50.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag50, "#document");
        boolean boolean57 = tag50.isEmpty();
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element62 = document60.text("hi!");
        boolean boolean63 = element62.isBlock();
        boolean boolean64 = element62.hasText();
        org.jsoup.parser.Tag tag65 = element62.tag();
        boolean boolean66 = tag50.canContain(tag65);
        boolean boolean67 = tag50.isBlock();
        java.lang.String str68 = tag50.toString();
        boolean boolean69 = tag43.canContain(tag50);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.jsoup.nodes.Element element19 = element14.previousElementSibling();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        org.jsoup.nodes.Attributes attributes24 = document22.attributes();
        org.jsoup.parser.Tag tag25 = document22.tag();
        java.lang.String str26 = document22.nodeName();
        org.jsoup.parser.Tag tag27 = document22.tag();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str32 = tag31.toString();
        org.jsoup.parser.Tag tag33 = tag31.getImplicitParent();
        boolean boolean34 = tag29.equals((java.lang.Object) tag31);
        java.lang.String str35 = tag29.toString();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean40 = tag37.isValidParent(tag39);
        boolean boolean41 = tag29.canContain(tag39);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = document48.appendText("hi!");
        org.jsoup.nodes.Attributes attributes55 = document48.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag43, "hi!", attributes55);
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = document60.childNodes();
        document60.setBaseUri("hi!");
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element66 = document60.appendText("hi!");
        org.jsoup.nodes.Attributes attributes67 = document60.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag43, "#document", attributes67);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element73 = document71.text("hi!");
        java.lang.String str74 = document71.outerHtml();
        java.lang.String str75 = document71.data();
        boolean boolean76 = tag43.equals((java.lang.Object) document71);
        org.jsoup.nodes.Document document79 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element81 = document79.text("hi!");
        org.jsoup.nodes.Element element83 = element81.text("hi!");
        org.jsoup.nodes.Element element85 = element81.prepend("");
        boolean boolean86 = tag43.equals((java.lang.Object) "");
        boolean boolean87 = tag39.isValidParent(tag43);
        boolean boolean88 = tag27.isValidParent(tag43);
        org.jsoup.nodes.Element element90 = new org.jsoup.nodes.Element(tag27, "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element92 = element90.prependElement("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements95 = element90.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = element19.equals((java.lang.Object) element90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str74, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertNotNull(elements95);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        org.jsoup.nodes.Element element8 = document2.addClass("");
        java.lang.Integer int9 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Element element18 = element16.text("hi!");
        org.jsoup.select.Elements elements19 = element16.parents();
        org.jsoup.nodes.Element element21 = element16.toggleClass("#root");
        java.lang.String str22 = element16.baseUri();
        org.jsoup.select.Elements elements23 = element16.getAllElements();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element28 = document26.text("hi!");
        org.jsoup.select.Elements elements31 = document26.getElementsByAttributeValueStarting("hi!", "#document");
        boolean boolean32 = element16.equals((java.lang.Object) elements31);
        java.lang.String str34 = element16.absUrl("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        boolean boolean36 = element16.hasAttr("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = document2.appendChild((org.jsoup.nodes.Node) element16);
        java.util.Set<java.lang.String> strSet38 = element37.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        boolean boolean7 = tag1.canContainBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.prepend("hi!hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        java.lang.String str15 = document2.toString();
        java.lang.String str16 = document2.toString();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document19.prepend("#root");
        java.lang.String str25 = document19.tagName();
        document19.setBaseUri("");
        org.jsoup.nodes.Element element28 = document2.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element30 = element28.text("hi! hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!#document" + "'", str15, "hi!#document");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!#document" + "'", str16, "hi!#document");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!hi!");
        org.jsoup.nodes.Element element15 = element11.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        boolean boolean16 = element11.hasText();
        org.jsoup.nodes.Element element18 = element11.appendElement("html");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element11.childNodes();
        org.jsoup.select.Elements elements21 = element11.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            element11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        java.lang.String str20 = element3.attr("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        java.lang.Integer int21 = element3.elementSiblingIndex();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.nodeName();
        org.jsoup.select.Elements elements26 = document24.getAllElements();
        java.lang.String str27 = document24.id();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        org.jsoup.nodes.Element element32 = document24.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = document35.childNodes();
        document35.setBaseUri("hi!");
        org.jsoup.nodes.Element element39 = document35.empty();
        org.jsoup.nodes.Element element40 = document30.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element43 = element39.attr("#root", "#document");
        org.jsoup.select.Elements elements44 = element39.children();
        boolean boolean45 = element3.equals((java.lang.Object) elements44);
        java.lang.Class<?> wildcardClass46 = elements44.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendElement("body");
        org.jsoup.nodes.Element element11 = element9.wrap("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.getElementsByTag("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        java.lang.String str13 = element8.text();
        java.lang.String str14 = element8.baseUri();
        org.jsoup.select.Elements elements15 = element8.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.nodeName();
        org.jsoup.select.Elements elements20 = document18.getAllElements();
        java.lang.String str21 = document18.id();
        java.lang.String str22 = document18.val();
        java.lang.Integer int23 = document18.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = document18.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) document18);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList60 = document59.childNodes();
        org.jsoup.nodes.Element element61 = document59.empty();
        java.lang.String str62 = element61.id();
        org.jsoup.parser.Tag tag63 = element61.tag();
        org.jsoup.parser.Tag tag64 = tag63.getImplicitParent();
        java.lang.String str65 = tag64.toString();
        boolean boolean66 = tag64.canContainBlock();
        boolean boolean67 = tag64.canContainBlock();
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag64, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag64, "\n<hi!>\n</hi!>");
        boolean boolean72 = tag53.canContain(tag64);
        org.jsoup.parser.Tag tag74 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag76 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean77 = tag74.isValidParent(tag76);
        boolean boolean78 = tag76.preserveWhitespace();
        boolean boolean79 = tag76.isBlock();
        boolean boolean80 = tag64.canContain(tag76);
        boolean boolean81 = tag64.preserveWhitespace();
        boolean boolean82 = tag64.isData();
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
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "body" + "'", str65, "body");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        java.lang.String str40 = tag1.getName();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Element element12 = element6.val("hi!");
        org.jsoup.nodes.Element element14 = element6.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;amp;lt;&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;amp;lt;/&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "body");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean9 = document2.hasAttr("hi!#document");
        org.jsoup.nodes.Element element11 = document2.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str14 = element11.html();
        org.jsoup.nodes.Element element16 = element11.prependElement("\n<body>\nhi!\n</body>");
        org.jsoup.nodes.Element element18 = element11.appendText("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!#document  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>" + "'", str14, "<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        java.lang.String str9 = document2.text();
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element13 = element11.appendText("");
        org.jsoup.nodes.Element element15 = element13.removeClass("<html> <head> </head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element13.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Element element8 = element4.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexEquals((int) 'a');
        org.jsoup.select.Elements elements11 = element4.children();
        java.lang.String str13 = element4.attr("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element4.childNodes();
        boolean boolean16 = element4.hasClass("<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>#document");
        java.lang.String str17 = element4.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Node node11 = document2.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document2.attr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        java.lang.String str16 = document2.attr("&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueStarting("<hi!>\n</hi!>#document", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;");
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Attributes attributes7 = element6.attributes();
        org.jsoup.nodes.Element element8 = element6.empty();
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.select.Elements elements14 = element11.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element11.child((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        org.jsoup.nodes.Element element23 = element16.prependText("hi!");
        org.jsoup.nodes.Element element25 = element23.toggleClass("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element28 = element23.lastElementSibling();
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag30.isValidParent(tag32);
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "#document");
        boolean boolean36 = tag30.canContainBlock();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag30, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        element23.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element40 = element23.empty();
        java.lang.String str42 = element40.absUrl("\n<<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean7 = tag1.isEmpty();
        org.jsoup.parser.Tag tag8 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
        org.jsoup.nodes.Element element13 = document11.empty();
        java.lang.String str14 = element13.id();
        org.jsoup.parser.Tag tag15 = element13.tag();
        org.jsoup.parser.Tag tag16 = tag15.getImplicitParent();
        java.lang.String str17 = tag16.toString();
        boolean boolean18 = tag16.canContainBlock();
        java.lang.String str19 = tag16.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = document22.appendText("hi!");
        org.jsoup.select.Elements elements30 = document22.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element32 = document22.appendText("#document");
        org.jsoup.nodes.Element element34 = element32.append("");
        java.lang.Integer int35 = element34.elementSiblingIndex();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element40 = document38.text("hi!");
        org.jsoup.nodes.Element element42 = element40.text("hi!");
        org.jsoup.select.Elements elements44 = element40.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element46 = element40.appendText("hi!");
        org.jsoup.nodes.Element element49 = element40.attr("#root", "#document");
        org.jsoup.nodes.Node node51 = element40.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements52 = element40.parents();
        org.jsoup.nodes.Element element53 = element34.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.parser.Tag tag54 = element40.tag();
        boolean boolean55 = tag54.isEmpty();
        boolean boolean56 = tag16.isValidParent(tag54);
        boolean boolean57 = tag16.canContainBlock();
        boolean boolean58 = tag1.canContain(tag16);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "body" + "'", str17, "body");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "body" + "'", str19, "body");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Node node11 = document2.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element13 = document2.append("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.select.Elements elements15 = element13.getElementsByTag("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = document22.appendText("hi!");
        org.jsoup.nodes.Attributes attributes29 = document22.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag17, "hi!", attributes29);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element35 = document33.text("hi!");
        org.jsoup.nodes.Element element37 = element35.text("hi!");
        org.jsoup.select.Elements elements39 = element35.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet40 = element35.classNames();
        java.lang.String str41 = element35.data();
        org.jsoup.select.Elements elements42 = element35.parents();
        boolean boolean43 = element30.equals((java.lang.Object) element35);
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element48 = document46.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element50 = document46.prepend("hi!#document");
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = document53.childNodes();
        document53.setBaseUri("hi!");
        org.jsoup.nodes.Element element57 = document53.empty();
        org.jsoup.nodes.Element element59 = element57.append("");
        org.jsoup.nodes.Element element60 = element57.empty();
        java.util.Set<java.lang.String> strSet61 = element60.classNames();
        org.jsoup.nodes.Element element62 = document46.classNames(strSet61);
        org.jsoup.nodes.Element element63 = element35.classNames(strSet61);
        org.jsoup.nodes.Element element64 = element13.classNames(strSet61);
        org.jsoup.parser.Tag tag65 = element64.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(tag65);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document34.childNodes();
        document34.setBaseUri("hi!");
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.nodes.Element element40 = element38.append("");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str45 = tag44.toString();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag42.equals((java.lang.Object) tag44);
        boolean boolean48 = tag42.isBlock();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag42, "#root");
        boolean boolean51 = tag42.preserveWhitespace();
        boolean boolean52 = element40.equals((java.lang.Object) tag42);
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag42, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document57.childNodes();
        org.jsoup.nodes.Element element59 = document57.empty();
        java.lang.String str60 = element59.id();
        org.jsoup.parser.Tag tag61 = element59.tag();
        org.jsoup.parser.Tag tag62 = tag61.getImplicitParent();
        boolean boolean63 = tag42.isValidParent(tag62);
        boolean boolean64 = element14.equals((java.lang.Object) tag42);
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList68 = document67.childNodes();
        document67.setBaseUri("hi!");
        org.jsoup.nodes.Element element72 = document67.child((int) (short) 0);
        java.lang.String str74 = document67.attr("#document");
        org.jsoup.nodes.Document document77 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList78 = document77.childNodes();
        org.jsoup.nodes.Element element79 = document77.empty();
        java.lang.String str80 = element79.val();
        org.jsoup.nodes.Element element81 = document67.prependChild((org.jsoup.nodes.Node) element79);
        org.jsoup.nodes.Element element82 = element79.firstElementSibling();
        org.jsoup.select.Elements elements84 = element82.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean86 = element82.hasClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Node node88 = element82.removeAttr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element90 = element82.removeClass("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        boolean boolean91 = tag42.equals((java.lang.Object) element90);
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
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(elements84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(element90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        org.jsoup.select.Elements elements25 = element17.getElementsByAttributeValueNot("body", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element30 = document28.text("hi!");
        org.jsoup.nodes.Element element32 = element30.text("hi!");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element36 = element30.appendText("hi!");
        element17.replaceWith((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element39 = element30.appendText("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str42 = tag41.toString();
        boolean boolean43 = tag41.isBlock();
        boolean boolean44 = tag41.preserveWhitespace();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element49 = document47.text("hi!");
        org.jsoup.nodes.Element element51 = element49.text("hi!");
        org.jsoup.select.Elements elements53 = element49.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element55 = element49.appendText("hi!");
        org.jsoup.nodes.Element element57 = element55.text("");
        boolean boolean58 = tag41.equals((java.lang.Object) element57);
        org.jsoup.select.Elements elements59 = element57.parents();
        org.jsoup.nodes.Element element61 = element57.prependElement("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>");
        org.jsoup.nodes.Element element63 = element57.appendText("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean64 = element39.equals((java.lang.Object) element63);
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element9 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element19 = document13.appendText("hi!");
        org.jsoup.select.Elements elements21 = document13.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element23 = document13.appendText("#document");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element27 = element23.prependElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        java.util.Set<java.lang.String> strSet28 = element23.classNames();
        org.jsoup.nodes.Element element29 = element9.classNames(strSet28);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag3.isBlock();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document8.empty();
        org.jsoup.nodes.Element element14 = document8.appendText("hi!");
        org.jsoup.nodes.Attributes attributes15 = document8.attributes();
        document8.setBaseUri("#document");
        org.jsoup.select.Elements elements19 = document8.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element21 = document8.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = document8.getAllElements();
        org.jsoup.nodes.Attributes attributes23 = document8.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag3, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!", attributes23);
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        document31.setBaseUri("hi!");
        org.jsoup.nodes.Element element35 = document31.empty();
        org.jsoup.nodes.Element element37 = document31.appendText("hi!");
        org.jsoup.nodes.Attributes attributes38 = document31.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag26, "hi!", attributes38);
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = document43.childNodes();
        document43.setBaseUri("hi!");
        org.jsoup.nodes.Element element47 = document43.empty();
        org.jsoup.nodes.Element element49 = document43.appendText("hi!");
        org.jsoup.nodes.Attributes attributes50 = document43.attributes();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag26, "#document", attributes50);
        boolean boolean52 = tag26.isData();
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element57 = document55.text("hi!");
        org.jsoup.parser.Tag tag58 = document55.tag();
        boolean boolean59 = tag26.canContain(tag58);
        boolean boolean60 = tag26.isBlock();
        boolean boolean61 = tag3.isValidParent(tag26);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element11.toggleClass("body");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element22 = document16.appendText("hi!");
        org.jsoup.select.Elements elements24 = document16.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = document16.appendText("#document");
        boolean boolean28 = document16.hasClass("hi!");
        boolean boolean30 = document16.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document16.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "body");
        org.jsoup.nodes.Element element34 = element11.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Node node35 = element33.previousSibling();
        org.jsoup.nodes.Element element37 = element33.prependText("");
        org.jsoup.nodes.Element element39 = element33.appendText("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        java.lang.String str43 = element41.tagName();
        java.lang.String str44 = element41.nodeName();
        java.lang.String str45 = element41.tagName();
        java.lang.String str46 = element41.tagName();
        java.lang.String str47 = element41.html();
        org.jsoup.nodes.Element element49 = element41.appendText("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "body" + "'", str43, "body");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "body" + "'", str44, "body");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "body" + "'", str45, "body");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "body" + "'", str46, "body");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        java.lang.String str50 = tag39.getName();
        java.lang.String str51 = tag39.getName();
        org.jsoup.parser.Tag tag52 = tag39.getImplicitParent();
        org.jsoup.parser.Tag tag53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = tag52.canContain(tag53);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "body" + "'", str50, "body");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "body" + "'", str51, "body");
        org.junit.Assert.assertNotNull(tag52);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        org.jsoup.nodes.Element element50 = element27.addClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element50.appendElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root><hi!>\n<<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>>\n</<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>>\n</hi!>");
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
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str7 = tag6.toString();
        org.jsoup.parser.Tag tag8 = tag6.getImplicitParent();
        boolean boolean9 = tag4.equals((java.lang.Object) tag6);
        java.lang.String str10 = tag4.toString();
        java.lang.String str11 = tag4.toString();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Attributes attributes20 = document15.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag4, "body", attributes20);
        org.jsoup.nodes.Element element23 = element21.prependElement("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes24 = element21.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag1, " body", attributes24);
        boolean boolean26 = tag1.preserveWhitespace();
        java.lang.String str27 = tag1.toString();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element32 = document30.text("hi!");
        org.jsoup.nodes.Element element34 = element32.text("hi!");
        org.jsoup.select.Elements elements36 = element32.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element38 = element32.appendText("hi!");
        org.jsoup.nodes.Element element41 = element32.attr("#root", "#document");
        org.jsoup.nodes.Node node43 = element32.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element45 = element32.append("");
        org.jsoup.parser.Tag tag46 = element32.tag();
        boolean boolean47 = tag46.isInline();
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag49.isValidParent(tag51);
        boolean boolean53 = tag51.isBlock();
        boolean boolean55 = tag51.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag51, "#document");
        boolean boolean58 = tag51.isEmpty();
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element63 = document61.text("hi!");
        boolean boolean64 = element63.isBlock();
        boolean boolean65 = element63.hasText();
        org.jsoup.parser.Tag tag66 = element63.tag();
        boolean boolean67 = tag51.canContain(tag66);
        boolean boolean68 = tag46.canContain(tag66);
        boolean boolean69 = tag46.canContainBlock();
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element74 = document72.text("hi!");
        boolean boolean75 = element74.isBlock();
        boolean boolean76 = element74.hasText();
        java.lang.String str77 = element74.data();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = element74.childNodes();
        org.jsoup.select.Elements elements80 = element74.getElementsByAttribute("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList81 = element74.childNodes();
        boolean boolean82 = tag46.equals((java.lang.Object) element74);
        boolean boolean83 = tag1.canContain(tag46);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str27, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.parser.Tag tag11 = tag10.getImplicitParent();
        boolean boolean12 = tag10.isEmpty();
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
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = document43.childNodes();
        document43.setBaseUri("hi!");
        org.jsoup.nodes.Element element47 = document43.empty();
        org.jsoup.nodes.Element element49 = document43.appendText("hi!");
        org.jsoup.nodes.Attributes attributes50 = document43.attributes();
        document43.setBaseUri("#document");
        org.jsoup.select.Elements elements54 = document43.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element56 = document43.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements57 = document43.getAllElements();
        org.jsoup.nodes.Attributes attributes58 = document43.attributes();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag14, "#root", attributes58);
        org.jsoup.select.Elements elements62 = element59.getElementsByAttributeValue("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet63 = element59.classNames();
        boolean boolean64 = tag10.equals((java.lang.Object) element59);
        org.jsoup.nodes.Element element66 = element59.getElementById("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element68 = element59.val("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
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
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        boolean boolean4 = tag1.isData();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        boolean boolean7 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        org.jsoup.nodes.Element element10 = element4.appendChild((org.jsoup.nodes.Node) document9);
        java.lang.String str11 = document9.data();
        java.lang.String str13 = document9.attr("<hi! class=\"\">\nhi!\n</hi!>");
        boolean boolean15 = document9.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getAllElements();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element9 = document2.prependText("hi! <html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element14 = document9.wrap("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.addClass("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element21 = document19.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        document28.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = document28.empty();
        org.jsoup.nodes.Element element34 = document28.appendText("hi!");
        org.jsoup.nodes.Attributes attributes35 = document28.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag23, "hi!", attributes35);
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element46 = document40.appendText("hi!");
        org.jsoup.nodes.Attributes attributes47 = document40.attributes();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag23, "#document", attributes47);
        boolean boolean49 = tag23.preserveWhitespace();
        boolean boolean50 = element21.equals((java.lang.Object) boolean49);
        org.jsoup.nodes.Element element51 = element14.appendChild((org.jsoup.nodes.Node) element21);
        java.lang.String str52 = element51.className();
        org.jsoup.select.Elements elements54 = element51.getElementsByTag(" #document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " <hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>" + "'", str52, " <hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        java.lang.String str9 = element8.val();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.text("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element15 = element8.prepend("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.select.Elements elements17 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getAllElements();
        org.jsoup.parser.Tag tag6 = document2.tag();
        boolean boolean7 = tag6.isData();
        org.jsoup.parser.Tag tag8 = tag6.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = document10.appendText("hi!");
        org.jsoup.nodes.Attributes attributes17 = document10.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag5, "hi!", attributes17);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = document22.appendText("hi!");
        org.jsoup.nodes.Attributes attributes29 = document22.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag5, "#document", attributes29);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = document33.empty();
        org.jsoup.nodes.Element element39 = element37.append("");
        org.jsoup.parser.Tag tag40 = element37.tag();
        boolean boolean41 = tag5.canContain(tag40);
        boolean boolean42 = tag5.preserveWhitespace();
        org.jsoup.parser.Tag tag43 = tag5.getImplicitParent();
        boolean boolean44 = tag1.isValidParent(tag5);
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str49 = tag48.toString();
        org.jsoup.parser.Tag tag50 = tag48.getImplicitParent();
        boolean boolean51 = tag46.equals((java.lang.Object) tag48);
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str56 = tag55.toString();
        org.jsoup.parser.Tag tag57 = tag55.getImplicitParent();
        boolean boolean58 = tag53.equals((java.lang.Object) tag55);
        boolean boolean59 = tag53.isBlock();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag53, "#root");
        java.lang.String str62 = tag53.toString();
        boolean boolean63 = tag46.isValidParent(tag53);
        boolean boolean64 = tag1.isValidParent(tag46);
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str67 = tag66.toString();
        boolean boolean68 = tag66.isBlock();
        boolean boolean69 = tag46.canContain(tag66);
        boolean boolean70 = tag46.canContainBlock();
        org.jsoup.parser.Tag tag71 = tag46.getImplicitParent();
        boolean boolean72 = tag46.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValue("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str17 = element13.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        org.jsoup.nodes.Element element41 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document47.childNodes();
        document47.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document47.empty();
        org.jsoup.nodes.Element element53 = element51.append("");
        org.jsoup.nodes.Element element54 = element51.empty();
        java.util.Set<java.lang.String> strSet55 = element54.classNames();
        org.jsoup.nodes.Element element56 = document44.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element56.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element18.appendChild((org.jsoup.nodes.Node) element56);
        org.jsoup.select.Elements elements62 = element18.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element64 = element18.removeClass("#document ");
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element69 = document67.text("hi!");
        org.jsoup.nodes.Element element71 = element69.text("hi!");
        org.jsoup.nodes.Element element72 = element71.empty();
        java.lang.String str73 = element72.tagName();
        org.jsoup.select.Elements elements74 = element72.children();
        org.jsoup.select.Elements elements76 = element72.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element77 = element18.appendChild((org.jsoup.nodes.Node) element72);
        org.jsoup.nodes.Element element79 = element77.addClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str80 = element79.className();
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
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "#root" + "'", str73, "#root");
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + " <html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str80, " <html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        java.lang.String str22 = element20.attr("hi!#document");
        java.lang.String str24 = element20.attr("\n<#root class=\"\">\n</#root>");
        boolean boolean25 = element20.isBlock();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        org.jsoup.select.Elements elements17 = document2.parents();
        java.lang.String str19 = document2.absUrl("\n<hi!>\n</hi!>");
        java.lang.String str20 = document2.val();
        java.lang.String str21 = document2.nodeName();
        org.jsoup.parser.Tag tag22 = document2.tag();
        org.jsoup.nodes.Element element24 = document2.prepend(" <html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element7 = document2.attr("hi! <html> <head> </head> <body> hi! </body> </html>", "\n<hi!>\n</hi!>");
        boolean boolean9 = element7.hasAttr("<html> \n <head> \n </head> \n <body>\n   hi!  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        java.lang.String str17 = tag1.getName();
        java.lang.String str18 = tag1.getName();
        java.lang.String str19 = tag1.getName();
        boolean boolean20 = tag1.isData();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean2 = tag1.isInline();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag4.isValidParent(tag6);
        boolean boolean8 = tag6.isBlock();
        boolean boolean10 = tag6.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag6, "#document");
        boolean boolean13 = tag6.isEmpty();
        boolean boolean14 = tag1.isValidParent(tag6);
        boolean boolean15 = tag1.isData();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str18, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        java.lang.String str10 = tag3.getName();
        boolean boolean11 = tag3.isInline();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag3, "<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        java.lang.String str8 = tag7.toString();
        org.jsoup.parser.Tag tag9 = tag7.getImplicitParent();
        java.lang.String str10 = tag7.toString();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag14.isValidParent(tag16);
        boolean boolean18 = tag16.canContainBlock();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Element element22 = element20.toggleClass("");
        org.jsoup.nodes.Element element24 = element20.append("hi!");
        boolean boolean25 = tag12.equals((java.lang.Object) element24);
        boolean boolean26 = tag12.isInline();
        boolean boolean27 = tag7.canContain(tag12);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str32 = tag31.toString();
        org.jsoup.parser.Tag tag33 = tag31.getImplicitParent();
        boolean boolean34 = tag29.equals((java.lang.Object) tag31);
        boolean boolean35 = tag31.isBlock();
        boolean boolean36 = tag7.isValidParent(tag31);
        boolean boolean37 = tag31.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "body" + "'", str10, "body");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.isInline();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        org.jsoup.nodes.Element element17 = element15.text("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = element15.appendText("hi!");
        org.jsoup.nodes.Element element24 = element15.attr("#root", "#document");
        org.jsoup.nodes.Node node26 = element15.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element28 = element15.append("");
        org.jsoup.parser.Tag tag29 = element15.tag();
        boolean boolean30 = tag1.canContain(tag29);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element35 = document33.text("hi!");
        boolean boolean36 = element35.isBlock();
        boolean boolean37 = element35.hasText();
        org.jsoup.parser.Tag tag38 = element35.tag();
        org.jsoup.nodes.Element element40 = element35.addClass("");
        org.jsoup.parser.Tag tag41 = element35.tag();
        boolean boolean42 = tag29.isValidParent(tag41);
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str47 = tag46.toString();
        org.jsoup.parser.Tag tag48 = tag46.getImplicitParent();
        boolean boolean49 = tag44.equals((java.lang.Object) tag46);
        boolean boolean50 = tag44.isBlock();
        boolean boolean51 = tag29.equals((java.lang.Object) tag44);
        boolean boolean52 = tag44.preserveWhitespace();
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("hi!#document");
        boolean boolean55 = tag54.isData();
        java.lang.Object obj56 = null;
        boolean boolean57 = tag54.equals(obj56);
        java.lang.String str58 = tag54.getName();
        boolean boolean59 = tag44.isValidParent(tag54);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!#document" + "'", str58, "hi!#document");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        java.lang.String str30 = element23.data();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = element23.prependChild((org.jsoup.nodes.Node) document33);
        java.lang.String str39 = element23.absUrl("#document <hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.nodes.Element element11 = element4.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<hi> &lt;#root&gt;  \n</hi>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element35 = element33.val("hi!hi!");
        boolean boolean36 = element35.isBlock();
        org.jsoup.select.Elements elements38 = element35.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.nodeName();
        boolean boolean14 = element8.equals((java.lang.Object) str13);
        org.jsoup.select.Elements elements17 = element8.getElementsByAttributeValue("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element8.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean9 = document2.hasAttr("hi!#document");
        org.jsoup.nodes.Element element11 = document2.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element22 = document16.appendText("hi!");
        org.jsoup.select.Elements elements24 = document16.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = document16.appendText("#document");
        org.jsoup.nodes.Element element28 = element26.append("");
        java.lang.Integer int29 = element28.elementSiblingIndex();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Node node45 = element34.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements46 = element34.parents();
        org.jsoup.nodes.Element element47 = element28.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element50 = element34.attr("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>", "<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        org.jsoup.nodes.Node node51 = element50.nextSibling();
        boolean boolean52 = element11.equals((java.lang.Object) element50);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        java.lang.String str8 = tag7.toString();
        boolean boolean9 = tag7.canContainBlock();
        boolean boolean10 = tag7.canContainBlock();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "\n<hi!>\n</hi!>");
        boolean boolean15 = tag7.isData();
        boolean boolean16 = tag7.canContainBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueEnding("#root", "#document");
        org.jsoup.nodes.Element element13 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element4.parent();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals(2);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element21 = element19.wrap("#document hi!");
        org.jsoup.nodes.Element element23 = element19.html("hi! hi!");
        org.jsoup.nodes.Element element24 = element19.parent();
        org.jsoup.select.Elements elements26 = element19.getElementsByIndexEquals((int) (short) -1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.select.Elements elements26 = document18.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element28 = document18.appendText("#document");
        org.jsoup.nodes.Element element30 = element28.append("");
        java.lang.Integer int31 = element30.elementSiblingIndex();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element36 = document34.text("hi!");
        org.jsoup.nodes.Element element38 = element36.text("hi!");
        org.jsoup.select.Elements elements40 = element36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element42 = element36.appendText("hi!");
        org.jsoup.nodes.Element element45 = element36.attr("#root", "#document");
        org.jsoup.nodes.Node node47 = element36.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements48 = element36.parents();
        org.jsoup.nodes.Element element49 = element30.appendChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element50 = element13.prependChild((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("\n<hi!>\n</hi!>", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element55 = document53.getElementById("hi!#document");
        java.util.Set<java.lang.String> strSet56 = document53.classNames();
        org.jsoup.nodes.Element element57 = element13.classNames(strSet56);
        java.lang.String str58 = element13.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        java.lang.String str30 = document8.toString();
        org.jsoup.nodes.Node node31 = document8.nextSibling();
        org.jsoup.select.Elements elements32 = document8.siblingElements();
        java.lang.String str33 = document8.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>" + "'", str30, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>" + "'", str33, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        boolean boolean4 = document2.hasAttr("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element19 = document13.appendText("hi!");
        org.jsoup.nodes.Attributes attributes20 = document13.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag8, "hi!", attributes20);
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag8, "#document", attributes32);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document36.childNodes();
        document36.setBaseUri("hi!");
        org.jsoup.nodes.Element element40 = document36.empty();
        org.jsoup.nodes.Element element42 = element40.append("");
        org.jsoup.parser.Tag tag43 = element40.tag();
        boolean boolean44 = tag8.canContain(tag43);
        boolean boolean45 = tag8.preserveWhitespace();
        org.jsoup.parser.Tag tag46 = tag8.getImplicitParent();
        boolean boolean47 = tag6.isValidParent(tag8);
        boolean boolean48 = tag8.isInline();
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str51 = tag50.toString();
        org.jsoup.parser.Tag tag52 = tag50.getImplicitParent();
        java.lang.String str53 = tag50.getName();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element59 = document57.text("hi!");
        org.jsoup.nodes.Element element61 = element59.text("hi!");
        org.jsoup.nodes.Element element63 = element59.html("#root");
        org.jsoup.select.Elements elements65 = element59.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes66 = element59.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag50, "hi!#document", attributes66);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag50, "#root");
        element69.setBaseUri("<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>");
        boolean boolean72 = tag8.equals((java.lang.Object) "<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = document8.nextElementSibling();
        org.jsoup.nodes.Element element13 = document8.appendText("hi!#document");
        org.jsoup.select.Elements elements16 = document8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n <hi>\n   &lt;#root&gt; \n </hi>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str3 = document2.val();
        org.jsoup.nodes.Element element5 = document2.prependElement("<head>\n  </head>\n  <body>\n   hi!\n  </body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        org.jsoup.nodes.Element element27 = document25.empty();
        java.lang.String str28 = element27.id();
        org.jsoup.parser.Tag tag29 = element27.tag();
        org.jsoup.parser.Tag tag30 = tag29.getImplicitParent();
        boolean boolean31 = tag10.isValidParent(tag30);
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag30, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements35 = element33.getElementsByClass("<html> \n<head> \n</head> \n<body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element40 = document38.text("hi!");
        org.jsoup.nodes.Element element42 = element40.text("hi!");
        org.jsoup.select.Elements elements43 = element40.parents();
        org.jsoup.nodes.Element element45 = element40.toggleClass("#root");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        boolean boolean54 = element50.hasClass("#document");
        boolean boolean55 = element50.hasText();
        org.jsoup.nodes.Element element57 = element50.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element58 = element45.appendChild((org.jsoup.nodes.Node) element50);
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag60.isValidParent(tag62);
        boolean boolean64 = tag62.canContainBlock();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.nodes.Element element68 = element66.toggleClass("");
        org.jsoup.nodes.Element element70 = element66.append("hi!");
        org.jsoup.select.Elements elements73 = element70.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements74 = element70.parents();
        org.jsoup.nodes.Element element75 = element58.prependChild((org.jsoup.nodes.Node) element70);
        boolean boolean76 = element70.isBlock();
        org.jsoup.select.Elements elements78 = element70.getElementsByTag("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element79 = element33.prependChild((org.jsoup.nodes.Node) element70);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements78);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        java.lang.String str10 = element9.val();
        org.jsoup.nodes.Element element12 = element9.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element17 = document15.text("hi!");
        boolean boolean18 = element17.isBlock();
        boolean boolean19 = element17.hasText();
        org.jsoup.parser.Tag tag20 = element17.tag();
        org.jsoup.nodes.Element element22 = element17.addClass("");
        java.lang.String str23 = element22.nodeName();
        boolean boolean24 = element9.equals((java.lang.Object) element22);
        boolean boolean25 = element9.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        java.lang.String str10 = element6.html();
        java.lang.String str11 = element6.outerHtml();
        java.lang.String str12 = element6.text();
        org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueEnding("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "hi!");
        java.lang.Integer int16 = element6.elementSiblingIndex();
        org.jsoup.select.Elements elements19 = element6.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n <hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n   #root#document \n </hi>\n</body>\n</html>", "<hi!#document>\n&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</hi!#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        java.lang.String str34 = element33.tagName();
        java.lang.String str35 = element33.tagName();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element7 = document5.text("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element11 = element7.removeClass("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.prepend("body");
        java.lang.String str16 = element15.baseUri();
        org.jsoup.nodes.Attributes attributes17 = element15.attributes();
        java.lang.String str19 = element15.attr("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element20 = document2.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String str21 = element15.id();
        org.jsoup.select.Elements elements22 = element15.siblingElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element35 = element33.prependText("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element39 = element35.prependElement("<html> <head> </head> <body> hi! </body> </html>");
        element35.setBaseUri("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
            org.jsoup.select.Elements elements50 = element48.select("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>?</#root>?<html>?<head>?</head>?<body>? hi!?</body>?</html>");
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
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element9 = document2.appendText("hi!");
        org.jsoup.nodes.Element element11 = element9.getElementById("<html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        boolean boolean28 = element23.hasAttr("\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str29 = element23.text();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element11.toggleClass("body");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element22 = document16.appendText("hi!");
        org.jsoup.select.Elements elements24 = document16.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = document16.appendText("#document");
        boolean boolean28 = document16.hasClass("hi!");
        boolean boolean30 = document16.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document16.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "body");
        org.jsoup.nodes.Element element34 = element11.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Node node35 = element33.previousSibling();
        java.lang.String str36 = element33.tagName();
        java.lang.Integer int37 = element33.siblingIndex();
        java.lang.String str38 = element33.className();
        org.jsoup.nodes.Node node40 = element33.removeAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        java.lang.String str41 = element33.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag3 = document2.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean18 = tag1.isEmpty();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element24 = document22.text("hi!");
        org.jsoup.nodes.Attributes attributes25 = element24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, " <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", attributes25);
        org.jsoup.parser.Tag tag27 = tag1.getImplicitParent();
        boolean boolean28 = tag27.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        org.jsoup.nodes.Element element30 = element23.lastElementSibling();
        org.jsoup.nodes.Element element32 = element23.prependElement("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element32.childNodes();
        org.jsoup.nodes.Element element34 = element32.nextElementSibling();
        org.jsoup.select.Elements elements36 = element32.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;amp;lt;&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;amp;lt;/&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element38 = element32.val("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;");
        org.jsoup.select.Elements elements40 = element32.getElementsByIndexGreaterThan((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        org.jsoup.nodes.Element element36 = element34.prependElement("< > >");
        org.jsoup.nodes.Element element38 = element36.wrap("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str40 = element36.absUrl("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
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
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element14.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan((int) (short) 1);
        java.util.Set<java.lang.String> strSet20 = element14.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements6 = element4.parents();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;", "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element22 = element20.append("");
        org.jsoup.parser.Tag tag23 = element20.tag();
        java.lang.String str24 = element20.tagName();
        java.lang.String str25 = element20.outerHtml();
        org.jsoup.select.Elements elements27 = element20.getElementsByTag("#root");
        org.jsoup.nodes.Element element28 = element13.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element30 = element20.append("<hi!>\n<#root>\n</#root>\n</hi!>");
        element30.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        java.lang.Integer int33 = element30.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = element4.appendChild((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Element element7 = element4.addClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node9 = element7.removeAttr("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        java.lang.String str21 = tag10.getName();
        org.jsoup.parser.Tag tag22 = tag10.getImplicitParent();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = document29.appendText("hi!");
        org.jsoup.nodes.Attributes attributes36 = document29.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag24, "hi!", attributes36);
        boolean boolean38 = tag24.canContainBlock();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag24, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean41 = tag24.isEmpty();
        org.jsoup.parser.Tag tag42 = tag24.getImplicitParent();
        boolean boolean43 = tag10.canContain(tag24);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        java.lang.String str10 = element4.attr("#root");
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document");
        org.jsoup.nodes.Element element14 = element12.append("hi!hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document17.prependText("#document");
        java.lang.String str24 = document17.attr("#document");
        org.jsoup.nodes.Element element26 = document17.prependText("");
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element28 = element12.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element12.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
        org.jsoup.nodes.Element element34 = element30.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element35 = element30.empty();
        org.jsoup.parser.Tag tag36 = element30.tag();
        boolean boolean37 = tag36.canContainBlock();
        java.lang.String str38 = tag36.getName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document8.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document8.prependText(" hi!hi!");
        org.jsoup.nodes.Element element18 = document8.addClass("<hi!> <#root> </#root><#root> <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> hi! </body> </html> </#root> </#root> </hi!> hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element14 = element11.attr("body", "");
        java.lang.String str15 = element14.tagName();
        java.lang.String str16 = element14.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements19 = element13.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element21 = element13.addClass("<html>\n<head>\n</head>\n<body>\n <hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n   #root#document \n </hi>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        boolean boolean11 = tag10.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.addClass("body");
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str8 = document2.nodeName();
        boolean boolean9 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        org.jsoup.select.Elements elements20 = element19.children();
        org.jsoup.nodes.Element element22 = element19.toggleClass("\n<<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        org.jsoup.nodes.Element element13 = element4.removeClass("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        java.lang.String str3 = document2.className();
        org.jsoup.nodes.Element element5 = document2.val("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        org.jsoup.nodes.Element element25 = element21.appendText("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.parser.Tag tag26 = element21.tag();
        org.jsoup.parser.Tag tag27 = tag26.getImplicitParent();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        document31.setBaseUri("hi!");
        org.jsoup.nodes.Element element35 = document31.empty();
        org.jsoup.nodes.Element element37 = document31.appendText("hi!");
        org.jsoup.select.Elements elements39 = document31.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element41 = document31.appendText("#document");
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element45 = element41.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Attributes attributes46 = element41.attributes();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag27, "<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>", attributes46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag27, "");
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        org.jsoup.nodes.Element element17 = element15.text("hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = element15.appendText("hi!");
        org.jsoup.nodes.Element element23 = element21.text("");
        java.lang.String str25 = element23.attr("#document");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element4.classNames(strSet26);
        org.jsoup.nodes.Element element30 = element4.attr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        boolean boolean36 = element27.hasClass("#document hi!");
        org.jsoup.select.Elements elements37 = element27.children();
        java.lang.String str38 = element27.text();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        java.util.Set<java.lang.String> strSet17 = document16.classNames();
        org.jsoup.nodes.Element element18 = element9.classNames(strSet17);
        org.jsoup.nodes.Element element19 = element9.empty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        java.lang.String str4 = tag1.getName();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        boolean boolean10 = element9.isBlock();
        boolean boolean11 = element9.hasText();
        org.jsoup.parser.Tag tag12 = element9.tag();
        org.jsoup.parser.Tag tag13 = tag12.getImplicitParent();
        boolean boolean14 = tag1.canContain(tag12);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag1, "\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
        org.jsoup.nodes.Element element18 = element16.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        java.lang.String str58 = element29.text();
        boolean boolean60 = element29.hasClass("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        java.lang.String str61 = element29.nodeName();
        org.jsoup.nodes.Element element63 = element29.prependElement("<body>\n</body>");
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi! hi!" + "'", str58, "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#document" + "'", str61, "#document");
        org.junit.Assert.assertNotNull(element63);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.parser.Tag tag11 = tag10.getImplicitParent();
        java.lang.String str12 = tag10.toString();
        java.lang.String str13 = tag10.toString();
        boolean boolean14 = tag10.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        org.jsoup.nodes.Element element10 = document2.getElementById("hi!hi!");
        java.lang.String str11 = document2.tagName();
        document2.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.select.Elements elements15 = document2.getElementsByAttribute("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element18 = document2.attr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", " <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element14.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.String str21 = element14.attr("");
        org.jsoup.nodes.Element element24 = element14.attr("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>", "hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("");
        org.jsoup.nodes.Element element6 = document2.text("");
        org.jsoup.nodes.Element element8 = element6.val("");
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "hi! <html> <head> </head> <body> hi! </body> </html>");
        java.lang.String str12 = element6.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element6.select("<#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        org.jsoup.nodes.Element element23 = element16.prependText("hi!");
        org.jsoup.nodes.Element element25 = element23.val("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element27 = element23.appendElement("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements28 = element23.parents();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        org.jsoup.nodes.Element element20 = element16.text("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        java.lang.String str7 = document2.data();
        org.jsoup.nodes.Element element9 = document2.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<head>\n</head>\n<body>\n hi!\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
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
        boolean boolean20 = document2.hasAttr("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element22 = document2.prependText("");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "");
        org.jsoup.nodes.Element element4 = document2.appendText("<html> \n <head> \n </head> \n <body>\n   hi!  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        java.lang.String str9 = element8.val();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element8.attr("\n<hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\nhi!#document&lt;#root #root=&quot;#document&quot;&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!  hi! \n </body>\n</html>\n</hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>", "<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        boolean boolean8 = element7.isBlock();
        org.jsoup.nodes.Element element10 = element7.wrap("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element10.setBaseUri("html");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element10.childNodes();
        org.jsoup.nodes.Element element15 = element10.addClass("<hi!>\n<#root>\n</#root>\n</hi!>");
        java.lang.String str17 = element10.attr("#document");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = element24.append("");
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element29 = element26.append("");
        org.jsoup.nodes.Element element31 = element29.wrap("hi!#document");
        java.lang.String str32 = element29.toString();
        java.lang.String str33 = element29.className();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element38 = document36.text("hi!");
        org.jsoup.nodes.Element element40 = element38.text("hi!");
        org.jsoup.select.Elements elements42 = element38.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element44 = element38.appendText("hi!");
        org.jsoup.nodes.Element element47 = element38.attr("#root", "#document");
        org.jsoup.nodes.Element element49 = element38.appendElement("#root");
        org.jsoup.select.Elements elements50 = element38.children();
        java.lang.String str51 = element38.toString();
        org.jsoup.nodes.Element element52 = element29.prependChild((org.jsoup.nodes.Node) element38);
        java.lang.String str53 = element29.html();
        boolean boolean55 = element29.hasAttr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element56 = element10.appendChild((org.jsoup.nodes.Node) element29);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>" + "'", str51, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>" + "'", str53, "<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element16 = element11.attr("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.addClass("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        java.lang.String str19 = element18.className();
        java.lang.String str20 = element18.baseUri();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document <hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>" + "'", str19, "#document <hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.prependText(" hi!hi!");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.prependElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document2.getElementsByAttribute(" <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.text("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean10 = element8.hasAttr("");
        java.lang.String str11 = element8.className();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        document14.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document14.prepend("#root");
        java.lang.String str20 = document14.tagName();
        document14.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document14.childNodes();
        org.jsoup.select.Elements elements25 = document14.getElementsByIndexEquals(0);
        java.lang.String str26 = document14.html();
        org.jsoup.nodes.Element element28 = document14.appendElement("#document hi!");
        org.jsoup.nodes.Element element29 = element8.appendChild((org.jsoup.nodes.Node) document14);
        document14.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str26, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        java.lang.String str34 = element33.tagName();
        org.jsoup.select.Elements elements37 = element33.getElementsByAttributeValue("body", "#document <hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n <hi>\n   &lt;#root&gt; \n </hi>\n</body>\n</html>", " body");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        org.jsoup.parser.Tag tag18 = element13.tag();
        org.jsoup.parser.Tag tag19 = tag18.getImplicitParent();
        java.lang.String str20 = tag19.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "body" + "'", str20, "body");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        org.jsoup.nodes.Element element21 = element17.prependElement("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>");
        org.jsoup.nodes.Element element23 = element17.appendText("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int24 = element23.elementSiblingIndex();
        org.jsoup.select.Elements elements26 = element23.getElementsByTag("#document");
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document ");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Element element18 = element12.prependElement("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValue("<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Node node22 = element18.previousSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document2.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.select.Elements elements17 = document2.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements20 = document2.getElementsByAttributeValue("<#root>\n</#root>", "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element22 = document2.wrap("#document ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element22.val("<html>\n<head>\n</head>\n<body>\n &lt;#document \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  &gt;  \n   <head> \n   </head> \n   <body>\n     hi!  &gt; \n    <html> \n     <head> \n     </head> \n     <body>\n       hi!#document  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;/#root&gt;\n     </body>\n    </html>\n   </body>\n  </body>\n </html>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.text("#root");
        org.jsoup.nodes.Element element8 = document2.empty();
        element8.setBaseUri("body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element8.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
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
        org.jsoup.select.Elements elements22 = document2.getElementsByIndexLessThan(0);
        boolean boolean24 = document2.hasAttr(" <html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        org.jsoup.nodes.Element element11 = document2.prepend("hi!");
        org.jsoup.select.Elements elements12 = document2.getAllElements();
        org.jsoup.nodes.Element element14 = document2.html(" <hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        java.lang.String str15 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        java.lang.String str22 = document2.absUrl("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean23 = document2.isBlock();
        org.jsoup.nodes.Element element25 = document2.text("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element29 = document23.appendText("hi!");
        org.jsoup.nodes.Attributes attributes30 = document23.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag18, "hi!", attributes30);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = document35.childNodes();
        document35.setBaseUri("hi!");
        org.jsoup.nodes.Element element39 = document35.empty();
        org.jsoup.nodes.Element element41 = document35.appendText("hi!");
        org.jsoup.nodes.Attributes attributes42 = document35.attributes();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag18, "#document", attributes42);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag1, "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", attributes42);
        org.jsoup.nodes.Element element46 = element44.prependElement(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str47 = element46.data();
        org.jsoup.nodes.Node node49 = element46.removeAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("hi!");
        org.jsoup.nodes.Element element19 = element11.getElementById("#root");
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element24 = element20.removeClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.nodes.Element element26 = element20.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements27 = element26.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements9 = element8.parents();
        org.jsoup.parser.Tag tag10 = element8.tag();
        boolean boolean11 = tag10.isEmpty();
        boolean boolean12 = tag10.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element20 = element7.prependElement("#root");
        org.jsoup.select.Elements elements21 = element20.children();
        org.jsoup.nodes.Element element23 = element20.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element20.appendText("hi! <html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element26 = element20.parent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        boolean boolean10 = tag3.isEmpty();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        boolean boolean16 = element15.isBlock();
        boolean boolean17 = element15.hasText();
        org.jsoup.parser.Tag tag18 = element15.tag();
        boolean boolean19 = tag3.canContain(tag18);
        java.lang.String str20 = tag18.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.select.Elements elements6 = document2.getElementsByClass(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element15.appendElement("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexEquals((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements14 = document5.siblingElements();
        org.jsoup.nodes.Element element16 = document5.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = document5.getElementsByAttributeValueContaining(" hi!hi!", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element21 = document5.text(" hi!hi!");
        org.jsoup.nodes.Element element23 = element21.appendElement("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n<&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!>\n</&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>");
        java.lang.String str24 = element23.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        java.lang.String str12 = element11.val();
        org.jsoup.nodes.Element element14 = element11.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        org.jsoup.nodes.Element element16 = element14.append("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str17 = element14.text();
        org.jsoup.select.Elements elements18 = element14.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html> <head> </head> <body> hi! </body> </html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt; hi!" + "'", str17, "<html> <head> </head> <body> hi! </body> </html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt; hi!");
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        boolean boolean27 = tag1.isInline();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        boolean boolean10 = document2.isBlock();
        org.jsoup.select.Elements elements12 = document2.getElementsByIndexEquals((int) (byte) 10);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        java.lang.String str10 = element9.val();
        org.jsoup.nodes.Element element12 = element9.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str13 = element9.data();
        org.jsoup.select.Elements elements14 = element9.parents();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!#document");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element5 = document2.prependElement("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str9 = element6.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element6 = document4.text("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element10 = element6.removeClass("hi!");
        org.jsoup.nodes.Element element13 = element6.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element18 = document16.text("hi!");
        org.jsoup.nodes.Element element20 = element18.text("hi!");
        org.jsoup.nodes.Element element22 = element18.getElementById("#document");
        org.jsoup.nodes.Element element24 = element18.wrap("hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.nodeName();
        org.jsoup.select.Elements elements29 = document27.getAllElements();
        java.lang.String str30 = document27.id();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        org.jsoup.nodes.Element element35 = document27.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document38.childNodes();
        document38.setBaseUri("hi!");
        org.jsoup.nodes.Element element42 = document38.empty();
        org.jsoup.nodes.Element element43 = document33.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element48 = document46.text("hi!");
        org.jsoup.nodes.Element element50 = element48.text("hi!");
        org.jsoup.select.Elements elements52 = element48.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element54 = element48.appendText("hi!");
        org.jsoup.nodes.Element element57 = element48.attr("#root", "#document");
        org.jsoup.nodes.Element element59 = element48.appendElement("#root");
        org.jsoup.nodes.Element element60 = element59.empty();
        org.jsoup.nodes.Attributes attributes61 = element60.attributes();
        org.jsoup.nodes.Element element63 = element60.appendElement("hi!");
        element43.replaceWith((org.jsoup.nodes.Node) element63);
        org.jsoup.nodes.Element element66 = element43.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.jsoup.nodes.Element element82 = document69.classNames((java.util.Set<java.lang.String>) strSet80);
        org.jsoup.nodes.Element element83 = element43.classNames((java.util.Set<java.lang.String>) strSet80);
        org.jsoup.nodes.Element element84 = element18.appendChild((org.jsoup.nodes.Node) element83);
        boolean boolean85 = element6.equals((java.lang.Object) element84);
        org.jsoup.nodes.Attributes attributes86 = element84.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element87 = new org.jsoup.nodes.Element(tag0, "<html>\n<head>\n</head>\n<body>\n &amp;lt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &amp;lt;/&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", attributes86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(attributes86);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        boolean boolean10 = tag3.canContainBlock();
        boolean boolean11 = tag3.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        org.jsoup.select.Elements elements8 = element7.getAllElements();
        org.jsoup.nodes.Element element10 = element7.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str11 = element10.html();
        org.jsoup.select.Elements elements13 = element10.select("html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>" + "'", str11, "hi!\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
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
        org.jsoup.nodes.Element element19 = element13.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element21 = element19.html("html");
        org.jsoup.select.Elements elements22 = element21.parents();
        java.lang.String str23 = element21.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "html" + "'", str23, "html");
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        java.lang.String str16 = tag1.toString();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document19.prependText("#document");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element30 = element24.getElementById("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean31 = tag1.equals((java.lang.Object) element30);
        java.lang.String str32 = tag1.getName();
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag34.isValidParent(tag36);
        boolean boolean38 = tag36.canContainBlock();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document47.childNodes();
        document47.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document47.empty();
        org.jsoup.nodes.Element element53 = document47.appendText("hi!");
        org.jsoup.nodes.Attributes attributes54 = document47.attributes();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag42, "hi!", attributes54);
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList60 = document59.childNodes();
        document59.setBaseUri("hi!");
        org.jsoup.nodes.Element element63 = document59.empty();
        org.jsoup.nodes.Element element65 = document59.appendText("hi!");
        org.jsoup.nodes.Attributes attributes66 = document59.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag42, "#document", attributes66);
        boolean boolean68 = tag42.isData();
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element73 = document71.text("hi!");
        org.jsoup.parser.Tag tag74 = document71.tag();
        boolean boolean75 = tag42.canContain(tag74);
        boolean boolean76 = tag36.canContain(tag42);
        boolean boolean77 = tag42.isBlock();
        org.jsoup.parser.Tag tag79 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag81 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str82 = tag81.toString();
        org.jsoup.parser.Tag tag83 = tag81.getImplicitParent();
        boolean boolean84 = tag79.equals((java.lang.Object) tag81);
        java.lang.String str85 = tag79.toString();
        org.jsoup.parser.Tag tag87 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag89 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean90 = tag87.isValidParent(tag89);
        boolean boolean91 = tag79.canContain(tag89);
        boolean boolean92 = tag42.canContain(tag79);
        boolean boolean93 = tag1.canContain(tag79);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element21 = element11.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        boolean boolean27 = document24.hasClass("");
        org.jsoup.nodes.Element element29 = document24.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element11.prependChild((org.jsoup.nodes.Node) element29);
        java.lang.String str31 = element11.toString();
        org.jsoup.select.Elements elements33 = element11.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element35 = element11.prependElement("hi!#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>" + "'", str31, "<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        org.jsoup.nodes.Element element24 = element23.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element24.prepend("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!");
        org.jsoup.nodes.Node node7 = document2.removeAttr("\n<html <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>=\"#document\" class=\"\">\n<head>\n</head>\n<body>\n hi!\n</body>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element7 = document2.attr("hi! <html> <head> </head> <body> hi! </body> </html>", "\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = document2.prependElement("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n<hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>");
        org.jsoup.nodes.Element element11 = document2.prepend("<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document9.prepend("#root");
        java.lang.String str15 = document9.tagName();
        boolean boolean16 = document9.isBlock();
        org.jsoup.select.Elements elements18 = document9.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        boolean boolean19 = document2.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document2.prependElement(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str25 = document24.nodeName();
        org.jsoup.nodes.Element element27 = document24.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element27.childNodes();
        java.lang.String str29 = element27.nodeName();
        org.jsoup.nodes.Element element30 = document2.appendChild((org.jsoup.nodes.Node) element27);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        java.lang.String str21 = element16.absUrl("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element16.text("");
        org.jsoup.nodes.Element element24 = element23.previousElementSibling();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttribute("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.parser.Tag tag11 = element6.tag();
        java.lang.String str12 = element6.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>\n</hi!>" + "'", str12, "<hi!>\n</hi!>");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element21 = element11.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        boolean boolean27 = document24.hasClass("");
        org.jsoup.nodes.Element element29 = document24.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element11.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements33 = element29.getElementsByAttributeValue("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>", "<head>\n</head>\n<body>\n hi!\n</body>&lt;hi! class=&quot;#document &quot; #document=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt; #root#document &lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.prependElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.html();
        org.jsoup.nodes.Element element20 = element17.appendText("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element23 = element20.attr("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("", "");
        boolean boolean28 = document26.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Element element30 = document26.prependText("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element23.prependChild((org.jsoup.nodes.Node) document26);
        java.lang.String str33 = element23.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        document29.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        document29.setBaseUri("hi!hi!");
        org.jsoup.nodes.Element element40 = document29.html("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str41 = element40.id();
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
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.util.Set<java.lang.String> strSet8 = document2.classNames();
        org.jsoup.nodes.Element element10 = document2.prependText("hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.lang.String str12 = document9.id();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        org.jsoup.nodes.Element element17 = document9.appendChild((org.jsoup.nodes.Node) document15);
        java.lang.String str19 = document9.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document9.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean22 = element4.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements25 = element4.getElementsByAttributeValueContaining("hi!", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements27 = element4.getElementsByIndexEquals(100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element14.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.select.Elements elements15 = element10.getAllElements();
        boolean boolean16 = element10.isBlock();
        org.jsoup.nodes.Element element18 = element10.prepend("\n<#root class=\"\">\n</#root>");
        java.lang.String str19 = element18.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "&lt;#root class=&quot;&quot;&gt; \n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root><<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>" + "'", str19, "&lt;#root class=&quot;&quot;&gt; \n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root><<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        org.jsoup.nodes.Element element11 = document2.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str6 = document2.attr("#document<html> <head> </head> <body> hi! </body> </html>");
        java.lang.String str7 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag1.canContainBlock();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.parser.Tag tag7 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
        org.jsoup.nodes.Element element13 = document11.empty();
        java.lang.String str14 = element13.id();
        org.jsoup.parser.Tag tag15 = element13.tag();
        org.jsoup.parser.Tag tag16 = tag15.getImplicitParent();
        java.lang.String str17 = tag15.getName();
        java.lang.String str18 = tag15.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = element26.append("");
        org.jsoup.parser.Tag tag29 = element26.tag();
        java.lang.String str30 = element26.tagName();
        boolean boolean31 = element26.hasText();
        org.jsoup.nodes.Attributes attributes32 = element26.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag15, "\n<html>\n</html>", attributes32);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag1, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes32);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.select.Elements elements26 = document18.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element28 = document18.appendText("#document");
        org.jsoup.nodes.Element element30 = element28.append("");
        java.lang.Integer int31 = element30.elementSiblingIndex();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element36 = document34.text("hi!");
        org.jsoup.nodes.Element element38 = element36.text("hi!");
        org.jsoup.select.Elements elements40 = element36.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element42 = element36.appendText("hi!");
        org.jsoup.nodes.Element element45 = element36.attr("#root", "#document");
        org.jsoup.nodes.Node node47 = element36.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements48 = element36.parents();
        org.jsoup.nodes.Element element49 = element30.appendChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element50 = element13.prependChild((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element52 = element49.html("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("hi!");
        org.jsoup.nodes.Element element19 = element11.getElementById("#root");
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element22 = element4.val("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements24 = element4.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements25 = element4.parents();
        org.jsoup.nodes.Element element27 = element4.wrap("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean7 = element5.hasAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        org.jsoup.select.Elements elements13 = element7.select("#document");
        java.lang.String str14 = element7.id();
        org.jsoup.nodes.Element element16 = element7.prependElement("hi!hi!");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str19 = tag18.toString();
        org.jsoup.parser.Tag tag20 = tag18.getImplicitParent();
        boolean boolean21 = tag20.preserveWhitespace();
        boolean boolean22 = tag20.isInline();
        java.lang.String str23 = tag20.toString();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag20, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element28 = element16.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements31 = element16.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "body" + "'", str23, "body");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element16 = element9.appendElement("html");
        org.jsoup.nodes.Node node17 = element16.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element16.select("<html>\n<head>\n</head>\n<body>\n hi!#document&lt;#root #root=&quot;#document&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  hi! \n  </body>\n </html>\n</body>\n</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? hi!#document&lt;#root #root=&quot;#document&quot;&gt; ? <html> ?  <head> ?  </head> ?  <body>?    hi!  hi! ?  </body>? </html>?</body>?</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        java.lang.Integer int13 = document2.elementSiblingIndex();
        boolean boolean15 = document2.hasClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.nodes.Element element17 = document2.removeClass("\n<body>\nhi!\n</body>");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str21 = document20.nodeName();
        org.jsoup.select.Elements elements22 = document20.getAllElements();
        java.lang.String str23 = document20.id();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        org.jsoup.nodes.Element element28 = document20.appendChild((org.jsoup.nodes.Node) document26);
        java.lang.String str30 = document20.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element32 = document20.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements34 = element32.getElementsByIndexEquals((int) (byte) 1);
        java.util.Set<java.lang.String> strSet35 = element32.classNames();
        org.jsoup.nodes.Element element36 = document2.classNames(strSet35);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document22.prependText("#document");
        org.jsoup.select.Elements elements29 = document22.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Node node31 = document22.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element34 = document22.attr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        org.jsoup.nodes.Element element35 = element19.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element37 = element35.val("#document hi!\n<html>\n<head>\n</head>\n<body>\n hi! \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        java.lang.String str8 = tag7.toString();
        boolean boolean9 = tag7.canContainBlock();
        boolean boolean10 = tag7.canContainBlock();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("#root");
        java.lang.String str17 = element14.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.prependElement("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.nodeName();
        org.jsoup.select.Elements elements10 = document8.getAllElements();
        java.lang.String str11 = document8.id();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Element element16 = document8.appendChild((org.jsoup.nodes.Node) document14);
        java.lang.String str18 = document8.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document8.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element25 = document23.text("hi!");
        boolean boolean26 = element25.isBlock();
        org.jsoup.nodes.Element element27 = document8.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = element27.text("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements37 = element34.parents();
        org.jsoup.nodes.Element element39 = element34.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str40 = element34.outerHtml();
        java.lang.String str41 = element34.className();
        org.jsoup.nodes.Element element42 = element27.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element43 = element5.appendChild((org.jsoup.nodes.Node) element42);
        java.lang.String str44 = element42.val();
        org.jsoup.select.Elements elements46 = element42.getElementsByAttribute("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str40, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str44, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element15 = element12.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str16 = element12.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>hi!" + "'", str16, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>hi!");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Node node4 = document2.removeAttr("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element6 = document2.appendText("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element6.append("body");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueStarting("<#root>\n</#root>", "&lt;#root class=&quot;&quot;&gt; \n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root><<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = document2.tagName();
        org.jsoup.nodes.Element element12 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!#document&lt;#root #root=&quot;#document&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  hi! \n  </body>\n </html>\n</body>\n</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
        org.jsoup.parser.Tag tag13 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element13 = element10.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element15 = element13.appendText("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements16 = element13.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        boolean boolean12 = element10.hasAttr("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.nodes.Element element14 = element10.append(" body");
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        org.jsoup.nodes.Element element5 = document2.attr("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>", " hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element14 = document9.wrap("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.addClass("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element21 = document19.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        document28.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = document28.empty();
        org.jsoup.nodes.Element element34 = document28.appendText("hi!");
        org.jsoup.nodes.Attributes attributes35 = document28.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag23, "hi!", attributes35);
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element46 = document40.appendText("hi!");
        org.jsoup.nodes.Attributes attributes47 = document40.attributes();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag23, "#document", attributes47);
        boolean boolean49 = tag23.preserveWhitespace();
        boolean boolean50 = element21.equals((java.lang.Object) boolean49);
        org.jsoup.nodes.Element element51 = element14.appendChild((org.jsoup.nodes.Node) element21);
        java.lang.String str52 = element51.className();
        org.jsoup.select.Elements elements54 = element51.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " <hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>" + "'", str52, " <hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        java.lang.String str9 = document2.tagName();
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!#document", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root><hi!>\n<<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>>\n</<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("hi!hi!");
        org.jsoup.select.Elements elements16 = element4.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str11 = tag10.toString();
        org.jsoup.parser.Tag tag12 = tag10.getImplicitParent();
        boolean boolean13 = tag8.equals((java.lang.Object) tag10);
        boolean boolean14 = tag8.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag8, "#root");
        java.lang.String str17 = tag8.toString();
        boolean boolean18 = tag1.isValidParent(tag8);
        boolean boolean19 = tag1.isEmpty();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag1, "body");
        org.jsoup.parser.Tag tag22 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = document29.appendText("hi!");
        org.jsoup.nodes.Attributes attributes36 = document29.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag24, "hi!", attributes36);
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        document41.setBaseUri("hi!");
        org.jsoup.nodes.Element element45 = document41.empty();
        org.jsoup.nodes.Element element47 = document41.appendText("hi!");
        org.jsoup.nodes.Attributes attributes48 = document41.attributes();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag24, "#document", attributes48);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = document52.childNodes();
        document52.setBaseUri("hi!");
        org.jsoup.nodes.Element element56 = document52.empty();
        org.jsoup.nodes.Element element58 = element56.append("");
        org.jsoup.parser.Tag tag59 = element56.tag();
        boolean boolean60 = tag24.canContain(tag59);
        boolean boolean61 = tag24.isInline();
        org.jsoup.parser.Tag tag62 = tag24.getImplicitParent();
        org.jsoup.nodes.Document document65 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList66 = document65.childNodes();
        org.jsoup.nodes.Element element67 = document65.empty();
        org.jsoup.select.Elements elements69 = document65.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements71 = document65.getElementsByIndexEquals((int) 'a');
        boolean boolean72 = tag62.equals((java.lang.Object) 'a');
        org.jsoup.parser.Tag tag73 = tag62.getImplicitParent();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag73, "");
        boolean boolean76 = tag73.canContainBlock();
        org.jsoup.nodes.Document document79 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList80 = document79.childNodes();
        org.jsoup.nodes.Element element81 = document79.empty();
        java.lang.String str82 = element81.id();
        org.jsoup.parser.Tag tag83 = element81.tag();
        org.jsoup.parser.Tag tag84 = tag83.getImplicitParent();
        boolean boolean85 = tag84.isBlock();
        boolean boolean86 = tag73.isValidParent(tag84);
        org.jsoup.nodes.Element element88 = new org.jsoup.nodes.Element(tag73, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        boolean boolean89 = tag1.isValidParent(tag73);
        org.jsoup.parser.Tag tag90 = tag1.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(tag90);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getAllElements();
        org.jsoup.parser.Tag tag6 = document2.tag();
        boolean boolean7 = tag6.isEmpty();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element13 = document11.text("hi!");
        org.jsoup.select.Elements elements16 = document11.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element18 = document11.appendText("hi!");
        org.jsoup.select.Elements elements19 = element18.getAllElements();
        org.jsoup.nodes.Attributes attributes20 = element18.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<hi! class=\"\">\nhi!\n</hi!>", attributes20);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        java.lang.String str19 = document8.className();
        org.jsoup.nodes.Element element21 = document8.addClass("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        boolean boolean23 = element21.hasAttr("<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValue("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = element21.prependElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.nodes.Node node29 = element21.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element15.hasText();
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValue("#document hi!", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element15.prepend("<#root>");
        java.lang.String str22 = element15.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = document2.addClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        boolean boolean8 = element6.hasClass("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        org.jsoup.nodes.Element element22 = element21.firstElementSibling();
        org.jsoup.select.Elements elements24 = element22.getElementsByAttribute("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
        org.jsoup.nodes.Element element17 = element15.nextElementSibling();
        org.jsoup.nodes.Element element18 = element17.lastElementSibling();
        org.jsoup.nodes.Element element20 = element18.appendText("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.lang.String str21 = element20.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "html" + "'", str21, "html");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        boolean boolean42 = tag39.isEmpty();
        boolean boolean43 = tag39.isEmpty();
        boolean boolean44 = tag39.isData();
        boolean boolean45 = tag39.preserveWhitespace();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag20, "hi!", attributes32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.nodes.Attributes attributes44 = document37.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, "#document", attributes44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = element52.append("");
        org.jsoup.parser.Tag tag55 = element52.tag();
        boolean boolean56 = tag20.canContain(tag55);
        boolean boolean57 = tag20.preserveWhitespace();
        org.jsoup.parser.Tag tag58 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements61 = element60.getAllElements();
        org.jsoup.nodes.Element element63 = element60.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements65 = element60.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element66 = element13.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Element element68 = element13.addClass("#root");
        boolean boolean70 = element68.hasAttr("\n<body>\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.select.Elements elements12 = document10.getAllElements();
        java.lang.String str13 = document10.id();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        org.jsoup.nodes.Element element18 = document10.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element23 = document16.addClass("hi!hi!");
        boolean boolean24 = tag3.equals((java.lang.Object) document16);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element29 = document27.text("hi!");
        org.jsoup.nodes.Element element31 = element29.text("hi!");
        org.jsoup.select.Elements elements33 = element29.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element35 = element29.appendText("hi!");
        org.jsoup.nodes.Element element38 = element29.attr("#root", "#document");
        org.jsoup.select.Elements elements40 = element38.getElementsByIndexEquals((-1));
        boolean boolean41 = element38.hasText();
        org.jsoup.nodes.Node node43 = element38.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList51 = document50.childNodes();
        document50.setBaseUri("hi!");
        org.jsoup.nodes.Element element54 = document50.empty();
        org.jsoup.nodes.Element element56 = document50.appendText("hi!");
        org.jsoup.nodes.Attributes attributes57 = document50.attributes();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag45, "hi!", attributes57);
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList63 = document62.childNodes();
        document62.setBaseUri("hi!");
        org.jsoup.nodes.Element element66 = document62.empty();
        org.jsoup.nodes.Element element68 = document62.appendText("hi!");
        org.jsoup.nodes.Attributes attributes69 = document62.attributes();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag45, "#document", attributes69);
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList74 = document73.childNodes();
        document73.setBaseUri("hi!");
        org.jsoup.nodes.Element element77 = document73.empty();
        org.jsoup.nodes.Element element79 = element77.append("");
        org.jsoup.parser.Tag tag80 = element77.tag();
        boolean boolean81 = tag45.canContain(tag80);
        boolean boolean82 = tag45.preserveWhitespace();
        org.jsoup.parser.Tag tag83 = tag45.getImplicitParent();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag83, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements86 = element85.getAllElements();
        org.jsoup.nodes.Element element88 = element85.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements90 = element85.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element91 = element38.prependChild((org.jsoup.nodes.Node) element85);
        org.jsoup.nodes.Element element93 = element38.addClass("#root");
        boolean boolean94 = tag3.equals((java.lang.Object) element93);
        org.jsoup.nodes.Element element96 = element93.appendText("#document");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertNotNull(elements90);
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(element96);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.appendElement("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element12.previousElementSibling();
        org.jsoup.select.Elements elements14 = element12.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
        org.jsoup.nodes.Element element23 = element16.prependText("hi!");
        org.jsoup.nodes.Element element25 = element23.toggleClass("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element23.val("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element29.parent();
        boolean boolean31 = element29.isBlock();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        boolean boolean62 = tag11.canContainBlock();
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element14 = document8.firstElementSibling();
        org.jsoup.nodes.Element element16 = document8.appendElement("<hi!>\n</hi!>#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        java.lang.String str46 = element41.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str47 = element41.outerHtml();
        org.jsoup.select.Elements elements49 = element41.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element51 = element41.prependElement("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n<&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!>\n</&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>");
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;", "<hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>" + "'", str47, "\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element13.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.select.Elements elements4 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.prependElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.html();
        org.jsoup.nodes.Element element20 = element17.appendText("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element23 = element20.attr("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Element element25 = element23.getElementById(" <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        java.lang.String str5 = document2.val();
        org.jsoup.select.Elements elements7 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>\n<body>\n</body>");
        org.jsoup.nodes.Element element9 = document2.child(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        document9.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element15 = element13.append("");
        org.jsoup.parser.Tag tag16 = element13.tag();
        java.lang.String str17 = element13.tagName();
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "");
        java.lang.String[] strArray24 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = element21.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element21.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element21.childNodes();
        java.util.Set<java.lang.String> strSet31 = element21.classNames();
        org.jsoup.nodes.Element element32 = element13.classNames(strSet31);
        org.jsoup.nodes.Element element33 = element4.classNames(strSet31);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("");
        org.jsoup.nodes.Element element6 = document2.text("");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element9 = element6.addClass("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        document12.setBaseUri("hi!");
        org.jsoup.nodes.Element element16 = document12.empty();
        org.jsoup.nodes.Element element18 = document12.appendText("hi!");
        org.jsoup.select.Elements elements19 = document12.parents();
        org.jsoup.parser.Tag tag20 = document12.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str28 = tag27.toString();
        org.jsoup.parser.Tag tag29 = tag27.getImplicitParent();
        boolean boolean30 = tag25.equals((java.lang.Object) tag27);
        boolean boolean31 = tag25.isBlock();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag25, "#root");
        boolean boolean34 = tag25.preserveWhitespace();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document38.childNodes();
        org.jsoup.nodes.Attributes attributes40 = document38.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag25, "#root", attributes40);
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag20, "#document", attributes40);
        org.jsoup.nodes.Element element44 = element42.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element46 = element42.text("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element48 = element42.toggleClass("hi!hi!");
        java.lang.String str49 = element42.val();
        java.lang.String str50 = element42.nodeName();
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str55 = tag54.toString();
        org.jsoup.parser.Tag tag56 = tag54.getImplicitParent();
        boolean boolean57 = tag52.equals((java.lang.Object) tag54);
        boolean boolean58 = tag52.isBlock();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag52, "#root");
        boolean boolean61 = tag52.preserveWhitespace();
        org.jsoup.nodes.Document document65 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList66 = document65.childNodes();
        org.jsoup.nodes.Attributes attributes67 = document65.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag52, "#root", attributes67);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element73 = document71.text("hi!");
        org.jsoup.nodes.Element element75 = element73.text("hi!");
        org.jsoup.select.Elements elements77 = element73.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet78 = element73.classNames();
        org.jsoup.nodes.Element element79 = element68.prependChild((org.jsoup.nodes.Node) element73);
        boolean boolean80 = element79.hasText();
        org.jsoup.nodes.Element element82 = element79.prepend("#root");
        org.jsoup.nodes.Element element84 = element82.toggleClass("hi!");
        org.jsoup.nodes.Element element85 = element42.prependChild((org.jsoup.nodes.Node) element84);
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith((org.jsoup.nodes.Node) element85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#root" + "'", str50, "#root");
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(elements77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element85);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        org.jsoup.select.Elements elements19 = element14.getElementsByClass("#root");
        org.jsoup.nodes.Element element20 = element14.nextElementSibling();
        org.jsoup.nodes.Element element22 = element14.prepend("<hi> &lt;#root&gt;  \n</hi>");
        org.jsoup.nodes.Element element23 = element14.firstElementSibling();
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        org.jsoup.nodes.Element element9 = element4.prepend("<#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean2 = tag1.isInline();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        document5.setBaseUri("#document");
        boolean boolean15 = tag1.equals((java.lang.Object) "#document");
        org.jsoup.parser.Tag tag16 = tag1.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        boolean boolean4 = document2.hasClass("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
        org.jsoup.nodes.Element element6 = document2.html("hi! hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        org.jsoup.select.Elements elements23 = element8.getElementsByIndexEquals((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element7 = document5.text("hi!");
        org.jsoup.nodes.Element element9 = element7.text("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element13 = element7.appendText("hi!");
        org.jsoup.nodes.Element element15 = element13.text("");
        boolean boolean16 = element15.hasText();
        org.jsoup.nodes.Element element17 = element15.empty();
        boolean boolean18 = element17.isBlock();
        java.lang.String str19 = element17.data();
        org.jsoup.nodes.Element element20 = document2.appendChild((org.jsoup.nodes.Node) element17);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<hi! class=\"\">\nhi!\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        org.jsoup.nodes.Element element25 = document2.val("html");
        java.lang.String str26 = element25.text();
        java.lang.String str27 = element25.data();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        java.lang.String str20 = document8.tagName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element16 = element9.appendElement("html");
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element17 = element15.text("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        element15.remove();
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueEnding("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<head>\n</head>\n<body>\n hi!\n</body>");
        java.lang.Integer int22 = element15.elementSiblingIndex();
        java.lang.String str23 = element15.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str23, "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("\n<hi!>\n</hi!>");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "");
        java.lang.String str6 = tag3.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag3, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag9 = tag3.getImplicitParent();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        org.jsoup.select.Elements elements18 = document13.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element20 = document13.appendText("hi!");
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        org.jsoup.nodes.Attributes attributes22 = element20.attributes();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag9, "#document", attributes22);
        boolean boolean24 = tag1.isValidParent(tag9);
        boolean boolean25 = tag9.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element17 = element16.parent();
        element17.setBaseUri("body");
        org.jsoup.nodes.Element element21 = element17.prepend("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        org.jsoup.select.Elements elements23 = element17.getElementsByIndexLessThan(10);
        org.jsoup.select.Elements elements26 = element17.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!#document", "<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements18 = element15.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element20 = element15.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        java.lang.String str21 = element20.id();
        org.jsoup.nodes.Element element23 = element20.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        java.lang.Integer int24 = element20.elementSiblingIndex();
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
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = document10.appendText("hi!");
        org.jsoup.nodes.Attributes attributes17 = document10.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag5, "hi!", attributes17);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = document22.appendText("hi!");
        org.jsoup.nodes.Attributes attributes29 = document22.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag5, "#document", attributes29);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = document33.empty();
        org.jsoup.nodes.Element element39 = element37.append("");
        org.jsoup.parser.Tag tag40 = element37.tag();
        boolean boolean41 = tag5.canContain(tag40);
        boolean boolean42 = tag5.preserveWhitespace();
        org.jsoup.parser.Tag tag43 = tag5.getImplicitParent();
        boolean boolean44 = tag1.isValidParent(tag5);
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str49 = tag48.toString();
        org.jsoup.parser.Tag tag50 = tag48.getImplicitParent();
        boolean boolean51 = tag46.equals((java.lang.Object) tag48);
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str56 = tag55.toString();
        org.jsoup.parser.Tag tag57 = tag55.getImplicitParent();
        boolean boolean58 = tag53.equals((java.lang.Object) tag55);
        boolean boolean59 = tag53.isBlock();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag53, "#root");
        java.lang.String str62 = tag53.toString();
        boolean boolean63 = tag46.isValidParent(tag53);
        boolean boolean64 = tag1.isValidParent(tag46);
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str67 = tag66.toString();
        boolean boolean68 = tag66.isBlock();
        boolean boolean69 = tag46.canContain(tag66);
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag46, "<hi!> <#root> </#root> </hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        org.jsoup.nodes.Element element31 = element28.prepend("#root");
        org.jsoup.nodes.Element element33 = element31.toggleClass("hi!");
        java.lang.String str34 = element33.text();
        boolean boolean36 = element33.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>body");
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
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root hi!" + "'", str34, "#root hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        java.lang.String str10 = tag3.getName();
        java.lang.String str11 = tag3.toString();
        boolean boolean12 = tag3.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str7 = tag6.toString();
        java.lang.String str8 = tag6.toString();
        boolean boolean9 = tag6.preserveWhitespace();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        java.lang.String str20 = element19.outerHtml();
        org.jsoup.nodes.Node node22 = element19.removeAttr("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str25 = tag24.toString();
        org.jsoup.parser.Tag tag26 = tag24.getImplicitParent();
        boolean boolean27 = tag26.preserveWhitespace();
        boolean boolean28 = tag26.isInline();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        document31.setBaseUri("hi!");
        org.jsoup.nodes.Element element36 = document31.prependText("#document");
        boolean boolean37 = tag26.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element45 = document40.prependText("#document");
        java.lang.String str47 = document40.attr("#document");
        org.jsoup.nodes.Element element49 = document40.prependText("");
        boolean boolean50 = tag26.equals((java.lang.Object) element49);
        boolean boolean51 = element19.equals((java.lang.Object) boolean50);
        org.jsoup.select.Elements elements53 = element19.getElementsByIndexGreaterThan((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<hi!>\n</hi!>" + "'", str20, "\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(elements53);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isData();
        boolean boolean4 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        org.jsoup.nodes.Element element30 = element29.lastElementSibling();
        org.jsoup.nodes.Node node32 = element29.childNode((int) (short) 1);
        org.jsoup.nodes.Element element34 = element29.toggleClass("#document");
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
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        boolean boolean9 = document2.isBlock();
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        java.lang.String str12 = document2.val();
        boolean boolean14 = document2.hasClass("<hi!> <#root> </#root><#root> <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> hi! </body> </html> </#root> </#root> </hi!> hi!hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = document17.empty();
        org.jsoup.nodes.Element element23 = element21.append("");
        org.jsoup.parser.Tag tag24 = element21.tag();
        org.jsoup.nodes.Element element26 = element21.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = element26.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element26.appendElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.nodes.Element element32 = element26.toggleClass(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element33 = document2.appendChild((org.jsoup.nodes.Node) element26);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("");
        org.jsoup.nodes.Node node11 = document2.removeAttr("body");
        org.jsoup.nodes.Element element13 = document2.getElementById("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element13.setBaseUri("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        boolean boolean21 = element17.hasClass("#document hi!");
        org.jsoup.nodes.Element element23 = element17.appendElement("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str5 = tag4.toString();
        org.jsoup.parser.Tag tag6 = tag4.getImplicitParent();
        boolean boolean7 = tag6.preserveWhitespace();
        boolean boolean8 = tag6.isInline();
        java.lang.String str9 = tag6.toString();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean12 = tag1.isValidParent(tag6);
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str16 = document15.nodeName();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        java.lang.String str18 = document15.id();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document21.childNodes();
        org.jsoup.nodes.Element element23 = document15.appendChild((org.jsoup.nodes.Node) document21);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document15.childNodes();
        org.jsoup.nodes.Element element26 = document15.toggleClass("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean27 = tag6.equals((java.lang.Object) "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean28 = tag6.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "body" + "'", str9, "body");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str5 = tag4.toString();
        org.jsoup.parser.Tag tag6 = tag4.getImplicitParent();
        java.lang.String str7 = tag4.getName();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element13 = document11.text("hi!");
        org.jsoup.nodes.Element element15 = element13.text("hi!");
        org.jsoup.nodes.Element element17 = element13.html("#root");
        org.jsoup.select.Elements elements19 = element13.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes20 = element13.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag4, "hi!#document", attributes20);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag4, "#root");
        org.jsoup.parser.Tag tag24 = tag4.getImplicitParent();
        boolean boolean25 = tag1.isValidParent(tag4);
        boolean boolean26 = tag1.isBlock();
        boolean boolean27 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        org.jsoup.nodes.Element element17 = element14.prepend("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.tagName();
        java.lang.String str19 = element17.baseUri();
        java.lang.String str20 = element17.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>" + "'", str20, "#document \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        java.lang.String str8 = element4.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str8, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        boolean boolean39 = tag1.isBlock();
        boolean boolean40 = tag1.isInline();
        boolean boolean41 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str44 = tag43.toString();
        boolean boolean45 = tag1.equals((java.lang.Object) tag43);
        boolean boolean46 = tag43.isData();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = document49.childNodes();
        document49.setBaseUri("hi!");
        org.jsoup.nodes.Element element53 = document49.empty();
        org.jsoup.nodes.Element element55 = element53.append("");
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str60 = tag59.toString();
        org.jsoup.parser.Tag tag61 = tag59.getImplicitParent();
        boolean boolean62 = tag57.equals((java.lang.Object) tag59);
        boolean boolean63 = tag57.isBlock();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag57, "#root");
        boolean boolean66 = tag57.preserveWhitespace();
        boolean boolean67 = element55.equals((java.lang.Object) tag57);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag57, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList73 = document72.childNodes();
        document72.setBaseUri("hi!");
        org.jsoup.nodes.Element element76 = document72.empty();
        org.jsoup.nodes.Element element78 = document72.appendText("hi!");
        org.jsoup.select.Elements elements79 = document72.parents();
        org.jsoup.parser.Tag tag80 = document72.tag();
        org.jsoup.parser.Tag tag81 = tag80.getImplicitParent();
        boolean boolean82 = tag57.isValidParent(tag81);
        java.lang.String str83 = tag81.getName();
        boolean boolean84 = tag43.equals((java.lang.Object) tag81);
        org.jsoup.nodes.Element element86 = new org.jsoup.nodes.Element(tag43, "<hi> &lt;#root&gt;  \n</hi>");
        boolean boolean87 = element86.isBlock();
        org.jsoup.select.Elements elements89 = element86.getElementsByIndexEquals((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "body" + "'", str83, "body");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(elements89);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        boolean boolean9 = element4.hasClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>\n<body>\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element15 = document8.appendText("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document8.wrap("#document<html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element15 = document8.addClass("hi!hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        org.jsoup.nodes.Element element20 = document18.empty();
        java.lang.String str21 = element20.text();
        org.jsoup.select.Elements elements23 = element20.getElementsByTag("hi!");
        document8.replaceWith((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element25 = element20.parent();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str29 = document28.nodeName();
        org.jsoup.select.Elements elements30 = document28.getAllElements();
        java.lang.String str31 = document28.id();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document34.childNodes();
        org.jsoup.nodes.Element element36 = document28.appendChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = document39.childNodes();
        document39.setBaseUri("hi!");
        org.jsoup.nodes.Element element43 = document39.empty();
        org.jsoup.nodes.Element element44 = document34.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element49 = document47.text("hi!");
        boolean boolean50 = element49.isBlock();
        boolean boolean51 = element49.hasText();
        org.jsoup.parser.Tag tag52 = element49.tag();
        org.jsoup.nodes.Element element54 = element49.addClass("");
        org.jsoup.nodes.Element element55 = document34.appendChild((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element56 = element55.lastElementSibling();
        java.util.Set<java.lang.String> strSet57 = element55.classNames();
        org.jsoup.nodes.Element element58 = element25.classNames(strSet57);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendElement("body");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Element element8 = element4.text("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str9 = element8.text();
        org.jsoup.nodes.Element element11 = element8.addClass("hi! hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>" + "'", str9, "<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element14 = document5.firstElementSibling();
        org.jsoup.nodes.Node node16 = element14.removeAttr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        java.lang.String str17 = node16.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag1.canContainBlock();
        boolean boolean6 = tag1.isEmpty();
        boolean boolean7 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.isData();
        boolean boolean5 = tag1.isEmpty();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag8 = tag7.getImplicitParent();
        boolean boolean9 = tag1.canContain(tag8);
        boolean boolean10 = tag8.isBlock();
        boolean boolean11 = tag8.isInline();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str16 = tag15.toString();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        boolean boolean18 = tag13.equals((java.lang.Object) tag15);
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str23 = tag22.toString();
        org.jsoup.parser.Tag tag24 = tag22.getImplicitParent();
        boolean boolean25 = tag20.equals((java.lang.Object) tag22);
        boolean boolean26 = tag20.isBlock();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag20, "#root");
        java.lang.String str29 = tag20.toString();
        boolean boolean30 = tag13.isValidParent(tag20);
        boolean boolean31 = tag13.isEmpty();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag13, "body");
        boolean boolean34 = tag13.isBlock();
        boolean boolean35 = tag8.canContain(tag13);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
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
        org.jsoup.nodes.Element element41 = element18.prependText("<hi> &lt;#root&gt;  \n</hi>");
        org.jsoup.select.Elements elements42 = element18.getAllElements();
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
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = element24.append("");
        org.jsoup.parser.Tag tag27 = element24.tag();
        java.lang.String str29 = element24.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes30 = element24.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag1, "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>", attributes30);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        java.lang.String str21 = tag10.getName();
        org.jsoup.parser.Tag tag22 = tag10.getImplicitParent();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        org.jsoup.nodes.Element element28 = document26.empty();
        java.lang.String str29 = element28.id();
        org.jsoup.parser.Tag tag30 = element28.tag();
        org.jsoup.parser.Tag tag31 = tag30.getImplicitParent();
        java.lang.String str32 = tag31.toString();
        org.jsoup.parser.Tag tag33 = tag31.getImplicitParent();
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag43 = tag41.getImplicitParent();
        boolean boolean44 = tag39.equals((java.lang.Object) tag41);
        java.lang.String str45 = tag39.toString();
        java.lang.String str46 = tag39.toString();
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList51 = document50.childNodes();
        document50.setBaseUri("hi!");
        org.jsoup.nodes.Element element54 = document50.empty();
        org.jsoup.nodes.Attributes attributes55 = document50.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag39, "body", attributes55);
        org.jsoup.nodes.Element element58 = element56.prependElement("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes59 = element56.attributes();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag36, " body", attributes59);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag33, "<#root>", attributes59);
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag10, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes59);
        java.lang.Class<?> wildcardClass63 = attributes59.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "body" + "'", str32, "body");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        org.jsoup.nodes.Element element26 = element21.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element18 = element16.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        java.lang.String str11 = element9.nodeName();
        org.jsoup.nodes.Element element14 = element9.attr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;amp;lt;&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;amp;lt;/&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi! &lt;/body&gt; &lt;/html&gt;<#root>\n </#root>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str5 = tag4.toString();
        org.jsoup.parser.Tag tag6 = tag4.getImplicitParent();
        boolean boolean7 = tag6.preserveWhitespace();
        boolean boolean8 = tag6.isInline();
        java.lang.String str9 = tag6.toString();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean12 = tag1.isValidParent(tag6);
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
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag33.isValidParent(tag35);
        boolean boolean37 = tag35.isBlock();
        boolean boolean39 = tag35.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.nodeName();
        org.jsoup.select.Elements elements44 = document42.getAllElements();
        java.lang.String str45 = document42.id();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        org.jsoup.nodes.Element element50 = document42.appendChild((org.jsoup.nodes.Node) document48);
        org.jsoup.select.Elements elements53 = document48.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element55 = document48.addClass("hi!hi!");
        boolean boolean56 = tag35.equals((java.lang.Object) document48);
        boolean boolean57 = tag35.isInline();
        boolean boolean58 = tag15.canContain(tag35);
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList63 = document62.childNodes();
        document62.setBaseUri("hi!");
        org.jsoup.nodes.Element element66 = document62.empty();
        org.jsoup.nodes.Attributes attributes67 = document62.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag35, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes67);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag6, "&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!", attributes67);
        org.jsoup.nodes.Element element71 = element69.val("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "body" + "'", str9, "body");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#document" + "'", str43, "#document");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(element71);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean4 = document2.hasClass("\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document8.empty();
        org.jsoup.nodes.Element element14 = document8.appendText("hi!");
        org.jsoup.select.Elements elements15 = document8.parents();
        org.jsoup.nodes.Attributes attributes16 = document8.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", attributes16);
        org.jsoup.nodes.Element element19 = element17.appendText("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element19.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Attributes attributes22 = element19.attributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = element4.children();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        org.jsoup.nodes.Node node16 = element14.removeAttr("#root");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element21 = document19.text("hi!");
        org.jsoup.nodes.Element element23 = element21.text("hi!");
        org.jsoup.select.Elements elements25 = element21.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet26 = element21.classNames();
        org.jsoup.nodes.Element element27 = element14.classNames(strSet26);
        boolean boolean28 = element14.isBlock();
        java.lang.String str29 = element14.baseUri();
        boolean boolean30 = element4.equals((java.lang.Object) str29);
        java.lang.String str31 = element4.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        document2.setBaseUri("#document");
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element15 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = document2.getAllElements();
        org.jsoup.nodes.Attributes attributes17 = document2.attributes();
        org.jsoup.select.Elements elements19 = document2.getElementsByClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
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
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element26 = document24.text("hi!");
        org.jsoup.nodes.Element element28 = element26.text("hi!");
        org.jsoup.select.Elements elements30 = element26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element32 = element26.appendText("hi!");
        org.jsoup.nodes.Element element35 = element26.attr("#root", "#document");
        org.jsoup.nodes.Element element37 = element26.appendElement("#root");
        org.jsoup.nodes.Element element38 = element37.empty();
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        org.jsoup.nodes.Element element41 = element38.appendElement("hi!");
        element21.replaceWith((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str46 = document45.nodeName();
        org.jsoup.select.Elements elements47 = document45.getAllElements();
        java.util.Set<java.lang.String> strSet48 = document45.classNames();
        org.jsoup.nodes.Element element49 = element21.classNames(strSet48);
        org.jsoup.nodes.Element element50 = document2.classNames(strSet48);
        java.lang.String str51 = document2.toString();
        org.jsoup.nodes.Element element53 = document2.getElementById("hi!#document");
        org.jsoup.nodes.Element element55 = document2.removeClass("<hi! class=\"\">\n</hi!>");
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
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>" + "'", str51, "<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexGreaterThan((int) 'a');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.preserveWhitespace();
        boolean boolean6 = tag3.isBlock();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag8.isValidParent(tag10);
        boolean boolean12 = tag10.isBlock();
        boolean boolean14 = tag10.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag10, "#document");
        boolean boolean17 = tag10.isEmpty();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        boolean boolean23 = element22.isBlock();
        boolean boolean24 = element22.hasText();
        org.jsoup.parser.Tag tag25 = element22.tag();
        boolean boolean26 = tag10.canContain(tag25);
        java.lang.String str27 = tag25.getName();
        boolean boolean28 = tag3.canContain(tag25);
        boolean boolean29 = tag3.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendElement("body");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValue("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        java.lang.String str8 = document2.baseUri();
        java.lang.Integer int9 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = document2.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str9 = element4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!hi!");
        org.jsoup.nodes.Element element15 = element11.appendElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements17 = element11.getElementsByIndexGreaterThan((int) '#');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        java.lang.String str9 = element8.val();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.parent();
        boolean boolean13 = element12.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
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
        org.jsoup.nodes.Element element19 = element13.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element21 = element19.html("html");
        java.lang.String str22 = element19.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "html" + "'", str22, "html");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.Integer int4 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.nodeName();
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        java.lang.String str22 = document19.id();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        org.jsoup.nodes.Element element27 = document19.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document30.empty();
        org.jsoup.nodes.Element element35 = document25.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element38 = element34.attr("#root", "#document");
        java.lang.String str39 = element34.id();
        java.lang.String str41 = element34.attr("");
        boolean boolean42 = element12.equals((java.lang.Object) element34);
        java.lang.String str43 = element34.text();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element48 = document46.text("hi!");
        org.jsoup.nodes.Element element50 = element48.text("hi!");
        org.jsoup.select.Elements elements52 = element48.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet53 = element48.classNames();
        org.jsoup.nodes.Element element54 = element34.classNames(strSet53);
        org.jsoup.select.Elements elements55 = element54.siblingElements();
        org.jsoup.nodes.Element element57 = element54.prependElement("#document hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.prependElement("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.nodeName();
        org.jsoup.select.Elements elements10 = document8.getAllElements();
        java.lang.String str11 = document8.id();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Element element16 = document8.appendChild((org.jsoup.nodes.Node) document14);
        java.lang.String str18 = document8.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document8.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element25 = document23.text("hi!");
        boolean boolean26 = element25.isBlock();
        org.jsoup.nodes.Element element27 = document8.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = element27.text("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements37 = element34.parents();
        org.jsoup.nodes.Element element39 = element34.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str40 = element34.outerHtml();
        java.lang.String str41 = element34.className();
        org.jsoup.nodes.Element element42 = element27.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element43 = element5.appendChild((org.jsoup.nodes.Node) element42);
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueStarting("\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str40, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element13 = document11.text("hi!");
        org.jsoup.nodes.Element element15 = element13.text("hi!");
        org.jsoup.select.Elements elements17 = element13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element19 = element13.appendText("hi!");
        org.jsoup.nodes.Element element22 = element13.attr("#root", "#document");
        java.lang.String str23 = element13.text();
        org.jsoup.nodes.Element element24 = element4.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.childNodes();
        document27.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = document27.prependText("#document");
        java.lang.String str34 = document27.attr("#document");
        org.jsoup.nodes.Element element36 = document27.prependText("");
        org.jsoup.nodes.Element element37 = element36.empty();
        org.jsoup.select.Elements elements40 = element36.getElementsByAttributeValueNot("hi!", "body");
        element13.replaceWith((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element43 = element36.wrap("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
        org.jsoup.nodes.Element element44 = element36.nextElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!" + "'", str23, "hi!hi!");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNull(element44);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = document2.toggleClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.select.Elements elements15 = element11.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements16 = element11.children();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueEnding("#root", "#document");
        org.jsoup.nodes.Element element13 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str14 = element4.tagName();
        boolean boolean15 = element4.hasText();
        org.jsoup.select.Elements elements17 = element4.getElementsByIndexLessThan((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element4.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        java.lang.String str50 = tag39.getName();
        java.lang.String str51 = tag39.getName();
        org.jsoup.parser.Tag tag52 = tag39.getImplicitParent();
        boolean boolean53 = tag39.canContainBlock();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "body" + "'", str50, "body");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "body" + "'", str51, "body");
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("#document hi!\n<html>\n<head>\n</head>\n<body>\n hi! \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
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
        org.jsoup.nodes.Element element36 = element34.prependElement("< > >");
        java.lang.String str37 = element36.val();
        java.util.Set<java.lang.String> strSet38 = element36.classNames();
        org.jsoup.nodes.Element element40 = element36.appendText("<html> \n <head> \n </head> \n <body>\n   hi!  \n </body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        boolean boolean10 = element9.isBlock();
        java.lang.String str11 = element9.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        java.lang.String str20 = element15.baseUri();
        org.jsoup.nodes.Element element22 = element15.appendElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("hi!");
        org.jsoup.nodes.Element element20 = element11.attr("#root", "#document");
        org.jsoup.nodes.Node node22 = element11.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements23 = element11.parents();
        org.jsoup.select.Elements elements26 = element11.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean27 = element4.equals((java.lang.Object) element11);
        org.jsoup.select.Elements elements29 = element11.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements31 = element11.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
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
        boolean boolean39 = tag1.isBlock();
        boolean boolean40 = tag1.isInline();
        boolean boolean41 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = document48.appendText("hi!");
        org.jsoup.nodes.Attributes attributes55 = document48.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag43, "hi!", attributes55);
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = document60.childNodes();
        document60.setBaseUri("hi!");
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element66 = document60.appendText("hi!");
        org.jsoup.nodes.Attributes attributes67 = document60.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag43, "#document", attributes67);
        boolean boolean69 = tag43.isData();
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element74 = document72.text("hi!");
        org.jsoup.parser.Tag tag75 = document72.tag();
        boolean boolean76 = tag43.canContain(tag75);
        boolean boolean77 = tag75.isBlock();
        boolean boolean78 = tag1.isValidParent(tag75);
        boolean boolean79 = tag75.isInline();
        boolean boolean80 = tag75.isBlock();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        org.jsoup.nodes.Element element41 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document47.childNodes();
        document47.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document47.empty();
        org.jsoup.nodes.Element element53 = element51.append("");
        org.jsoup.nodes.Element element54 = element51.empty();
        java.util.Set<java.lang.String> strSet55 = element54.classNames();
        org.jsoup.nodes.Element element56 = document44.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element56.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element18.appendChild((org.jsoup.nodes.Node) element56);
        org.jsoup.select.Elements elements62 = element60.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
        org.jsoup.nodes.Element element64 = element60.appendElement("<#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>hi!#document");
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
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Element element16 = element4.empty();
        boolean boolean18 = element16.hasClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element16.addClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str9 = tag8.toString();
        boolean boolean10 = tag8.isBlock();
        boolean boolean11 = tag8.preserveWhitespace();
        boolean boolean12 = tag8.preserveWhitespace();
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
        org.jsoup.parser.Tag tag52 = tag14.getImplicitParent();
        boolean boolean53 = tag52.canContainBlock();
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isBlock();
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = document60.childNodes();
        document60.setBaseUri("hi!");
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element66 = document60.appendText("hi!");
        org.jsoup.nodes.Attributes attributes67 = document60.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag55, "hi!", attributes67);
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList73 = document72.childNodes();
        document72.setBaseUri("hi!");
        org.jsoup.nodes.Element element76 = document72.empty();
        org.jsoup.nodes.Element element78 = document72.appendText("hi!");
        org.jsoup.nodes.Attributes attributes79 = document72.attributes();
        org.jsoup.nodes.Element element80 = new org.jsoup.nodes.Element(tag55, "#document", attributes79);
        boolean boolean81 = tag52.canContain(tag55);
        boolean boolean82 = tag8.canContain(tag52);
        boolean boolean83 = tag1.isValidParent(tag8);
        boolean boolean84 = tag1.isBlock();
        boolean boolean85 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        org.jsoup.nodes.Element element34 = element32.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element36 = element32.text("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element38 = element32.toggleClass("hi!hi!");
        java.lang.String str39 = element32.val();
        java.lang.String str40 = element32.nodeName();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str45 = tag44.toString();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag42.equals((java.lang.Object) tag44);
        boolean boolean48 = tag42.isBlock();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag42, "#root");
        boolean boolean51 = tag42.preserveWhitespace();
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList56 = document55.childNodes();
        org.jsoup.nodes.Attributes attributes57 = document55.attributes();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag42, "#root", attributes57);
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element63 = document61.text("hi!");
        org.jsoup.nodes.Element element65 = element63.text("hi!");
        org.jsoup.select.Elements elements67 = element63.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet68 = element63.classNames();
        org.jsoup.nodes.Element element69 = element58.prependChild((org.jsoup.nodes.Node) element63);
        boolean boolean70 = element69.hasText();
        org.jsoup.nodes.Element element72 = element69.prepend("#root");
        org.jsoup.nodes.Element element74 = element72.toggleClass("hi!");
        org.jsoup.nodes.Element element75 = element32.prependChild((org.jsoup.nodes.Node) element74);
        org.jsoup.select.Elements elements76 = element75.children();
        java.lang.String str77 = element75.val();
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
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.nodeName();
        java.lang.String str13 = element8.className();
        org.jsoup.nodes.Element element15 = element8.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements18 = element8.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "<hi! class=\"\">\nhi!\n</hi!>");
        org.jsoup.parser.Tag tag19 = element8.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.child(0);
        org.jsoup.nodes.Element element13 = element10.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element15 = element13.toggleClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str16 = element15.data();
        org.jsoup.nodes.Element element18 = element15.prepend("#root");
        org.jsoup.nodes.Element element19 = element18.nextElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
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
        java.lang.String str24 = element23.html();
        org.jsoup.nodes.Element element27 = element23.attr("<hi! class=\"\">\n</hi!>", "<#root>");
        java.lang.String str28 = element23.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str24, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>" + "'", str28, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n <hi>\n   &lt;#root&gt; \n </hi>\n</body>\n</html>", "\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n<hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        boolean boolean10 = document2.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document2.getElementsByAttributeValueContaining("#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean14 = document2.hasText();
        document2.setBaseUri("< > >");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element24 = element9.addClass("hi!#document");
        org.jsoup.nodes.Element element27 = element9.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        java.lang.Integer int28 = element27.elementSiblingIndex();
        org.jsoup.select.Elements elements30 = element27.getElementsByAttribute("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        org.jsoup.nodes.Element element9 = document2.addClass("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
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
        org.jsoup.nodes.Element element19 = element10.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element19.val("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element7 = element5.empty();
        boolean boolean8 = element5.isBlock();
        element5.setBaseUri("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!#document  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
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
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag34, "hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        boolean boolean38 = element37.hasText();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element11.toggleClass("body");
        org.jsoup.parser.Tag tag14 = element11.tag();
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
        org.jsoup.select.Elements elements35 = element33.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes36 = element33.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag14, "<#root>", attributes36);
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "");
        java.lang.String[] strArray44 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = element41.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element element49 = element41.prepend("#document");
        java.lang.String str50 = element41.id();
        org.jsoup.nodes.Element element52 = element41.text("hi!hi!");
        org.jsoup.nodes.Element element53 = element37.prependChild((org.jsoup.nodes.Node) element52);
        java.lang.Integer int54 = element52.elementSiblingIndex();
        org.jsoup.nodes.Element element56 = element52.prepend("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
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
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "#document", "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element18 = element12.toggleClass("<#root hi!>\n</#root hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }
}

