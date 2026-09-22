package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Test Matrix & Code Analysis:
 *
 * 1. Document Creation & Lifecycle:
 *    - Document(String baseUri): baseUri set properly, nodeName is "#root", outerHtml reflects child html.
 *    - createShell(String baseUri): Happy path with html, head, body structure; null URI validation error.
 *    - createElement(String tagName): Generates detached element with document baseUri.
 *    - nodeName(): Returns constant "#document".
 *
 * 2. Tree Traversal & Accessors:
 *    - head(): Finds first "head" element; returns null when not present.
 *    - body(): Finds first "body" element; returns null when not present.
 *    - findFirstElementByTagName(): Recursive search across nested DOM hierarchy.
 *
 * 3. Title Operations:
 *    - title(): Empty string when missing, trimmed title text when present.
 *    - title(String): Throws IllegalArgumentException on null; creates <title> in <head> when absent;
 *                     updates existing <title> text when present.
 *
 * 4. Document Normalisation:
 *    - normalise(): Creates <html>, <head>, <body> if missing.
 *    - normaliseTextNodes(): Moves non-blank TextNodes from <head>, <html>, and root into <body>.
 *    - Blank/whitespace TextNodes are filtered and not relocated.
 *
 * 5. Text & HTML Presentation:
 *    - outerHtml(): Returns super.html() without #root wrapper.
 *    - text(String): Updates body text without destroying head/body structure; returns document instance.
 *
 * 6. OutputSettings Configuration:
 *    - Defaults: escapeMode=base, charset=UTF-8, prettyPrint=true, indentAmount=1.
 *    - escapeMode(EscapeMode): Setter & chaining.
 *    - charset(Charset) & charset(String): Setter, encoder re-instantiation & chaining.
 *    - prettyPrint(boolean): Setter & chaining.
 *    - indentAmount(int): Setter & chaining; boundary at 0; validation failure when < 0.
 */
public class DocumentTest {

    // =========================================================================
    // Document Creation Tests
    // =========================================================================

    @Test
    public void constructor_givenBaseUri_shouldInitializeProperly() {
        // Arrange & Act
        Document doc = new Document("http://example.com/");

        // Assert
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals("#document", doc.nodeName());
        Assert.assertNotNull(doc.outputSettings());
        Assert.assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void createShell_givenValidBaseUri_shouldCreateHtmlHeadBody() {
        // Arrange & Act
        Document doc = Document.createShell("http://example.com/");

        // Assert
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("head", doc.head().nodeName());
        Assert.assertEquals("body", doc.body().nodeName());
        Assert.assertEquals("html", doc.head().parent().nodeName());
        Assert.assertSame(doc.head().parent(), doc.body().parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createShell_givenNullBaseUri_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        Document.createShell(null);
    }

    @Test
    public void createElement_givenValidTagName_shouldCreateElementWithMatchingBaseUri() {
        // Arrange
        Document doc = new Document("http://example.com/test");

        // Act
        Element el = doc.createElement("div");

        // Assert
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("http://example.com/test", el.baseUri());
        Assert.assertNull(el.parent());
    }

    @Test
    public void nodeName_shouldReturnDocumentLiteral() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act & Assert
        Assert.assertEquals("#document", doc.nodeName());
    }

    // =========================================================================
    // Structural Accessor Tests (head, body)
    // =========================================================================

    @Test
    public void head_whenHeadExists_shouldReturnHeadElement() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element head = doc.head();

        // Assert
        Assert.assertNotNull(head);
        Assert.assertEquals("head", head.nodeName());
    }

    @Test
    public void head_whenHeadAbsent_shouldReturnNull() {
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
        Assert.assertEquals("body", body.nodeName());
    }

    @Test
    public void body_whenBodyAbsent_shouldReturnNull() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Element body = doc.body();

