package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class LeafNodeTest {

    private static class ConcreteLeafNode extends LeafNode {
        private String nodeName;

        ConcreteLeafNode(String nodeName) {
            this.nodeName = nodeName;
        }

        ConcreteLeafNode(String nodeName, String value) {
            this.nodeName = nodeName;
            this.value = value;
        }

        @Override
        public String nodeName() {
            return nodeName;
        }

        @Override
        void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }

        @Override
        void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }
    }

    private ConcreteLeafNode node;

    @Before
    public void setUp() {
        node = new ConcreteLeafNode("#text", "initial text");
    }

    @Test
    public void hasAttributes_givenStringValue_shouldReturnFalse() {
        Assert.assertFalse(node.hasAttributes());
    }

    @Test
    public void hasAttributes_givenAttributesInstance_shouldReturnTrue() {
        node.attributes();
        Assert.assertTrue(node.hasAttributes());
    }

    @Test
    public void attributes_whenValueIsNull_shouldCreateEmptyAttributes() {
        ConcreteLeafNode emptyNode = new ConcreteLeafNode("#text", null);
        Attributes attrs = emptyNode.attributes();

        Assert.assertNotNull(attrs);
        Assert.assertTrue(emptyNode.hasAttributes());
        Assert.assertEquals(0, attrs.size());
    }

    @Test
    public void attributes_whenValueIsString_shouldPreserveCoreValueInAttributes() {
        Attributes attrs = node.attributes();

        Assert.assertNotNull(attrs);
        Assert.assertTrue(node.hasAttributes());
        Assert.assertEquals("initial text", attrs.get("#text"));
    }

    @Test
    public void attributes_whenCalledRepeatedly_shouldReturnSameInstance() {
        Attributes attrs1 = node.attributes();
        Attributes attrs2 = node.attributes();

        Assert.assertSame(attrs1, attrs2);
    }

    @Test
    public void coreValue_whenNotInitializedAsAttributes_shouldReturnUnderlyingString() {
        Assert.assertEquals("initial text", node.coreValue());
    }

    @Test
    public void coreValue_whenInitializedAsAttributes_shouldReturnAttributeValue() {
        node.attributes();
        Assert.assertEquals("initial text", node.coreValue());
    }

    @Test
    public void coreValueSetter_whenNoAttributes_shouldUpdateDirectValue() {
        node.coreValue("updated text");

        Assert.assertFalse(node.hasAttributes());
        Assert.assertEquals("updated text", node.coreValue());
    }

    @Test
    public void coreValueSetter_whenAttributesExist_shouldUpdateAttributeEntry() {
        node.attributes();
        node.coreValue("updated text");

        Assert.assertTrue(node.hasAttributes());
        Assert.assertEquals("updated text", node.coreValue());
        Assert.assertEquals("updated text", node.attr("#text"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_givenNullKey_shouldThrowException() {
        node.attr(null);
    }

    @Test
    public void attr_givenMatchingNodeNameWithoutAttributes_shouldReturnCoreValue() {
        String result = node.attr("#text");
        Assert.assertEquals("initial text", result);
    }

    @Test
    public void attr_givenMatchingNodeNameWithNullValueWithoutAttributes_shouldReturnNull() {
        ConcreteLeafNode nullNode = new ConcreteLeafNode("#text", null);
        String result = nullNode.attr("#text");
        Assert.assertNull(result);
    }

    @Test
    public void attr_givenNonMatchingKeyWithoutAttributes_shouldReturnEmptyString() {
        String result = node.attr("differentKey");
        Assert.assertEquals("", result);
    }

    @Test
    public void attr_givenExistingAttributes_shouldDelegateToSuper() {
        node.attr("customKey", "customValue");
        Assert.assertEquals("customValue", node.attr("customKey"));
        Assert.assertEquals("initial text", node.attr("#text"));
        Assert.assertEquals("", node.attr("nonExistentKey"));
    }

    @Test
    public void attrSetter_givenMatchingNodeNameWithoutAttributes_shouldUpdateValueWithoutCreatingAttributes() {
        Node result = node.attr("#text", "newValue");

        Assert.assertSame(node, result);
        Assert.assertFalse(node.hasAttributes());
        Assert.assertEquals("newValue", node.value);
        Assert.assertEquals("newValue", node.attr("#text"));
    }

    @Test
    public void attrSetter_givenNonMatchingKeyWithoutAttributes_shouldCreateAttributesAndStoreBoth() {
        Node result = node.attr("otherKey", "otherValue");

        Assert.assertSame(node, result);
        Assert.assertTrue(node.hasAttributes());
        Assert.assertEquals("initial text", node.attr("#text"));
        Assert.assertEquals("otherValue", node.attr("otherKey"));
    }

    @Test
    public void attrSetter_whenAlreadyHasAttributes_shouldUpdateAttributesViaSuper() {
        node.attributes();
        node.attr("#text", "modifiedText");
        node.attr("anotherKey", "anotherValue");

        Assert.assertTrue(node.hasAttributes());
        Assert.assertEquals("modifiedText", node.attr("#text"));
        Assert.assertEquals("anotherValue", node.attr("anotherKey"));
    }

    @Test
    public void hasAttr_whenKeyMatchesExistingAttribute_shouldReturnTrue() {
        Assert.assertTrue(node.hasAttr("#text"));
    }

    @Test
    public void hasAttr_whenKeyDoesNotExist_shouldReturnFalse() {
        Assert.assertFalse(node.hasAttr("missingKey"));
    }

    @Test
    public void removeAttr_whenCalled_shouldEnsureAttributesAndRemove() {
        Assert.assertFalse(node.hasAttributes());

        Node result = node.removeAttr("#text");

        Assert.assertSame(node, result);
        Assert.assertTrue(node.hasAttributes());
        Assert.assertFalse(node.hasAttr("#text"));
        Assert.assertEquals("", node.attr("#text"));
    }

    @Test
    public void absUrl_whenCalled_shouldEnsureAttributes() {
        Assert.assertFalse(node.hasAttributes());

        String abs = node.absUrl("#text");

        Assert.assertTrue(node.hasAttributes());
        Assert.assertNotNull(abs);
    }

    @Test
    public void baseUri_givenNoParent_shouldReturnEmptyString() {
        Assert.assertEquals("", node.baseUri());
    }

    @Test
    public void baseUri_givenParentWithBaseUri_shouldReturnParentBaseUri() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com/base/");
        parent.appendChild(node);

        Assert.assertEquals("http://example.com/base/", node.baseUri());
    }

    @Test
    public void doSetBaseUri_whenCalled_shouldBeNoOperation() {
        node.doSetBaseUri("http://example.com/ignored/");
        Assert.assertEquals("", node.baseUri());
    }

    @Test
    public void childNodeSize_shouldAlwaysReturnZero() {
        Assert.assertEquals(0, node.childNodeSize());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ensureChildNodes_shouldThrowUnsupportedOperationException() {
        node.ensureChildNodes();
    }
}