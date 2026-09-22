package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DocumentTest {
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
    }

    @Test
    public void testConstructor() {
        assertNotNull(doc);
        assertEquals("#root", doc.nodeName());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testCreateShell() {
        Document shell = Document.createShell("http://example.com");
        assertNotNull(shell);
        assertNotNull(shell.head());
        assertNotNull(shell.body());
        assertEquals("html", shell.select("html").first().tagName());
        assertEquals("head", shell.head().tagName());
        assertEquals("body", shell.body().tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testHeadAndBodyEmpty() {
        assertNull(doc.head());
        assertNull(doc.body());
    }

    @Test
    public void testHeadAndBodyAfterAppend() {
        doc.appendElement("html").appendElement("head");
        doc.select("html").first().appendElement("body");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("head", doc.head().tagName());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testTitleEmpty() {
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleSetAndGet() {
        Document shell = Document.createShell("http://example.com");
        shell.title("My Title");
        assertEquals("My Title", shell.title());
    }

    @Test
    public void testTitleTrimsWhitespace() {
        Document shell = Document.createShell("http://example.com");
        shell.title("  Trimmed Title  ");
        assertEquals("Trimmed Title", shell.title());
    }

    @Test
    public void testTitleAddsToHeadWhenAbsent() {
        doc.appendElement("html").appendElement("head");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullTitle() {
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Element el = doc.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertEquals("http://example.com", el.baseUri());
        assertEquals(0, doc.childNodes().size()); // not attached
    }

    @Test
    public void testNormaliseAddsHtmlHeadBody() {
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals(1, doc.select("html").size());
        assertEquals("html", doc.select("html").first().tagName());
        assertEquals("head", doc.select("head").first().tagName());
        assertEquals("body", doc.select("body").first().tagName());
    }

    @Test
    public void testNormaliseMovesTextIntoBody() {
        doc.appendElement("html");
        TextNode textNode = new TextNode("hello", "");
        doc.appendChild(textNode);
        doc.normalise();
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("hello"));
        assertEquals(0, doc.childNodes().size()); // text moved out of root
    }

    @Test
    public void testNormaliseMovesTextFromHeadIntoBody() {
        Document shell = Document.createShell("http://example.com");
        TextNode headText = new TextNode("head text", "");
        shell.head().appendChild(headText);
        shell.normalise();
        assertFalse(shell.head().text().contains("head text"));
        assertTrue(shell.body().text().contains("head text"));
    }

    @Test
    public void testNormaliseMovesTextFromHtmlIntoBody() {
        Document shell = Document.createShell("http://example.com");
        Element htmlEl = shell.select("html").first();
        TextNode htmlText = new TextNode("html text", "");
        htmlEl.appendChild(htmlText);
        shell.normalise();
        assertFalse(htmlEl.text().contains("html text"));
        assertTrue(shell.body().text().contains("html text"));
    }

    @Test
    public void testNormaliseDoesNotMoveBlankText() {
        Document shell = Document.createShell("http://example.com");
        TextNode blankText = new TextNode("   ", "");
        shell.appendChild(blankText);
        shell.normalise();
        assertEquals(0, shell.body().childNodes().size());
        assertEquals(0, shell.childNodes().size());
    }

    @Test
    public void testNormaliseKeepsTextOrder() {
        Document shell = Document.createShell("http://example.com");
        TextNode tn1 = new TextNode("first", "");
        TextNode tn2 = new TextNode("second", "");
        shell.appendChild(tn1);
        shell.appendChild(tn2);
        shell.normalise();
        assertEquals("first second", shell.body().text().trim());
    }

    @Test
    public void testOuterHtml() {
        Document shell = Document.createShell("http://example.com");
        shell.title("Test");
        String html = shell.outerHtml();
        assertTrue(html.startsWith("<html>"));
        assertTrue(html.endsWith("</html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<title>Test</title>"));
        assertTrue(html.contains("<body>"));
    }

    @Test
    public void testTextOverriddenToBody() {
        Document shell = Document.createShell("http://example.com");
        shell.text("Hello");
        assertEquals("Hello", shell.body().text());
        assertNotNull(shell.head());
        assertNotNull(shell.body());
    }

    @Test
    public void testNodeName() {
        assertEquals("#document", doc.nodeName());
    }
}