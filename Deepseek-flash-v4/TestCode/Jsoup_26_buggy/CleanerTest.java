package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;

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

    @Test(expected = NullPointerException.class)
    public void testConstructorNullWhitelist() {
        new Cleaner(null);
    }

    @Test(expected = NullPointerException.class)
    public void testCleanNullDocument() {
        cleaner.clean(null);
    }

    @Test(expected = NullPointerException.class)
    public void testIsValidNullDocument() {
        cleaner.isValid(null);
    }

    @Test
    public void testCleanEmptyDocument() {
        Document dirty = Document.createShell("");
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertEquals(dirty.baseUri(), clean.baseUri());
        assertNotNull(clean.body());
    }

    @Test
    public void testCleanWithNoChildren() {
        Document dirty = Document.createShell("http://example.com");
        Element body = dirty.body();
        body.empty();
        Document clean = cleaner.clean(dirty);
        assertEquals(0, clean.body().childNodes().size());
        assertTrue(clean.body().childNodes().isEmpty());
    }

    @Test
    public void testIsValidWithSafeTags() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("p").text("hello");
        assertTrue(c.isValid(dirty));
    }

    @Test
    public void testIsValidWithUnsafeTag() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("script").text("alert(1)");
        assertFalse(c.isValid(dirty));
    }

    @Test
    public void testCleanWithUnsafeTagRecursion() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        Element div = dirty.body().appendElement("div");
        div.appendElement("script").text("malicious");
        div.appendElement("p").text("safe");
        Document clean = c.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
        Element p = (Element) clean.body().childNodes().get(0);
        assertEquals("p", p.tagName());
        assertEquals("safe", p.text());
    }

    @Test
    public void testCleanWithTextNodeOnly() {
        Document dirty = Document.createShell("");
        dirty.body().text("just text");
        Document clean = cleaner.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
        assertTrue(clean.body().childNodes().get(0) instanceof TextNode);
        assertEquals("just text", ((TextNode) clean.body().childNodes().get(0)).getWholeText());
    }

    @Test
    public void testCleanWithSafeAttributePreserved() {
        Whitelist w = Whitelist.basic();
        w.addAttributes("a", "href");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("a").attr("href", "http://example.com").text("link");
        Document clean = c.clean(dirty);
        assertEquals("http://example.com", clean.body().select("a").first().attr("href"));
    }

    @Test
    public void testCleanWithUnsafeAttributeDiscarded() {
        Whitelist w = Whitelist.basic();
        w.addAttributes("a", "href");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("a").attr("href", "http://example.com").attr("onclick", "bad()").text("link");
        Document clean = c.clean(dirty);
        Element a = clean.body().select("a").first();
        assertFalse(a.hasAttr("onclick"));
        assertTrue(a.hasAttr("href"));
    }

    @Test
    public void testCleanWithEnforcedAttributes() {
        Whitelist w = Whitelist.basic();
        w.addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("a").attr("href", "http://example.com").text("link");
        Document clean = c.clean(dirty);
        Element a = clean.body().select("a").first();
        assertEquals("nofollow", a.attr("rel"));
    }

    @Test
    public void testCreateSafeElementWithAllAttrsSafe() {
        Whitelist w = Whitelist.simpleText();
        w.addAttributes("p", "class");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        Element p = dirty.body().appendElement("p");
        p.attr("class", "test");
        p.text("hello");
        Document clean = c.clean(dirty);
        Element cleanP = clean.body().select("p").first();
        assertEquals("test", cleanP.attr("class"));
        assertEquals("hello", cleanP.text());
    }

    @Test
    public void testCopySafeNodesHandlesCommentNodes() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendChild(org.jsoup.parser.Parser.parseFragment("<!-- comment -->", ""));
        Document clean = c.clean(dirty);
        assertEquals(0, clean.body().childNodes().size());
    }

    @Test
    public void testIsSafeTagNested() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        Element div = dirty.body().appendElement("div");
        Element p = div.appendElement("p");
        p.text("nested okay");
        Document clean = c.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
        assertEquals("div", clean.body().childNodes().get(0).nodeName());
    }

    @Test
    public void testAttributeCaseSensitivity() {
        Whitelist w = Whitelist.basic();
        w.addAttributes("p", "class");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("p").attr("CLASS", "test").text("text");
        Document clean = c.clean(dirty);
        Element p = clean.body().select("p").first();
        assertFalse(p.hasAttr("CLASS"));
        assertEquals("", p.attr("class"));
    }

    @Test
    public void testMultipleUnsafeElementsRecursion() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("script").text("one");
        dirty.body().appendElement("style").text("two");
        dirty.body().appendElement("p").text("safe1");
        Document clean = c.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
    }

    @Test
    public void testIsValidComplexDirtyDoc() {
        Whitelist w = Whitelist.basic();
        w.addTags("b", "i");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("b").text("bold");
        dirty.body().appendElement("i").text("italic");
        assertTrue(c.isValid(dirty));
        dirty.body().appendElement("script").text("bad");
        assertFalse(c.isValid(dirty));
    }

    @Test
    public void testUnsafeAttributesWithNestedSafeElement() {
        Whitelist w = Whitelist.basic();
        w.addAttributes("a", "href");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        Element a = dirty.body().appendElement("div").appendElement("a");
        a.attr("href", "http://safe.com").attr("onclick", "bad()");
        a.text("link");
        Document clean = c.clean(dirty);
        Element cleanA = clean.body().select("a").first();
        assertNotNull(cleanA);
        assertFalse(cleanA.hasAttr("onclick"));
        assertEquals("http://safe.com", cleanA.attr("href"));
    }

    @Test
    public void testNullTextNodePreservation() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendText("hello");
        dirty.body().appendElement("p").text("world");
        Document clean = c.clean(dirty);
        List<Node> children = clean.body().childNodes();
        assertEquals(2, children.size());
        assertEquals("hello", ((TextNode) children.get(0)).getWholeText());
        assertEquals("p", children.get(1).nodeName());
    }

    @Test
    public void testMultipleSafeTagsNestedDepth() {
        Whitelist w = Whitelist.basic();
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        Element outer = dirty.body().appendElement("div");
        Element inner = outer.appendElement("div");
        inner.appendElement("p").text("deep");
        Document clean = c.clean(dirty);
        assertEquals("div", clean.body().childNodes().get(0).nodeName());
        Element cleanOuter = (Element) clean.body().childNodes().get(0);
        Element cleanInner = (Element) cleanOuter.childNodes().get(0);
        assertEquals("div", cleanInner.nodeName());
    }

    @Test
    public void testEmptyAttributeValue() {
        Whitelist w = Whitelist.basic();
        w.addAttributes("p", "class");
        Cleaner c = new Cleaner(w);
        Document dirty = Document.createShell("");
        dirty.body().appendElement("p").attr("class", "").text("content");
        Document clean = c.clean(dirty);
        Element p = clean.body().select("p").first();
        assertEquals("", p.attr("class"));
    }
}