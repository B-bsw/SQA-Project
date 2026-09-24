package org.jsoup.nodes;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str11 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("head");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        org.jsoup.select.Elements elements10 = document1.select("#root");
        boolean boolean11 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.lastElementSibling();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        org.jsoup.nodes.Element element8 = document1.appendElement("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = document1.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.lastElementSibling();
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        boolean boolean13 = document1.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        java.lang.String str19 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.nodes.Element element23 = document17.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.baseUri();
        org.jsoup.select.Elements elements28 = document25.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element30 = document25.val("");
        org.jsoup.nodes.Node node32 = document25.removeAttr("#root");
        boolean boolean33 = document17.equals((java.lang.Object) node32);
        java.lang.String str34 = document17.data();
        org.jsoup.nodes.Attributes attributes35 = document17.attributes();
        java.lang.String str36 = document17.outerHtml();
        org.jsoup.nodes.Element element38 = document17.createElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean39 = element38.hasText();
        org.jsoup.nodes.Element element40 = document1.appendChild((org.jsoup.nodes.Node) element38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = element40.nextSibling();
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        org.jsoup.nodes.Element element7 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.siblingNodes();
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Element element4 = document1.removeClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = element4.toggleClass("hi! <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element4.siblingNodes();
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = element27.previousSibling();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document8.siblingIndex();
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.nodes.Element element11 = document1.append("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.body();
        org.jsoup.nodes.Element element13 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.siblingNodes();
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element4.siblingNodes();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = element6.val("#root");
        org.jsoup.nodes.Element element10 = element6.toggleClass("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.previousElementSibling();
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
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
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Attributes attributes16 = document1.attributes();
        org.jsoup.nodes.Element element18 = document1.toggleClass("<#root>");
        java.lang.String str20 = element18.absUrl("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element18.siblingElements();
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Node node6 = document1.removeAttr("#document");
        boolean boolean8 = document1.hasClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element10 = document1.createElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.previousElementSibling();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean11 = document1.hasClass("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = element6.nextSibling();
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        boolean boolean5 = element4.hasText();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.html("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.nextSibling();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element11 = document1.val("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str12 = element11.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element11.previousSibling();
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.tagName();
        java.lang.Integer int9 = element7.elementSiblingIndex();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueStarting("<#root> #root", "#document");
        org.jsoup.nodes.Element element14 = element7.removeClass("");
        org.jsoup.nodes.Element element16 = element7.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element7.siblingElements();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        document1.setBaseUri("#root");
        boolean boolean8 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document1.siblingIndex();
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element12 = element9.attr("#document", "#document");
        boolean boolean13 = element9.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.lastElementSibling();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str7 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element7 = document1.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("");
        org.jsoup.nodes.Element element12 = element9.attr("#document", "#document");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element9.siblingNodes();
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        java.lang.String str11 = element5.baseUri();
        org.jsoup.nodes.Element element13 = element5.prepend("<#root>\n</#root>");
        java.lang.String str14 = element5.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element5.previousElementSibling();
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexEquals((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        element5.setBaseUri("#document hi!");
        org.jsoup.select.Elements elements14 = element5.getElementsByClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element5.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element5.nextElementSibling();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element5 = document1.appendElement("#document");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        org.jsoup.nodes.Element element9 = element7.html("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.previousElementSibling();
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element15 = document12.attr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!", "\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.html("<#root> #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean2 = document1.hasText();
        java.lang.String str4 = document1.absUrl("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document6.val("");
        org.jsoup.nodes.Element element13 = element11.removeClass("");
        org.jsoup.nodes.Element element15 = element11.removeClass("#root");
        org.jsoup.nodes.Element element16 = document1.appendChild((org.jsoup.nodes.Node) element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element16.siblingElements();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
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
        java.lang.String str17 = element16.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element16.previousSibling();
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str11 = document1.title();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexEquals(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("#document hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.nodes.Element element13 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.siblingNodes();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
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
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.select.Elements elements17 = document15.getElementsByIndexGreaterThan(0);
        java.lang.String str18 = document15.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document15.previousSibling();
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document1.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("#document");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str11 = document1.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document1.siblingNodes();
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValue("#document", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element6.lastElementSibling();
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        boolean boolean7 = element3.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Element element14 = document9.removeClass("hi!");
        java.lang.String str15 = element14.id();
        java.lang.String str16 = element14.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document18.hasClass("hi!");
        boolean boolean22 = document18.hasClass("hi!");
        java.lang.String str23 = document18.outerHtml();
        boolean boolean24 = document18.hasText();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        java.lang.String str27 = document26.baseUri();
        org.jsoup.select.Elements elements29 = document26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element31 = document26.val("");
        org.jsoup.nodes.Element element33 = element31.removeClass("");
        org.jsoup.nodes.Element element35 = element31.removeClass("#root");
        java.util.Set<java.lang.String> strSet36 = element31.classNames();
        org.jsoup.nodes.Element element37 = document18.classNames(strSet36);
        org.jsoup.nodes.Element element38 = element14.classNames(strSet36);
        org.jsoup.nodes.Element element39 = element3.classNames(strSet36);
        java.lang.String str40 = element39.text();
        element39.setBaseUri("<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements43 = element39.siblingElements();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        java.lang.String str8 = element7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element7.siblingNodes();
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document15.text("<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements10 = element3.getElementsByTag("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str11 = element3.toString();
        org.jsoup.nodes.Element element13 = element3.val("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element3.nextElementSibling();
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
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
        org.jsoup.parser.Tag tag20 = element19.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.firstElementSibling();
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = document1.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean14 = document1.hasText();
        java.lang.String str15 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = document1.siblingElements();
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan(100);
        boolean boolean12 = document1.isBlock();
        java.lang.String str13 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.wrap("<html> \n<head> \n</head> \n<body>\n #root\n</body>\n</html>");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element5 = document1.appendElement("#document");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.wrap("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element13 = document9.head();
        org.jsoup.select.Elements elements16 = document9.getElementsByAttributeValueNot("<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html><#root value=\"\" class=\"\">\n  </#root>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title("\n<#root>\n hi!hi!\n</#root>");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueStarting("\n <hi!>\n </hi!>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexEquals((int) (short) 0);
        java.lang.String str15 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("hi!hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        org.jsoup.nodes.Element element5 = document1.prependElement("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.firstElementSibling();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document1.previousSibling();
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
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
        org.jsoup.select.Elements elements15 = element3.getAllElements();
        org.jsoup.nodes.Element element17 = element3.val("");
        java.lang.String str18 = element3.tagName();
        org.jsoup.nodes.Element element20 = element3.append("#document");
        org.jsoup.nodes.Element element22 = element3.val("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element3.siblingNodes();
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = document1.append("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        java.lang.String str24 = document16.data();
        org.jsoup.nodes.Document document25 = document16.normalise();
        document25.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet28 = document25.classNames();
        org.jsoup.nodes.Element element29 = document1.classNames(strSet28);
        org.jsoup.nodes.Element element30 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements31 = document1.siblingElements();
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexEquals((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.nextSibling();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
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
        java.lang.String str15 = element14.baseUri();
        java.lang.String str16 = element14.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element14.previousSibling();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.className();
        org.jsoup.nodes.Attributes attributes12 = document10.attributes();
        java.util.Set<java.lang.String> strSet13 = document10.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document10.previousSibling();
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document11.hasClass("hi!");
        boolean boolean15 = document11.hasClass("hi!");
        java.lang.String str16 = document11.outerHtml();
        boolean boolean17 = document11.hasText();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.baseUri();
        org.jsoup.select.Elements elements22 = document19.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element24 = document19.val("");
        org.jsoup.nodes.Element element26 = element24.removeClass("");
        org.jsoup.nodes.Element element28 = element24.removeClass("#root");
        java.util.Set<java.lang.String> strSet29 = element24.classNames();
        org.jsoup.nodes.Element element30 = document11.classNames(strSet29);
        org.jsoup.nodes.Element element31 = element6.classNames(strSet29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements32 = element6.siblingElements();
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.previousSibling();
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.head();
        org.jsoup.nodes.Element element14 = document1.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document1.previousSibling();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Node node12 = document7.removeAttr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document7.siblingNodes();
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
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
        java.lang.String str21 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        java.lang.String str15 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
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
        org.jsoup.nodes.Element element30 = document1.removeClass("#root");
        org.jsoup.nodes.Element element32 = element30.child((int) (short) 1);
        org.jsoup.nodes.Element element34 = element30.prependText("hi! <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element34.siblingNodes();
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("#root");
        org.jsoup.nodes.Element element10 = document1.prepend("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean13 = document12.hasText();
        java.lang.String str15 = document12.absUrl("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.lang.String str18 = document17.baseUri();
        org.jsoup.select.Elements elements20 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element22 = document17.val("");
        org.jsoup.nodes.Element element24 = element22.removeClass("");
        org.jsoup.nodes.Element element26 = element22.removeClass("#root");
        org.jsoup.nodes.Element element27 = document12.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = element26.append("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean30 = document1.equals((java.lang.Object) "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = document1.wrap("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Document document9 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#document hi!>\n</#document hi!>");
        boolean boolean2 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document1.siblingElements();
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element7.nextSibling();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.jsoup.nodes.Element element16 = document1.addClass("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element18 = document1.appendText("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n &lt;#root&gt;  \n <html> \n  <head> \n   <title>&lt;#root&gt;\n&lt;/#root&gt;\n</title>\n  </head> \n  <body>\n    #document  \n  </body>\n </html>#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document1.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document1.siblingElements();
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        java.lang.String str6 = document1.html();
        java.lang.String str7 = document1.text();
        org.jsoup.nodes.Element element9 = document1.append("hi! <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.siblingNodes();
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.prependText("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element6.previousElementSibling();
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
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
        org.jsoup.nodes.Element element19 = element17.val("<#document hi!>\n</#document hi!>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueNot("<#root> #root", "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element19.lastElementSibling();
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.prependElement("#document hi!");
        org.jsoup.nodes.Element element11 = document1.html("hi!\n<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document7 = document1.normalise();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.nextSibling();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        document1.title("");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Node node23 = document16.removeAttr("#root");
        java.lang.String str24 = document16.data();
        org.jsoup.nodes.Document document25 = document16.normalise();
        document25.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet28 = document25.classNames();
        org.jsoup.nodes.Element element29 = document1.classNames(strSet28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.firstElementSibling();
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
        org.jsoup.select.Elements elements16 = document9.getElementsByTag("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = document9.attr("hi!hi!");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean22 = document20.hasClass("hi!");
        boolean boolean24 = document20.hasClass("hi!");
        org.jsoup.nodes.Element element26 = document20.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = element26.appendText("");
        org.jsoup.select.Elements elements30 = element28.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements33 = element28.getElementsByAttributeValue("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean34 = document9.equals((java.lang.Object) "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.select.Elements elements36 = document9.getElementsByIndexEquals(0);
        java.lang.String str37 = document9.id();
        org.jsoup.nodes.Element element39 = document9.createElement("<#root>\n<#root>\n</#root>\n<html>\n <head>\n </head>\n <body>\n  #document\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element40 = element39.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element39.nextElementSibling();
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document10.hasClass("hi!");
        java.lang.String str13 = document10.className();
        org.jsoup.nodes.Element element15 = document10.html("");
        org.jsoup.nodes.Document document16 = document10.normalise();
        org.jsoup.select.Elements elements19 = document10.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements22 = document10.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document7.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements24 = element23.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.nextElementSibling();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        document10.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet13 = document10.classNames();
        org.jsoup.select.Elements elements16 = document10.getElementsByAttributeValueEnding("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document10.siblingNodes();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        org.jsoup.nodes.Element element16 = document1.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.select.Elements elements12 = element6.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element6.addClass("#root");
        java.lang.String str15 = element6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element6.previousElementSibling();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
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
        org.jsoup.nodes.Element element20 = document8.body();
        boolean boolean22 = document8.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document8.siblingNodes();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        java.lang.String str12 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.nodes.Element element16 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document17 = document10.normalise();
        org.jsoup.nodes.Element element19 = document10.text("#document");
        document10.title("<#root>\n</#root>");
        java.lang.String str22 = document10.html();
        org.jsoup.nodes.Element element23 = element3.prependChild((org.jsoup.nodes.Node) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element9.nextSibling();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = element7.prepend("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element9.siblingElements();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element10 = document1.parent();
        java.lang.String str12 = document1.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str13 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document1.siblingIndex();
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.val();
        java.lang.String str6 = document1.absUrl("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>hi! &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        java.lang.String str4 = document3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document3.nextSibling();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str3 = document1.absUrl("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        boolean boolean5 = document1.hasAttr("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
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
        java.lang.String str28 = document20.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document20.text("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
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
        org.jsoup.select.Elements elements17 = document1.children();
        java.lang.String str19 = document1.absUrl("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element21 = document1.html("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element23 = element21.removeClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element21.siblingElements();
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.parser.Tag tag13 = document1.tag();
        java.lang.String str14 = document1.outerHtml();
        java.lang.String str16 = document1.absUrl("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.nextElementSibling();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.text("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.nextElementSibling();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Node node6 = document1.removeAttr("#document");
        boolean boolean8 = document1.hasClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element10 = document1.createElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document1.siblingIndex();
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.prependElement("#document hi!");
        org.jsoup.nodes.Element element11 = document1.html("hi!\n<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document1.siblingNodes();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str2 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.firstElementSibling();
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = element3.previousSibling();
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element12 = document7.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document7.nextElementSibling();
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.prependText("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.previousSibling();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
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
        org.jsoup.nodes.Document document15 = document1.normalise();
        java.lang.String str16 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.wrap("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        org.jsoup.nodes.Element element14 = element10.appendElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element10.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element10.previousSibling();
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document4.nextSibling();
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        boolean boolean7 = element3.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Element element14 = document9.removeClass("hi!");
        java.lang.String str15 = element14.id();
        java.lang.String str16 = element14.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document18.hasClass("hi!");
        boolean boolean22 = document18.hasClass("hi!");
        java.lang.String str23 = document18.outerHtml();
        boolean boolean24 = document18.hasText();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        java.lang.String str27 = document26.baseUri();
        org.jsoup.select.Elements elements29 = document26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element31 = document26.val("");
        org.jsoup.nodes.Element element33 = element31.removeClass("");
        org.jsoup.nodes.Element element35 = element31.removeClass("#root");
        java.util.Set<java.lang.String> strSet36 = element31.classNames();
        org.jsoup.nodes.Element element37 = document18.classNames(strSet36);
        org.jsoup.nodes.Element element38 = element14.classNames(strSet36);
        org.jsoup.nodes.Element element39 = element3.classNames(strSet36);
        org.jsoup.nodes.Element element40 = element3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements41 = element3.siblingElements();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        org.jsoup.nodes.Element element11 = document1.html("hi!hi!");
        org.jsoup.nodes.Element element13 = document1.wrap("hi!");
        java.lang.String str14 = document1.title();
        org.jsoup.nodes.Element element16 = document1.prepend("#document hi!");
        java.lang.String str17 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document1.siblingNodes();
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
        org.jsoup.nodes.Element element33 = element18.html("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element35 = element18.addClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element35.wrap("<html>\n<head>\n</head>\n<body> hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element2 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element23.siblingElements();
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.children();
        org.jsoup.nodes.Element element14 = document1.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("#document hi!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
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
        org.jsoup.nodes.Element element27 = document8.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document8.title("<#root> hi!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.parser.Tag tag10 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document1.siblingNodes();
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
        org.jsoup.nodes.Element element21 = document7.prepend("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.lastElementSibling();
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.appendText("");
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Element element9 = element6.appendText("<html> \n<head> \n</head> \n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.addClass("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.lastElementSibling();
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.parent();
        org.jsoup.nodes.Element element11 = document1.createElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = document1.siblingIndex();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Element element9 = element6.toggleClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element6.siblingIndex();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = document1.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html><#root value=\"\" class=\"\">\n  </#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
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
        org.jsoup.nodes.Element element30 = document1.val("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#document hi!>\n</#document hi!>");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
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
        org.jsoup.nodes.Element element19 = element16.prependText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element16.val("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element16.nextSibling();
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexLessThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element12.siblingElements();
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str7 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html><#root value=\"\" class=\"\">\n  </#root>");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element8 = document1.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document1.siblingIndex();
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        java.lang.String str3 = document1.absUrl("#document");
        org.jsoup.nodes.Element element5 = document1.append("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = element5.nextSibling();
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        boolean boolean6 = element5.hasText();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        java.lang.String str11 = document8.title();
        org.jsoup.nodes.Element element13 = document8.removeClass("hi!");
        org.jsoup.nodes.Element element15 = element13.removeClass("");
        org.jsoup.nodes.Element element17 = element13.removeClass("#root");
        java.lang.Integer int18 = element17.elementSiblingIndex();
        java.lang.String str20 = element17.absUrl("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element21 = element5.prependChild((org.jsoup.nodes.Node) element17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element21.siblingIndex();
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.prependElement("<#root>\n</#root>");
        java.lang.String str8 = element7.id();
        org.jsoup.nodes.Element element10 = element7.prepend("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element7.prependText("#root");
        element12.remove();
        org.jsoup.nodes.Element element15 = element12.html("<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        boolean boolean8 = document1.isBlock();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.appendText("");
        java.lang.String str13 = document10.title();
        org.jsoup.nodes.Node node15 = document10.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet16 = document10.classNames();
        java.util.Set<java.lang.String> strSet17 = document10.classNames();
        org.jsoup.nodes.Element element18 = document1.classNames(strSet17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
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
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueEnding("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "#root");
        org.jsoup.select.Elements elements27 = element23.siblingElements();
        element23.remove();
        org.jsoup.nodes.Element element29 = element23.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int30 = element23.siblingIndex();
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element4 = document1.attr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!", "\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.util.Set<java.lang.String> strSet8 = element6.classNames();
        org.jsoup.nodes.Element element10 = element6.html("<#root> #root");
        org.jsoup.select.Elements elements11 = element10.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element10.siblingElements();
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.nodes.Element element5 = document1.parent();
        java.lang.String str6 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.val("");
        org.jsoup.nodes.Element element11 = document1.prependElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.text("<#root>\n</#root><#root>\n</#root>");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element10.previousSibling();
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.previousSibling();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element9.empty();
        java.lang.String str11 = element10.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element10.previousSibling();
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = document1.prependElement("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Node node7 = document1.removeAttr("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.nextElementSibling();
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element7 = document1.addClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = element7.siblingIndex();
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.createElement("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi! #root hi!", "\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.wrap("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
        java.lang.String str14 = document1.title();
        org.jsoup.nodes.Element element16 = document1.text("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document1.siblingNodes();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("<#document hi!>\n</#document hi!>", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.nextElementSibling();
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element6 = document4.toggleClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element6.nextSibling();
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document1.siblingElements();
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document hi!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str12 = document1.data();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("hi!\n<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node3 = document1.removeAttr("<#root> #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("hi! #root");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Element element8 = document1.removeClass("hi!hi!");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag6 = document3.tag();
        org.jsoup.nodes.Element element8 = document3.html("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("#root");
        java.lang.String str9 = element8.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element8.siblingElements();
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.html("#document");
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.select.Elements elements11 = element9.children();
        org.jsoup.nodes.Element element13 = element9.prepend(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.previousElementSibling();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int2 = document1.siblingIndex();
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
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
        boolean boolean24 = document1.isBlock();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document26.hasClass("hi!");
        boolean boolean30 = document26.hasClass("hi!");
        java.lang.String str31 = document26.outerHtml();
        boolean boolean32 = document26.hasText();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.select.Elements elements37 = document34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element39 = document34.val("");
        org.jsoup.nodes.Element element41 = element39.removeClass("");
        org.jsoup.nodes.Element element43 = element39.removeClass("#root");
        java.util.Set<java.lang.String> strSet44 = element39.classNames();
        org.jsoup.nodes.Element element45 = document26.classNames(strSet44);
        org.jsoup.nodes.Element element47 = document26.appendElement("#document");
        java.lang.String str48 = document26.id();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        java.lang.String str51 = document50.baseUri();
        org.jsoup.select.Elements elements53 = document50.getElementsByAttribute("hi!");
        java.lang.String str54 = document50.html();
        org.jsoup.nodes.Element element56 = document50.val("");
        org.jsoup.nodes.Element element58 = document50.prependElement("#root");
        org.jsoup.nodes.Element element60 = element58.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element60.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element62.remove();
        org.jsoup.nodes.Element element65 = element62.removeClass("#root");
        boolean boolean66 = document26.equals((java.lang.Object) "#root");
        org.jsoup.nodes.Element element67 = document1.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.select.Elements elements69 = document1.getElementsByClass("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = document1.firstElementSibling();
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.text("#document hi!");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#document hi!>\n</#document hi!>");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.append("<html> \n<head> \n</head> \n<body>\n #root\n</body>\n</html>");
        java.lang.String str5 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document1.siblingElements();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
        org.jsoup.nodes.Element element16 = document1.toggleClass("hi!hi!<#root>\n  <#root>\n  </#root>\n </#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
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
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document1.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element3.siblingElements();
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.html("#root");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueContaining("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str9 = element3.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element3.siblingNodes();
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        java.lang.String str9 = document7.title();
        java.lang.String str10 = document7.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document7.lastElementSibling();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("hi!");
        java.lang.String str10 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("#document hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByTag("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.attr("#document", "<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element8.append("<#root>\n</#root><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = element8.siblingIndex();
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element8 = document1.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element11 = element7.val("");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document13.appendText("");
        org.jsoup.nodes.Element element17 = document13.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.childNodes();
        org.jsoup.nodes.Element element20 = element17.getElementById("#document");
        org.jsoup.nodes.Node node22 = element17.removeAttr("hi! #root hi!");
        org.jsoup.nodes.Element element24 = element17.toggleClass("hi!hi!");
        org.jsoup.nodes.Element element25 = element11.appendChild((org.jsoup.nodes.Node) element24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str9 = document1.tagName();
        java.lang.String str10 = document1.outerHtml();
        java.lang.String str11 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document1.siblingNodes();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueStarting("\n <hi!>\n </hi!>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute("#documenthi!");
        org.jsoup.select.Elements elements16 = document1.getElementsByIndexGreaterThan((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.text("\n<#root>\n<#document>\n</#document>hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element4 = document1.prepend(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document10.siblingElements();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        boolean boolean8 = document1.isBlock();
        document1.setBaseUri("#document");
        org.jsoup.nodes.Element element11 = document1.head();
        document1.setBaseUri("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.nextElementSibling();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements10 = element3.getElementsByTag("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str11 = element3.toString();
        org.jsoup.nodes.Element element13 = element3.val("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str14 = element13.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.lastElementSibling();
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean8 = document1.hasClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str9 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element5 = document1.appendElement("#document");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("\n <hi!>\n </hi!>");
        org.jsoup.select.Elements elements10 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.previousElementSibling();
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.nodes.Element element11 = document1.val("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document1.text("");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        org.jsoup.nodes.Element element10 = document1.html("#root");
        org.jsoup.nodes.Element element12 = element10.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element16 = element12.addClass("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element12.nextSibling();
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (short) 1);
        java.lang.String str9 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.nextSibling();
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.addClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n<html> \n<head> \n <title>\n</title>\n</head> \n<body>  \n</body>\n</html>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.baseUri();
        java.lang.String str9 = document1.nodeName();
        java.lang.String str10 = document1.className();
        org.jsoup.nodes.Document document11 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document1.previousSibling();
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = document1.siblingElements();
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.empty();
        java.lang.String str15 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = document1.previousSibling();
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Document document10 = document1.normalise();
        java.lang.String str11 = document10.title();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Element element20 = document13.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = document13.getElementsByAttributeValue("<#root>\n</#root>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document13.childNodes();
        boolean boolean25 = document10.equals((java.lang.Object) document13);
        org.jsoup.nodes.Element element26 = document10.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document10.siblingNodes();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.select.Elements elements5 = element2.getElementsByAttributeValueContaining("hi!hi!", "hi!");
        java.lang.String str6 = element2.html();
        org.jsoup.nodes.Element element8 = element2.appendText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element2.siblingElements();
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
        org.jsoup.nodes.Element element30 = document1.removeClass("#root");
        org.jsoup.nodes.Element element32 = element30.prependText(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element30.wrap("<html>\n<head>\n</head>\n<body> hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
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
        org.jsoup.nodes.Element element19 = element14.appendText("hi!hi!");
        java.lang.String str20 = element19.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element19.siblingNodes();
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.addClass("hi!");
        java.lang.String str7 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = document1.siblingIndex();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document1.siblingIndex();
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.id();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("&lt;#document hi!&gt;");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        org.jsoup.select.Elements elements11 = document1.getElementsByTag("hi! #root hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexEquals(0);
        java.lang.String str14 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.nextSibling();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String str8 = document7.baseUri();
        java.lang.String str9 = document7.outerHtml();
        java.lang.String str10 = document7.tagName();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        java.lang.String str16 = document12.html();
        java.lang.String str18 = document12.attr("");
        java.lang.String str19 = document12.id();
        org.jsoup.nodes.Element element20 = document7.prependChild((org.jsoup.nodes.Node) document12);
        boolean boolean21 = element20.hasText();
        org.jsoup.select.Elements elements23 = element20.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element20.toggleClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document1.appendChild((org.jsoup.nodes.Node) element25);
        document1.setBaseUri("#document hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>hi! &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document1.nextElementSibling();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        java.lang.String str12 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.baseUri();
        org.jsoup.nodes.Element element16 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        org.jsoup.select.Elements elements21 = document18.getElementsByAttribute("hi!");
        java.lang.String str22 = document18.html();
        org.jsoup.parser.Tag tag23 = document18.tag();
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
        boolean boolean43 = document18.equals((java.lang.Object) element42);
        org.jsoup.nodes.Element element44 = document10.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document45 = document18.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document45.siblingNodes();
        boolean boolean47 = document45.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document45.childNodes();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        boolean boolean52 = document50.hasClass("hi!");
        java.lang.String str53 = document50.className();
        org.jsoup.nodes.Element element55 = document50.html("");
        org.jsoup.select.Elements elements57 = document50.getElementsByIndexEquals((int) '#');
        boolean boolean59 = document50.hasAttr("#root");
        org.jsoup.nodes.Document document61 = new org.jsoup.nodes.Document("");
        java.lang.String str62 = document61.baseUri();
        org.jsoup.select.Elements elements64 = document61.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element66 = document61.val("");
        org.jsoup.nodes.Element element68 = element66.removeClass("");
        element66.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet71 = element66.classNames();
        org.jsoup.nodes.Element element72 = document50.classNames(strSet71);
        org.jsoup.nodes.Element element73 = document45.classNames(strSet71);
        java.lang.String str74 = element73.className();
        boolean boolean75 = document1.equals((java.lang.Object) str74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList76 = document1.siblingNodes();
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
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
        org.jsoup.nodes.Element element19 = element16.prependText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element19.siblingIndex();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.getElementById("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean10 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document1.previousSibling();
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.nodes.Element element10 = document1.val("hi!");
        org.jsoup.nodes.Element element12 = element10.appendText("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.firstElementSibling();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.Set<java.lang.String> strSet12 = document10.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document10.previousElementSibling();
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document8.hasClass("hi!");
        java.lang.String str11 = document8.className();
        boolean boolean12 = document8.hasText();
        org.jsoup.select.Elements elements14 = document8.getElementsByClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean15 = document1.equals((java.lang.Object) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
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
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexEquals(1);
        java.util.Set<java.lang.String> strSet23 = document1.classNames();
        java.lang.String str24 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document3.data();
        org.jsoup.nodes.Element element9 = document3.attr("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element9.prepend(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.previousSibling();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Element element9 = document1.toggleClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.firstElementSibling();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        org.jsoup.nodes.Element element16 = document1.html("#document");
        boolean boolean18 = element16.hasClass("<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element20 = element16.toggleClass("#document\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element16.previousSibling();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
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
        org.jsoup.select.Elements elements21 = document1.getElementsByIndexEquals((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = document1.previousSibling();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.parser.Tag tag13 = document1.tag();
        java.lang.String str14 = document1.outerHtml();
        java.lang.String str15 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexEquals((int) '4');
        java.lang.String str12 = element8.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element8.siblingElements();
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str8 = document5.text();
        java.lang.String str9 = document5.text();
        document5.remove();
        java.lang.String str12 = document5.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document5.lastElementSibling();
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head>\n  <title>#document</title>\n </head>\n <body> hi!hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.removeClass("hi!");
        boolean boolean12 = element10.hasAttr("#document hi!");
        org.jsoup.nodes.Element element14 = element10.append(" #document");
        org.jsoup.select.Elements elements16 = element10.getElementsByClass("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.nextElementSibling();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element12 = element6.toggleClass("");
        org.jsoup.nodes.Element element14 = element12.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = element14.attr("");
        org.jsoup.nodes.Element element18 = element14.html("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element14.siblingIndex();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element6 = element3.parent();
        org.jsoup.nodes.Element element9 = element3.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.baseUri();
        org.jsoup.select.Elements elements14 = document11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element16 = document11.val("");
        org.jsoup.nodes.Element element18 = document11.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.removeClass("hi!");
        boolean boolean22 = element20.hasAttr("#document hi!");
        org.jsoup.nodes.Element element24 = element20.append(" #document");
        org.jsoup.nodes.Element element25 = element9.prependChild((org.jsoup.nodes.Node) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.previousElementSibling();
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueEnding("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.attr("#documenthi!", "<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element14 = document1.appendText("#document hi!hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueNot("hi! #root hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element10.append("\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element18 = element16.prependText("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.lastElementSibling();
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element69 = document57.text("<<#root> #root>\n</<#root> #root>");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document10.lastElementSibling();
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
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
        org.jsoup.nodes.Element element22 = document1.append("#document hi!");
        org.jsoup.nodes.Element element24 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.previousElementSibling();
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.nodes.Element element12 = element6.appendElement("#document hi!");
        org.jsoup.select.Elements elements13 = element6.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element6.nextSibling();
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element12 = document7.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document7.previousSibling();
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements31 = document1.siblingElements();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
        java.lang.String str18 = element14.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element14.lastElementSibling();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        java.lang.String str4 = element3.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = element3.previousSibling();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        java.lang.String str7 = element6.id();
        java.util.Set<java.lang.String> strSet8 = element6.classNames();
        org.jsoup.nodes.Element element9 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element6.nextSibling();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Node node14 = document1.removeAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = document1.toggleClass("hi!hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<#document hi!>\n</#document hi!>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element16.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.firstElementSibling();
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.previousSibling();
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int2 = document1.siblingIndex();
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.jsoup.nodes.Element element16 = document1.addClass("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element18 = document1.appendText("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n &lt;#root&gt;  \n <html> \n  <head> \n   <title>&lt;#root&gt;\n&lt;/#root&gt;\n</title>\n  </head> \n  <body>\n    #document  \n  </body>\n </html>#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.text("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.Integer int4 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) ' ');
        java.lang.String str7 = element3.html();
        java.lang.String str8 = element3.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.nextElementSibling();
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Node node14 = document9.removeAttr("hi!");
        java.lang.String str15 = document9.className();
        org.jsoup.select.Elements elements17 = document9.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document1.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Document document19 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = document1.siblingIndex();
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element10.append("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element10.className();
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueNot("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element10.previousSibling();
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        java.lang.String str4 = document1.html();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str8 = document1.attr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.parser.Tag tag9 = document1.tag();
        boolean boolean11 = document1.hasAttr("<html> \n<head> \n</head> \n<body>\n  hi!   #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("#document\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.html("hi!hi!");
        org.jsoup.select.Elements elements17 = element16.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.previousElementSibling();
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
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
        element37.remove();
        org.jsoup.nodes.Element element42 = element37.val("#document hi!");
        org.jsoup.nodes.Element element44 = element42.html("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean45 = element42.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element42.siblingNodes();
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Element element8 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueStarting("\n <hi!>\n </hi!>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValueStarting("<html>\n <head>\n  <title>#document</title>\n </head>\n <body> hi!hi!\n </body>\n</html>", " hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.previousElementSibling();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = document21.text("<<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n<html> \n<head> \n <title>\n</title>\n</head> \n<body>  \n</body>\n</html>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element3 = document1.toggleClass("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        java.lang.String str18 = document16.outerHtml();
        java.lang.String str19 = document16.tagName();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = document21.html();
        java.lang.String str27 = document21.attr("");
        java.lang.String str28 = document21.id();
        org.jsoup.nodes.Element element29 = document16.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element31 = document16.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements33 = document16.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element34 = element13.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element36 = element34.prependText("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element36.lastElementSibling();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document48.title("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element6.empty();
        org.jsoup.select.Elements elements12 = element6.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element6.lastElementSibling();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexGreaterThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.lastElementSibling();
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Element element10 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str11 = document1.toString();
        java.lang.String str12 = document1.baseUri();
        org.jsoup.nodes.Element element13 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValue("#root", "<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.select.Elements elements17 = element10.getElementsByAttribute("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.Integer int18 = element10.elementSiblingIndex();
        java.lang.String str19 = element10.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element10.firstElementSibling();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexEquals(1);
        java.util.Set<java.lang.String> strSet23 = document1.classNames();
        java.lang.String str24 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root value=\"\" class=\"\">\n</#root>");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
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
        org.jsoup.nodes.Element element21 = document1.wrap("\n<#root>\n hi!hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document <#document>");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        java.lang.String str10 = document7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document7.siblingNodes();
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
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
        java.lang.String str55 = document48.text();
        java.lang.String str56 = document48.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element58 = document48.text("<#document hi!>\n</#document hi!>");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
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
        java.lang.String str19 = document1.title();
        org.jsoup.nodes.Element element20 = document1.body();
        org.jsoup.nodes.Element element21 = document1.body();
        org.jsoup.nodes.Element element23 = document1.prependElement("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document1.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
        org.jsoup.nodes.Element element22 = document1.append("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element22.siblingNodes();
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        java.lang.String str8 = element7.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.previousElementSibling();
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        element5.setBaseUri("#document hi!");
        org.jsoup.select.Elements elements14 = element5.getElementsByClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element5.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document18.hasClass("hi!");
        java.lang.String str21 = document18.tagName();
        java.lang.String str23 = document18.attr("hi!");
        java.lang.String str24 = document18.html();
        org.jsoup.nodes.Element element25 = element5.appendChild((org.jsoup.nodes.Node) document18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = element5.siblingIndex();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element4 = document1.parent();
        org.jsoup.nodes.Element element7 = document1.attr("head", "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.previousElementSibling();
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        boolean boolean6 = element5.hasText();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag9 = document8.tag();
        org.jsoup.nodes.Document document10 = document8.normalise();
        org.jsoup.nodes.Element element12 = document10.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element5.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element5.val("<#root>\n</#root>#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element5.nextSibling();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.nextElementSibling();
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
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
        org.jsoup.nodes.Element element23 = document1.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Node node25 = document1.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document1.siblingNodes();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
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
        org.jsoup.select.Elements elements19 = document9.getAllElements();
        java.lang.String str20 = document9.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document9.text("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        org.jsoup.nodes.Element element10 = document1.append("hi!hi!");
        org.jsoup.nodes.Element element12 = document1.removeClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str13 = element12.id();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.lang.String str16 = document15.nodeName();
        org.jsoup.nodes.Element element18 = document15.removeClass("");
        org.jsoup.nodes.Element element20 = document15.prependElement("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element12.prependChild((org.jsoup.nodes.Node) document15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.previousElementSibling();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document hi!");
        org.jsoup.nodes.Element element3 = document1.createElement("<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Element element6 = document1.createElement("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str8 = document1.absUrl("<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element10 = document1.removeClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.String str7 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        boolean boolean5 = document1.hasClass("\n<#root>\n hi!hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.firstElementSibling();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document2.title();
        org.jsoup.nodes.Element element5 = document2.appendText("<#root>");
        java.lang.String str6 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.previousSibling();
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
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
        org.jsoup.select.Elements elements30 = document21.siblingElements();
        org.jsoup.nodes.Element element32 = document21.createElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str33 = element32.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element32.nextElementSibling();
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.html();
        java.lang.String str5 = document1.attr("&lt;hi!&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.nextSibling();
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        org.jsoup.nodes.Element element15 = element14.empty();
        java.lang.String str17 = element14.absUrl(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.previousElementSibling();
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element30.nextSibling();
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.wrap("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueEnding("<#root> #root", "<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.select.Elements elements12 = element7.children();
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements18 = element7.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element7.toggleClass("<#root>\n<#root>\n</#root>\n<html>\n <head>\n </head>\n <body>\n  #document\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element22 = element7.prepend("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element7.firstElementSibling();
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Element element14 = document1.prependText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element14.siblingElements();
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        document7.title("#document hi!");
        java.util.Set<java.lang.String> strSet13 = document7.classNames();
        org.jsoup.nodes.Element element15 = document7.text("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str16 = document7.html();
        org.jsoup.nodes.Node node18 = document7.removeAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document7.previousSibling();
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str5 = document1.text();
        java.lang.String str6 = document1.html();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.lang.String str9 = document1.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str10 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.firstElementSibling();
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element3 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document1.siblingNodes();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
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
        org.jsoup.select.Elements elements22 = element20.getElementsByTag("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
        org.jsoup.nodes.Element element24 = element20.prependElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element20.nextSibling();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueContaining("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element12 = document7.val("hi!");
        java.lang.String str13 = document7.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document7.previousElementSibling();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.nodes.Element element10 = document1.createElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element3.previousElementSibling();
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.val("");
        org.jsoup.nodes.Element element11 = document1.prependElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document1.previousSibling();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
        org.jsoup.nodes.Element element22 = document1.append("#document hi!");
        org.jsoup.nodes.Element element24 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element24.appendText("");
        org.jsoup.nodes.Element element28 = element26.val("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element26.firstElementSibling();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
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
        org.jsoup.select.Elements elements30 = document21.siblingElements();
        org.jsoup.nodes.Element element31 = document21.body();
        org.jsoup.select.Elements elements32 = document21.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document21.text("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.id();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("#document");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        java.util.Set<java.lang.String> strSet10 = element7.classNames();
        java.lang.String str11 = element7.data();
        org.jsoup.nodes.Element element13 = element7.prependText("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element13.siblingElements();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = document1.prepend("#document");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValue("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "<#root> hi!");
        org.jsoup.select.Elements elements11 = element7.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element7.siblingNodes();
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
        org.jsoup.nodes.Attributes attributes57 = document48.attributes();
        org.jsoup.nodes.Element element59 = document48.prependElement(" #document");
        org.jsoup.nodes.Element element61 = document48.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document48.title("<#root>\n</#root>#document hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element11 = document1.val("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        java.lang.String str6 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#root");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        org.jsoup.select.Elements elements21 = document1.getElementsByAttribute("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = document1.nextSibling();
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueStarting("#root", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Element element10 = document1.addClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.children();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        java.lang.String str14 = document13.baseUri();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttribute("hi!");
        java.lang.String str17 = document13.html();
        org.jsoup.nodes.Element element19 = document13.prependText("hi!");
        java.util.Set<java.lang.String> strSet20 = element19.classNames();
        org.jsoup.nodes.Element element21 = document1.classNames(strSet20);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        java.lang.String str24 = document23.baseUri();
        java.lang.String str25 = document23.outerHtml();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        java.lang.String str28 = document27.baseUri();
        org.jsoup.nodes.Element element29 = document23.appendChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Attributes attributes30 = element29.attributes();
        boolean boolean31 = element21.equals((java.lang.Object) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element21.nextElementSibling();
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        org.jsoup.select.Elements elements36 = document1.children();
        org.jsoup.nodes.Element element38 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = document1.previousSibling();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        java.lang.String str10 = document1.text();
        java.lang.String str11 = document1.outerHtml();
        document1.setBaseUri("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.getElementById("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("<html>\n<head>\n</head>\n<body>\n #documenthi!\n</body>\n</html>");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.firstElementSibling();
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
        org.jsoup.select.Elements elements21 = element3.getElementsByIndexEquals((int) '#');
        java.lang.String str22 = element3.text();
        java.util.Set<java.lang.String> strSet23 = element3.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = element3.siblingIndex();
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.previousSibling();
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = element3.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexEquals((int) (byte) 10);
        java.lang.String str8 = element5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element5.siblingElements();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<hi!> </hi!>");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
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
        org.jsoup.select.Elements elements29 = document1.getElementsByAttribute("<#root>\n</#root>");
        org.jsoup.nodes.Element element31 = document1.prepend("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document1.siblingNodes();
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        boolean boolean7 = element3.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Element element14 = document9.removeClass("hi!");
        java.lang.String str15 = element14.id();
        java.lang.String str16 = element14.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document18.hasClass("hi!");
        boolean boolean22 = document18.hasClass("hi!");
        java.lang.String str23 = document18.outerHtml();
        boolean boolean24 = document18.hasText();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        java.lang.String str27 = document26.baseUri();
        org.jsoup.select.Elements elements29 = document26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element31 = document26.val("");
        org.jsoup.nodes.Element element33 = element31.removeClass("");
        org.jsoup.nodes.Element element35 = element31.removeClass("#root");
        java.util.Set<java.lang.String> strSet36 = element31.classNames();
        org.jsoup.nodes.Element element37 = document18.classNames(strSet36);
        org.jsoup.nodes.Element element38 = element14.classNames(strSet36);
        org.jsoup.nodes.Element element39 = element3.classNames(strSet36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int40 = element3.siblingIndex();
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
        org.jsoup.nodes.Node node16 = document1.childNode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.wrap("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.jsoup.nodes.Element element16 = document1.addClass("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element8 = document7.head();
        org.jsoup.nodes.Element element10 = document7.appendElement("hi!");
        java.lang.String str11 = document7.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document7.siblingElements();
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements10 = element3.getElementsByTag("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element3.siblingIndex();
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.baseUri();
        org.jsoup.nodes.Element element11 = document1.val("<#document hi!>\n</#document hi!>");
        java.lang.String str12 = element11.text();
        element11.setBaseUri("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str15 = element11.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element11.siblingNodes();
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        boolean boolean7 = element3.hasAttr("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.appendText("");
        java.lang.String str12 = document9.title();
        org.jsoup.nodes.Element element14 = document9.removeClass("hi!");
        java.lang.String str15 = element14.id();
        java.lang.String str16 = element14.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document18.hasClass("hi!");
        boolean boolean22 = document18.hasClass("hi!");
        java.lang.String str23 = document18.outerHtml();
        boolean boolean24 = document18.hasText();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        java.lang.String str27 = document26.baseUri();
        org.jsoup.select.Elements elements29 = document26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element31 = document26.val("");
        org.jsoup.nodes.Element element33 = element31.removeClass("");
        org.jsoup.nodes.Element element35 = element31.removeClass("#root");
        java.util.Set<java.lang.String> strSet36 = element31.classNames();
        org.jsoup.nodes.Element element37 = document18.classNames(strSet36);
        org.jsoup.nodes.Element element38 = element14.classNames(strSet36);
        org.jsoup.nodes.Element element39 = element3.classNames(strSet36);
        java.lang.String str40 = element39.text();
        element39.setBaseUri("<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element39.siblingNodes();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Node node6 = document1.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node6.previousSibling();
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
        org.jsoup.nodes.Element element20 = document9.attr("\n<#root <html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title("#document <#document>");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        org.jsoup.nodes.Element element10 = document1.append("hi!hi!");
        org.jsoup.nodes.Element element12 = document1.getElementById("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.nextElementSibling();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
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
        org.jsoup.select.Elements elements33 = document1.getElementsByIndexGreaterThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.text("hi! #root hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.select.Elements elements5 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.jsoup.select.Elements elements8 = document1.select("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document1.siblingElements();
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.parser.Tag tag4 = element3.tag();
        org.jsoup.nodes.Element element6 = element3.toggleClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = element6.siblingElements();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        document10.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet13 = document10.classNames();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Element element15 = document10.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document10.siblingNodes();
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
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
        org.jsoup.nodes.Element element15 = element14.empty();
        java.lang.String str17 = element14.absUrl(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.nextElementSibling();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.nodes.Element element12 = element6.appendElement("#document hi!");
        boolean boolean14 = element6.hasAttr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = element6.absUrl("<#root>\n</#root><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element6.lastElementSibling();
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
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
        org.jsoup.select.Elements elements33 = document1.getElementsByIndexGreaterThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document1.lastElementSibling();
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = document5.body();
        org.jsoup.nodes.Element element9 = document5.firstElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document5.text("hi!hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        java.lang.String str5 = document1.title();
        boolean boolean7 = document1.hasClass(" #document");
        java.lang.String str8 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.lastElementSibling();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
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
        org.jsoup.select.Elements elements22 = document1.getElementsByIndexEquals(1);
        java.util.Set<java.lang.String> strSet23 = document1.classNames();
        org.jsoup.nodes.Element element25 = document1.append("<#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements26 = document1.siblingElements();
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        java.lang.String str8 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.lastElementSibling();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        java.lang.String str3 = document1.nodeName();
        java.util.Set<java.lang.String> strSet4 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.nodes.Element element10 = document1.addClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element10.siblingIndex();
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n <hi!>\n </hi!>");
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexGreaterThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!\n<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element7.siblingIndex();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.parser.Tag tag13 = document1.tag();
        java.lang.String str14 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("hi!hi! hi! <html> <head> </head> <body> </body> </html>#document");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Element element8 = document1.prepend("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        boolean boolean10 = document1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document1.siblingIndex();
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
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
        java.lang.String str19 = document1.toString();
        org.jsoup.nodes.Element element21 = document1.toggleClass("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.previousElementSibling();
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#document hi!>\n</#document hi!>");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.append("<html> \n<head> \n</head> \n<body>\n #root\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("#documenthi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.previousSibling();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttribute("#root");
        boolean boolean13 = document1.hasClass("#document");
        java.lang.String str14 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = document1.prependText("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.prependText("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = document1.nextSibling();
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.parser.Tag tag8 = document1.tag();
        boolean boolean9 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.nextSibling();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.nextSibling();
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
        java.lang.String str33 = document1.val();
        java.lang.String str34 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int35 = document1.siblingIndex();
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.wrap("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.html();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document1.siblingIndex();
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document13.hasClass("hi!");
        boolean boolean17 = document13.hasClass("hi!");
        org.jsoup.nodes.Element element18 = document13.head();
        java.lang.String str19 = document13.title();
        java.lang.String str20 = document13.nodeName();
        org.jsoup.select.Elements elements21 = document13.getAllElements();
        org.jsoup.nodes.Element element23 = document13.append("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document13.text("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element11.replaceWith((org.jsoup.nodes.Node) element25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element11.nextSibling();
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int2 = document1.siblingIndex();
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Document document10 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document10.nextSibling();
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element14.val();
        org.jsoup.nodes.Node node20 = element14.removeAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element14.firstElementSibling();
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        boolean boolean6 = document4.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document4.wrap("<html>\n<head>\n</head>\n<body> hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        org.jsoup.nodes.Element element18 = document9.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document9.text("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.appendText("#document");
        java.lang.String str13 = element6.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element6.siblingElements();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 100);
        java.lang.String str12 = document1.data();
        org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.nextElementSibling();
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Element element9 = document1.prepend("hi!");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.text("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
        element37.remove();
        org.jsoup.nodes.Element element42 = element37.val("#document hi!");
        org.jsoup.nodes.Element element44 = element42.html("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean45 = element42.isBlock();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet48 = document47.classNames();
        org.jsoup.nodes.Element element49 = element42.classNames(strSet48);
        org.jsoup.select.Elements elements52 = element49.getElementsByAttributeValue("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>", "<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int53 = element49.siblingIndex();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
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
        org.jsoup.select.Elements elements15 = element3.getAllElements();
        org.jsoup.nodes.Element element17 = element3.val("");
        java.lang.String str18 = element3.tagName();
        org.jsoup.nodes.Element element20 = element3.append("#document");
        org.jsoup.nodes.Element element22 = element3.val("\n <hi!>\n </hi!>");
        java.lang.String str23 = element3.id();
        org.jsoup.nodes.Element element25 = element3.val("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;#root&gt;\n<html>\n<head>\n <title>&lt;html&gt; \n&lt;head&gt; \n&lt;/head&gt; \n&lt;body&gt;\n  hi!   #document\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.nodes.Element element6 = document1.attr("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>", "<#root>\n</#root><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.previousSibling();
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Element element7 = document1.removeClass("#document hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>hi! &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element6 = document1.html("#document hi!hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title("");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
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
        java.lang.String str28 = document20.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document20.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) '#');
        java.lang.Integer int21 = element18.elementSiblingIndex();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document23.prependText("hi!");
        java.lang.String str26 = document23.nodeName();
        document23.title("#root");
        java.lang.Integer int29 = document23.elementSiblingIndex();
        org.jsoup.nodes.Element element31 = document23.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str32 = element31.baseUri();
        org.jsoup.nodes.Element element34 = element31.prepend("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean35 = element18.equals((java.lang.Object) "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element18.wrap("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str4 = document1.attr("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("#document \n<html> \n<head> \n</head> \n<body>  hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements15 = element3.getElementsByAttributeValueStarting("<#root>\n</#root><#root>\n</#root>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element3.siblingElements();
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element14.val();
        org.jsoup.select.Elements elements20 = element14.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element21 = element14.parent();
        boolean boolean23 = element14.hasAttr("#document\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element14.siblingNodes();
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.toggleClass("#document");
        org.jsoup.nodes.Element element6 = document1.attr("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>", "<#root>\n</#root><#root>\n</#root>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.baseUri();
        java.lang.String str10 = document8.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.nodes.Element element14 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.select.Elements elements19 = document16.getElementsByAttribute("hi!");
        java.lang.String str20 = document16.html();
        org.jsoup.parser.Tag tag21 = document16.tag();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document23.appendText("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        java.lang.String str28 = document27.baseUri();
        java.lang.String str29 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        java.lang.String str32 = document31.baseUri();
        org.jsoup.nodes.Element element33 = document27.appendChild((org.jsoup.nodes.Node) document31);
        boolean boolean34 = element25.equals((java.lang.Object) document31);
        org.jsoup.select.Elements elements36 = document31.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element38 = document31.appendElement("hi!");
        org.jsoup.nodes.Element element40 = element38.prependElement("hi!");
        boolean boolean41 = document16.equals((java.lang.Object) element40);
        org.jsoup.nodes.Element element42 = document8.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Node node43 = document16.previousSibling();
        org.jsoup.nodes.Element element44 = document16.nextElementSibling();
        java.lang.String str46 = document16.attr("#root");
        java.lang.String str47 = document16.tagName();
        document16.remove();
        org.jsoup.nodes.Element element49 = element6.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements51 = element49.getElementsByIndexEquals((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element49.lastElementSibling();
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element3 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.nextElementSibling();
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.removeClass("hi!");
        boolean boolean12 = element8.hasAttr("hi!hi!");
        org.jsoup.nodes.Element element14 = element8.html("<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.firstElementSibling();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.removeClass("<#document hi!>\n</#document hi!>");
        java.lang.String str4 = document1.className();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements6 = document1.children();
        boolean boolean8 = document1.hasClass("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document1.siblingIndex();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
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
        org.jsoup.nodes.Element element16 = document1.createElement("<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        java.lang.String str18 = element16.attr("");
        org.jsoup.nodes.Element element20 = element16.removeClass("<<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>>\n</<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element20.siblingElements();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.baseUri();
        org.jsoup.nodes.Element element11 = document1.val("<#document hi!>\n</#document hi!>");
        java.lang.String str12 = element11.text();
        element11.setBaseUri("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element11.siblingElements();
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        boolean boolean8 = document1.isBlock();
        document1.setBaseUri("#document");
        org.jsoup.nodes.Element element11 = document1.head();
        document1.setBaseUri("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.appendText("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document1.siblingNodes();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.prependText("<#root>\n</#root>");
        org.jsoup.nodes.Element element14 = element12.appendText("<#document hi!>\n</#document hi!>");
        element14.setBaseUri(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element14.siblingElements();
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
        org.jsoup.nodes.Element element30 = document1.removeClass("#root");
        org.jsoup.nodes.Element element32 = element30.prependText(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = element32.nextSibling();
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        java.lang.String str8 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.parser.Tag tag13 = document1.tag();
        java.lang.String str14 = document1.outerHtml();
        java.lang.String str16 = document1.absUrl("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = document1.getElementsByAttributeValueEnding("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document hi!");
        org.jsoup.nodes.Element element3 = document1.createElement("<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Element element6 = document1.createElement("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str8 = document1.absUrl("<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element10 = document1.removeClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document1.previousSibling();
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
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
        org.jsoup.nodes.Element element22 = document1.append("#document hi!");
        java.lang.String str23 = document1.data();
        java.lang.String str25 = document1.attr("");
        org.jsoup.nodes.Element element27 = document1.addClass("<html>\n <head>\n  <title>#document</title>\n </head>\n <body> hi!hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document1.text("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! #root hi!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.createElement("hi! #root hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#document hi!", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.prependElement(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByIndexEquals((int) '#');
        org.jsoup.select.Elements elements6 = element3.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.siblingNodes();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
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
        org.jsoup.nodes.Element element30 = document1.removeClass("#root");
        org.jsoup.select.Elements elements32 = document1.getElementsByIndexGreaterThan((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document1.previousElementSibling();
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
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
        org.jsoup.select.Elements elements21 = document1.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str22 = document1.toString();
        org.jsoup.nodes.Element element25 = document1.attr("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "<#root> #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element25.nextSibling();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
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
        org.jsoup.nodes.Element element17 = element13.addClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;", "hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element13.siblingNodes();
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.body();
        org.jsoup.nodes.Element element13 = document1.prepend("#document hi!");
        org.jsoup.nodes.Element element15 = document1.val("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttribute("#root");
        boolean boolean13 = document1.hasClass("#document");
        org.jsoup.nodes.Element element16 = document1.attr("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!", "hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.previousElementSibling();
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document1.siblingElements();
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
        org.jsoup.nodes.Element element19 = element17.val("<#document hi!>\n</#document hi!>");
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element17.previousSibling();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;hi!&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
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
        java.lang.String str31 = document8.tagName();
        java.lang.String str32 = document8.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document8.title("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
        org.jsoup.nodes.Element element29 = element27.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.lastElementSibling();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element5 = document1.appendText("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = document8.text("\n<#root>\n hi!hi!\n</#root>");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.select.Elements elements8 = document1.children();
        org.jsoup.nodes.Element element11 = document1.attr("#root", "#documenthi!");
        org.jsoup.nodes.Document document12 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document12.previousSibling();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
        org.jsoup.nodes.Element element22 = document1.createElement("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        document1.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = document1.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = node26.siblingIndex();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Document document8 = document1.normalise();
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
        org.jsoup.nodes.Element element30 = document8.classNames(strSet28);
        org.jsoup.nodes.Element element32 = element30.appendText("hi!hi!");
        org.jsoup.nodes.Element element33 = element30.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = element33.nextSibling();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str2 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!hi!<<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.parser.Tag tag8 = document1.tag();
        boolean boolean9 = document1.hasText();
        java.lang.String str10 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.wrap("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        org.jsoup.nodes.Element element19 = element14.appendText("hi!hi!");
        java.lang.String str20 = element19.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element19.nextSibling();
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
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
        org.jsoup.nodes.Element element20 = document9.addClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str21 = document9.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document9.text("\n <hi! class=\"\">\n </hi!>");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
        org.jsoup.nodes.Element element22 = document1.child(0);
        java.lang.String str23 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = document1.siblingElements();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexEquals((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document1.siblingElements();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<#root>\n</#root>");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean4 = document1.hasAttr("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        boolean boolean5 = document1.isBlock();
        org.jsoup.nodes.Element element7 = document1.append(" #document");
        org.jsoup.nodes.Element element9 = document1.appendText("<#root> #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        boolean boolean15 = element3.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element3.previousSibling();
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String str8 = document7.baseUri();
        org.jsoup.select.Elements elements10 = document7.getElementsByAttribute("hi!");
        java.lang.String str11 = document7.html();
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.appendText("");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        java.lang.String str19 = document18.baseUri();
        java.lang.String str20 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.baseUri();
        org.jsoup.nodes.Element element24 = document18.appendChild((org.jsoup.nodes.Node) document22);
        boolean boolean25 = element16.equals((java.lang.Object) document22);
        org.jsoup.select.Elements elements27 = document22.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element29 = document22.appendElement("hi!");
        org.jsoup.nodes.Element element31 = element29.prependElement("hi!");
        boolean boolean32 = document7.equals((java.lang.Object) element31);
        java.lang.String str34 = document7.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements36 = document7.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element37 = document1.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements39 = document1.getElementsByAttribute("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int40 = document1.siblingIndex();
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element14 = element10.removeClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements15 = element14.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element14.nextSibling();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.firstElementSibling();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.nextElementSibling();
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
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
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueEnding("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>", "#root");
        org.jsoup.select.Elements elements27 = element23.siblingElements();
        element23.remove();
        boolean boolean30 = element23.hasAttr("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element23.nextElementSibling();
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str10 = element6.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element6.prependText("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element12.siblingIndex();
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document8.title("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.addClass("hi!");
        java.lang.String str7 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = document1.siblingIndex();
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.parser.Tag tag4 = document1.tag();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("<html>\n <head>\n  <title>#document</title>\n </head>\n <body> hi!hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document7.previousSibling();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.nodes.Element element9 = element5.removeClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str7 = document1.absUrl("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.siblingNodes();
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
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
        org.jsoup.nodes.Element element20 = document1.empty();
        org.jsoup.nodes.Element element22 = document1.removeClass("<#root>\n</#root>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = document1.nextSibling();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element13.remove();
        org.jsoup.nodes.Element element16 = element13.removeClass("#root");
        java.lang.String str17 = element16.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.lastElementSibling();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.nodes.Element element11 = document1.toggleClass("<#root>\n</#root>#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.wrap("&lt;#root&gt; hi! \n<html> \n<head> \n <title>#root\n </title>\n</head> \n<body>   hi! \n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
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
        element37.remove();
        java.lang.Integer int43 = element37.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element37.siblingNodes();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("#document");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Node node12 = document10.removeAttr("<#document hi!>\n</#document hi!>");
        org.jsoup.nodes.Element element14 = document10.prepend("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document10.previousElementSibling();
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
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
        org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueContaining("hi!", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document9.text("<html> \n<head> \n <title>\n</title>\n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Element element7 = document1.removeClass("#document hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>\n</<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>>hi! &lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.previousElementSibling();
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
        org.jsoup.nodes.Element element21 = document9.removeClass(" #document");
        org.jsoup.nodes.Element element23 = document9.prependText("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        java.lang.String str24 = document9.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag6 = document3.tag();
        org.jsoup.nodes.Element element8 = document3.html("<html>\n<head>\n <title>#document hi!</title>\n</head>\n<body>\n hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document3.attr("<#root> hi!", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element11.previousSibling();
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document1.siblingElements();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
        org.jsoup.select.Elements elements17 = document1.children();
        java.lang.String str19 = document1.absUrl("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element21 = document1.html("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element23 = element21.removeClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element24 = element21.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements25 = element21.siblingElements();
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        org.jsoup.select.Elements elements10 = document1.select("#root");
        boolean boolean11 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.val("");
        org.jsoup.nodes.Element element5 = document1.appendElement("#document");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes10 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.lastElementSibling();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.createElement(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
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
        org.jsoup.nodes.Element element20 = document8.body();
        boolean boolean22 = document8.hasAttr("");
        org.jsoup.nodes.Element element24 = document8.toggleClass("<#root> hi!");
        java.lang.String str25 = element24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element24.lastElementSibling();
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
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
        element37.remove();
        org.jsoup.nodes.Element element42 = element37.append("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = element37.nextSibling();
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element11 = document1.prepend("#document");
        org.jsoup.nodes.Element element13 = document1.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str17 = document1.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document1.siblingIndex();
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
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
        org.jsoup.nodes.Element element34 = document1.getElementById("#document");
        boolean boolean35 = document1.hasText();
        org.jsoup.nodes.Element element37 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements38 = element37.siblingElements();
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.val("");
        org.jsoup.nodes.Element element9 = document1.prependElement("#root");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '4');
        java.lang.String str12 = element9.tagName();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.appendText("");
        org.jsoup.nodes.Element element17 = document14.body();
        java.lang.String str18 = document14.title();
        java.lang.String str19 = document14.nodeName();
        org.jsoup.nodes.Element element21 = document14.prependText("hi!");
        org.jsoup.nodes.Element element22 = document14.head();
        boolean boolean24 = document14.equals((java.lang.Object) "hi!hi!");
        org.jsoup.nodes.Element element25 = document14.parent();
        boolean boolean26 = element9.equals((java.lang.Object) document14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document14.previousElementSibling();
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean8 = element5.hasText();
        org.jsoup.nodes.Element element10 = element5.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element10.siblingIndex();
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element6 = document1.attr("#documenthi!", "\n<#root>\n hi!hi!\n</#root>");
        org.jsoup.nodes.Element element8 = document1.getElementById("<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root value=\"\" class=\"\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text("hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.lang.String str10 = document1.nodeName();
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = document1.parent();
        org.jsoup.nodes.Attributes attributes13 = document1.attributes();
        org.jsoup.nodes.Document document14 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.firstElementSibling();
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
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
        org.jsoup.nodes.Element element38 = document9.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element40 = element38.html("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        java.lang.String str43 = document42.baseUri();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element47 = document42.getElementById("hi!");
        java.lang.String str48 = document42.outerHtml();
        java.lang.String str49 = document42.baseUri();
        org.jsoup.nodes.Element element51 = document42.html("");
        java.lang.String str52 = document42.outerHtml();
        java.lang.String str53 = document42.val();
        org.jsoup.select.Elements elements56 = document42.getElementsByAttributeValueStarting("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element57 = element38.appendChild((org.jsoup.nodes.Node) document42);
        document42.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document42.title("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
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
        java.lang.String str17 = element14.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element14.val();
        org.jsoup.select.Elements elements21 = element14.getElementsByAttributeValueEnding("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element14.prependElement("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element14.siblingNodes();
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
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
        boolean boolean24 = document1.isBlock();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document26.hasClass("hi!");
        boolean boolean30 = document26.hasClass("hi!");
        java.lang.String str31 = document26.outerHtml();
        boolean boolean32 = document26.hasText();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.select.Elements elements37 = document34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element39 = document34.val("");
        org.jsoup.nodes.Element element41 = element39.removeClass("");
        org.jsoup.nodes.Element element43 = element39.removeClass("#root");
        java.util.Set<java.lang.String> strSet44 = element39.classNames();
        org.jsoup.nodes.Element element45 = document26.classNames(strSet44);
        org.jsoup.nodes.Element element47 = document26.appendElement("#document");
        java.lang.String str48 = document26.id();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        java.lang.String str51 = document50.baseUri();
        org.jsoup.select.Elements elements53 = document50.getElementsByAttribute("hi!");
        java.lang.String str54 = document50.html();
        org.jsoup.nodes.Element element56 = document50.val("");
        org.jsoup.nodes.Element element58 = document50.prependElement("#root");
        org.jsoup.nodes.Element element60 = element58.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element60.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element62.remove();
        org.jsoup.nodes.Element element65 = element62.removeClass("#root");
        boolean boolean66 = document26.equals((java.lang.Object) "#root");
        org.jsoup.nodes.Element element67 = document1.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element69 = document26.prepend("");
        org.jsoup.select.Elements elements72 = document26.getElementsByAttributeValueStarting("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "&lt;hi!&gt; &lt;/hi!&gt;");
        java.util.Set<java.lang.String> strSet73 = document26.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element75 = document26.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html><<#root>\n</#root>#document hi!>\n</<#root>\n</#root>#document hi!>");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        org.jsoup.nodes.Element element32 = element18.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element32.nextElementSibling();
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean2 = document1.hasText();
        java.lang.String str4 = document1.absUrl("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document6.val("");
        org.jsoup.nodes.Element element13 = element11.removeClass("");
        org.jsoup.nodes.Element element15 = element11.removeClass("#root");
        org.jsoup.nodes.Element element16 = document1.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = document1.getElementById("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.wrap("<<#root>>\n</<#root>> <hi html=\"\"> \n <html>\n  <head> \n  </head> \n  <body>   class=&quot; hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&quot;&gt;  \n   <head> \n   </head> \n   <body>  &gt;\n   </body>\n  </body>\n </html>\n</hi>");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document1.val(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        boolean boolean9 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        org.jsoup.parser.Tag tag6 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str17 = document16.outerHtml();
        java.util.Set<java.lang.String> strSet18 = document16.classNames();
        org.jsoup.nodes.Element element19 = document1.classNames(strSet18);
        java.lang.String str21 = document1.absUrl("\n <hi!>\n </hi!>");
        org.jsoup.nodes.Element element23 = document1.appendElement("\n<#root <html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!\n</#root>");
        org.jsoup.parser.Tag tag24 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.text("");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        org.jsoup.nodes.Element element8 = element6.val("#root");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.wrap("<#root class=\" hi!\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\" value=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.appendElement("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str12 = document1.absUrl("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.appendElement("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str15 = document1.nodeName();
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexLessThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.previousElementSibling();
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.val("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.prepend("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element15.siblingIndex();
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        org.jsoup.select.Elements elements10 = document1.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n </head>\n <body>\n </body>\n</html><<#root>\n</#root>#document hi!>\n</<#root>\n</#root>#document hi!>");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element7.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.addClass("#document");
        org.jsoup.nodes.Element element13 = element11.appendText("<#root>\n</#root>");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueContaining("#document", "<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str17 = element11.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element11.nextSibling();
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueStarting("hi! #root", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element8 = document1.removeClass("<#root>");
        java.lang.String str10 = document1.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        java.lang.String str7 = document1.nodeName();
        boolean boolean8 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.previousSibling();
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        document7.title("#document hi!");
        java.util.Set<java.lang.String> strSet13 = document7.classNames();
        org.jsoup.nodes.Element element15 = document7.text("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str16 = document7.html();
        org.jsoup.nodes.Element element18 = document7.createElement("<hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n</hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.lastElementSibling();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("&lt;hi!&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<html>\n<head>\n <title>hi!\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        org.jsoup.select.Elements elements11 = document1.getElementsByTag("hi! #root hi!");
        java.lang.Integer int12 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document1.nextSibling();
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = document1.prepend("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        java.lang.String str12 = document1.text();
        org.jsoup.nodes.Node node14 = document1.removeAttr("<#root>\n</#root>");
        org.jsoup.nodes.Element element16 = document1.toggleClass("hi!hi!");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<#document hi!>\n</#document hi!>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element16.siblingIndex();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        boolean boolean3 = document1.isBlock();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        java.lang.String str8 = document5.html();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.nodes.Element element10 = document1.addClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
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
        org.jsoup.select.Elements elements17 = document1.children();
        boolean boolean19 = document1.hasClass("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element21 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.previousElementSibling();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.lang.String str31 = document8.tagName();
        java.lang.String str32 = document8.title();
        org.jsoup.nodes.Element element34 = document8.append("<#root>\n</#root>");
        org.jsoup.select.Elements elements37 = document8.getElementsByAttributeValue("<#root>", "hi! #root hi!");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        java.lang.String str40 = document39.baseUri();
        java.lang.String str41 = document39.outerHtml();
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        java.lang.String str44 = document43.baseUri();
        org.jsoup.nodes.Element element45 = document39.appendChild((org.jsoup.nodes.Node) document43);
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        java.lang.String str48 = document47.baseUri();
        org.jsoup.select.Elements elements50 = document47.getElementsByAttribute("hi!");
        java.lang.String str51 = document47.html();
        org.jsoup.parser.Tag tag52 = document47.tag();
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element56 = document54.appendText("");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("");
        java.lang.String str59 = document58.baseUri();
        java.lang.String str60 = document58.outerHtml();
        org.jsoup.nodes.Document document62 = new org.jsoup.nodes.Document("");
        java.lang.String str63 = document62.baseUri();
        org.jsoup.nodes.Element element64 = document58.appendChild((org.jsoup.nodes.Node) document62);
        boolean boolean65 = element56.equals((java.lang.Object) document62);
        org.jsoup.select.Elements elements67 = document62.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element69 = document62.appendElement("hi!");
        org.jsoup.nodes.Element element71 = element69.prependElement("hi!");
        boolean boolean72 = document47.equals((java.lang.Object) element71);
        org.jsoup.nodes.Element element73 = document39.prependChild((org.jsoup.nodes.Node) document47);
        org.jsoup.nodes.Document document74 = document47.normalise();
        org.jsoup.nodes.Element element75 = document74.lastElementSibling();
        org.jsoup.select.Elements elements77 = element75.getElementsByClass("#root");
        java.util.Set<java.lang.String> strSet78 = element75.classNames();
        org.jsoup.nodes.Element element79 = element75.lastElementSibling();
        boolean boolean81 = element75.hasAttr("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element83 = element75.removeClass("#root");
        boolean boolean85 = element83.hasAttr("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements87 = element83.getElementsByTag("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str89 = element83.attr("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        document8.replaceWith((org.jsoup.nodes.Node) element83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element92 = document8.text("hi!hi!<#root>\n  <#root>\n  </#root>\n </#root>");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        org.jsoup.nodes.Element element7 = document1.body();
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
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
        org.jsoup.nodes.Element element16 = document1.createElement("<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        java.lang.String str18 = element16.attr("");
        java.lang.String str19 = element16.className();
        org.jsoup.nodes.Element element21 = element16.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element16.lastElementSibling();
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi! #root hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes15 = document12.attributes();
        org.jsoup.nodes.Document document16 = document12.normalise();
        org.jsoup.select.Elements elements19 = document12.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements23 = document12.getElementsByClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element25 = document12.prepend("#documenthi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        org.jsoup.nodes.Element element28 = element25.prependText("&lt;#document hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element25.lastElementSibling();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Node node8 = document1.removeAttr("#root");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document document10 = document1.normalise();
        document10.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet13 = document10.classNames();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Element element15 = document10.body();
        java.lang.String str16 = document10.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = document10.siblingIndex();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.prependText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements12 = document1.getElementsByClass("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element14 = document1.prepend("#documenthi!");
        org.jsoup.nodes.Element element16 = document1.text("#documenthi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = document1.siblingIndex();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        java.lang.String str12 = element6.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element6.childNodes();
        org.jsoup.select.Elements elements15 = element6.getElementsByTag("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element6.nextSibling();
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.append("");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.select.Elements elements12 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = document9.html();
        org.jsoup.parser.Tag tag14 = document9.tag();
        java.lang.String str15 = document9.nodeName();
        boolean boolean16 = document9.hasText();
        org.jsoup.nodes.Element element17 = document1.appendChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.previousElementSibling();
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document3.createElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.prependText("#document");
        boolean boolean9 = element5.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = element5.childNode((int) (short) 0);
        org.jsoup.nodes.Element element13 = element5.prepend(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element5.siblingElements();
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Node node6 = document1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.text("");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        java.lang.String str5 = element3.data();
        org.jsoup.nodes.Element element6 = element3.parent();
        org.jsoup.nodes.Element element9 = element3.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.html("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.Integer int12 = element11.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element11.siblingElements();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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
        org.jsoup.select.Elements elements35 = element30.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = element30.previousSibling();
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element11 = document1.parent();
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("#document", "hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str17 = document16.outerHtml();
        java.util.Set<java.lang.String> strSet18 = document16.classNames();
        org.jsoup.nodes.Element element19 = document1.classNames(strSet18);
        java.lang.String str21 = document1.absUrl("\n <hi!>\n </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.firstElementSibling();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        org.jsoup.select.Elements elements4 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("<#root>\n</#root><#root>\n</#root>");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.getElementById("hi!");
        java.lang.String str7 = document1.outerHtml();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str11 = document1.title();
        boolean boolean13 = document1.hasAttr("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.previousSibling();
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.lang.String str10 = document1.nodeName();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueContaining("<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.nextElementSibling();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        java.lang.Integer int11 = element6.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element6.empty();
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueNot("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!hi!");
        org.jsoup.nodes.Element element17 = element12.prepend("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = element17.siblingIndex();
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.select.Elements elements10 = element6.getElementsByTag("#document");
        java.lang.Integer int11 = element6.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.firstElementSibling();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str3 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.nodes.Element element5 = document1.createElement("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html><#document>\n</#document>");
        org.jsoup.nodes.Element element7 = element5.removeClass("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element7.nextSibling();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
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
        org.jsoup.nodes.Element element19 = element16.prependText("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.previousElementSibling();
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        org.jsoup.nodes.Document document15 = document1.normalise();
        org.jsoup.nodes.Element element17 = document15.toggleClass("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element19 = element17.prependText("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n &lt;#root&gt;  \n <html> \n  <head> \n   <title>&lt;#root&gt;\n&lt;/#root&gt;\n</title>\n  </head> \n  <body>\n    #document  \n  </body>\n </html>#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element19.siblingIndex();
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Element element10 = document1.toggleClass("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element10.nextSibling();
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("#root", "<#root>\n</#root>");
        org.jsoup.nodes.Node node13 = document1.removeAttr("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueEnding("<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>", "<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n &lt;hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&gt; &lt;/hi! &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.firstElementSibling();
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
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
        org.jsoup.select.Elements elements18 = element3.getElementsByAttributeValueEnding("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!", "<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        java.lang.String str19 = element3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element3.previousElementSibling();
    }
}

