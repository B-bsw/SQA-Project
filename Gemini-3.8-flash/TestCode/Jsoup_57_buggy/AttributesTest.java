package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AttributesTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void get_givenNullAttributes_shouldReturnEmptyString() {
        // Arrange & Act
        String value = attributes.get("key");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test
    public void get_givenExistingKey_shouldReturnValue() {
        // Arrange
        attributes.put("href", "http://example.com");

        // Act
        String value = attributes.get("href");

        // Assert
        Assert.assertEquals("http://example.com", value);
    }

    @Test
    public void get_givenNonExistingKey_shouldReturnEmptyString() {
        // Arrange
        attributes.put("href", "http://example.com");

        // Act
        String value = attributes.get("target");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test
    public void get_givenKeyWithDifferentCase_shouldReturnEmptyString() {
        // Arrange
        attributes.put("class", "main");

        // Act
        String value = attributes.get("CLASS");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenNullKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenEmptyKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.get("");
    }

    @Test
    public void getIgnoreCase_givenNullAttributes_shouldReturnEmptyString() {
        // Arrange & Act
        String value = attributes.getIgnoreCase("key");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test
    public void getIgnoreCase_givenMatchingCaseInsensitiveKey_shouldReturnValue() {
        // Arrange
        attributes.put("HREF", "http://example.com");

        // Act
        String value = attributes.getIgnoreCase("href");

        // Assert
        Assert.assertEquals("http://example.com", value);
    }

    @Test
    public void getIgnoreCase_givenNonExistingKey_shouldReturnEmptyString() {
        // Arrange
        attributes.put("src", "image.png");

        // Act
        String value = attributes.getIgnoreCase("alt");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIgnoreCase_givenNullKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.getIgnoreCase(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIgnoreCase_givenEmptyKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.getIgnoreCase("");
    }

    @Test
    public void put_givenStringKeyValue_shouldStoreAttribute() {
        // Arrange & Act
        attributes.put("title", "A Title");

        // Assert
        Assert.assertEquals("A Title", attributes.get("title"));
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void put_givenExistingKey_shouldOverwriteAttribute() {
        // Arrange
        attributes.put("title", "Initial");

        // Act
        attributes.put("title", "Updated");

        // Assert
        Assert.assertEquals("Updated", attributes.get("title"));
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void put_givenBooleanTrue_shouldStoreBooleanAttribute() {
        // Arrange & Act
        attributes.put("checked", true);

        // Assert
        Assert.assertTrue(attributes.hasKey("checked"));
        Assert.assertEquals("", attributes.get("checked"));
    }

    @Test
    public void put_givenBooleanFalseOnExistingKey_shouldRemoveAttribute() {
        // Arrange
        attributes.put("checked", true);

        // Act
        attributes.put("checked", false);

        // Assert
        Assert.assertFalse(attributes.hasKey("checked"));
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void put_givenBooleanFalseOnNonExistingKey_shouldDoNothing() {
        // Arrange & Act
        attributes.put("checked", false);

        // Assert
        Assert.assertFalse(attributes.hasKey("checked"));
        Assert.assertEquals(0, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void put_givenNullAttributeObject_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.put((Attribute) null);
    }

    @Test
    public void put_givenAttributeObject_shouldStoreCorrectly() {
        // Arrange
        Attribute attr = new Attribute("id", "main-header");

        // Act
        attributes.put(attr);

        // Assert
        Assert.assertEquals("main-header", attributes.get("id"));
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void remove_givenNullAttributes_shouldDoNothing() {
        // Arrange & Act
        attributes.remove("key");

        // Assert
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void remove_givenExistingKey_shouldRemoveEntry() {
        // Arrange
        attributes.put("style", "color:red;");

        // Act
        attributes.remove("style");

        // Assert
        Assert.assertFalse(attributes.hasKey("style"));
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void remove_givenKeyWithDifferentCase_shouldNotRemove() {
        // Arrange
        attributes.put("class", "container");

        // Act
        attributes.remove("CLASS");

        // Assert
        Assert.assertTrue(attributes.hasKey("class"));
        Assert.assertEquals(1, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenNullKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenEmptyKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.remove("");
    }

    @Test
    public void removeIgnoreCase_givenNullAttributes_shouldDoNothing() {
        // Arrange & Act
        attributes.removeIgnoreCase("key");

        // Assert
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void removeIgnoreCase_givenMatchingKeyDifferentCase_shouldRemoveEntry() {
        // Arrange
        attributes.put("title", "Hello");

        // Act
        attributes.removeIgnoreCase("TITLE");

        // Assert
        Assert.assertFalse(attributes.hasKey("title"));
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void removeIgnoreCase_givenNonMatchingKey_shouldNotRemove() {
        // Arrange
        attributes.put("name", "sample");

        // Act
        attributes.removeIgnoreCase("other");

        // Assert
        Assert.assertTrue(attributes.hasKey("name"));
        Assert.assertEquals(1, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeIgnoreCase_givenNullKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.removeIgnoreCase(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeIgnoreCase_givenEmptyKey_shouldThrowException() {
        // Arrange, Act & Assert
        attributes.removeIgnoreCase("");
    }

    @Test
    public void hasKey_givenNullAttributes_shouldReturnFalse() {
        // Arrange & Act
        boolean result = attributes.hasKey("key");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void hasKey_givenExistingKey_shouldReturnTrue() {
        // Arrange
        attributes.put("id", "app");

        // Act
        boolean result = attributes.hasKey("id");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void hasKey_givenKeyDifferentCase_shouldReturnFalse() {
        // Arrange
        attributes.put("id", "app");

        // Act
        boolean result = attributes.hasKey("ID");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void hasKeyIgnoreCase_givenNullAttributes_shouldReturnFalse() {
        // Arrange & Act
        boolean result = attributes.hasKeyIgnoreCase("key");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void hasKeyIgnoreCase_givenMatchingKeyDifferentCase_shouldReturnTrue() {
        // Arrange
        attributes.put("DATA-VALUE", "123");

        // Act
        boolean result = attributes.hasKeyIgnoreCase("data-value");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void hasKeyIgnoreCase_givenNonExistingKey_shouldReturnFalse() {
        // Arrange
        attributes.put("alt", "logo");

        // Act
        boolean result = attributes.hasKeyIgnoreCase("title");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void size_givenNullAttributes_shouldReturnZero() {
        // Arrange & Act & Assert
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void size_givenPopulatedAttributes_shouldReturnCorrectCount() {
        // Arrange
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        // Act & Assert
        Assert.assertEquals(2, attributes.size());
    }

    @Test
    public void addAll_givenEmptyIncomingAttributes_shouldNotModifyTarget() {
        // Arrange
        attributes.put("k1", "v1");
        Attributes incoming = new Attributes();

        // Act
        attributes.addAll(incoming);

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("v1", attributes.get("k1"));
    }

    @Test
    public void addAll_givenTargetAttributesNull_shouldInitializeAndAddAll() {
        // Arrange
        Attributes incoming = new Attributes();
        incoming.put("k1", "v1");
        incoming.put("k2", "v2");

        // Act
        attributes.addAll(incoming);

        // Assert
        Assert.assertEquals(2, attributes.size());
        Assert.assertEquals("v1", attributes.get("k1"));
        Assert.assertEquals("v2", attributes.get("k2"));
    }

    @Test
    public void addAll_givenTargetAttributesPopulated_shouldMergeIncoming() {
        // Arrange
        attributes.put("k1", "original");
        attributes.put("k2", "v2");

        Attributes incoming = new Attributes();
        incoming.put("k1", "overwritten");
        incoming.put("k3", "v3");

        // Act
        attributes.addAll(incoming);

        // Assert
        Assert.assertEquals(3, attributes.size());
        Assert.assertEquals("overwritten", attributes.get("k1"));
        Assert.assertEquals("v2", attributes.get("k2"));
        Assert.assertEquals("v3", attributes.get("k3"));
    }

    @Test
    public void iterator_givenNullAttributes_shouldReturnEmptyIterator() {
        // Arrange & Act
        Iterator<Attribute> it = attributes.iterator();

        // Assert
        Assert.assertNotNull(it);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void iterator_givenPopulatedAttributes_shouldIterateCorrectly() {
        // Arrange
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        // Act
        Iterator<Attribute> it = attributes.iterator();

        // Assert
        Assert.assertTrue(it.hasNext());
        Attribute attr1 = it.next();
        Assert.assertEquals("k1", attr1.getKey());
        Assert.assertEquals("v1", attr1.getValue());

        Assert.assertTrue(it.hasNext());
        Attribute attr2 = it.next();
        Assert.assertEquals("k2", attr2.getKey());
        Assert.assertEquals("v2", attr2.getValue());

        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void asList_givenNullAttributes_shouldReturnEmptyList() {
        // Arrange & Act
        List<Attribute> list = attributes.asList();

        // Assert
        Assert.assertNotNull(list);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void asList_givenPopulatedAttributes_shouldReturnUnmodifiableList() {
        // Arrange
        attributes.put("a", "1");
        attributes.put("b", "2");

        // Act
        List<Attribute> list = attributes.asList();

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("a", list.get(0).getKey());
        Assert.assertEquals("b", list.get(1).getKey());

        try {
            list.add(new Attribute("c", "3"));
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void html_givenNullAttributes_shouldReturnEmptyString() {
        // Arrange & Act
        String html = attributes.html();

        // Assert
        Assert.assertEquals("", html);
    }

    @Test
    public void html_givenPopulatedAttributes_shouldReturnFormattedHtml() {
        // Arrange
        attributes.put("class", "btn");
        attributes.put("disabled", true);

        // Act
        String html = attributes.html();

        // Assert
        Assert.assertEquals(" class=\"btn\" disabled", html);
    }

    @Test
    public void htmlAppendable_givenNullAttributes_shouldNotAppend() throws IOException {
        // Arrange
        StringBuilder sb = new StringBuilder("start");
        Document doc = new Document("");

        // Act
        attributes.html(sb, doc.outputSettings());

        // Assert
        Assert.assertEquals("start", sb.toString());
    }

    @Test
    public void htmlAppendable_givenPopulatedAttributes_shouldAppend() throws IOException {
        // Arrange
        StringBuilder sb = new StringBuilder("prefix");
        Document doc = new Document("");
        attributes.put("id", "top");

        // Act
        attributes.html(sb, doc.outputSettings());

        // Assert
        Assert.assertEquals("prefix id=\"top\"", sb.toString());
    }

    @Test
    public void toString_shouldMatchHtml() {
        // Arrange
        attributes.put("name", "test");

        // Act & Assert
        Assert.assertEquals(attributes.html(), attributes.toString());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(attributes.equals(attributes));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(attributes.equals(null));
    }

    @Test
    public void equals_givenDifferentType_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(attributes.equals("some string"));
    }

    @Test
    public void equals_givenBothWithNullInternalAttributes_shouldReturnTrue() {
        // Arrange
        Attributes other = new Attributes();

        // Act & Assert
        Assert.assertTrue(attributes.equals(other));
        Assert.assertTrue(other.equals(attributes));
    }

    @Test
    public void equals_givenOneNullAndOnePopulated_shouldReturnFalse() {
        // Arrange
        Attributes other = new Attributes();
        other.put("k", "v");

        // Act & Assert
        Assert.assertFalse(attributes.equals(other));
        Assert.assertFalse(other.equals(attributes));
    }

    @Test
    public void equals_givenEqualPopulatedAttributes_shouldReturnTrue() {
        // Arrange
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        Attributes other = new Attributes();
        other.put("k1", "v1");
        other.put("k2", "v2");

        // Act & Assert
        Assert.assertTrue(attributes.equals(other));
        Assert.assertTrue(other.equals(attributes));
    }

    @Test
    public void equals_givenDifferentPopulatedAttributes_shouldReturnFalse() {
        // Arrange
        attributes.put("k1", "v1");

        Attributes other = new Attributes();
        other.put("k1", "different");

        // Act & Assert
        Assert.assertFalse(attributes.equals(other));
    }

    @Test
    public void hashCode_givenNullInternalAttributes_shouldReturnZero() {
        // Arrange & Act & Assert
        Assert.assertEquals(0, attributes.hashCode());
    }

    @Test
    public void hashCode_givenEqualAttributes_shouldHaveSameHashCode() {
        // Arrange
        attributes.put("key", "val");

        Attributes other = new Attributes();
        other.put("key", "val");

        // Act & Assert
        Assert.assertEquals(attributes.hashCode(), other.hashCode());
    }

    @Test
    public void clone_givenNullAttributes_shouldProduceEmptyClone() {
        // Arrange & Act
        Attributes clone = attributes.clone();

        // Assert
        Assert.assertNotNull(clone);
        Assert.assertEquals(0, clone.size());
        Assert.assertTrue(clone.equals(attributes));
    }

    @Test
    public void clone_givenPopulatedAttributes_shouldProduceIndependentDeepCopy() {
        // Arrange
        attributes.put("key1", "val1");
        attributes.put("key2", "val2");

        // Act
        Attributes clone = attributes.clone();

        // Modify original
        attributes.put("key3", "val3");
        attributes.put("key1", "modifiedVal1");

        // Assert
        Assert.assertEquals(2, clone.size());
        Assert.assertEquals("val1", clone.get("key1"));
        Assert.assertEquals("val2", clone.get("key2"));
        Assert.assertFalse(clone.hasKey("key3"));

        Assert.assertEquals(3, attributes.size());
        Assert.assertEquals("modifiedVal1", attributes.get("key1"));
    }

    @Test
    public void dataset_givenEmptyAttributes_shouldInitializeAndAllowPut() {
        // Arrange
        Map<String, String> dataset = attributes.dataset();

        // Act
        String oldVal = dataset.put("name", "sample");

        // Assert
        Assert.assertNull(oldVal);
        Assert.assertEquals(1, dataset.size());
        Assert.assertTrue(attributes.hasKey("data-name"));
        Assert.assertEquals("sample", attributes.get("data-name"));
    }

    @Test
    public void dataset_givenExistingDataKey_shouldReturnOldValueOnPut() {
        // Arrange
        attributes.put("data-id", "100");
        Map<String, String> dataset = attributes.dataset();

        // Act
        String oldVal = dataset.put("id", "200");

        // Assert
        Assert.assertEquals("100", oldVal);
        Assert.assertEquals("200", attributes.get("data-id"));
    }

    @Test
    public void dataset_entrySet_shouldFilterAndIterateOnlyDataAttributes() {
        // Arrange
        attributes.put("data-first", "1");
        attributes.put("non-data", "2");
        attributes.put("data-second", "3");
        attributes.put("data-", "empty-suffix");

        Map<String, String> dataset = attributes.dataset();

        // Act
        int count = 0;
        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            count++;
            if ("first".equals(entry.getKey())) {
                Assert.assertEquals("1", entry.getValue());
            } else if ("second".equals(entry.getKey())) {
                Assert.assertEquals("3", entry.getValue());
            } else {
                Assert.fail("Unexpected entry in dataset: " + entry.getKey());
            }
        }

        // Assert
        Assert.assertEquals(2, count);
        Assert.assertEquals(2, dataset.entrySet().size());
    }

    @Test
    public void dataset_iteratorRemove_shouldRemoveAttributeFromParent() {
        // Arrange
        attributes.put("data-remove-me", "yes");
        Map<String, String> dataset = attributes.dataset();

        // Act
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        Assert.assertTrue(it.hasNext());
        Map.Entry<String, String> entry = it.next();
        Assert.assertEquals("remove-me", entry.getKey());
        it.remove();

        // Assert
        Assert.assertFalse(attributes.hasKey("data-remove-me"));
        Assert.assertEquals(0, dataset.size());
    }
}