package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TagTest {

    @Test
    public void valueOf_givenPredefinedTagInUppercase_shouldReturnNormalizedTag() {
        // Arrange & Act
        Tag tag = Tag.valueOf("DIV");

        // Assert
        Assert.assertNotNull(tag);
        Assert.assertEquals("div", tag.getName());
        Assert.assertTrue(tag.isBlock());
        Assert.assertFalse(tag.isInline());
        Assert.assertTrue(tag.canContainBlock());
        Assert.assertSame(tag, Tag.valueOf("div"));
    }

    @Test
    public void valueOf_givenPredefinedTagWithWhitespaceAndMixedCase_shouldTrimAndNormalize() {
        // Arrange & Act
        Tag tag = Tag.valueOf("   P   ");

        // Assert
        Assert.assertNotNull(tag);
        Assert.assertEquals("p", tag.getName());
        Assert.assertSame(Tag.valueOf("p"), tag);
    }

    @Test
    public void valueOf_givenUnknownCustomTag_shouldCreateGenericTag() {
        // Arrange & Act
        Tag customTag1 = Tag.valueOf("custom-tag");
        Tag customTag2 = Tag.valueOf("CUSTOM-TAG");

        // Assert
        Assert.assertNotNull(customTag1);
        Assert.assertEquals("custom-tag", customTag1.getName());
        Assert.assertFalse(customTag1.isBlock());
        Assert.assertTrue(customTag1.isInline());
        Assert.assertTrue(customTag1.canContainBlock());
        Assert.assertNotSame(customTag1, customTag2);
        Assert.assertEquals(customTag1, customTag2);
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
    public void getName_givenStandardTag_shouldReturnTagName() {
        // Arrange
        Tag tag = Tag.valueOf("span");

        // Act & Assert
        Assert.assertEquals("span", tag.getName());
    }

    @Test
    public void toString_givenStandardTag_shouldReturnTagName() {
        // Arrange
        Tag tag = Tag.valueOf("a");

        // Act & Assert
        Assert.assertEquals("a", tag.toString());
    }

    @Test
    public void isBlockAndIsInline_givenBlockTag_shouldBeBlockAndNotInline() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Act & Assert
        Assert.assertTrue(tag.isBlock());
        Assert.assertFalse(tag.isInline());
    }

    @Test
    public void isBlockAndIsInline_givenInlineTag_shouldNotBeBlockAndBeInline() {
        // Arrange
        Tag tag = Tag.valueOf("span");

        // Act & Assert
        Assert.assertFalse(tag.isBlock());
        Assert.assertTrue(tag.isInline());
    }

    @Test
    public void canContainBlock_givenBlockTagThatHoldsBlock_shouldReturnTrue() {
        // Arrange
        Tag div = Tag.valueOf("div");

        // Act & Assert
        Assert.assertTrue(div.canContainBlock());
    }

    @Test
    public void canContainBlock_givenBlockTagThatRestrictsBlock_shouldReturnFalse() {
        // Arrange
        Tag p = Tag.valueOf("p");
        Tag h1 = Tag.valueOf("h1");

        // Act & Assert
        Assert.assertFalse(p.canContainBlock());
        Assert.assertFalse(h1.canContainBlock());
    }

    @Test
    public void isEmpty_givenEmptyTag_shouldReturnTrue() {
        // Arrange
        Tag img = Tag.valueOf("img");
        Tag br = Tag.valueOf("br");
        Tag meta = Tag.valueOf("meta");
        Tag hr = Tag.valueOf("hr");

        // Act & Assert
        Assert.assertTrue(img.isEmpty());
        Assert.assertTrue(br.isEmpty());
        Assert.assertTrue(meta.isEmpty());
        Assert.assertTrue(hr.isEmpty());
    }

    @Test
    public void isEmpty_givenNonEmptyTag_shouldReturnFalse() {
        // Arrange
        Tag div = Tag.valueOf("div");
        Tag span = Tag.valueOf("span");

        // Act & Assert
        Assert.assertFalse(div.isEmpty());
        Assert.assertFalse(span.isEmpty());
    }

    @Test
    public void isData_givenDataOnlyTag_shouldReturnTrue() {
        // Arrange
        Tag script = Tag.valueOf("script");
        Tag style = Tag.valueOf("style");
        Tag title = Tag.valueOf("title");
        Tag textarea = Tag.valueOf("textarea");

        // Act & Assert
        Assert.assertTrue(script.isData());
        Assert.assertTrue(style.isData());
        Assert.assertTrue(title.isData());
        Assert.assertTrue(textarea.isData());
    }

    @Test
    public void isData_givenEmptyOrNormalTag_shouldReturnFalse() {
        // Arrange
        Tag img = Tag.valueOf("img");
        Tag div = Tag.valueOf("div");

        // Act & Assert
        Assert.assertFalse(img.isData());
        Assert.assertFalse(div.isData());
    }

    @Test
    public void preserveWhitespace_givenPreserveTags_shouldReturnTrue() {
        // Arrange
        Tag pre = Tag.valueOf("pre");
        Tag script = Tag.valueOf("script");

        // Act & Assert
        Assert.assertTrue(pre.preserveWhitespace());
        Assert.assertTrue(script.preserveWhitespace());
    }

    @Test
    public void preserveWhitespace_givenNormalTag_shouldReturnFalse() {
        // Arrange
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");

        // Act & Assert
        Assert.assertFalse(div.preserveWhitespace());
        Assert.assertFalse(p.preserveWhitespace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void canContain_givenNullChild_shouldThrowException() {
        // Arrange
        Tag div = Tag.valueOf("div");

        // Act
        div.canContain(null);
    }

    @Test
    public void canContain_givenBlockParentAndBlockChild_shouldReturnTrue() {
        // Arrange
        Tag div = Tag.valueOf("div");
        Tag ul = Tag.valueOf("ul");

        // Act & Assert
        Assert.assertTrue(div.canContain(ul));
    }

    @Test
    public void canContain_givenParentCannotContainBlockAndBlockChild_shouldReturnFalse() {
        // Arrange
        Tag p = Tag.valueOf("p");
        Tag div = Tag.valueOf("div");

        // Act & Assert
        Assert.assertFalse(p.canContain(div));
    }

    @Test
    public void canContain_givenParentCannotContainInlineAndInlineChild_shouldReturnFalse() {
        // Arrange
        Tag script = Tag.valueOf("script");
        Tag span = Tag.valueOf("span");

        // Act & Assert
        Assert.assertFalse(script.canContain(span));
    }

    @Test
    public void canContain_givenParentWithOptionalClosingAndSameChild_shouldReturnFalse() {
        // Arrange
        Tag a = Tag.valueOf("a");
        Tag li = Tag.valueOf("li");
        Tag tr = Tag.valueOf("tr");

        // Act & Assert
        Assert.assertFalse(a.canContain(a));
        Assert.assertFalse(li.canContain(li));
        Assert.assertFalse(tr.canContain(tr));
    }

    @Test
    public void canContain_givenParentWithOptionalClosingAndDifferentChild_shouldReturnTrue() {
        // Arrange
        Tag a = Tag.valueOf("a");
        Tag b = Tag.valueOf("b");

        // Act & Assert
        Assert.assertTrue(a.canContain(b));
    }

    @Test
    public void canContain_givenHeadAndAllowedChildren_shouldReturnTrue() {
        // Arrange
        Tag head = Tag.valueOf("head");
        String[] allowedChildren = new String[] {
            "base", "script", "noscript", "link", "meta", "title", "style", "object"
        };

        // Act & Assert
        for (int i = 0; i < allowedChildren.length; i++) {
            Tag child = Tag.valueOf(allowedChildren[i]);
            Assert.assertTrue("head should contain " + allowedChildren[i], head.canContain(child));
        }
    }

    @Test
    public void canContain_givenHeadAndDisallowedChildren_shouldReturnFalse() {
        // Arrange
        Tag head = Tag.valueOf("head");
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        Tag span = Tag.valueOf("span");

        // Act & Assert
        Assert.assertFalse(head.canContain(div));
        Assert.assertFalse(head.canContain(p));
        Assert.assertFalse(head.canContain(span));
    }

    @Test
    public void canContain_givenDtParentAndDdChild_shouldReturnFalse() {
        // Arrange
        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");

        // Act & Assert
        Assert.assertFalse(dt.canContain(dd));
    }

    @Test
    public void canContain_givenDdParentAndDtChild_shouldReturnFalse() {
        // Arrange
        Tag dd = Tag.valueOf("dd");
        Tag dt = Tag.valueOf("dt");

        // Act & Assert
        Assert.assertFalse(dd.canContain(dt));
    }

    @Test
    public void canContain_givenDtOrDdAndOtherInline_shouldReturnTrue() {
        // Arrange
        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");
        Tag span = Tag.valueOf("span");

        // Act & Assert
        Assert.assertTrue(dt.canContain(span));
        Assert.assertTrue(dd.canContain(span));
    }

    @Test
    public void getImplicitParent_givenHtmlTag_shouldReturnNull() {
        // Arrange
        Tag html = Tag.valueOf("html");

        // Act & Assert
        Assert.assertNull(html.getImplicitParent());
    }

    @Test
    public void getImplicitParent_givenHeadTag_shouldReturnHtml() {
        // Arrange
        Tag head = Tag.valueOf("head");

        // Act & Assert
        Tag implicitParent = head.getImplicitParent();
        Assert.assertNotNull(implicitParent);
        Assert.assertEquals("html", implicitParent.getName());
    }

    @Test
    public void getImplicitParent_givenCustomTag_shouldReturnBody() {
        // Arrange
        Tag custom = Tag.valueOf("anycustom");

        // Act & Assert
        Tag implicitParent = custom.getImplicitParent();
        Assert.assertNotNull(implicitParent);
        Assert.assertEquals("body", implicitParent.getName());
    }

    @Test
    public void isValidParent_givenHtmlChildWithNoAncestors_shouldReturnTrueForAnyParent() {
        // Arrange
        Tag htmlChild = Tag.valueOf("html");
        Tag div = Tag.valueOf("div");
        Tag custom = Tag.valueOf("custom");

        // Act & Assert
        Assert.assertTrue(div.isValidParent(htmlChild));
        Assert.assertTrue(custom.isValidParent(htmlChild));
    }

    @Test
    public void isValidParent_givenChildAndConfiguredAncestor_shouldReturnTrue() {
        // Arrange
        Tag html = Tag.valueOf("html");
        Tag head = Tag.valueOf("head");

        // Act & Assert
        Assert.assertTrue(html.isValidParent(head));
    }

    @Test
    public void isValidParent_givenChildAndUnconfiguredAncestor_shouldReturnFalse() {
        // Arrange
        Tag table = Tag.valueOf("table");
        Tag head = Tag.valueOf("head");

        // Act & Assert
        Assert.assertFalse(table.isValidParent(head));
    }

    @Test
    public void isValidParent_givenChildWithMultipleAncestors_shouldMatchAnyConfiguredAncestor() {
        // Arrange
        Tag head = Tag.valueOf("head");
        Tag body = Tag.valueOf("body");
        Tag div = Tag.valueOf("div");
        Tag script = Tag.valueOf("script");

        // Act & Assert
        Assert.assertTrue(head.isValidParent(script));
        Assert.assertTrue(body.isValidParent(script));
        Assert.assertFalse(div.isValidParent(script));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Tag div = Tag.valueOf("div");

        // Act & Assert
        Assert.assertTrue(div.equals(div));
    }

    @Test
    public void equals_givenNullOrDifferentClass_shouldReturnFalse() {
        // Arrange
        Tag div = Tag.valueOf("div");

        // Act & Assert
        Assert.assertFalse(div.equals(null));
        Assert.assertFalse(div.equals("div"));
    }

    @Test
    public void equals_givenIdenticalAttributes_shouldReturnTrue() {
        // Arrange
        Tag custom1 = Tag.valueOf("foo");
        Tag custom2 = Tag.valueOf("foo");

        // Act & Assert
        Assert.assertTrue(custom1.equals(custom2));
    }

    @Test
    public void equals_givenDifferentNamesOrAttributes_shouldReturnFalse() {
        // Arrange
        Tag div = Tag.valueOf("div");
        Tag p = Tag.valueOf("p");
        Tag span = Tag.valueOf("span");
        Tag a = Tag.valueOf("a");
        Tag img = Tag.valueOf("img");
        Tag custom1 = Tag.valueOf("c1");
        Tag custom2 = Tag.valueOf("c2");

        // Act & Assert
        Assert.assertFalse(div.equals(p));
        Assert.assertFalse(div.equals(span));
        Assert.assertFalse(span.equals(a));
        Assert.assertFalse(span.equals(img));
        Assert.assertFalse(custom1.equals(custom2));
    }

    @Test
    public void hashCode_givenEqualObjects_shouldReturnSameHashCode() {
        // Arrange
        Tag custom1 = Tag.valueOf("bar");
        Tag custom2 = Tag.valueOf("bar");

        // Act & Assert
        Assert.assertEquals(custom1.hashCode(), custom2.hashCode());
    }

    @Test
    public void hashCode_givenTag_shouldBeConsistent() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Act
        int initialHashCode = tag.hashCode();

        // Assert
        Assert.assertEquals(initialHashCode, tag.hashCode());
    }
}