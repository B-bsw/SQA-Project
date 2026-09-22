package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
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

    // -------------------------------------------------------------
    // Validation / Edge Cases: Null and Empty Inputs
    // -------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullHtml_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parse(null, BASE_URI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullBaseUri_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parse("<div></div>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullHtml_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parseBodyFragment(null, BASE_URI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullBaseUri_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parseBodyFragment("<div></div>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragmentRelaxed_givenNullHtml_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parseBodyFragmentRelaxed(null, BASE_URI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragmentRelaxed_givenNullBaseUri_shouldThrowException() {
        // Arrange, Act, Assert
        Parser.parseBodyFragmentRelaxed("<div></div>", null);
    }

    @Test
    public void parse_givenEmptyString_shouldReturnNormalisedDocument() {
        // Arrange
        String html = "";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
    }

    // -------------------------------------------------------------
    // Start Tag & Attribute Parsing
    // -------------------------------------------------------------

    @Test
    public void parse_givenDoubleQuotedAttribute_shouldParseValueCorrectly() {
        // Arrange
        String html = "<a href=\"http://test.com\" title=\"Link\">Test</a>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element link = doc.select("a").first();

        // Assert
        Assert.assertNotNull(link);
        Assert.assertEquals("http://test.com", link.attr("href"));
        Assert.assertEquals("Link", link.attr("title"));
        Assert.assertEquals("Test", link.text());
    }

    @Test
    public void parse_givenSingleQuotedAttribute_shouldParseValueCorrectly() {
        // Arrange
        String html = "<a href='http://test.com' title='Link'>Test</a>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element link = doc.select("a").first();

        // Assert
        Assert.assertNotNull(link);
        Assert.assertEquals("http://test.com", link.attr("href"));
        Assert.assertEquals("Link", link.attr("title"));
    }

    @Test
    public void parse_givenUnquotedAttribute_shouldParseValueCorrectly() {
        // Arrange
        String html = "<input type=text name=username required>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element input = doc.select("input").first();

        // Assert
        Assert.assertNotNull(input);
        Assert.assertEquals("text", input.attr("type"));
        Assert.assertEquals("username", input.attr("name"));
        Assert.assertTrue(input.hasAttr("required"));
    }

    @Test
    public void parse_givenEmptyAttributeKey_shouldGracefullySkipInvalidChars() {
        // Arrange: Attribute starting with an invalid character "="
        String html = "<div =invalid name=\"valid\">Text</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals("valid", div.attr("name"));
    }

    @Test
    public void parse_givenSelfClosingKnownTag_shouldNotPushToStack() {
        // Arrange
        String html = "<div><img src=\"foo.jpg\" /><span>After</span></div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("img", div.child(0).tagName());
        Assert.assertEquals("span", div.child(1).tagName());
    }

    @Test
    public void parse_givenSelfClosingUnknownTag_shouldMarkAsSelfClosing() {
        // Arrange
        String html = "<custom-tag id=\"1\" /><div>Next</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element custom = doc.select("custom-tag").first();
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(custom);
        Assert.assertNotNull(div);
        Assert.assertEquals(div.parent(), custom.parent());
    }

    // -------------------------------------------------------------
    // Data Tags Parsing (script, style, title, textarea)
    // -------------------------------------------------------------

    @Test
    public void parse_givenScriptTag_shouldCreateDataNodeWithRawContent() {
        // Arrange
        String html = "<script>var a = 1; if (a < 2) { alert(\"hello\"); }</script>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element script = doc.select("script").first();

        // Assert
        Assert.assertNotNull(script);
        List<Node> childNodes = script.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof DataNode);
        DataNode dataNode = (DataNode) childNodes.get(0);
        Assert.assertTrue(dataNode.getWholeData().contains("alert(\"hello\");"));
    }

    @Test
    public void parse_givenTitleTag_shouldCreateTextNodeFromEncoded() {
        // Arrange
        String html = "<title>Page &amp; Title</title>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element title = doc.select("title").first();

        // Assert
        Assert.assertNotNull(title);
        List<Node> childNodes = title.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof TextNode);
        Assert.assertEquals("Page & Title", title.text());
    }

    @Test
    public void parse_givenTextareaTag_shouldCreateTextNodeFromEncoded() {
        // Arrange
        String html = "<textarea>Sample &lt;value&gt;</textarea>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element textarea = doc.select("textarea").first();

        // Assert
        Assert.assertNotNull(textarea);
        List<Node> childNodes = textarea.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof TextNode);
        Assert.assertEquals("Sample <value>", textarea.text());
    }

    // -------------------------------------------------------------
    // Base URI Tag Handling
    // -------------------------------------------------------------

    @Test
    public void parse_givenBaseHrefTag_shouldUpdateDocumentBaseUri() {
        // Arrange
        String html = "<html><head><base href=\"http://bar.com/path/\"></head><body><a href=\"sub\">Link</a></body></html>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element link = doc.select("a").first();

        // Assert
        Assert.assertEquals("http://bar.com/path/", doc.baseUri());
        Assert.assertEquals("http://bar.com/path/sub", link.absUrl("href"));
    }

    @Test
    public void parse_givenBaseTagWithoutHref_shouldNotChangeBaseUri() {
        // Arrange
        String html = "<html><head><base target=\"_blank\"></head><body></body></html>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Assert.assertEquals(BASE_URI, doc.baseUri());
    }

    // -------------------------------------------------------------
    // Comments, CDATA, and XML Declarations
    // -------------------------------------------------------------

    @Test
    public void parse_givenStandardComment_shouldParseCorrectly() {
        // Arrange
        String html = "<div><!-- This is a comment -->Content</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Node commentNode = div.childNode(0);
        Assert.assertTrue(commentNode instanceof Comment);
        Comment comment = (Comment) commentNode;
        Assert.assertEquals(" This is a comment ", comment.getData());
    }

    @Test
    public void parse_givenCommentEndingWithHyphen_shouldStripHyphenCorrectly() {
        // Arrange: comment closed as "--->" where data ends with "-" before "->"
        String html = "<div><!--- Comment with extra hyphen ---></div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Node commentNode = div.childNode(0);
        Assert.assertTrue(commentNode instanceof Comment);
        Comment comment = (Comment) commentNode;
        Assert.assertEquals("- Comment with extra hyphen --", comment.getData());
    }

    @Test
    public void parse_givenCdata_shouldParseAsTextNode() {
        // Arrange
        String html = "<div><![CDATA[Some <raw> data & entities]]></div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Node textNode = div.childNode(0);
        Assert.assertTrue(textNode instanceof TextNode);
        Assert.assertEquals("Some <raw> data & entities", ((TextNode) textNode).getWholeText());
    }

    @Test
    public void parse_givenXmlDeclarationWithQuestionMark_shouldParseAsXmlDecl() {
        // Arrange
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><div>Content</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        List<Node> childNodes = doc.childNodes();

        // Assert
        XmlDeclaration xmlDecl = null;
        for (int i = 0; i < childNodes.size(); i++) {
            if (childNodes.get(i) instanceof XmlDeclaration) {
                xmlDecl = (XmlDeclaration) childNodes.get(i);
                break;
            }
        }
        Assert.assertNotNull(xmlDecl);
        Assert.assertTrue(xmlDecl.getWholeDeclaration().startsWith("?xml"));
    }

    @Test
    public void parse_givenDocTypeOrProcessingInstructionWithExclamation_shouldParseAsProcInstr() {
        // Arrange
        String html = "<!DOCTYPE html><html><body>Content</body></html>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        List<Node> childNodes = doc.childNodes();

        // Assert
        XmlDeclaration decl = null;
        for (int i = 0; i < childNodes.size(); i++) {
            if (childNodes.get(i) instanceof XmlDeclaration) {
                decl = (XmlDeclaration) childNodes.get(i);
                break;
            }
        }
        Assert.assertNotNull(decl);
        Assert.assertTrue(decl.getWholeDeclaration().startsWith("!DOCTYPE"));
    }

    // -------------------------------------------------------------
    // Text Nodes & Special Characters
    // -------------------------------------------------------------

    @Test
    public void parse_givenDanglingLessThanChar_shouldParseAsTextNode() {
        // Arrange: "< " does not match start tag because space is not a valid tag start
        String html = "<div>hello < there</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals("hello < there", div.text());
    }

    // -------------------------------------------------------------
    // End Tags & Stack Closing
    // -------------------------------------------------------------

    @Test
    public void parse_givenUnmatchedEndTag_shouldIgnoreGracefully() {
        // Arrange
        String html = "<div><p>Paragraph</p></span></div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals(1, div.select("p").size());
    }

    @Test
    public void parse_givenEndTagWithEmptyName_shouldIgnore() {
        // Arrange
        String html = "<div>Text</>More text</div>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element div = doc.select("div").first();

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals("TextMore text", div.text());
    }

    @Test
    public void parse_givenCloseTagForBodyOrHtml_shouldNotPopPastBodyOrHtml() {
        // Arrange
        String html = "<html><body><div>Test</div></body></html>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Test", doc.body().text());
    }

    // -------------------------------------------------------------
    // Implicit Parent Creation & Relaxed Mode
    // -------------------------------------------------------------

    @Test
    public void parse_givenOrphanListItem_shouldWrapInImplicitParent() {
        // Arrange: <li> requires <ul> or <ol> as parent
        String html = "<li>Item 1</li><li>Item 2</li>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Elements lists = doc.select("ul");
        Assert.assertTrue(lists.size() > 0);
        Assert.assertEquals(2, doc.select("li").size());
    }

    @Test
    public void parse_givenExplicitBodyWithoutHead_shouldImplicitlyCreateHeadFirst() {
        // Arrange
        String html = "<body><div>Content</div></body>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Content", doc.body().text());
    }

    @Test
    public void parseBodyFragment_givenFragment_shouldPlaceInBody() {
        // Arrange
        String fragment = "<p>Fragment text</p>";

        // Act
        Document doc = Parser.parseBodyFragment(fragment, BASE_URI);

        // Assert
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("<p>Fragment text</p>", doc.body().html().trim());
    }

    @Test
    public void parseBodyFragmentRelaxed_givenFragment_shouldNotForceImplicitContainers() {
        // Arrange: <td> typically requires <table>/<tr>, but relaxed should bypass implicit creation
        String fragment = "<td>Table Cell</td>";

        // Act
        Document doc = Parser.parseBodyFragmentRelaxed(fragment, BASE_URI);

        // Assert
        Assert.assertNotNull(doc.body());
        Assert.assertTrue(doc.body().html().contains("Table Cell"));
    }

    // -------------------------------------------------------------
    // Nesting & Container Resolution
    // -------------------------------------------------------------

    @Test
    public void parse_givenNestedTags_shouldPopStackToSuitableContainer() {
        // Arrange: <p> cannot contain block element <div> in standard HTML
        String html = "<p>Text 1<div>Text in Div</div>Text 2</p>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);
        Element body = doc.body();

        // Assert
        Assert.assertNotNull(body.select("div").first());
        Assert.assertTrue(body.text().contains("Text 1"));
        Assert.assertTrue(body.text().contains("Text in Div"));
    }

    @Test
    public void parse_givenDeeplyNestedValidStructure_shouldParseAccurately() {
        // Arrange
        String html = "<html><head><title>Test Title</title></head><body><div id=\"outer\"><div id=\"inner\"><span>Deep</span></div></div></body></html>";

        // Act
        Document doc = Parser.parse(html, BASE_URI);

        // Assert
        Assert.assertEquals("Test Title", doc.title());
        Element outer = doc.getElementById("outer");
        Assert.assertNotNull(outer);
        Element inner = outer.getElementById("inner");
        Assert.assertNotNull(inner);
        Assert.assertEquals("Deep", inner.text());
    }
}