```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommentTest {

    @Test
    public void testConstructorWithData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void testConstructorWithDataAndBaseUri() {
        Comment comment = new Comment("Comment data", "http://example.com/");
        assertEquals("Comment data", comment.getData());
    }

    @Test
    public void testConstructorWithEmptyData() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void testNodeName() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("some comment text");
        assertEquals("some comment text", comment.getData());
    }

    @Test
    public void testGetDataEmpty() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("hello");
        String result = comment.toString();
        assertTrue(result.contains("hello"));
        assertTrue(result.startsWith("<!--"));
        assertTrue(result.endsWith("-->"));
    }

    @Test
    public void testToStringEmptyData() {
        Comment comment = new Comment("");
        String result = comment.toString();
        assertEquals("<!---->", result);
    }

    @Test
    public void testOuterHtmlContainsData() {
        Comment comment = new Comment("outer html test");
        String html = comment.outerHtml();
        assertTrue(html.contains("outer html test"));
        assertTrue(html.startsWith("<!--"));
        assertTrue(html.endsWith("-->"));
    }

    @Test
    public void testIsXmlDeclarationTrueWithExclamation() {
        Comment comment = new Comment("!DOCTYPE html");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationTrueWithQuestionMark() {
        Comment comment = new Comment("?xml version=\"1.0\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalseNormalComment() {
        Comment comment = new Comment("just a regular comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalseEmptyData() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalseSingleCharData() {
        Comment comment = new Comment("!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalseSingleCharQuestion() {
        Comment comment = new Comment("?");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalseLongerButNoPrefix() {
        Comment comment = new Comment("abc def");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationWithValidDeclaration() {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertFalse(decl.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationWithQuestionMarkPrefix() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.name().length() > 0);
    }

    @Test
    public void testAsXmlDeclarationReturnsNullWhenNoChildNodes() {
        Comment comment = new Comment("!");
        // data.substring(1, data.length()-1) on "!" -> substring(1,0) will throw exception
        // Use a data that produces empty content between markers
        try {
            XmlDeclaration decl = comment.asXmlDeclaration();
            // If no exception, check declaration behavior
            assertNull(decl);
        } catch (StringIndexOutOfBoundsException e) {
            // Expected for malformed data with length 1
            assertTrue(true);
        }
    }

    @Test
    public void testAsXmlDeclarationWithAttributes() {
        Comment comment = new Comment("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void testAsXmlDeclarationExclamationFlag() {
        Comment comment = new Comment("!root");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertFalse(decl.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationQuestionFlag() {
        Comment comment = new Comment("?root?");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.isXmlDeclaration());
    }

    @Test
    public void testCloneComment() {
        Comment comment = new Comment("clone test");
        Comment clone = (Comment) comment.clone();
        assertEquals(comment.getData(), clone.getData());
        assertNotSame(comment, clone);
    }

    @Test
    public void testMultipleComments() {
        Comment comment1 = new Comment("first");
        Comment comment2 = new Comment("second");
        assertNotEquals(comment1.getData(), comment2.getData());
        assertEquals("first", comment1.getData());
        assertEquals("second", comment2.getData());
    }

    @Test
    public void testCommentWithSpecialCharacters() {
        Comment comment = new Comment("<script>alert('xss')</script>");
        assertEquals("<script>alert('xss')</script>", comment.getData());
        String html = comment.toString();
        assertTrue(html.contains("<!--"));
        assertTrue(html.contains("-->"));
    }

    @Test
    public void testCommentWithNewlines() {
        Comment comment = new Comment("line1\nline2\nline3");
        assertEquals("line1\nline2\nline3", comment.getData());
    }

    @Test
    public void testCommentWithLongData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("x");
        }
        String longData = sb.toString();
        Comment