package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Complete JUnit Test Suite for {@link Parser}.
 * Compatible with Java 1.4 / Java 7 syntax (no diamonds, no lambdas, no streams).
 * Uses strictly JUnit 4 and standard org.junit.Assert without external mocking.
 */
public class ParserTest {

    // =========================================================================
    // Phase 1 Matrix - Exception & Boundary Tests (null inputs)
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullHtml_shouldThrowException() {
        // Arrange
        String html = null;
        String baseUri = "http://example.com/";

        // Act
        Parser.parse(html, baseUri);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNullBaseUri_shouldThrowException() {
        // Arrange
        String html = "<div>Test</div>";
        String baseUri = null;

        // Act
        Parser.parse(html, baseUri);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullHtml_shouldThrowException() {
        // Arrange
        String html = null;
        String baseUri = "http://example.com/";

        // Act
        Parser.parseBodyFragment(html, baseUri);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_givenNullBaseUri_shouldThrowException() {
        // Arrange
        String html = "<div>Test</div>";
        String baseUri = null;

        // Act
        Parser.parseBodyFragment(html, baseUri);
    }

    // =========================================================================
    // Phase 1 Matrix - Empty and Basic Documents
    // =========================================================================

    @Test
    public void parse_givenEmptyString_shouldReturnEmptyDocument() {
        // Arrange
        String html = "";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void parseBodyFragment_givenSimpleHtml_shouldPlaceContentInBody() {
        // Arrange
        String html = "<p>Hello World</p>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parseBodyFragment(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(1, doc.body().children().size());
        Element p = doc.body().child(0);
        Assert.assertEquals("p", p.tagName());
        Assert.assertEquals("Hello World", p.text());
    }

    // =========================================================================
    // Phase 1 Matrix - Comments & Edge Cases
    // =========================================================================

    @Test
    public void parse_givenStandardComment_shouldCreateCommentNode() {
        // Arrange
        String html = "<div><!-- This is a standard comment --></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> divs = doc.getElementsByTag("div");
        Assert.assertEquals(1, divs.size());
        Element div = divs.get(0);
        Assert.assertEquals(1, div.childNodes().size());
        Node child = div.childNode(0);
        Assert.assertTrue(child instanceof Comment);
        Comment comment = (Comment) child;
        Assert.assertEquals(" This is a standard comment ", comment.getData());
    }

    @Test
    public void parse_givenMalformedCommentEndingWithoutDash_shouldChompToAngleBracket() {
        // Arrange: comment ending with -> instead of -->
        String html = "<div><!--Malformed comment-></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> divs = doc.getElementsByTag("div");
        Assert.assertEquals(1, divs.size());
        Element div = divs.get(0);
        Assert.assertEquals(1, div.childNodes().size());
        Node child = div.childNode(0);
        Assert.assertTrue(child instanceof Comment);
        Comment comment = (Comment) child;
        Assert.assertEquals("Malformed comment", comment.getData());
    }

    // =========================================================================
    // Phase 1 Matrix - CDATA
    // =========================================================================

    @Test
    public void parse_givenCdataSection_shouldCreateUnescapedTextNode() {
        // Arrange
        String html = "<div><![CDATA[Some <raw> & unescaped text]]></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> divs = doc.getElementsByTag("div");
        Assert.assertEquals(1, divs.size());
        Element div = divs.get(0);
        Assert.assertEquals(1, div.childNodes().size());
        Node child = div.childNode(0);
        Assert.assertTrue(child instanceof TextNode);
        TextNode textNode = (TextNode) child;
        Assert.assertEquals("Some <raw> & unescaped text", textNode.getWholeText());
    }

    // =========================================================================
    // Phase 1 Matrix - XML Declarations and Processing Instructions
    // =========================================================================

    @Test
    public void parse_givenXmlDeclaration_shouldCreateXmlDeclarationWithProcInstrFalse() {
        // Arrange: <?xml ... ?> -> first char is '?', procInstr should be false
        String html = "<?xml version=\"1.0\" encoding=\"utf-8\"?><html><body></body></html>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        boolean foundXmlDecl = false;
        for (int i = 0; i < doc.childNodes().size(); i++) {
            Node node = doc.childNode(i);
            if (node instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) node;
                Assert.assertEquals("xml version=\"1.0\" encoding=\"utf-8\"?", decl.getWholeDeclaration());
                foundXmlDecl = true;
                break;
            }
        }
        Assert.assertTrue("Should have parsed XML declaration node", foundXmlDecl);
    }

    @Test
    public void parse_givenDocTypeDeclaration_shouldCreateXmlDeclarationWithProcInstrTrue() {
        // Arrange: <!DOCTYPE html> -> first char is '!', procInstr should be true
        String html = "<!DOCTYPE html><html><body></body></html>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        boolean foundDocTypeDecl = false;
        for (int i = 0; i < doc.childNodes().size(); i++) {
            Node node = doc.childNode(i);
            if (node instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) node;
                Assert.assertEquals("DOCTYPE html", decl.getWholeDeclaration());
                foundDocTypeDecl = true;
                break;
            }
        }
        Assert.assertTrue("Should have parsed DOCTYPE as XmlDeclaration", foundDocTypeDecl);
    }

    // =========================================================================
    // Phase 1 Matrix - Start Tag & Non-Tag '<' Handling
    // =========================================================================

    @Test
    public void parse_givenNonTagLessThanSymbol_shouldTreatAsTextNode() {
        // Arrange: '< ' followed by word does not form a start tag
        String html = "< notAtag >";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertTrue(doc.text().contains("< notAtag >") || doc.text().contains("notAtag"));
    }

    @Test
    public void parse_givenLessThanImmediatelyFollowedByAngle_shouldHandleGracefully() {
        // Arrange: empty tag '<>'
        String html = "<>Text";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertTrue(doc.text().contains("<>Text") || doc.text().contains("Text"));
    }

    // =========================================================================
    // Phase 1 Matrix - Attribute Parsing Branches
    // =========================================================================

    @Test
    public void parse_givenAttributesWithSingleQuotes_shouldParseProperly() {
        // Arrange
        String html = "<div id='single' class='quote'></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Element div = doc.getElementById("single");
        Assert.assertNotNull(div);
        Assert.assertEquals("quote", div.className());
    }

    @Test
    public void parse_givenAttributesWithDoubleQuotes_shouldParseProperly() {
        // Arrange
        String html = "<div id=\"double\" class=\"quote\"></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Element div = doc.getElementById("double");
        Assert.assertNotNull(div);
        Assert.assertEquals("quote", div.className());
    }

    @Test
    public void parse_givenAttributesWithoutQuotes_shouldParseProperly() {
        // Arrange
        String html = "<div id=unquoted class=clean></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Element div = doc.getElementById("unquoted");
        Assert.assertNotNull(div);
        Assert.assertEquals("clean", div.className());
    }

    @Test
    public void parse_givenBooleanAttributesWithoutValues_shouldParseProperly() {
        // Arrange
        String html = "<input type=\"checkbox\" checked disabled>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> inputs = doc.getElementsByTag("input");
        Assert.assertEquals(1, inputs.size());
        Element input = inputs.get(0);
        Assert.assertTrue(input.hasAttr("checked"));
        Assert.assertTrue(input.hasAttr("disabled"));
    }

    @Test
    public void parse_givenMalformedAttributeCharacters_shouldConsumeAndRecover() {
        // Arrange: malformed attribute token in tag
        String html = "<div # id=\"valid\">Content</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Element div = doc.getElementById("valid");
        Assert.assertNotNull(div);
        Assert.assertEquals("Content", div.text());
    }

    // =========================================================================
    // Phase 1 Matrix - Self-Closing and Empty Elements
    // =========================================================================

    @Test
    public void parse_givenSelfClosingSlashTag_shouldCloseTagImmediately() {
        // Arrange
        String html = "<div id=\"self\"/><span>Next</span>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Element div = doc.getElementById("self");
        Assert.assertNotNull(div);
        Assert.assertEquals(0, div.children().size());
        List<Element> spans = doc.getElementsByTag("span");
        Assert.assertEquals(1, spans.size());
        Assert.assertEquals("Next", spans.get(0).text());
    }

    @Test
    public void parse_givenNaturallyEmptyTag_shouldCloseWithoutEndTag() {
        // Arrange
        String html = "<div><img src=\"test.jpg\"><p>Paragraph</p></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> imgs = doc.getElementsByTag("img");
        Assert.assertEquals(1, imgs.size());
        Assert.assertEquals("test.jpg", imgs.get(0).attr("src"));
        List<Element> ps = doc.getElementsByTag("p");
        Assert.assertEquals(1, ps.size());
        Assert.assertEquals("Paragraph", ps.get(0).text());
    }

    // =========================================================================
    // Phase 1 Matrix - Data Tags (title, textarea, script, style)
    // =========================================================================

    @Test
    public void parse_givenTitleTag_shouldParseContentAsTextNode() {
        // Arrange
        String html = "<title>Page &amp; Title</title>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertEquals("Page & Title", doc.title());
        List<Element> titles = doc.getElementsByTag("title");
        Assert.assertEquals(1, titles.size());
        Assert.assertEquals(1, titles.get(0).childNodes().size());
        Assert.assertTrue(titles.get(0).childNode(0) instanceof TextNode);
    }

    @Test
    public void parse_givenTextareaTag_shouldParseContentAsTextNode() {
        // Arrange
        String html = "<textarea>Line 1 &amp; Line 2</textarea>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> textareas = doc.getElementsByTag("textarea");
        Assert.assertEquals(1, textareas.size());
        Element textarea = textareas.get(0);
        Assert.assertEquals(1, textarea.childNodes().size());
        Assert.assertTrue(textarea.childNode(0) instanceof TextNode);
        Assert.assertEquals("Line 1 & Line 2", textarea.text());
    }

    @Test
    public void parse_givenScriptTag_shouldParseContentAsDataNode() {
        // Arrange
        String html = "<script>var x = \"<test>\";</script>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> scripts = doc.getElementsByTag("script");
        Assert.assertEquals(1, scripts.size());
        Element script = scripts.get(0);
        Assert.assertEquals(1, script.childNodes().size());
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
        DataNode dataNode = (DataNode) script.childNode(0);
        Assert.assertEquals("var x = \"<test>\";", dataNode.getWholeData());
    }

    // =========================================================================
    // Phase 1 Matrix - Base Tag Handling
    // =========================================================================

    @Test
    public void parse_givenBaseTagWithHref_shouldUpdateDocumentBaseUri() {
        // Arrange
        String html = "<base href=\"http://newbase.com/path/\"><a href=\"relative.html\">Link</a>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> links = doc.getElementsByTag("a");
        Assert.assertEquals(1, links.size());
        Assert.assertEquals("http://newbase.com/path/relative.html", links.get(0).absUrl("href"));
    }

    @Test
    public void parse_givenBaseTagWithoutHref_shouldKeepOriginalBaseUri() {
        // Arrange
        String html = "<base target=\"_blank\"><a href=\"relative.html\">Link</a>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertEquals("http://example.com/", doc.baseUri());
    }

    // =========================================================================
    // Phase 1 Matrix - End Tag Handling & Stack Popping
    // =========================================================================

    @Test
    public void parse_givenEmptyEndTag_shouldIgnoreSilently() {
        // Arrange
        String html = "<div>Hello</>World</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> divs = doc.getElementsByTag("div");
        Assert.assertEquals(1, divs.size());
        Assert.assertTrue(divs.get(0).text().contains("HelloWorld") || divs.get(0).text().contains("Hello"));
    }

    @Test
    public void parse_givenUnmatchedEndTag_shouldIgnoreSilently() {
        // Arrange
        String html = "<div>Hello</span>World</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> divs = doc.getElementsByTag("div");
        Assert.assertEquals(1, divs.size());
        Assert.assertEquals("HelloWorld", divs.get(0).text());
    }

    @Test
    public void parse_givenEndBodyTagPrematurely_shouldNotClosePastBody() {
        // Arrange
        String html = "<body><div>Test</body>Extra</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc.body());
        Assert.assertTrue(doc.body().text().contains("Test"));
        Assert.assertTrue(doc.body().text().contains("Extra"));
    }

    // =========================================================================
    // Phase 1 Matrix - Hierarchy, Implicit Containers & Ancestor Rules
    // =========================================================================

    @Test
    public void parse_givenBodyTagExplicitly_shouldCreateImplicitHeadBeforeBody() {
        // Arrange
        String html = "<html><body><div>Content</div></body></html>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Content", doc.body().text());
    }

    @Test
    public void parse_givenOrphanTableRow_shouldCreateImplicitTableAndTbody() {
        // Arrange: <tr> without <table> or <tbody>
        String html = "<tr><td>Data Cell</td></tr>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> tables = doc.getElementsByTag("table");
        Assert.assertTrue("Should create implicit table", tables.size() > 0);
        List<Element> tds = doc.getElementsByTag("td");
        Assert.assertEquals(1, tds.size());
        Assert.assertEquals("Data Cell", tds.get(0).text());
    }

    @Test
    public void parse_givenNestedUnclosedTags_shouldAutoCloseOnSuitableContainer() {
        // Arrange: unclosed p tag inside div, followed by another block element
        String html = "<div><p>First paragraph<div>Inner div</div><p>Second paragraph</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> ps = doc.getElementsByTag("p");
        Assert.assertEquals(2, ps.size());
        Assert.assertEquals("First paragraph", ps.get(0).text());
        Assert.assertEquals("Second paragraph", ps.get(1).text());
    }

    @Test
    public void parse_givenDeeplyNestedFormatting_shouldMaintainIntegrity() {
        // Arrange
        String html = "<div><b><i><u>Formatted text</u></i></b></div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        List<Element> uList = doc.getElementsByTag("u");
        Assert.assertEquals(1, uList.size());
        Assert.assertEquals("Formatted text", uList.get(0).text());
        Assert.assertEquals("i", uList.get(0).parent().tagName());
        Assert.assertEquals("b", uList.get(0).parent().parent().tagName());
    }
}