package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testConstructor() {
        Document doc = new Document("http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void testCreateShell() {
        Document doc = Document.createShell("http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void testHead() {
        Document doc = Document.createShell("http://example.com/");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void testHeadNullWhenNotPresent() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.head());
    }

    @Test
    public void testBody() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    @Test
    public void testBodyNullWhenNotPresent() {
        Document doc = new Document("http://example.com/");
        assertNull(doc.body());
    }

    @Test
    public void testTitleEmptyWhenNoTitleElement() {
        Document doc = Document.createShell("http://example.com/");
        assertEquals("", doc.title());
    }

    @Test
    public void testTitleGetterWithExistingTitle() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("  My Title  ");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testTitleSetterAddsNewTitleWhenNoneExists() {
        Document doc = Document.createShell("http://example.com/");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
        Element titleEl = doc.getElementsByTag("title").first();
        assertNotNull(titleEl);
    }

    @Test
    public void testTitleSetterUpdatesExistingTitle() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendElement("title").text("Old Title");
        doc.title("Updated Title");
        assertEquals("Updated Title", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitleSetterNullThrows() {
        Document doc = Document.createShell("http://example.com/");
        doc.title(null);
    }

    @Test
    public void testCreateElement() {
        Document doc = new Document("http://example.com/");
        Element el = doc.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertEquals("http://example.com/", el.baseUri());
        // not a child of document
        assertEquals(0, doc.children().size());
    }

    @Test
    public void testNormaliseCreatesHtmlHeadBody() {
        Document doc = new Document("http://example.com/");
        doc.normalise();
        assertNotNull(doc.select("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormaliseWithExistingHtml() {
        Document doc = new Document("http://example.com/");
        doc.appendElement("html");
        doc.normalise();
        assertEquals(1, doc.select("html").size());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testNormaliseMovesTextFromRootToBody() {
        Document doc = Document.createShell("http://example.com/");
        doc.appendChild(new TextNode("Loose text", ""));
        doc.normalise();
        assertTrue(doc.body().text().contains("Loose text"));
    }

    @Test
    public void testNormaliseMovesTextFromHeadToBody() {
        Document doc = Document.createShell("http://example.com/");
        doc.head().appendChild(new TextNode("Head text", ""));
        doc.normalise();
        assertTrue(doc.body().text().contains("Head text"));
    }

    @Test
    public void testNormaliseSkipsBlankTextNodes() {
        Document doc = Document.createShell("http://example.com/");
        doc.appendChild(new TextNode("   ", ""));
        doc.normalise();
        // blank text should not be moved, body text should remain empty
        assertEquals("", doc.body().text());
    }

    @Test
    public void testNormaliseNoTextNodesNoOp() {
        Document doc = Document.createShell("http://example.com/");
        doc.normalise();
        assertEquals("", doc.body().text());
    }

    @Test
    public void testOuterHtml() {
        Document doc = Document.createShell("http://example.com/");
        String html = doc.outerHtml();
        assertTrue(html.contains("<html>"));
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("<body>"));
        assertFalse(html.startsWith("#document"));
    }

    @Test
    public void testTextSetterSetsBodyText() {
        Document doc = Document.createShell("http://example.com/");
        Element result = doc.text("Hello World");
        assertSame(doc, result);
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testTextSetterClearsExistingBodyNodes() {
        Document doc = Document.createShell("http://example.com/");
        doc.body().appendElement("p").text("Old content");
        doc.text("New content");
        assertEquals("New content", doc.body().text());
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testNodeName() {
        Document doc = new Document("http://example.com/");
        assertEquals("#document", doc.nodeName());
    }
}