package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Attributes;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class NodeTest {
    private Document doc;
    private Element element;
    private Node node;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        element = new Element("div");
        node = new TextNode("text");
        doc.appendChild(element);
        element.appendChild(node);
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", node.nodeName());
        assertEquals("div", element.nodeName());
    }

    @Test
    public void testAttr() {
        element.attr("id", "test");
        assertEquals("test", element.attr("id"));
        assertEquals("", element.attr("nonexistent"));
        assertNull(element.attr(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrNullKey() {
        element.attr(null);
    }

    @Test
    public void testAttributes() {
        assertNotNull(element.attributes());
        assertEquals(0, element.attributes().size());
    }

    @Test
    public void testAttrSet() {
        Node returned = element.attr("class", "test");
        assertSame(element, returned);
        assertEquals("test", element.attr("class"));
    }

    @Test
    public void testHasAttr() {
        element.attr("data-test", "value");
        assertTrue(element.hasAttr("data-test"));
        assertFalse(element.hasAttr("nonexistent"));
        assertFalse(element.hasAttr(null));
    }

    @Test
    public void testRemoveAttr() {
        element.attr("class", "test");
        assertTrue(element.hasAttr("class"));
        Node returned = element.removeAttr("class");
        assertFalse(element.hasAttr("class"));
        assertSame(element, returned);
    }

    @Test
    public void testBaseUri() {
        assertEquals("http://example.com", element.baseUri());
        element.setBaseUri("http://new.com");
        assertEquals("http://new.com", element.baseUri());
    }

    @Test
    public void testAbsUrl() {
        element.attr("href", "http://example.com/path");
        assertEquals("http://example.com/path", element.absUrl("href"));
    }

    @Test
    public void testAbsUrlRelative() {
        element.attr("href", "/path");
        assertEquals("http://example.com/path", element.absUrl("href"));
    }

    @Test
    public void testAbsUrlMissing() {
        assertEquals("", element.absUrl("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlNull() {
        element.absUrl(null);
    }

    @Test
    public void testAbsUrlMalformedBase() {
        node.setBaseUri("://bad");
        element.attr("href", "http://example.com");
        assertEquals("http://example.com", element.absUrl("href"));
    }

    @Test
    public void testChildNode() {
        List<Node> children = doc.childNodes();
        assertEquals(1, children.size());
        assertEquals(element, doc.childNode(0));
    }

    @Test
    public void testChildNodes() {
        List<Node> children = doc.childNodes();
        assertEquals(1, children.size());
        assertTrue(children instanceof java.util.List);
    }

    @Test
    public void testChildNodesAsArray() {
        Node[] children = element.childNodesAsArray();
        assertNotNull(children);
        assertEquals(1, children.length);
    }

    @Test
    public void testParent() {
        assertEquals(element, node.parent());
        assertEquals(doc, element.parent());
        assertNull(doc.parent());
    }

    @Test
    public void testOwnerDocument() {
        assertEquals(doc, node.ownerDocument());
        assertEquals(doc, element.ownerDocument());
        assertNotEquals(doc, new Document("http://other.com"));
    }

    @Test
    public void testRemove() {
        assertEquals(1, element.childNodes().size());
        node.remove();
        assertEquals(0, element.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveNoParent() {
        Node orphan = new Element("span");
        orphan.remove();
    }

    @Test
    public void testReplaceWith() {
        Node replacement = new Element("span");
        node.replaceWith(replacement);
        assertEquals(1, element.childNodes().size());
        assertSame(replacement, element.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNull() {
        node.replaceWith(null);
    }

    @Test
    public void testSiblingNodes() {
        List<Node> siblings = node.siblingNodes();
        assertEquals(1, siblings.size());
        assertEquals(node, siblings.get(0));
    }

    @Test
    public void testNextSibling() {
        Element first = new Element("p");
        Element second = new Element("span");
        element.appendChild(first);
        element.appendChild(second);
        assertEquals(second, first.nextSibling());
        assertNull(second.nextSibling());
        assertNull(doc.nextSibling());
    }

    @Test
    public void testPreviousSibling() {
        Element first = new Element("p");
        Element second = new Element("span");
        element.appendChild(first);
        element.appendChild(second);
        assertEquals(first, second.previousSibling());
        assertNull(first.previousSibling());
        assertNull(doc.previousSibling());
    }

    @Test
    public void testSiblingIndex() {
        assertEquals(0, node.siblingIndex());
        element.appendChild(new Element("span"));
        List<Node> siblings = element.childNodes();
        assertEquals(1, siblings.get(1).siblingIndex().intValue());
    }

    @Test
    public void testOuterHtml() {
        assertNotNull(node.outerHtml());
        assertTrue(node.outerHtml().contains("text"));
    }

    @Test
    public void testToString() {
        assertEquals(node.outerHtml(), node.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(doc.equals(doc));
        assertFalse(doc.equals(element));
        assertFalse(element.equals(null));
        assertFalse(element.equals("text"));
    }

    @Test
    public void testHashCode() {
        assertNotNull(node.hashCode());
        assertEquals(node.hashCode(), node.hashCode());
    }

    @Test
    public void testClone() {
        Node cloned = node.clone();
        assertNotNull(cloned);
        assertNotSame(node, cloned);
        assertEquals(node.nodeName(), cloned.nodeName());
        assertEquals(node.outerHtml(), cloned.outerHtml());
        assertNull(cloned.parent());
        assertEquals(0, cloned.childNodes().size());
    }

    @Test
    public void testDoCloneWithParent() {
        Node cloned = node.doClone(null);
        assertNotNull(cloned);
        assertNull(cloned.parent());
        Node childClone = node.doClone(element);
        assertNotNull(childClone);
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertNotNull(accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertNotNull(accum.toString());
    }

    @Test
    public void testGetOutputSettings() {
        assertNotNull(node.getOutputSettings());
        Document doc2 = new Document("http://example.com");
        assertEquals(doc2.outputSettings(), node.getOutputSettings());
    }

    @Test
    public void testSetSiblingIndex() {
        ((Element) element.childNode(0)).setSiblingIndex(5);
        assertEquals(5, node.siblingIndex().intValue());
    }

    @Test
    public void testAddChildren() {
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        element.addChildren(child1, child2);
        assertEquals(2, element.childNodes().size());
        assertEquals(child1, element.childNode(0));
        assertEquals(child2, element.childNode(1));
    }

    @Test
    public void testAddChildrenAtIndex() {
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        element.addChildren(0, child1, child2);
        assertEquals(2, element.childNodes().size());
        assertEquals(child1, element.childNode(0));
        assertEquals(child2, element.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenNull() {
        element.addChildren((Node[]) null);
    }

    @Test
    public void testRemoveChild() {
        element.appendChild(new Element("span"));
        element.removeChild(node);
        assertEquals(1, element.childNodes().size());
    }

    @Test
    public void testReparentChild() {
        Element parent = new Element("div");
        Node child = new Element("span");
        parent.addChildren(child);
        element.addChildren(node);
        assertEquals(element, node.parent());
    }

    @Test
    public void testReindexChildren() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.addChildren(child1, child2);
        assertEquals(0, child1.siblingIndex().intValue());
        assertEquals(1, child2.siblingIndex().intValue());
    }

    @Test
    public void testReplaceChild() {
        Node old = element.childNode(0);
        Node replacement = new Element("span");
        element.replaceChild(old, replacement);
        assertEquals(1, element.childNodes().size());
        assertSame(replacement, element.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChildNotChild() {
        Node notChild = new Element("span");
        element.replaceChild(notChild, new Element("div"));
    }

    @Test
    public void testSetParentNode() {
        Element newParent = new Element("section");
        node.setParentNode(newParent);
        assertEquals(newParent, node.parent());
        node.setParentNode(newParent); // idempotent
    }

    @Test
    public void testRemoveNoParent() {
        Node orphan = new Element("span");
        orphan.remove();
    }
}