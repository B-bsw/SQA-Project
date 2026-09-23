package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.QuirksMode;
import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;

public class DocumentTest {
    @Test
    public void testCreateShell() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("#document", doc.nodeName());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testHeadAndBody() {
        Document doc = Document.createShell("http://example.com");
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testTitle() {
        Document doc = Document.createShell("http://example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
        doc.title("  Trimmed Title  ");
        assertEquals("Trimmed Title", doc.title());
        Document emptyDoc = new Document("");
        assertEquals("", emptyDoc.title());
    }

    @Test(expected = NullPointerException.class)
    public void testTitleNull() {
        Document doc = Document.createShell("http://example.com");
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Document doc = new Document("http://example.com");
        Element elem = doc.createElement("div");
        assertNotNull(elem);
        assertEquals("div", elem.tagName());
    }

    @Test
    public void testNormalise_noHtml() {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("text", ""));
        doc.normalise();
        assertNotNull(doc.body());
        assertEquals(1, doc.body().childNodes().size());
    }

    @Test
    public void testNormalise_duplicateBody() {
        Document doc = Document.createShell("http://example.com");
        Element body1 = doc.body();
        Element body2 = doc.createElement("body");
        body1.appendChild(body2);
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("body").size());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormalise_duplicateHead() {
        Document doc = Document.createShell("http://example.com");
        Element head1 = doc.head();
        Element head2 = doc.createElement("head");
        head1.appendChild(head2);
        doc.normalise();
        assertEquals(1, doc.getElementsByTag("head").size());
        assertNotNull(doc.head());
    }

    @Test
    public void testNormalise_textNodesMovedToBody() {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("hello ", ""));
        Element html = doc.appendElement("html");
        html.appendChild(new TextNode("world", ""));
        doc.normalise();
        assertNotNull(doc.body());
        String bodyText = doc.body().text();
        assertTrue(bodyText.contains("hello") || bodyText.contains("world"));
    }

    @Test
    public void testOutputSettings() {
        Document doc = new Document("http://example.com");
        OutputSettings settings = doc.outputSettings();
        assertNotNull(settings);
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertEquals("UTF-8", settings.charset().name());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void testOutputSettingsCharset() {
        Document doc = new Document("http://example.com");
        OutputSettings settings = doc.outputSettings();
        settings.charset(Charset.forName("ISO-8859-1"));
        assertEquals("ISO-8859-1", settings.charset().name());
        settings.charset("UTF-16");
        assertEquals("UTF-16", settings.charset().name());
    }

    @Test
    public void testOutputSettingsPrettyPrint() {
        Document doc = new Document("http://example.com");
        OutputSettings settings = doc.outputSettings();
        assertTrue(settings.prettyPrint());
        settings.prettyPrint(false);
        assertFalse(settings.prettyPrint());
    }

    @Test
    public void testOutputSettingsIndentAmount() {
        Document doc = new Document("http://example.com");
        OutputSettings settings = doc.outputSettings();
        assertEquals(1, settings.indentAmount());
        settings.indentAmount(4);
        assertEquals(4, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputSettingsIndentAmountNegative() {
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(-1);
    }

    @Test
    public void testOutputSettingsEscapeMode() {
        Document doc = new Document("http://example.com");
        OutputSettings settings = doc.outputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void testOutputSettingsClone() {
        Document doc = new Document("http://example.com");
        OutputSettings original = doc.outputSettings();
        OutputSettings clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original.escapeMode(), clone.escapeMode());
        assertEquals(original.charset(), clone.charset());
        assertEquals(original.prettyPrint(), clone.prettyPrint());
        assertEquals(original.indentAmount(), clone.indentAmount());
    }

    @Test
    public void testDocumentClone() {
        Document doc = Document.createShell("http://example.com");
        doc.title("Test");
        doc.outputSettings().indentAmount(3);
        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertEquals(doc.title(), clone.title());
        assertEquals(doc.outputSettings().indentAmount(), clone.outputSettings().indentAmount());
        assertEquals(doc.head().tagName(), clone.head().tagName());
    }

    @Test
    public void testText() {
        Document doc = Document.createShell("http://example.com");
        doc.text("Hello World");
        assertEquals("Hello World", doc.body().text());
        assertEquals(doc, doc.text("Test"));
    }

    @Test
    public void testQuirksMode() {
        Document doc = new Document("http://example.com");
        assertEquals(QuirksMode.noQuirks, doc.quirksMode());
        assertSame(doc, doc.quirksMode(QuirksMode.quirks));
        assertEquals(QuirksMode.quirks, doc.quirksMode());
        doc.quirksMode(QuirksMode.limitedQuirks);
        assertEquals(QuirksMode.limitedQuirks, doc.quirksMode());
    }

    @Test
    public void testOuterHtml() {
        Document doc = Document.createShell("http://example.com");
        String html = doc.outerHtml();
        assertTrue(html.startsWith("<html>"));
        assertTrue(html.endsWith("</html>"));
    }

    @Test
    public void testFindFirstElementByTagName() {
        Document doc = Document.createShell("http://example.com");
        assertEquals("html", doc.childNode(0).nodeName());
        assertEquals("head", doc.head().nodeName());
        assertEquals("body", doc.body().nodeName());
    }

    @Test
    public void testFindFirstElementByTagNameNotFound() {
        Document doc = Document.createShell("http://example.com");
        assertNull(doc.findFirstElementByTagName("unknown", doc));
    }

    private class Node {
        private String tagName;
        private List<Node> children = new ArrayList<Node>();
        private Document ownerDocument;

        public Node(String tagName) {
            this.tagName = tagName;
        }

        public String nodeName() { return tagName; }
        public List<Node> childNodes() { return children; }
        public Document ownerDocument() { return ownerDocument; }
    }
}