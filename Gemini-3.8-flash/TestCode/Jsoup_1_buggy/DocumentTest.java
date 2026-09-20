package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class DocumentTest {

    @Test
    public void constructor_givenBaseUri_shouldSetBaseUriAndNodeName() {
        // Arrange & Act
        Document doc = new Document("http://example.com/");

        // Assert
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals("#document", doc.nodeName());
        Assert.assertTrue(doc.childNodes.isEmpty());
    }

    @Test
    public void createShell_givenValidBaseUri_shouldConstructStructure() {
        // Arrange & Act
        Document doc = Document.createShell("http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertNotNull(doc.select("html").first());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("head", doc.head().tagName());
        Assert.assertEquals("body", doc.body().tagName());
        Assert.assertEquals(doc.select("html").first(), doc.head().parent());
        Assert.assertEquals(doc.select("html").first(), doc.body().parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createShell_givenNullBaseUri_shouldThrowException() {
        // Act & Assert
        Document.createShell(null);
    }

    @Test
    public void head_whenHeadExists_shouldReturnHeadElement() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element head = doc.head();

        // Assert
        Assert.assertNotNull(head);
        Assert.assertEquals("head", head.tagName());
    }

    @Test
    public void head_whenHeadMissing_shouldReturnNull() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Element head = doc.head();

        // Assert
        Assert.assertNull(head);
    }

    @Test
    public void body_whenBodyExists_shouldReturnBodyElement() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element body = doc.body();

        // Assert
        Assert.assertNotNull(body);
        Assert.assertEquals("body", body.tagName());
    }

    @Test
    public void body_whenBodyMissing_shouldReturnNull() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Element body = doc.body();

        // Assert
        Assert.assertNull(body);
    }

    @Test
    public void title_whenNoTitleElementExists_shouldReturnEmptyString() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("", title);
    }

    @Test
    public void title_whenTitleElementExists_shouldReturnTrimmedText() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Test Title   ");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("Test Title", title);
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleSetter_givenNullTitle_shouldThrowException() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act & Assert
        doc.title(null);
    }

    @Test
    public void titleSetter_whenTitleElementDoesNotExist_shouldAppendTitleToHead() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        doc.title("New Page Title");

        // Assert
        Assert.assertEquals("New Page Title", doc.title());
        Element titleEl = doc.head().getElementsByTag("title").first();
        Assert.assertNotNull(titleEl);
        Assert.assertEquals("New Page Title", titleEl.text());
    }

    @Test
    public void titleSetter_whenTitleElementAlreadyExists_shouldUpdateExistingTitle() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.title("Initial Title");

        // Act
        doc.title("Updated Title");

        // Assert
        Assert.assertEquals("Updated Title", doc.title());
        Assert.assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    @Test
    public void createElement_givenTagName_shouldCreateElementWithDocumentBaseUri() {
        // Arrange
        Document doc = new Document("http://example.com/base/");

        // Act
        Element el = doc.createElement("div");

        // Assert
        Assert.assertNotNull(el);
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("http://example.com/base/", el.baseUri());
        Assert.assertNull(el.parent());
    }

    @Test
    public void normalise_whenDocumentEmpty_shouldCreateHtmlHeadAndBody() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Document result = doc.normalise();

        // Assert
        Assert.assertSame(doc, result);
        Assert.assertNotNull(doc.select("html").first());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void normalise_whenHtmlExistsButMissingHeadAndBody_shouldAddHeadAndBody() {
        // Arrange
        Document doc = new Document("http://example.com/");
        doc.appendElement("html");

        // Act
        doc.normalise();

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("html", doc.head().parent().tagName());
        Assert.assertEquals("html", doc.body().parent().tagName());
    }

    @Test
    public void normalise_whenHeadExistsButBodyMissing_shouldAddBody() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("head");

        // Act
        doc.normalise();

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void normalise_whenBodyExistsButHeadMissing_shouldPrependHead() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        html.appendElement("body");

        // Act
        doc.normalise();

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals(0, doc.head().elementSiblingIndex().intValue());
    }

    @Test
    public void normalise_givenTextNodesInRootHtmlAndHead_shouldMoveNonBlankTextNodesToBody() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head = html.appendElement("head");
        Element body = html.appendElement("body");

        head.appendText("head text");
        head.appendText("   "); // blank text node, should not be moved
        html.appendText("html text");
        doc.appendText("root text");

        // Act
        doc.normalise();

        // Assert
        Assert.assertTrue(doc.head().select("text").isEmpty());
        Assert.assertTrue(doc.body().text().contains("head text"));
        Assert.assertTrue(doc.body().text().contains("html text"));
        Assert.assertTrue(doc.body().text().contains("root text"));
    }

    @Test
    public void normalise_givenOnlyBlankTextNodes_shouldNotMoveBlankTextNodes() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendChild(new TextNode("   \n\t", ""));
        doc.appendChild(new TextNode("  ", ""));

        // Act
        doc.normalise();

        // Assert
        Assert.assertEquals("", doc.body().text().trim());
    }

    @Test
    public void outerHtml_shouldReturnHtmlWithoutDocWrapper() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Hello World");

        // Act
        String outerHtml = doc.outerHtml();

        // Assert
        Assert.assertFalse(outerHtml.startsWith("<#document>"));
        Assert.assertTrue(outerHtml.contains("<html>"));
        Assert.assertTrue(outerHtml.contains("<head>"));
        Assert.assertTrue(outerHtml.contains("<body>"));
        Assert.assertTrue(outerHtml.contains("<p>Hello World</p>"));
    }

    @Test
    public void text_givenText_shouldSetBodyTextAndNotNukeStructure() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element result = doc.text("Sample Content");

        // Assert
        Assert.assertSame(doc, result);
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Sample Content", doc.body().text());
    }

    @Test
    public void nodeName_shouldReturnDocumentLiteral() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act & Assert
        Assert.assertEquals("#document", doc.nodeName());
    }
}