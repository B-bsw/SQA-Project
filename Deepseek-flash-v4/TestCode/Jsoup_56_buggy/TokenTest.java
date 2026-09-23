package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;

public class TokenTest {
    private Token.TokenType type;

    @Before
    public void setUp() {
        type = null;
    }

    @After
    public void tearDown() {
        type = null;
    }

    @Test
    public void testTokenType() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());
        Token.StartTag startTag = new Token.StartTag();
        assertEquals("StartTag", startTag.tokenType());
        Token.EndTag endTag = new Token.EndTag();
        assertEquals("EndTag", endTag.tokenType());
        Token.Comment comment = new Token.Comment();
        assertEquals("Comment", comment.tokenType());
        Token.Character character = new Token.Character();
        assertEquals("Character", character.tokenType());
        Token.EOF eof = new Token.EOF();
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testResetStringBuilder() {
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
        Token.reset(null);
    }

    @Test
    public void testDoctypeResetAndGetters() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("pub");
        doctype.systemIdentifier.append("sys");
        doctype.forceQuirks = true;
        doctype.reset();
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testStartTagResetAndNameAttr() {
        Token.StartTag tag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        tag.nameAttr("div", attrs);
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());
        assertNotNull(tag.getAttributes());
        assertEquals("div", tag.toString());
    }

    @Test
    public void testStartTagAttributesToString() {
        Token.StartTag tag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("class", "btn");
        tag.nameAttr("a", attrs);
        assertEquals("<a class=\"btn\">", tag.toString());
    }

    @Test
    public void testStartTagNoAttributesToString() {
        Token.StartTag tag = new Token.StartTag();
        tag.nameAttr("br", new Attributes());
        assertEquals("<br>", tag.toString());
    }

    @Test
    public void testStartTagResetPreservesAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.nameAttr("div", new Attributes());
        tag.reset();
        assertNotNull(tag.getAttributes());
        assertNull(tag.name());
        assertNull(tag.normalName());
    }

    @Test
    public void testEndTagToStringAndType() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
        assertEquals("EndTag", endTag.tokenType());
    }

    @Test
    public void testEndTagReset() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        endTag.appendAttributeName("class");
        endTag.appendAttributeValue("test");
        endTag.reset();
        assertNull(endTag.name());
        assertNull(endTag.normalName());
        assertNull(endTag.getAttributes());
    }

    @Test
    public void testCommentResetAndData() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("hello");
        assertEquals("hello", comment.getData());
        assertEquals("<!--hello-->", comment.toString());
        comment.bogus = true;
        comment.reset();
        assertEquals(0, comment.data.length());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacterResetAndData() {
        Token.Character character = new Token.Character();
        character.data("x");
        assertEquals("x", character.getData());
        character.reset();
        assertNull(character.getData());
    }

    @Test
    public void testEOFReset() {
        Token.EOF eof = new Token.EOF();
        eof.reset();
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testNewAttributeBooleanAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("disabled");
        tag.newAttribute();
        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals(1, attrs.size());
        Attribute attr = attrs.asList().get(0);
        assertTrue(attr instanceof org.jsoup.nodes.BooleanAttribute);
        assertEquals("disabled", attr.getKey());
    }

    @Test
    public void testNewAttributeEmptyValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("data-id");
        tag.setEmptyAttributeValue();
        tag.newAttribute();
        Attributes attrs = tag.getAttributes();
        assertEquals(1, attrs.size());
        Attribute attr = attrs.asList().get(0);
        assertEquals("data-id", attr.getKey());
        assertEquals("", attr.getValue());
    }

    @Test
    public void testNewAttributePendingValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("class");
        tag.appendAttributeValue("test");
        tag.newAttribute();
        Attributes attrs = tag.getAttributes();
        assertEquals(1, attrs.size());
        Attribute attr = attrs.asList().get(0);
        assertEquals("class", attr.getKey());
        assertEquals("test", attr.getValue());
    }

    @Test
    public void testNewAttributePendingValueS() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("id");
        tag.appendAttributeValue("first");
        tag.appendAttributeValue("second");
        tag.newAttribute();
        Attributes attrs = tag.getAttributes();
        Attribute attr = attrs.asList().get(0);
        assertEquals("firstsecond", attr.getValue());
    }

    @Test
    public void testAppendAttributeValueChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeValue('a');
        tag.appendAttributeValue('b');
        assertEquals("ab", tag.getAttributes().asList().get(0).getValue());
    }

    @Test
    public void testAppendAttributeValueCharArray() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeValue(new char[]{'x', 'y'});
        assertEquals("xy", tag.getAttributes().asList().get(0).getValue());
    }

    @Test
    public void testAppendAttributeValueCodePoints() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeValue(new int[]{65, 66});
        assertEquals("AB", tag.getAttributes().asList().get(0).getValue());
    }

    @Test
    public void testFinaliseTagWithPendingAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("disabled");
        tag.finaliseTag();
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testAppendTagName() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("d");
        tag.appendTagName("iv");
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());
    }

    @Test
    public void testAppendTagNameChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('d');
        tag.appendTagName('i');
        tag.appendTagName('v');
        assertEquals("div", tag.name());
    }

    @Test
    public void testAppendAttributeNameString() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("cl");
        tag.appendAttributeName("ass");
        assertEquals("class", tag.getAttributes().asList().get(0).getKey());
    }

    @Test
    public void testAppendAttributeNameChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName('i');
        tag.appendAttributeName('d');
        assertEquals("id", tag.getAttributes().asList().get(0).getKey());
    }

    @Test
    public void testIsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
    }

    @Test
    public void testIsStartTag() {
        Token.StartTag start = new Token.StartTag();
        assertTrue(start.isStartTag());
        assertFalse(start.isDoctype());
        assertFalse(start.isEndTag());
        assertFalse(start.isComment());
        assertFalse(start.isCharacter());
        assertFalse(start.isEOF());
    }

    @Test
    public void testIsEndTag() {
        Token.EndTag end = new Token.EndTag();
        assertTrue(end.isEndTag());
        assertFalse(end.isDoctype());
        assertFalse(end.isStartTag());
        assertFalse(end.isComment());
        assertFalse(end.isCharacter());
        assertFalse(end.isEOF());
    }

    @Test
    public void testIsComment() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertFalse(comment.isDoctype());
        assertFalse(comment.isStartTag());
        assertFalse(comment.isEndTag());
        assertFalse(comment.isCharacter());
        assertFalse(comment.isEOF());
    }

    @Test
    public void testIsCharacter() {
        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        assertFalse(character.isDoctype());
        assertFalse(character.isStartTag());
        assertFalse(character.isEndTag());
        assertFalse(character.isComment());
        assertFalse(character.isEOF());
    }

    @Test
    public void testIsEOF() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
        assertFalse(eof.isStartTag());
        assertFalse(eof.isEndTag());
        assertFalse(eof.isComment());
        assertFalse(eof.isCharacter());
    }

    @Test
    public void testAsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertSame(doctype, doctype.asDoctype());
    }

    @Test
    public void testAsStartTag() {
        Token.StartTag start = new Token.StartTag();
        assertSame(start, start.asStartTag());
    }

    @Test
    public void testAsEndTag() {
        Token.EndTag end = new Token.EndTag();
        assertSame(end, end.asEndTag());
    }

    @Test
    public void testAsComment() {
        Token.Comment comment = new Token.Comment();
        assertSame(comment, comment.asComment());
    }

    @Test
    public void testAsCharacter() {
        Token.Character character = new Token.Character();
        assertSame(character, character.asCharacter());
    }

    @Test
    public void testNameWithInvalidTagNameThrows() {
        Token.StartTag tag = new Token.StartTag();
        try {
            tag.name();
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("tagName"));
        }
    }

    @Test
    public void testNameWithEmptyTagNameThrows() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        try {
            tag.name();
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("tagName"));
        }
    }

    @Test
    public void testDoctypeToString() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());
    }
}