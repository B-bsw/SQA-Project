package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ParserTest {

    @Test
    public void constructor_givenTreeBuilder_shouldInitializeSettingsAndBuilder() {
        // Arrange
        TreeBuilder treeBuilder = new HtmlTreeBuilder();

        // Act
        Parser parser = new Parser(treeBuilder);

        // Assert
        Assert.assertSame(treeBuilder, parser.getTreeBuilder());
        Assert.assertNotNull(parser.settings());
        Assert.assertFalse(parser.isTrackErrors());
        Assert.assertNull(parser.getErrors());
    }

    @Test
    public void setTreeBuilder_givenNewTreeBuilder_shouldUpdateTreeBuilder() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        TreeBuilder newBuilder = new XmlTreeBuilder();

        // Act
        Parser returnedParser = parser.setTreeBuilder(newBuilder);

        // Assert
        Assert.assertSame(parser, returnedParser);
        Assert.assertSame(newBuilder, parser.getTreeBuilder());
    }

    @Test
    public void isTrackErrors_givenDefaultErrors_shouldReturnFalse() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        boolean tracking = parser.isTrackErrors();

        // Assert
        Assert.assertFalse(tracking);
    }

    @Test
    public void isTrackErrors_givenPositiveMaxErrors_shouldReturnTrue() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        parser.setTrackErrors(10);

        // Assert
        Assert.assertTrue(parser.isTrackErrors());
    }

    @Test
    public void isTrackErrors_givenZeroMaxErrors_shouldReturnFalse() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(10);

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
    public void setTrackErrors_givenFluentInvocation_shouldReturnSameParserInstance() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());

        // Act
        Parser returned = parser.setTrackErrors(5);

        // Assert
        Assert.assertSame(parser, returned);
    }

    @Test
    public void settings_givenCustomSettings_shouldUpdateAndRetrieveSettings() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        ParseSettings customSettings = new ParseSettings(true, true);

        // Act
        Parser returned = parser.settings(customSettings);

        // Assert
        Assert.assertSame(parser, returned);
        Assert.assertSame(customSettings, parser.settings());
    }

    @Test
    public void parseInput_givenTrackingDisabled_shouldParseAndInitializeEmptyErrors() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(0);
        String html = "<p>Test paragraph";
        String baseUri = "http://example.com/";

        // Act
        Document doc = parser.parseInput(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(parser.getErrors());
        Assert.assertEquals(0, parser.getErrors().size());
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals("Test paragraph", doc.select("p").text());
    }

    @Test
    public void parseInput_givenTrackingEnabledWithErrors_shouldPopulateErrorsList() {
        // Arrange
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(10);
        String malformedHtml = "<html><head><p>Missing closing tags";
        String baseUri = "http://example.com/";

        // Act
        Document doc = parser.parseInput(malformedHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(parser.getErrors());
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void parseInput_givenXmlTreeBuilder_shouldParseXmlDocument() {
        // Arrange
        Parser parser = Parser.xmlParser();
        String xml = "<root><child id=\"1\">Value</child></root>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = parser.parseInput(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.select("child").size());
        Assert.assertEquals("Value", doc.select("child").text());
    }

    @Test
    public void parse_givenHtmlAndBaseUri_shouldReturnParsedDocument() {
        // Arrange
        String html = "<div id=\"content\">Hello World</div>";
        String baseUri = "http://example.com/page.html";

        // Act
        Document doc = Parser.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello World", doc.getElementById("content").text());
        Assert.assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void parseFragment_givenHtmlAndContext_shouldReturnNodeList() {
        // Arrange
        String fragmentHtml = "<span>Item 1</span><span>Item 2</span>";
        Element context = new Element(Tag.valueOf("div"), "");
        String baseUri = "http://example.com/";

        // Act
        List<Node> nodes = Parser.parseFragment(fragmentHtml, context, baseUri);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
        Assert.assertEquals("span", nodes.get(0).nodeName());
        Assert.assertEquals("span", nodes.get(1).nodeName());
    }

    @Test
    public void parseXmlFragment_givenXmlContent_shouldReturnXmlNodeList() {
        // Arrange
        String fragmentXml = "<customTag attr=\"true\">Sample</customTag>";
        String baseUri = "http://example.com/";

        // Act
        List<Node> nodes = Parser.parseXmlFragment(fragmentXml, baseUri);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("customTag", nodes.get(0).nodeName());
    }

    @Test
    public void parseBodyFragment_givenSingleNode_shouldAppendToBody() {
        // Arrange
        String bodyHtml = "<div>Single Element</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(1, doc.body().children().size());
        Assert.assertEquals("Single Element", doc.body().select("div").text());
    }

    @Test
    public void parseBodyFragment_givenMultipleNodes_shouldRemovePreviousSiblingsAndAppendAllNodes() {
        // Arrange
        String bodyHtml = "<div>First</div><p>Second</p><span>Third</span>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(3, doc.body().children().size());
        Assert.assertEquals("First", doc.body().child(0).text());
        Assert.assertEquals("Second", doc.body().child(1).text());
        Assert.assertEquals("Third", doc.body().child(2).text());
    }

    @Test
    public void parseBodyFragment_givenEmptyString_shouldProduceEmptyBodyDocument() {
        // Arrange
        String bodyHtml = "";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(0, doc.body().childNodes().size());
    }

    @Test
    public void parseBodyFragmentRelaxed_givenFragment_shouldReturnDocument() {
        // Arrange
        String bodyHtml = "<div>Relaxed Test</div>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Relaxed Test", doc.select("div").text());
    }

    @Test
    public void unescapeEntities_givenEscapedStringInBody_shouldUnescapeCorrectly() {
        // Arrange
        String escaped = "&lt;hello &amp; world&gt;";

        // Act
        String unescaped = Parser.unescapeEntities(escaped, false);

        // Assert
        Assert.assertEquals("<hello & world>", unescaped);
    }

    @Test
    public void unescapeEntities_givenEscapedStringInAttribute_shouldUnescapeCorrectly() {
        // Arrange
        String escaped = "&quot;quoted&quot; &amp; clean";

        // Act
        String unescaped = Parser.unescapeEntities(escaped, true);

        // Assert
        Assert.assertEquals("\"quoted\" & clean", unescaped);
    }

    @Test
    public void unescapeEntities_givenStringWithoutEntities_shouldReturnSameString() {
        // Arrange
        String plain = "No entities here.";

        // Act
        String result = Parser.unescapeEntities(plain, false);

        // Assert
        Assert.assertEquals("No entities here.", result);
    }

    @Test
    public void htmlParser_whenCalled_shouldConstructParserWithHtmlTreeBuilder() {
        // Act
        Parser parser = Parser.htmlParser();

        // Assert
        Assert.assertNotNull(parser);
        Assert.assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void xmlParser_whenCalled_shouldConstructParserWithXmlTreeBuilder() {
        // Act
        Parser parser = Parser.xmlParser();

        // Assert
        Assert.assertNotNull(parser);
        Assert.assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test
    public void parseInput_givenNullHtml_shouldThrowException() {
        // Arrange
        Parser parser = Parser.htmlParser();

        // Act & Assert
        try {
            parser.parseInput(null, "http://example.com/");
            Assert.fail("Expected IllegalArgumentException or NullPointerException when html is null");
        } catch (IllegalArgumentException expected) {
            Assert.assertNotNull(expected);
        } catch (NullPointerException expected) {
            Assert.assertNotNull(expected);
        }
    }
}