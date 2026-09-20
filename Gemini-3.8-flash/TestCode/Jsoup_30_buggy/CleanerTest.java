package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullWhitelist_shouldThrowIllegalArgumentException() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void clean_givenNullDirtyDocument_shouldThrowIllegalArgumentException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValid_givenNullDirtyDocument_shouldThrowIllegalArgumentException() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void clean_givenDocumentWithoutBody_shouldReturnDocumentWithEmptyBody() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Document.createShell("http://example.com/");
        Element body = dirty.body();
        if (body != null) {
            body.remove();
        }
        Assert.assertNull(dirty.body());

        Document clean = cleaner.clean(dirty);

        Assert.assertNotNull(clean);
        Assert.assertNotNull(clean.body());
        Assert.assertEquals(0, clean.body().childNodes().size());
        Assert.assertEquals("http://example.com/", clean.baseUri());
    }

    @Test
    public void clean_givenEmptyDocument_shouldReturnEmptyCleanBody() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("");

        Document clean = cleaner.clean(dirty);

        Assert.assertNotNull(clean);
        Assert.assertEquals("", clean.body().html());
    }

    @Test
    public void clean_givenSafeElementsAndText_shouldPreserveStructure() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        String html = "<p>Hello <b>World</b></p>";
        Document dirty = Jsoup.parse(html);

        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Hello <b>World</b></p>", clean.body().html());
    }

    @Test
    public void clean_givenUnsafeTags_shouldDropTagsAndPreserveSafeChildren() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        String html = "<script>alert('xss');</script><p>Safe Paragraph</p><unknown><b>Inner Bold</b></unknown>";
        Document dirty = Jsoup.parse(html);

        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Safe Paragraph</p><b>Inner Bold</b>", clean.body().html());
    }

    @Test
    public void clean_givenSafeElementWithUnsafeAttributes_shouldStripOnlyUnsafeAttributes() {
        Whitelist whitelist = new Whitelist().addTags("a").addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirty = Jsoup.parse("<a href=\"http://example.com\" onclick=\"steal()\" style=\"color:red\">Link</a>");

        Document clean = cleaner.clean(dirty);

        Element a = clean.body().select("a").first();
        Assert.assertNotNull(a);
        Assert.assertTrue(a.hasAttr("href"));
        Assert.assertFalse(a.hasAttr("onclick"));
        Assert.assertFalse(a.hasAttr("style"));
        Assert.assertEquals("Link", a.text());
    }

    @Test
    public void clean_givenEnforcedAttributes_shouldAddThemToDestinationElement() {
        Whitelist whitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirty = Jsoup.parse("<a href=\"http://example.com\">Link</a>");

        Document clean = cleaner.clean(dirty);

        Element a = clean.body().select("a").first();
        Assert.assertNotNull(a);
        Assert.assertEquals("nofollow", a.attr("rel"));
        Assert.assertEquals("http://example.com", a.attr("href"));
    }

    @Test
    public void clean_givenExistingEnforcedAttribute_shouldOverwriteWithEnforcedValue() {
        Whitelist whitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href", "rel")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirty = Jsoup.parse("<a href=\"http://example.com\" rel=\"dofollow\">Link</a>");

        Document clean = cleaner.clean(dirty);

        Element a = clean.body().select("a").first();
        Assert.assertNotNull(a);
        Assert.assertEquals("nofollow", a.attr("rel"));
    }

    @Test
    public void clean_givenCommentsAndDataNodes_shouldDiscardThem() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p>Hello<!-- this is comment --></p>");
        dirty.body().appendChild(new Comment("outside comment", ""));

        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<p>Hello</p>", clean.body().html());
    }

    @Test
    public void clean_givenNestedHierarchy_shouldCleanAllLevelsAccurately() {
        Whitelist whitelist = new Whitelist().addTags("div", "ul", "li", "span");
        Cleaner cleaner = new Cleaner(whitelist);
        String dirtyHtml = "<div><ul><li><span>Item 1</span><script>evil()</script></li></ul></div>";
        Document dirty = Jsoup.parse(dirtyHtml);

        Document clean = cleaner.clean(dirty);

        Assert.assertEquals("<div><ul><li><span>Item 1</span></li></ul></div>", clean.body().html());
    }

    @Test
    public void clean_givenBaseUri_shouldRetainBaseUriInResultAndTextNodes() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        String baseUri = "http://jsoup.org/test/";
        Document dirty = Document.createShell(baseUri);
        dirty.body().append("<p>Text</p>");

        Document clean = cleaner.clean(dirty);

        Assert.assertEquals(baseUri, clean.baseUri());
        TextNode textNode = (TextNode) clean.body().select("p").first().childNode(0);
        Assert.assertEquals(baseUri, textNode.baseUri());
    }

    @Test
    public void isValid_givenCompletelySafeDocument_shouldReturnTrue() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p>This is <b>safe</b> text.</p>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeTag_shouldReturnFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p>Safe</p><script>alert(1);</script>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeAttribute_shouldReturnFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<p onclick=\"exploit()\">Safe text with bad attr</p>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenNestedUnsafeElementInsideSafeElement_shouldReturnFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("<blockquote><p><iframe src=\"bad.html\"></iframe></p></blockquote>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenEmptyDocument_shouldReturnTrue() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirty = Jsoup.parse("");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenDocumentWithoutEnforcedAttributesPresent_shouldStillReturnTrueIfNoTagsOrAttrsDiscarded() {
        Whitelist whitelist = new Whitelist()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirty = Jsoup.parse("<a href=\"http://example.com\">Link without rel</a>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenUnsafeCustomTags_shouldReturnFalse() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document dirty = Jsoup.parse("<custom-tag>Hello</custom-tag>");

        boolean valid = cleaner.isValid(dirty);

        Assert.assertFalse(valid);
    }
}