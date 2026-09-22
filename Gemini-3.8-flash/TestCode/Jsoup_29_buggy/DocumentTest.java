package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class DocumentTest {

    @Test
    public void constructor_givenBaseUri_shouldInitializeProperly() {
        // Arrange & Act
        Document doc = new Document("http://example.com/");

        // Assert
        Assert.assertEquals("#document", doc.nodeName());
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertNull(doc.head());
        Assert.assertNull(doc.body());
        Assert.assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
        Assert.assertNotNull(doc.outputSettings());
    }

    @Test
    public void createShell_givenValidBaseUri_shouldCreateHtmlHeadBody() {
        // Arrange & Act
        Document doc = Document.createShell("http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("head", doc.head().tagName());
        Assert.assertEquals("body", doc.body().tagName());
        Assert.assertEquals("html", doc.head().parent().tagName());
        Assert.assertEquals("html", doc.body().parent().tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createShell_givenNullBaseUri_shouldThrowException() {
        // Arrange, Act & Assert
        Document.createShell(null);
    }

    @Test
    public void headAndBody_whenAbsent_shouldReturnNull() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act & Assert
        Assert.assertNull(doc.head());
        Assert.assertNull(doc.body());
    }

    @Test
    public void title_whenTitleElementAbsent_shouldReturnEmptyString() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act & Assert
        Assert.assertEquals("", doc.title());
    }

    @Test
    public void title_whenTitleElementPresent_shouldReturnTrimmedTitle() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("   Test Title   ");

        // Act
        String title = doc.title();

        // Assert
        Assert.assertEquals("Test Title", title);
    }

    @Test(expected = IllegalArgumentException.class)
    public void title_givenNullTitle_shouldThrowException() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act & Assert
        doc.title(null);
    }

    @Test
    public void title_whenTitleElementAbsent_shouldCreateTitleInHead() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        doc.title("New Title");

        // Assert
        Assert.assertEquals("New Title", doc.title());
        Assert.assertNotNull(doc.head().getElementsByTag("title").first());
        Assert.assertEquals("New Title", doc.head().getElementsByTag("title").first().text());
    }

    @Test
    public void title_whenTitleElementPresent_shouldUpdateTitleText() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("Initial Title");

        // Act
        doc.title("Updated Title");

        // Assert
        Assert.assertEquals("Updated Title", doc.title());
        Assert.assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void createElement_givenTagName_shouldCreateElementWithDocumentBaseUri() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act
        Element div = doc.createElement("div");

        // Assert
        Assert.assertNotNull(div);
        Assert.assertEquals("div", div.tagName());
        Assert.assertEquals("http://example.com/", div.baseUri());
        Assert.assertNull(div.parent());
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
    public void normalise_whenHeadAndBodyMissingInHtml_shouldPrependHeadAndAppendBody() {
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
    public void normalise_whenTextNodesNotInBody_shouldMoveThemIntoBody() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head = html.appendElement("head");
        Element body = html.appendElement("body");

        // Add non-blank text nodes to root, html, and head
        doc.appendText("Text In Root");
        html.appendText("Text In Html");
        head.appendText("Text In Head");

        // Act
        doc.normalise();

        // Assert
        String bodyText = body.text();
        Assert.assertTrue(bodyText.contains("Text In Root"));
        Assert.assertTrue(bodyText.contains("Text In Html"));
        Assert.assertTrue(bodyText.contains("Text In Head"));
        Assert.assertEquals(0, head.getElementsByTag("text").size());
    }

    @Test
    public void normalise_whenDuplicateHeadsAndBodiesExist_shouldMergeContentsAndRemoveDuplicates() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element html = doc.appendElement("html");
        Element head1 = html.appendElement("head");
        head1.appendElement("meta").attr("charset", "utf-8");

        Element head2 = html.appendElement("head");
        head2.appendElement("script").attr("src", "app.js");

        Element body1 = html.appendElement("body");
        body1.appendElement("p").text("Paragraph 1");

        Element body2 = html.appendElement("body");
        body2.appendElement("span").text("Span 2");

        // Act
        doc.normalise();

        // Assert
        Assert.assertEquals(1, doc.getElementsByTag("head").size());
        Assert.assertEquals(1, doc.getElementsByTag("body").size());
        Assert.assertEquals(1, doc.head().getElementsByTag("meta").size());
        Assert.assertEquals(1, doc.head().getElementsByTag("script").size());
        Assert.assertEquals(1, doc.body().getElementsByTag("p").size());
        Assert.assertEquals(1, doc.body().getElementsByTag("span").size());
    }

    @Test
    public void normalise_whenMasterHeadNotParentedByHtml_shouldReparentUnderHtml() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Element div = doc.appendElement("div");
        div.appendElement("head");
        div.appendElement("body");
        Element html = doc.appendElement("html");

        // Act
        doc.normalise();

        // Assert
        Assert.assertEquals(html, doc.head().parent());
        Assert.assertEquals(html, doc.body().parent());
    }

    @Test
    public void outerHtml_shouldReturnInnerHtmlWithoutWrapperTag() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Hello World");

        // Act
        String html = doc.outerHtml();

        // Assert
        Assert.assertTrue(html.contains("<html>"));
        Assert.assertTrue(html.contains("<head>"));
        Assert.assertTrue(html.contains("<body>"));
        Assert.assertTrue(html.contains("<p>Hello World</p>"));
        Assert.assertFalse(html.contains("#root"));
        Assert.assertFalse(html.contains("#document"));
    }

    @Test
    public void text_givenTextString_shouldSetBodyTextAndPreserveDocumentStructure() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");

        // Act
        Element returnedDoc = doc.text("Replaced Content");

        // Assert
        Assert.assertSame(doc, returnedDoc);
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Replaced Content", doc.body().text());
    }

    @Test
    public void clone_shouldDeepCloneDocumentAndOutputSettings() {
        // Arrange
        Document doc = Document.createShell("http://example.com/");
        doc.title("Original Title");
        doc.outputSettings().indentAmount(4);
        doc.outputSettings().prettyPrint(false);

        // Act
        Document clone = doc.clone();

        // Assert
        Assert.assertNotSame(doc, clone);
        Assert.assertNotSame(doc.outputSettings(), clone.outputSettings());
        Assert.assertEquals(doc.title(), clone.title());
        Assert.assertEquals(doc.outputSettings().indentAmount(), clone.outputSettings().indentAmount());
        Assert.assertEquals(doc.outputSettings().prettyPrint(), clone.outputSettings().prettyPrint());

        // Modify clone, original should remain unaffected
        clone.title("Modified Title");
        clone.outputSettings().indentAmount(8);
        Assert.assertEquals("Original Title", doc.title());
        Assert.assertEquals(4, doc.outputSettings().indentAmount());
    }

    @Test
    public void quirksMode_getterAndSetter_shouldFunctionCorrectly() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act & Assert
        Assert.assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());

        Document returned = doc.quirksMode(Document.QuirksMode.quirks);
        Assert.assertSame(doc, returned);
        Assert.assertEquals(Document.QuirksMode.quirks, doc.quirksMode());

        doc.quirksMode(Document.QuirksMode.limitedQuirks);
        Assert.assertEquals(Document.QuirksMode.limitedQuirks, doc.quirksMode());
    }

    @Test
    public void outputSettings_getterAndSetter_shouldFunctionCorrectly() {
        // Arrange
        Document doc = new Document("http://example.com/");
        Document.OutputSettings newSettings = new Document.OutputSettings();
        newSettings.indentAmount(5);

        // Act
        Document returned = doc.outputSettings(newSettings);

        // Assert
        Assert.assertSame(doc, returned);
        Assert.assertSame(newSettings, doc.outputSettings());
        Assert.assertEquals(5, doc.outputSettings().indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outputSettings_givenNull_shouldThrowException() {
        // Arrange
        Document doc = new Document("http://example.com/");

        // Act & Assert
        doc.outputSettings(null);
    }

    @Test
    public void outputSettings_defaultValues_shouldBeCorrect() {
        // Arrange & Act
        Document.OutputSettings settings = new Document.OutputSettings();

        // Assert
        Assert.assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        Assert.assertEquals(Charset.forName("UTF-8"), settings.charset());
        Assert.assertNotNull(settings.encoder());
        Assert.assertTrue(settings.prettyPrint());
        Assert.assertEquals(1, settings.indentAmount());
    }

    @Test
    public void outputSettings_escapeMode_shouldUpdateAndChain() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        Document.OutputSettings returned = settings.escapeMode(Entities.EscapeMode.extended);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void outputSettings_charsetByInstance_shouldUpdateAndChain() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();
        Charset ascii = Charset.forName("US-ASCII");

        // Act
        Document.OutputSettings returned = settings.charset(ascii);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(ascii, settings.charset());
        Assert.assertNotNull(settings.encoder());
        Assert.assertEquals("US-ASCII", settings.encoder().charset().name());
    }

    @Test
    public void outputSettings_charsetByName_shouldUpdateAndChain() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        Document.OutputSettings returned = settings.charset("ISO-8859-1");

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), settings.charset());
        Assert.assertEquals("ISO-8859-1", settings.encoder().charset().name());
    }

    @Test
    public void outputSettings_prettyPrint_shouldUpdateAndChain() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        Document.OutputSettings returned = settings.prettyPrint(false);

        // Assert
        Assert.assertSame(settings, returned);
        Assert.assertFalse(settings.prettyPrint());
    }

    @Test
    public void outputSettings_indentAmount_givenValidAmount_shouldUpdateAndChain() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        Document.OutputSettings returnedZero = settings.indentAmount(0);

        // Assert
        Assert.assertSame(settings, returnedZero);
        Assert.assertEquals(0, settings.indentAmount());

        settings.indentAmount(8);
        Assert.assertEquals(8, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outputSettings_indentAmount_givenNegativeAmount_shouldThrowException() {
        // Arrange
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act & Assert
        settings.indentAmount(-1);
    }

    @Test
    public void outputSettings_clone_shouldDeepCopyCorrectly() {
        // Arrange
        Document.OutputSettings original = new Document.OutputSettings();
        original.escapeMode(Entities.EscapeMode.extended);
        original.charset("US-ASCII");
        original.prettyPrint(false);
        original.indentAmount(4);

        // Act
        Document.OutputSettings clone = original.clone();

        // Assert
        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original.escapeMode(), clone.escapeMode());
        Assert.assertEquals(original.charset(), clone.charset());
        Assert.assertNotSame(original.encoder(), clone.encoder());
        Assert.assertEquals(original.prettyPrint(), clone.prettyPrint());
        Assert.assertEquals(original.indentAmount(), clone.indentAmount());

        // Mutate clone to ensure isolation
        clone.escapeMode(Entities.EscapeMode.base);
        clone.charset("UTF-8");
        clone.prettyPrint(true);
        clone.indentAmount(2);

        Assert.assertEquals(Entities.EscapeMode.extended, original.escapeMode());
        Assert.assertEquals(Charset.forName("US-ASCII"), original.charset());
        Assert.assertFalse(original.prettyPrint());
        Assert.assertEquals(4, original.indentAmount());
    }
}