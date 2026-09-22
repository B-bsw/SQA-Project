package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TagTest {

    @Test
    public void valueOf_givenStandardBlockTag_shouldReturnKnownBlockTag() {
        // Arrange & Act
        Tag tag = Tag.valueOf("div");

        // Assert
        Assert.assertEquals("div", tag.getName());
        Assert.assertTrue(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
        Assert.assertTrue(tag.canContainBlock());
        Assert.assertTrue(tag.canContainInline());
        Assert.assertFalse(tag.isInline());
        Assert.assertFalse(tag.isEmpty());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertFalse(tag.preserveWhitespace());
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOf_givenStandardInlineTag_shouldReturnKnownInlineTag() {
        // Arrange & Act
        Tag tag = Tag.valueOf("span");

        // Assert
        Assert.assertEquals("span", tag.getName());
        Assert.assertFalse(tag.isBlock());
        Assert.assertFalse(tag.formatAsBlock());
        Assert.assertFalse(tag.canContainBlock());
        Assert.assertTrue(tag.canContainInline());
        Assert.assertTrue(tag.isInline());
        Assert.assertFalse(tag.isEmpty());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertFalse(tag.preserveWhitespace());
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOf_givenEmptyTag_shouldBeEmptyAndSelfClosing() {
        // Arrange & Act
        Tag tag = Tag.valueOf("img");

        // Assert
        Assert.assertEquals("img", tag.getName());
        Assert.assertFalse(tag.isBlock());
        Assert.assertFalse(tag.formatAsBlock());
        Assert.assertFalse(tag.canContainBlock());
        Assert.assertFalse(tag.canContainInline());
        Assert.assertTrue(tag.isEmpty());
        Assert.assertTrue(tag.isSelfClosing());
        Assert.assertFalse(tag.isData());
        Assert.assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOf_givenFormatAsInlineTag_shouldNotFormatAsBlock() {
        // Arrange & Act
        Tag tag = Tag.valueOf("p");

        // Assert
        Assert.assertEquals("p", tag.getName());
        Assert.assertTrue(tag.isBlock());
        Assert.assertFalse(tag.formatAsBlock());
        Assert.assertTrue(tag.canContainBlock());
        Assert.assertTrue(tag.canContainInline());
        Assert.assertFalse(tag.isInline());
    }

    @Test
    public void valueOf_givenPreserveWhitespaceTag_shouldPreserveWhitespace() {
        // Arrange & Act
        Tag preTag = Tag.valueOf("pre");
        Tag titleTag = Tag.valueOf("title");
        Tag plaintextTag = Tag.valueOf("plaintext");

        // Assert
        Assert.assertTrue(preTag.preserveWhitespace());
        Assert.assertTrue(titleTag.preserveWhitespace());
        Assert.assertTrue(plaintextTag.preserveWhitespace());
    }

    @Test
    public void valueOf_givenUppercaseAndWhitespace_shouldTrimAndNormalizeToLowercase() {
        // Arrange & Act
        Tag tag = Tag.valueOf("   DIV  ");

        // Assert
        Assert.assertEquals("div", tag.getName());
        Assert.assertTrue(tag.isBlock());
        Assert.assertTrue(tag == Tag.valueOf("div"));
    }

    @Test
    public void valueOf_givenUnknownTag_shouldCreateGenericTag() {
        // Arrange & Act
        Tag tag = Tag.valueOf("custom-tag");

        // Assert
        Assert.assertEquals("custom-tag", tag.getName());
        Assert.assertFalse(tag.isBlock());
        Assert.assertTrue(tag.formatAsBlock());
        Assert.assertTrue(tag.canContainBlock());
        Assert.assertTrue(tag.canContainInline());
        Assert.assertTrue(tag.isInline());
        Assert.assertFalse(tag.isEmpty());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertFalse(tag.preserveWhitespace());
        Assert.assertFalse(tag.isKnownTag());
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenNullTagName_shouldThrowException() {
        // Act
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenEmptyTagName_shouldThrowException() {
        // Act
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenWhitespaceOnlyTagName_shouldThrowException() {
        // Act
        Tag.valueOf("   ");
    }

    @Test
    public void isKnownTag_givenKnownAndUnknownTagNames_shouldReturnAccurately() {
        // Assert
        Assert.assertTrue(Tag.isKnownTag("div"));
        Assert.assertTrue(Tag.isKnownTag("span"));
        Assert.assertTrue(Tag.isKnownTag("img"));
        Assert.assertFalse(Tag.isKnownTag("nonexistenttagxyz"));
    }

    @Test
    public void isData_givenTagWithNoInlineAndNotEmpty_shouldReturnTrue() throws Exception {
        // Arrange
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag = constructor.newInstance(new Object[]{"datatag"});

        Field canContainInlineField = Tag.class.getDeclaredField("canContainInline");
        canContainInlineField.setAccessible(true);
        canContainInlineField.setBoolean(tag, false);

        Field emptyField = Tag.class.getDeclaredField("empty");
        emptyField.setAccessible(true);
        emptyField.setBoolean(tag, false);

        // Act & Assert
        Assert.assertTrue(tag.isData());
    }

    @Test
    public void isData_givenNormalTag_shouldReturnFalse() {
        // Arrange & Act
        Tag tag = Tag.valueOf("div");

        // Assert
        Assert.assertFalse(tag.isData());
    }

    @Test
    public void setSelfClosing_givenUnknownTag_shouldSetSelfClosingAndReturnSelf() {
        // Arrange
        Tag tag = Tag.valueOf("custom-self-closing");

        // Act
        Tag result = tag.setSelfClosing();

        // Assert
        Assert.assertSame(tag, result);
        Assert.assertTrue(tag.isSelfClosing());
        Assert.assertFalse(tag.isEmpty());
    }

    @Test
    public void toString_givenTag_shouldReturnTagName() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Act & Assert
        Assert.assertEquals("div", tag.toString());
    }

    @Test
    public void hashCode_givenEqualObjects_shouldReturnSameHashCode() {
        // Arrange
        Tag tag1 = Tag.valueOf("custom-tag-hash");
        Tag tag2 = Tag.valueOf("custom-tag-hash");

        // Act & Assert
        Assert.assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Act & Assert
        Assert.assertTrue(tag.equals(tag));
    }

    @Test
    public void equals_givenNullOrDifferentClass_shouldReturnFalse() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Act & Assert
        Assert.assertFalse(tag.equals(null));
        Assert.assertFalse(tag.equals("div"));
    }

    @Test
    public void equals_givenIdenticalUnknownTags_shouldReturnTrue() {
        // Arrange
        Tag tag1 = Tag.valueOf("custom-equal");
        Tag tag2 = Tag.valueOf("custom-equal");

        // Act & Assert
        Assert.assertNotSame(tag1, tag2);
        Assert.assertTrue(tag1.equals(tag2));
        Assert.assertTrue(tag2.equals(tag1));
    }

    @Test
    public void equals_givenDifferentTagName_shouldReturnFalse() {
        // Arrange
        Tag tag1 = Tag.valueOf("custom-tag-1");
        Tag tag2 = Tag.valueOf("custom-tag-2");

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentCanContainBlock_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-block-contain");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-block-contain"});
        tag2.formatAsBlock();

        Field field = Tag.class.getDeclaredField("canContainBlock");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.canContainBlock());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentCanContainInline_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-inline-contain");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-inline-contain"});

        Field field = Tag.class.getDeclaredField("canContainInline");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.canContainInline());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentEmpty_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-empty");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-empty"});

        Field field = Tag.class.getDeclaredField("empty");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.isEmpty());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentFormatAsBlock_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-format-block");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-format-block"});

        Field field = Tag.class.getDeclaredField("formatAsBlock");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.formatAsBlock());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentIsBlock_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-is-block");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-is-block"});

        Field field = Tag.class.getDeclaredField("isBlock");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.isBlock());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentPreserveWhitespace_shouldReturnFalse() throws Exception {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-preserve-ws");
        Constructor<Tag> constructor = Tag.class.getDeclaredConstructor(new Class[]{String.class});
        constructor.setAccessible(true);
        Tag tag2 = constructor.newInstance(new Object[]{"diff-preserve-ws"});

        Field field = Tag.class.getDeclaredField("preserveWhitespace");
        field.setAccessible(true);
        field.setBoolean(tag2, !tag1.preserveWhitespace());

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_givenDifferentSelfClosing_shouldReturnFalse() {
        // Arrange
        Tag tag1 = Tag.valueOf("diff-self-close");
        Tag tag2 = Tag.valueOf("diff-self-close").setSelfClosing();

        // Act & Assert
        Assert.assertFalse(tag1.equals(tag2));
    }
}