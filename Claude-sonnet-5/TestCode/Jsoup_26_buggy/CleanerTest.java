```java
package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullWhitelistThrows() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cleanNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidNullDocumentThrows() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void cleanEmptyBody() {
        Document dirty = Jsoup.parse("");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertNotNull(clean);
        assertEquals("", clean.body().html());
    }

    @Test
    public void cleanSimpleText() {
        Document dirty = Jsoup.parse("<p>Hello World</p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("Hello World"));
        assertTrue(clean.body().html().contains("<p>"));
    }

    @Test
    public void cleanRemovesUnsafeTag() {
        Document dirty = Jsoup.parse("<p><script>alert(1)</script>Hello</p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        String html = clean.body().html();
        assertFalse(html.contains("script"));
        assertFalse(html.contains("alert"));
        assertTrue(html.contains("Hello"));
    }

    @Test
    public void cleanRemovesUnsafeTagButKeepsChildText() {
        Document dirty = Jsoup.parse("<div><unsafeTag>Keep this text</unsafeTag></div>");
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("Keep this text"));
    }

    @Test
    public void cleanNestedElements() {
        Document dirty = Jsoup.parse("<div><p><b>Bold text</b></p></div>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        String html = clean.body().html();
        assertTrue(html.contains("Bold text"));
    }

    @Test
    public void cleanDiscardsUnsafeAttributes() {
        Document dirty = Jsoup.parse("<p onclick='alert(1)'>Hello</p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        String html = clean.body().html();
        assertFalse(html.contains("onclick"));
        assertTrue(html.contains("Hello"));
    }

    @Test
    public void cleanKeepsSafeAttributes() {
        Document dirty = Jsoup.parse("<a href='http://example.com'>Link</a>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        String html = clean.body().html();
        assertTrue(html.contains("href"));
        assertTrue(html.contains("http://example.com"));
    }

    @Test
    public void cleanAddsEnforcedAttributes() {
        Document dirty = Jsoup.parse("<a href='http://example.com'>Link</a>");
        Cleaner cleaner = new Cleaner(Whitelist.relaxed());
        Document clean = cleaner.clean(dirty);

        String html = clean.body().html();
        assertTrue(html.contains("href"));
    }

    @Test
    public void cleanPreservesTextNodes() {
        Document dirty = Jsoup.parse("Just some plain text");
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document clean = cleaner.clean(dirty);

        assertEquals("Just some plain text", clean.body().text());
    }

    @Test
    public void cleanDoesNotModifyOriginalDocument() {
        Document dirty = Jsoup.parse("<script>alert(1)</script><p>Hello</p>");
        String originalHtml = dirty.body().html();

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(dirty);

        assertEquals(originalHtml, dirty.body().html());
    }

    @Test
    public void isValidReturnsTrueForCleanDocument() {
        Document dirty = Jsoup.parse("<p>Hello World</p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseForUnsafeTag() {
        Document dirty = Jsoup.parse("<p><script>alert(1)</script>Hello</p>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void isValidReturnsFalseForUnsafeAttribute() {
        Document dirty = Jsoup.parse("<p onclick='alert(1)'>Hello</p>");
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
    public void isValidReturnsFalseForNestedUnsafeElements() {
        Document dirty = Jsoup.parse("<div><script>alert(1)</script><p>Hello</p></div>");
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void cleanWithNoneWhitelistDiscardsAllTags() {
        Document dirty = Jsoup.parse("<div><p>Hello</p><b>World</b></div>");
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document clean = cleaner.clean(dirty);

        assertEquals("Hello World", clean.body().text());
        assertFalse(clean.body().html().contains("<p>"));
        assertFalse(