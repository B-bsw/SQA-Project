package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullWhitelist_shouldThrowException() {
        // Arrange
        Whitelist whitelist = null;

        // Act
        new Cleaner(whitelist);

        // Assert - handled by expected exception
    }

    @Test
    public void constructor_givenValidWhitelist_shouldInstantiateSuccessfully() {
        // Arrange
        Whitelist whitelist = Whitelist.none();

        // Act
        Cleaner cleaner = new Cleaner(whitelist);

        // Assert
        Assert.assertNotNull(cleaner);
    }

    @Test(expected = IllegalArgumentException.class)
    public void clean_givenNullDirtyDocument_shouldThrowException() {
        // Arrange
        Cleaner cleaner = new Cleaner(Whitelist.none());

        // Act
        cleaner.clean(null);

        // Assert - handled by expected exception
    }

    @Test
    public void clean_givenDocumentWithoutBody_shouldReturnShellWithEmptyBody() {
        // Arrange
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("http://example.com/");
        dirtyDoc.body().remove();

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Assert.assertNotNull(cleanDoc);
        Assert.assertNotNull(cleanDoc.body());
        Assert.assertEquals(0, cleanDoc.body().children().size());
        Assert.assertEquals("http://example.com/", cleanDoc.baseUri());
    }

    @Test
    public void clean_givenSafeElementsAndAttributes_shouldPreserveStructureAndValues() {
        // Arrange
        Whitelist whitelist = Whitelist.none()
                .addTags("p", "a")
                .addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<p><a href=\"http://example.com/\">Link text</a></p>", "http://example.com/");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Assert.assertEquals(1, cleanDoc.body().getElementsByTag("p").size());
        Element aTag = cleanDoc.body().getElementsByTag("a").first();
        Assert.assertNotNull(aTag);
        Assert.assertEquals("http://example.com/", aTag.attr("href"));
        Assert.assertEquals("Link text", aTag.text());
    }

    @Test
    public void clean_givenUnsafeElements_shouldStripUnsafeTagsWhileRetainingAllowedChildrenText() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<p>Hello <script>alert('xss');</script><b>World</b></p>");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Assert.assertEquals(0, cleanDoc.body().getElementsByTag("script").size());
        Assert.assertEquals(0, cleanDoc.body().getElementsByTag("b").size());
        Element pTag = cleanDoc.body().getElementsByTag("p").first();
        Assert.assertNotNull(pTag);
        Assert.assertTrue(pTag.text().contains("Hello"));
        Assert.assertTrue(pTag.text().contains("World"));
    }

    @Test
    public void clean_givenUnsafeAttributes_shouldRemoveOnlyDisallowedAttributes() {
        // Arrange
        Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<a href=\"http://example.com/\" onclick=\"steal()\" target=\"_blank\">Test</a>");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Element aTag = cleanDoc.body().getElementsByTag("a").first();
        Assert.assertNotNull(aTag);
        Assert.assertTrue(aTag.hasAttr("href"));
        Assert.assertFalse(aTag.hasAttr("onclick"));
        Assert.assertFalse(aTag.hasAttr("target"));
    }

    @Test
    public void clean_givenWhitelistWithEnforcedAttributes_shouldAddEnforcedAttributesToCleanElement() {
        // Arrange
        Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<a href=\"http://example.com/\">Test Link</a>");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Element aTag = cleanDoc.body().getElementsByTag("a").first();
        Assert.assertNotNull(aTag);
        Assert.assertEquals("nofollow", aTag.attr("rel"));
    }

    @Test
    public void clean_givenNestedSafeElements_shouldProperlyTraverseAndPopDestinationStack() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("div", "p", "b", "i");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<div><p><b><i>Deep Text</i></b></p></div>");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Element div = cleanDoc.body().getElementsByTag("div").first();
        Assert.assertNotNull(div);
        Element p = div.getElementsByTag("p").first();
        Assert.assertNotNull(p);
        Element b = p.getElementsByTag("b").first();
        Assert.assertNotNull(b);
        Element i = b.getElementsByTag("i").first();
        Assert.assertNotNull(i);
        Assert.assertEquals("Deep Text", i.text());
    }

    @Test
    public void clean_givenDataNodeInsideSafeTag_shouldPreserveDataNode() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("script");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com/");
        Element script = dirtyDoc.body().appendElement("script");
        script.appendChild(new DataNode("var safe = true;", "http://example.com/"));

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Element cleanScript = cleanDoc.body().getElementsByTag("script").first();
        Assert.assertNotNull(cleanScript);
        Assert.assertEquals(1, cleanScript.dataNodes().size());
        Assert.assertEquals("var safe = true;", cleanScript.dataNodes().get(0).getWholeData());
        Assert.assertEquals("http://example.com/", cleanScript.dataNodes().get(0).baseUri());
    }

    @Test
    public void clean_givenDataNodeInsideUnsafeTag_shouldDiscardDataNode() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com/");
        Element customTag = dirtyDoc.body().appendElement("custom");
        customTag.appendChild(new DataNode("sample data", "http://example.com/"));

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Assert.assertEquals(0, cleanDoc.body().getElementsByTag("custom").size());
        Assert.assertEquals(0, cleanDoc.body().textNodes().size());
        Assert.assertEquals(0, cleanDoc.body().dataNodes().size());
    }

    @Test
    public void clean_givenCommentNodes_shouldDiscardComments() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com/");
        Element p = dirtyDoc.body().appendElement("p");
        p.appendChild(new Comment("This is a comment", "http://example.com/"));
        p.appendText("Safe Text");

        // Act
        Document cleanDoc = cleaner.clean(dirtyDoc);

        // Assert
        Element cleanP = cleanDoc.body().getElementsByTag("p").first();
        Assert.assertNotNull(cleanP);
        Assert.assertEquals("Safe Text", cleanP.text());
        Assert.assertEquals(1, cleanP.childNodeSize());
        Assert.assertTrue(cleanP.childNode(0) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValid_givenNullDirtyDocument_shouldThrowException() {
        // Arrange
        Cleaner cleaner = new Cleaner(Whitelist.none());

        // Act
        cleaner.isValid(null);

        // Assert - handled by expected exception
    }

    @Test
    public void isValid_givenCompletelySafeDocument_shouldReturnTrue() {
        // Arrange
        Whitelist whitelist = Whitelist.none()
                .addTags("p", "a")
                .addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document safeDoc = Jsoup.parse("<p><a href=\"http://example.com/\">Valid</a></p>");

        // Act
        boolean valid = cleaner.isValid(safeDoc);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeTag_shouldReturnFalse() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<p>Hello <script>alert(1);</script></p>");

        // Act
        boolean valid = cleaner.isValid(dirtyDoc);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithUnsafeAttribute_shouldReturnFalse() {
        // Arrange
        Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Jsoup.parse("<a href=\"http://example.com/\" onclick=\"exploit()\">Click</a>");

        // Act
        boolean valid = cleaner.isValid(dirtyDoc);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithComment_shouldReturnFalse() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document docWithComment = Document.createShell("http://example.com/");
        Element p = docWithComment.body().appendElement("p");
        p.appendChild(new Comment("Comment inside", "http://example.com/"));

        // Act
        boolean valid = cleaner.isValid(docWithComment);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenDocumentWithDataNodeUnderUnsafeTag_shouldReturnFalse() {
        // Arrange
        Whitelist whitelist = Whitelist.none().addTags("p");
        Cleaner cleaner = new Cleaner(whitelist);
        Document doc = Document.createShell("http://example.com/");
        Element unsafeScript = doc.body().appendElement("script");
        unsafeScript.appendChild(new DataNode("code", "http://example.com/"));

        // Act
        boolean valid = cleaner.isValid(doc);

        // Assert
        Assert.assertFalse(valid);
    }

    @Test
    public void isValid_givenEmptyBodyDocument_shouldReturnTrue() {
        // Arrange
        Whitelist whitelist = Whitelist.none();
        Cleaner cleaner = new Cleaner(whitelist);
        Document emptyDoc = Jsoup.parse("");

        // Act
        boolean valid = cleaner.isValid(emptyDoc);

        // Assert
        Assert.assertTrue(valid);
    }
}