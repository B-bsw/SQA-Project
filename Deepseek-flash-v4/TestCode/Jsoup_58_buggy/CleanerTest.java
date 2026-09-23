package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class CleanerTest {
    private Whitelist whitelist;
    private Cleaner cleaner;

    @Before
    public void setUp() {
        whitelist = Whitelist.basic();
        cleaner = new Cleaner(whitelist);
    }

    @After
    public void tearDown() {
        whitelist = null;
        cleaner = null;
    }

    @Test
    public void testCleanWithNullDocumentThrows() {
        try {
            cleaner.clean(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("dirtyDocument"));
        }
    }

    @Test
    public void testCleanWithNullWhitelistInConstructorThrows() {
        try {
            new Cleaner(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("whitelist"));
        }
    }

    @Test
    public void testCleanSimpleDocument() {
        Document dirty = Document.createShell("http://example.com");
        Element body = dirty.body();
        body.append("<p>Hello</p>");
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertEquals("<p>Hello</p>", clean.body().html());
    }

    @Test
    public void testCleanRemovesUnsafeTags() {
        Whitelist strict = Whitelist.none();
        Cleaner strictCleaner = new Cleaner(strict);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>Safe</p><script>alert('xss')</script><div>Unsafe</div>");
        Document clean = strictCleaner.clean(dirty);
        // Only safe tags (none allowed) => body should be empty or contain only text?
        // Actually Whitelist.none allows no tags, so all elements are discarded, but text? 
        // In Cleaner, TextNode is always appended regardless of whitelist. So body contains "Safealert('xss')Unsafe".
        String bodyHtml = clean.body().html();
        assertFalse(bodyHtml.contains("<script>"));
        assertFalse(bodyHtml.contains("<div>"));
        assertFalse(bodyHtml.contains("<p>"));
        assertTrue(bodyHtml.contains("Safe"));
        assertTrue(bodyHtml.contains("Unsafe"));
    }

    @Test
    public void testCleanRemovesUnsafeAttributes() {
        Whitelist allowP = Whitelist.basic();
        // Whitelist.basic() allows p, a, etc. We'll add a tag and allow only specific attr.
        allowP.addTags("p");
        allowP.addAttributes("p", "class", "id");
        Cleaner cleanerWithAttrs = new Cleaner(allowP);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p class='ok' id='main' onclick='alert(1)'>Text</p>");
        Document clean = cleanerWithAttrs.clean(dirty);
        String html = clean.body().html();
        assertTrue(html.contains("class=\"ok\""));
        assertTrue(html.contains("id=\"main\""));
        assertFalse(html.contains("onclick"));
        assertTrue(html.contains("Text"));
    }

    @Test
    public void testCleanWithNoBodyDocument() {
        Document dirty = Document.createShell("http://example.com");
        // Remove body -> simulate frameset
        dirty.body().remove();
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean.body());
        assertEquals("", clean.body().html());
    }

    @Test
    public void testIsValidWithUnsafeContent() {
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p onclick='x()'>Hi</p>");
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValidWithSafeContent() {
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>Hi</p>");
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValidWithNullDocumentThrows() {
        try {
            cleaner.isValid(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCleanWithTextNodeAndDataNode() {
        Whitelist allowScript = Whitelist.basic();
        allowScript.addTags("script").addAttributes("script", "type");
        Cleaner scriptCleaner = new Cleaner(allowScript);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>Text</p><script type='text/javascript'>var a = 1;</script>");
        Document clean = scriptCleaner.clean(dirty);
        String html = clean.body().html();
        assertTrue(html.contains("var a = 1;"));
        assertTrue(html.contains("<script"));
        assertFalse(html.contains("onclick"));
    }

    @Test
    public void testCleanWithEnforcedAttributes() {
        Whitelist w = Whitelist.basic();
        w.addTags("a");
        w.addAttributes("a", "href", "rel");
        w.addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<a href='http://example.com'>Learn</a>");
        Document clean = c.clean(dirty);
        String html = clean.body().html();
        assertTrue(html.contains("rel=\"nofollow\""));
        assertTrue(html.contains("href=\"http://example.com\""));
        assertFalse(html.contains("target"));
    }

    @Test
    public void testCleanWithUnsafeTagInNestedLevels() {
        Whitelist w = Whitelist.basic();
        w.addTags("div");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<div><span onclick='x()'><b>Bold</b></span></div>");
        // span is not safe, so it will be discarded, but b inside? b is not allowed? Whitelist.basic() includes b? Actually basic includes b.
        // Let's assume b is allowed. Then span is discarded, b is not allowed? Actually b is not in basic (basic has b, i, em, etc? basic() allows many tags including b, i, etc). 
        // To make test clear, we use a custom whitelist that only allows div and b.
        // But we already set w.addTags("div") - this clears? Actually Whitelist.basic() includes many tags; we need to remove all? Not easy. Let's create a fresh Whitelist.
        Whitelist custom = Whitelist.none();
        custom.addTags("div", "b");
        Cleaner customCleaner = new Cleaner(custom);
        Document dirty2 = Document.createShell("http://example.com");
        dirty2.body().append("<div><span onclick='x()'><b>Bold</b></span></div>");
        Document clean2 = customCleaner.clean(dirty2);
        String html = clean2.body().html();
        assertTrue(html.contains("<b>Bold</b>"));
        assertFalse(html.contains("onclick"));
        assertFalse(html.contains("<span"));
    }

    @Test
    public void testCleanWithCommentAndProcessingInstructions() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<!-- comment --><p>Text</p><?xml version='1.0'?>");
        Document clean = c.clean(dirty);
        String html = clean.body().html();
        assertFalse(html.contains("<!--"));
        assertFalse(html.contains("<?"));
        assertTrue(html.contains("<p>Text</p>"));
    }

    @Test
    public void testCleanWithDataNodeInsideSafeTag() {
        Whitelist w = Whitelist.basic();
        w.addTags("script");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<script>var x = 1;</script>");
        Document clean = c.clean(dirty);
        assertTrue(clean.body().html().contains("var x = 1;"));
    }

    @Test
    public void testCleanWithUnsafeDataNode() {
        Whitelist w = Whitelist.none();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 1;", ""));
        dirty.body().appendChild(script);
        Document clean = c.clean(dirty);
        // Script tag is not safe, so DataNode should be discarded as well (since parent not safe)
        assertEquals("", clean.body().html());
    }

    @Test
    public void testCleanWithMultipleRootNodes() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>one</p><p>two</p><p>three</p>");
        Document clean = c.clean(dirty);
        String html = clean.body().html();
        assertTrue(html.contains("<p>one</p>"));
        assertTrue(html.contains("<p>two</p>"));
        assertTrue(html.contains("<p>three</p>"));
    }

    @Test
    public void testCleanWithLoopBounds() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        // Test zero iterations? Actually the traversal visits root once.
        dirty.body().append("");
        Document clean = c.clean(dirty);
        assertEquals("", clean.body().html());
        // One iteration: single element
        dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>only</p>");
        clean = c.clean(dirty);
        assertEquals("<p>only</p>", clean.body().html());
        // Many iterations: multiple elements
        dirty = Document.createShell("http://example.com");
        dirty.body().append("<p>1</p><p>2</p><p>3</p><p>4</p>");
        clean = c.clean(dirty);
        assertTrue(clean.body().html().contains("<p>1</p>"));
        assertTrue(clean.body().html().contains("<p>4</p>"));
    }

    @Test
    public void testCleanWithAttributesOnUnsafeTagDiscardCounts() {
        Whitelist w = Whitelist.none();
        Cleaner c = new Cleaner(w);
        w.addTags("p");
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p onclick='x'><span>text</span></p>");
        // p is safe, span is not; attributes on p: onclick is not allowed, so attribute is discarded. 
        Document clean = c.clean(dirty);
        String html = clean.body().html();
        assertFalse(html.contains("onclick"));
        assertFalse(html.contains("<span>"));
        assertTrue(html.contains("text"));
    }

    @Test
    public void testIsValidWithUnsafeAttributeDiscardCount() {
        Whitelist w = Whitelist.basic();
        w.addTags("p");
        w.addAttributes("p", "class");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p class='ok' title='bad'>Hello</p>");
        // title is not allowed, so isValid should return false
        assertFalse(c.isValid(dirty));
    }

    @Test
    public void testIsValidWithSafeAttributesOnly() {
        Whitelist w = Whitelist.basic();
        w.addTags("p");
        w.addAttributes("p", "class");
        w.addAttributes("p", "id");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().append("<p class='ok' id='main'>Hello</p>");
        assertTrue(c.isValid(dirty));
    }
}