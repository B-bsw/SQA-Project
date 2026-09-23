package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.helper.Validate;

import java.util.List;

public class LeafNodeTest {

    private LeafNode leafNode;
    private LeafNode leafNodeWithAttributes;

    @Before
    public void setUp() {
        leafNode = new TestLeafNode();
        leafNodeWithAttributes = new TestLeafNode();
        leafNodeWithAttributes.attributes().put("existingKey", "existingValue");
    }

    @Test
    public void testHasAttributesInitiallyFalse() {
        assertFalse(leafNode.hasAttributes());
    }

    @Test
    public void testHasAttributesAfterEnsureAttributes() {
        leafNode.attr("newKey", "newValue");
        assertTrue(leafNode.hasAttributes());
    }

    @Test
    public void testAttributesInitializesEmptyAttributes() {
        assertNotNull(leafNode.attributes());
        assertEquals(0, leafNode.attributes().size());
    }

    @Test
    public void testAttributesPreservesCoreValue() {
        String coreValue = "coreValue";
        leafNode.value = coreValue;
        Attributes attrs = leafNode.attributes();
        assertEquals(coreValue, attrs.get(leafNode.nodeName()));
    }

    @Test
    public void testCoreValueSetterGetter() {
        String newCoreValue = "newCoreValue";
        leafNode.coreValue(newCoreValue);
        assertEquals(newCoreValue, leafNode.coreValue());
    }

    @Test
    public void testAttrGetterWithCoreValueNullValue() {
        leafNode.value = null;
        assertEquals("", leafNode.attr(leafNode.nodeName()));
    }

    @Test
    public void testAttrGetterWithCoreValue() {
        String coreValue = "coreValue";
        leafNode.value = coreValue;
        assertEquals(coreValue, leafNode.attr(leafNode.nodeName()));
    }

    @Test
    public void testAttrGetterWithDifferentKey() {
        leafNode.value = "coreValue";
        assertEquals("", leafNode.attr("differentKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrGetterNullKey() {
        leafNode.attr(null);
    }

    @Test
    public void testAttrSetterReplacesCoreValue() {
        String newValue = "newValue";
        leafNode.attr(leafNode.nodeName(), newValue);
        assertEquals(newValue, leafNode.attr(leafNode.nodeName()));
    }

    @Test
    public void testAttrSetterWithDifferentKeyCreatesAttributes() {
        leafNode.attr("otherKey", "otherValue");
        assertTrue(leafNode.hasAttributes());
        assertEquals("otherValue", leafNode.attr("otherKey"));
    }

    @Test
    public void testAttrSetterWithSameKeyUsesAttributes() {
        leafNodeWithAttributes.attr(leafNodeWithAttributes.nodeName(), "newCoreValue");
        assertEquals("newCoreValue", leafNodeWithAttributes.attr(leafNodeWithAttributes.nodeName()));
    }

    @Test
    public void testHasAttrWithoutExistingKey() {
        assertFalse(leafNode.hasAttr("nonexistent"));
    }

    @Test
    public void testHasAttrWithExistingKey() {
        leafNode.attr("key", "value");
        assertTrue(leafNode.hasAttr("key"));
    }

    @Test
    public void testHasAttrAfterEnsureAttributesPreservesCoreValue() {
        leafNode.value = "coreValue";
        assertFalse(leafNode.hasAttr("nonexistent"));
        assertEquals("coreValue", leafNode.attr(leafNode.nodeName()));
    }

    @Test
    public void testRemoveAttrNonExistent() {
        leafNode.removeAttr("nonexistent");
        assertFalse(leafNode.hasAttr("nonexistent"));
    }

    @Test
    public void testRemoveAttrExisting() {
        leafNode.attr("key", "value");
        leafNode.removeAttr("key");
        assertFalse(leafNode.hasAttr("key"));
    }

    @Test
    public void testAbsUrlWithNoParent() {
        assertEquals("", leafNodeWithAttributes.absUrl("nonexistent"));
    }

    @Test
    public void testBaseUriWithoutParent() {
        assertEquals("", leafNode.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        leafNode.doSetBaseUri("http://example.com");
    }

    @Test
    public void testChildNodeSize() {
        assertEquals(0, leafNode.childNodeSize());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureChildNodesThrows() {
        leafNode.ensureChildNodes();
    }

    @Test
    public void testEnsureAttributesOnAttributeSetter() {
        leafNode.attributes().put("key", "value");
        assertTrue(leafNode.hasAttributes());
    }

    @Test
    public void testEnsureAttributesOnAbsUrl() {
        leafNodeWithAttributes.absUrl("nonexistent");
        assertTrue(leafNodeWithAttributes.hasAttributes());
    }

    @Test
    public void testCoreValueGetterWithAttributes() {
        String coreValue = "coreValue";
        leafNodeWithAttributes.coreValue(coreValue);
        assertEquals(coreValue, leafNodeWithAttributes.coreValue());
    }

    private static class TestLeafNode extends LeafNode {
        @Override
        public String nodeName() {
            return "testNode";
        }

        @Override
        public String outerHtml() {
            return null;
        }

        @Override
        protected void doSetBaseUri(String baseUri) {
            // noop
        }
    }
}