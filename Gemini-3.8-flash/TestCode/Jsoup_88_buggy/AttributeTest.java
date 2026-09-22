package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class AttributeTest {

    @Test
    public void constructor_givenValidKeyAndValue_shouldInitializeProperly() {
        // Arrange & Act
        Attribute attr = new Attribute("href", "http://example.com");

        // Assert
        Assert.assertEquals("href", attr.getKey());
        Assert.assertEquals("http://example.com", attr.getValue());
    }

    @Test
    public void constructor_givenKeyWithLeadingAndTrailingWhitespace_shouldTrimKey() {
        // Arrange & Act
        Attribute attr = new Attribute("   class   ", "active");

        // Assert
        Assert.assertEquals("class", attr.getKey());
        Assert.assertEquals("active", attr.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullKey_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEmptyKey_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenWhitespaceOnlyKey_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new Attribute("    ", "value");
    }

    @Test
    public void setKey_givenValidNewKey_shouldUpdateKey() {
        // Arrange
        Attribute attr = new Attribute("oldKey", "val");

        // Act
        attr.setKey("newKey");

        // Assert
        Assert.assertEquals("newKey", attr.getKey());
    }

    @Test
    public void setKey_withParentAttributes_shouldUpdateParentKey() {
        // Arrange
        Attributes parent = new Attributes();
        parent.put("title", "originalTitle");
        Attribute attr = new Attribute("title", "originalTitle", parent);

        // Act
        attr.setKey("heading");

        // Assert
        Assert.assertEquals("heading", attr.getKey());
        Assert.assertTrue(parent.hasKey("heading"));
        Assert.assertFalse(parent.hasKey("title"));
    }

    @Test
    public void setValue_withParentAttributes_shouldUpdateParentValueAndReturnOldValue() {
        // Arrange
        Attributes parent = new Attributes();
        parent.put("k", "v1");
        Attribute attr = new Attribute("k", "v1", parent);

        // Act
        String oldVal = attr.setValue("v2");

        // Assert
        Assert.assertEquals("v1", oldVal);
        Assert.assertEquals("v2", attr.getValue());
        Assert.assertEquals("v2", parent.get("k"));
    }

    @Test
    public void html_givenStandardAttribute_shouldFormatAttributeHtml() {
        // Arrange
        Attribute attr = new Attribute("title", "hello & world");

        // Act
        String html = attr.html();

        // Assert
        Assert.assertEquals("title=\"hello &amp; world\"", html);
        Assert.assertEquals(html, attr.toString());
    }

    @Test
    public void html_givenBooleanAttribute_shouldCollapseWhenTrue() {
        // Arrange
        Attribute attr = new Attribute("disabled", "");

        // Act
        String html = attr.html();

        // Assert
        Assert.assertEquals("disabled", html);
    }

    @Test
    public void createFromEncoded_givenEncodedEntities_shouldUnescapeValue() {
        // Arrange & Act
        Attribute attr = Attribute.createFromEncoded("title", "&quot;Hello&quot;");

        // Assert
        Assert.assertEquals("title", attr.getKey());
        Assert.assertEquals("\"Hello\"", attr.getValue());
    }

    @Test
    public void isDataAttribute_givenDataPrefix_shouldReturnTrue() {
        // Arrange
        Attribute attr = new Attribute("data-user-id", "123");

        // Act & Assert
        Assert.assertTrue(attr.isDataAttribute());
        Assert.assertTrue(Attribute.isDataAttribute("data-test"));
    }

    @Test
    public void isDataAttribute_givenStandardAttribute_shouldReturnFalse() {
        // Arrange
        Attribute attr = new Attribute("data", "val");

        // Act & Assert
        Assert.assertFalse(attr.isDataAttribute());
        Assert.assertFalse(Attribute.isDataAttribute("class"));
    }

    @Test
    public void isBooleanAttribute_givenStandardBooleanAttribute_shouldReturnTrue() {
        // Arrange
        Attribute attr = new Attribute("required", "required");

        // Act & Assert
        Assert.assertTrue(Attribute.isBooleanAttribute("required"));
        Assert.assertTrue(Attribute.isBooleanAttribute("checked"));
        Assert.assertFalse(Attribute.isBooleanAttribute("href"));
    }

    @Test
    public void equalsAndHashCode_givenIdenticalAndDifferentAttributes_shouldAdhereToContract() {
        // Arrange
        Attribute a1 = new Attribute("k", "v");
        Attribute a2 = new Attribute("k", "v");
        Attribute a3 = new Attribute("k", "other");
        Attribute a4 = new Attribute("different", "v");

        // Act & Assert
        Assert.assertEquals(a1, a2);
        Assert.assertEquals(a1.hashCode(), a2.hashCode());
        Assert.assertFalse(a1.equals(a3));
        Assert.assertFalse(a1.equals(a4));
        Assert.assertFalse(a1.equals(null));
        Assert.assertFalse(a1.equals("string"));
    }

    @Test
    public void clone_shouldCreateIndependentCopy() {
        // Arrange
        Attribute original = new Attribute("key", "val");

        // Act
        Attribute copy = original.clone();

        // Assert
        Assert.assertNotSame(original, copy);
        Assert.assertEquals(original, copy);
        Assert.assertEquals(original.getKey(), copy.getKey());
        Assert.assertEquals(original.getValue(), copy.getValue());
    }
}
