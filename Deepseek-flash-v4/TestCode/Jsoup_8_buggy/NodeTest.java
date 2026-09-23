package org.jsoup.nodes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NodeTest {

    private static class TestNode extends Node {
        TestNode(String baseUri) {
            super(baseUri);
        }

        TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }

        @Override
        public String nodeName() {
            return "test";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(nodeName()).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(nodeName()).append(">");
        }
    }

    private TestNode createNode() {
        return new TestNode("http://example.com/base");
    }

    @Test
    public void testConstructorsValidateNull() {
        try {
            new TestNode(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            new TestNode(null, new Attributes());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            new TestNode("http://example.com", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAttributesOperations() {
        TestNode n = createNode();

        assertSame(n, n.attr("key", "value"));
        assertEquals("value", n.attr("key"));
        assertTrue(n.hasAttr("key"));
        assertEquals("value", n.attributes().get("key"));

        assertSame(n, n.removeAttr("key"));
        assertFalse(n.hasAttr("key"));
        assertEquals("", n.attr("missing"));
    }

    @Test
    public void testAbsAttrAndAbsUrl() {
        TestNode n = createNode();

        n.attr("href", "page.html");
        assertEquals("http://example.com/page.html", n.absUrl("href"));
        assertEquals("http://example.com/page.html", n.attr("abs:href"));

        n.attr("url", "http://other.com/x");
        assertEquals("http://other.com/x", n.absUrl("url"));
        assertEquals("", n.absUrl("missing"));
    }

    @Test
    public void testBaseUri() {
        TestNode n = new TestNode("  http://example.com/base  ");
        assertEquals("http://example.com/base", n.baseUri());

        n.setBaseUri("  http://example.org/  ");
        assertEquals("  http://example.org/  ", n.baseUri());
    }

    @Test
    public void testAddChildrenAndChildNodes() {
        TestNode parent = createNode();
        TestNode c1 = createNode();
        TestNode c2 = createNode();
        TestNode c3 = createNode();

        parent.addChildren(c1, c2, c3);

        assertEquals(3, parent.childNodes().size());
        assertSame(c1, parent.childNode(0));
        assertSame(c3, parent.childNode(2));
        assertEquals(0, c1.siblingIndex());
        assertEquals(2, c3.siblingIndex());
        assertSame(parent, c2.parent());
    }

    @Test
    public void testAddChildAtIndex() {
        TestNode parent = createNode();
        TestNode c1 = createNode();
        TestNode c2 = createNode();
        TestNode c3 = createNode();

        parent.addChildren(c1, c3);
        parent.addChildren(1, c2);

        assertEquals(3, parent.childNodes().size());
        assertSame(c1, parent.childNode(0));
        assertSame(c2, parent.childNode(1));
        assertSame(c3, parent.childNode(2));
        assertEquals(1, c2.siblingIndex());
    }

    @Test
    public void testAddChildrenRejectsNullElement() {
        TestNode parent = createNode();

        try {
            parent.addChildren(0, (Node) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReparentMovesFromOldParent() {
        TestNode p1 = createNode();
        TestNode p2 = createNode();
        TestNode child = createNode();

        p1.addChildren(child);
        p2.addChildren(child);

        assertSame(p2, child.parent());
        assertEquals(1, p2.childNodes().size());
        assertEquals(0, p1.childNodes().size());
    }

    @Test
    public void testChildNodesAreUnmodifiable() {
        TestNode parent = createNode();

        try {
            parent.childNodes().add(createNode());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testParentAndOwnerDocument() {
        TestNode n = createNode();

        assertNull(n.parent());
        assertNull(n.ownerDocument());

        Document doc = new Document("http://example.com");
        doc.addChildren(n);

        assertSame(doc, n.parent());
        assertSame(doc, n.ownerDocument());
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testSiblingAccessors() {
        TestNode parent = createNode();
        TestNode c1 = createNode();
        TestNode c2 = createNode();
        TestNode c3 = createNode();

        parent.addChildren(c1, c2, c3);

        assertSame(c2, c1.nextSibling());
        assertNull(c3.nextSibling());

        assertSame(c2, c3.previousSibling());
        assertNull(c1.previousSibling());

        assertEquals(Arrays.asList(c1, c2, c3), c2.siblingNodes());
        assertEquals(Integer.valueOf(0), c1.siblingIndex());
        assertEquals(Integer.valueOf(2), c3.siblingIndex());
    }

    @Test
    public void testRootNextAndPreviousSiblingAreNull() {
        TestNode n = createNode();

        assertNull(n.nextSibling());
        assertNull(n.previousSibling());
    }

    @Test
    public void testSetSiblingIndex() {
        TestNode n = createNode();

        assertEquals(0, n.siblingIndex());
        n.setSiblingIndex(5);
        assertEquals(5, n.siblingIndex());
    }

    @Test
    public void testRemove() {
        TestNode parent = createNode();
        TestNode c1 = createNode();
        TestNode c2 = createNode();
        TestNode c3 = createNode();

        parent.addChildren(c1, c2, c3);
        c2.remove();

        assertEquals(2, parent.childNodes().size());
        assertSame(c1, parent.childNode(0));
        assertSame(c3, parent.childNode(1));
        assertEquals(1, c3.siblingIndex());
        assertNull(c2.parent());
    }

    @Test
    public void testRemoveWithoutParentThrows() {
        try {
            createNode().remove();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReplaceWith() {
        TestNode parent = createNode();
        TestNode old = createNode();
        TestNode replacement = createNode();

        parent.addChildren(old);
        old.replaceWith(replacement);

        assertSame(replacement, parent.childNode(0));
        assertSame(parent, replacement.parent());
        assertNull(old.parent());
        assertEquals(1, parent.childNodes().size());
    }

    @Test
    public void testReplaceWithRemovesFromOldParent() {
        TestNode parent1 = createNode();
        TestNode parent2 = createNode();
        TestNode old = createNode();
        TestNode replacement = createNode();

        parent1.addChildren(old);
        parent2.addChildren(replacement);

        old.replaceWith(replacement);

        assertSame(replacement, parent1.childNode(0));
        assertSame(parent1, replacement.parent());
        assertEquals(0, parent2.childNodes().size());
    }

    @Test
    public void testOuterHtmlAndToString() {
        Document doc = new Document("http://example.com");
        TestNode n = new TestNode("http://example.com");

        doc.addChildren(n);

        assertEquals("<test></test>", n.outerHtml());
        assertEquals("<test></test>", n.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        TestNode n = createNode();

        assertEquals(n, n);
        assertFalse(n.equals(null));
        assertFalse(n.equals(createNode()));
        assertFalse(n.equals("test"));
        assertNotNull(n.hashCode());
    }

    @Test
    public void testInvalidInputs() {
        TestNode n = createNode();

        try {
            n.attr(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            n.absUrl("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            n.childNode(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}