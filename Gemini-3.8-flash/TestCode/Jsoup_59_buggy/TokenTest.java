package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {

    @Test
    public void resetStringBuilder_givenNonNullStringBuilder_shouldClearContent() {
        StringBuilder sb = new StringBuilder("sample-data");
        Token.reset(sb);
        Assert.assertEquals(0, sb.length());
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void resetStringBuilder_givenNullStringBuilder_shouldNotThrowException() {
        Token.reset((StringBuilder) null);
    }

    @Test
    public void tokenType_givenConcreteTokens_shouldReturnSimpleClassName() {
        Token.Doctype doctype = new Token.Doctype();
        Token.StartTag startTag = new Token.StartTag();
        Token.EndTag endTag = new Token.EndTag();
        Token.Comment comment = new Token.Comment();
        Token.Character character = new Token.Character();
        Token.EOF eof = new Token.EOF();

        Assert.assertEquals("Doctype", doctype.tokenType());
        Assert.assertEquals("StartTag", startTag.tokenType());
        Assert.assertEquals("EndTag", endTag.tokenType());
        Assert.assertEquals("Comment", comment.tokenType());
        Assert.assertEquals("Character", character.tokenType());
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void typeChecksAndCasting_givenVariousTokens_shouldIdentifyCorrectTypes() {
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertTrue(doctype.isDoctype());
        Assert.assertFalse(doctype.isStartTag());
        Assert.assertFalse(doctype.isEndTag());
        Assert.assertFalse(doctype.isComment());
        Assert.assertFalse(doctype.isCharacter());
        Assert.assertFalse(doctype.isEOF());
        Assert.assertSame(doctype, doctype.asDoctype());

        Token.StartTag startTag = new Token.StartTag();
        Assert.assertFalse(startTag.isDoctype());
        Assert.assertTrue(startTag.isStartTag());
        Assert.assertFalse(startTag.isEndTag());
        Assert.assertFalse(startTag.isComment());
        Assert.assertFalse(startTag.isCharacter());
        Assert.assertFalse(startTag.isEOF());
        Assert.assertSame(startTag, startTag.asStartTag());

        Token.EndTag endTag = new Token.EndTag();
        Assert.assertFalse(endTag.isDoctype());
        Assert.assertFalse(endTag.isStartTag());
        Assert.assertTrue(endTag.isEndTag());
        Assert.assertFalse(endTag.isComment());
        Assert.assertFalse(endTag.isCharacter());
        Assert.assertFalse(endTag.isEOF());
        Assert.assertSame(endTag, endTag.asEndTag());

        Token.Comment comment = new Token.Comment();
        Assert.assertFalse(comment.isDoctype());
        Assert.assertFalse(comment.isStartTag());
        Assert.assertFalse(comment.isEndTag());
        Assert.assertTrue(comment.isComment());
        Assert.assertFalse(comment.isCharacter());
        Assert.assertFalse(comment.isEOF());
        Assert.assertSame(comment, comment.asComment());

        Token.Character character = new Token.Character();
        Assert.assertFalse(character.isDoctype());
        Assert.assertFalse(character.isStartTag());
        Assert.assertFalse(character.isEndTag());
        Assert.assertFalse(character.isComment());
        Assert.assertTrue(character.isCharacter());
        Assert.assertFalse(character.isEOF());
        Assert.assertSame(character, character.asCharacter());

        Token.EOF eof = new Token.EOF();
        Assert.assertFalse(eof.isDoctype());
        Assert.assertFalse(eof.isStartTag());
        Assert.assertFalse(eof.isEndTag());
        Assert.assertFalse(eof.isComment());
        Assert.assertFalse(eof.isCharacter());
        Assert.assertTrue(eof.isEOF());
    }

    @Test
    public void doctype_givenInitializationAndPopulatedData_shouldResetCorrectly() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        Assert.assertEquals("html", doctype.getName());
        Assert.assertEquals("PUBLIC", doctype.getPubSysKey());
        Assert.assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        Assert.assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        Assert.assertTrue(doctype.isForceQuirks());

        Token resetToken = doctype.reset();
        Assert.assertSame(doctype, resetToken);
        Assert.assertEquals("", doctype.getName());
        Assert.assertNull(doctype.getPubSysKey());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void comment_givenDataAndBogusFlag_shouldResetAndFormatToString() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a test comment");
        comment.bogus = true;

        Assert.assertEquals("This is a test comment", comment.getData());
        Assert.assertEquals("<!--This is a test comment-->", comment.toString());

        Token resetComment = comment.reset();
        Assert.assertSame(comment, resetComment);
        Assert.assertEquals("", comment.getData());
        Assert.assertFalse(comment.bogus);
        Assert.assertEquals("<!---->", comment.toString());
    }

    @Test
    public void character_givenData_shouldSetAndResetCorrectly() {
        Token.Character character = new Token.Character();
        character.data("text node data");

        Assert.assertEquals("text node data", character.getData());
        Assert.assertEquals("text node data", character.toString());

        Token resetChar = character.reset();
        Assert.assertSame(character, resetChar);
        Assert.assertNull(character.getData());
        Assert.assertNull(character.toString());
    }

    @Test
    public void eof_givenInvocation_shouldResetToSelf() {
        Token.EOF eof = new Token.EOF();
        Token resetToken = eof.reset();
        Assert.assertSame(eof, resetToken);
    }

    @Test
    public void tag_givenNameManipulation_shouldPreserveCaseAndProvideNormalName() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("DIV");

        Assert.assertEquals("DIV", tag.name());
        Assert.assertEquals("div", tag.normalName());

        tag.appendTagName("test");
        Assert.assertEquals("DIVtest", tag.name());
        Assert.assertEquals("divtest", tag.normalName());

        tag.appendTagName('1');
        Assert.assertEquals("DIVtest1", tag.name());
        Assert.assertEquals("divtest1", tag.normalName());
    }

    @Test
    public void tag_appendTagNameWhenNull_shouldInitializeName() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendTagName('p');
        Assert.assertEquals("p", tag.name());
        Assert.assertEquals("p", tag.normalName());

        Token.EndTag tag2 = new Token.EndTag();
        tag2.appendTagName("span");
        Assert.assertEquals("span", tag2.name());
        Assert.assertEquals("span", tag2.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void name_givenNullTagName_shouldThrowException() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void name_givenEmptyTagName_shouldThrowException() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        tag.name();
    }

    @Test
    public void tag_givenBooleanAttribute_shouldCreateBooleanAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("required");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertTrue(attrs.hasKey("required"));
        Attribute attr = attrs.asList().get(0);
        Assert.assertEquals("required", attr.getKey());
        Assert.assertEquals("", attr.getValue());
    }

    @Test
    public void tag_givenEmptyAttributeValue_shouldCreateEmptyAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName('v');
        tag.appendAttributeName("alue");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertTrue(attrs.hasKey("value"));
        Attribute attr = attrs.asList().get(0);
        Assert.assertEquals("value", attr.getKey());
        Assert.assertEquals("", attr.getValue());
    }

    @Test
    public void tag_givenSingleShotAttributeValue_shouldUsePendingAttributeValueS() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertTrue(attrs.hasKey("href"));
        Assert.assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void tag_givenAppendedAttributeValues_shouldAccumulateInStringBuilder() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://");
        tag.appendAttributeValue("example.com");
        tag.appendAttributeValue('/');
        tag.appendAttributeValue(new char[]{'p', 'a', 't', 'h'});
        tag.appendAttributeValue(new int[]{63, 113, 61, 49}); // "?q=1"
        tag.finaliseTag();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertEquals("http://example.com/path?q=1", attrs.get("href"));
    }

    @Test
    public void tag_givenAttributeWithWhitespace_shouldTrimAttributeName() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("  id  ");
        tag.appendAttributeValue("content");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertTrue(attrs.hasKey("id"));
        Assert.assertEquals("content", attrs.get("id"));
    }

    @Test
    public void tag_givenNullAttributeNameOnNewAttribute_shouldIgnoreAndNotThrow() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertEquals(0, attrs.size());
    }

    @Test
    public void tag_givenFinaliseTagWithPendingName_shouldFlushAttribute() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("custom");
        tag.appendAttributeName("attr");
        tag.appendAttributeValue("val");
        tag.finaliseTag();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertEquals("val", attrs.get("attr"));
    }

    @Test
    public void tag_givenFinaliseTagWithoutPendingName_shouldDoNothing() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("custom");
        tag.finaliseTag();

        Assert.assertNull(tag.getAttributes());
    }

    @Test
    public void startTag_givenNameAttrAndReset_shouldHandleAttributesProperly() {
        Token.StartTag tag = new Token.StartTag();
        Attributes initialAttrs = new Attributes();
        initialAttrs.put("class", "bold");
        tag.nameAttr("SPAN", initialAttrs);
        tag.selfClosing = true;

        Assert.assertEquals("SPAN", tag.name());
        Assert.assertEquals("span", tag.normalName());
        Assert.assertTrue(tag.isSelfClosing());
        Assert.assertEquals("<SPAN class=\"bold\">", tag.toString());

        tag.reset();
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertNotNull(tag.getAttributes());
        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void startTag_toStringWithoutAttributes_shouldRenderCorrectly() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        Assert.assertEquals("<br>", tag.toString());

        tag.attributes = null;
        Assert.assertEquals("<br>", tag.toString());
    }

    @Test
    public void endTag_toString_shouldRenderCorrectly() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("div");
        Assert.assertEquals("</div>", tag.toString());
    }

    @Test
    public void tokenTypeEnum_valuesAndValueOf_shouldBeValid() {
        Token.TokenType[] types = Token.TokenType.values();
        Assert.assertEquals(6, types.length);
        Assert.assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        Assert.assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        Assert.assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        Assert.assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        Assert.assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        Assert.assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }
}