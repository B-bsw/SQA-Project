package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    private static class ConcreteNode extends Node {
        private String name;

        public ConcreteNode() {
            super();
            this.name = "test";
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
            this.name = "test";
        }

        public ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "test";
        }

        public ConcreteNode(String name, String baseUri) {
            super(baseUri);
            this.name = name;
        }

        public String nodeName() {
            return name;
        }

        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            indent(accum, depth, out);
            accum.append("<").append(nodeName()).append(">");
        }

        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(nodeName()).append(">");
        }

        public Node[] callChildNodesAsArray() {
            return childNodesAsArray();
        }

        public void callAddChildren(Node... children) {
            addChildren(children);
        }

        public void callAddChildren(int index, Node... children) {
            addChildren(index, children);
        }

        public void callReparentChild(Node child) {
            reparentChild(child);
        }

        public void callEnsureChildNodes() {
            ensureChildNodes();
        }

        public void callReplaceChild(Node out, Node in) {
            replaceChild(out, in);
        }

        public void callRemoveChild(Node out) {
            removeChild(out);
        }

        public void callSetParentNode(Node parent) {
            setParentNode(parent);
        }

        public void callIndent(StringBuilder accum, int depth, Document.OutputSettings out) {
            indent(accum, depth, out);
        }

        public Node callDoClone(Node parent) {
            return doClone(parent);
        }
    }

    // ==========================================
    // Constructor & Initialization Tests
    // ==========================================

    @Test
    public void constructor_givenDefaultConstructor_shouldInitializeWithEmptyAndNullFields() {
        ConcreteNode node = new ConcreteNode();

        Assert.assertEquals("test", node.nodeName());
        Assert.assertNull(node.attributes());
        Assert.assertNull(node.baseUri());
        Assert.assertEquals(0, node.childNodeSize());
        Assert.assertNull(node.parent());
        Assert.assertEquals(0, node.siblingIndex());
    }

    @Test
    public void constructor_givenBaseUri_shouldTrimUriAndCreateEmptyAttributes() {
        ConcreteNode node = new ConcreteNode("  http://example.com/path  ");

        Assert.assertEquals("http://example.com/path", node.baseUri());
        Assert.assertNotNull(node.attributes());
        Assert.assertEquals(0, node.childNodeSize());
    }

    @Test
    public void constructor_givenBaseUriAndAttributes_shouldStoreBoth() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        ConcreteNode node = new ConcreteNode("http://example.com", attrs);

        Assert.assertEquals("http://example.com", node.baseUri());
        Assert.assertSame(attrs, node.attributes());
        Assert.assertEquals("val", node.attr("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAttributes_shouldThrowException() {
        new ConcreteNode("http://example.com", null);
    }

    // ==========================================
    // Attributes & Attribute Lookup Tests
    // ==========================================

    @Test
    public void attr_givenExistingAttributeKey_shouldReturnStoredValue() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("id", "header");

        String result = node.attr("id");

        Assert.assertEquals("header", result);
    }

    @Test
    public void attr_givenNonExistentKey_shouldReturnEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com");

        String result = node.attr("absent");

        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void attr_givenAbsPrefixKey_shouldResolveAbsoluteUrl() {
        ConcreteNode node = new ConcreteNode("http://example.com/dir/");
        node.attr("href", "sub/page.html");

        String absResult = node.attr("abs:href");
        String absUpperResult = node.attr("ABS:HREF");

        Assert.assertEquals("http://example.com/dir/sub/page.html", absResult);
        Assert.assertEquals("http://example.com/dir/sub/page.html", absUpperResult);
    }

    @Test
    public void hasAttr_givenExistingAttribute_shouldReturnTrue() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("title", "tooltip");

        Assert.assertTrue(node.hasAttr("title"));
        Assert.assertFalse(node.hasAttr("other"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_givenNullKey_shouldThrowException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.hasAttr(null);
    }

    @Test