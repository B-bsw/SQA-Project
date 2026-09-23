package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class AttributeTest {

    @Test
    public void constructorTrimsKeyAndKeepsValue() {
        Attribute attr = new Attribute("  key  ", "  value  ");
        assertEquals("key", attr.getKey());
        assertEquals("  value  ", attr.getValue());
    }

    @Test
    public void constructorRejectsNullKey() {
        try {
            new Attribute(null, "value");
            fail();
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void constructorRejectsBlankKey() {
        try {
            new Attribute("   ", "value");
            fail();
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void getValueWhenValueIsNull() {
        assertEquals("", new Attribute("key", null).getValue());
    }

    @Test
    public void setKeyChangesKeyAndTrims() {
        Attribute attr = new Attribute("a", "v");
        attr.setKey("  b  ");
        assertEquals("b", attr.getKey());
    }

    @Test
    public void setKeyRejectsNullOrBlankKey() {
        Attribute attr = new Attribute("a", "v");
        try {
            attr.setKey(null);
            fail();
        } catch (NullPointerException expected) {
        }
        try {
            attr.setKey("   ");
            fail();
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void setKeyUpdatesParentAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("a", "old");
        Attribute attr = new Attribute("a", "old", attrs);

        attr.setKey("b");

        assertEquals("b", attr.getKey());
        assertEquals("old", attrs.get("b"));
        assertEquals("", attrs.get("a"));
    }

    @Test
    public void setKeyWithParentNotContainingKeyOnlyChangesAttribute() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("a", "v", parent);

        attr.setKey("b");

        assertEquals("b", attr.getKey());
        assertEquals("", parent.get("b"));
    }

    @Test
    public void setValueReturnsOldAndUpdatesParent() {
        Attributes attrs = new Attributes();
        attrs.put("a", "old");
        Attribute attr = new Attribute("a", "old", attrs);

        assertEquals("old", attr.setValue("new"));
        assertEquals("new", attrs.get("a"));
        assertEquals("new", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void setValueWithoutParentThrowsNpe() {
        new Attribute("a", "v").setValue("new");
    }

    @Test
    public void htmlRendersKeyValue() {
        assertEquals("key=\"value\"", new Attribute("key", "value").html());
    }

    @Test
    public void htmlEscapesAttributeValue() {
        assertEquals("title=\"a &amp; b\"", new Attribute("title", "a & b").html());
    }

    @Test
    public void htmlCollapsesBooleanAttributeWhenValueMatchesKey() {
        assertEquals("checked", new Attribute("checked", "checked").html());
    }

    @Test
    public void htmlCollapsesBooleanAttributeWhenValueEmpty() {
        assertEquals("checked", new Attribute("checked", "").html());
    }

    @Test
    public void htmlDoesNotCollapseBooleanAttributeWithNonMatchingValue() {
        assertEquals("checked=\"false\"", new Attribute("checked", "false").html());
    }

    @Test
    public void htmlWithNullValueCollapses() {
        assertEquals("key", new Attribute("key", null).html());
    }

    @Test
    public void shouldCollapseRequiresHtmlSyntax() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("checked", "checked", out));
    }

    @Test
    public void createFromEncodedUnescapesValue() {
        Attribute attr = Attribute.createFromEncoded("href", "a=1&amp;b=2");
        assertEquals("href", attr.getKey());
        assertEquals("a=1&b=2", attr.getValue());
    }

    @Test
    public void isDataAttributeChecksPrefix() {
        assertTrue(Attribute.isDataAttribute("data-x"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("x"));
    }

    @Test
    public void isBooleanAttributeChecksKnownList() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("disabled"));
        assertFalse(Attribute.isBooleanAttribute("key"));
    }

    @Test
    public void instanceBooleanAttributeTreatsNullAsTrue() {
        assertTrue(new Attribute("custom", null).isBooleanAttribute());
        assertTrue(new Attribute("checked", "checked").isBooleanAttribute());
    }

    @Test
    public void equalsAndHashCode() {
        Attribute a = new Attribute("k", "v");
        Attribute b = new Attribute("k", "v");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());

        assertFalse(a.equals(new Attribute("k", "v2")));
        assertFalse(a.equals(null));
        assertFalse(a.equals("k"));

        Attribute n1 = new Attribute("k", null);
        Attribute n2 = new Attribute("k", null);
        assertEquals(n1, n2);
    }

    @Test
    public void cloneReturnsEqualCopy() {
        Attribute a = new Attribute("k", "v");
        Attribute copy = a.clone();
        assertNotSame(a, copy);
        assertEquals(a, copy);
        assertEquals("k", copy.getKey());
        assertEquals("v", copy.getValue());
    }

    @Test
    public void toStringReturnsHtml() {
        Attribute attr = new Attribute("k", "v");
        assertEquals(attr.html(), attr.toString());
    }
}