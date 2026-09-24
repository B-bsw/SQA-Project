package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = element14.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element14.previousSibling();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document2.nextSibling();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        org.jsoup.nodes.Element element11 = element6.val("hi!hi!");
        org.jsoup.nodes.Element element14 = element6.attr(" hi!hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.firstElementSibling();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element16 = element11.attr("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.appendText("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.nextElementSibling();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element16 = element8.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str17 = element16.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.firstElementSibling();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.prependElement("hi!");
        java.lang.String str18 = element17.val();
        org.jsoup.nodes.Element element20 = element17.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean23 = element17.isBlock();
        org.jsoup.nodes.Attributes attributes24 = element17.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", attributes24);
        boolean boolean27 = element25.hasAttr("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.nextElementSibling();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        boolean boolean6 = document2.hasText();
        org.jsoup.nodes.Element element8 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.previousElementSibling();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element21.toggleClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element21.previousElementSibling();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        org.jsoup.nodes.Element element21 = element4.appendText("hi!#document");
        java.lang.String str22 = element4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element4.siblingNodes();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Element element8 = element4.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element4.append("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.firstElementSibling();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document2.siblingElements();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element4.hasText();
        boolean boolean17 = element4.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element4.siblingNodes();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueNot("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n<hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element3.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element3.siblingIndex();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        org.jsoup.select.Elements elements8 = element7.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.wrap("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.previousElementSibling();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String str3 = document2.html();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValue("hi!", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.nextElementSibling();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        org.jsoup.nodes.Element element10 = document2.getElementById("hi!hi!");
        java.lang.String str11 = document2.tagName();
        document2.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document2.siblingNodes();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str10 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.previousElementSibling();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        java.util.Set<java.lang.String> strSet7 = element4.classNames();
        boolean boolean9 = element4.hasAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.lastElementSibling();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element17.siblingIndex();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.appendElement("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element10.siblingElements();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element8.siblingElements();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        org.jsoup.nodes.Element element61 = element18.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element63 = element18.wrap("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueNot("hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str14 = element9.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element9.nextSibling();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element9.siblingElements();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.val("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = element4.siblingElements();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element23.previousElementSibling();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.wrap(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueEnding("hi!#document", "#root");
        org.jsoup.nodes.Element element12 = element6.addClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element12.empty();
        boolean boolean14 = element12.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element12.siblingNodes();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element4.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        java.lang.String str13 = element4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element4.previousSibling();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.nextElementSibling();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.nodes.Element element11 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element11.siblingIndex();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!#document");
        java.lang.String str14 = element11.toString();
        java.lang.String str15 = element11.className();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Element element31 = element20.appendElement("#root");
        org.jsoup.select.Elements elements32 = element20.children();
        java.lang.String str33 = element20.toString();
        org.jsoup.nodes.Element element34 = element11.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element36 = element34.val("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = element34.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = element34.previousSibling();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        org.jsoup.nodes.Element element21 = element8.prepend("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = element21.siblingElements();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.wrap("<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element16.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean20 = element19.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element19.siblingElements();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "#document");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element7 = document2.text("&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element11 = document2.toggleClass(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.firstElementSibling();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        java.lang.String str8 = element4.absUrl("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element4.siblingIndex();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        org.jsoup.nodes.Node node20 = element18.childNode((int) (short) 1);
        java.util.Set<java.lang.String> strSet21 = element18.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element18.firstElementSibling();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document17.prependText("#document");
        java.lang.String str24 = document17.attr("#document");
        org.jsoup.nodes.Element element26 = document17.prependText("");
        boolean boolean27 = tag3.equals((java.lang.Object) element26);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        org.jsoup.nodes.Element element33 = document31.empty();
        java.lang.String str34 = element33.id();
        org.jsoup.parser.Tag tag35 = element33.tag();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str39 = document38.nodeName();
        org.jsoup.select.Elements elements40 = document38.getAllElements();
        java.util.Set<java.lang.String> strSet41 = document38.classNames();
        org.jsoup.nodes.Element element42 = element33.classNames(strSet41);
        org.jsoup.nodes.Attributes attributes43 = element33.attributes();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag3, "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", attributes43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element44.firstElementSibling();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        org.jsoup.nodes.Element element21 = element6.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element6.nextSibling();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        java.lang.String str9 = document2.tagName();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.jsoup.nodes.Element element12 = document2.prependElement("< > >");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.lastElementSibling();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.nodeName();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.id();
        java.lang.String str18 = document14.text();
        org.jsoup.nodes.Element element20 = document14.prependText("#root");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element4.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = element22.siblingIndex();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.lastElementSibling();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.previousSibling();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.nextSibling();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str16 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.previousElementSibling();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int43 = element41.siblingIndex();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexGreaterThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.nextElementSibling();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element9.siblingElements();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi!hi!");
        java.lang.String str9 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.nextSibling();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.text("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.siblingNodes();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        org.jsoup.parser.Tag tag21 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document2.previousElementSibling();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        boolean boolean9 = document2.isBlock();
        org.jsoup.nodes.Node node11 = document2.childNode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document2.nextSibling();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("#root");
        boolean boolean14 = element6.hasText();
        boolean boolean16 = element6.hasClass("<head>\n</head>\n<body>\n hi!\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element6.siblingElements();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        org.jsoup.select.Elements elements16 = document2.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.String str17 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.wrap("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueNot("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>", "<hi! class=\"\">\nhi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.siblingNodes();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element15.previousSibling();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueNot("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>", "<hi! class=\"\">\nhi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.lastElementSibling();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        org.jsoup.nodes.Element element49 = element19.prependText("<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element19.previousElementSibling();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        boolean boolean6 = document2.hasText();
        org.jsoup.nodes.Element element8 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        java.lang.String str14 = document11.id();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        org.jsoup.nodes.Element element19 = document11.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element27 = document17.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element26.attr("#root", "#document");
        org.jsoup.nodes.Element element31 = element26.empty();
        org.jsoup.select.Elements elements34 = element26.getElementsByAttributeValueNot("body", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element39 = document37.text("hi!");
        org.jsoup.nodes.Element element41 = element39.text("hi!");
        org.jsoup.select.Elements elements43 = element39.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element45 = element39.appendText("hi!");
        element26.replaceWith((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element48 = element39.appendText("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        java.util.Set<java.lang.String> strSet49 = element48.classNames();
        org.jsoup.nodes.Element element50 = element8.classNames(strSet49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList51 = element50.siblingNodes();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node65 = element59.previousSibling();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements3 = document2.parents();
        boolean boolean4 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.nextSibling();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        java.lang.String str11 = document2.outerHtml();
        org.jsoup.select.Elements elements13 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str15 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document2.nextElementSibling();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element44.lastElementSibling();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document2.siblingNodes();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "#document");
        java.lang.String str3 = document2.toString();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.html(" body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.previousElementSibling();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Element element8 = element4.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        boolean boolean10 = element8.hasClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.previousElementSibling();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element4.nextSibling();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element4.hasText();
        boolean boolean17 = element4.hasText();
        org.jsoup.nodes.Element element19 = element4.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str24 = tag23.toString();
        org.jsoup.parser.Tag tag25 = tag23.getImplicitParent();
        boolean boolean26 = tag21.equals((java.lang.Object) tag23);
        java.lang.String str27 = tag21.toString();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag29.isValidParent(tag31);
        boolean boolean33 = tag21.canContain(tag31);
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element46 = document40.appendText("hi!");
        org.jsoup.nodes.Attributes attributes47 = document40.attributes();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag35, "hi!", attributes47);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = document52.childNodes();
        document52.setBaseUri("hi!");
        org.jsoup.nodes.Element element56 = document52.empty();
        org.jsoup.nodes.Element element58 = document52.appendText("hi!");
        org.jsoup.nodes.Attributes attributes59 = document52.attributes();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag35, "#document", attributes59);
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element65 = document63.text("hi!");
        java.lang.String str66 = document63.outerHtml();
        java.lang.String str67 = document63.data();
        boolean boolean68 = tag35.equals((java.lang.Object) document63);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element73 = document71.text("hi!");
        org.jsoup.nodes.Element element75 = element73.text("hi!");
        org.jsoup.nodes.Element element77 = element73.prepend("");
        boolean boolean78 = tag35.equals((java.lang.Object) "");
        boolean boolean79 = tag31.isValidParent(tag35);
        org.jsoup.nodes.Element element81 = new org.jsoup.nodes.Element(tag31, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Element element82 = element4.prependChild((org.jsoup.nodes.Node) element81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element83 = element4.lastElementSibling();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str11 = element10.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element10.siblingIndex();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        java.util.Set<java.lang.String> strSet65 = element18.classNames();
        java.lang.String str66 = element18.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node67 = element18.nextSibling();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element3.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element3.previousSibling();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int65 = element14.siblingIndex();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        boolean boolean17 = element16.hasText();
        org.jsoup.nodes.Element element19 = element16.html("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element19.siblingIndex();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
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
        boolean boolean27 = tag1.isData();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element32 = document30.text("hi!");
        org.jsoup.parser.Tag tag33 = document30.tag();
        boolean boolean34 = tag1.canContain(tag33);
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str39 = tag38.toString();
        org.jsoup.parser.Tag tag40 = tag38.getImplicitParent();
        boolean boolean41 = tag36.equals((java.lang.Object) tag38);
        boolean boolean42 = tag36.isBlock();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag36, "#root");
        boolean boolean45 = tag36.isInline();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element50 = document48.text("hi!");
        org.jsoup.nodes.Element element52 = element50.text("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element56 = element50.appendText("hi!");
        org.jsoup.nodes.Element element59 = element50.attr("#root", "#document");
        org.jsoup.nodes.Node node61 = element50.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element63 = element50.append("");
        org.jsoup.parser.Tag tag64 = element50.tag();
        boolean boolean65 = tag36.canContain(tag64);
        boolean boolean66 = tag33.equals((java.lang.Object) boolean65);
        org.jsoup.parser.Tag tag68 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean71 = tag68.isValidParent(tag70);
        boolean boolean72 = tag70.canContainBlock();
        boolean boolean73 = tag33.isValidParent(tag70);
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag33, "<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int76 = element75.siblingIndex();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
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
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str40 = tag39.toString();
        org.jsoup.parser.Tag tag41 = tag39.getImplicitParent();
        boolean boolean42 = tag41.preserveWhitespace();
        boolean boolean43 = tag41.isInline();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document46.childNodes();
        document46.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document46.prependText("#document");
        boolean boolean52 = tag41.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag41, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element57 = element54.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element58 = element17.prependChild((org.jsoup.nodes.Node) element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList59 = element58.siblingNodes();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document2.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        java.lang.String str5 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element8.toggleClass("#root");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element13.siblingElements();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element15 = element12.html("#document");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueNot("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element15.siblingElements();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "#document");
        boolean boolean3 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = document2.siblingIndex();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Element element8 = element4.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexEquals((int) 'a');
        org.jsoup.select.Elements elements11 = element4.children();
        java.lang.String str13 = element4.attr("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element4.childNodes();
        org.jsoup.nodes.Element element16 = element4.appendText("<#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element4.nextSibling();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element10.siblingElements();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        org.jsoup.nodes.Element element12 = element6.appendElement("body");
        org.jsoup.nodes.Element element14 = element6.removeClass("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element6.siblingIndex();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        java.lang.String str7 = element6.html();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueEnding("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element12 = element6.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element13 = element12.empty();
        boolean boolean14 = element12.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document2.siblingElements();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        org.jsoup.nodes.Element element20 = element18.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element22 = element18.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element22.wrap("<hi! class=\"#document &lt;hi! class=&quot;#document &quot; #document=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt;\n#root#document\n&lt;/hi!&gt;\">\n</hi!>");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.previousSibling();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueContaining("#root", "#document");
        org.jsoup.nodes.Element element15 = element11.parent();
        java.lang.String str16 = element11.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = element11.siblingIndex();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element13 = document7.appendText("hi!");
        org.jsoup.select.Elements elements15 = document7.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element17 = document7.appendText("#document");
        java.lang.Integer int18 = document7.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element4.appendChild((org.jsoup.nodes.Node) document7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element4.firstElementSibling();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "body");
        java.lang.String str3 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.getElementById("hi!");
        org.jsoup.nodes.Element element15 = element8.prepend(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element15.siblingIndex();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        org.jsoup.nodes.Element element10 = document2.getElementById("hi!hi!");
        java.lang.String str11 = document2.tagName();
        document2.setBaseUri("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.firstElementSibling();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        java.lang.String str8 = element4.attr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element10 = element4.prependElement("<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element4.siblingElements();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        java.lang.String str10 = document2.baseUri();
        java.lang.String str11 = document2.data();
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element18 = document16.text("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element22 = element18.removeClass("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element22.prepend("body");
        java.lang.String str27 = element26.baseUri();
        org.jsoup.nodes.Attributes attributes28 = element26.attributes();
        org.jsoup.nodes.Element element30 = element26.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element32 = element30.text("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.nodes.Attributes attributes33 = element32.attributes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag12, "hi! hi!", attributes33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element34.firstElementSibling();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.parent();
        java.lang.String str4 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag1.canContainBlock();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Element element10 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>", "#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.select.Elements elements11 = element4.getElementsByIndexEquals(100);
        java.lang.String str12 = element4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element4.siblingIndex();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = element27.siblingElements();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements8 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.nextSibling();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        org.jsoup.select.Elements elements12 = element6.getElementsByIndexEquals((int) (short) 0);
        java.lang.String str14 = element6.absUrl("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element6.nextSibling();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str3 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.nextElementSibling();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node11 = document2.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.lastElementSibling();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element6.hasClass("hi!");
        java.lang.String str9 = element6.val();
        org.jsoup.nodes.Node node11 = element6.removeAttr("\n<hi!>\n</hi!>");
        java.lang.String str12 = element6.outerHtml();
        org.jsoup.select.Elements elements14 = element6.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements17 = element6.getElementsByAttributeValueEnding("#root", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root class=\" #root\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element6.nextElementSibling();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
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
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document46.childNodes();
        document46.setBaseUri("hi!");
        org.jsoup.nodes.Element element50 = document46.empty();
        org.jsoup.nodes.Element element52 = document46.appendText("hi!");
        org.jsoup.select.Elements elements54 = document46.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag56, "");
        java.lang.String[] strArray61 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.jsoup.nodes.Element element64 = element58.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element65 = document46.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element66 = element41.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element68 = element66.prependText("&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node69 = element66.previousSibling();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document2.siblingElements();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str10 = document2.val();
        org.jsoup.nodes.Node node12 = document2.removeAttr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.util.Set<java.lang.String> strSet13 = document2.classNames();
        java.lang.String str14 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document2.wrap("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
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
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag41, "\n<hi!>\n</hi!>");
        java.lang.String str45 = element44.html();
        org.jsoup.nodes.Element element46 = element44.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element46.lastElementSibling();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element13.text("\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.previousElementSibling();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.parent();
        java.lang.String str4 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.childNodes();
        org.jsoup.nodes.Element element29 = document27.empty();
        java.lang.String str30 = element29.val();
        org.jsoup.nodes.Attributes attributes31 = element29.attributes();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.nodeName();
        org.jsoup.select.Elements elements36 = document34.getAllElements();
        java.lang.String str37 = document34.id();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        org.jsoup.nodes.Element element42 = document34.appendChild((org.jsoup.nodes.Node) document40);
        java.lang.String str44 = document34.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element46 = document34.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean47 = element29.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean48 = tag3.equals((java.lang.Object) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element29.previousElementSibling();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        java.lang.String str12 = element7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element7.wrap("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int10 = element4.elementSiblingIndex();
        java.lang.String str11 = element4.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element4.nextSibling();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
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
        org.jsoup.nodes.Element element47 = element41.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements48 = element41.siblingElements();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element4.siblingNodes();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element13 = element7.removeClass("");
        org.jsoup.nodes.Element element15 = element13.appendElement("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element13.siblingIndex();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements13 = document2.getElementsByAttributeValueContaining("body", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element4.previousElementSibling();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.nodeName();
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str12 = tag11.toString();
        org.jsoup.parser.Tag tag13 = tag11.getImplicitParent();
        boolean boolean14 = tag9.equals((java.lang.Object) tag11);
        java.lang.String str15 = tag9.toString();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag17.isValidParent(tag19);
        boolean boolean21 = tag9.canContain(tag19);
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
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element53 = document51.text("hi!");
        java.lang.String str54 = document51.outerHtml();
        java.lang.String str55 = document51.data();
        boolean boolean56 = tag23.equals((java.lang.Object) document51);
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element61 = document59.text("hi!");
        org.jsoup.nodes.Element element63 = element61.text("hi!");
        org.jsoup.nodes.Element element65 = element61.prepend("");
        boolean boolean66 = tag23.equals((java.lang.Object) "");
        boolean boolean67 = tag19.isValidParent(tag23);
        boolean boolean68 = tag7.isValidParent(tag23);
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag7, "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element72 = element70.prependElement("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node73 = element70.nextSibling();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        java.lang.String str12 = element11.tagName();
        org.jsoup.nodes.Element element14 = element11.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element11.nextSibling();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>hi!<#root>\n</#root>");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element4.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element4.previousSibling();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
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
        org.jsoup.select.Elements elements22 = element14.getAllElements();
        org.jsoup.select.Elements elements24 = element14.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element26 = element14.prependText("#document<html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element14.nextSibling();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element4.attr("#document ", "hi!#document");
        boolean boolean9 = element7.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element7.siblingElements();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        org.jsoup.select.Elements elements14 = element4.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element16 = element4.removeClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element4.text("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.text("hi!#document");
        org.jsoup.nodes.Element element11 = element4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element4.wrap("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.getElementById("hi!");
        org.jsoup.nodes.Element element15 = element8.prepend(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.lastElementSibling();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
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
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.select.Elements elements25 = document18.parents();
        org.jsoup.parser.Tag tag26 = document18.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str34 = tag33.toString();
        org.jsoup.parser.Tag tag35 = tag33.getImplicitParent();
        boolean boolean36 = tag31.equals((java.lang.Object) tag33);
        boolean boolean37 = tag31.isBlock();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag31, "#root");
        boolean boolean40 = tag31.preserveWhitespace();
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        org.jsoup.nodes.Attributes attributes46 = document44.attributes();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag31, "#root", attributes46);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag26, "#document", attributes46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag10, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", attributes46);
        java.lang.String str50 = tag10.toString();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element56 = document54.text("hi!");
        boolean boolean57 = element56.isBlock();
        org.jsoup.parser.Tag tag58 = element56.tag();
        java.lang.String str59 = tag58.toString();
        java.lang.String str60 = tag58.toString();
        org.jsoup.nodes.Document document64 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element66 = document64.text("hi!");
        org.jsoup.nodes.Attributes attributes67 = element66.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag58, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes67);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag10, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>", attributes67);
        org.jsoup.select.Elements elements70 = element69.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element69.nextElementSibling();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("");
        org.jsoup.nodes.Element element6 = document2.text("");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element9 = element6.addClass("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.previousElementSibling();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "#document");
        java.lang.String str3 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.previousSibling();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element15 = element12.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        boolean boolean20 = element19.isBlock();
        org.jsoup.nodes.Element element21 = document2.appendChild((org.jsoup.nodes.Node) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.previousElementSibling();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        java.lang.String str9 = document2.tagName();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.jsoup.nodes.Element element12 = document2.prependElement("< > >");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.previousElementSibling();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.className();
        org.jsoup.nodes.Element element8 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element8.attr("hi! <html> <head> </head> <body> hi! </body> </html>", "\n<html>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.lastElementSibling();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.appendElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element11.toggleClass(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.firstElementSibling();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = element23.siblingIndex();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<hi!> <#root> </#root><#root> <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> hi! </body> </html> </#root> </#root> </hi!> hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>", "hi! <html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
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
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueContaining("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "body");
        java.lang.String str28 = element24.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = element24.previousSibling();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.childNodes();
        document27.setBaseUri("hi!");
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.nodes.Element element33 = document27.appendText("hi!");
        org.jsoup.nodes.Attributes attributes34 = document27.attributes();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag22, "hi!", attributes34);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = document39.childNodes();
        document39.setBaseUri("hi!");
        org.jsoup.nodes.Element element43 = document39.empty();
        org.jsoup.nodes.Element element45 = document39.appendText("hi!");
        org.jsoup.nodes.Attributes attributes46 = document39.attributes();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag22, "#document", attributes46);
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList51 = document50.childNodes();
        document50.setBaseUri("hi!");
        org.jsoup.nodes.Element element54 = document50.empty();
        org.jsoup.nodes.Element element56 = element54.append("");
        org.jsoup.parser.Tag tag57 = element54.tag();
        boolean boolean58 = tag22.canContain(tag57);
        boolean boolean59 = tag22.preserveWhitespace();
        org.jsoup.parser.Tag tag60 = tag22.getImplicitParent();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag60, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element64 = element62.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element66 = element62.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements67 = element66.children();
        org.jsoup.nodes.Element element69 = element66.removeClass("html");
        element17.replaceWith((org.jsoup.nodes.Node) element66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element17.lastElementSibling();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
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
        org.jsoup.nodes.Node node18 = document2.removeAttr("body");
        org.jsoup.nodes.Element element20 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document2.nextElementSibling();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        org.jsoup.nodes.Element element10 = element4.val("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document2.siblingNodes();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element13.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element13.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.nodes.Element element9 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.getElementById("hi!");
        org.jsoup.nodes.Element element15 = element8.prepend(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str16 = element8.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element8.siblingNodes();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
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
        org.jsoup.nodes.Element element21 = element4.val("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.nextSibling();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
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
        org.jsoup.nodes.Element element48 = element41.html("");
        org.jsoup.nodes.Element element50 = element48.toggleClass("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node51 = element50.previousSibling();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element8.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int25 = document8.siblingIndex();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element17.text("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str9 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.siblingNodes();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes11 = element4.attributes();
        org.jsoup.parser.Tag tag12 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element4.previousSibling();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
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
        org.jsoup.select.Elements elements30 = element23.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element23.nextElementSibling();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements20 = element13.getElementsByIndexEquals(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element13.previousSibling();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
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
        org.jsoup.select.Elements elements22 = element14.getAllElements();
        org.jsoup.select.Elements elements24 = element14.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element26 = element14.prependText("#document<html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document33.childNodes();
        document33.setBaseUri("hi!");
        org.jsoup.nodes.Element element37 = document33.empty();
        org.jsoup.nodes.Element element39 = document33.appendText("hi!");
        org.jsoup.nodes.Attributes attributes40 = document33.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag28, "hi!", attributes40);
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document45.childNodes();
        document45.setBaseUri("hi!");
        org.jsoup.nodes.Element element49 = document45.empty();
        org.jsoup.nodes.Element element51 = document45.appendText("hi!");
        org.jsoup.nodes.Attributes attributes52 = document45.attributes();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag28, "#document", attributes52);
        boolean boolean54 = tag28.preserveWhitespace();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document57.childNodes();
        org.jsoup.nodes.Attributes attributes59 = document57.attributes();
        org.jsoup.parser.Tag tag60 = document57.tag();
        java.lang.String str61 = document57.nodeName();
        org.jsoup.parser.Tag tag62 = document57.tag();
        boolean boolean63 = tag28.isValidParent(tag62);
        java.lang.Class<?> wildcardClass64 = tag28.getClass();
        boolean boolean65 = element26.equals((java.lang.Object) tag28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element26.lastElementSibling();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
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
        boolean boolean37 = element35.hasClass("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element35.previousElementSibling();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element41.wrap("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n</body>");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.parser.Tag tag7 = tag6.getImplicitParent();
        boolean boolean8 = tag7.isInline();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str14 = tag13.toString();
        org.jsoup.parser.Tag tag15 = tag13.getImplicitParent();
        boolean boolean16 = tag11.equals((java.lang.Object) tag13);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str21 = tag20.toString();
        org.jsoup.parser.Tag tag22 = tag20.getImplicitParent();
        boolean boolean23 = tag18.equals((java.lang.Object) tag20);
        boolean boolean24 = tag18.isBlock();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag18, "#root");
        java.lang.String str27 = tag18.toString();
        boolean boolean28 = tag11.isValidParent(tag18);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag11, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document34.childNodes();
        document34.setBaseUri("hi!");
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.nodes.Element element40 = element38.append("");
        org.jsoup.nodes.Element element41 = element38.empty();
        org.jsoup.nodes.Attributes attributes42 = element41.attributes();
        org.jsoup.select.Elements elements45 = element41.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes46 = element41.attributes();
        org.jsoup.nodes.Attributes attributes47 = element41.attributes();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag11, "<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes47);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag7, " <html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node50 = element49.previousSibling();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element10 = element4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element10.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element10.siblingIndex();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
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
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element44 = document42.text("hi!");
        org.jsoup.nodes.Element element46 = element44.text("hi!");
        org.jsoup.nodes.Element element48 = element44.html("#root");
        org.jsoup.select.Elements elements50 = element44.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes51 = element44.attributes();
        org.jsoup.parser.Tag tag52 = element44.tag();
        boolean boolean53 = tag1.equals((java.lang.Object) element44);
        org.jsoup.select.Elements elements55 = element44.getElementsByIndexEquals((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element44.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        java.lang.String str10 = document2.nodeName();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element19 = element15.removeClass("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element19.prepend("body");
        java.lang.String str24 = element23.baseUri();
        org.jsoup.nodes.Attributes attributes25 = element23.attributes();
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((-1));
        boolean boolean28 = document2.equals((java.lang.Object) (-1));
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str31 = tag30.toString();
        boolean boolean32 = tag30.isBlock();
        java.lang.String str33 = tag30.getName();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str36 = tag35.toString();
        boolean boolean37 = tag35.isBlock();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        document41.setBaseUri("hi!");
        org.jsoup.nodes.Element element45 = document41.empty();
        org.jsoup.nodes.Element element47 = element45.append("");
        org.jsoup.nodes.Element element48 = element45.empty();
        org.jsoup.nodes.Attributes attributes49 = element48.attributes();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag35, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes49);
        boolean boolean51 = tag30.isValidParent(tag35);
        java.lang.String str52 = tag30.toString();
        org.jsoup.parser.Tag tag53 = tag30.getImplicitParent();
        boolean boolean54 = document2.equals((java.lang.Object) tag30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = document2.previousElementSibling();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag13.isValidParent(tag15);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "#document");
        boolean boolean19 = element18.isBlock();
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element24 = element20.toggleClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements25 = element24.siblingElements();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        org.jsoup.nodes.Element element8 = document2.addClass("");
        org.jsoup.nodes.Element element10 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str12 = element11.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.firstElementSibling();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueStarting("hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Element element21 = document15.appendText("hi!");
        org.jsoup.select.Elements elements23 = document15.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element27.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = document15.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element38 = element35.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element40 = element35.append("#document");
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "");
        org.jsoup.nodes.Element element44 = element35.prependChild((org.jsoup.nodes.Node) document43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node45 = element44.previousSibling();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
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
        java.lang.String str23 = element17.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element17.lastElementSibling();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
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
        boolean boolean27 = tag1.isData();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element33 = document31.text("hi!");
        org.jsoup.nodes.Element element35 = element33.text("hi!");
        boolean boolean37 = element33.hasClass("#document");
        boolean boolean38 = element33.hasText();
        org.jsoup.select.Elements elements41 = element33.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str42 = element33.outerHtml();
        org.jsoup.nodes.Element element44 = element33.toggleClass("");
        org.jsoup.nodes.Attributes attributes45 = element33.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes45);
        java.lang.String str48 = element46.absUrl("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element46.previousElementSibling();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element9.siblingIndex();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.select.Elements elements19 = document14.getElementsByAttributeValueStarting("hi!", "#document");
        boolean boolean20 = element4.equals((java.lang.Object) elements19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element4.lastElementSibling();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
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
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.parser.Tag tag33 = element30.tag();
        java.lang.String str35 = element30.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements37 = element30.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Element element38 = document2.appendChild((org.jsoup.nodes.Node) element30);
        java.lang.Integer int39 = document2.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = document2.wrap("<body>\n</body>");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueStarting("hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Element element21 = document15.appendText("hi!");
        org.jsoup.select.Elements elements23 = document15.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element27.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = document15.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element38 = element35.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = element35.nextSibling();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
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
        org.jsoup.nodes.Element element26 = element4.toggleClass("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        org.jsoup.select.Elements elements29 = element4.getElementsByAttributeValueEnding("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element4.lastElementSibling();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element7 = document2.attr("hi! <html> <head> </head> <body> hi! </body> </html>", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element7.previousSibling();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        boolean boolean3 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.lastElementSibling();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str13 = element12.html();
        org.jsoup.nodes.Element element16 = element12.attr("\n<body>\nhi!\n</body>", "<#root>\n</#root>");
        org.jsoup.nodes.Element element18 = element12.appendText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element12.previousSibling();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueEnding("<html> <head> </head> <body> </body> </html>", "<html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element12.siblingNodes();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
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
        java.lang.String str24 = element21.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element21.nextElementSibling();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.lang.String str3 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.firstElementSibling();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
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
        org.jsoup.select.Elements elements48 = element41.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str50 = element41.absUrl("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList51 = element41.siblingNodes();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
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
        java.lang.String str36 = element35.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element35.text("\n<#root class=\"\">\n</#root>");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependText("hi!#document");
        org.jsoup.nodes.Element element16 = element11.text("hi!#document");
        java.lang.Integer int17 = element11.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element11.previousSibling();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
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
        org.jsoup.nodes.Element element37 = element33.html("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element37.childNodes();
        org.jsoup.nodes.Element element41 = element37.attr("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "\n<hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element41.childNodes();
        org.jsoup.nodes.Element element44 = element41.toggleClass("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element41.lastElementSibling();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!hi!");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValue("<hi! class=\"\">\nhi!\n</hi!>", "<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = element11.siblingIndex();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        document2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(0);
        java.lang.String str14 = document2.html();
        org.jsoup.select.Elements elements15 = document2.parents();
        org.jsoup.select.Elements elements16 = document2.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.lastElementSibling();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        org.jsoup.parser.Tag tag9 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.previousElementSibling();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
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
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element18.siblingElements();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.wrap("<<html> <head> </head> <body> </body> </html>> </<html> <head> </head> <body> </body> </html>>");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.jsoup.select.Elements elements10 = element4.getElementsByAttribute("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element4.childNodes();
        org.jsoup.select.Elements elements13 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element4.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.firstElementSibling();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        java.lang.String str10 = element9.html();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttribute("hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element9.siblingIndex();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element14 = element11.attr("body", "");
        java.lang.String str15 = element11.id();
        org.jsoup.select.Elements elements16 = element11.children();
        org.jsoup.nodes.Element element18 = element11.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.nextSibling();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.nodes.Element element13 = document2.toggleClass("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Node node15 = element13.removeAttr("<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element13.siblingElements();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "#document");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.baseUri();
        java.lang.String str5 = document2.id();
        boolean boolean7 = document2.hasClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.previousSibling();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element13.siblingNodes();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element12.previousSibling();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.outerHtml();
        java.lang.String str4 = document2.id();
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = document2.siblingIndex();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.lastElementSibling();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.nextElementSibling();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element14 = element11.attr("body", "");
        org.jsoup.nodes.Element element16 = element11.prependText("hi!#document");
        java.lang.String str17 = element11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element11.siblingNodes();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("#root");
        boolean boolean14 = element6.hasText();
        org.jsoup.nodes.Element element16 = element6.prepend("");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element6.prependChild((org.jsoup.nodes.Node) document19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
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
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag41, "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node45 = element44.previousSibling();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Element element19 = element17.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element19.siblingElements();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueNot("hi!", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element14 = element3.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.previousElementSibling();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        java.lang.String str6 = document2.data();
        document2.setBaseUri("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str13 = tag12.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        org.jsoup.nodes.Element element18 = document16.empty();
        java.lang.String str19 = element18.id();
        org.jsoup.parser.Tag tag20 = element18.tag();
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag12.canContain(tag20);
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = element29.append("");
        org.jsoup.parser.Tag tag32 = element29.tag();
        java.lang.String str33 = element29.tagName();
        java.lang.String str34 = element29.outerHtml();
        org.jsoup.select.Elements elements36 = element29.getElementsByIndexLessThan((-1));
        java.util.Set<java.lang.String> strSet37 = element29.classNames();
        boolean boolean38 = tag20.equals((java.lang.Object) strSet37);
        org.jsoup.nodes.Element element39 = element10.classNames(strSet37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int40 = element10.siblingIndex();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.nextSibling();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element15 = element12.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element17 = element12.html("<html> \n<head> \n</head> \n<body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>hi!<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.wrap("<html>\n<head>\n</head>\n<body>\n hi!#document&lt;#root #root=&quot;#document&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  hi! \n  </body>\n </html>\n</body>\n</html>hi!#document&lt;#root #root=&quot;#document&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! &lt;/#root&gt;");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str7 = tag6.toString();
        boolean boolean8 = tag6.isBlock();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        document12.setBaseUri("hi!");
        org.jsoup.nodes.Element element16 = document12.empty();
        org.jsoup.nodes.Element element18 = element16.append("");
        org.jsoup.nodes.Element element19 = element16.empty();
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes20);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag1, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes20);
        org.jsoup.nodes.Node node24 = element22.removeAttr("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        java.util.Set<java.lang.String> strSet25 = element22.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element22.lastElementSibling();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        org.jsoup.nodes.Element element16 = element11.attr("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element11.append("\n<<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n&lt;#root&gt;\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element11.nextSibling();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root>\n</#root>", "<#root>");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.removeClass(" body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.nextElementSibling();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element7.siblingElements();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "body");
        java.lang.String str3 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.lastElementSibling();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
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
        org.jsoup.nodes.Element element23 = element21.previousElementSibling();
        org.jsoup.nodes.Element element25 = element21.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str26 = element25.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.text("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element10 = element4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element10.text();
        org.jsoup.nodes.Element element13 = element10.appendElement(" hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element10.nextElementSibling();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByTag("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element17.prepend("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = element17.siblingElements();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Element element8 = element6.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element8.siblingIndex();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String str3 = document2.html();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.lastElementSibling();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
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
        org.jsoup.select.Elements elements34 = element3.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element3.previousElementSibling();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element4.hasText();
        org.jsoup.select.Elements elements18 = element4.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element20 = element4.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element21 = element20.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element20.nextSibling();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
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
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("hi!hi!");
        java.lang.String str24 = element21.val();
        org.jsoup.select.Elements elements25 = element21.children();
        boolean boolean26 = element21.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = element21.siblingIndex();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
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
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = element26.append("");
        org.jsoup.nodes.Element element29 = element28.empty();
        org.jsoup.nodes.Element element31 = element28.append("");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.nodeName();
        org.jsoup.select.Elements elements36 = document34.getAllElements();
        java.lang.String str37 = document34.id();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        org.jsoup.nodes.Element element42 = document34.appendChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Element element44 = document40.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexGreaterThan(10);
        boolean boolean47 = element31.equals((java.lang.Object) 10);
        org.jsoup.nodes.Element element48 = element8.appendChild((org.jsoup.nodes.Node) element31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element48.siblingNodes();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueStarting("hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Element element21 = document15.appendText("hi!");
        org.jsoup.select.Elements elements23 = document15.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element27.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = document15.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element38 = element35.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element40 = element35.append("#document");
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "");
        org.jsoup.nodes.Element element44 = element35.prependChild((org.jsoup.nodes.Node) document43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element35.lastElementSibling();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!hi!", "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        java.lang.String str4 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("body", "\n<body>\nhi!\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element8.nextSibling();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
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
        boolean boolean40 = tag1.isData();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag1, "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element44 = element42.removeClass(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element42.lastElementSibling();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
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
        org.jsoup.select.Elements elements46 = element41.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element48 = element41.prependText("#document<html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element50 = element48.html("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements51 = element50.siblingElements();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.select.Elements elements19 = document14.getElementsByAttributeValueStarting("hi!", "#document");
        boolean boolean20 = element4.equals((java.lang.Object) elements19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element4.nextElementSibling();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element21.append("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element21.firstElementSibling();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.nextSibling();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet25 = element20.classNames();
        org.jsoup.nodes.Element element26 = element4.classNames(strSet25);
        org.jsoup.nodes.Element element28 = element4.prependElement("< > >");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = element4.nextSibling();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        boolean boolean10 = document2.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document2.appendText("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.previousSibling();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        java.lang.String str9 = document2.text();
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>", "<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        org.jsoup.nodes.Element element14 = document2.addClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.previousSibling();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element4.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>hi!#document");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
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
        org.jsoup.nodes.Element element24 = element21.addClass("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element21.append("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element21.wrap("<hi> &lt;#root&gt;  \n</hi>");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean9 = document2.hasAttr("hi!#document");
        org.jsoup.nodes.Element element11 = document2.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element11.getElementsByIndexEquals((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.previousSibling();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
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
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.nodeName();
        org.jsoup.select.Elements elements44 = document42.getAllElements();
        java.util.Set<java.lang.String> strSet45 = document42.classNames();
        org.jsoup.nodes.Element element46 = element18.classNames(strSet45);
        org.jsoup.nodes.Element element48 = element46.toggleClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        element48.setBaseUri("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int51 = element48.siblingIndex();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element6.hasClass("hi!");
        java.lang.String str9 = element6.val();
        java.lang.String str10 = element6.text();
        org.jsoup.nodes.Element element12 = element6.prependText("#root");
        org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValueContaining("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>", "hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element6.siblingIndex();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.prepend("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = element8.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element15 = element13.addClass("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element13.previousSibling();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element3.attr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.siblingNodes();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element20.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.previousElementSibling();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
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
        org.jsoup.select.Elements elements22 = document2.getElementsByAttributeValueEnding("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = document2.siblingElements();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element15.appendText("html");
        java.lang.String str23 = element22.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element22.siblingElements();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.nodes.Element element16 = element14.val("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        java.lang.String str11 = document2.toString();
        org.jsoup.nodes.Element element12 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.text("hi! hi!");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element30.nextSibling();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Element element12 = element9.empty();
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document2.classNames(strSet13);
        org.jsoup.nodes.Element element16 = document2.append("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.append("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element16.prependText("<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.previousElementSibling();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements46 = element41.siblingElements();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean9 = document2.hasClass("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.previousElementSibling();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueNot("hi!", "body");
        org.jsoup.parser.Tag tag16 = element11.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element11.lastElementSibling();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
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
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.parser.Tag tag33 = element30.tag();
        java.lang.String str35 = element30.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements37 = element30.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Element element38 = document2.appendChild((org.jsoup.nodes.Node) element30);
        java.lang.String str39 = element38.tagName();
        java.lang.String str41 = element38.absUrl("body");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        document44.setBaseUri("hi!");
        org.jsoup.nodes.Element element49 = document44.prependText("#document");
        java.lang.String str51 = document44.attr("#document");
        org.jsoup.nodes.Element element53 = document44.prependText("");
        org.jsoup.nodes.Element element54 = element53.empty();
        org.jsoup.select.Elements elements57 = element53.getElementsByAttributeValueNot("hi!", "body");
        java.util.Set<java.lang.String> strSet58 = element53.classNames();
        org.jsoup.nodes.Element element59 = element38.classNames(strSet58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element38.text("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Element element7 = document2.prependText("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element7.siblingElements();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element4.previousSibling();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements8 = document2.getAllElements();
        boolean boolean10 = document2.hasClass("#root");
        java.lang.String str11 = document2.html();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document2.siblingIndex();
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependText("hi!#document");
        boolean boolean16 = element14.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Node node18 = element14.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.getElementById("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element7.toString();
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexEquals((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.siblingNodes();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
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
        org.jsoup.nodes.Element element37 = element33.html("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element37.childNodes();
        org.jsoup.nodes.Element element41 = element37.attr("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element42 = element41.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = element41.previousSibling();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Element element7 = element4.prepend("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean7 = tag1.isEmpty();
        org.jsoup.parser.Tag tag8 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.previousElementSibling();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;amp;lt;&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;amp;lt;/&amp;amp;lt;html&amp;amp;gt; &amp;amp;lt;head&amp;amp;gt; &amp;amp;lt;/head&amp;amp;gt; &amp;amp;lt;body&amp;amp;gt; &amp;amp;lt;/body&amp;amp;gt; &amp;amp;lt;/html&amp;amp;gt;&amp;amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element14.siblingElements();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.append("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.lastElementSibling();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element12.siblingNodes();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
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
        java.lang.String str22 = element17.id();
        java.lang.String str24 = element17.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element17.text("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = element4.children();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node14 = document12.removeAttr("#root");
        java.lang.String str15 = document12.data();
        java.lang.String str16 = document12.toString();
        org.jsoup.nodes.Element element17 = element4.appendChild((org.jsoup.nodes.Node) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.siblingNodes();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        java.lang.String str14 = element12.attr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element12.siblingIndex();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements8 = element6.getElementsByClass("#root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element6.siblingElements();
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str12 = element4.tagName();
        org.jsoup.select.Elements elements13 = element4.parents();
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
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        org.jsoup.nodes.Element element71 = document58.classNames((java.util.Set<java.lang.String>) strSet69);
        org.jsoup.nodes.Element element72 = element32.classNames((java.util.Set<java.lang.String>) strSet69);
        org.jsoup.nodes.Element element73 = element4.classNames((java.util.Set<java.lang.String>) strSet69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int74 = element73.siblingIndex();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.nextElementSibling();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        org.jsoup.select.Elements elements17 = document2.getElementsByAttributeValueEnding("\n<hi!>\n</hi!>", "#document hi!");
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document2.firstElementSibling();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueEnding("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>", " body");
        java.lang.String str10 = element4.absUrl("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.select.Elements elements12 = element4.getElementsByIndexGreaterThan((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element4.siblingNodes();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
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
        org.jsoup.nodes.Element element18 = element13.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
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
        org.jsoup.select.Elements elements46 = element45.children();
        org.jsoup.select.Elements elements47 = element45.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int48 = element45.siblingIndex();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.firstElementSibling();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Element element8 = element4.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = element4.getElementsByAttribute("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html><<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>\n</<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element4.siblingIndex();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document2.classNames((java.util.Set<java.lang.String>) strSet13);
        java.lang.String str16 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document2.previousSibling();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element16 = element8.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Node node18 = element16.removeAttr("hi!hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.siblingNodes();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
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
        org.jsoup.select.Elements elements38 = element17.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int39 = element17.siblingIndex();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        boolean boolean7 = element6.isBlock();
        boolean boolean9 = element6.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.firstElementSibling();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        document2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(0);
        java.lang.String str14 = document2.html();
        org.jsoup.select.Elements elements15 = document2.parents();
        org.jsoup.select.Elements elements16 = document2.parents();
        document2.setBaseUri("<html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document2.previousSibling();
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "#document");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.baseUri();
        java.lang.String str5 = document2.id();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element8 = document2.empty();
        java.lang.String str9 = element8.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.nextElementSibling();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.child(0);
        java.lang.String str8 = document2.data();
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("hi!#document");
        java.lang.String str9 = document2.html();
        java.lang.String str10 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
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
        org.jsoup.select.Elements elements46 = element41.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element48 = element41.prependText("#document<html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.nodes.Element element50 = element41.prepend("<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element41.prependElement(" hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element41.wrap("<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.text("hi!#document");
        org.jsoup.nodes.Element element11 = element4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.nextElementSibling();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "#document");
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag4, "");
        java.lang.String str7 = tag4.toString();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag4, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag10 = tag4.getImplicitParent();
        boolean boolean11 = document2.equals((java.lang.Object) tag10);
        org.jsoup.nodes.Element element13 = document2.appendText("<#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.nodes.Element element11 = element4.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element13.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.previousSibling();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element4.attr("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.lastElementSibling();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        boolean boolean7 = element4.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.nextElementSibling();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.util.Set<java.lang.String> strSet8 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.nextElementSibling();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendElement("body");
        boolean boolean5 = element4.hasText();
        org.jsoup.nodes.Element element6 = element4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
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
        boolean boolean27 = tag1.isData();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element32 = document30.text("hi!");
        org.jsoup.parser.Tag tag33 = document30.tag();
        boolean boolean34 = tag1.canContain(tag33);
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
        org.jsoup.nodes.Element element56 = element51.prepend("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element58 = element56.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.Integer int59 = element56.elementSiblingIndex();
        boolean boolean60 = tag1.equals((java.lang.Object) element56);
        org.jsoup.parser.Tag tag63 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean64 = tag63.isBlock();
        org.jsoup.nodes.Document document68 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList69 = document68.childNodes();
        document68.setBaseUri("hi!");
        org.jsoup.nodes.Element element72 = document68.empty();
        org.jsoup.nodes.Element element74 = document68.appendText("hi!");
        org.jsoup.nodes.Attributes attributes75 = document68.attributes();
        org.jsoup.nodes.Element element76 = new org.jsoup.nodes.Element(tag63, "hi!", attributes75);
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag1, "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;", attributes75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int78 = element77.siblingIndex();
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        java.lang.String str8 = element4.absUrl("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.parser.Tag tag9 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element4.siblingIndex();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element16 = element8.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.previousElementSibling();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements5 = document2.children();
        org.jsoup.nodes.Node node7 = document2.childNode(0);
        java.lang.String str9 = document2.absUrl("<#root>\n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi!\n   </body>\n  </html>");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html> hi!hi! #document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html> #root <hi!>\n<#root>\n</#root>\n</hi!> <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document2.nextSibling();
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
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
        org.jsoup.select.Elements elements23 = document2.getAllElements();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str27 = document26.nodeName();
        org.jsoup.select.Elements elements28 = document26.getAllElements();
        java.lang.String str29 = document26.id();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = document32.childNodes();
        org.jsoup.nodes.Element element34 = document26.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element42 = document32.appendChild((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element47 = document45.text("hi!");
        org.jsoup.nodes.Element element49 = element47.text("hi!");
        org.jsoup.select.Elements elements51 = element47.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element53 = element47.appendText("hi!");
        org.jsoup.nodes.Element element56 = element47.attr("#root", "#document");
        org.jsoup.nodes.Element element58 = element47.appendElement("#root");
        org.jsoup.nodes.Element element59 = element58.empty();
        org.jsoup.nodes.Attributes attributes60 = element59.attributes();
        org.jsoup.nodes.Element element62 = element59.appendElement("hi!");
        element42.replaceWith((org.jsoup.nodes.Node) element62);
        org.jsoup.nodes.Element element65 = element42.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document68 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList72 = document71.childNodes();
        document71.setBaseUri("hi!");
        org.jsoup.nodes.Element element75 = document71.empty();
        org.jsoup.nodes.Element element77 = element75.append("");
        org.jsoup.nodes.Element element78 = element75.empty();
        java.util.Set<java.lang.String> strSet79 = element78.classNames();
        org.jsoup.nodes.Element element80 = document68.classNames(strSet79);
        org.jsoup.nodes.Element element83 = element80.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element84 = element42.appendChild((org.jsoup.nodes.Node) element80);
        org.jsoup.select.Elements elements86 = element42.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element88 = element42.removeClass("#document ");
        java.util.Set<java.lang.String> strSet89 = element42.classNames();
        org.jsoup.nodes.Element element90 = document2.classNames(strSet89);
        java.lang.String str91 = element90.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element92 = element90.lastElementSibling();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element7.attr("hi!hi!", "#root");
        org.jsoup.select.Elements elements16 = element7.getElementsByAttribute("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element7.firstElementSibling();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element15 = document13.text("hi!");
        boolean boolean16 = element15.isBlock();
        boolean boolean17 = element15.hasText();
        org.jsoup.parser.Tag tag18 = element15.tag();
        element15.setBaseUri("#root");
        org.jsoup.nodes.Element element22 = element15.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element15.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
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
        org.jsoup.select.Elements elements68 = element66.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList72 = document71.childNodes();
        document71.setBaseUri("hi!");
        org.jsoup.nodes.Element element75 = document71.empty();
        org.jsoup.nodes.Element element77 = document71.appendText("hi!");
        org.jsoup.select.Elements elements79 = document71.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag81 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element(tag81, "");
        java.lang.String[] strArray86 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet87 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet87, strArray86);
        org.jsoup.nodes.Element element89 = element83.classNames((java.util.Set<java.lang.String>) strSet87);
        org.jsoup.nodes.Element element90 = document71.classNames((java.util.Set<java.lang.String>) strSet87);
        org.jsoup.nodes.Element element91 = element66.classNames((java.util.Set<java.lang.String>) strSet87);
        org.jsoup.nodes.Element element92 = element24.classNames((java.util.Set<java.lang.String>) strSet87);
        org.jsoup.nodes.Element element93 = element9.classNames((java.util.Set<java.lang.String>) strSet87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element95 = element93.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root class=\" #root\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.prependElement("hi!");
        java.lang.String str18 = element17.val();
        org.jsoup.nodes.Element element20 = element17.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean23 = element17.isBlock();
        org.jsoup.nodes.Attributes attributes24 = element17.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", attributes24);
        boolean boolean27 = element25.hasAttr("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        org.jsoup.select.Elements elements28 = element25.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element25.siblingNodes();
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
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
        org.jsoup.select.Elements elements21 = element11.getElementsByTag("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element11.previousSibling();
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Element element7 = element4.html("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.previousElementSibling();
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
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
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str24 = tag23.toString();
        org.jsoup.parser.Tag tag25 = tag23.getImplicitParent();
        boolean boolean26 = tag25.preserveWhitespace();
        boolean boolean27 = tag25.isInline();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element35 = document30.prependText("#document");
        boolean boolean36 = tag25.equals((java.lang.Object) "#document");
        boolean boolean37 = tag25.isData();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        org.jsoup.nodes.Element element43 = document41.empty();
        java.lang.String str44 = element43.val();
        org.jsoup.nodes.Attributes attributes45 = element43.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag25, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes45);
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag10, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", attributes45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements48 = element47.siblingElements();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.previousElementSibling();
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.parser.Tag tag15 = element12.tag();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element29 = document23.appendText("hi!");
        org.jsoup.nodes.Attributes attributes30 = document23.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag18, "hi!", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag15, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes30);
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueEnding("<html> <head> </head> <body> hi! </body> </html>", "hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
        boolean boolean37 = element32.hasAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = element32.previousSibling();
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        org.jsoup.nodes.Attributes attributes7 = element6.attributes();
        org.jsoup.nodes.Element element8 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.lastElementSibling();
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int30 = element29.siblingIndex();
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
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
        org.jsoup.select.Elements elements46 = element45.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element45.nextElementSibling();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
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
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element25 = document23.text("hi!");
        org.jsoup.nodes.Element element27 = element25.text("hi!");
        org.jsoup.select.Elements elements29 = element25.getElementsByAttribute("hi!");
        java.lang.String str31 = element25.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = element25.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element34 = element11.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element36 = element11.html("&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element36.wrap("<html>\n<head>\n</head>\n<body>\n &amp;lt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &amp;lt;/&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet25 = element20.classNames();
        org.jsoup.nodes.Element element26 = element4.classNames(strSet25);
        org.jsoup.nodes.Element element28 = element4.append("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements31 = element4.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        java.lang.String str32 = element4.text();
        org.jsoup.nodes.Element element34 = element4.appendText("<hi!>\n</hi!>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element34.previousElementSibling();
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        boolean boolean6 = element4.isBlock();
        org.jsoup.nodes.Element element9 = element4.attr("<#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element9.siblingElements();
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        boolean boolean9 = document2.hasAttr("hi!#document");
        org.jsoup.nodes.Element element11 = document2.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str12 = document2.nodeName();
        java.lang.String str13 = document2.html();
        java.lang.String str14 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document2.siblingIndex();
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
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
        boolean boolean27 = tag1.isData();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element33 = document31.text("hi!");
        org.jsoup.nodes.Element element35 = element33.text("hi!");
        boolean boolean37 = element33.hasClass("#document");
        boolean boolean38 = element33.hasText();
        org.jsoup.select.Elements elements41 = element33.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str42 = element33.outerHtml();
        org.jsoup.nodes.Element element44 = element33.toggleClass("");
        org.jsoup.nodes.Attributes attributes45 = element33.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes45);
        java.lang.String str48 = element46.absUrl("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;hi!&amp;gt; &amp;lt;#root&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;/hi!&amp;gt;");
        org.jsoup.nodes.Node node50 = element46.removeAttr("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi>&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements51 = element46.siblingElements();
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet5 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.firstElementSibling();
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        java.lang.String str15 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element4.hasText();
        org.jsoup.select.Elements elements18 = element4.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element20 = element4.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str21 = element20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.nextElementSibling();
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element10 = element4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements14 = element10.getElementsByClass("<hi!> </hi!><html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element10.nextSibling();
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Element element19 = element17.appendElement("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element17.siblingNodes();
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.previousSibling();
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element12 = document2.prependText("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.prependElement("hi!");
        java.lang.String str18 = element17.val();
        org.jsoup.nodes.Element element20 = element17.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element17.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean23 = element17.isBlock();
        org.jsoup.nodes.Attributes attributes24 = element17.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", attributes24);
        boolean boolean27 = element25.hasAttr("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
        org.jsoup.select.Elements elements28 = element25.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element25.wrap("<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!<#root>\n</#root>\n</#root>");
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi!hi!");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.toggleClass("\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;\">\n<&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!>\n</&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!><hi class=\"#document \" document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n #root#document \n</hi>\n</body>");
        java.lang.String str13 = element12.html();
        org.jsoup.nodes.Element element15 = element12.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!&lt;\n<html> \n<head> \n</head> \n<body>  &gt;  \n <head> \n </head> \n <body>  &gt;\n </body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.previousElementSibling();
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
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
        java.lang.String str24 = element21.val();
        org.jsoup.nodes.Node node26 = element21.removeAttr("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = node26.siblingIndex();
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexEquals((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.wrap("#document \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi!>\n<#root>\n</#root>\n</hi!>");
        java.lang.String str7 = element6.id();
        boolean boolean8 = element6.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.lastElementSibling();
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.nextSibling();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Element element17 = element15.addClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element17.previousSibling();
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag13.isValidParent(tag15);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "#document");
        boolean boolean19 = element18.isBlock();
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element20.lastElementSibling();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.append("hi!hi!");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        org.jsoup.select.Elements elements10 = element8.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element4.wrap(" <html>\n<head>\n</head>\n<body> &lt;\n <html> \n  <head> \n  </head> \n  <body>  &gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
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
        org.jsoup.nodes.Element element22 = element20.appendElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
        org.jsoup.nodes.Element element24 = element20.append(" body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element24.text("");
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
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
        java.lang.String str40 = element18.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element18.previousElementSibling();
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
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
        boolean boolean37 = element35.hasClass("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>");
        org.jsoup.nodes.Element element38 = element35.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = element35.nextSibling();
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><hi> \n</hi>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>\n  hi!    \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag17 = element16.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.lastElementSibling();
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        boolean boolean10 = element9.isBlock();
        boolean boolean11 = element9.hasText();
        org.jsoup.parser.Tag tag12 = element9.tag();
        org.jsoup.select.Elements elements14 = element9.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element9.children();
        org.jsoup.select.Elements elements17 = element9.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element18 = document2.prependChild((org.jsoup.nodes.Node) element9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = document2.siblingIndex();
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements16 = element4.parents();
        org.jsoup.select.Elements elements18 = element4.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str19 = element4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element4.previousElementSibling();
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        org.jsoup.nodes.Element element8 = document2.addClass("");
        org.jsoup.nodes.Element element10 = document2.removeClass("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
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
        org.jsoup.select.Elements elements18 = document2.getElementsByAttribute("\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.firstElementSibling();
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node18.nextSibling();
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
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
        java.lang.Integer int21 = element20.elementSiblingIndex();
        java.lang.String str22 = element20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = element20.siblingIndex();
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element4.previousSibling();
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.appendElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element11.toggleClass("#root");
        org.jsoup.nodes.Element element19 = element17.prependText("<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element17.siblingIndex();
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str10 = element4.data();
        org.jsoup.select.Elements elements13 = element4.getElementsByAttributeValueEnding("\n<html>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = element4.siblingIndex();
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node45 = element41.previousSibling();
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element4.previousSibling();
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.firstElementSibling();
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! <html> <head> </head> <body> hi! </body> </html>", "hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
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
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document30.empty();
        org.jsoup.nodes.Element element36 = document30.appendText("hi!");
        org.jsoup.nodes.Attributes attributes37 = document30.attributes();
        document30.setBaseUri("#document");
        org.jsoup.select.Elements elements41 = document30.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element43 = document30.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements44 = document30.getAllElements();
        org.jsoup.nodes.Attributes attributes45 = document30.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "#root", attributes45);
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValue("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet50 = element46.classNames();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = document53.childNodes();
        org.jsoup.nodes.Element element55 = document53.empty();
        java.lang.String str56 = element55.id();
        java.lang.String str57 = element55.text();
        org.jsoup.nodes.Element element59 = element55.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element46.appendChild((org.jsoup.nodes.Node) element59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element46.firstElementSibling();
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
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
        org.jsoup.nodes.Element element18 = element16.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValue("#document \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element16.text("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.siblingNodes();
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element13.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = element13.prepend("hi!hi!");
        org.jsoup.nodes.Element element25 = element23.prependText("<html> \n<head> \n</head> \n<body> \n <html> \n  <head> \n  </head> \n  <body>    \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = element25.siblingIndex();
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int14 = element11.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueContaining("hi!hi!<hi!> <#root> <html> <head> </head> <body> hi! </body> </html> </#root> </hi!>", " <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element11.previousSibling();
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
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
        org.jsoup.nodes.Element element66 = element59.val("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element67 = element66.nextElementSibling();
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((int) '4');
        org.jsoup.select.Elements elements16 = element12.getElementsByAttribute("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element12.siblingNodes();
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
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
        org.jsoup.nodes.Element element22 = element8.attr("<hi! class=\"\">\nhi!\n</hi!>", "");
        java.lang.String str23 = element8.nodeName();
        org.jsoup.nodes.Element element24 = element8.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element8.text("<hi! class=\"\">\nhi!\n</hi!>");
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueStarting("hi!", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        document15.setBaseUri("hi!");
        org.jsoup.nodes.Element element19 = document15.empty();
        org.jsoup.nodes.Element element21 = document15.appendText("hi!");
        org.jsoup.select.Elements elements23 = document15.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element27.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = document15.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element38 = element35.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document41.childNodes();
        document41.setBaseUri("hi!");
        org.jsoup.nodes.Element element45 = document41.empty();
        org.jsoup.nodes.Element element47 = element45.append("");
        org.jsoup.parser.Tag tag48 = element45.tag();
        org.jsoup.nodes.Element element50 = element45.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean51 = element38.equals((java.lang.Object) element50);
        java.lang.String str52 = element50.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node53 = element50.previousSibling();
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi!hi!");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document2.addClass("<html>\n<head>\n</head>\n<body>\n &amp;lt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &amp;lt;/&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.prependElement("<hi!#document>\n&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</hi!#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element12.siblingNodes();
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element4.hasText();
        boolean boolean17 = element4.hasText();
        org.jsoup.nodes.Element element19 = element4.appendText("<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        document22.setBaseUri("hi!");
        org.jsoup.nodes.Element element26 = document22.empty();
        org.jsoup.nodes.Element element28 = document22.appendText("hi!");
        org.jsoup.nodes.Attributes attributes29 = document22.attributes();
        document22.setBaseUri("#document");
        org.jsoup.select.Elements elements33 = document22.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element35 = document22.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = element19.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements38 = element36.getElementsByIndexLessThan(10);
        boolean boolean39 = element36.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node40 = element36.nextSibling();
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element67 = element13.lastElementSibling();
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Node node7 = element4.removeAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.siblingNodes();
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = element4.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.nextElementSibling();
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document2.previousElementSibling();
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = document2.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes11 = element4.attributes();
        org.jsoup.parser.Tag tag12 = element4.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str17 = tag12.toString();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag20.isValidParent(tag22);
        boolean boolean24 = tag22.isBlock();
        boolean boolean26 = tag22.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag22, "#document");
        java.lang.String str29 = tag22.getName();
        boolean boolean30 = tag22.isInline();
        java.lang.String str31 = tag22.getName();
        java.lang.String str32 = tag22.toString();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element38 = document36.text("hi!");
        org.jsoup.nodes.Element element40 = element38.text("hi!");
        org.jsoup.select.Elements elements41 = element38.parents();
        org.jsoup.nodes.Element element43 = element38.toggleClass("#root");
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element48 = document46.text("hi!");
        org.jsoup.nodes.Element element50 = element48.text("hi!");
        boolean boolean52 = element48.hasClass("#document");
        boolean boolean53 = element48.hasText();
        org.jsoup.nodes.Element element55 = element48.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element56 = element43.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element58 = element43.addClass("hi!#document");
        org.jsoup.nodes.Attributes attributes59 = element43.attributes();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag22, "<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", attributes59);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag12, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int62 = element61.siblingIndex();
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
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
        org.jsoup.nodes.Node node22 = element9.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag23 = element9.tag();
        java.lang.String str24 = element9.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element9.nextElementSibling();
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
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
        java.lang.String str18 = document2.baseUri();
        java.lang.String str20 = document2.absUrl("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document2.previousElementSibling();
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String str3 = document2.html();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document2.siblingElements();
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str12 = element11.baseUri();
        java.lang.String str13 = element11.toString();
        java.lang.String str15 = element11.absUrl("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element17 = element11.addClass("hi!#document");
        java.lang.String str18 = element11.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element11.wrap("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements16 = element4.children();
        java.lang.String str17 = element4.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element4.lastElementSibling();
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.previousSibling();
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
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
        org.jsoup.nodes.Element element29 = element11.toggleClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.nextElementSibling();
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag11 = element8.tag();
        element8.setBaseUri(" body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.nextElementSibling();
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
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
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.parser.Tag tag33 = element30.tag();
        java.lang.String str35 = element30.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements37 = element30.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Element element38 = document2.appendChild((org.jsoup.nodes.Node) element30);
        java.lang.String str39 = element38.tagName();
        java.lang.String str41 = element38.absUrl("body");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        document44.setBaseUri("hi!");
        org.jsoup.nodes.Element element49 = document44.prependText("#document");
        java.lang.String str51 = document44.attr("#document");
        org.jsoup.nodes.Element element53 = document44.prependText("");
        org.jsoup.nodes.Element element54 = element53.empty();
        org.jsoup.select.Elements elements57 = element53.getElementsByAttributeValueNot("hi!", "body");
        java.util.Set<java.lang.String> strSet58 = element53.classNames();
        org.jsoup.nodes.Element element59 = element38.classNames(strSet58);
        java.lang.String str60 = element59.text();
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element65 = document63.text("hi!");
        boolean boolean66 = element65.isBlock();
        boolean boolean67 = element65.hasText();
        org.jsoup.parser.Tag tag68 = element65.tag();
        org.jsoup.nodes.Element element70 = element65.addClass("");
        org.jsoup.parser.Tag tag71 = element65.tag();
        org.jsoup.nodes.Element element73 = element65.append("body");
        org.jsoup.select.Elements elements76 = element73.getElementsByAttributeValue("#root", "#document hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList77 = element73.childNodes();
        java.util.Set<java.lang.String> strSet78 = element73.classNames();
        org.jsoup.nodes.Element element79 = element59.classNames(strSet78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element81 = element79.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "body");
        java.lang.String str3 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document2.siblingElements();
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#document hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.nextSibling();
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
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
        org.jsoup.nodes.Element element21 = element8.prepend("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements23 = element8.getElementsByIndexLessThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element8.wrap("<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.val();
        org.jsoup.nodes.Element element19 = element17.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element19.siblingElements();
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
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
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexEquals((int) (byte) 100);
        java.lang.String str44 = element41.val();
        boolean boolean45 = element41.isBlock();
        org.jsoup.nodes.Element element48 = element41.attr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root class=\" #root\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element48.previousElementSibling();
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
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
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document30.empty();
        org.jsoup.nodes.Element element36 = document30.appendText("hi!");
        org.jsoup.nodes.Attributes attributes37 = document30.attributes();
        document30.setBaseUri("#document");
        org.jsoup.select.Elements elements41 = document30.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element43 = document30.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements44 = document30.getAllElements();
        org.jsoup.nodes.Attributes attributes45 = document30.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "#root", attributes45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element46.previousElementSibling();
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Element element12 = element9.empty();
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document2.classNames(strSet13);
        org.jsoup.nodes.Element element16 = document2.append("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document2.wrap("\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueNot("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        java.lang.String str15 = element8.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.lastElementSibling();
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }
}

