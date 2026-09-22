package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.List;

public class NodeTest {
    private Document doc;
    private Element element;
    private Element parent;
    private Node child;

    @Before
    public void setUp() {
        doc = Jsup.parse("<html><body><div id='parent'><p id='child'>Test</p></div></body></html>");
        parent = doc.selectFirst("div#parent");
        child = doc.selectFirst("p#child");
        element = (Element) child;
    }

    @After
    public void tearDown() {
        doc = null;
        parent = null;
        child = null;
        element = null;
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", doc.selectFirst("p").textNode().nodeName());
        assertEquals("div", parent.nodeName());
        assertEquals("#root", doc.nodeName());
    }

    @Test
    public void testAttr() {
        assertNotNull(element.attr("id"));
        assertEquals("child", element.attr("id"));
        assertEquals("", element.attr("nonexistent"));
        
        element.attr("data-test", "value");
        assertEquals("value", element.attr("data-test"));
        
        element.attr("href", "/relative");
        assertEquals("", element.attr("abs:href")); // baseUri empty
    }

    @Test(expected = NullPointerException.class)
    public void testAttrNullKey() {
        element.attr((String) null);
    }

    @Test
    public void testAttributes() {
        assertNotNull(element.attributes());
        assertEquals(2, element.attributes().size()); // id, class
    }

    @Test
    public void testHasAttr() {
        assertTrue(element.hasAttr("id"));
        assertFalse(element.hasAttr("nonexistent"));
        
        document = Jsoup.parse("<html><body><div base='http://example.com'><p>Hello</p></div></body></html>");
        String base = document.select("div").get(0).baseUri();
        assertEquals("", base);
    }

    @Test
    public void testRemoveAttr() {
        element.removeAttr("id");
        assertFalse(element.hasAttr("id"));
    }

    @Test
    public void testBaseUri() {
        assertEquals("", element.baseUri());
        
        element.setBaseUri("http://example.com/");
        assertEquals("http://example.com/", element.baseUri());
    }

    @Test
    public void testAbsUrl() {
        element.attr("href", "/path");
        element.setBaseUri("http://example.com");
        assertEquals("http://example.com/path", element.absUrl("href"));
        
        element.attr("src", "file.png");
        assertEquals("", element.absUrl("src")); // no base for this attr
        
        element.setBaseUri("");
        assertEquals("", element.absUrl("href"));
    }

    @Test
    public void testChildNodeIndex() {
        Element parent = doc.selectFirst("div");
        Node first = parent.childNode(0);
        assertNotNull(first);
    }

