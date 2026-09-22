package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeTest {
    private Element element;
    private Document doc;
    private Element parent;

    @Before
    public void setUp() {
        doc = new Document("http://example.com/base/");
        parent = doc.createElement("div");
        doc.appendChild(parent);
        element = doc.createElement("span");
        parent.appendChild(element);
    }

    @After
    public void tearDown() {
        element = null;
        parent = null;
        doc = null;
    }

    @Test
    public void testNodeName() {
        Element custom = new Element("custom");
        assertEquals("custom", custom.nodeName());
    }

    @Test
    public void testAttr() {
        element.attr("id", "test");
        assertEquals("test", element.attr("id"));
        assertEquals("", element.attr("nonexistent"));
        assertEquals("", element.attr(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrWithNullKeyThrows() {
        element.attr(null);
    }

    @Test
    public void testAbsAttr() {
        element.attr("href", "/path/relative");
        assertEquals("http://example.com/base/path/relative", element.attr("abs:href"));
    }

    @Test
    public void testHasAttr() {
        element.attr("id", "test");
        assertTrue(element.hasAttr("id"));
        assertFalse(element.hasAttr("nonexistent"));
        assertFalse(element.hasAttr(null));
    }

    @Test
    public void testRemoveAttr() {
        element.attr("id", "test");
        element.removeAttr("id");
        assertFalse(element.hasAttr("id"));
    }

    @Test
    public void testBaseUri() {
        assertEquals("http://example.com/base/", element.baseUri());
        element.setBaseUri("http://newbase.com/");
        assertEquals("http://newbase.com/", element.baseUri());
    }

    @Test
    public void testAbsUrl() {
        element.attr("href", "path/to/file.html");
        assertEquals("http://example.com/base/path/to/file.html", element.absUrl("href"));
        assertEquals("", element.absUrl("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlWithNullKey() {
        element.absUrl(null);
    }

    @Test
    public void testChildNode() {
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        element.appendChild(child1);
        element.appendChild(child2);
        assertEquals(child1, element.childNode(0));
        assertEquals(child2, element.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeNegativeIndex() {
        element.childNode(-1);
    }

    @Test
    public void testChildNodes() {
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        element.appendChild(child1);
        element.appendChild(child2);
        List<Node> children = element.childNodes();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        try {
            children.add(new Element("new"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testParent() {
        assertEquals(parent, element.parent());
        assertEquals(doc, parent.parent());
        assertNull(doc.parent());
    }

    @Test
    public void testRemove() {
        element.remove();
        assertNull(element.parent());
        assertEquals(0, parent.childNodes().size());
    }

    @Test
    public void testBefore() {
        Node newNode = new Element("p");
        element.before(newNode);
        assertEquals(newNode, parent.childNode(0));
        assertEquals(element, parent.childNode(1));
    }

    @Test
    public void testAfter() {
        Node newNode = new Element("p");
        element.after(newNode);
        assertEquals(element, parent.childNode(0));
        assertEquals(newNode, parent.childNode(1));
    }

    @Test
    public void testBeforeHtml() {
        element.before("<p>Test</p>");
        assertEquals("p", parent.childNode(0).nodeName());
        assertEquals(element, parent.childNode(1));
    }

    @Test
    public void testAfterHtml() {
        element.after("<p>Test</p>");
        assertEquals(element, parent.childNode(0));
        assertEquals("p", parent.childNode(1).nodeName());
    }

    @Test
    public void testWrap() {
        element.wrap("<div class='wrapper'></div>");
        assertEquals("div", parent.childNode(0).nodeName());
        assertEquals(element, parent.childNode(0).childNode(0));
    }

    @Test
    public void testWrapWithNested() {
        element.wrap("<div><p></p></div>");
        assertEquals("div", parent.childNode(0).nodeName());
        assertEquals(element, parent.childNode(0).childNode(0).childNode(0));
    }

    @Test
    public void testWrapWithNull() {
        try {
            element.wrap(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUnwrap() {
        Element span = new Element("span");
        span.appendChild(new TextNode("Text", ""));
        element.appendChild(span);
        Node firstChild = span.unwrap();
        assertEquals("Text", firstChild.nodeName());
        assertEquals(element, firstChild.parent());
    }

    @Test
    public void testSiblingNodes() {
        Element sibling1 = new Element("div");
        Element sibling2 = new Element("p");
        parent.appendChild(sibling1);
        parent.appendChild(sibling2);
        List<Node> siblings = sibling1.siblingNodes();
        assertEquals(2, siblings.size());
        assertEquals(parent.childNode(0), siblings.get(0));
        assertEquals(parent.childNode(1), siblings.get(1));
    }

    @Test
    public void testNextSibling() {
        Element sibling1 = new Element("div");
        Element sibling2 = new Element("p");
        parent.appendChild(sibling1);
        parent.appendChild(sibling2);
        assertEquals(sibling2, sibling1.nextSibling());
        assertNull(sibling2.nextSibling());
    }

    @Test
    public void testPreviousSibling() {
        Element sibling1 = new Element("div");
        Element sibling2 = new Element("p");
        parent.appendChild(sibling1);
        parent.appendChild(sibling2);
        assertEquals(sibling1, sibling2.previousSibling());
        assertNull(sibling1.previousSibling());
    }

    @Test
    public void testSiblingIndex() {
        Element sibling1 = new Element("div");
        Element sibling2 = new Element("p");
        parent.appendChild(sibling1);
        parent.appendChild(sibling2);
        assertEquals(0, sibling1.siblingIndex());
        assertEquals(1, sibling2.siblingIndex());
    }

    @Test
    public void testTraverse() {
        element.appendChild(new Element("child"));
        final StringBuilder visited = new StringBuilder();
        element.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {
                visited.append(node.nodeName()).append(";");
            }

            @Override
            public void tail(Node node, int depth) {
                visited.append("tail-").append(node.nodeName()).append(";");
            }
        });
        assertTrue(visited.toString().contains("span;"));
        assertTrue(visited.toString().contains("child;"));
    }

    @Test
    public void testOuterHtml() {
        element.attr("class", "test");
        assertEquals("<span class=\"test\"></span>", element.outerHtml());
    }

    @Test
    public void testToString() {
        assertEquals(element.outerHtml(), element.toString());
    }

    @Test
    public void testEquals() {
        Element element1 = new Element("div");
        Element element2 = new Element("div");
        assertNotEquals(element1, element2);
        assertEquals(element1, element1);
        assertNotEquals(element1, null);
    }

    @Test
    public void testHashCode() {
        Element element1 = new Element("div");
        Element element2 = new Element("div");
        assertNotEquals(element1.hashCode(), element2.hashCode());
    }

    @Test
    public void testClone() {
        element.attr("id", "test");
        element.appendChild(new Element("child"));
        Node clone = element.clone();
        assertNotSame(element, clone);
        assertEquals(element.outerHtml(), clone.outerHtml());
        assertEquals("test", clone.attr("id"));
        assertEquals("child", clone.childNode(0).nodeName());
    }

    @Test
    public void testSiblingNodesWithNoParent() {
        Element orphan = new Element("div");
        List<Node> siblings = orphan.siblingNodes();
        assertNotNull(siblings);
        assertEquals(0, siblings.size());
    }

    @Test
    public void testNextSiblingWithNoParent() {
        Element orphan = new Element("div");
        assertNull(orphan.nextSibling());
    }

    @Test
    public void testPreviousSiblingWithNoParent() {
        Element orphan = new Element("div");
        assertNull(orphan.previousSibling());
    }

    @Test
    public void testSiblingIndexWithNoParent() {
        Element orphan = new Element("div");
        assertEquals(0, orphan.siblingIndex());
    }

    @Test
    public void testOwnerDocument() {
        assertEquals(doc, element.ownerDocument());
        assertNull(new Element("div").ownerDocument());
    }

    @Test
    public void testAbsUrlWithPort() throws Exception {
        Element link = new Element("a");
        link.attr("href", "path");
        link.setBaseUri("http://example.com:8080/");
        assertEquals("http://example.com:8080/path", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithQueryString() throws Exception {
        Element link = new Element("a");
        link.attr("href", "?query=value");
        link.setBaseUri("http://example.com/path/to/page");
        assertEquals("http://example.com/path/to/page?query=value", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithHash() throws Exception {
        Element link = new Element("a");
        link.attr("href", "#section");
        link.setBaseUri("http://example.com/path/to/page");
        assertEquals("http://example.com/path/to/page#section", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithProtocolRelative() throws Exception {
        Element link = new Element("a");
        link.attr("href", "//cdn.example.com/lib.js");
        link.setBaseUri("http://example.com/path/");
        assertEquals("http://cdn.example.com/lib.js", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithAbsoluteHttps() throws Exception {
        Element link = new Element("a");
        link.attr("href", "https://example.com/");
        link.setBaseUri("http://example.com/");
        assertEquals("https://example.com/", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithRootRelativePath() throws Exception {
        Element link = new Element("a");
        link.attr("href", "/root/path");
        link.setBaseUri("http://example.com/base/");
        assertEquals("http://example.com/root/path", link.absUrl("href"));
    }

    @Test
    public void testAbsUrlWithRelativePathContainingDots() throws Exception {
        Element link = new Element("a");
        link.attr("href", ".././path/../file");
        link.setBaseUri("http://example.com/base/dir/");
        assertEquals("http://example.com/base/file", link.absUrl("href"));
    }
}