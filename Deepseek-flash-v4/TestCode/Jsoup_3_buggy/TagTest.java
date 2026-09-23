package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;

public class TagTest {
    private Tag testTag;
    private Tag blockTag;
    private Tag inlineTag;
    private Tag emptyTag;
    private Tag dataOnlyTag;
    private Tag optionalClosingTag;

    @Before
    public void setUp() {
        testTag = Tag.valueOf("DIV");
        blockTag = Tag.valueOf("P");
        inlineTag = Tag.valueOf("SPAN");
        emptyTag = Tag.valueOf("IMG");
        dataOnlyTag = Tag.valueOf("SCRIPT");
        optionalClosingTag = Tag.valueOf("LI");
    }

    @After
    public void tearDown() {
        testTag = null;
        blockTag = null;
        inlineTag = null;
        emptyTag = null;
        dataOnlyTag = null;
        optionalClosingTag = null;
    }

    @Test
    public void testGetName() {
        assertEquals("div", testTag.getName());
        assertEquals("img", emptyTag.getName());
        assertNotSame("DIV", testTag.getName());
    }

    @Test
    public void testValueOf() {
        Tag tag1 = Tag.valueOf("DIV");
        Tag tag2 = Tag.valueOf("div");
        Tag tag3 = Tag.valueOf("span");
        
        assertSame(tag1, tag2);
        assertNotNull(tag3);
        assertNotSame(tag1, tag3);
    }

    @Test(expected = NullPointerException.class)
    public void testValueOfNull() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmptyString() {
        Tag.valueOf("   ");
    }

    @Test
    public void testValueOfUnknownTag() {
        Tag unknown = Tag.valueOf("unknown_tag_xyz");
        assertNotNull(unknown);
        assertFalse(unknown.isBlock());
        assertTrue(unknown.canContainBlock());
        assertEquals("unknown_tag_xyz", unknown.getName());
    }

    @Test
    public void testCanContainBlockInBlock() {
        Tag div = Tag.valueOf("DIV");
        Tag p = Tag.valueOf("P");
        assertTrue(div.canContain(p));
    }

    @Test
    public void testCanContainInlineInBlock() {
        Tag div = Tag.valueOf("DIV");
        Tag span = Tag.valueOf("SPAN");
        assertTrue(div.canContain(span));
    }

    @Test
    public void testCannotContainBlockInInline() {
        Tag span = Tag.valueOf("SPAN");
        Tag div = Tag.valueOf("DIV");
        assertFalse(span.canContain(div));
    }

    @Test
    public void testCannotContainSelfOptionalClosing() {
        Tag p = Tag.valueOf("P");
        assertFalse(p.canContain(p));
    }

    @Test
    public void testCannotContainSelfWhenEmpty() {
        Tag img = Tag.valueOf("IMG");
        assertFalse(img.canContain(img));
    }

    @Test(expected = NullPointerException.class)
    public void testCanContainNullChild() {
        testTag.canContain(null);
    }

    @Test
    public void testIsBlock() {
        assertTrue(Tag.valueOf("DIV").isBlock());
        assertTrue(Tag.valueOf("P").isBlock());
        assertFalse(Tag.valueOf("SPAN").isBlock());
        assertFalse(Tag.valueOf("IMG").isBlock());
    }

    @Test
    public void testCanContainBlock() {
        assertTrue(Tag.valueOf("DIV").canContainBlock());
        assertTrue(Tag.valueOf("TABLE").canContainBlock());
        assertFalse(Tag.valueOf("SPAN").canContainBlock());
        assertFalse(Tag.valueOf("P").canContainBlock());
    }

    @Test
    public void testIsInline() {
        assertTrue(Tag.valueOf("SPAN").isInline());
        assertTrue(Tag.valueOf("A").isInline());
        assertFalse(Tag.valueOf("DIV").isInline());
        assertFalse(Tag.valueOf("FORM").isInline());
    }

