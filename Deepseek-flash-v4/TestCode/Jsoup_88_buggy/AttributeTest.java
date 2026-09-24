package org.jsoup.nodes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AttributeTest {
    private Attribute attr;

    @Before
    public void setUp() {
        attr = new Attribute("key", "value");
    }

    @After
    public void tearDown() {
        attr = null;
    }

    @Test
    public void testConstructorTrimsAndStoresKeyValue() {
        Attribute a = new Attribute("  data-id  ", "value");
        assertEquals("data-id", a.getKey());
        assertEquals("value", a.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullKey() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsBlankKey() {
        new Attribute("   ", "value");
    }

    @Test
    public void testSetKeyUpdatesKey() {
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKeyTrims() {
        attr.setKey("  trimmed  ");
        assertEquals("trimmed", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyRejectsNull() {
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyRejectsBlank() {
        attr.setKey("   ");
    }

    @Test
    public void testSetKeyWithParentUpdatesParentKey() {
        Attributes parent = new Attributes();
        parent.put("oldKey", "value");
        Attribute a = new Attribute("oldKey", "value", parent);
        a.setKey("newKey");
        assertEquals("newKey", a.getKey());
        assertEquals("newKey", parent.keys[0]);
    }

    @Test
    public void testSetValueWithParentReturnsOldAndUpdates() {
        Attributes parent = new Attributes();
        parent.put("key", "oldValue");
        Attribute a = new Attribute("key", "ignored", parent);
        String old = a.setValue("newValue");
        assertEquals("oldValue", old);
        assertEquals("newValue", a.getValue());
        assertEquals("newValue", parent.get("key"));
    }

    @Test
    public void testSetValueWithParentWithoutExistingKeyStillUpdates() {
        Attributes parent = new Attributes();
        Attribute a = new Attribute("key", "oldValue", parent);
        a.setValue("newValue");
        assertEquals("newValue", a.getValue());
    }

    @Test
    public void testHtmlForNonBooleanAttributes() {
        assertEquals("key=\"value\"", new Attribute("key", "value").html());
        assertEquals("key=\"\"", new Attribute("key", "").html());
    }

    @Test
    public void testHtmlCollapsesBooleanAttributeWhenValueMatches() {
        assertEquals("hidden", new Attribute("hidden", "").html());
        assertEquals("hidden", new Attribute("hidden", "hidden").html());
    }

    @Test
    public void testHtmlDoesNotCollapseBooleanAttributeForOtherValue() {
        assertEquals("hidden=\"true\"", new Attribute("hidden", "true").html());
    }

    @Test
    public void testToStringDelegatesToHtml() {
        assertEquals(attr.html(), attr.toString());
    }

    @Test
    public void testCreateFromEncodedUnescapesValue() {
        Attribute a = Attribute.createFromEncoded("href", "&amp;");
        assertEquals("href", a.getKey());
        assertEquals("&", a.getValue());
        assertEquals("href=\"&amp;\"", a.html());
    }

    @Test
    public void testEqualsAndHashCode() {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        assertTrue(a1.equals(a2));
        assertEquals(a1.hashCode(), a2.hashCode());
        assertFalse(a1.equals(new Attribute("key", "other")));
        assertFalse(a1.equals(new Attribute("other", "value")));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("key"));
    }

    @Test
    public void testEqualsAndHashCodeWithNullValues() {
        Attribute n1 = new Attribute("key", null);
        Attribute n2 = new Attribute("key", null);
        assertTrue(n1.equals(n2));
        assertEquals(n1.hashCode(), n2.hashCode());
        assertFalse(n1.equals(new Attribute("key", "")));
    }

    @Test
    public void testCloneReturnsIndependentCopy() {
        Attribute copy = attr.clone();
        assertFalse(attr == copy);
        assertEquals(attr, copy);
        copy.setKey("other");
        assertEquals("key", attr.getKey());
    }

    @Test
    public void testIsBooleanAttribute() {
        assertTrue(Attribute.isBooleanAttribute("hidden"));
        assertFalse(Attribute.isBooleanAttribute("key"));
    }

    @Test
    public void testIsDataAttribute() {
        assertTrue(Attribute.isDataAttribute("data-test"));
        assertFalse(Attribute.isDataAttribute("dataset"));
    }
}