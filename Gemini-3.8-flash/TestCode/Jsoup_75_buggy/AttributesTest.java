package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class AttributesTest {

    @Test
    public void size_givenEmptyAttributes_shouldReturnZero() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        int size = attributes.size();

        // Assert
        Assert.assertEquals(0, size);
    }

    @Test
    public void put_givenNewKeyValue_shouldStoreAndReturnSelf() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        Attributes returned = attributes.put("key1", "val1");

        // Assert
        Assert.assertSame(attributes, returned);
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("val1", attributes.get("key1"));
    }

    @Test
    public void put_givenExistingKey_shouldOverwritePreviousValue() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("key1", "initial");

        // Act
        attributes.put("key1", "updated");

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("updated", attributes.get("key1"));
    }

    @Test
    public void put_givenExceedingInitialCapacity_shouldGrowInternalArrays() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        for (int i = 0; i < 10; i++) {
            attributes.put("key" + i, "val" + i);
        }

        // Assert
        Assert.assertEquals(10, attributes.size());
        for (int i = 0; i < 10; i++) {
            Assert.assertEquals("val" + i, attributes.get("key" + i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void indexOfKey_givenNullKey_shouldThrowException() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.indexOfKey(null);
    }

    @Test
    public void get_givenNonExistentKey_shouldReturnEmptyString() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("key1", "val1");

        // Act
        String value = attributes.get("nonExistent");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test
    public void get_givenCaseSensitiveMismatch_shouldReturnEmptyString() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("KeyOne", "val1");

        // Act
        String value = attributes.get("keyone");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test
    public void getIgnoreCase_givenDifferentCasing_shouldReturnValue() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("KeyOne", "val1");

        // Act
        String valExact = attributes.getIgnoreCase("KeyOne");
        String valLower = attributes.getIgnoreCase("keyone");
        String valUpper = attributes.getIgnoreCase("KEYONE");

        // Assert
        Assert.assertEquals("val1", valExact);
        Assert.assertEquals("val1", valLower);
        Assert.assertEquals("val1", valUpper);
    }

    @Test
    public void getIgnoreCase_givenNonExistentKey_shouldReturnEmptyString() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        String value = attributes.getIgnoreCase("missing");

        // Assert
        Assert.assertEquals("", value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIgnoreCase_givenNullKey_shouldThrowException() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.getIgnoreCase(null);
    }

    @Test
    public void putIgnoreCase_givenExistingKeyWithDifferentCase_shouldUpdateKeyAndValue() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("SRC", "img.jpg");

        // Act
        attributes.putIgnoreCase("src", "new_img.jpg");

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("new_img.jpg", attributes.get("src"));
        Assert.assertEquals("", attributes.get("SRC"));
        Assert.assertEquals("src", attributes.keys[0]);
    }

    @Test
    public void putIgnoreCase_givenExistingKeyWithSameCase_shouldUpdateValueOnly() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("src", "img.jpg");

        // Act
        attributes.putIgnoreCase("src", "new_img.jpg");

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("new_img.jpg", attributes.get("src"));
    }

    @Test
    public void putIgnoreCase_givenNewKey_shouldAppendKeyAndValue() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.putIgnoreCase("alt", "image text");

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("image text", attributes.get("alt"));
    }

    @Test
    public void put_givenBooleanAttributeTrue_shouldStoreWithNullValue() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.put("checked", true);

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertTrue(attributes.hasKey("checked"));
        Assert.assertEquals("", attributes.get("checked"));
        Assert.assertNull(attributes.vals[0]);
    }

    @Test
    public void put_givenBooleanAttributeFalseWhenKeyExists_shouldRemoveKey() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("disabled", "disabled");

        // Act
        attributes.put("disabled", false);

        // Assert
        Assert.assertEquals(0, attributes.size());
        Assert.assertFalse(attributes.hasKey("disabled"));
    }

    @Test
    public void put_givenBooleanAttributeFalseWhenKeyDoesNotExist_shouldDoNothing() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.put("selected", false);

        // Assert
        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void put_givenAttributeObject_shouldStoreAndSetParent() {
        // Arrange
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("href", "http://example.com");

        // Act
        Attributes returned = attributes.put(attribute);

        // Assert
        Assert.assertSame(attributes, returned);
        Assert.assertEquals("http://example.com", attributes.get("href"));
        Assert.assertSame(attributes, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void put_givenNullAttributeObject_shouldThrowException() {
        // Arrange
        Attributes attributes = new Attributes();

        // Act
        attributes.put((Attribute) null);
    }

    @Test
    public void remove_givenExistingKey_shouldRemoveAndShiftElements() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");
        attributes.put("k3", "v3");

        // Act - remove middle element
        attributes.remove("k2");

        // Assert
        Assert.assertEquals(2, attributes.size());
        Assert.assertTrue(attributes.hasKey("k1"));
        Assert.assertFalse(attributes.hasKey("k2"));
        Assert.assertTrue(attributes.hasKey("k3"));
        Assert.assertEquals("k1", attributes.keys[0]);
        Assert.assertEquals("k3", attributes.keys[1]);
        Assert.assertNull(attributes.keys[2]);
        Assert.assertNull(attributes.vals[2]);
    }

    @Test
    public void remove_givenLastElement_shouldRemoveWithoutArrayCopy() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        // Act
        attributes.remove("k2");

        // Assert
        Assert.assertEquals(1, attributes.size());
        Assert.assertTrue(attributes.hasKey("k1"));
        Assert.assertFalse(attributes.hasKey("k2"));
        Assert.assertNull(attributes.keys[1]);
        Assert.assertNull(attributes.vals[1]);
    }

    @Test
    public void remove_givenNonExistentKey_shouldDoNothing() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");

        // Act
        attributes.remove("nonExistent");

        // Assert
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void removeIgnoreCase_givenExistingKeyDifferentCase_shouldRemoveEntry() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("Title", "TestTitle");

        // Act
        attributes.removeIgnoreCase("title");

        // Assert
        Assert.assertEquals(0, attributes.size());
        Assert.assertFalse(attributes.hasKey("Title"));
    }

    @Test
    public void removeIgnoreCase_givenNonExistentKey_shouldDoNothing() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");

        // Act
        attributes.removeIgnoreCase("k2");

        // Assert
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void hasKey_givenKey_shouldReturnExpectedBoolean() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("class", "my-class");

        // Act & Assert
        Assert.assertTrue(attributes.hasKey("class"));
        Assert.assertFalse(attributes.hasKey("Class"));
        Assert.assertFalse(attributes.hasKey("id"));
    }

    @Test
    public void hasKeyIgnoreCase_givenKeyWithDifferentCases_shouldReturnExpectedBoolean() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("Data-Name", "value");

        // Act & Assert
        Assert.assertTrue(attributes.hasKeyIgnoreCase("data-name"));
        Assert.assertTrue(attributes.hasKeyIgnoreCase("DATA-NAME"));
        Assert.assertFalse(attributes.hasKeyIgnoreCase("data-other"));
    }

    @Test
    public void addAll_givenEmptyIncomingAttributes_shouldDoNothing() {
        // Arrange
        Attributes target = new Attributes();
        target.put("a", "1");
        Attributes empty = new Attributes();

        // Act
        target.addAll(empty);

        // Assert
        Assert.assertEquals(1, target.size());
    }

    @Test
    public void addAll_givenMultipleIncomingAttributes_shouldMergeAll() {
        // Arrange
        Attributes target = new Attributes();
        target.put("a", "1");

        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        incoming.put("c", "3");

        // Act
        target.addAll(incoming);

        // Assert
        Assert.assertEquals(3, target.size());
        Assert.assertEquals("1", target.get("a"));
        Assert.assertEquals("2", target.get("b"));
        Assert.assertEquals("3", target.get("c"));
    }

    @Test
    public void addAll_givenOverlappingIncomingAttributes_shouldOverwriteExistingKeys() {
        // Arrange
        Attributes target = new Attributes();
        target.put("a", "1");
        target.put("b", "original");

        Attributes incoming = new Attributes();
        incoming.put("b", "updated");
        incoming.put("c", "new");

        // Act
        target.addAll(incoming);

        // Assert
        Assert.assertEquals(3, target.size());
        Assert.assertEquals("updated", target.get("b"));
        Assert.assertEquals("new", target.get("c"));
    }

    @Test
    public void iterator_givenAttributes_shouldIterateAllElements() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        // Act
        Iterator<Attribute> iterator = attributes.iterator();

        // Assert
        Assert.assertTrue(iterator.hasNext());
        Attribute first = iterator.next();
        Assert.assertEquals("k1", first.getKey());
        Assert.assertEquals("v1", first.getValue());

        Assert.assertTrue(iterator.hasNext());
        Attribute second = iterator.next();
        Assert.assertEquals("k2", second.getKey());
        Assert.assertEquals("v2", second.getValue());

        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void iterator_removeMethod_shouldRemoveCurrentElementCorrectly() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");
        attributes.put("k3", "v3");

        // Act
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            Attribute attr = iterator.next();
            if ("k2".equals(attr.getKey())) {
                iterator.remove();
            }
        }

        // Assert
        Assert.assertEquals(2, attributes.size());
        Assert.assertTrue(attributes.hasKey("k1"));
        Assert.assertFalse(attributes.hasKey("k2"));
        Assert.assertTrue(attributes.hasKey("k3"));
    }

    @Test
    public void asList_givenStandardAndBooleanAttributes_shouldReturnExpectedAttributeList() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("class", "button");
        attributes.put("disabled", true);

        // Act
        List<Attribute> list = attributes.asList();

        // Assert
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("class", list.get(0).getKey());
        Assert.assertEquals("button", list.get(0).getValue());
        Assert.assertEquals("disabled", list.get(1).getKey());
        Assert.assertTrue(list.get(1) instanceof BooleanAttribute);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void asList_givenAttemptToModifyReturnedList_shouldThrowException() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        List<Attribute> list = attributes.asList();

        // Act
        list.add(new Attribute("k2", "v2"));
    }

    @Test
    public void dataset_givenCustomDataAttributes_shouldFilterAndExposeMapOperations() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("data-name", "John");
        attributes.put("data-age", "30");
        attributes.put("class", "profile");

        // Act
        Map<String, String> dataset = attributes.dataset();

        // Assert
        Assert.assertEquals(2, dataset.size());
        Assert.assertEquals("John", dataset.get("name"));
        Assert.assertEquals("30", dataset.get("age"));
        Assert.assertNull(dataset.get("class"));
    }

    @Test
    public void dataset_putMethod_shouldUpdateOrAddDataPrefixAttribute() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("data-id", "100");
        Map<String, String> dataset = attributes.dataset();

        // Act
        String oldId = dataset.put("id", "200");
        String oldRole = dataset.put("role", "admin");

        // Assert
        Assert.assertEquals("100", oldId);
        Assert.assertNull(oldRole);
        Assert.assertEquals("200", attributes.get("data-id"));
        Assert.assertEquals("admin", attributes.get("data-role"));
    }

    @Test
    public void dataset_iteratorAndRemove_shouldRemoveAttributeFromParent() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("data-first", "1");
        attributes.put("other", "val");
        attributes.put("data-second", "2");

        Map<String, String> dataset = attributes.dataset();
        Iterator<Map.Entry<String, String>> iterator = dataset.entrySet().iterator();

        // Act
        Assert.assertTrue(iterator.hasNext());
        Map.Entry<String, String> entry1 = iterator.next();
        Assert.assertEquals("first", entry1.getKey());
        Assert.assertEquals("1", entry1.getValue());
        iterator.remove();

        // Assert
        Assert.assertFalse(attributes.hasKey("data-first"));
        Assert.assertTrue(attributes.hasKey("other"));
        Assert.assertTrue(attributes.hasKey("data-second"));
        Assert.assertEquals(1, dataset.size());
    }

    @Test
    public void normalize_givenMixedCaseKeys_shouldLowercaseAllKeys() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("HeAdEr", "top");
        attributes.put("SRC", "logo.png");

        // Act
        attributes.normalize();

        // Assert
        Assert.assertEquals("top", attributes.get("header"));
        Assert.assertEquals("logo.png", attributes.get("src"));
        Assert.assertEquals("", attributes.get("HeAdEr"));
        Assert.assertEquals("", attributes.get("SRC"));
    }

    @Test
    public void html_givenStandardAttributes_shouldFormatHtmlString() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("id", "main");
        attributes.put("class", "container");

        // Act
        String html = attributes.html();

        // Assert
        Assert.assertEquals(" id=\"main\" class=\"container\"", html);
        Assert.assertEquals(html, attributes.toString());
    }

    @Test
    public void html_givenBooleanAttributes_shouldCollapseInHtmlSyntax() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("checked", true);
        attributes.put("required", "required");

        // Act
        String html = attributes.html();

        // Assert
        Assert.assertEquals(" checked required", html);
    }

    @Test
    public void html_givenXmlSyntax_shouldNotCollapseBooleanAttributes() throws IOException {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("checked", true);
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);

        // Act
        attributes.html(sb, settings);

        // Assert
        Assert.assertEquals(" checked=\"\"", sb.toString());
    }

    @Test
    public void html_givenEntitiesInValue_shouldEscapeProperly() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("data-text", "a < b & \"c\"");

        // Act
        String html = attributes.html();

        // Assert
        Assert.assertTrue(html.contains("&lt;"));
        Assert.assertTrue(html.contains("&amp;"));
        Assert.assertTrue(html.contains("&quot;"));
    }

    @Test(expected = SerializationException.class)
    public void html_givenAppendableThrowsIOException_shouldWrapInSerializationException() {
        // Arrange
        Attributes attributes = new Attributes();
        attributes.put("k", "v");
        Appendable failingAppendable = new Appendable() {
            public Appendable append(CharSequence csq) throws IOException {
                throw new IOException("Simulated IO failure");
            }

            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new IOException("Simulated IO failure");
            }

            public Appendable append(char c) throws IOException {
                throw new IOException("Simulated IO failure");
            }
        };

        // Act
        try {
            attributes.html(failingAppendable, new Document("").outputSettings());
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    @Test
    public void equalsAndHashCode_givenIdenticalAttributes_shouldBeEqualAndHaveSameHashCode() {
        // Arrange
        Attributes a1 = new Attributes();
        a1.put("k1", "v1");
        a1.put("k2", "v2");

        Attributes a2 = new Attributes();
        a2.put("k1", "v1");
        a2.put("k2", "v2");

        // Act & Assert
        Assert.assertTrue(a1.equals(a1));
        Assert.assertTrue(a1.equals(a2));
        Assert.assertTrue(a2.equals(a1));
        Assert.assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void equals_givenDifferentOrNullObjects_shouldReturnFalse() {
        // Arrange
        Attributes a1 = new Attributes();
        a1.put("k1", "v1");

        Attributes a2 = new Attributes();
        a2.put("k1", "different");

        Attributes a3 = new Attributes();
        a3.put("k2", "v1");

        Attributes a4 = new Attributes();
        a4.put("k1", "v1");
        a4.put("k2", "v2");

        // Act & Assert
        Assert.assertFalse(a1.equals(null));
        Assert.assertFalse(a1.equals("Some String"));
        Assert.assertFalse(a1.equals(a2)); // same size & key, different value
        Assert.assertFalse(a1.equals(a3)); // same size, different key
        Assert.assertFalse(a1.equals(a4)); // different size
    }

    @Test
    public void clone_givenAttributes_shouldProduceDeepIndependentCopy() {
        // Arrange
        Attributes original = new Attributes();
        original.put("k1", "v1");
        original.put("k2", "v2");

        // Act
        Attributes cloned = original.clone();
        cloned.put("k1", "modified");
        cloned.put("k3", "v3");

        // Assert
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(2, original.size());
        Assert.assertEquals("v1", original.get("k1"));
        Assert.assertFalse(original.hasKey("k3"));

        Assert.assertEquals(3, cloned.size());
        Assert.assertEquals("modified", cloned.get("k1"));
        Assert.assertTrue(cloned.hasKey("k3"));
    }

    @Test
    public void checkNotNull_givenNullOrNonNull_shouldReturnEmptyStringOrSameString() {
        // Act & Assert
        Assert.assertEquals("", Attributes.checkNotNull(null));
        Assert.assertEquals("value", Attributes.checkNotNull("value"));
        Assert.assertEquals("", Attributes.checkNotNull(""));
    }
}