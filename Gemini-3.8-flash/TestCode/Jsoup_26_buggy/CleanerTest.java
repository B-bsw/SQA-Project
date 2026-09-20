package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for {@link Cleaner}.
 * Compatible with Java 1.4 / Java 7 source syntax without external mock libraries.
 */
public class CleanerTest {

    private Whitelist whitelist;
    private Cleaner cleaner;

    @Before
    public void setUp() {
        // Arrange standard whitelist for reusable baseline tests
        whitelist = new Whitelist();
        whitelist.addTags(new String[]{"p", "b", "i", "a"});
        whitelist.addAttributes("a", new String[]{"href", "title"});
        whitelist.addProtocols("a", "href", new String[]{"http", "https"});
        whitelist.addEnforcedAttribute("a", "rel", "nofollow");

        cleaner = new Cleaner(whitelist);
    }

    // =========================================================================
    // Error & Exception Branches
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullWhitelist_shouldThrowIllegalArgumentException() {
        // Act
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void clean_givenNullDirtyDocument_shouldThrowIllegalArgumentException() {
        // Act
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValid_givenNullDirtyDocument_shouldThrowIllegalArgumentException() {
        // Act
        cleaner.isValid(null);
    }

    // =========================================================================
    // Happy Path - clean()
    // =========================================================================

    @Test
    public void clean_givenValidSafeHtml_shouldReturnCleanDocumentWithSameStructure() {
        // Arrange
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertNotNull(cleanDoc);
        Assert.assertNotNull(cleanDoc.body());
        Assert.assertEquals("<p>Hello <b>World</b></p>", cleanDoc.body().html());
    }

    @Test
    public void clean_givenEnforcedAttributes_shouldAddEnforcedAttributeToSafeElement() {
        // Arrange
        String html = "<p><a href=\"http://example.com\" title=\"link\">Link</a></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Element aTag = cleanDoc.body().select("a").first();
        Assert.assertNotNull(aTag);
        Assert.assertEquals("http://example.com", aTag.attr("href"));
        Assert.assertEquals("link", aTag.attr("title"));
        Assert.assertEquals("nofollow", aTag.attr("rel"));
    }

    @Test
    public void clean_givenTextNodesOnly_shouldPreserveTextInDestination() {
        // Arrange
        String html = "Plain text without any tags.";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertEquals("Plain text without any tags.", cleanDoc.body().html());
    }

    // =========================================================================
    // Boundary & Edge Cases - clean()
    // =========================================================================

    @Test
    public void clean_givenEmptyDocument_shouldReturnEmptyCleanBody() {
        // Arrange
        Document dirty = Jsoup.parse("");

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertNotNull(cleanDoc);
        Assert.assertEquals("", cleanDoc.body().html());
    }

    @Test
    public void clean_givenDocumentWithBaseUri_shouldRetainBaseUriInCleanDocument() {
        // Arrange
        String baseUri = "http://enterprise.legacy.local/context/";
        Document dirty = Jsoup.parse("<p>Content</p>", baseUri);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertEquals(baseUri, cleanDoc.baseUri());
        Assert.assertEquals(baseUri, cleanDoc.body().baseUri());
    }

    @Test
    public void clean_givenUnsafeTags_shouldStripUnsafeTagsAndKeepSafeNestedChildren() {
        // Arrange
        // <script> and <div> are unsafe in this whitelist; <b> and text inside are preserved
        String html = "<div>Safe text inside unsafe div <script>var x = 1;</script><b>bold text</b></div>";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertEquals(0, cleanDoc.body().select("script").size());
        Assert.assertEquals(0, cleanDoc.body().select("div").size());
        Assert.assertEquals(1, cleanDoc.body().select("b").size());
        Assert.assertTrue(cleanDoc.body().text().contains("Safe text inside unsafe div"));
        Assert.assertTrue(cleanDoc.body().text().contains("bold text"));
    }

    @Test
    public void clean_givenUnsafeAttributes_shouldRemoveUnsafeAttributesOnly() {
        // Arrange
        // 'onclick' and 'style' are unsafe; 'href' is safe
        String html = "<p><a href=\"http://example.com\" onclick=\"steal()\" style=\"color:red;\">Click</a></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Element aTag = cleanDoc.body().select("a").first();
        Assert.assertNotNull(aTag);
        Assert.assertEquals("http://example.com", aTag.attr("href"));
        Assert.assertFalse(aTag.hasAttr("onclick"));
        Assert.assertFalse(aTag.hasAttr("style"));
        Assert.assertEquals("nofollow", aTag.attr("rel"));
    }

    @Test
    public void clean_givenCommentsAndXmlDeclarationNodes_shouldIgnoreAndExcludeThem() {
        // Arrange
        Document dirty = Jsoup.parse("<p>Hello</p>");
        dirty.body().prependChild(new Comment("This is a sensitive comment", ""));

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertEquals("<p>Hello</p>", cleanDoc.body().html());
        Assert.assertFalse(cleanDoc.body().html().contains("This is a sensitive comment"));
    }

    @Test
    public void clean_givenMultipleLevelsOfUnsafeWrappers_shouldRecurseAndHoistSafeContent() {
        // Arrange
        String html = "<custom-wrapper><unsafe-box><p>Nested Paragraph</p></unsafe-box></custom-wrapper>";
        Document dirty = Jsoup.parse(html);

        // Act
        Document cleanDoc = cleaner.clean(dirty);

        // Assert
        Assert.assertEquals(0, cleanDoc.body().select("custom-wrapper").size());
        Assert.assertEquals(0, cleanDoc.body().select("unsafe-box").size());
        Assert.assertEquals(1, cleanDoc.body().select("p").size());
        Assert.assertEquals("<p>Nested Paragraph</p>", cleanDoc.body().html());
    }

    @Test
    public void clean_givenOriginalDocument_shouldNotModifyDirtyDocumentInPlace() {
        // Arrange
        String html = "<div>Unsafe <b>Safe</b></div>";
        Document dirty = Jsoup.parse(html);
        String originalDirtyHtml = dirty.body().html();

        // Act
        cleaner.clean(dirty);

        // Assert
        Assert.assertEquals(originalDirtyHtml, dirty.body().html());
    }

    // =========================================================================
    // Happy Path & Edge Cases - isValid()
    // =========================================================================

    @Test
    public void isValid_givenCompletelySafeDocumentWithoutEnforcedMismatch_shouldReturnTrue() {
        // Arrange
        // Tag 'p' and 'b' are safe and have no enforced attributes
        String html = "<p>This is <b>safe</b> text.</p>";
        Document dirty = Jsoup.parse(html);

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeTag_shouldReturnFalse() {
        // Arrange
        String html = "<p>Allowed</p><script>alert('xss');</script>";
        Document dirty = Jsoup.parse(html);

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeAttribute_shouldReturnFalse() {
        // Arrange
        String html = "<p><a href=\"http://example.com\" target=\"_blank\">Link</a></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithDisallowedProtocol_shouldReturnFalse() {
        // Arrange
        String html = "<p><a href=\"javascript:alert(1);\">Link</a></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenEmptyDocument_shouldReturnTrue() {
        // Arrange
        Document dirty = Jsoup.parse("");

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenCommentNodeInsideSafeDocument_shouldReturnTrue() {
        // Arrange
        // Comments are skipped in copySafeNodes without incrementing numDiscarded
        Document dirty = Jsoup.parse("<p>Safe text</p>");
        dirty.body().appendChild(new Comment("Informational comment", ""));

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenOnlyTextNodes_shouldReturnTrue() {
        // Arrange
        Document dirty = Jsoup.parse("Pure text content");

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenNestedUnsafeTags_shouldReturnFalse() {
        // Arrange
        String html = "<p>Safe <span>Span is unsafe</span></p>";
        Document dirty = Jsoup.parse(html);

        // Act
        boolean valid = cleaner.isValid(dirty);

        // Assert
        Assert.assertFalse(valid);
    }
}