package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;

public class NodeTest {

    private static class TestNode extends Node {
        private String name;

        public TestNode() {
            super();
            this.name = "test";
        }

        public TestNode(String baseUri) {
            super(baseUri);
            this.name = "test";
        }

        public TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "test";
        }

        public TestNode(String baseUri, Attributes attributes, String name) {
            super(baseUri, attributes);
            this.name = name;
        }

        public String nodeName() {
            return name;
        }

        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(name).append(">");
        }

        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(name).append(">");
        }
    }

    // ==========================================
    // Constructor & Base URI Tests
    // ==========================================

    @Test
    public void constructor_givenValidUriAndAttributes_shouldInitializeProperly() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        TestNode node = new TestNode("  http://example.com/test  ", attrs);

        Assert.assertEquals("http://example.com/test", node.baseUri());
        Assert.assertEquals("val", node.attr("key"));
        Assert.assertEquals(0, node.childNodes().size());
        Assert.assertNull(node.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        new TestNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAttributes_shouldThrowException() {
        new TestNode("http://example.com", null);
    }

    @Test
    public void defaultConstructor_shouldCreateEmptyNode() {
        TestNode node = new TestNode();
        Assert.assertNull(node.baseUri());
        Assert.assertNull(node.attributes());
        Assert.assertEquals(0, node.childNodes().size());
        Assert.assertNull(node.parent());
    }

    @Test
    public void setBaseUri_givenValidUri_shouldUpdateNodeAndDescendants() {
        TestNode parent = new TestNode("http://old.com");
        TestNode child = new TestNode("http://old.com");
        TestNode grandchild = new TestNode("http://old.com");

        parent.addChildren(child);
        child.addChildren(grandchild);

        parent.setBaseUri("http://new.com");

        Assert.assertEquals("http://new.com", parent.baseUri());
        Assert.assertEquals("http://new.com", child.baseUri());
        Assert.assertEquals("http://new.com", grandchild.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setBaseUri_givenNullUri_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.setBaseUri(null);
    }

    // ==========================================
    // Attributes & URL Resolution Tests
    // ==========================================

    @Test
    public void attr_givenExistingKey_shouldReturnValue() {
        TestNode node = new TestNode("http://example.com");
        node.attr("href", "index.html");

        Assert.assertEquals("index.html", node.attr("href"));
    }

    @Test
    public void attr_givenNonExistingKey_shouldReturnEmptyString() {
        TestNode node = new TestNode("http://example.com");

        Assert.assertEquals("", node.attr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void attr_givenAbsPrefixAndRelativeUrl_shouldReturnAbsoluteUrl() {
        TestNode node = new TestNode("http://example.com/dir/");
        node.attr("href", "page.html");

        Assert.assertEquals("http://example.com/dir/page.html", node.attr("abs:href"));
        Assert.assertEquals("http://example.com/dir/page.html", node.attr("ABS:HREF"));
    }

    @Test
    public void hasAttr_givenValidKey_shouldReturnExpectedBoolean() {
        TestNode node = new TestNode("http://example.com/dir/");
        node.attr("href", "page.html");

        Assert.assertTrue(node.hasAttr("href"));
        Assert.assertFalse(node.hasAttr("src"));
        Assert.assertTrue(node.hasAttr("abs:href"));
        Assert.assertFalse(node.hasAttr("abs:src"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_givenNullKey_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.hasAttr(null);
    }

    @Test
    public void removeAttr_givenKey_shouldRemoveAttribute() {
        TestNode node = new TestNode("http://example.com");
        node.attr("key1", "val1");
        node.attr("key2", "val2");

        Node returned = node.removeAttr("key1");

        Assert.assertSame(node, returned);
        Assert.assertFalse(node.hasAttr("key1"));
        Assert.assertTrue(node.hasAttr("key2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAttr_givenNullKey_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void absUrl_givenVariousScenarios_shouldResolveProperly() {
        TestNode node = new TestNode("http://example.com/path/file.html");

        // Missing attribute
        Assert.assertEquals("", node.absUrl("href"));

        // Relative path
        node.attr("href", "other.html");
        Assert.assertEquals("http://example.com/path/other.html", node.absUrl("href"));

        // Query string relative workaround check
        node.attr("query", "?test=1");
        Assert.assertEquals("http://example.com/path/file.html?test=1", node.absUrl("query"));

        // Absolute protocol URL already
        node.attr("external", "https://otherhost.org/index.php");
        Assert.assertEquals("https://otherhost.org/index.php", node.absUrl("external"));

        // Invalid base URI but absolute relUrl
        TestNode invalidBaseNode = new TestNode("invalid-uri");
        invalidBaseNode.attr("href", "http://valid.com/page");
        Assert.assertEquals("http://valid.com/page", invalidBaseNode.absUrl("href"));

        // Invalid base URI and relative URL
        invalidBaseNode.attr("href", "relative.html");
        Assert.assertEquals("", invalidBaseNode.absUrl("href"));

        // Valid base URI but malformed URL relative
        TestNode validBase = new TestNode("http://example.com");
        validBase.attr("href", "foo:bar:baz");
        Assert.assertEquals("", validBase.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenEmptyKey_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.absUrl("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenNullKey_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.absUrl(null);
    }

    // ==========================================
    // Hierarchy & Child Node Tests
    // ==========================================

    @Test
    public void childNode_givenValidIndex_shouldReturnCorrectChild() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        parent.addChildren(child1, child2);

        Assert.assertSame(child1, parent.childNode(0));
        Assert.assertSame(child2, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void childNode_givenOutOfBoundsIndex_shouldThrowException() {
        TestNode parent = new TestNode("http://example.com");
        parent.childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void childNodes_shouldReturnUnmodifiableList() {
        TestNode parent = new TestNode("http://example.com");
        parent.childNodes().add(new TestNode("http://example.com"));
    }

    @Test
    public void childNodesAsArray_shouldReturnMatchingArray() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        parent.addChildren(child1, child2);

        Node[] array = parent.childNodesAsArray();
        Assert.assertEquals(2, array.length);
        Assert.assertSame(child1, array[0]);
        Assert.assertSame(child2, array[1]);
    }

    @Test
    public void setParentNode_givenPriorParent_shouldReassignProperly() {
        TestNode parent1 = new TestNode("http://example.com");
        TestNode parent2 = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");

        parent1.addChildren(child);
        Assert.assertSame(parent1, child.parent());
        Assert.assertEquals(1, parent1.childNodes().size());

        child.setParentNode(parent2);
        Assert.assertSame(parent2, child.parent());
        Assert.assertEquals(0, parent1.childNodes().size());
    }

    @Test
    public void replaceChild_givenValidNodes_shouldReplaceAndReindex() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        TestNode replacement = new TestNode("http://example.com");

        parent.addChildren(child1, child2);
        parent.replaceChild(child1, replacement);

        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(replacement, parent.childNode(0));
        Assert.assertNull(child1.parent());
        Assert.assertSame(parent, replacement.parent());
        Assert.assertEquals(0, replacement.siblingIndex());
        Assert.assertEquals(1, child2.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_givenInvalidOutNode_shouldThrowException() {
        TestNode parent = new TestNode("http://example.com");
        TestNode foreigner = new TestNode("http://example.com");
        TestNode replacement = new TestNode("http://example.com");

        parent.replaceChild(foreigner, replacement);
    }

    @Test
    public void replaceChild_givenReplacementWithPreviousParent_shouldDetachFromPreviousParent() {
        TestNode oldParent = new TestNode("http://example.com");
        TestNode newParent = new TestNode("http://example.com");
        TestNode target = new TestNode("http://example.com");
        TestNode replacement = new TestNode("http://example.com");

        oldParent.addChildren(replacement);
        newParent.addChildren(target);

        newParent.replaceChild(target, replacement);

        Assert.assertEquals(0, oldParent.childNodes().size());
        Assert.assertSame(newParent, replacement.parent());
        Assert.assertSame(replacement, newParent.childNode(0));
    }

    @Test
    public void removeChild_givenValidChild_shouldRemoveAndReindex() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child0 = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        parent.addChildren(child0, child1, child2);

        parent.removeChild(child1);

        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(child0, parent.childNode(0));
        Assert.assertSame(child2, parent.childNode(1));
        Assert.assertEquals(0, child0.siblingIndex());
        Assert.assertEquals(1, child2.siblingIndex());
        Assert.assertNull(child1.parent());
    }

    @Test
    public void remove_givenNodeWithParent_shouldRemoveFromParent() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");
        parent.addChildren(child);

        child.remove();

        Assert.assertEquals(0, parent.childNodes().size());
        Assert.assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenOrphanNode_shouldThrowException() {
        TestNode orphan = new TestNode("http://example.com");
        orphan.remove();
    }

    @Test
    public void addChildren_withIndex_shouldInsertAtSpecifiedPosition() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child0 = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        parent.addChildren(child0, child1);

        TestNode insertA = new TestNode("http://example.com");
        TestNode insertB = new TestNode("http://example.com");

        parent.addChildren(1, insertA, insertB);

        Assert.assertEquals(4, parent.childNodes().size());
        Assert.assertSame(child0, parent.childNode(0));
        Assert.assertSame(insertA, parent.childNode(1));
        Assert.assertSame(insertB, parent.childNode(2));
        Assert.assertSame(child1, parent.childNode(3));

        Assert.assertEquals(0, child0.siblingIndex());
        Assert.assertEquals(1, insertA.siblingIndex());
        Assert.assertEquals(2, insertB.siblingIndex());
        Assert.assertEquals(3, child1.siblingIndex());
    }

    // ==========================================
    // Sibling Traversal Tests
    // ==========================================

    @Test
    public void siblingNodes_shouldReturnParentChildNodes() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        parent.addChildren(child1, child2);

        List<Node> siblings = child1.siblingNodes();
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(child1, siblings.get(0));
        Assert.assertSame(child2, siblings.get(1));
    }

    @Test
    public void nextSibling_shouldReturnSubsequentSiblingOrNull() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child0 = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        parent.addChildren(child0, child1);

        Assert.assertSame(child1, child0.nextSibling());
        Assert.assertNull(child1.nextSibling());

        TestNode orphan = new TestNode("http://example.com");
        Assert.assertNull(orphan.nextSibling());
    }

    @Test
    public void previousSibling_shouldReturnPrecedingSiblingOrNull() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child0 = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        parent.addChildren(child0, child1);

        Assert.assertNull(child0.previousSibling());
        Assert.assertSame(child0, child1.previousSibling());
    }

    // ==========================================
    // DOM Mutation Methods (before, after, wrap, unwrap, replaceWith)
    // ==========================================

    @Test
    public void before_givenNode_shouldInsertBefore() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        Element newSibling = new Element(Tag.valueOf("p"), "http://example.com");
        child.before(newSibling);

        Assert.assertEquals(2, root.childNodes().size());
        Assert.assertSame(newSibling, root.childNode(0));
        Assert.assertSame(child, root.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void before_givenNullNode_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        child.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void before_givenOrphanTarget_shouldThrowException() {
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        Element newSibling = new Element(Tag.valueOf("p"), "http://example.com");
        child.before(newSibling);
    }

    @Test
    public void before_givenHtml_shouldInsertParsedNodes() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        child.before("<p>One</p><p>Two</p>");

        Assert.assertEquals(3, root.childNodes().size());
        Assert.assertEquals("p", root.childNode(0).nodeName());
        Assert.assertEquals("p", root.childNode(1).nodeName());
        Assert.assertSame(child, root.childNode(2));
    }

    @Test
    public void after_givenNode_shouldInsertAfter() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        Element newSibling = new Element(Tag.valueOf("p"), "http://example.com");
        child.after(newSibling);

        Assert.assertEquals(2, root.childNodes().size());
        Assert.assertSame(child, root.childNode(0));
        Assert.assertSame(newSibling, root.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void after_givenNullNode_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        child.after((Node) null);
    }

    @Test
    public void after_givenHtml_shouldInsertParsedNodes() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        child.after("<p>One</p><p>Two</p>");

        Assert.assertEquals(3, root.childNodes().size());
        Assert.assertSame(child, root.childNode(0));
        Assert.assertEquals("p", root.childNode(1).nodeName());
        Assert.assertEquals("p", root.childNode(2).nodeName());
    }

    @Test
    public void replaceWith_givenValidNode_shouldReplaceProperly() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        Element replacement = new Element(Tag.valueOf("b"), "http://example.com");
        child.replaceWith(replacement);

        Assert.assertEquals(1, root.childNodes().size());
        Assert.assertSame(replacement, root.childNode(0));
        Assert.assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenNullNode_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);

        child.replaceWith(null);
    }

    @Test
    public void wrap_givenSingleElementHtml_shouldWrapNodeCorrectly() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(span);

        Node wrapped = span.wrap("<div class=\"wrapper\"><div class=\"inner\"></div></div>");

        Assert.assertSame(span, wrapped);
        Assert.assertEquals(1, root.childNodes().size());
        Element wrapper = (Element) root.childNode(0);
        Assert.assertEquals("div", wrapper.nodeName());
        Assert.assertEquals("wrapper", wrapper.attr("class"));
        Element inner = (Element) wrapper.childNode(0);
        Assert.assertEquals("inner", inner.attr("class"));
        Assert.assertSame(span, inner.childNode(0));
        Assert.assertSame(inner, span.parent());
    }

    @Test
    public void wrap_givenMultipleElementsHtml_shouldIncludeRemainder() {
        Element root = new Element(Tag.valueOf("body"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(span);

        span.wrap("<div class=\"first\"></div><div class=\"remainder\"></div>");

        Assert.assertEquals(1, root.childNodes().size());
        Element first = (Element) root.childNode(0);
        Assert.assertEquals("first", first.attr("class"));
        Assert.assertSame(span, first.childNode(0));
        Assert.assertEquals(2, first.childNodes().size());
        Assert.assertEquals("remainder", first.childNode(1).attr("class"));
    }

    @Test
    public void wrap_givenNonElementHtml_shouldReturnNull() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(span);

        Node result = span.wrap("Just text");
        Assert.assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrap_givenEmptyHtml_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(span);

        span.wrap("");
    }

    @Test
    public void unwrap_givenNodeWithChildren_shouldPromoteChildrenAndReturnFirstChild() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("b"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("i"), "http://example.com");

        root.appendChild(span);
        span.appendChild(child1);
        span.appendChild(child2);

        Node firstChild = span.unwrap();

        Assert.assertSame(child1, firstChild);
        Assert.assertEquals(2, root.childNodes().size());
        Assert.assertSame(child1, root.childNode(0));
        Assert.assertSame(child2, root.childNode(1));
        Assert.assertNull(span.parent());
    }

    @Test
    public void unwrap_givenNodeWithoutChildren_shouldReturnNull() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(span);

        Node firstChild = span.unwrap();

        Assert.assertNull(firstChild);
        Assert.assertEquals(0, root.childNodes().size());
        Assert.assertNull(span.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void unwrap_givenOrphanNode_shouldThrowException() {
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        span.unwrap();
    }

    // ==========================================
    // Owner Document & Document Traversal Tests
    // ==========================================

    @Test
    public void ownerDocument_shouldLocateRootDocumentOrNull() {
        Document doc = new Document("http://example.com");
        Element child = new Element(Tag.valueOf("div"), "http://example.com");
        Element grandchild = new Element(Tag.valueOf("p"), "http://example.com");

        doc.appendChild(child);
        child.appendChild(grandchild);

        Assert.assertSame(doc, doc.ownerDocument());
        Assert.assertSame(doc, child.ownerDocument());
        Assert.assertSame(doc, grandchild.ownerDocument());

        Element orphan = new Element(Tag.valueOf("div"), "http://example.com");
        Assert.assertNull(orphan.ownerDocument());
    }

    // ==========================================
    // Traversal, Output & Serialization Tests
    // ==========================================

    @Test
    public void traverse_givenVisitor_shouldVisitHeadAndTail() {
        final TestNode parent = new TestNode("http://example.com", new Attributes(), "parent");
        final TestNode child = new TestNode("http://example.com", new Attributes(), "child");
        parent.addChildren(child);

        final StringBuilder headOrder = new StringBuilder();
        final StringBuilder tailOrder = new StringBuilder();

        parent.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                headOrder.append(node.nodeName()).append(":").append(depth).append(",");
            }

            public void tail(Node node, int depth) {
                tailOrder.append(node.nodeName()).append(":").append(depth).append(",");
            }
        });

        Assert.assertEquals("parent:0,child:1,", headOrder.toString());
        Assert.assertEquals("child:1,parent:0,", tailOrder.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void traverse_givenNullVisitor_shouldThrowException() {
        TestNode node = new TestNode("http://example.com");
        node.traverse(null);
    }

    @Test
    public void outerHtml_shouldRenderStructureCorrectly() {
        TestNode parent = new TestNode("http://example.com", new Attributes(), "parent");
        TestNode child = new TestNode("http://example.com", new Attributes(), "child");
        parent.addChildren(child);

        Assert.assertEquals("<parent><child></child></parent>", parent.outerHtml());
        Assert.assertEquals("<parent><child></child></parent>", parent.toString());
    }

    @Test
    public void outerHtml_withTextNode_shouldSkipTailCallInOuterHtmlVisitor() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode text = new TextNode("hello", "http://example.com");
        parent.appendChild(text);

        Assert.assertEquals("<div>\n hello\n</div>", parent.outerHtml());
    }

    @Test
    public void indent_shouldAppendNewlineAndSpaces() {
        TestNode node = new TestNode("http://example.com");
        Document doc = new Document("http://example.com");
        StringBuilder accum = new StringBuilder();

        node.indent(accum, 2, doc.outputSettings());

        Assert.assertEquals("\n    ", accum.toString());
    }

    // ==========================================
    // Equals, HashCode & Clone Tests
    // ==========================================

    @Test
    public void equals_shouldOnlyMatchSameInstance() {
        TestNode node1 = new TestNode("http://example.com");
        TestNode node2 = new TestNode("http://example.com");

        Assert.assertTrue(node1.equals(node1));
        Assert.assertFalse(node1.equals(node2));
        Assert.assertFalse(node1.equals(null));
        Assert.assertFalse(node1.equals("String Object"));
    }

    @Test
    public void hashCode_shouldAccountForParentAndAttributes() {
        TestNode node = new TestNode();
        int hash1 = node.hashCode();

        TestNode parent = new TestNode("http://example.com");
        parent.addChildren(node);
        int hash2 = node.hashCode();

        Assert.assertTrue(hash1 != hash2);
    }

    @Test
    public void clone_shouldProduceDeepIndependentCopy() {
        TestNode parent = new TestNode("http://example.com", new Attributes(), "parent");
        parent.attr("key", "parentVal");
        TestNode child = new TestNode("http://example.com", new Attributes(), "child");
        child.attr("subKey", "childVal");
        parent.addChildren(child);

        Node clone = parent.clone();

        Assert.assertNotSame(parent, clone);
        Assert.assertNull(clone.parent());
        Assert.assertEquals(0, clone.siblingIndex());
        Assert.assertEquals("parentVal", clone.attr("key"));
        Assert.assertEquals(1, clone.childNodes().size());

        Node clonedChild = clone.childNode(0);
        Assert.assertNotSame(child, clonedChild);
        Assert.assertSame(clone, clonedChild.parent());
        Assert.assertEquals("childVal", clonedChild.attr("subKey"));

        // Mutating clone must not affect original
        clone.attr("key", "modified");
        Assert.assertEquals("parentVal", parent.attr("key"));
    }
}