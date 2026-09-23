package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CommentTest {
    private Comment comment;
    private static final String DATA = "test comment";

    @Before
    public void setUp() {
        comment = new Comment(DATA);
    }

    @Test
    public void testConstructorAndGetData() {
        assertEquals(DATA, comment.getData());
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testToString() {
        String expected = "<!--" + DATA + "-->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void testIsXmlDeclarationTrue_StartsWithExclamation() {
        Comment c = new Comment("!DOCTYPE html");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationTrue_StartsWithQuestion() {
        Comment c = new Comment("?xml version=\"1.0\"?");
        assertTrue(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationFalse() {
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationEmpty() {
        Comment c = new Comment("");
        assertFalse(c.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclarationSingleChar() {
        Comment c = new Comment("!");
        assertFalse(c.isXmlDeclaration());
    }

    @Test(expected = NullPointerException.class)
    public void testIsXmlDeclarationNull() {
        new Comment(null).isXmlDeclaration();
    }

    @Test
    public void testAsXmlDeclarationValidQuestion() {
        Comment c = new Comment("?xml version='1.0'?");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.name().equalsIgnoreCase("xml"));
    }

    @Test
    public void testAsXmlDeclarationValidExclamation() {
        Comment c = new Comment("!DOCTYPE html");
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNotNull(decl);
        // the tag name should be normalized to lowercase
        assertTrue(decl.name().equals("doctype") || decl.name().equals("DOCTYPE"));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAsXmlDeclarationEmptyString() {
        new Comment("").asXmlDeclaration();
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAsXmlDeclarationSingleChar() {
        new Comment("?").asXmlDeclaration();
    }

    @Test(expected = NullPointerException.class)
    public void testAsXmlDeclarationNull() {
        new Comment(null).asXmlDeclaration();
    }

    @Test
    public void testAsXmlDeclarationReturnsNull_NoChildren() {
        // data that results in a parsed document with no child nodes
        Comment c = new Comment("? ");
        // substring(1, data.length()-1) = " " (space)
        // parse "< >"? might have no children
        XmlDeclaration decl = c.asXmlDeclaration();
        assertNull(decl);
    }
}