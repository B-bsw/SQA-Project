package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;

public class TokenTest {
    private Token.TestableToken testableToken;

    @Before
    public void setUp() {
        testableToken = new Token.TestableToken();
    }

    @After
    public void tearDown() {
        testableToken = null;
    }

    @Test
    public void testTokenType() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());
        
        Token.Comment comment = new Token.Comment();
        assertEquals("Comment", comment.tokenType());
        
        Token.Character character = new Token.Character();
        assertEquals("Character", character.tokenType());
        
        Token.EOF eof = new Token.EOF();
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testResetStringBuilder() {
        StringBuilder sb = new StringBuilder("test");
        Token.reset(sb);
        assertEquals(0, sb.length());
        
        Token.reset(null); // should not throw
    }

    @Test
    public void testDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertNull(doctype.getName());
        
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("pub");
        doctype.systemIdentifier.append("sys");
        doctype.forceQuirks = true;
        
        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("pub", doctype.getPublicIdentifier());
        assertEquals("sys", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeReset() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("pub");
        doctype.systemIdentifier.append("sys");
        doctype.forceQuirks = true;
        
        Token result = doctype.reset();
        assertSame(doctype, result);
        assertEquals(0, doctype.name.length());
        assertNull(doctype.pubSysKey);
        assertFalse(doctype.forceQuirks);
    }

    @Test
    public void testStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        assertEquals(Token.TokenType.StartTag, startTag.type);
        assertNotNull(startTag.attributes);
        
        startTag.nameAttr("div", new Attributes());
        assertEquals("div", startTag.tagName);
        assertEquals("div", startTag.normalName());
        assertEquals("<div>", startTag.toString());
    }

    @Test
    public void testStartTagWithAttributes() {
        Token.StartTag startTag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        startTag.nameAttr("span", attrs);
        assertEquals("<span id=\"test\">", startTag.toString());
    }

    @Test
    public void testEndTag() {
        Token.EndTag endTag = new Token.EndTag();
        assertEquals(Token.TokenType.EndTag, endTag.type);
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
    }

    @Test
    public void testTagAppendMethods() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("di");
        tag.appendTagName('v');
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());
        
        tag.appendAttributeName("id");
        tag.appendAttributeName('x');
        assertEquals("idx", tag.pendingAttributeName);
        
        tag.appendAttributeValue("val");
        assertEquals("val", tag.pendingAttributeValueS);
        
        tag.appendAttributeValue('1');
        assertEquals("val1", tag.pendingAttributeValue.toString());
        
        tag.appendAttributeValue(new char[]{'2', '3'});
        assertEquals("val123", tag.pendingAttributeValue.toString());
        
        tag.appendAttributeValue(new int[]{97, 98});
        assertEquals("val123ab", tag.pendingAttributeValue.toString());
        
        tag.setEmptyAttributeValue();
        assertTrue(tag.hasEmptyAttributeValue);
    }

    @Test
    public void testAppendAttributeValueMultipleHits() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeValue("first");
        tag.appendAttributeValue("second");
        assertEquals("firstsecond", tag.pendingAttributeValue.toString());
    }

    @Test
    public void testNewAttributeWithValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("id");
        tag.appendAttributeValue("test");
        tag.newAttribute();
        assertNotNull(tag.attributes);
        assertEquals("test", tag.attributes.get("id"));
    }

    @Test
    public void testNewAttributeWithSValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("class");
        tag.appendAttributeValue("btn");
        tag.newAttribute();
        assertEquals("btn", tag.attributes.get("class"));
    }

    @Test
    public void testNewAttributeEmptyValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("disabled");
        tag.setEmptyAttributeValue();
        tag.newAttribute();
        assertNotNull(tag.attributes);
        assertTrue(tag.attributes.get("disabled") instanceof String);
        assertEquals("", tag.attributes.get("disabled"));
    }

    @Test
    public void testNewAttributeBoolean() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("checked");
        tag.newAttribute();
        assertNotNull(tag.attributes);
        assertTrue(tag.attributes.get("checked") instanceof BooleanAttribute);
    }

    @Test
    public void testFinaliseTag() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("id");
        tag.finaliseTag();
        assertNotNull(tag.attributes);
        assertNotNull(tag.attributes.get("id"));
    }

    @Test
    public void testComment() {
        Token.Comment comment = new Token.Comment();
        assertEquals(Token.TokenType.Comment, comment.type);
        comment.data.append("test");
        assertEquals("test", comment.getData());
        assertEquals("<!--test-->", comment.toString());
        
        comment.bogus = true;
        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacter() {
        Token.Character character = new Token.Character();
        assertEquals(Token.TokenType.Character, character.type);
        character.data("x");
        assertEquals("x", character.getData());
        assertEquals("x", character.toString());
        
        Token result = character.reset();
        assertSame(character, result);
        assertNull(character.getData());
    }

    @Test
    public void testEOF() {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
        assertSame(eof, eof.reset());
    }

    @Test
    public void testIsDoctype() {
        assertTrue(new Token.Doctype().isDoctype());
        assertFalse(new Token.StartTag().isDoctype());
    }

    @Test
    public void testAsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertSame(doctype, doctype.asDoctype());
    }

    @Test
    public void testIsStartTag() {
        assertTrue(new Token.StartTag().isStartTag());
        assertFalse(new Token.EndTag().isStartTag());
    }

    @Test
    public void testAsStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        assertSame(startTag, startTag.asStartTag());
    }

    @Test
    public void testIsEndTag() {
        assertTrue(new Token.EndTag().isEndTag());
        assertFalse(new Token.StartTag().isEndTag());
    }

    @Test
    public void testAsEndTag() {
        Token.EndTag endTag = new Token.EndTag();
        assertSame(endTag, endTag.asEndTag());
    }

    @Test
    public void testIsComment() {
        assertTrue(new Token.Comment().isComment());
        assertFalse(new Token.StartTag().isComment());
    }

    @Test
    public void testAsComment() {
        Token.Comment comment = new Token.Comment();
        assertSame(comment, comment.asComment());
    }

    @Test
    public void testIsCharacter() {
        assertTrue(new Token.Character().isCharacter());
        assertFalse(new Token.StartTag().isCharacter());
    }

    @Test
    public void testAsCharacter() {
        Token.Character character = new Token.Character();
        assertSame(character, character.asCharacter());
    }

    @Test
    public void testIsEOF() {
        assertTrue(new Token.EOF().isEOF());
        assertFalse(new Token.StartTag().isEOF());
    }

    @Test
    public void testTagReset() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("div");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("test");
        tag.setEmptyAttributeValue();
        tag.selfClosing = true;
        
        Token result = tag.reset();
        assertSame(tag, result);
        assertNull(tag.tagName);
        assertNull(tag.normalName);
        assertNull(tag.pendingAttributeName);
        assertEquals(0, tag.pendingAttributeValue.length());
        assertNull(tag.pendingAttributeValueS);
        assertFalse(tag.hasEmptyAttributeValue);
        assertFalse(tag.hasPendingAttributeValue);
        assertFalse(tag.selfClosing);
        assertNotNull(tag.attributes);
    }

    @Test
    public void testAppendTagNameNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("div");
        assertEquals("div", tag.name());
    }

    @Test
    public void testIsSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test(expected = Exception.class)
    public void testNameEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }
}