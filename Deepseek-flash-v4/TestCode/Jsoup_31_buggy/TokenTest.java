package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class TokenTest {
    
    private Token.Doctype doctype;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment comment;
    private Token.Character character;
    private Token.EOF eof;
    
    @Before
    public void setUp() {
        doctype = new Token.Doctype();
        startTag = new Token.StartTag();
        endTag = new Token.EndTag();
        comment = new Token.Comment();
        character = new Token.Character("test");
        eof = new Token.EOF();
    }
    
    @After
    public void tearDown() {
        doctype = null;
        startTag = null;
        endTag = null;
        comment = null;
        character = null;
        eof = null;
    }
    
    @Test
    public void testTokenType() {
        assertEquals("Doctype", doctype.tokenType());
        assertEquals("StartTag", startTag.tokenType());
        assertEquals("EndTag", endTag.tokenType());
        assertEquals("Comment", comment.tokenType());
        assertEquals("Character", character.tokenType());
        assertEquals("EOF", eof.tokenType());
    }
    
    @Test
    public void testDoctype() {
        doctype.name.append("html");
        doctype.publicIdentifier.append("PUBLIC");
        doctype.systemIdentifier.append("SYSTEM");
        
        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPublicIdentifier());
        assertEquals("SYSTEM", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
        
        doctype.forceQuirks = true;
        assertTrue(doctype.isForceQuirks());
    }
    
    @Test
    public void testStartTagConstructors() {
        Token.StartTag tag1 = new Token.StartTag("div");
        assertEquals("div", tag1.name());
        assertFalse(tag1.isSelfClosing());
        
        Attributes attrs = new Attributes();
        attrs.put("class", "test");
        Token.StartTag tag2 = new Token.StartTag("span", attrs);
        assertEquals("span", tag2.name());
        assertNotNull(tag2.attributes);
        assertEquals(1, tag2.attributes.size());
    }
    
    @Test
    public void testEndTagConstructors() {
        Token.EndTag tag = new Token.EndTag("div");
        assertEquals("div", tag.name());
        assertEquals("</div>", tag.toString());
    }
    
    @Test
    public void testTagNameAppending() {
        startTag.appendTagName("di");
        startTag.appendTagName('v');
        assertEquals("div", startTag.name());
        
        startTag.appendTagName("wrapper");
        startTag.appendTagName('s');
        assertEquals("divwrappers", startTag.name());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testEmptyTagNameThrowsException() {
        Token.StartTag emptyTag = new Token.StartTag();
        emptyTag.name();
    }
    
    @Test
    public void testAttributeNameAppending() {
        startTag.appendAttributeName("cl");
        startTag.appendAttributeName('a');
        startTag.appendAttributeName("ss");
        
        startTag.newAttribute();
        assertNotNull(startTag.attributes);
        assertEquals(1, startTag.attributes.size());
        assertTrue(startTag.attributes.hasKey("class"));
        assertEquals("", startTag.attributes.get("class"));
    }
    
    @Test
    public void testAttributeValueAppending() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("test");
        startTag.appendAttributeValue('1');
        startTag.newAttribute();
        
        assertEquals("test1", startTag.attributes.get("class"));
    }
    
    @Test
    public void testNewAttributeWithoutName() {
        startTag.newAttribute();
        assertNotNull(startTag.attributes);
        assertEquals(0, startTag.attributes.size());
    }
    
    @Test
    public void testFinaliseTagWithPendingAttribute() {
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.finaliseTag();
        
        assertNotNull(startTag.attributes);
        assertEquals("main", startTag.attributes.get("id"));
    }
    
    @Test
    public void testFinaliseTagWithoutPendingAttribute() {
        startTag.finaliseTag();
        assertNull(startTag.attributes);
    }
    
    @Test
    public void testSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
        assertTrue(tag.isSelfClosing());
    }
    
    @Test
    public void testComment() {
        comment.data.append("test comment");
        assertEquals("test comment", comment.getData());
        assertEquals("<!--test comment-->", comment.toString());
    }
    
    @Test
    public void testCharacter() {
        Token.Character char2 = new Token.Character("data");
        assertEquals("data", char2.getData());
        assertEquals("data", char2.toString());
    }
    
    @Test
    public void testIsTypeMethods() {
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
        
        assertTrue(startTag.isStartTag());
        assertTrue(endTag.isEndTag());
        assertTrue(comment.isComment());
        assertTrue(character.isCharacter());
        assertTrue(eof.isEOF());
    }
    
    @Test
    public void testAsTypeMethods() {
        assertEquals(doctype, doctype.asDoctype());
        assertEquals(startTag, startTag.asStartTag());
        assertEquals(endTag, endTag.asEndTag());
        assertEquals(comment, comment.asComment());
        assertEquals(character, character.asCharacter());
    }
    
    @Test(expected = ClassCastException.class)
    public void testInvalidCasting() {
        doctype.asStartTag();
    }
    
    @Test
    public void testToStringStartTagWithAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Token.StartTag tag = new Token.StartTag("div", attrs);
        String result = tag.toString();
        assertTrue(result.contains("<div"));
        assertTrue(result.contains("id=test"));
    }
    
    @Test
    public void testToStringStartTagWithoutAttributes() {
        Token.StartTag tag = new Token.StartTag("div");
        assertEquals("<div>", tag.toString());
    }
    
    @Test
    public void testEndTagToString() {
        assertEquals("</endTag>", new Token.EndTag("endTag").toString());
    }
    
    @Test
    public void testBoundaryValues() {
        Token.Character emptyChar = new Token.Character("");
        assertEquals("", emptyChar.getData());
        
        Token.Doctype emptyDoctype = new Token.Doctype();
        assertEquals("", emptyDoctype.getName());
        assertEquals("", emptyDoctype.getPublicIdentifier());
        assertEquals("", emptyDoctype.getSystemIdentifier());
    }
    
    @Test
    public void testMultipleAttributes() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("test");
        startTag.newAttribute();
        
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        
        assertEquals(2, startTag.attributes.size());
        assertEquals("test", startTag.attributes.get("class"));
        assertEquals("main", startTag.attributes.get("id"));
    }
    
    @Test
    public void testLoopIterationAttributeAppending() {
        for (int i = 0; i < 3; i++) {
            startTag.appendAttributeName("attr" + i);
            startTag.appendAttributeValue(String.valueOf(i));
            if (i < 2) {
                startTag.newAttribute();
            }
        }
        startTag.finaliseTag();
        
        assertEquals(3, startTag.attributes.size());
        assertEquals("0", startTag.attributes.get("attr0"));
        assertEquals("1", startTag.attributes.get("attr1"));
        assertEquals("2", startTag.attributes.get("attr2"));
    }
    
    @Test
    public void testZeroIterationAttributeAppending() {
        startTag.finaliseTag();
        assertNull(startTag.attributes);
    }
    
    @Test
    public void testEmptyAttributes() {
        Token.StartTag tag = new Token.StartTag("div");
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }
}