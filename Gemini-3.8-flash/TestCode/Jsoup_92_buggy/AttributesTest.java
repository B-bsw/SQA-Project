package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AttributesTest {

    @Test
    public void get_givenExistingKey_shouldReturnValue() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");

        String result = attributes.get("href");

        Assert.assertEquals("http://example.com", result);
    }

    @Test
    public void get_givenMissingKey_shouldReturnEmptyString() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");

        String result = attributes.get("title");

        Assert.assertEquals("", result);
    }

    @Test
    public void get_givenBooleanAttributeWithNullValue_shouldReturnEmptyString() {
        Attributes attributes = new Attributes();
        attributes.put("disabled", true);

        String result = attributes.get("disabled");

        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenNullKey_shouldThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        attributes.get(null);
    }

    @Test
    public void getIgnoreCase_givenMatchingKeyDifferentCase_shouldReturnValue() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");

        String result = attributes.getIgnoreCase("HREF");

        Assert.assertEquals("http://example.com", result);
    }

    @Test
    public void getIgnoreCase_givenMissingKey_shouldReturnEmptyString() {
        Attributes attributes = new Attributes();

        String result = attributes.getIgnoreCase("missing");

        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIgnoreCase_givenNullKey_shouldThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase(null);
    }

    @Test
    public void put_givenNewKeyValue_shouldStoreAttribute() {
        Attributes attributes = new Attributes();

        attributes.put("class", "btn primary");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("btn primary", attributes.get("class"));
    }

    @Test
    public void put_givenExistingKey_shouldUpdateValue() {
        Attributes attributes = new Attributes();
        attributes.put("class", "btn");

        attributes.put("class", "btn primary");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("btn primary", attributes.get("class"));
    }

    @Test
    public void putIgnoreCase_givenExistingKeyDifferentCase_shouldUpdateKeyAndValue() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://old.com");

        attributes.putIgnoreCase("HREF", "http://new.com");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("http://new.com", attributes.get("HREF"));
        Assert.assertEquals("", attributes.get("href"));
        Assert.assertEquals("http://new.com", attributes.getIgnoreCase("href"));
    }

    @Test
    public void putIgnoreCase_givenExistingKeySameCase_shouldUpdateValueOnly() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://old.com");

        attributes.putIgnoreCase("href", "http://new.com");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("http://new.com", attributes.get("href"));
    }

    @Test
    public void putIgnoreCase_givenNewKey_shouldAddAttribute() {
        Attributes attributes = new Attributes();

        attributes.putIgnoreCase("target", "_blank");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("_blank", attributes.get("target"));
    }

    @Test
    public void put_givenBooleanTrue_shouldStoreNullValue() {
        Attributes attributes = new Attributes();

        attributes.put("checked", true);

        Assert.assertEquals(1, attributes.size());
        Assert.assertTrue(attributes.hasKey("checked"));
        Assert.assertEquals("", attributes.get("checked"));
    }

    @Test
    public void put_givenBooleanFalse_shouldRemoveAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("checked", true);

        attributes.put("checked", false);

        Assert.assertEquals(0, attributes.size());
        Assert.assertFalse(attributes.hasKey("checked"));
    }

    @Test
    public void put_givenAttributeObject_shouldSetParentAndStore() {
        Attributes attributes = new Attributes();
        Attribute attr = new Attribute("id", "main");

        attributes.put(attr);

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("main", attributes.get("id"));
        Assert.assertSame(attributes, attr.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void put_givenNullAttributeObject_shouldThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
    }

    @Test
    public void remove_givenExistingKeyAtBeginning_shouldRemoveAndShiftElements() {
        Attributes attributes = new Attributes();
        attributes.put("a", "1");
        attributes.put("b", "2");
        attributes.put("c", "3");

        attributes.remove("a");

        Assert.assertEquals(2, attributes.size());
        Assert.assertFalse(attributes.hasKey("a"));
        Assert.assertEquals("2", attributes.get("b"));
        Assert.assertEquals("3", attributes.get("c"));
    }

    @Test
    public void remove_givenExistingKeyInMiddle_shouldRemoveAndShiftElements() {
        Attributes attributes = new Attributes();
        attributes.put("a", "1");
        attributes.put("b", "2");
        attributes.put("c", "3");

        attributes.remove("b");

        Assert.assertEquals(2, attributes.size());
        Assert.assertEquals("1", attributes.get("a"));
        Assert.assertFalse(attributes.hasKey("b"));
        Assert.assertEquals("3", attributes.get("c"));
    }

    @Test
    public void remove_givenExistingKeyAtEnd_shouldRemoveWithoutShift() {
        Attributes attributes = new Attributes();
        attributes.put("a", "1");
        attributes.put("b", "2");
        attributes.put("c", "3");

        attributes.remove("c");

        Assert.assertEquals(2, attributes.size());
        Assert.assertEquals("1", attributes.get("a"));
        Assert.assertEquals("2", attributes.get("b"));
        Assert.assertFalse(attributes.hasKey("c"));
    }

    @Test
    public void remove_givenMissingKey_shouldDoNothing() {
        Attributes attributes = new Attributes();
        attributes.put("a", "1");

        attributes.remove("nonexistent");

        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("1", attributes.get("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void remove_givenNullKey_shouldThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        attributes.remove((String) null);
    }

    @Test
    public void removeIgnoreCase_givenExistingKeyDifferentCase_shouldRemove() {
        Attributes attributes = new Attributes();
        attributes.put("class", "menu");

        attributes.removeIgnoreCase("CLASS");

        Assert.assertEquals(0, attributes.size());
        Assert.assertFalse(attributes.hasKey("class"));
    }

    @Test
    public void removeIgnoreCase_givenMissingKey_shouldDoNothing() {
        Attributes attributes = new Attributes();
        attributes.put("class", "menu");

        attributes.removeIgnoreCase("id");

        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void hasKey_givenExistingKey_shouldReturnTrue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "val");

        Assert.assertTrue(attributes.hasKey("key"));
        Assert.assertFalse(attributes.hasKey("KEY"));
    }

    @Test
    public void hasKey_givenMissingKey_shouldReturnFalse() {
        Attributes attributes = new Attributes();

        Assert.assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void hasKeyIgnoreCase_givenMatchingKeyDifferentCase_shouldReturnTrue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "val");

        Assert.assertTrue(attributes.hasKeyIgnoreCase("KEY"));
        Assert.assertTrue(attributes.hasKeyIgnoreCase("Key"));
    }

    @Test
    public void hasKeyIgnoreCase_givenMissingKey_shouldReturnFalse() {
        Attributes attributes = new Attributes();

        Assert.assertFalse(attributes.hasKeyIgnoreCase("key"));
    }

    @Test
    public void size_givenNoAttributes_shouldReturnZero() {
        Attributes attributes = new Attributes();

        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void size_givenMultipleAttributes_shouldReturnCount() {
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");
        attributes.put("k3", "v3");

        Assert.assertEquals(3, attributes.size());
    }

    @Test
    public void addAll_givenEmptyIncoming_shouldNotAlterCurrentAttributes() {
        Attributes target = new Attributes();
        target.put("k1", "v1");
        Attributes incoming = new Attributes();

        target.addAll(incoming);

        Assert.assertEquals(1, target.size());
        Assert.assertEquals("v1", target.get("k1"));
    }

    @Test
    public void addAll_givenNonEmptyIncoming_shouldAppendAndExpandCapacity() {
        Attributes target = new Attributes();
        target.put("a", "1");
        target.put("b", "2");

        Attributes incoming = new Attributes();
        incoming.put("c", "3");
        incoming.put("d", "4");
        incoming.put("e", "5");

        target.addAll(incoming);

        Assert.assertEquals(5, target.size());
        Assert.assertEquals("1", target.get("a"));
        Assert.assertEquals("2", target.get("b"));
        Assert.assertEquals("3", target.get("c"));
        Assert.assertEquals("4", target.get("d"));
        Assert.assertEquals("5", target.get("e"));
    }

    @Test
    public void addAll_givenOverlappingKeys_shouldUpdateValues() {
        Attributes target = new Attributes();
        target.put("a", "1");

        Attributes incoming = new Attributes();
        incoming.put("a", "new1");
        incoming.put("b", "2");

        target.addAll(incoming);

        Assert.assertEquals(2, target.size());
        Assert.assertEquals("new1", target.get("a"));
        Assert.assertEquals("2", target.get("b"));
    }

    @Test
    public void iterator_givenAttributes_shouldTraverseInOrder() {
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");

        Iterator<Attribute> it = attributes.iterator();

        Assert.assertTrue(it.hasNext());
        Attribute first = it.next();
        Assert.assertEquals("k1", first.getKey());
        Assert.assertEquals("v1", first.getValue());

        Assert.assertTrue(it.hasNext());
        Attribute second = it.next();
        Assert.assertEquals("k2", second.getKey());
        Assert.assertEquals("v2", second.getValue());

        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void iterator_givenRemoveCall_shouldRemoveCurrentElement() {
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", "v2");
        attributes.put("k3", "v3");

        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            Attribute attr = it.next();
            if ("k2".equals(attr.getKey())) {
                it.remove();
            }
        }

        Assert.assertEquals(2, attributes.size());
        Assert.assertEquals("v1", attributes.get("k1"));
        Assert.assertFalse(attributes.hasKey("k2"));
        Assert.assertEquals("v3", attributes.get("k3"));
    }

    @Test
    public void asList_givenStandardAndBooleanAttributes_shouldReturnList() {
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");
        attributes.put("k2", true);

        List<Attribute> list = attributes.asList();

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("k1", list.get(0).getKey());
        Assert.assertEquals("v1", list.get(0).getValue());
        Assert.assertEquals("k2", list.get(1).getKey());
        Assert.assertTrue(list.get(1) instanceof BooleanAttribute);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void asList_givenModificationAttempt_shouldThrowUnsupportedOperationException() {
        Attributes attributes = new Attributes();
        attributes.put("k1", "v1");

        List<Attribute> list = attributes.asList();
        list.add(new Attribute("k2", "v2"));
    }

    @Test
    public void dataset_givenDataAndNonDataAttributes_shouldFilterAndProvideMap() {
        Attributes attributes = new Attributes();
        attributes.put("data-id", "123");
        attributes.put("data-name", "test");
        attributes.put("class", "widget");

        Map<String, String> dataset = attributes.dataset();

        Assert.assertEquals(2, dataset.size());
        Assert.assertEquals("123", dataset.get("id"));
        Assert.assertEquals("test", dataset.get("name"));
        Assert.assertNull(dataset.get("class"));
    }

    @Test
    public void dataset_givenPutOperation_shouldUpdateUnderlyingAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("data-counter", "10");

        Map<String, String> dataset = attributes.dataset();
        String oldVal = dataset.put("counter", "20");
        String newVal = dataset.put("user", "alice");

        Assert.assertEquals("10", oldVal);
        Assert.assertNull(newVal);
        Assert.assertEquals("20", attributes.get("data-counter"));
        Assert.assertEquals("alice", attributes.get("data-user"));
    }

    @Test
    public void dataset_givenIteratorRemove_shouldRemoveAttributeFromAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("data-id", "100");
        attributes.put("title", "tooltip");
        attributes.put("data-code", "abc");

        Map<String, String> dataset = attributes.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if ("id".equals(entry.getKey())) {
                it.remove();
            }
        }

        Assert.assertEquals(1, dataset.size());
        Assert.assertFalse(attributes.hasKey("data-id"));
        Assert.assertTrue(attributes.hasKey("title"));
        Assert.assertTrue(attributes.hasKey("data-code"));
    }

    @Test
    public void dataset_givenEmptyAttributes_shouldHaveZeroSize() {
        Attributes attributes = new Attributes();
        Map<String, String> dataset = attributes.dataset();

        Assert.assertEquals(0, dataset.size());
        Assert.assertFalse(dataset.entrySet().iterator().hasNext());
    }

    @Test
    public void html_givenStandardAttributes_shouldFormatProperly() {
        Attributes attributes = new Attributes();
        attributes.put("class", "container");
        attributes.put("id", "main");

        String html = attributes.html();

        Assert.assertEquals(" class=\"container\" id=\"main\"", html);
        Assert.assertEquals(html, attributes.toString());
    }

    @Test
    public void html_givenBooleanAttributes_shouldFormatWithoutValueWhenCollapsed() {
        Attributes attributes = new Attributes();
        attributes.put("checked", true);

        String html = attributes.html();

        Assert.assertEquals(" checked", html);
    }

    @Test
    public void html_givenEmptyAttributes_shouldProduceEmptyString() {
        Attributes attributes = new Attributes();

        String html = attributes.html();

        Assert.assertEquals("", html);
    }

    @Test
    public void html_givenAppendable_shouldAppendDirectly() throws IOException {
        Attributes attributes = new Attributes();
        attributes.put("title", "Quotes & \"Marks\"");

        StringBuilder sb = new StringBuilder();
        attributes.html(sb, (new Document("")).outputSettings());

        Assert.assertEquals(" title=\"Quotes &amp; &quot;Marks&quot;\"", sb.toString());
    }

    @Test
    public void normalize_givenMixedCaseKeys_shouldLowercaseAll() {
        Attributes attributes = new Attributes();
        attributes.put("Class", "test");
        attributes.put("DATA-ID", "99");

        attributes.normalize();

        Assert.assertTrue(attributes.hasKey("class"));
        Assert.assertFalse(attributes.hasKey("Class"));
        Assert.assertTrue(attributes.hasKey("data-id"));
        Assert.assertFalse(attributes.hasKey("DATA-ID"));
    }

    @Test
    public void equalsAndHashCode_givenIdenticalAttributes_shouldBeEqualAndHaveSameHashCode() {
        Attributes attr1 = new Attributes();
        attr1.put("k1", "v1");
        attr1.put("k2", "v2");

        Attributes attr2 = new Attributes();
        attr2.put("k1", "v1");
        attr2.put("k2", "v2");

        Assert.assertTrue(attr1.equals(attr2));
        Assert.assertTrue(attr2.equals(attr1));
        Assert.assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        Attributes attributes = new Attributes();
        attributes.put("k", "v");

        Assert.assertTrue(attributes.equals(attributes));
    }

    @Test
    public void equals_givenNullOrDifferentClass_shouldReturnFalse() {
        Attributes attributes = new Attributes();
        attributes.put("k", "v");

        Assert.assertFalse(attributes.equals(null));
        Assert.assertFalse(attributes.equals("some string"));
    }

    @Test
    public void equals_givenDifferentSizes_shouldReturnFalse() {
        Attributes attr1 = new Attributes();
        attr1.put("k1", "v1");

        Attributes attr2 = new Attributes();
        attr2.put("k1", "v1");
        attr2.put("k2", "v2");

        Assert.assertFalse(attr1.equals(attr2));
    }

    @Test
    public void equals_givenDifferentKeys_shouldReturnFalse() {
        Attributes attr1 = new Attributes();
        attr1.put("key1", "val");

        Attributes attr2 = new Attributes();
        attr2.put("key2", "val");

        Assert.assertFalse(attr1.equals(attr2));
    }

    @Test
    public void equals_givenDifferentValues_shouldReturnFalse() {
        Attributes attr1 = new Attributes();
        attr1.put("key", "val1");

        Attributes attr2 = new Attributes();
        attr2.put("key", "val2");

        Assert.assertFalse(attr1.equals(attr2));
    }

    @Test
    public void clone_givenAttributes_shouldCreateDeepCopy() {
        Attributes original = new Attributes();
        original.put("k1", "v1");
        original.put("k2", "v2");

        Attributes clone = original.clone();

        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original, clone);
        Assert.assertEquals(original.hashCode(), clone.hashCode());

        clone.put("k1", "mutated");
        Assert.assertEquals("v1", original.get("k1"));
        Assert.assertEquals("mutated", clone.get("k1"));
    }

    @Test
    public void checkNotNull_givenNull_shouldReturnEmptyString() {
        Assert.assertEquals("", Attributes.checkNotNull(null));
    }

    @Test
    public void checkNotNull_givenNonNull_shouldReturnOriginalString() {
        Assert.assertEquals("text", Attributes.checkNotNull("text"));
    }

    @Test
    public void checkCapacity_givenMoreThanInitialCapacity_shouldGrowArrays() {
        Attributes attributes = new Attributes();
        for (int i = 0; i < 10; i++) {
            attributes.put("key" + i, "val" + i);
        }

        Assert.assertEquals(10, attributes.size());
        for (int i = 0; i < 10; i++) {
            Assert.assertEquals("val" + i, attributes.get("key" + i));
        }
    }
}