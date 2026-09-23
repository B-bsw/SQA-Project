package org.jsoup.nodes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AttributeTest {
    private Attributes parent;
    private Attribute attr;
    private Attribute attrWithParent;

    @Before
    public void setUp() {
        parent = new Attributes();
        parent.put("key1", "value1");
        parent.put("key2", "value2");
        attr = new Attribute("key1", "value1");
        attrWithParent = new Attribute("key2", "value2", parent);
    }

    @After
    public void tearDown() {
        // no resources to clean up
    }

    // Constructor tests
    @Test(expected = IllegalArgumentException.class)
    public void constructorNullKey() {
        new Attribute(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorEmptyKeyAfterTrim() {
        new Attribute("  ", "val");
    }

    @Test
    public void constructorValid() {
        Attribute a = new Attribute("myKey", "myVal");
        assertEquals("myKey", a.getKey());
        assertEquals("myVal", a.getValue());
    }

    @Test
    public void constructorWithParent() {
        Attributes p = new Attributes();
        Attribute a = new Attribute("pk", "pv", p);
        assertEquals("pk", a.getKey());
        assertEquals("pv", a.getValue());
        assertNotNull(a.parent);
    }

    // getKey, getValue
    @Test
    public void getKeyReturnsCorrect() {
        assertEquals("key1", attr.getKey());
    }

    @Test
    public void getValueReturnsCorrect() {
        assertEquals("value1", attr.getValue());
    }

    // setKey
    @Test(expected = IllegalArgumentException.class)
    public void setKeyNull() {
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setKeyEmptyAfterTrim() {
        attr.setKey("  ");
    }

    @Test
    public void setKeyWithoutParent() {
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void setKeyWithParentUpdatesParent() {
        attrWithParent.setKey("newKey2");
        assertEquals("newKey2", attrWithParent.getKey());
        assertEquals("value2", parent.get("newKey2"));
        assertNull(parent.get("key2"));
    }

    // setValue
    @Test(expected = NullPointerException.class)
    public void setValueThrowsNPEWhenParentNull() {
        Attribute noParent = new Attribute("k", "v");
        noParent.setValue("new");
    }

    @Test
    public void setValueWithParentUpdatesParentAndReturnsOld() {
        String old = attrWithParent.setValue("newVal");
        assertEquals("value2", old);
        assertEquals("newVal", attrWithParent.getValue());
        assertEquals("newVal", parent.get("key2"));
    }

    @Test
    public void setValueWithParentNull() {
        String old = attrWithParent.setValue(null);
        assertEquals("value2", old);
        assertNull(attrWithParent.getValue());
        assertNull(parent.get("key2"));
    }

    // html / toString
    @Test
    public void htmlNormalAttribute() {
        Attribute a = new Attribute("href", "http://example.com");
        String html = a.html();
        assertTrue(html.contains("href=\"http://example.com\""));
    }

    @Test
    public void htmlBooleanAttributeCollapsedNull() {
        Attribute a = new Attribute("disabled", null);
        assertEquals("disabled", a.html());
    }

    @Test
    public void htmlBooleanAttributeCollapsedEmpty() {
        Attribute a = new Attribute("disabled", "");
        assertEquals("disabled", a.html());
    }

    @Test
    public void htmlBooleanAttributeCollapsedEqual() {
        Attribute a = new Attribute("checked", "checked");
        assertEquals("checked", a.html());
    }

    @Test
    public void htmlNonBooleanAttributeWithNull() {
        Attribute a = new Attribute("class", null);
        assertTrue(a.html().contains("class=\"\""));
    }

    @Test
    public void toStringMatchesHtml() {
        assertEquals(attr.html(), attr.toString());
    }

    // createFromEncoded
    @Test
    public void createFromEncodedUnescapes() {
        Attribute a = Attribute.createFromEncoded("key", "value&amp;");
        assertEquals("key", a.getKey());
        assertEquals("value&", a.getValue());
    }

    // isDataAttribute
    @Test
    public void isDataAttributeTrue() {
        Attribute a = new Attribute("data-test", "val");
        assertTrue(a.isDataAttribute());
    }

    @Test
    public void isDataAttributeFalse() {
        Attribute a = new Attribute("notdata", "val");
        assertFalse(a.isDataAttribute());
    }

    @Test
    public void isDataAttributePrefixOnly() {
        Attribute a = new Attribute("data-", "val");
        assertFalse(a.isDataAttribute());
    }

    // shouldCollapseAttribute (static)
    @Test
    public void shouldCollapseForBooleanWithNull() {
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.shouldCollapseAttribute("disabled", null, out));
    }

    @Test
    public void shouldCollapseForBooleanWithEmpty() {
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.shouldCollapseAttribute("disabled", "", out));
    }

    @Test
    public void shouldCollapseForBooleanWithEqual() {
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.shouldCollapseAttribute("disabled", "disabled", out));
    }

    @Test
    public void shouldNotCollapseForNonBoolean() {
        Document.OutputSettings out = new Document("").outputSettings();
        assertFalse(Attribute.shouldCollapseAttribute("class", null, out));
    }

    @Test
    public void shouldNotCollapseForXhtmlSyntax() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("disabled", null, out));
    }

    // isBooleanAttribute (static)
    @Test
    public void isBooleanAttributeKnown() {
        assertTrue(Attribute.isBooleanAttribute("disabled"));
    }

    @Test
    public void isBooleanAttributeUnknown() {
        assertFalse(Attribute.isBooleanAttribute("class"));
    }

    // isBooleanAttribute (instance, deprecated)
    @Test
    public void isBooleanAttributeInstanceTrueWhenNullVal() {
        Attribute a = new Attribute("disabled", null);
        assertTrue(a.isBooleanAttribute());
    }

    @Test
    public void isBooleanAttributeInstanceFalseForNonBoolean() {
        Attribute b = new Attribute("custom", "val");
        assertFalse(b.isBooleanAttribute());
    }

    // equals and hashCode
    @Test
    public void equalsSameObject() {
        assertTrue(attr.equals(attr));
    }

    @Test
    public void equalsEqualAttributes() {
        Attribute other = new Attribute("key1", "value1");
        assertTrue(attr.equals(other));
        assertEquals(attr.hashCode(), other.hashCode());
    }

    @Test
    public void equalsDifferentKey() {
        Attribute other = new Attribute("key2", "value1");
        assertFalse(attr.equals(other));
    }

    @Test
    public void equalsDifferentValue() {
        Attribute other = new Attribute("key1", "otherVal");
        assertFalse(attr.equals(other));
    }

    @Test
    public void equalsNull() {
        assertFalse(attr.equals(null));
    }

    @Test
    public void equalsDifferentType() {
        assertFalse(attr.equals("string"));
    }

    // clone
    @Test
    public void cloneReturnsDifferentObjectButEqual() {
        Attribute clone = attr.clone();
        assertNotSame(attr, clone);
        assertEquals(attr, clone);
        assertEquals(attr.hashCode(), clone.hashCode());
    }
}