        // Assert
        Assert.assertNull(body);
    }

    @Test
    public void findFirstElementByTagName_whenDeeplyNested_shouldReturnTargetElement() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element div = doc.appendElement("div");
        Element span = div.appendElement("span");
        Element target = span.appendElement("body");

        // Act
        Element found = doc.body();

        // Assert
        Assert.assertSame(target, found);
    }

    // =========================================================================
    // Title Access & Modification Tests
    // =========================================================================

    @Test
    public void title_whenTitleTagAbsent_shouldReturnEmptyString() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("", title);
    }

    @Test
    public void title_whenTitleTagContainsWhitespace_shouldReturnTrimmedTitle() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Test Title   ");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("Test Title", title);
    }

    @Test
    public void title_whenTitleTagPresent_shouldReturnTitleText() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("My Page");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("My Page", title);
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleSetter_givenNullTitle_shouldThrowIllegalArgumentException() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        doc.title(null);
    }

    @Test
    public void titleSetter_whenTitleTagAbsent_shouldCreateTitleInHead() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        doc.title("Newly Added Title");

        // Assert
        Assert.assertEquals("Newly Added Title", doc.title());
        Element titleEl = doc.head().getElementsByTag("title").first();
        Assert.assertNotNull(titleEl);
        Assert.assertEquals("Newly Added Title", titleEl.text());
        Assert.assertSame(doc.head(), titleEl.parent());
    }

    @Test
    public void titleSetter_whenTitleTagAlreadyExists_shouldUpdateExistingTitle() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("Initial Title");

        // Act
        doc.title("Updated Title");

        // Assert
        Assert.assertEquals("Updated Title", doc.title());
        Assert.assertEquals(1, doc.head().getElementsByTag("title").size());
    }

    // =========================================================================
    // Normalise Tests
    // =========================================================================

    @Test
    public void normalise_whenDocumentEmpty_shouldCreateHtmlHeadBody() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Document result = doc.normalise();

        // Assert
        Assert.assertSame(doc, result);
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("html", doc.child(0).nodeName());
        Assert.assertEquals("head", doc.head().nodeName());
        Assert.assertEquals("body", doc.body().nodeName());
    }

    @Test
    public void normalise_whenHtmlExistsWithoutHeadOrBody_shouldPrependHeadAndAppendBody() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");

        // Act
        doc.normalise();

        // Assert
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertSame(html, doc.head().parent());
        Assert.assertSame(html, doc.body().parent());
        Assert.assertEquals(0, doc.head().siblingIndex());
        Assert.assertEquals(1, doc.body().siblingIndex());
    }

    @Test
    public void normalise_whenTextNodesExistInRootHtmlAndHead_shouldMoveThemToBody() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.appendText("Text at root");
        doc.child(0).appendText("Text at html");
        doc.head().appendText("Text at head");

        // Act
        doc.normalise();

        // Assert
        String bodyText = doc.body().text();
        Assert.assertTrue(bodyText.contains("Text at root"));
        Assert.assertTrue(bodyText.contains("Text at html"));
        Assert.assertTrue(bodyText.contains("Text at head"));

        Assert.assertEquals(0, doc.head().textNodes().size());
        Assert.assertEquals(0, doc.textNodes().size());
    }

    @Test
    public void normalise_whenBlankTextNodesPresent_shouldNotMoveBlankNodes() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        TextNode blankNode = new TextNode("   \n\t   ", "");
        doc.head().appendChild(blankNode);

        // Act
        doc.normalise();

        // Assert
        Assert.assertTrue(doc.head().childNodes().contains(blankNode));
    }

    // =========================================================================
    // OuterHtml & Text Presentation Tests
    // =========================================================================

    @Test
    public void outerHtml_shouldReturnChildrenHtmlWithoutRootTag() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        String html = doc.outerHtml();

        // Assert
        Assert.assertFalse(html.contains("#root"));
        Assert.assertTrue(html.contains("<html>"));
        Assert.assertTrue(html.contains("<head>"));
        Assert.assertTrue(html.contains("<body>"));
    }

    @Test
    public void text_givenString_shouldSetBodyTextAndReturnThis() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element result = doc.text("Hello World Content");

        // Assert
        Assert.assertSame(doc, result);
        Assert.assertEquals("Hello World Content", doc.body().text());
        Assert.assertNotNull(doc.head());
    }

    // =========================================================================
    // OutputSettings Tests
    // =========================================================================

    @Test
    public void outputSettings_defaults_shouldMatchSpecification() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        OutputSettings settings = doc.outputSettings();

        // Assert
        Assert.assertEquals(EscapeMode.base, settings.escapeMode());
        Assert.assertEquals(Charset.forName("UTF-8"), settings.charset());
        Assert.assertNotNull(settings.encoder());
        Assert.assertEquals("UTF-8", settings.encoder().charset().name());
        Assert.assertTrue(settings.prettyPrint());
        Assert.assertEquals(1, settings.indentAmount());
    }

    @Test
    public void outputSettings_escapeMode_shouldUpdateAndChain() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();

        // Act
        OutputSettings returned = settings.escapeMode(EscapeMode.extended);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void outputSettings_charsetByCharsetObject_shouldUpdateAndRecreateEncoder() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();
        Charset asciiCharset = Charset.forName("US-ASCII");

        // Act
        OutputSettings returned = settings.charset(asciiCharset);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(asciiCharset, settings.charset());
        Assert.assertEquals(asciiCharset, settings.encoder().charset());
    }

    @Test
    public void outputSettings_charsetByStringName_shouldUpdateAndRecreateEncoder() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();

        // Act
        OutputSettings returned = settings.charset("ISO-8859-1");

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), settings.encoder().charset());
    }

    @Test
    public void outputSettings_prettyPrint_shouldUpdateAndChain() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();

        // Act
        OutputSettings returned = settings.prettyPrint(false);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertFalse(settings.prettyPrint());

        returned = settings.prettyPrint(true);
        Assert.assertTrue(settings.prettyPrint());
    }

    @Test
    public void outputSettings_indentAmount_givenValidValues_shouldUpdateAndChain() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();

        // Act & Assert - boundary 0
        OutputSettings ret0 = settings.indentAmount(0);
        Assert.assertSame(settings, ret0);
        Assert.assertEquals(0, settings.indentAmount());

        // Act & Assert - positive value
        OutputSettings ret4 = settings.indentAmount(4);
        Assert.assertSame(settings, ret4);
        Assert.assertEquals(4, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outputSettings_indentAmount_givenNegativeValue_shouldThrowIllegalArgumentException() {
        // Arrange
        Document doc = new Document("http://example.com/");
        OutputSettings settings = doc.outputSettings();

        // Act
        settings.indentAmount(-1);
    }
}