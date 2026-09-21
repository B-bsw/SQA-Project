package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullWhitelistThrows() {
        new Cleaner(null);
    }

    @Test
    public void constructorValidWhitelist() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        assertNotNull(cleaner);
    }

    // ---------- clean(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void cleanNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test
    public void cleanSimpleValidHtml() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
        assertTrue(clean.body().html().contains("<b>World</b>"));
    }

    @Test
    public void cleanRemovesUnsafeTags() {
        String html = "<p>Hello</p><script>alert('x')</script>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("script"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void cleanWithNoneWhitelistStripsAllTags() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("<p>"));
        assertFalse(clean.body().html().contains("<b>"));
        assertTrue(clean.body().text().contains("Hello"));
        assertTrue(clean.body().text().contains("World"));
    }

    @Test
    public void cleanFramesetDocumentHasEmptyBody() {
        // Document without a body should be handled gracefully (frameset)
        Document dirty = new Document("");
        // no body element added explicitly, but Document.createShell adds html/head/body by default
        // simulate frameset scenario by using a raw doc structure with no body content
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertNotNull(clean.body());
    }

    @Test
    public void cleanPreservesTextNodes() {
        String html = "<div>Some <unknownTag>text</unknownTag> here</div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().text().contains("Some"));
        assertTrue(clean.body().text().contains("text"));
        assertTrue(clean.body().text().contains("here"));
    }

    @Test
    public void cleanDiscardsUnsafeAttributes() {
        String html = "<p onclick=\"alert('x')\">Hello</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertFalse(clean.body().html().contains("onclick"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void cleanKeepsSafeAttributes() {
        String html = "<a href=\"http://example.com\">link</a>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("href=\"http://example.com\""));
    }

    @Test
    public void cleanEnforcedAttributesAdded() {
        String html = "<a href=\"http://example.com\">link</a>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basicWithImages());
        Document clean = cleaner.clean(dirty);

        // basicWithImages enforces rel=nofollow on <a>
        assertTrue(clean.body().html().contains("rel=\"nofollow\""));
    }

    @Test
    public void cleanNestedUnsafeTagsRecursion() {
        String html = "<div><script><p>Deeply nested</p></script></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        // div is not in basic whitelist so it's stripped but children processed
        assertFalse(clean.body().html().contains("<div>"));
        assertFalse(clean.body().html().contains("script"));
    }

    @Test
    public void cleanEmptyBody() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean.body());
        assertEquals("", clean.body().text());
    }

    @Test
    public void cleanMultipleSiblingElements() {
        String html = "<p>One</p><p>Two</p><p>Three</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertEquals(3, clean.body().select("p").size());
        assertTrue(clean.body().text().contains("One"));
        assertTrue(clean.body().text().contains("Two"));
        assertTrue(clean.body().text().contains("Three"));
    }

    // ---------- isValid(Document) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void isValidNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void isValidReturnsTrueForCleanHtml() {
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseForUnsafeTag() {
        String html = "<p>Hello</p><script>alert('x')</script>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseForUnsafeAttribute() {
        String html = "<p onclick=\"alert('x')\">Hello</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsTrueForEmptyBody() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseForNoneWhitelistWithTags() {
        String html = "<p>Hello</p>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsTrueForNoneWhitelistWithPlainText() {
        String html = "Hello World";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.none());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidHandlesMultipleDiscardedNodes() {
        String html = "<p onclick=\"x()\">Hello</p><script>bad()</script>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidWithRelaxedWhitelistAllowsMoreTags() {
        String html = "<div><p>Hello</p></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidWithNestedSafeAndUnsafeElements() {
        String html = "<div><p>Safe</p><script>Unsafe</script></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        assertFalse(cleaner.isValid(dirty));
    }
}