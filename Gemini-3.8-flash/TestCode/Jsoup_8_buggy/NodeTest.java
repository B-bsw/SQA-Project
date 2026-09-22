package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NodeTest {

    private static class ConcreteNode extends Node {
        private String name;

        public ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "node";
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
            this.name = "node";
        }

        public ConcreteNode(String baseUri, String name) {
            super(baseUri);
            this.name = name;
        }

        public ConcreteNode() {
            super();
            this.name = "node";
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

    @Test
    public void constructor_givenValidUriAndAttributes_shouldInitializeProperly() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        Node node = new ConcreteNode("http://example.com/path/", attrs);

        Assert.assertEquals("http://example.com/path/", node.baseUri());
        Assert.assertEquals("val", node.attr("key"));
        Assert.assertTrue(node.childNodes().isEmpty());
        Assert.assertNull(node.parent());
        Assert.assertEquals(0, node.siblingIndex().intValue());
    }

    @Test
    public void constructor_givenBaseUriWithWhitespace_shouldTrimUri() {
        Node node = new ConcreteNode("   http://example.com/trimmed/   ");
        Assert.assertEquals("http://example.com/trimmed/", node.baseUri());
        Assert.assertNotNull(node.attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAttributes_shouldThrowException() {
        new ConcreteNode("http://example.com", null);
    }

    @Test
    public void defaultConstructor_shouldCreateUninitializedInstance() {
        Node node = new ConcreteNode();
        Assert.assertNull(node.baseUri());
        Assert.assertNull(node.attributes());
        Assert.assertNotNull(node.childNodes());
        Assert.assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void nodeName_givenConcreteImplementation_shouldReturnCorrectName() {
        Node node = new ConcreteNode("http://example.com", "customName");
        Assert.assertEquals("customName", node.nodeName());
    }

    @Test
    public void attr_givenExistingAttributeKey_shouldReturnValue() {
        Node node = new ConcreteNode("http://example.com");
        node.attr("id", "header");

        Assert.assertEquals("header", node.attr("id"));
        Assert.assertTrue(node.hasAttr("id"));
    }

    @Test
    public void attr_givenNonExistentKey_shouldReturnEmptyString() {
        Node node = new ConcreteNode("http://example.com");
        Assert.assertEquals("", node.attr("nonExistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void attr_givenAbsPrefixAndRelativeUrl_shouldReturnAbsoluteUrl() {
        Node node = new ConcreteNode("http://example.com/sub/");
        node.attr("href", "page.html");

        Assert.assertEquals("http://example.com/sub/page.html", node.attr("abs:href"));
        Assert.assertEquals("http://example.com/sub/page.html", node.attr("ABS:href"));
    }

    @Test
    public void attr_givenAbsPrefixAndNonExistentAttribute_shouldReturnEmptyString() {
        Node node = new ConcreteNode("http://example.com/sub/");
        Assert.assertEquals("", node.attr("abs:nonExistent"));
    }

    @Test
    public void attr_setter_shouldReturnNodeForChaining() {
        Node node = new ConcreteNode("http://example.com");
        Node returned = node.attr("title", "hello");
        Assert.assertSame(node, returned);
        Assert.assertEquals("hello", node.attr("title"));
    }

    @Test
    public void hasAttr_givenExistingAndNonExistingKey_shouldReturnAccurately() {
        Node node = new ConcreteNode("http://example.com");
        node.attr("class", "main");

        Assert.assertTrue(node.hasAttr("class"));
        Assert.assertFalse(node.hasAttr("style"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_givenNullKey_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com");
        node.hasAttr(null);
    }

    @Test
    public void removeAttr_givenExistingKey_shouldRemoveAndReturnThis() {
        Node node = new ConcreteNode("http://example.com");
        node.attr("target", "_blank");

        Node returned = node.removeAttr("target");
        Assert.assertSame(node, returned);
        Assert.assertFalse(node.hasAttr("target"));
        Assert.assertEquals("", node.attr("target"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAttr_givenNullKey_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void setBaseUri_givenValidUri_shouldUpdateBaseUri() {
        Node node = new ConcreteNode("http://example.com");
        node.setBaseUri("http://example.org/new");
        Assert.assertEquals("http://example.org/new", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setBaseUri_givenNullUri_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com");
        node.setBaseUri(null);
    }

    @Test
    public void absUrl_givenAttributeMissing_shouldReturnEmptyString() {
        Node node = new ConcreteNode("http://example.com/");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenEmptyKey_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com/");
        node.absUrl("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenNullKey_shouldThrowException() {
        Node node = new ConcreteNode("http://example.com/");
        node.absUrl(null);
    }

    @Test
    public void absUrl_givenValidRelativeUrl_shouldResolveProperly() {
        Node node = new ConcreteNode("http://example.com/base/index.html");
        node.attr("href", "test.html");
        Assert.assertEquals("http://example.com/base/test.html", node.absUrl("href"));
    }

    @Test
    public void absUrl_givenAlreadyAbsoluteAttributeUrl_shouldReturnDirectUrl() {
        Node node = new ConcreteNode("http://example.com/base/");
        node.attr("href", "https://other.com/path");
        Assert.assertEquals("https://other.com/path", node.absUrl("href"));
    }

    @Test
    public void absUrl_givenInvalidBaseUriButAbsoluteRelUrl_shouldReturnRelUrl() {
        Node node = new ConcreteNode("not_a_valid_url");
        node.attr("href", "http://example.com/valid");
        Assert.assertEquals("http://example.com/valid", node.absUrl("href"));
    }

    @Test
    public void absUrl_givenInvalidBaseUriAndRelativeRelUrl_shouldReturnEmptyString() {
        Node node = new ConcreteNode("not_a_valid_url");
        node.attr("href", "relative.html");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test
    public void absUrl_givenMalformedRelativeUrl_shouldReturnEmptyString() {
        Node node = new ConcreteNode("http://example.com/");
        node.attr("href", "http://");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test
    public void childNode_givenValidIndex_shouldReturnCorrectChild() {
        Node parent = new ConcreteNode("http://example.com");
        Node child1 = new ConcreteNode("http://example.com", "child1");
        Node child2 = new ConcreteNode("http://example.com", "child2");
        parent.addChildren(child1, child2);

        Assert.assertSame(child1, parent.childNode(0));
        Assert.assertSame(child2, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void childNode_givenOutOfBoundsIndex_shouldThrowException() {
        Node parent = new ConcreteNode("http://example.com");
        parent.childNode(0);
    }

    @Test
    public void childNodes_shouldReturnUnmodifiableList() {
        Node parent = new ConcreteNode("http://example.com");
        Node child = new ConcreteNode("http://example.com");
        parent.addChildren(child);

        List<Node> list = parent.childNodes();
        Assert.assertEquals(1, list.size());
        Assert.assertSame(child, list.get(0));

        try {
            list.add(new ConcreteNode("http://example.com"));
            Assert.fail("childNodes() list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void childNodesAsArray_givenChildren_shouldReturnArrayCopy() {
        Node parent = new ConcreteNode("http://example.com");
        Node child1 = new ConcreteNode("http://example.com");
        Node child2 = new ConcreteNode("http://example.com");
        parent.addChildren(child1, child2);

        Node[] array = parent.childNodesAsArray();
        Assert.assertEquals(2, array.length);
        Assert.assertSame(child1, array[0]);
        Assert.assertSame(child2, array[1]);
    }

    @Test
    public void parent_givenChild_shouldReturnParentNode() {
        Node parent = new ConcreteNode("http://example.com");
        Node child = new ConcreteNode("http://example.com");
        Assert.assertNull(child.parent());

        parent.addChildren(child);
        Assert.assertSame(parent, child.parent());
    }

    @Test
    public void ownerDocument_givenDocumentHierarchy_shouldReturnOwnerOrNull() {
        Document doc = new Document("http://example.com/");
        Node parent = new ConcreteNode("http://example.com/");
        Node child = new ConcreteNode("http://example.com/");

        Assert.assertSame(doc, doc.ownerDocument());
        Assert.assertNull(parent.ownerDocument());

        doc.addChildren(parent);
        parent.addChildren(child);

        Assert.assertSame(doc, parent.ownerDocument());
        Assert.assertSame(doc, child.ownerDocument());
    }

    @Test
    public void remove_givenParentedNode_shouldRemoveFromParentAndResetState() {
        Node parent = new ConcreteNode("http://example.com");
        Node child1 = new ConcreteNode("http://example.com", "c1");
        Node child2 = new ConcreteNode("http://example.com", "c2");
        parent.addChildren(child1, child2);

        child1.remove();

        Assert.assertNull(child1.parent());
        Assert.assertEquals(1, parent.childNodes().size());
        Assert.assertSame(child2, parent.childNode(0));
        Assert.assertEquals(0, child2.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenOrphanNode_shouldThrowException() {
        Node orphan = new ConcreteNode("http://example.com");
        orphan.remove();
    }

    @Test
    public void replaceWith_givenValidReplacement_shouldSwapNodesCorrectly() {
        Node parent = new ConcreteNode("http://example.com");
        Node child1 = new ConcreteNode("http://example.com", "c1");
        Node child2 = new ConcreteNode("http://example.com", "c2");
        Node replacement = new ConcreteNode("http://example.com", "replacement");

        parent.addChildren(child1, child2);
        child1.replaceWith(replacement);

        Assert.assertNull(child1.parent());
        Assert.assertSame(parent, replacement.parent());
        Assert.assertEquals(0, replacement.siblingIndex().intValue());
        Assert.assertSame(replacement, parent.childNode(0));
        Assert.assertSame(child2, parent.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenNullReplacement_shouldThrowException() {
        Node parent = new ConcreteNode("http://example.com");
        Node child = new ConcreteNode("http://example.com");
        parent.addChildren(child);
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenOrphanTarget_shouldThrowException() {
        Node child = new ConcreteNode("http://example.com");
        Node replacement = new ConcreteNode("http://example.com");
        child.replaceWith(replacement);
    }

    @Test
    public void replaceChild_givenTargetWithAnotherParent_shouldReparentReplacement() {
        Node parent1 = new ConcreteNode("http://example.com");
        Node parent2 = new ConcreteNode("http://example.com");
        Node out = new ConcreteNode("http://example.com", "out");
        Node in = new ConcreteNode("http://example.com", "in");

        parent1.addChildren(out);
        parent2.addChildren(in);

        parent1.replaceChild(out, in);

        Assert.assertSame(parent1, in.parent());
        Assert.assertEquals(0, in.siblingIndex().intValue());
        Assert.assertTrue(parent2.childNodes().isEmpty());
        Assert.assertNull(out.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_givenOutChildNotBelongingToParent_shouldThrowException() {
        Node parent = new ConcreteNode("http://example.com");
        Node alien = new ConcreteNode("http://example.com");
        Node in = new ConcreteNode("http://example.com");
        parent.replaceChild(alien, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeChild_givenOutChildNotBelongingToParent_shouldThrowException() {
        Node parent = new ConcreteNode("http://example.com");
        Node alien = new ConcreteNode("http://example.com");
        parent.removeChild(alien);
    }

    @Test
    public void setParentNode_givenAlreadyHasParent_shouldReparentFromOldParent() {
        Node oldParent = new ConcreteNode("http://example.com");
        Node newParent = new ConcreteNode("http://example.com");
        Node child = new ConcreteNode("http://example.com");

        oldParent.addChildren(child);
        Assert.assertEquals(1, oldParent.childNodes().size());

        child.setParentNode(newParent);
        Assert.assertTrue(oldParent.childNodes().isEmpty());
        Assert.assertSame(newParent, child.parent());
    }

    @Test
    public void addChildren_givenMultipleChildren_shouldReparentAndSetIndexes() {
        Node parent = new ConcreteNode("http://example.com");
        Node c1 = new ConcreteNode("http://example.com", "c1");
        Node c2 = new ConcreteNode("http://example.com", "c2");

        parent.addChildren(c1, c2);

        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(c1, parent.childNode(0));
        Assert.assertSame(c2, parent.childNode(1));
        Assert.assertEquals(0, c1.siblingIndex().intValue());
        Assert.assertEquals(1, c2.siblingIndex().intValue());
    }

    @Test
    public void addChildrenAtIndex_givenIndex_shouldInsertAndReindexRemaining() {
        Node parent = new ConcreteNode("http://example.com");
        Node c1 = new ConcreteNode("http://example.com", "c1");
        Node c3 = new ConcreteNode("http://example.com", "c3");
        parent.addChildren(c1, c3);

        Node c2 = new ConcreteNode("http://example.com", "c2");
        parent.addChildren(1, c2);

        Assert.assertEquals(3, parent.childNodes().size());
        Assert.assertSame(c1, parent.childNode(0));
        Assert.assertSame(c2, parent.childNode(1));
        Assert.assertSame(c3, parent.childNode(2));
        Assert.assertEquals(0, c1.siblingIndex().intValue());
        Assert.assertEquals(1, c2.siblingIndex().intValue());
        Assert.assertEquals(2, c3.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addChildrenAtIndex_givenNullInArray_shouldThrowException() {
        Node parent = new ConcreteNode("http://example.com");
        parent.addChildren(0, (Node[]) null);
    }

    @Test
    public void siblingNodes_shouldReturnAllChildrenOfParent() {
        Node parent = new ConcreteNode("http://example.com");
        Node c1 = new ConcreteNode("http://example.com", "c1");
        Node c2 = new ConcreteNode("http://example.com", "c2");
        parent.addChildren(c1, c2);

        List<Node> siblings = c1.siblingNodes();
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(c1, siblings.get(0));
        Assert.assertSame(c2, siblings.get(1));
    }

    @Test
    public void nextSibling_givenFirstAndLastSibling_shouldReturnNextOrNull() {
        Node parent = new ConcreteNode("http://example.com");
        Node c1 = new ConcreteNode("http://example.com", "c1");
        Node c2 = new ConcreteNode("http://example.com", "c2");
        parent.addChildren(c1, c2);

        Assert.assertSame(c2, c1.nextSibling());
        Assert.assertNull(c2.nextSibling());

        Node orphan = new ConcreteNode("http://example.com");
        Assert.assertNull(orphan.nextSibling());
    }

    @Test
    public void previousSibling_givenFirstAndSecondSibling_shouldReturnPreviousOrNull() {
        Node parent = new ConcreteNode("http://example.com");
        Node c1 = new ConcreteNode("http://example.com", "c1");
        Node c2 = new ConcreteNode("http://example.com", "c2");
        parent.addChildren(c1, c2);

        Assert.assertNull(c1.previousSibling());
        Assert.assertSame(c1, c2.previousSibling());
    }

    @Test
    public void setSiblingIndex_shouldUpdateIndex() {
        Node node = new ConcreteNode("http://example.com");
        node.setSiblingIndex(5);
        Assert.assertEquals(5, node.siblingIndex().intValue());
    }

    @Test
    public void outerHtml_givenNodeInDocument_shouldFormatCorrectly() {
        Document doc = new Document("http://example.com/");
        Node child = new ConcreteNode("http://example.com/", "testNode");
        doc.addChildren(child);

        String html = child.outerHtml();
        Assert.assertEquals("<testNode></testNode>", html);
        Assert.assertEquals("<testNode></testNode>", child.toString());
    }

    @Test
    public void outerHtml_givenTextNode_shouldSkipTail() {
        Document doc = new Document("http://example.com/");
        TextNode textNode = new TextNode("sample text", "http://example.com/");
        doc.addChildren(textNode);

        String html = textNode.outerHtml();
        Assert.assertEquals("sample text", html);
    }

    @Test
    public void indent_shouldAppendNewlineAndIndentation() {
        Node node = new ConcreteNode("http://example.com");
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(4);

        StringBuilder sb = new StringBuilder();
        node.indent(sb, 2, doc.outputSettings());

        Assert.assertEquals("\n        ", sb.toString());
    }

    @Test
    public void equals_shouldMatchOnlySameInstance() {
        Node node1 = new ConcreteNode("http://example.com");
        Node node2 = new ConcreteNode("http://example.com");

        Assert.assertTrue(node1.equals(node1));
        Assert.assertFalse(node1.equals(node2));
        Assert.assertFalse(node1.equals(null));
        Assert.assertFalse(node1.equals("some string"));
    }

    @Test
    public void hashCode_shouldAccountForParentAndAttributes() {
        Node parent = new ConcreteNode("http://example.com");
        Node child = new ConcreteNode("http://example.com");
        parent.addChildren(child);

        int hashWithParent = child.hashCode();

        Node orphan = new ConcreteNode("http://example.com");
        int hashOrphan = orphan.hashCode();

        Assert.assertTrue(hashWithParent != 0);
        Assert.assertTrue(hashOrphan != 0);

        Node defaultNode = new ConcreteNode();
        Assert.assertEquals(0, defaultNode.hashCode());
    }
}