package org.jsoup.safety;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.List;

public class CleanerTest {
    private Cleaner cleaner;
    private Whitelist whitelist;

    @Before
    public void setUp() {
        whitelist = Whitelist.basic();
        cleaner = new Cleaner(whitelist);
    }

    @After
    public void tearDown() {
        cleaner = null;
        whitelist = null;
    }

    @Test
    public void testConstructorNullWhitelist() {
        try {
            new Cleaner(null);
            fail("Should throw exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCleanNullDocumentThrowsException() {
        try {
            cleaner.clean(null);
            fail("Should throw exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCleanBasicDocument() {
        Document dirty = Document.createShell("http://example.com");
        dirty.body().appendChild(new Element(Tag.valueOf("p"), "").text("Hello"));
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertEquals("http://example.com", clean.baseUri());
        assertEquals(1, clean.body().childNodes().size());
    }

    @Test
    public void testCleanWithUnsafeTagsRemoved() {
        whitelist = Whitelist.none();
        cleaner = new Cleaner(whitelist);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().appendChild(new Element(Tag.valueOf("script"), "").text("alert('xss')"));
        Document clean = cleaner.clean(dirty);
        assertEquals(0, clean.body().childNodes().size());
    }

    @Test
    public void testCleanNestedSafeTags() {
        Document dirty = Document.createShell("http://example.com");
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendChild(new Element(Tag.valueOf("b"), "").text("bold"));
        dirty.body().appendChild(p);
        Document clean = cleaner.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
        assertEquals(1, clean.body().child(0).childNodes().size());
    }

    @Test
    public void testIsValidWithUnsafeTags() {
        whitelist = Whitelist.simpleText();
        cleaner = new Cleaner(whitelist);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().appendChild(new Element(Tag.valueOf("p"), "").text("hello"));
        dirty.body().appendChild(new Element(Tag.valueOf("script"), "").text("evil"));
        assertFalse(cleaner.isValid(dirty));
    }

    @Test
    public void testIsValidWithSafeContent() {
        whitelist = Whitelist.simpleText();
        cleaner = new Cleaner(whitelist);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().appendChild(new Element(Tag.valueOf("p"), "").text("hello"));
        assertTrue(cleaner.isValid(dirty));
    }

    @Test
    public void testCleanEmptyBody() {
        Document dirty = Document.createShell("http://example.com");
        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertEquals(0, clean.body().childNodes().size());
    }

    @Test
    public void testCleanTextNodeInfusion() {
        whitelist = Whitelist.none();
        cleaner = new Cleaner(whitelist);
        Document dirty = Document.createShell("http://example.com");
        dirty.body().appendChild(new TextNode("plain text", ""));
        Document clean = cleaner.clean(dirty);
        assertEquals(1, clean.body().childNodes().size());
        assertTrue(clean.body().child(0) instanceof TextNode);
    }

    @Test
    public void testCleanZeroLoopChildren() {
        whitelist = Whitelist.none();
        cleaner = new Cleaner(whitelist);
        Document dirty = Document.createShell("http://example.com");
        Document clean = cleaner.clean(dirty);
        assertEquals(0, clean.body().childNodes().size());
    }
}