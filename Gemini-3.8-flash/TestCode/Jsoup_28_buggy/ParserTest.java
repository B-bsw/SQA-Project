package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Test Matrix & Execution Suite for {@link Parser}
 *
 * Phase 1 - Code Analysis & Test Matrix:
 * -----------------------------------------------------------------------------------------
 * 1. Happy Path:
 *    - constructor_givenTreeBuilder_shouldInitializeCorrectly
 *    - parseInput_givenTrackErrorsDisabled_shouldParseWithoutErrorTracking
 *    - parseInput_givenTrackErrorsEnabled_shouldTrackParseErrors
 *    - getTreeBuilder_setTreeBuilder_shouldUpdateAndChain
 *    - isTrackErrors_setTrackErrors_shouldUpdateFlagAndChain
 *    - parse_givenValidHtml_shouldReturnParsedDocument
 *    - parseFragment_givenHtmlAndContext_shouldReturnNodesList
 *    - parseFragment_givenNullContext_shouldReturnNodesList
 *    - parseBodyFragment_givenBodyHtml_shouldReturnDocumentWithBodyChildren
 *    - parseBodyFragmentRelaxed_givenBodyHtml_shouldReturnParsedDocument
 *    - htmlParser_givenFactoryMethod_shouldReturnParserWithHtmlTreeBuilder
 *    - xmlParser_givenFactoryMethod_shouldReturnParserWithXmlTreeBuilder
 *
 * 2. Boundary & Edge Cases:
 *    - isTrackErrors_givenZeroMaxErrors_shouldReturnFalse
 *    - isTrackErrors_givenNegativeMaxErrors_shouldReturnFalse
 *    - isTrackErrors_givenPositiveMaxErrors_shouldReturnTrue
 *    - parseInput_givenEmptyString_shouldReturnEmptyDocument
 *    - parseBodyFragment_givenEmptyHtml_shouldCreateEmptyBodyDocument
 *    - parseBodyFragment_givenMultipleNodes_shouldAppendAllNodesToBody
 *    - getErrors_beforeParsing_shouldReturnNull
 *
 * 3. Error & Exception Branches:
 *    - parseInput_givenNullHtml_shouldThrowException
 *    - parseInput_givenNullTreeBuilder_shouldThrowException
 * -----------------------------------------------------------------------------------------
 */
public class ParserTest {

    @Test
    public void constructor_givenTreeBuilder_shouldInitializeCorrectly() {
        // Arrange
        TreeBuilder tb = new HtmlTreeBuilder();

        // Act
        Parser parser = new Parser(tb);

        // Assert
        Assert.assertSame(tb, parser.getTreeBuilder());
        Assert.assertFalse(parser.isTrackErrors());
        Assert.assertNull(parser.getErrors());
    }

    @Test
    public void getTreeBuilder_setTreeBuilder_shouldUpdateAndChain() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        TreeBuilder newBuilder = new XmlTreeBuilder();

        // Act
        Parser chainedParser = parser.setTreeBuilder(newBuilder);