    @Test
    public void testIsData() {
        assertTrue(Tag.valueOf("SCRIPT").isData());
        assertTrue(Tag.valueOf("STYLE").isData());
        assertFalse(Tag.valueOf("DIV").isData());
        assertFalse(Tag.valueOf("IMG").isData());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Tag.valueOf("IMG").isEmpty());
        assertTrue(Tag.valueOf("BR").isEmpty());
        assertTrue(Tag.valueOf("HR").isEmpty());
        assertFalse(Tag.valueOf("DIV").isEmpty());
        assertFalse(Tag.valueOf("SPAN").isEmpty());
    }

    @Test
    public void testPreserveWhitespace() {
        assertTrue(Tag.valueOf("PRE").preserveWhitespace());
        assertTrue(Tag.valueOf("TEXTAREA").preserveWhitespace());
        assertFalse(Tag.valueOf("DIV").preserveWhitespace());
        assertFalse(Tag.valueOf("SPAN").preserveWhitespace());
    }

    @Test
    public void testEquality() {
        Tag div1 = Tag.valueOf("DIV");
        Tag div2 = Tag.valueOf("DIV");
        Tag span = Tag.valueOf("SPAN");
        
        assertEquals(div1, div2);
        assertNotSame(div1, div2);
        assertEquals(div1.hashCode(), div2.hashCode());
        assertFalse(div1.equals(span));
        assertFalse(div1.equals(null));
        assertFalse(div1.equals("DIV"));
    }

    @Test
    public void testToString() {
        assertEquals("div", testTag.toString());
        assertEquals("img", emptyTag.toString());
        assertEquals("p", Tag.valueOf("P").toString());
    }

    @Test
    public void testAncestors() {
        assertNull(blockTag.getImplicitParent());
        assertNotNull(Tag.valueOf("TR").getImplicitParent());
        assertEquals("TABLE", Tag.valueOf("TR").getImplicitParent().getName());
    }

    @Test
    public void testIsValidParent() {
        Tag table = Tag.valueOf("TABLE");
        Tag tr = Tag.valueOf("TR");
        Tag div = Tag.valueOf("DIV");
        
        assertTrue(table.isValidParent(tr));
        assertFalse(div.isValidParent(tr));
        assertFalse(table.isValidParent(div));
    }

    @Test
    public void testHeadAncestor() {
        Tag head = Tag.valueOf("HEAD");
        Tag meta = Tag.valueOf("META");
        assertTrue(head.canContain(meta));
        assertTrue(head.canContain(Tag.valueOf("TITLE")));
        assertFalse(head.canContain(Tag.valueOf("DIV")));
    }

    @Test
    public void testSetContainInlineOnly() {
        Tag p = Tag.valueOf("P");
        assertFalse(p.canContainBlock());
        assertTrue(p.canContain(Tag.valueOf("SPAN")));
        assertFalse(p.canContain(Tag.valueOf("DIV")));
    }

    @Test
    public void testSetEmptyAndDataOnly() {
        Tag script = Tag.valueOf("SCRIPT");
        assertTrue(script.isData());
        assertFalse(script.isEmpty());
        assertFalse(script.canContain(Tag.valueOf("SPAN")));
    }

    @Test
    public void testSetOptionalClosing() {
        Tag li = Tag.valueOf("LI");
        Tag p = Tag.valueOf("P");
        assertFalse(li.canContain(li));
        assertFalse(p.canContain(p));
    }

    @Test
    public void testSetEmptyTag() {
        Tag br = Tag.valueOf("BR");
        assertTrue(br.isEmpty());
        assertFalse(br.canContain(Tag.valueOf("SPAN")));
    }

    @Test
    public void testSetContainDataOnly() {
        Tag style = Tag.valueOf("STYLE");
        assertTrue(style.isData());
        assertFalse(style.canContain(Tag.valueOf("DIV")));
    }

    @Test
    public void testSetAncestor() {
        Tag td = Tag.valueOf("TD");
        assertNotNull(td.getImplicitParent());
        assertEquals("tr", td.getImplicitParent().getName());
    }

    @Test
    public void testMultipleAncestors() {
        Tag script = Tag.valueOf("SCRIPT");
        Tag body = Tag.valueOf("BODY");
        Tag head = Tag.valueOf("HEAD");
        
        assertTrue(body.isValidParent(script));
        assertTrue(head.isValidParent(script));
    }

    @Test
    public void testCreateBlockMethods() {
        assertTrue(Tag.valueOf("DIV").isBlock());
        assertTrue(Tag.valueOf("P").isBlock());
        assertTrue(Tag.valueOf("H1").isBlock());
        assertTrue(Tag.valueOf("UL").isBlock());
        assertTrue(Tag.valueOf("TABLE").isBlock());
    }

    @Test
    public void testCreateInlineMethods() {
        assertFalse(Tag.valueOf("SPAN").isBlock());
        assertFalse(Tag.valueOf("A").isBlock());
        assertFalse(Tag.valueOf("FONT").isBlock());
        assertFalse(Tag.valueOf("INPUT").isBlock());
    }

    @Test
    public void testRegister() {
        Tag tag = Tag.valueOf("UNIQUE_TAG_123");
        assertNotNull(tag);
        assertEquals("unique_tag_123", tag.getName());
    }

    @Test
    public void testEmptyAncestorList() {
        Tag html = Tag.valueOf("HTML");
        assertNull(html.getImplicitParent());
    }
}