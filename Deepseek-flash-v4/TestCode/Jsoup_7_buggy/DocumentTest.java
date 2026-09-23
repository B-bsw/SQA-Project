package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document.OutputSettings;
import static org.junit.Assert.*;
import java.nio.charset.Charset;

public class DocumentTest {
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        doc.appendElement("html").appendElement("head").appendElement("body");
    }

    @After
    public void tearDown() {
        doc = null;
    }

    // Test constructor and nodeName
    @Test
    public void testConstructorAndNodeName() {
        assertEquals("#document", doc.nodeName());
        assertEquals("", doc.baseUri());
    }

    // Test createShell with normal input
    @Test
    public void testCreateShell() {
        Document shell = Document.createShell("http://test.com");
        assertNotNull(shell);
        assertEquals("http://test.com", shell.baseUri());
        assertNotNull(shell.head());
        assertNotNull(shell.body());
    }

    // Test createShell with null baseUri - should throw exception
    @Test(expected = IllegalArgumentException.class)
    public void testCreateShellNullUri() {
        Document.createShell(null);
    }

    // Test head() and body() methods
    @Test
    public void testHeadAndBody() {
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    // Test head() and body() when not present
    @Test
    public void testHeadAndBodyNotPresent() {
        Document emptyDoc = new Document("http://empty.com");
        assertNull(emptyDoc.head());
        assertNull(emptyDoc.body());
    }

    // Test title getter when title exists
    @Test
    public void testTitleGetterWithTitle() {
        doc.title("  Test Title  ");
        assertEquals("Test Title", doc.title());
    }

    // Test title getter when title does not exist
    @Test
    public void testTitleGetterNoTitle() {
        assertEquals("", doc.title());
    }

    // Test title setter with null - should throw exception
    @Test(expected = IllegalArgumentException.class)
    public void testTitleSetterNull() {
        doc.title(null);
    }

    // Test title setter when title doesn't exist
    @Test
    public void testTitleSetterNotExist() {
        doc.title("New Title");
        assertEquals("New Title", doc.title());
    }

    // Test title setter when title already exists
    @Test
    public void testTitleSetterExist() {
        doc.appendElement("head").appendElement("title").text("Old");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
    }

    // Test createElement
    @Test
    public void testCreateElement() {
        Element el = doc.createElement("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertEquals(doc.baseUri(), el.baseUri());
    }

    // Test normalise with missing html element
    @Test
    public void testNormaliseNoHtml() {
        Document d = new Document("http://norm.com");
        d.normalise();
        assertNotNull(d.head());
        assertNotNull(d.body());
    }

    // Test normalise when html exists but no head/body
    @Test
    public void testNormaliseMissingHeadBody() {
        Document d = new Document("http://norm.com");
        d.appendElement("html");
        d.normalise();
        assertNotNull(d.head());
        assertNotNull(d.body());
    }

    // Test text method overridden
    @Test
    public void testTextMethod() {
        Document d = new Document("http://text.com");
        d.appendElement("html").appendElement("body").appendElement("p").text("hello");
        d.text("new text");
        assertEquals("new text", d.body().text());
    }

    // Test outerHtml returns html content
    @Test
    public void testOuterHtml() {
        Document d = new Document("http://outer.com");
        Element html = d.appendElement("html");
        html.text("some content");
        assertEquals("some content", d.outerHtml());
    }

    // Test output settings charset getter/setter
    @Test
    public void testCharsetGetSet() {
        OutputSettings settings = doc.outputSettings();
        Charset defCharset = settings.charset();
        assertEquals("UTF-8", defCharset.name());
        
        Charset newCharset = Charset.forName("ISO-8859-1");
        assertSame(settings, settings.charset(newCharset));
        assertEquals(newCharset, settings.charset());
    }

    // Test charset with string name
    @Test
    public void testCharsetString() {
        OutputSettings settings = doc.outputSettings();
        assertSame(settings, settings.charset("ISO-8859-1"));
        assertEquals("ISO-8859-1", settings.charset().name());
    }

    // Test prettyPrint default and setter
    @Test
    public void testPrettyPrintDefaultAndSetter() {
        OutputSettings settings = doc.outputSettings();
        assertTrue(settings.prettyPrint());
        assertSame(settings, settings.prettyPrint(false));
        assertFalse(settings.prettyPrint());
    }

    // Test indentAmount default and setter
    @Test
    public void testIndentAmount() {
        OutputSettings settings = doc.outputSettings();
        assertEquals(1, settings.indentAmount());
        assertSame(settings, settings.indentAmount(4));
        assertEquals(4, settings.indentAmount());
    }

    // Test indentAmount with negative - should throw exception
    @Test(expected = IllegalArgumentException.class)
    public void testIndentAmountNegative() {
        doc.outputSettings().indentAmount(-1);
    }

    // Test escapeMode getter and setter
    @Test
    public void testEscapeMode() {
        OutputSettings settings = doc.outputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertSame(settings, settings.escapeMode(Entities.EscapeMode.extended));
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    // Test chaining of output settings methods
    @Test
    public void testOutputSettingsChaining() {
        OutputSettings settings = doc.outputSettings();
        Charset utf8 = Charset.forName("UTF-8");
        assertSame(settings, settings.charset(utf8));
        assertSame(settings, settings.prettyPrint(false));
        assertSame(settings, settings.indentAmount(2));
        assertSame(settings, settings.escapeMode(Entities.EscapeMode.extended));
    }

    // Test outputSettings returns same instance
    @Test
    public void testOutputSettingsSingleton() {
        assertSame(doc.outputSettings(), doc.outputSettings());
    }

    // Test encoder() method
    @Test
    public void testEncoder() {
        OutputSettings settings = doc.outputSettings();
        assertNotNull(settings.encoder());
        assertSame(settings.charset().newEncoder(), settings.encoder());
    }

    // Test findFirstElementByTagName with root level
    @Test
    public void testFindFirstElementAtRoot() {
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    // Test findFirstElementByTagName nested
    @Test
    public void testFindFirstElementNested() {
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    // Test findFirstElementByTagName not found
    @Test
    public void testFindFirstElementNotFound() {
        assertNull(PrivateMethodInvoker.findFirstElementByTagName("div", doc));
    }

    // Helper class to access private method
    private static class PrivateMethodInvoker {
        static Element findFirstElementByTagName(String tag, Node node) {
            try {
                java.lang.reflect.Method method = Document.class.getDeclaredMethod("findFirstElementByTagName", String.class, Node.class);
                method.setAccessible(true);
                return (Element) method.invoke(node.ownerDocument(), tag, node);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Node {
    public String nodeName() { return ""; }
    public List<Node> childNodes = new java.util.ArrayList<>();
    public Node ownerDocument() { return this; }
}

class Element extends Node {
    private String tagName;
    private String baseUri;
    private List<Node> childNodes = new java.util.ArrayList<>();
    
    public Element(String tag, String baseUri) {
        this.tagName = tag;
        this.baseUri = baseUri;
    }
    
    public String tagName() { return tagName; }
    public String baseUri() { return baseUri; }
    
    public Element appendElement(String tag) {
        Element el = new Element(tag, baseUri);
        childNodes.add(el);
        return el;
    }
    
    public Element text(String text) { return this; }
    public String text() { return ""; }
    
    public void prependElement(String tag) {
        Element el = new Element(tag, baseUri);
        childNodes.add(0, el);
    }
    
    public void removeChild(Node node) {
        childNodes.remove(node);
    }
}