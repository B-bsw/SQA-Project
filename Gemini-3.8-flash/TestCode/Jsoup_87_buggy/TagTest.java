package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Suite for org.jsoup.parser.Tag
 *
 * PHASE 1 - CODE ANALYSIS & TEST MATRIX:
 * 1. Happy Path:
 *    - Lookup of predefined block tags (e.g., "div", "p").
 *    - Lookup of predefined inline tags (e.g., "span", "a").
 *    - Lookup of predefined empty/self-closing tags (e.g., "img", "br").
 *    - Lookup with case-preservation vs. HTML default lowercasing.
 *    - Behavior of known tags: formListed, formSubmittable, preserveWhitespace, formatAsBlock.
 *    - setSelfClosing() on unknown tags.
 *    - equals(), hashCode(), and toString() contracts.
 *
 * 2. Boundary & Edge Cases:
 *    - Unknown tags: verify default configuration (isBlock=false, formatAsBlock=true, etc.).
 *    - Known tags instance equality (==) vs. unknown tag object inequality (!=).
 *    - Case variations ("DIV", "SPAN", "p").
 *    - Whitespace preservation flags for tags: "pre", "plaintext", "title", "textarea".
 *    - Empty tag self-closing behavior without setSelfClosing().
 *
 * 3. Error & Exception Branches:
 *    - valueOf(null): throws IllegalArgumentException via Validate.notNull.
 *    - valueOf(null, settings): throws IllegalArgumentException.
 *    - valueOf(""): throws IllegalArgumentException via Validate.notEmpty.
 *    - valueOf("   "): normalizes to empty and throws IllegalArgumentException via Validate.notEmpty.
 */
public class TagTest {

