package org.jsoup.nodes;

import org.jsoup.JsParserTest;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeVisitor;
import static org.junit.Assert.*;
import java.util.List;

public class NodeTest {
    private Element element;
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        element = new Element("div").attr("id", "test");
        element.baseUri("http://example.com/base/");
    }

    @After
    public void tearDown() {
        element = null;
        doc = null;
    }

    @Test
    public void testNodeName() {
        Element e = new Element("span");
        assertEquals("span", e.nodeName());
    }

    @Test
    public void testAttrGetExisting() {
        element.attr("data-key", "value1");
        assertEquals("value1", element.attr("data-key"));
    }

    @Test
    public void testAttrGetMissing() {
        assertEquals("", element.attr("missing"));
    }

    @Test
    public void testAttrGetAbsUrl() {
        element.attr("href", "/page.html");
        assertEquals("http://example.com/base/page.html", element.attr("abs:href"));
    }

    @Test
    public void testAttrGetAbsUrlMissingAttr() {
        assertEquals("", element.attr("abs:missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrNullKey() {
        element.attr(null);
    }

    @Test
    public void testHasAttrTrue() {
        element.attr("data-x", "y");
        assertTrue(element.hasAttr("data-x"));
    }

    @Test
    public void testHasAttrFalse() {
        assertFalse(element.hasAttr("nope"));
    }

    @Test
    public void testHasAttrAbsUrlValid() {
        element.attr("href", "valid.html");
        assertTrue(element.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttrAbsUrlMissingKey() {
        assertFalse(element.hasAttr("abs:missing"));
    }

    @Test
    public void testRemoveAttr() {
        element.attr("k", "v");
        element.removeAttr("k");
        assertFalse(element.hasAttr("k"));
    }

    @Test
    public void testBaseUri() {
        assertEquals("http://example.com/base/", element.baseUri());
    }

    @Test
    public void testSetBaseUriRecursive() {
        Element child = new Element("p");
        element.appendChild(child);
        element.setBaseUri("http://new.com/");
        assertEquals("http://new.com/", child.baseUri());
    }

    @Test
    public void testAbsUrlAbsolute() {
        element.attr("href", "http://other.com/path");
        assertEquals("http://other.com/path", element.absUrl("href"));
    }

    @Test
    public void testAbsUrlRelative() {
        element.attr("src", "image.png");
        assertEquals("http://example.com/base/image.png", element.absUrl("src"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKey() {
        element.absUrl("");
    }

    @Test
    public void testChildNodeIndex() {
        Element parent = new Element("ul");
        Element c1 = new Element("li").text("one");
        Element c2 = new Element("li").text("two");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(c1, parent.childNode(0));
        assertEquals(c2, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeOutOfBounds() {
        element.childNode(5);
    }

    @Test
    public void testChildNodesUnmodifiable() {
        element.appendChild(new Element("span"));
        List<Node> children = element.childNodes();
        try {
            children.add(new Element("x"));
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testChildNodeSizeEmpty() {
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void testChildNodeSizeNonEmpty() {
        element.appendChild(new Element("a"));
        element.appendChild(new Element("b"));
        assertEquals(2, element.childNodeSize());
    }

    @Test
    public void testParentNull() {
        Element isolated = new Element("div");
        assertNull(isolated.parent());
    }

    @Test
    public void testParentWithParent() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testOwnerDocumentSelf() {
        Document d = new Document("http://x.com");
        assertEquals(d, d.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNested() {
        Document d = new Document("http://x.com");
        Element root = new Element("html");
        Element body = new Element("body");
        d.appendChild(root);
        root.appendChild(body);
        assertEquals(d, body.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNoParent() {
        Element orphan = new Element("p");
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testRemoveWithParent() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.remove();
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void testBeforeString() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.before("<b>bold</b>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("b", parent.childNode(0).nodeName());
    }

    @Test
    public void testBeforeNode() {
        Element parent = new Element("div");
        Element child = new Element("span");
        Element newSibling = new Element("em");
        parent.appendChild(child);
        child.before(newSibling);
        assertEquals(2, parent.childNodeSize());
        assertEquals(newSibling, parent.childNode(0));
    }

    @Test
    public void testAfterString() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.after("<i>italic</i>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("i", parent.childNode(1).nodeName());
    }

    @Test
    public void testAfterNode() {
        Element parent = new Element("div");
        Element child = new Element("span");
        Element newSibling = new Element("em");
        parent.appendChild(child);
        child.after(newSibling);
        assertEquals(2, parent.childNodeSize());
        assertEquals(newSibling, parent.childNode(1));
    }

    @Test
    public void testWrapSimple() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.wrap("<section></section>");
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("section", ((Element) parent.childNode(0)).tagName());
        assertEquals(child, ((Element) parent.childNode(0)).childNode(0));
    }

    @Test
    public void testWrapWithTextContent() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.wrap("<section data-x='1'></section>");
        assertEquals("1", ((Element) parent.childNode(0)).attr("data-x"));
    }

    @Test
    public void testWrapNoWrapElement() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.wrap("plain text no element");
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testUnwrapWithChildren() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span").text("one"));
        parent.appendChild(new Element("span").text("two"));
        Element middle = new Element("span");
        parent.appendChild(middle);
        middle.appendChild(new Element("em").text("three"));
        parent.appendChild(new Element("p").text("four"));
        middle.unwrap();
        assertEquals(5, parent.childNodeSize());
        assertEquals("three", parent.childNode(2).outerHtml());
    }

    @Test
    public void testSiblingNodesNoParent() {
        Element orphan = new Element("div");
        assertEquals(0, orphan.siblingNodes().size());
    }

    @Test
    public void testSiblingNodes() {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        Element c = new Element("c");
        parent.appendChild(a);
        parent.appendChild(b);
        parent.appendChild(c);
        assertEquals(2, b.siblingNodes().size());
        assertTrue(b.siblingNodes().contains(a));
        assertTrue(b.siblingNodes().contains(c));
    }

    @Test
    public void testNextSibling() {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertEquals(b, a.nextSibling());
    }

    @Test
    public void testNextSiblingLast() {
        Element parent = new Element("div");
        Element a = new Element("a");
        parent.appendChild(a);
        assertNull(a.nextSibling());
    }

    @Test
    public void testPreviousSibling() {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertEquals(a, b.previousSibling());
    }

    @Test
    public void testPreviousSiblingFirst() {
        Element parent = new Element("div");
        Element a = new Element("a");
        parent.appendChild(a);
        assertNull(a.previousSibling());
    }

    @Test
    public void testSiblingIndex() {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parent.appendChild(a);
        parent.appendChild(b);
        assertEquals(0, a.siblingIndex());
        assertEquals(1, b.siblingIndex());
    }

    @Test
    public void testTraverseVisitor() {
        Element root = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        root.appendChild(child1);
        root.appendChild(child2);
        final StringBuilder sb = new StringBuilder();
        root.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                sb.append(node.nodeName()).append(";");
            }
            public void tail(Node node, int depth) {
                // no-op
            }
        });
        assertEquals("div;span;p;", sb.toString());
    }

    @Test
    public void testEqualsSameObject() {
        Element e = new Element("div");
        assertTrue(e.equals(e));
    }

    @Test
    public void testEqualsNull() {
        Element e = new Element("div");
        assertFalse(e.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Element e = new Element("div");
        String s = "not a node";
        assertFalse(e.equals(s));
    }

    @Test
    public void testEqualsIdenticalNodes() {
        Element e1 = new Element("div").attr("data-x", "y");
        Element e2 = new Element("div").attr("data-x", "y");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentAttributes() {
        Element e1 = new Element("div").attr("data-x", "y");
        Element e2 = new Element("div").attr("data-x", "z");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testHashCodeConsistent() {
        Element e = new Element("div").attr("a", "b");
        e.appendChild(new Element("span"));
        int h1 = e.hashCode();
        int h2 = e.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testCloneShallow() {
        Element original = new Element("div").attr("k", "v");
        Element cloned = (Element) original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.attr("k"), cloned.attr("k"));
        assertFalse(original == cloned);
    }

    @Test
    public void testCloneDeepChildren() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span").text("child"));
        Element clone = (Element) parent.clone();
        assertEquals(1, clone.childNodeSize());
        assertNotSame(parent.childNode(0), clone.childNode(0));
    }

    @Test
    public void testCloneIndependentAttributes() {
        Element original = new Element("div").attr("k", "v1");
        Element clone = (Element) original.clone();
        clone.attr("k", "v2");
        assertEquals("v1", original.attr("k"));
    }

    @Test
    public void testOuterHtml() {
        Element e = new Element("div").text("hello").attr("id", "x");
        assertEquals("<div id=\"x\">hello</div>", e.outerHtml());
    }

    @Test
    public void testToString() {
        Element e = new Element("br");
        assertEquals(e.outerHtml(), e.toString());
    }
}