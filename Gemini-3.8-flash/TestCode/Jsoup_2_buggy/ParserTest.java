package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ParserTest {

    private static final String BASE_URI = "http://example.com/";

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullHtml_shouldThrowException() {
        Parser.parse(null, BASE_URI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullBaseUri_shouldThrowException() {
        Parser.parse("<p>Hello</p>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullHtml_shouldThrowException() {
        Parser.parseBodyFragment(null, BASE_URI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullBaseUri_shouldThrowException() {
        Parser.parseBodyFragment("<p>Hello</p>", null);
    }

    @Test
    public void parse_givenEmptyString_shouldReturnEmptyDocument() {
        Document doc = Parser.parse("", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals(BASE_URI, doc.baseUri());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void parse_givenStandardHtml_shouldParseElementsCorrectly() {
        String html = "<html><head><title>Test Title</title></head><body><p class=\"intro\">Hello World</p></body></html>";
        Document doc = Parser.parse(html, BASE_URI);

        Assert.assertNotNull(doc);
        Assert.assertEquals("Test Title", doc.title());
        Elements paragraphs = doc.getElementsByTag("p");
        Assert.assertEquals(1, paragraphs.size());
        Element p = paragraphs.get(0);
        Assert.assertEquals("intro", p.attr("class"));
        Assert.assertEquals("Hello World", p.text());
    }

    @Test
    public void parseBodyFragment_givenFragment_shouldPopulateBody() {
        String fragment = "<div id=\"content\"><p>Fragment Paragraph</p></div>";
        Document doc = Parser.parseBodyFragment(fragment, BASE_URI);

        Assert.assertNotNull(doc);
        Element div = doc.getElementById("content");
        Assert.assertNotNull(div);
        Assert.assertEquals("Fragment Paragraph", div.text());
        Assert.assertEquals("div", div.tagName());
    }

    @Test
    public void parse_givenNormalComment_shouldParseCommentNode() {
        String html = "<div><!-- This is a regular comment --></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertTrue(div.childNodes().size() > 0);
        Node node = div.childNodes().get(0);
        Assert.assertTrue(node instanceof Comment);
        Comment comment = (Comment) node;
        Assert.assertEquals(" This is a regular comment ", comment.getData());
    }

    @Test
    public void parse_givenCommentWithTrailingHyphen_shouldTrimTrailingHyphen() {
        String html = "<div><!-- Comment ending with hyphen---></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertTrue(div.childNodes().size() > 0);
        Node node = div.childNodes().get(0);
        Assert.assertTrue(node instanceof Comment);
        Comment comment = (Comment) node;
        Assert.assertEquals(" Comment ending with hyphen--", comment.getData());
    }

    @Test
    public void parse_givenCdataSection_shouldCreateUnescapedTextNode() {
        String html = "<div><![CDATA[raw <unescaped> & data]]></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertTrue(div.childNodes().size() > 0);
        Node node = div.childNodes().get(0);
        Assert.assertTrue(node instanceof TextNode);
        TextNode textNode = (TextNode) node;
        Assert.assertEquals("raw <unescaped> & data", textNode.getWholeText());
    }

    @Test
    public void parse_givenXmlDeclaration_shouldParseXmlDeclarationNode() {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><html><body>Content</body></html>";
        Document doc = Parser.parse(html, BASE_URI);

        List<Node> childNodes = doc.childNodes();
        boolean foundDecl = false;
        for (int i = 0; i < childNodes.size(); i++) {
            Node child = childNodes.get(i);
            if (child instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) child;
                Assert.assertFalse(decl.toString().contains("<!"));
                foundDecl = true;
                break;
            }
        }
        Assert.assertTrue(foundDecl);
    }

    @Test
    public void parse_givenDocTypeProcessingInstruction_shouldParseXmlDeclarationNode() {
        String html = "<!DOCTYPE html><html><body>Test</body></html>";
        Document doc = Parser.parse(html, BASE_URI);

        List<Node> childNodes = doc.childNodes();
        boolean foundDocType = false;
        for (int i = 0; i < childNodes.size(); i++) {
            Node child = childNodes.get(i);
            if (child instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) child;
                Assert.assertTrue(decl.toString().startsWith("<!"));
                foundDocType = true;
                break;
            }
        }
        Assert.assertTrue(foundDocType);
    }

    @Test
    public void parse_givenBogusStartTag_shouldFallbackToTextNode() {
        String html = "<div>< 5 is less than 10</div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertTrue(div.text().contains("< 5 is less than 10") || div.text().contains("&lt; 5 is less than 10"));
    }

    @Test
    public void parse_givenAttributesVariants_shouldParseCorrectValues() {
        String html = "<div id='single' class=\"double\" data-val=unquoted disabled></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertEquals("single", div.attr("id"));
        Assert.assertEquals("double", div.attr("class"));
        Assert.assertEquals("unquoted", div.attr("data-val"));
        Assert.assertTrue(div.hasAttr("disabled"));
    }

    @Test
    public void parse_givenAttributeWithMalformedKey_shouldSkipUnknownCharAndContinue() {
        String html = "<div =invalid id=\"valid\">Test</div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertEquals("valid", div.attr("id"));
        Assert.assertEquals("Test", div.text());
    }

    @Test
    public void parse_givenSelfClosingEmptyTag_shouldNotStayOnStack() {
        String html = "<div><img src=\"foo.jpg\" /><p>Next</p></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("img", div.child(0).tagName());
        Assert.assertEquals("p", div.child(1).tagName());
    }

    @Test
    public void parse_givenSelfClosingNonEmptyTag_shouldCloseImmediately() {
        String html = "<div><span class=\"item\"/><p>Next</p></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("span", div.child(0).tagName());
        Assert.assertEquals("p", div.child(1).tagName());
    }

    @Test
    public void parse_givenTitleDataTag_shouldStoreAsTextNode() {
        String html = "<title>Rock &amp; Roll</title>";
        Document doc = Parser.parse(html, BASE_URI);

        Element title = doc.getElementsByTag("title").get(0);
        Assert.assertEquals(1, title.childNodes().size());
        Node child = title.childNodes().get(0);
        Assert.assertTrue(child instanceof TextNode);
        Assert.assertEquals("Rock & Roll", ((TextNode) child).text());
    }

    @Test
    public void parse_givenTextareaDataTag_shouldStoreAsTextNode() {
        String html = "<textarea>Sample &lt;tag&gt; Text</textarea>";
        Document doc = Parser.parse(html, BASE_URI);

        Element textarea = doc.getElementsByTag("textarea").get(0);
        Assert.assertEquals(1, textarea.childNodes().size());
        Node child = textarea.childNodes().get(0);
        Assert.assertTrue(child instanceof TextNode);
        Assert.assertEquals("Sample <tag> Text", ((TextNode) child).text());
    }

    @Test
    public void parse_givenScriptDataTag_shouldStoreAsDataNode() {
        String html = "<script>var a = 1 < 2 ? \"yes\" : \"no\";</script>";
        Document doc = Parser.parse(html, BASE_URI);

        Element script = doc.getElementsByTag("script").get(0);
        Assert.assertEquals(1, script.childNodes().size());
        Node child = script.childNodes().get(0);
        Assert.assertTrue(child instanceof DataNode);
        Assert.assertEquals("var a = 1 < 2 ? \"yes\" : \"no\";", ((DataNode) child).getWholeData());
    }

    @Test
    public void parse_givenBaseTagWithHref_shouldUpdateBaseUri() {
        String html = "<html><head><base href=\"http://example.org/path/\"><link href=\"style.css\"></head><body><a href=\"sub.html\">Link</a></body></html>";
        Document doc = Parser.parse(html, BASE_URI);

        Assert.assertEquals("http://example.org/path/", doc.baseUri());
        Element a = doc.getElementsByTag("a").get(0);
        Assert.assertEquals("http://example.org/path/sub.html", a.absUrl("href"));
    }

    @Test
    public void parse_givenBaseTagWithoutHref_shouldIgnoreBaseUriUpdate() {
        String html = "<html><head><base target=\"_blank\"></head><body><p>Test</p></body></html>";
        Document doc = Parser.parse(html, BASE_URI);

        Assert.assertEquals(BASE_URI, doc.baseUri());
    }

    @Test
    public void parse_givenEmptyEndTag_shouldIgnoreGracefully() {
        String html = "<p>Paragraph</></p>";
        Document doc = Parser.parse(html, BASE_URI);

        Element p = doc.getElementsByTag("p").get(0);
        Assert.assertEquals("Paragraph", p.text());
    }

    @Test
    public void parse_givenMismatchedEndTag_shouldIgnoreAndNotPopRoot() {
        String html = "<div><p>Text</span></p></div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element p = doc.getElementsByTag("p").get(0);
        Assert.assertEquals("Text", p.text());
        Assert.assertEquals("div", p.parent().tagName());
    }

    @Test
    public void parse_givenEndTagForBodyOrHtml_shouldNotClosePastBoundary() {
        String html = "<html><head></head><body><p>Hello</body></html></p>";
        Document doc = Parser.parse(html, BASE_URI);

        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Hello", doc.body().text());
    }

    @Test
    public void parse_givenOnlyBodyTag_shouldCreateImplicitHeadAndHtml() {
        String html = "<body><p>Body without Html or Head</p></body>";
        Document doc = Parser.parse(html, BASE_URI);

        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(1, doc.getElementsByTag("p").size());
        Assert.assertEquals("Body without Html or Head", doc.getElementsByTag("p").get(0).text());
    }

    @Test
    public void parse_givenIsolatedTableCells_shouldCreateImplicitParents() {
        String html = "<td>Lone Cell</td>";
        Document doc = Parser.parse(html, BASE_URI);

        Elements cells = doc.getElementsByTag("td");
        Assert.assertEquals(1, cells.size());
        Element cell = cells.get(0);
        Assert.assertEquals("Lone Cell", cell.text());

        Assert.assertNotNull(doc.getElementsByTag("table"));
        Assert.assertTrue(doc.getElementsByTag("table").size() > 0);
    }

    @Test
    public void parse_givenMultipleSiblingsAndUnclosedTags_shouldAutoCloseOnSuitableContainer() {
        String html = "<div><p>Line 1<p>Line 2</div>";
        Document doc = Parser.parse(html, BASE_URI);

        Element div = doc.getElementsByTag("div").get(0);
        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("Line 1", div.child(0).text());
        Assert.assertEquals("Line 2", div.child(1).text());
    }

    @Test
    public void parse_givenInterleavedHtmlTags_shouldConstructValidTree() {
        String html = "<ul><li>Item 1<li>Item 2</li><li>Item 3</ul>";
        Document doc = Parser.parse(html, BASE_URI);

        Elements items = doc.getElementsByTag("li");
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("Item 1", items.get(0).text());
        Assert.assertEquals("Item 2", items.get(1).text());
        Assert.assertEquals("Item 3", items.get(2).text());
    }

    @Test
    public void parse_givenHtmlWithMultipleCommentsAndTextNodes_shouldPreserveOrder() {
        String html = "<p>First<!-- comment -->Second<![CDATA[cdata]]>Third</p>";
        Document doc = Parser.parse(html, BASE_URI);

        Element p = doc.getElementsByTag("p").get(0);
        List<Node> children = p.childNodes();
        Assert.assertEquals(4, children.size());
        Assert.assertTrue(children.get(0) instanceof TextNode);
        Assert.assertEquals("First", ((TextNode) children.get(0)).text());
        Assert.assertTrue(children.get(1) instanceof Comment);
        Assert.assertEquals(" comment ", ((Comment) children.get(1)).getData());
        Assert.assertTrue(children.get(2) instanceof TextNode);
        Assert.assertEquals("Second", ((TextNode) children.get(2)).text());
        Assert.assertTrue(children.get(3) instanceof TextNode);
        Assert.assertEquals("cdataThird", ((TextNode) children.get(3)).text().trim());
    }
}