    // =========================================================================
    // Exception & Validation Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenNullTagName_shouldThrowException() {
        // Act
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenNullTagNameWithSettings_shouldThrowException() {
        // Act
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenEmptyTagName_shouldThrowException() {
        // Act
        Tag.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOf_givenWhitespaceTagName_shouldThrowException() {
        // Act
        Tag.valueOf("   ", ParseSettings.htmlDefault);
    }

    // =========================================================================
    // Happy Path: Predefined Tags & Characteristics
    // =========================================================================

    @Test
    public void valueOf_givenBlockTag_shouldHaveBlockProperties() {
        // Arrange & Act
        Tag div = Tag.valueOf("div");

        // Assert
        Assert.assertEquals("div", div.getName());
        Assert.assertTrue(div.isBlock());
        Assert.assertFalse(div.isInline());
        Assert.assertTrue(div.formatAsBlock());
        Assert.assertTrue(div.canContainBlock());
        Assert.assertFalse(div.isEmpty());
        Assert.assertFalse(div.isSelfClosing());
        Assert.assertTrue(div.isKnownTag());
    }

    @Test
    public void valueOf_givenInlineTag_shouldHaveInlineProperties() {
        // Arrange & Act
        Tag span = Tag.valueOf("span");

        // Assert
        Assert.assertEquals("span", span.getName());
        Assert.assertFalse(span.isBlock());
        Assert.assertTrue(span.isInline());
        Assert.assertFalse(span.formatAsBlock());
        Assert.assertFalse(span.canContainBlock());
        Assert.assertFalse(span.isEmpty());
        Assert.assertFalse(span.isSelfClosing());
        Assert.assertTrue(span.isKnownTag());
    }

    @Test
    public void valueOf_givenEmptyTag_shouldBeSelfClosingAndEmpty() {
        // Arrange & Act
        Tag img = Tag.valueOf("img");

        // Assert
        Assert.assertEquals("img", img.getName());
        Assert.assertTrue(img.isEmpty());
        Assert.assertTrue(img.isSelfClosing());
        Assert.assertFalse(img.isData());
        Assert.assertTrue(img.isKnownTag());
    }

    @Test
    public void valueOf_givenFormatAsInlineTag_shouldNotFormatAsBlock() {
        // Arrange & Act
        Tag p = Tag.valueOf("p");
        Tag h1 = Tag.valueOf("h1");

        // Assert: p is block, but formatAsBlock is false
        Assert.assertTrue(p.isBlock());
        Assert.assertFalse(p.formatAsBlock());
        Assert.assertTrue(h1.isBlock());
        Assert.assertFalse(h1.formatAsBlock());
    }

    @Test
    public void preserveWhitespace_givenWhitespaceTags_shouldReturnTrue() {
        // Assert
        Assert.assertTrue(Tag.valueOf("pre").preserveWhitespace());
        Assert.assertTrue(Tag.valueOf("plaintext").preserveWhitespace());
        Assert.assertTrue(Tag.valueOf("title").preserveWhitespace());
        Assert.assertTrue(Tag.valueOf("textarea").preserveWhitespace());
        Assert.assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    @Test
    public void isFormListed_givenFormTags_shouldReturnExpected() {
        // Assert
        Assert.assertTrue(Tag.valueOf("button").isFormListed());
        Assert.assertTrue(Tag.valueOf("fieldset").isFormListed());
        Assert.assertTrue(Tag.valueOf("input").isFormListed());
        Assert.assertTrue(Tag.valueOf("keygen").isFormListed());
        Assert.assertTrue(Tag.valueOf("object").isFormListed());
        Assert.assertTrue(Tag.valueOf("output").isFormListed());
        Assert.assertTrue(Tag.valueOf("select").isFormListed());
        Assert.assertTrue(Tag.valueOf("textarea").isFormListed());
        Assert.assertFalse(Tag.valueOf("div").isFormListed());
    }

    @Test
    public void isFormSubmittable_givenFormTags_shouldReturnExpected() {
        // Assert
        Assert.assertTrue(Tag.valueOf("input").isFormSubmittable());
        Assert.assertTrue(Tag.valueOf("keygen").isFormSubmittable());
        Assert.assertTrue(Tag.valueOf("object").isFormSubmittable());
        Assert.assertTrue(Tag.valueOf("select").isFormSubmittable());
        Assert.assertTrue(Tag.valueOf("textarea").isFormSubmittable());
        // button and fieldset are formListed but not formSubmit
        Assert.assertFalse(Tag.valueOf("button").isFormSubmittable());
        Assert.assertFalse(Tag.valueOf("fieldset").isFormSubmittable());
        Assert.assertFalse(Tag.valueOf("div").isFormSubmittable());
    }

    @Test
    public void isData_givenStandardTags_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(Tag.valueOf("script").isData());
        Assert.assertFalse(Tag.valueOf("div").isData());
        Assert.assertFalse(Tag.valueOf("img").isData());
    }

    // =========================================================================
    // Edge Cases: Case Sensitivity & Unknown Tags
    // =========================================================================

    @Test
    public void valueOf_givenPredefinedTag_shouldReturnSameCachedInstance() {
        // Arrange & Act
        Tag p1 = Tag.valueOf("p");
        Tag p2 = Tag.valueOf("p");

        // Assert
        Assert.assertSame(p1, p2);
    }

    @Test
    public void valueOf_givenUppercaseWithDefaultSettings_shouldReturnPredefinedTag() {
        // Act
        Tag div = Tag.valueOf("DIV", ParseSettings.htmlDefault);

        // Assert
        Assert.assertSame(Tag.valueOf("div"), div);
        Assert.assertTrue(div.isKnownTag());
    }

    @Test
    public void valueOf_givenUppercaseWithPreserveCase_shouldReturnGenericUnknownTag() {
        // Act
        Tag uppercaseDiv = Tag.valueOf("DIV", ParseSettings.preserveCase);

        // Assert: not in tags map since keys are lower-case
        Assert.assertEquals("DIV", uppercaseDiv.getName());
        Assert.assertFalse(uppercaseDiv.isKnownTag());
        Assert.assertFalse(uppercaseDiv.isBlock());
        Assert.assertTrue(uppercaseDiv.formatAsBlock());
        Assert.assertNotSame(Tag.valueOf("div"), uppercaseDiv);
    }

    @Test
    public void valueOf_givenUnknownTag_shouldCreateGenericTag() {
        // Arrange
        String customName = "custom-element";

        // Act
        Tag custom = Tag.valueOf(customName);

        // Assert
        Assert.assertEquals(customName, custom.getName());
        Assert.assertFalse(custom.isKnownTag());
        Assert.assertFalse(custom.isBlock());
        Assert.assertTrue(custom.isInline());
        Assert.assertTrue(custom.formatAsBlock());
        Assert.assertFalse(custom.canContainBlock());
        Assert.assertFalse(custom.isEmpty());
        Assert.assertFalse(custom.isSelfClosing());
        Assert.assertFalse(custom.preserveWhitespace());
        Assert.assertFalse(custom.isFormListed());
        Assert.assertFalse(custom.isFormSubmittable());
    }

    @Test
    public void valueOf_givenRepeatedUnknownTag_shouldReturnDifferentInstances() {
        // Act
        Tag t1 = Tag.valueOf("my-tag");
        Tag t2 = Tag.valueOf("my-tag");

        // Assert: not cached, distinct instances, but equal by value
        Assert.assertNotSame(t1, t2);
        Assert.assertEquals(t1, t2);
    }

    @Test
    public void setSelfClosing_givenUnknownTag_shouldBecomeSelfClosing() {
        // Arrange
        Tag custom = Tag.valueOf("custom-self");
        Assert.assertFalse(custom.isSelfClosing());

        // Act
        Tag result = custom.setSelfClosing();

        // Assert
        Assert.assertSame(custom, result);
        Assert.assertTrue(custom.isSelfClosing());
    }

    // =========================================================================
    // Static vs Instance isKnownTag Tests
    // =========================================================================

    @Test
    public void isKnownTag_givenValidAndInvalidNames_shouldReturnCorrectResult() {
        // Assert static
        Assert.assertTrue(Tag.isKnownTag("div"));
        Assert.assertTrue(Tag.isKnownTag("span"));
        Assert.assertTrue(Tag.isKnownTag("img"));
        Assert.assertFalse(Tag.isKnownTag("unknownTag"));
        Assert.assertFalse(Tag.isKnownTag("DIV"));

        // Assert instance
        Assert.assertTrue(Tag.valueOf("div").isKnownTag());
        Assert.assertFalse(Tag.valueOf("unknownTag").isKnownTag());
    }

    // =========================================================================
    // Equality, HashCode, and ToString Tests
    // =========================================================================

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Assert
        Assert.assertEquals(tag, tag);
    }

    @Test
    public void equals_givenNullOrDifferentType_shouldReturnFalse() {
        // Arrange
        Tag tag = Tag.valueOf("div");

        // Assert
        Assert.assertFalse(tag.equals(null));
        Assert.assertFalse(tag.equals("div"));
    }

    @Test
    public void equals_givenDifferentTagName_shouldReturnFalse() {
        // Arrange
        Tag t1 = Tag.valueOf("custom1");
        Tag t2 = Tag.valueOf("custom2");

        // Assert
        Assert.assertFalse(t1.equals(t2));
    }

    @Test
    public void equals_givenDifferentSelfClosing_shouldReturnFalse() {
        // Arrange
        Tag t1 = Tag.valueOf("custom");
        Tag t2 = Tag.valueOf("custom").setSelfClosing();

        // Assert
        Assert.assertFalse(t1.equals(t2));
        Assert.assertFalse(t2.equals(t1));
    }

    @Test
    public void equals_givenTagsWithDifferentPredefinedAttributes_shouldReturnFalse() {
        // Compare block vs inline
        Assert.assertFalse(Tag.valueOf("div").equals(Tag.valueOf("span")));

        // Compare formatAsBlock difference (div vs p)
        Assert.assertFalse(Tag.valueOf("div").equals(Tag.valueOf("p")));

        // Compare empty tag vs non-empty
        Assert.assertFalse(Tag.valueOf("img").equals(Tag.valueOf("span")));

        // Compare form listed difference (button vs div)
        Assert.assertFalse(Tag.valueOf("button").equals(Tag.valueOf("div")));

        // Compare form submit difference (button vs input)
        Assert.assertFalse(Tag.valueOf("button").equals(Tag.valueOf("input")));

        // Compare preserveWhitespace difference (pre vs div)
        Assert.assertFalse(Tag.valueOf("pre").equals(Tag.valueOf("div")));
    }

    @Test
    public void equalsAndHashCode_givenIdenticalUnknownTags_shouldBeConsistent() {
        // Arrange
        Tag t1 = Tag.valueOf("custom");
        Tag t2 = Tag.valueOf("custom");

        // Assert
        Assert.assertEquals(t1, t2);
        Assert.assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_givenModifiedSelfClosing_shouldProduceDifferentHashCode() {
        // Arrange
        Tag t1 = Tag.valueOf("custom");
        Tag t2 = Tag.valueOf("custom");
        t2.setSelfClosing();

        // Assert
        Assert.assertFalse(t1.hashCode() == t2.hashCode());
    }

    @Test
    public void toString_shouldReturnTagName() {
        // Assert
        Assert.assertEquals("div", Tag.valueOf("div").toString());
        Assert.assertEquals("span", Tag.valueOf("span").toString());
        Assert.assertEquals("custom", Tag.valueOf("custom").toString());
    }
}