        // Assert
        Assert.assertSame(parser, chainedParser);
        Assert.assertSame(newBuilder, parser.getTreeBuilder());
    }

    @Test
    public void isTrackErrors_givenDefaultState_shouldReturnFalse() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act & Assert
        Assert.assertFalse(parser.isTrackErrors());
    }

    @Test
    public void isTrackErrors_givenZeroMaxErrors_shouldReturnFalse() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        parser.setTrackErrors(0);

        // Assert
        Assert.assertFalse(parser.isTrackErrors());
    }

    @Test
    public void isTrackErrors_givenNegativeMaxErrors_shouldReturnFalse() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        parser.setTrackErrors(-1);

        // Assert
        Assert.assertFalse(parser.isTrackErrors());
    }

    @Test
    public void isTrackErrors_givenPositiveMaxErrors_shouldReturnTrue() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        Parser chainedParser = parser.setTrackErrors(50);

        // Assert
        Assert.assertSame(parser, chainedParser);
        Assert.assertTrue(parser.isTrackErrors());
    }

    @Test
    public void getErrors_beforeParse_shouldReturnNull() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act & Assert
        Assert.assertNull(parser.getErrors());
    }

    @Test
    public void parseInput_givenTrackErrorsDisabled_shouldParseWithoutErrorTracking() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(0);
        String html = "<p>Test paragraph";
        String baseUri = "http://example.com";

        // Act
        Document doc = parser.parseInput(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com", doc.baseUri());
        Assert.assertNotNull(parser.getErrors());
        Assert.assertTrue(parser.getErrors().isEmpty());
    }

    @Test
    public void parseInput_givenTrackErrorsEnabled_shouldTrackParseErrors() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(10);
        String malformedHtml = "<html><head><title>Unclosed</head><body><p>Text</div></body></html>";
        String baseUri = "http://example.com";

        // Act
        Document doc = parser.parseInput(malformedHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        List<ParseError> errors = parser.getErrors();
        Assert.assertNotNull(errors);
        Assert.assertTrue(errors.size() > 0);
        Assert.assertTrue(errors.size() <= 10);
    }

    @Test
    public void parseInput_givenEmptyString_shouldReturnEmptyDocument() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        String html = "";
        String baseUri = "";

        // Act
        Document doc = parser.parseInput(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.body().html());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInput_givenNullHtml_shouldThrowException() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        parser.parseInput(null, "http://example.com");
    }

    @Test(expected = NullPointerException.class)
    public void parseInput_givenNullTreeBuilder_shouldThrowException() {
        // Arrange
        Parser parser = new Parser(null);

        // Act
        parser.parseInput("<p>Test</p>", "http://example.com");
    }

    @Test
    public void parse_givenValidHtmlAndBaseUri_shouldReturnParsedDocument() {
        // Arrange
        String html = "<div><span>Content</span></div>";
        String baseUri = "http://example.com/dir/";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Content", doc.select("span").text());
        Assert.assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void parseFragment_givenContextElement_shouldReturnParsedNodes() {
        // Arrange
        String fragmentHtml = "<div>Row 1</div><div>Row 2</div>";
        Document doc = Document.createShell("http://example.com");
        Element context = doc.body();

        // Act
        List<Node> nodes = Parser.parseFragment(fragmentHtml, context, "http://example.com");

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Element);
        Assert.assertEquals("div", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void parseFragment_givenNullContext_shouldReturnParsedNodes() {
        // Arrange
        String fragmentHtml = "<p>Item 1</p><p>Item 2</p>";

        // Act
        List<Node> nodes = Parser.parseFragment(fragmentHtml, null, "http://example.com");

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
    }

    @Test
    public void parseBodyFragment_givenMultipleNodes_shouldAppendAllNodesToBody() {
        // Arrange
        String bodyHtml = "<h1>Title</h1><p>Description</p>";
        String baseUri = "http://example.com";

        // Act
        Document doc = Parser.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(baseUri, doc.baseUri());
        Assert.assertEquals("Title", doc.select("h1").text());
        Assert.assertEquals("Description", doc.select("p").text());
        Assert.assertEquals(2, doc.body().children().size());
    }

    @Test
    public void parseBodyFragment_givenEmptyHtml_shouldCreateEmptyBodyDocument() {
        // Arrange
        String bodyHtml = "";
        String baseUri = "http://example.com";

        // Act
        Document doc = Parser.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(0, doc.body().childNodes().size());
    }

    @Test
    public void parseBodyFragmentRelaxed_givenBodyHtml_shouldReturnParsedDocument() {
        // Arrange
        String bodyHtml = "<div id=\"content\">Relaxed parsing</div>";
        String baseUri = "http://example.com";

        // Act
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Relaxed parsing", doc.getElementById("content").text());
    }

    @Test
    public void htmlParser_givenFactoryMethod_shouldReturnParserWithHtmlTreeBuilder() {
        // Act
        Parser parser = Parser.htmlParser();

        // Assert
        Assert.assertNotNull(parser);
        Assert.assertNotNull(parser.getTreeBuilder());
        Assert.assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
        Assert.assertFalse(parser.isTrackErrors());
    }

    @Test
    public void xmlParser_givenFactoryMethod_shouldReturnParserWithXmlTreeBuilder() {
        // Act
        Parser parser = Parser.xmlParser();

        // Assert
        Assert.assertNotNull(parser);
        Assert.assertNotNull(parser.getTreeBuilder());
        Assert.assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder);
        Assert.assertFalse(parser.isTrackErrors());
    }

    @Test
    public void xmlParser_givenXmlInput_shouldParseProperXmlTree() {
        // Arrange
        Parser parser = Parser.xmlParser();
        String xml = "<rss><channel><title>News</title></channel></rss>";

        // Act
        Document doc = parser.parseInput(xml, "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.children().size());
        Assert.assertEquals("rss", doc.child(0).tagName());
        Assert.assertEquals("News", doc.getElementsByTag("title").text());
    }
}