    @Test
    public void testChildNodesUnmodifiable() {
        List<Node> children = parent.childNodes();
        assertNotNull(children);
        try {
            children.clear();
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testChildNodesAsArray() {
        Element div = doc.selectFirst("div");
        Node[] nodes = div.childNodesAsArray();
        assertNotNull(nodes);
        assertTrue(nodes.length > 0);
    }

    @Test
    public void testParent() {
        assertEquals(parent, element.parent());
        assertNull(doc.parent());
    }

    @Test
    public void testOwnerDocument() {
        assertEquals(doc, element.ownerDocument());
        assertNotNull(doc.ownerDocument());
    }

    @Test
    public void testRemove() {
        assertNotNull(element.parent());
        element.remove();
        assertNull(element.parent());
        assertFalse(doc.body().children().contains(element));
    }

    @Test
    public void testBeforeWithNode() {
        Node newChild = new TextNode("New", "");
        element.before(newChild);
        Element parentDiv = doc.selectFirst("div");
        Node firstChild = parentDiv.childNode(0);
        assertEquals(newChild, firstChild);
        assertSame(newChild, firstChild);
    }

    @Test(expected = NullPointerException.class)
    public void testBeforeNullNode() {
        element.before((Node) null);
    }

    @Test
    public void testAfterWithNode() {
        Node newChild = new TextNode("After", "");
        element.after(newChild);
        Element parentDiv = doc.selectFirst("div");
        Node lastChild = parentDiv.childNode(parentDiv.childNodeSize() - 1);
        assertEquals(newChild, lastChild);
    }

    @Test(expected = NullPointerException.class)
    public void testAfterNullNode() {
        element.after((Node) null);
    }

    @Test
    public void testWrap() {
        Element p = doc.selectFirst("p");
        Node wrapped = p.wrap("<div class='wrap'></div>");
        assertNotNull(wrapped);
        assertFalse(wrapped instanceof Element);
    }

    @Test
    public void testWrapNullHtml() {
        try {
            element.wrap(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void testReplaceWith() {
        Node replacement = new TextNode("Replaced", "");
        element.replaceWith(replacement);
        Element parentDiv = parent;
        assertTrue(parentDiv.childNodes().contains(replacement));
        assertFalse(parentDiv.childNodes().contains(element));
        assertNull(element.parent());
    }

    @Test(expected = NullPointerException.class)
    public void testReplaceWithNull() {
        element.replaceWith(null);
    }

    @Test(expected = NullPointerException.class)
    public void testReplaceWithParentlessNode() {
        Node orphan = new TextNode("Orphan", "");
        orphan.replaceWith(new TextNode("New", ""));
    }

    @Test
    public void testSiblingIndex() {
        Document doc = Jsoup.parse("<div><span>0</span><span>1</span><span>2</span></div>");
        Element div = doc.selectFirst("div");
        Element second = doc.select("span").get(1);
        
        assertEquals(1, second.siblingIndex());
        
        second.setSiblingIndex(0);
        assertEquals(0, second.siblingIndex());
        
        // after move
        Element first = doc.select("span").get(2);
        first.setSiblingIndex(1);
        assertEquals(0, second.siblingIndex());
        assertEquals(1, first.siblingIndex());
    }

    @Test
    public void testSiblingNodes() {
        Document doc = Jsoup.parse("<div><span>0</span><span>1</span></div>");
        Element div = doc.selectFirst("div");
        Element span0 = div.childNode(0);
        List<Node> siblings = span0.siblingNodes();
        assertEquals(2, siblings.size());
        assertEquals("1", siblings.get(1).nodeName());
    }

    @Test
    public void testNextPreviousSibling() {
        Document doc = Jsoup.parse("<div><span>A</span><strong>B</strong><em>C</em></div>");
        Element strong = doc.selectFirst("strong");
        
        Node next = strong.nextSibling();
        assertNotNull(next);
        assertEquals("em", next.nodeName());
        
        Node prev = strong.previousSibling();
        assertNotNull(prev);
        assertEquals("span", prev.nodeName());
    }

    @Test
    public void testNextSiblingNoParent() {
        Element orphan = new Element("orphan");
        assertNull(orphan.nextSibling());
        assertNull(orphan.previousSibling());
    }

    @Test
    public void testClone() {
        Node cloned = element.clone();
        assertNotNull(cloned);
        assertNotSame(element, cloned);
        assertEquals(element.toString(), cloned.toString());
        assertNotSame(element.parent(), cloned.parent());
        assertEquals(element.attr("id"), cloned.attr("id"));
    }

    @Test
    public void testStringRepresentation() {
        assertNotNull(element.toString());
        assertEquals(element.outerHtml(), element.toString());
    }

    @Test
    public void testEquals() {
        Node first = new Element("a");
        Node second = new Element("b");
        Node same = first;
        
        assertTrue(first.equals(first));
        assertEquals(first, same);
        assertFalse(first.equals(second));
        assertFalse(first.equals(null));
        assertFalse(first.equals("text"));
        
        first.setBaseUri("http://example.com");
        second.setBaseUri("http://example.com");
        assertFalse(first.equals(second));
    }

    @Test
    public void testHashCodeConsistency() {
        Element node1 = new Element("div");
        node1.attr("data", "1");
        Element node2 = new Element("div");
        node2.attr("data", "1");
        
        assertEquals(node1.hashCode(), node1.hashCode());
        assertEquals(node1.hashCode(), node2.hashCode());
        
        node2.attr("data", "different");
        assertNotEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testGetDeepChild() throws Exception {
        // This tests private method indirectly
        Element div = doc.selectFirst("div");
        Node innermost = getDeepChildViaReflection(div);
        assertNotNull(innermost);
    }

    private Node getDeepChildViaReflection(Node node) throws Exception {
        java.lang.reflect.Method method = Node.class.getDeclaredMethod("getDeepChild", Element.class);
        method.setAccessible(true);
        return (Node) method.invoke(node, (Element) node);
    }

    @Test
    public void testSetParentNode() throws Exception {
        Element parent1 = new Element("parent1");
        Element parent2 = new Element("parent2");
        Element child = new Element("child");
        
        invokeSetParentNode(child, parent1);
        assertSame(parent1, child.parent());
        
        invokeSetParentNode(child, parent2);
        assertSame(parent2, child.parent());
    }

    private void invokeSetParentNode(Node child, Node parent) throws Exception {
        java.lang.reflect.Method method = Node.class.getDeclaredMethod("setParentNode", Node.class);
        method.setAccessible(true);
        method.invoke(child, parent);
    }
}