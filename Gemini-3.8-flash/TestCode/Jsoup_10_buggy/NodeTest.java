package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NodeTest {

    private static class ConcreteTestNode extends Node {
        private String name;
        private boolean tailCalled = false;

        public ConcreteTestNode() {
            super();
            this.name = "default";
        }

        public ConcreteTestNode(String baseUri) {
            super(baseUri);
            this.name = "testNode";
        }

        public ConcreteTestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "testNode";
        }

        public ConcreteTestNode(String name, String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = name;
        }

        public String nodeName() {
            return name;
        }

        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(nodeName()).append(">");
        }

        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            tailCalled = true;
            accum.append("</").append(nodeName()).append(">");
        }
    }

    // ==========================================
    // Constructor & Initialization Tests
    // ==========================================

    @Test
    public void constructor_givenValidBaseUriAndAttributes_shouldInitializeCorrectly() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("key", "val");

        // Act
        Node node = new ConcreteTestNode("  http://example.com/path  ", attrs);

        // Assert
        Assert.assertEquals("http://example.com/path", node.baseUri());
        Assert.assertSame(attrs, node.attributes());
        Assert.assertEquals(0, node.childNodes().size());
        Assert.assertNull(node.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        // Arrange & Act
        new ConcreteTestNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAttributes_shouldThrowException() {
        // Arrange & Act
        new ConcreteTestNode("http://example.com", null);
    }

    @Test
    public void constructor_givenBaseUriOnly_shouldInitializeWithEmptyAttributes() {
        // Act
        Node node = new ConcreteTestNode("http://example.com");

        // Assert
        Assert.assertEquals("http://example.com", node.baseUri());
        Assert.assertNotNull(node.attributes());
        Assert.assertEquals(0, node.attributes().asList().size());
    }

    @Test
    public void defaultConstructor_whenCalled_shouldHaveNullAttributesAndEmptyChildNodes() {
        // Act
        Node node = new ConcreteTestNode();

        // Assert
        Assert.assertNull(node.attributes());
        Assert.assertNull(node.baseUri());
        Assert.assertEquals(0, node.childNodes().size());
    }

    // ==========================================
    // Attribute Management Tests
    // ==========================================

    @Test
    public void attr_givenExistingAttribute_shouldReturnAttributeValue() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");
        node.attr("href", "/index.html");

        // Act
        String value = node.attr("href");

        // Assert
        Assert.assertEquals("/index.html", value);
    }

    @Test
    public void attr_givenMissingAttribute_shouldReturnEmptyString() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        String value = node.attr("missing");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.attr(null);
    }

    @Test
    public void attr_givenAbsPrefixAndExistingAttr_shouldResolveAbsoluteUrl() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com/sub/");
        node.attr("href", "page.html");

        // Act
        String url = node.attr("abs:href");

        // Assert
        Assert.assertEquals("http://example.com/sub/page.html", url);
    }

    @Test
    public void attr_givenAbsPrefixCaseInsensitiveAndMissingAttr_shouldReturnEmptyString() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com/");

        // Act
        String url = node.attr("ABS:href");

        // Assert
        Assert.assertEquals("", url);
    }

    @Test
    public void attr_givenKeyValue_shouldSetAttributeAndReturnNodeChaining() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        Node chained = node.attr("target", "_blank");

        // Assert
        Assert.assertSame(node, chained);
        Assert.assertEquals("_blank", node.attr("target"));
    }

    @Test
    public void hasAttr_givenExistingAndNonExistingKey_shouldReturnExpectedBoolean() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");
        node.attr("data-test", "true");

        // Act & Assert
        Assert.assertTrue(node.hasAttr("data-test"));
        Assert.assertFalse(node.hasAttr("non-existing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_givenNullKey_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.hasAttr(null);
    }

    @Test
    public void removeAttr_givenExistingKey_shouldRemoveAttributeAndReturnNodeChaining() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");
        node.attr("title", "Tooltop");

        // Act
        Node chained = node.removeAttr("title");

        // Assert
        Assert.assertSame(node, chained);
        Assert.assertFalse(node.hasAttr("title"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAttr_givenNullKey_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.removeAttr(null);
    }

    @Test
    public void setBaseUri_givenValidUri_shouldUpdateBaseUri() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.setBaseUri("http://example.org/new");

        // Assert
        Assert.assertEquals("http://example.org/new", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setBaseUri_givenNullUri_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.setBaseUri(null);
    }

    // ==========================================
    // Absolute URL Resolution Tests
    // ==========================================

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenEmptyAttributeKey_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.absUrl("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenNullAttributeKey_shouldThrowException() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        node.absUrl(null);
    }

    @Test
    public void absUrl_givenMissingAttribute_shouldReturnEmptyString() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void absUrl_givenValidBaseAndRelativeUrl_shouldResolveProperly() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com/dir/index.html");
        node.attr("href", "other.html");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("http://example.com/dir/other.html", result);
    }

    @Test
    public void absUrl_givenMalformedBaseUriAndAbsoluteAttrUrl_shouldReturnAttrUrl() {
        // Arrange
        Node node = new ConcreteTestNode("invalid-base-uri");
        node.attr("href", "http://jsoup.org/spec");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("http://jsoup.org/spec", result);
    }

    @Test
    public void absUrl_givenMalformedBaseUriAndRelativeAttrUrl_shouldReturnEmptyString() {
        // Arrange
        Node node = new ConcreteTestNode("invalid-base-uri");
        node.attr("href", "relative.html");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void absUrl_givenValidBaseUriAndUnparseableAttrUrl_shouldReturnEmptyString() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");
        node.attr("href", "http://::invalid::");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    // ==========================================
    // Hierarchy & Traversal Tests
    // ==========================================

    @Test
    public void childNode_givenValidIndex_shouldReturnCorrectChild() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act & Assert
        Assert.assertSame(child0, parent.childNode(0));
        Assert.assertSame(child1, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void childNode_givenOutOfBoundsIndex_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");

        // Act
        parent.childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void childNodes_whenAttemptingModification_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");

        // Act
        parent.childNodes().add(new ConcreteTestNode("http://example.com"));
    }

    @Test
    public void childNodesAsArray_whenCalled_shouldReturnAccurateArrayCopy() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act
        Node[] array = parent.childNodesAsArray();

        // Assert
        Assert.assertEquals(2, array.length);
        Assert.assertSame(child0, array[0]);
        Assert.assertSame(child1, array[1]);
    }

    @Test
    public void ownerDocument_whenNodeIsDocument_shouldReturnSelf() {
        // Arrange
        Document doc = new Document("http://example.com");

        // Act
        Document result = doc.ownerDocument();

        // Assert
        Assert.assertSame(doc, result);
    }

    @Test
    public void ownerDocument_whenNodeHasNoParent_shouldReturnNull() {
        // Arrange
        Node orphan = new ConcreteTestNode("http://example.com");

        // Act & Assert
        Assert.assertNull(orphan.ownerDocument());
    }

    @Test
    public void ownerDocument_whenDeeplyNestedInDocument_shouldReturnRootDocument() {
        // Arrange
        Document doc = new Document("http://example.com");
        Node parent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        doc.addChildren(parent);
        parent.addChildren(child);

        // Act & Assert
        Assert.assertSame(doc, child.ownerDocument());
        Assert.assertSame(doc, parent.ownerDocument());
    }

    // ==========================================
    // DOM Mutation Tests (Add, Remove, Replace)
    // ==========================================

    @Test
    public void remove_whenChildOfParent_shouldRemoveFromParentAndClearParentRef() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act
        child0.remove();

        // Assert
        Assert.assertNull(child0.parent());
        Assert.assertEquals(1, parent.childNodes().size());
        Assert.assertSame(child1, parent.childNode(0));
        Assert.assertEquals(0, child1.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_whenOrphan_shouldThrowException() {
        // Arrange
        Node orphan = new ConcreteTestNode("http://example.com");

        // Act
        orphan.remove();
    }

    @Test
    public void replaceWith_givenValidReplacement_shouldReplaceCorrectly() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        Node replacement = new ConcreteTestNode("http://example.com");
        parent.addChildren(child);

        // Act
        child.replaceWith(replacement);

        // Assert
        Assert.assertNull(child.parent());
        Assert.assertSame(parent, replacement.parent());
        Assert.assertSame(replacement, parent.childNode(0));
        Assert.assertEquals(0, replacement.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenNullReplacement_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        parent.addChildren(child);

        // Act
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_whenTargetHasNoParent_shouldThrowException() {
        // Arrange
        Node orphan = new ConcreteTestNode("http://example.com");
        Node replacement = new ConcreteTestNode("http://example.com");

        // Act
        orphan.replaceWith(replacement);
    }

    @Test
    public void setParentNode_whenAlreadyHasParent_shouldRemoveFromOldParent() {
        // Arrange
        Node oldParent = new ConcreteTestNode("http://example.com");
        Node newParent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        oldParent.addChildren(child);

        // Act
        child.setParentNode(newParent);

        // Assert
        Assert.assertEquals(0, oldParent.childNodes().size());
        Assert.assertSame(newParent, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_whenOutNodeDoesNotBelongToThis_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node outsider = new ConcreteTestNode("http://example.com");
        Node in = new ConcreteTestNode("http://example.com");

        // Act
        parent.replaceChild(outsider, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_givenNullInNode_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        parent.addChildren(child);

        // Act
        parent.replaceChild(child, null);
    }

    @Test
    public void replaceChild_givenInNodeAlreadyHasParent_shouldReparentAndReplace() {
        // Arrange
        Node parent1 = new ConcreteTestNode("http://example.com");
        Node parent2 = new ConcreteTestNode("http://example.com");
        Node outChild = new ConcreteTestNode("http://example.com");
        Node inChild = new ConcreteTestNode("http://example.com");
        parent1.addChildren(outChild);
        parent2.addChildren(inChild);

        // Act
        parent1.replaceChild(outChild, inChild);

        // Assert
        Assert.assertNull(outChild.parent());
        Assert.assertSame(parent1, inChild.parent());
        Assert.assertEquals(0, parent2.childNodes().size());
        Assert.assertEquals(1, parent1.childNodes().size());
        Assert.assertSame(inChild, parent1.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeChild_whenChildDoesNotBelongToThis_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node stranger = new ConcreteTestNode("http://example.com");

        // Act
        parent.removeChild(stranger);
    }

    @Test
    public void addChildren_givenExistingChildWithParent_shouldMoveToNewParent() {
        // Arrange
        Node oldParent = new ConcreteTestNode("http://example.com");
        Node newParent = new ConcreteTestNode("http://example.com");
        Node child = new ConcreteTestNode("http://example.com");
        oldParent.addChildren(child);

        // Act
        newParent.addChildren(child);

        // Assert
        Assert.assertEquals(0, oldParent.childNodes().size());
        Assert.assertEquals(1, newParent.childNodes().size());
        Assert.assertSame(newParent, child.parent());
        Assert.assertEquals(0, child.siblingIndex().intValue());
    }

    @Test
    public void addChildrenAtIndex_givenValidElements_shouldInsertAtSpecifiedIndexAndReindex() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        Node inserted0 = new ConcreteTestNode("http://example.com");
        Node inserted1 = new ConcreteTestNode("http://example.com");

        // Act: insert at index 1
        parent.addChildren(1, inserted0, inserted1);

        // Assert
        // Expected order: child0, inserted0, inserted1, child1
        Assert.assertEquals(4, parent.childNodes().size());
        Assert.assertSame(child0, parent.childNode(0));
        Assert.assertSame(inserted0, parent.childNode(1));
        Assert.assertSame(inserted1, parent.childNode(2));
        Assert.assertSame(child1, parent.childNode(3));

        Assert.assertEquals(0, child0.siblingIndex().intValue());
        Assert.assertEquals(1, inserted0.siblingIndex().intValue());
        Assert.assertEquals(2, inserted1.siblingIndex().intValue());
        Assert.assertEquals(3, child1.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addChildrenAtIndex_givenNullInArray_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");

        // Act
        parent.addChildren(0, (Node[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addChildrenAtIndex_givenArrayContainingNull_shouldThrowException() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");

        // Act
        parent.addChildren(0, child0, null);
    }

    // ==========================================
    // Sibling Traversal Tests
    // ==========================================

    @Test
    public void siblingNodes_whenHasParent_shouldReturnAllChildrenOfParent() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act
        List<Node> siblings = child0.siblingNodes();

        // Assert
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(child0, siblings.get(0));
        Assert.assertSame(child1, siblings.get(1));
    }

    @Test
    public void nextSibling_givenVariousPositions_shouldReturnExpected() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act & Assert
        Assert.assertSame(child1, child0.nextSibling());
        Assert.assertNull(child1.nextSibling());
    }

    @Test
    public void nextSibling_whenNodeHasNoParent_shouldReturnNull() {
        // Arrange
        Node orphan = new ConcreteTestNode("http://example.com");

        // Act & Assert
        Assert.assertNull(orphan.nextSibling());
    }

    @Test
    public void previousSibling_givenVariousPositions_shouldReturnExpected() {
        // Arrange
        Node parent = new ConcreteTestNode("http://example.com");
        Node child0 = new ConcreteTestNode("http://example.com");
        Node child1 = new ConcreteTestNode("http://example.com");
        parent.addChildren(child0, child1);

        // Act & Assert
        Assert.assertNull(child0.previousSibling());
        Assert.assertSame(child0, child1.previousSibling());
    }

    @Test
    public void siblingIndex_and_setSiblingIndex_shouldUpdateIndex() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");
        Assert.assertEquals(0, node.siblingIndex().intValue());

        // Act
        node.setSiblingIndex(5);

        // Assert
        Assert.assertEquals(5, node.siblingIndex().intValue());
    }

    // ==========================================
    // HTML Generation & Rendering Tests
    // ==========================================

    @Test
    public void outerHtml_whenCalledOnTree_shouldProduceExpectedHtml() {
        // Arrange
        Node parent = new ConcreteTestNode("div", "http://example.com", new Attributes());
        Node child = new ConcreteTestNode("span", "http://example.com", new Attributes());
        parent.addChildren(child);

        // Act
        String html = parent.outerHtml();

        // Assert
        Assert.assertEquals("<div><span></span></div>", html);
    }

    @Test
    public void outerHtml_whenNodeIsText_shouldSkipOuterHtmlTail() {
        // Arrange
        ConcreteTestNode textNode = new ConcreteTestNode("#text", "http://example.com", new Attributes());

        // Act
        String html = textNode.outerHtml();

        // Assert
        Assert.assertEquals("<#text>", html);
        Assert.assertFalse(textNode.tailCalled);
    }

    @Test
    public void toString_whenCalled_shouldMatchOuterHtml() {
        // Arrange
        Node node = new ConcreteTestNode("p", "http://example.com", new Attributes());

        // Act & Assert
        Assert.assertEquals(node.outerHtml(), node.toString());
    }

    @Test
    public void indent_whenInvoked_shouldAppendNewlineAndIndentationSpaces() {
        // Arrange
        ConcreteTestNode node = new ConcreteTestNode("http://example.com");
        StringBuilder sb = new StringBuilder();
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(2);

        // Act
        node.indent(sb, 2, doc.outputSettings());

        // Assert
        Assert.assertEquals("\n    ", sb.toString());
    }

    @Test
    public void outerHtml_whenAttachedToDocument_shouldUseDocumentsOutputSettings() {
        // Arrange
        Document doc = new Document("http://example.com");
        doc.outputSettings().indentAmount(4);
        ConcreteTestNode node = new ConcreteTestNode("div", "http://example.com", new Attributes());
        doc.addChildren(node);

        // Act
        String html = node.outerHtml();

        // Assert
        Assert.assertEquals("<div></div>", html);
    }

    // ==========================================
    // Equals & HashCode Tests
    // ==========================================

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Node node = new ConcreteTestNode("http://example.com");

        // Act & Assert
        Assert.assertTrue(node.equals(node));
    }

    @Test
    public void equals_givenDifferentInstancesOrNull_shouldReturnFalse() {
        // Arrange
        Node node1 = new ConcreteTestNode("http://example.com");
        Node node2 = new ConcreteTestNode("http://example.com");

        // Act & Assert
        Assert.assertFalse(node1.equals(node2));
        Assert.assertFalse(node1.equals(null));
        Assert.assertFalse(node1.equals("Some String"));
    }

    @Test
    public void hashCode_givenDifferentConfigurations_shouldComputeWithoutError() {
        // Arrange: Node with null parent and null attributes
        Node defaultNode = new ConcreteTestNode();
        int hash1 = defaultNode.hashCode();

        // Arrange: Node with null parent and non-null attributes
        Node parent = new ConcreteTestNode("http://example.com");
        parent.attr("key", "val");
        int hash2 = parent.hashCode();

        // Arrange: Node with parent and non-null attributes
        Node child = new ConcreteTestNode("http://example.com");
        child.attr("childKey", "childVal");
        parent.addChildren(child);
        int hash3 = child.hashCode();

        // Assert
        Assert.assertEquals(0, hash1);
        Assert.assertNotEquals(0, hash2);
        Assert.assertNotEquals(0, hash3);
    }

    // ==========================================
    // Cloning Tests
    // ==========================================

    @Test
    public void clone_whenCalledOnTree_shouldPerformDeepCopyAndIsolateFromOriginal() {
        // Arrange
        Node parent = new ConcreteTestNode("parent", "http://example.com", new Attributes());
        parent.attr("k1", "v1");
        Node child = new ConcreteTestNode("child", "http://example.com", new Attributes());
        child.attr("k2", "v2");
        parent.addChildren(child);

        // Act
        Node clone = parent.clone();

        // Assert
        Assert.assertNotSame(parent, clone);
        Assert.assertNull(clone.parent());
        Assert.assertEquals(0, clone.siblingIndex().intValue());
        Assert.assertEquals(parent.baseUri(), clone.baseUri());
        Assert.assertEquals("v1", clone.attr("k1"));

        Assert.assertEquals(1, clone.childNodes().size());
        Node clonedChild = clone.childNode(0);
        Assert.assertNotSame(child, clonedChild);
        Assert.assertSame(clone, clonedChild.parent());
        Assert.assertEquals("v2", clonedChild.attr("k2"));
        Assert.assertEquals(0, clonedChild.siblingIndex().intValue());

        // Mutate original and assert clone is unchanged
        parent.attr("k1", "mutated");
        child.attr("k2", "mutated");
        Assert.assertEquals("v1", clone.attr("k1"));
        Assert.assertEquals("v2", clonedChild.attr("k2"));
    }

    @Test
    public void clone_whenAttributesAreNull_shouldCloneGracefully() {
        // Arrange
        Node node = new ConcreteTestNode();

        // Act
        Node clone = node.clone();

        // Assert
        Assert.assertNotSame(node, clone);
        Assert.assertNull(clone.attributes());
        Assert.assertNull(clone.baseUri());
    }

    @Test
    public void doClone_givenExplicitParent_shouldRetainParentAndSiblingIndex() {
        // Arrange
        Node originalParent = new ConcreteTestNode("http://example.com");
        Node originalChild0 = new ConcreteTestNode("http://example.com");
        Node originalChild1 = new ConcreteTestNode("http://example.com");
        originalParent.addChildren(originalChild0, originalChild1);

        Node newParent = new ConcreteTestNode("http://example.com");

        // Act
        Node clonedChild1 = originalChild1.doClone(newParent);

        // Assert
        Assert.assertSame(newParent, clonedChild1.parent());
        Assert.assertEquals(1, clonedChild1.siblingIndex().intValue());
    }
}