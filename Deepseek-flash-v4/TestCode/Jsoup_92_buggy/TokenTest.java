package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void tokenTypeReturnsSimpleClassName() {
        assertEquals("Doctype", new Doctype().tokenType());
        assertEquals("StartTag", new StartTag().tokenType());
        assertEquals("EndTag", new EndTag().tokenType());
        assertEquals("Comment", new Comment().tokenType());
        assertEquals("Character", new Character().tokenType());
        assertEquals("CData", new CData("x").tokenType());
        assertEquals("EOF", new EOF().tokenType());
    }

    @Test
    public void typeChecksAndCasts() {
        Token doctype = new Doctype();
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());

        Token start = new StartTag();
        assertTrue(start.isStartTag());
        assertSame(start, start.asStartTag());
        assertFalse(start.isEndTag());

        Token end = new EndTag();
        assertTrue(end.isEndTag());
        assertSame(end, end.asEndTag());

        Token comment = new Comment();
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());

        Character ch = new Character().data("a");
        assertTrue(ch.isCharacter());
        assertFalse(ch.isCData());
        assertSame(ch, ch.asCharacter());

        Token cdata = new CData("b");
        assertTrue(cdata.isCharacter());
        assertTrue(cdata.isCData());
        assertSame(cdata, cdata.asCharacter());

        Token eof = new EOF();
        assertTrue(eof.isEOF());
        assertSame(eof, eof.reset());
    }

    @Test
    public void doctypeResetClearsAllFields() {
        Doctype dt = new Doctype();
        dt.name.append("html");
        dt.pubSysKey = "PUBLIC";
        dt.publicIdentifier.append("pub");
        dt.systemIdentifier.append("sys");
        dt.forceQuirks = true;

        assertEquals("html", dt.getName());
        assertEquals("PUBLIC", dt.getPubSysKey());
        assertEquals("pub", dt.getPublicIdentifier());
        assertEquals("sys", dt.getSystemIdentifier());
        assertTrue(dt.isForceQuirks());

        assertSame(dt, dt.reset());
        assertEquals("", dt.getName());
        assertNull(dt.getPubSysKey());
        assertEquals("", dt.getPublicIdentifier());
        assertEquals("", dt.getSystemIdentifier());
        assertFalse(dt.isForceQuirks());
    }

    @Test
    public void commentResetClearsDataAndBogus() {
        Comment comment = new Comment();
        comment.data.append("hello");
        comment.bogus = true;

        assertEquals("hello", comment.getData());
        assertEquals("<!--hello-->", comment.toString());

        assertSame(comment, comment.reset());
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void characterAndCDataBehave() {
        Character noData = new Character();
        assertNull(noData.getData());

        Character ch = new Character().data("abc");
        assertEquals("abc", ch.getData());
        assertEquals("abc", ch.toString());
        assertSame(ch, ch.reset());
        assertNull(ch.getData());

        CData cdata = new CData("x");
        assertEquals("x", cdata.getData());
        assertEquals("<![CDATA[x]]>", cdata.toString());
    }

    @Test
    public void nameThrowsWhenTagNameNullOrEmpty() {
        try {
            new StartTag().name();
            fail("Expected RuntimeException");
        } catch (RuntimeException expected) {
            // expected
        }

        try {
            StartTag tag = new StartTag();
            tag.name("");
            tag.name();
            fail("Expected RuntimeException");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    @Test
    public void nameSetsTagNameAndNormalName() {
        StartTag tag = new StartTag();
        tag.name("DIV");

        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void tagResetClearsEverything() {
        StartTag tag = new StartTag();
        tag.name("DIV");
        tag.selfClosing = true;
        tag.appendAttributeName("a");
        tag.appendAttributeValue("v");

        assertSame(tag, tag.reset());
        assertNull(tag.tagName);
        assertNull(tag.normalName);
        assertFalse(tag.selfClosing);
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void appendTagNameHandlesNullAndExisting() {
        StartTag tag = new StartTag();
        tag.appendTagName("b");
        assertEquals("b", tag.tagName);

        tag.appendTagName("r");
        assertEquals("br", tag.tagName);
        assertEquals("br", tag.normalName);
    }

    @Test
    public void newAttributeCreatesAttributesForEndTag() {
        EndTag tag = new EndTag();
        assertNull(tag.getAttributes());

        tag.appendAttributeName("a");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        assertNotNull(tag.getAttributes());
        assertTrue(tag.getAttributes().hasKey("a"));
        assertEquals("", tag.getAttributes().get("a"));
    }

    @Test
    public void newAttributeBuildsValueFromBuilder() {
        StartTag tag = new StartTag();
        tag.name("a");
        tag.appendAttributeName("hre");
        tag.appendAttributeName("f");
        tag.appendAttributeValue("x");
        tag.appendAttributeValue("y");
        tag.finaliseTag();

        assertEquals("xy", tag.getAttributes().get("href"));
    }

    @Test
    public void newAttributeUsesSingleShotValue() {
        StartTag tag = new StartTag();
        tag.name("a");
        tag.appendAttributeName("b");
        tag.appendAttributeValue("v");
        tag.finaliseTag();

        assertEquals("v", tag.getAttributes().get("b"));
    }

    @Test
    public void newAttributeSkipsBlankNameAfterTrim() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("   ");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void appendAttributeValueVariants() {
        StartTag tag = new StartTag();
        tag.name("x");
        tag.appendAttributeName("a");
        tag.appendAttributeValue(new char[]{'a', 'b'});
        tag.appendAttributeValue(new int[0]);
        tag.appendAttributeValue(new int[]{'c'});
        tag.appendAttributeValue(new int[]{'d', 'e'});
        tag.finaliseTag();

        assertEquals("abcde", tag.getAttributes().get("a"));
    }

    @Test
    public void startTagToStringWithoutAndWithAttributes() {
        StartTag tag = new StartTag();
        tag.name("p");
        assertEquals("<p>", tag.toString());

        StartTag tag2 = new StartTag();
        tag2.name("div");
        tag2.appendAttributeName("id");
        tag2.appendAttributeValue("main");
        tag2.finaliseTag();

        String s = tag2.toString();
        assertTrue(s.startsWith("<div"));
        assertTrue(s.contains("id=\"main\""));
    }

    @Test
    public void endTagToString() {
        EndTag tag = new EndTag();
        tag.name("P");
        assertEquals("</P>", tag.toString());
    }
}