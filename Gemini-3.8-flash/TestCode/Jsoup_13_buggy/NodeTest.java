package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    private static class ConcreteNode extends Node {
        private String name;

        public ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "concreteNode";
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
            this.name = "concreteNode";
        }

        public ConcreteNode() {
            super();
            this.name = "concreteNode";
        }

        public ConcreteNode(String name, String baseUri) {
            super(baseUri);
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

    @Test
    public void constructor_givenBaseUriAndAttributes_shouldInitializeProperly() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("key1", "val1");

        // Act
        ConcreteNode node = new ConcreteNode("  http://example.com/dir/  ", attrs);

        // Assert
        Assert.assertEquals("http://example.com/dir/", node.baseUri());
        Assert.assertEquals(1, node.attributes().size());
        Assert.assertEquals("val1", node.attr("key1"));
        Assert.assertNull(node.parent());
        Assert.assertEquals(0, node.childNodes().size());
    }

    @Test
    public void constructor_givenOnlyBaseUri_shouldInitializeWithEmptyAttributes() {
        // Arrange & Act
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Assert
        Assert.assertEquals("http://example.com", node.baseUri());
        Assert.assertNotNull(node.attributes());
        Assert.assertEquals(0, node.attributes().size());
        Assert.assertEquals(0, node.childNodes().size());
    }

    @Test
    public void constructor_default_shouldInitializeWithEmptyState() {
        // Arrange & Act
        ConcreteNode node = new ConcreteNode();

        // Assert
        Assert.assertNull(node.baseUri());
        Assert.assertNull(node.attributes());
        Assert.assertEquals(0, node.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        // Arrange & Act
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAttributes_shouldThrowException() {
        // Arrange & Act
        new ConcreteNode("http://example.com", null);
    }

    @Test
    public void attr_givenExistingKey_shouldReturnStoredValue() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("data-test", "sampleValue");

        // Act
        String result = node.attr("data-test");

        // Assert
        Assert.assertEquals("sampleValue", result);
    }

    @Test
    public void attr_givenNonExistingKey_shouldReturnEmptyString() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        String result = node.attr("nonExisting");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        node.attr(null);
    }

    @Test
    public void attr_givenAbsPrefixKey_shouldResolveAbsoluteUrl() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com/path/index.html");
        node.attr("href", "sub/page.html");

        // Act
        String result = node.attr("abs:href");

        // Assert
        Assert.assertEquals("http://example.com/path/sub/page.html", result);
    }

    @Test
    public void attr_givenAbsPrefixKeyCaseInsensitive_shouldResolveAbsoluteUrl() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com/path/");
        node.attr("href", "image.png");

        // Act
        String result = node.attr("ABS:href");

        // Assert
        Assert.assertEquals("http://example.com/path/image.png", result);
    }

    @Test
    public void hasAttr_givenExistingAndNonExistingKey_shouldReturnAccurateBoolean() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("class", "active");

        // Act & Assert
        Assert.assertTrue(node.hasAttr("class"));
        Assert.assertFalse(node.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_givenNullKey_shouldThrowException() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        node.hasAttr(null);
    }

    @Test
    public void removeAttr_givenExistingKey_shouldRemoveAttribute() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("id", "main");

        // Act
        Node returned = node.removeAttr("id");

        // Assert
        Assert.assertSame(node, returned);
        Assert.assertFalse(node.hasAttr("id"));
        Assert.assertEquals("", node.attr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAttr_givenNullKey_shouldThrowException() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        node.removeAttr(null);
    }

    @Test
    public void setBaseUri_givenValidUri_shouldUpdateBaseUri() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://initial.com");

        // Act
        node.setBaseUri("http://updated.com");

        // Assert
        Assert.assertEquals("http://updated.com", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setBaseUri_givenNullUri_shouldThrowException() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://initial.com");

        // Act
        node.setBaseUri(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_givenEmptyKey_shouldThrowException() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        node.absUrl("");
    }

    @Test
    public void absUrl_givenMissingAttribute_shouldReturnEmptyString() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void absUrl_givenRelativeUrlAndStandardBase_shouldResolveCorrectly() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com/dir/page.html");
        node.attr("href", "other.html");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("http://example.com/dir/other.html", result);
    }

    @Test
    public void absUrl_givenQueryRelativeUrl_shouldAppendToPathCorrectly() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com/path/file.html");
        node.attr("href", "?query=1");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("http://example.com/path/file.html?query=1", result);
    }

    @Test
    public void absUrl_givenInvalidBaseUriButValidAbsoluteRelUrl_shouldReturnAbsUrl() {
        // Arrange
        ConcreteNode node = new ConcreteNode("not a valid uri");
        node.attr("href", "http://external.com/path");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("http://external.com/path", result);
    }

    @Test
    public void absUrl_givenInvalidBaseUriAndInvalidRelUrl_shouldReturnEmptyString() {
        // Arrange
        ConcreteNode node = new ConcreteNode("invalid-uri");
        node.attr("href", "relative/path");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void absUrl_givenMalformedRelativeUrl_shouldReturnEmptyString() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("href", "http://::invalid-port");

        // Act
        String result = node.absUrl("href");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void childNodeAndChildNodes_givenChildren_shouldReturnCorrectChildAndList() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("child1", "http://example.com");
        ConcreteNode child2 = new ConcreteNode("child2", "http://example.com");
        parent.addChildren(child1, child2);

        // Act
        Node retrievedChild0 = parent.childNode(0);
        Node retrievedChild1 = parent.childNode(1);
        List<Node> children = parent.childNodes();
        Node[] childrenArray = parent.childNodesAsArray();

        // Assert
        Assert.assertSame(child1, retrievedChild0);
        Assert.assertSame(child2, retrievedChild1);
        Assert.assertEquals(2, children.size());
        Assert.assertEquals(2, childrenArray.length);
        Assert.assertSame(child1, childrenArray[0]);
        Assert.assertSame(child2, childrenArray[1]);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void childNodes_givenReturnedList_shouldBeUnmodifiable() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        parent.addChildren(child);

        // Act
        List<Node> list = parent.childNodes();
        list.add(new ConcreteNode());
    }

    @Test
    public void parent_givenChildAdded_shouldReturnParent() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");

        // Act
        parent.addChildren(child);

        // Assert
        Assert.assertSame(parent, child.parent());
    }

    @Test
    public void ownerDocument_givenDocumentAsSelf_shouldReturnSelf() {
        // Arrange
        Document doc = new Document("http://example.com");

        // Act & Assert
        Assert.assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void ownerDocument_givenNodeWithoutParent_shouldReturnNull() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");

        // Act & Assert
        Assert.assertNull(node.ownerDocument());
    }

    @Test
    public void ownerDocument_givenNestedNodeInsideDocument_shouldReturnDocument() {
        // Arrange
        Document doc = new Document("http://example.com");
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        doc.addChildren(parent);
        parent.addChildren(child);

        // Act & Assert
        Assert.assertSame(doc, child.ownerDocument());
    }

    @Test
    public void remove_givenParentedNode_shouldRemoveFromParent() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode child2 = new ConcreteNode("c2", "http://example.com");
        parent.addChildren(child1, child2);

        // Act
        child1.remove();

        // Assert
        Assert.assertEquals(1, parent.childNodes().size());
        Assert.assertNull(child1.parent());
        Assert.assertSame(child2, parent.childNode(0));
        Assert.assertEquals(0, child2.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenOrphanNode_shouldThrowException() {
        // Arrange
        ConcreteNode orphan = new ConcreteNode("http://example.com");

        // Act
        orphan.remove();
    }

    @Test
    public void before_givenNode_shouldInsertBeforeSelf() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode target = new ConcreteNode("target", "http://example.com");
        parent.addChildren(target);
        ConcreteNode newNode = new ConcreteNode("newNode", "http://example.com");

        // Act
        Node returned = target.before(newNode);

        // Assert
        Assert.assertSame(target, returned);
        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(newNode, parent.childNode(0));
        Assert.assertSame(target, parent.childNode(1));
        Assert.assertEquals(0, newNode.siblingIndex());
        Assert.assertEquals(1, target.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void before_givenNullNode_shouldThrowException() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode target = new ConcreteNode("target", "http://example.com");
        parent.addChildren(target);

        // Act
        target.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void before_givenOrphanNode_shouldThrowException() {
        // Arrange
        ConcreteNode orphan = new ConcreteNode("orphan", "http://example.com");
        ConcreteNode newNode = new ConcreteNode("new", "http://example.com");

        // Act
        orphan.before(newNode);
    }

    @Test
    public void before_givenHtmlString_shouldParseAndInsertBefore() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(target);

        // Act
        target.before("<span>test</span>");

        // Assert
        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertEquals("span", parent.childNode(0).nodeName());
        Assert.assertEquals("p", parent.childNode(1).nodeName());
    }

    @Test
    public void after_givenNode_shouldInsertAfterSelf() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode target = new ConcreteNode("target", "http://example.com");
        parent.addChildren(target);
        ConcreteNode newNode = new ConcreteNode("newNode", "http://example.com");

        // Act
        Node returned = target.after(newNode);

        // Assert
        Assert.assertSame(target, returned);
        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(target, parent.childNode(0));
        Assert.assertSame(newNode, parent.childNode(1));
        Assert.assertEquals(0, target.siblingIndex());
        Assert.assertEquals(1, newNode.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void after_givenNullNode_shouldThrowException() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode target = new ConcreteNode("target", "http://example.com");
        parent.addChildren(target);

        // Act
        target.after((Node) null);
    }

    @Test
    public void after_givenHtmlString_shouldParseAndInsertAfter() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(target);

        // Act
        target.after("<span>test</span>");

        // Assert
        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertEquals("p", parent.childNode(0).nodeName());
        Assert.assertEquals("span", parent.childNode(1).nodeName());
    }

    @Test
    public void wrap_givenSingleTag_shouldWrapCurrentNode() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(target);

        // Act
        Node wrapped = target.wrap("<div class='wrapper'></div>");

        // Assert
        Assert.assertSame(target, wrapped);
        Assert.assertEquals(1, parent.children().size());
        Element wrapper = (Element) parent.childNode(0);
        Assert.assertEquals("div", wrapper.nodeName());
        Assert.assertEquals("wrapper", wrapper.attr("class"));
        Assert.assertEquals(1, wrapper.childNodes().size());
        Assert.assertSame(target, wrapper.childNode(0));
    }

    @Test
    public void wrap_givenDeepTags_shouldWrapInDeepestElement() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(target);

        // Act
        target.wrap("<div class='outer'><div class='inner'></div></div>");

        // Assert
        Element outer = (Element) parent.childNode(0);
        Assert.assertEquals("outer", outer.attr("class"));
        Element inner = (Element) outer.childNode(0);
        Assert.assertEquals("inner", inner.attr("class"));
        Assert.assertSame(target, inner.childNode(0));
    }

    @Test
    public void wrap_givenExtraSiblingInHtml_shouldAppendRemainderToWrap() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(target);

        // Act
        target.wrap("<div class='wrapper'></div><p class='extra'></p>");

        // Assert
        Element wrapper = (Element) parent.childNode(0);
        Assert.assertEquals("wrapper", wrapper.attr("class"));
        Assert.assertSame(target, wrapper.childNode(0));
        Assert.assertEquals("extra", wrapper.childNode(1).attr("class"));
    }

    @Test
    public void wrap_givenNonElementHtml_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(target);

        // Act
        Node result = target.wrap("Just plain text");

        // Assert
        Assert.assertNull(result);
        Assert.assertSame(target, parent.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrap_givenEmptyString_shouldThrowException() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(target);

        // Act
        target.wrap("");
    }

    @Test
    public void replaceWith_givenReplacementNode_shouldSwapNodes() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode oldChild = new ConcreteNode("old", "http://example.com");
        ConcreteNode newChild = new ConcreteNode("new", "http://example.com");
        parent.addChildren(oldChild);

        // Act
        oldChild.replaceWith(newChild);

        // Assert
        Assert.assertEquals(1, parent.childNodes().size());
        Assert.assertSame(newChild, parent.childNode(0));
        Assert.assertSame(parent, newChild.parent());
        Assert.assertNull(oldChild.parent());
    }

    @Test
    public void replaceWith_givenReplacementNodeWithExistingParent_shouldDetachFromOldParent() {
        // Arrange
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode child2 = new ConcreteNode("c2", "http://example.com");
        parent1.addChildren(child1);
        parent2.addChildren(child2);

        // Act
        child1.replaceWith(child2);

        // Assert
        Assert.assertEquals(0, parent2.childNodes().size());
        Assert.assertEquals(1, parent1.childNodes().size());
        Assert.assertSame(child2, parent1.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenNull_shouldThrowException() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        parent.addChildren(child);

        // Act
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_givenOrphanTarget_shouldThrowException() {
        // Arrange
        ConcreteNode orphan = new ConcreteNode("orphan", "http://example.com");
        ConcreteNode replacement = new ConcreteNode("replacement", "http://example.com");

        // Act
        orphan.replaceWith(replacement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_givenWrongParent_shouldThrowException() {
        // Arrange
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode child2 = new ConcreteNode("c2", "http://example.com");
        parent1.addChildren(child1);

        // Act
        parent2.replaceChild(child1, child2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeChild_givenWrongParent_shouldThrowException() {
        // Arrange
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("c1", "http://example.com");
        parent1.addChildren(child1);

        // Act
        parent2.removeChild(child1);
    }

    @Test
    public void setParentNode_givenExistingParent_shouldDetachFromOldParent() {
        // Arrange
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        parent1.addChildren(child);

        // Act
        child.setParentNode(parent2);

        // Assert
        Assert.assertEquals(0, parent1.childNodes().size());
        Assert.assertSame(parent2, child.parent());
    }

    @Test
    public void addChildren_multipleNodes_shouldReindexProperly() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode c2 = new ConcreteNode("c2", "http://example.com");
        ConcreteNode c3 = new ConcreteNode("c3", "http://example.com");

        // Act
        parent.addChildren(c1, c2, c3);

        // Assert
        Assert.assertEquals(3, parent.childNodes().size());
        Assert.assertEquals(0, c1.siblingIndex());
        Assert.assertEquals(1, c2.siblingIndex());
        Assert.assertEquals(2, c3.siblingIndex());
    }

    @Test
    public void addChildrenAtIndex_shouldInsertAndMaintainOrder() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode c2 = new ConcreteNode("c2", "http://example.com");
        parent.addChildren(c1, c2);

        ConcreteNode insert1 = new ConcreteNode("ins1", "http://example.com");
        ConcreteNode insert2 = new ConcreteNode("ins2", "http://example.com");

        // Act
        parent.addChildren(1, insert1, insert2);

        // Assert
        Assert.assertEquals(4, parent.childNodes().size());
        Assert.assertSame(c1, parent.childNode(0));
        Assert.assertSame(insert1, parent.childNode(1));
        Assert.assertSame(insert2, parent.childNode(2));
        Assert.assertSame(c2, parent.childNode(3));

        Assert.assertEquals(0, c1.siblingIndex());
        Assert.assertEquals(1, insert1.siblingIndex());
        Assert.assertEquals(2, insert2.siblingIndex());
        Assert.assertEquals(3, c2.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addChildrenAtIndex_givenNullElements_shouldThrowException() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");

        // Act
        parent.addChildren(0, (Node) null);
    }

    @Test
    public void siblingNodes_givenParentedNode_shouldReturnAllSiblingsIncludingSelf() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode c2 = new ConcreteNode("c2", "http://example.com");
        parent.addChildren(c1, c2);

        // Act
        List<Node> siblings = c1.siblingNodes();

        // Assert
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(c1, siblings.get(0));
        Assert.assertSame(c2, siblings.get(1));
    }

    @Test
    public void nextSibling_givenVariousPositions_shouldReturnCorrectSiblingOrNull() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode c2 = new ConcreteNode("c2", "http://example.com");
        parent.addChildren(c1, c2);

        ConcreteNode orphan = new ConcreteNode("orphan", "http://example.com");

        // Act & Assert
        Assert.assertNull(orphan.nextSibling());
        Assert.assertSame(c2, c1.nextSibling());
        Assert.assertNull(c2.nextSibling());
    }

    @Test
    public void previousSibling_givenVariousPositions_shouldReturnCorrectSiblingOrNull() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("c1", "http://example.com");
        ConcreteNode c2 = new ConcreteNode("c2", "http://example.com");
        parent.addChildren(c1, c2);

        // Act & Assert
        Assert.assertNull(c1.previousSibling());
        Assert.assertSame(c1, c2.previousSibling());
    }

    @Test
    public void outerHtml_givenNodeStructure_shouldGenerateExpectedString() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        parent.addChildren(child);

        // Act
        String html = parent.outerHtml();

        // Assert
        Assert.assertEquals("<parent><child></child></parent>", html);
        Assert.assertEquals(html, parent.toString());
    }

    @Test
    public void outerHtml_withTextNode_shouldSkipTailCallForTextNode() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com");
        TextNode textNode = new TextNode("sample text", "http://example.com");
        parent.addChildren(textNode);

        // Act
        String html = parent.outerHtml();

        // Assert
        Assert.assertTrue(html.contains("sample text"));
    }

    @Test
    public void indent_shouldAppendNewlineAndPaddedIndent() {
        // Arrange
        ConcreteNode node = new ConcreteNode("http://example.com");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.indentAmount(4);

        // Act
        node.indent(sb, 2, out);

        // Assert
        Assert.assertEquals("\n        ", sb.toString());
    }

    @Test
    public void equalsAndHashCode_shouldAdhereToIdentityAndAttributeState() {
        // Arrange
        ConcreteNode node1 = new ConcreteNode("http://example.com");
        node1.attr("k", "v");
        ConcreteNode node2 = new ConcreteNode("http://example.com");
        node2.attr("k", "v");

        // Act & Assert
        Assert.assertTrue(node1.equals(node1));
        Assert.assertFalse(node1.equals(node2));
        Assert.assertFalse(node1.equals(null));
        Assert.assertFalse(node1.equals("non-node"));

        int hash1 = node1.hashCode();
        int hash2 = node1.hashCode();
        Assert.assertEquals(hash1, hash2);

        ConcreteNode orphanNode = new ConcreteNode();
        int hashOrphan = orphanNode.hashCode();
        Assert.assertEquals(0, hashOrphan);
    }

    @Test
    public void clone_shouldCreateDeepStandAloneCopy() {
        // Arrange
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com");
        parent.attr("rootAttr", "rootVal");
        ConcreteNode child = new ConcreteNode("child", "http://example.com");
        child.attr("childAttr", "childVal");
        parent.addChildren(child);

        // Act
        Node cloned = parent.clone();

        // Assert
        Assert.assertNotSame(parent, cloned);
        Assert.assertNull(cloned.parent());
        Assert.assertEquals(0, cloned.siblingIndex());
        Assert.assertEquals("rootVal", cloned.attr("rootAttr"));
        Assert.assertEquals(1, cloned.childNodes().size());

        Node clonedChild = cloned.childNode(0);
        Assert.assertNotSame(child, clonedChild);
        Assert.assertSame(cloned, clonedChild.parent());
        Assert.assertEquals("childVal", clonedChild.attr("childAttr"));
        Assert.assertEquals("child", clonedChild.nodeName());
    }

    @Test
    public void clone_givenAttributesNull_shouldCloneGracefully() {
        // Arrange
        ConcreteNode node = new ConcreteNode();

        // Act
        Node cloned = node.clone();

        // Assert
        Assert.assertNotSame(node, cloned);
        Assert.assertNull(cloned.attributes());
        Assert.assertNull(cloned.baseUri());
        Assert.assertEquals(0, cloned.childNodes().size());
    }
}