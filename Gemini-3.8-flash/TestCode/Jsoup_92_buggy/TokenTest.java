package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {

    // ==========================================
    // Static Helper & Base Token Tests
    // ==========================================

    @Test
    public void resetStringBuilder_givenNullStringBuilder_shouldNotThrowException() {
        Token.reset((StringBuilder) null);
    }

    @Test
    public void resetStringBuilder_givenPopulatedStringBuilder_shouldClearContent() {
        StringBuilder sb = new StringBuilder("some data");
        Token.reset(sb);
        Assert.assertEquals(0, sb.length());
    }

    @Test
    public void tokenType_givenEachTokenType_shouldReturnSimpleClassName() {
        Token doctype = new Token.Doctype();
        Token startTag = new Token.StartTag();
        Token endTag = new Token.EndTag();
        Token comment = new Token.Comment();
        Token character = new Token.Character();
        Token cdata = new Token.CData("data");
        Token eof = new Token.EOF();

        Assert.assertEquals("Doctype", doctype.tokenType());
        Assert.assertEquals("StartTag", startTag.tokenType());
        Assert.assertEquals("EndTag", endTag.tokenType());
        Assert.assertEquals("Comment", comment.tokenType());
        Assert.assertEquals("Character", character.tokenType());
        Assert.assertEquals("CData", cdata.tokenType());
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void tokenTypeEnum_values_shouldContainAllDeclaredConstants() {
        Token.TokenType[] types = Token.TokenType.values();
        Assert.assertEquals(6, types.length);
        Assert.assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        Assert.assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        Assert.assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        Assert.assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        Assert.assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        Assert.assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }

    // ==========================================
    // Type Checking & Casting Tests
    // ==========================================

    @Test
    public void isDoctype_givenDoctypeToken_shouldReturnTrueAndCastCorrectly() {
        Token token = new Token.Doctype();
        Assert.assertTrue(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertFalse(token.isCharacter());
        Assert.assertFalse(token.isCData());
        Assert.assertFalse(token.isEOF());
        Assert.assertNotNull(token.asDoctype());
    }

    @Test(expected = ClassCastException.class)
    public void asDoctype_givenNonDoctypeToken_shouldThrowClassCastException() {
        Token token = new Token.StartTag();
        token.asDoctype();
    }

    @Test
    public void isStartTag_givenStartTagToken_shouldReturnTrueAndCastCorrectly() {
        Token token = new Token.StartTag();
        Assert.assertFalse(token.isDoctype());
        Assert.assertTrue(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertFalse(token.isCharacter());
        Assert.assertFalse(token.isCData());
        Assert.assertFalse(token.isEOF());
        Assert.assertNotNull(token.asStartTag());
    }

    @Test(expected = ClassCastException.class)
    public void asStartTag_givenNonStartTagToken_shouldThrowClassCastException() {
        Token token = new Token.EndTag();
        token.asStartTag();
    }

    @Test
    public void isEndTag_givenEndTagToken_shouldReturnTrueAndCastCorrectly() {
        Token token = new Token.EndTag();
        Assert.assertFalse(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertTrue(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertFalse(token.isCharacter());
        Assert.assertFalse(token.isCData());
        Assert.assertFalse(token.isEOF());
        Assert.assertNotNull(token.asEndTag());
    }

    @Test(expected = ClassCastException.class)
    public void asEndTag_givenNonEndTagToken_shouldThrowClassCastException() {
        Token token = new Token.StartTag();
        token.asEndTag();
    }

    @Test
    public void isComment_givenCommentToken_shouldReturnTrueAndCastCorrectly() {
        Token token = new Token.Comment();
        Assert.assertFalse(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertTrue(token.isComment());
        Assert.assertFalse(token.isCharacter());
        Assert.assertFalse(token.isCData());
        Assert.assertFalse(token.isEOF());
        Assert.assertNotNull(token.asComment());
    }

    @Test(expected = ClassCastException.class)
    public void asComment_givenNonCommentToken_shouldThrowClassCastException() {
        Token token = new Token.Character();
        token.asComment();
    }

    @Test
    public void isCharacter_givenCharacterToken_shouldReturnTrueAndCastCorrectly() {
        Token token = new Token.Character();
        Assert.assertFalse(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertTrue(token.isCharacter());
        Assert.assertFalse(token.isCData());
        Assert.assertFalse(token.isEOF());
        Assert.assertNotNull(token.asCharacter());
    }

    @Test(expected = ClassCastException.class)
    public void asCharacter_givenNonCharacterToken_shouldThrowClassCastException() {
        Token token = new Token.Comment();
        token.asCharacter();
    }

    @Test
    public void isCData_givenCDataToken_shouldReturnTrueForCDataAndCharacter() {
        Token token = new Token.CData("content");
        Assert.assertTrue(token.isCData());
        Assert.assertTrue(token.isCharacter());
        Assert.assertFalse(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertFalse(token.isEOF());
    }

    @Test
    public void isEOF_givenEOFToken_shouldReturnTrue() {
        Token token = new Token.EOF();
        Assert.assertTrue(token.isEOF());
        Assert.assertFalse(token.isDoctype());
        Assert.assertFalse(token.isStartTag());
        Assert.assertFalse(token.isEndTag());
        Assert.assertFalse(token.isComment());
        Assert.assertFalse(token.isCharacter());
        Assert.assertFalse(token.isCData());
    }

    // ==========================================
    // Doctype Token Tests
    // ==========================================

    @Test
    public void doctype_defaultState_shouldHaveExpectedDefaults() {
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertEquals("", doctype.getName());
        Assert.assertNull(doctype.getPubSysKey());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void doctype_reset_shouldRestoreDefaults() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        Token resetResult = doctype.reset();

        Assert.assertSame(doctype, resetResult);
        Assert.assertEquals("", doctype.getName());
        Assert.assertNull(doctype.getPubSysKey());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    // ==========================================
    // Comment Token Tests
    // ==========================================

    @Test
    public void comment_defaultState_shouldHaveEmptyDataAndFalseBogus() {
        Token.Comment comment = new Token.Comment();
        Assert.assertEquals("", comment.getData());
        Assert.assertFalse(comment.bogus);
        Assert.assertEquals("<!---->", comment.toString());
    }

    @Test
    public void comment_reset_shouldClearDataAndBogusFlag() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("comment text");
        comment.bogus = true;
        Assert.assertEquals("<!--comment text-->", comment.toString());

        Token resetResult = comment.reset();

        Assert.assertSame(comment, resetResult);
        Assert.assertEquals("", comment.getData());
        Assert.assertFalse(comment.bogus);
        Assert.assertEquals("<!---->", comment.toString());
    }

    // ==========================================
    // Character & CData Token Tests
    // ==========================================

    @Test
    public void character_dataAndToString_shouldMatchConfiguredValue() {
        Token.Character character = new Token.Character();
        Assert.assertNull(character.getData());
        Assert.assertNull(character.toString());

        Token.Character chained = character.data("abc");
        Assert.assertSame(character, chained);
        Assert.assertEquals("abc", character.getData());
        Assert.assertEquals("abc", character.toString());
    }

    @Test
    public void character_reset_shouldClearData() {
        Token.Character character = new Token.Character();
        character.data("test");

        Token resetResult = character.reset();

        Assert.assertSame(character, resetResult);
        Assert.assertNull(character.getData());
    }

    @Test
    public void cdata_constructorAndToString_shouldWrapInCdataSyntax() {
        Token.CData cdata = new Token.CData("raw <xml> data");
        Assert.assertEquals("raw <xml> data", cdata.getData());
        Assert.assertEquals("<![CDATA[raw <xml> data]]>", cdata.toString());
    }

    // ==========================================
    // EOF Token Tests
    // ==========================================

    @Test
    public void eof_reset_shouldReturnSelf() {
        Token.EOF eof = new Token.EOF();
        Token resetResult = eof.reset();
        Assert.assertSame(eof, resetResult);
        Assert.assertTrue(eof.isEOF());
    }

    // ==========================================
    // Tag Base Logic Tests (via StartTag & EndTag)
    // ==========================================

    @Test
    public void tag_nameAndNormalName_shouldHandleMixedCase() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("DIV");
        Assert.assertEquals("DIV", tag.name());
        Assert.assertEquals("div", tag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tag_name_whenTagNameIsNull_shouldThrowException() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void tag_name_whenTagNameIsEmpty_shouldThrowException() {
        Token.StartTag tag = new Token.StartTag();
        tag.tagName = "";
        tag.name();
    }

    @Test
    public void tag_appendTagName_givenString_shouldAppendCorrectly() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("d");
        Assert.assertEquals("d", tag.name());
        Assert.assertEquals("d", tag.normalName());

        tag.appendTagName("IV");
        Assert.assertEquals("dIV", tag.name());
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void tag_appendTagName_givenChar_shouldAppendCorrectly() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('s');
        tag.appendTagName('P');
        tag.appendTagName('a');
        tag.appendTagName('N');
        Assert.assertEquals("sPaN", tag.name());
        Assert.assertEquals("span", tag.normalName());
    }

    @Test
    public void tag_isSelfClosing_shouldReflectProperty() {
        Token.StartTag tag = new Token.StartTag();
        Assert.assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void tag_appendAttributeName_givenStringAndChar_shouldConcatenate() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("data");
        tag.appendAttributeName('-');
        tag.appendAttributeName("val");
        tag.setEmptyAttributeValue();
        tag.finaliseTag();

        Attributes attrs = tag.getAttributes();
        Assert.assertNotNull(attrs);
        Assert.assertTrue(attrs.hasKey("data-val"));
        Assert.assertEquals("", attrs.get("data-val"));
    }

    @Test
    public void tag_appendAttributeValue_singleString_shouldBePreserved() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.finaliseTag();

        Assert.assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void tag_appendAttributeValue_multipleStrings_shouldTransitionToBuilderAndConcatenate() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://");
        tag.appendAttributeValue("example.com");
        tag.finaliseTag();

        Assert.assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void tag_appendAttributeValue_charAndCharArrayAndCodePoints_shouldConcatenateProperly() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("span");
        tag.appendAttributeName("title");
        tag.appendAttributeValue('A');
        tag.appendAttributeValue(new char[]{'B', 'C'});
        tag.appendAttributeValue(new int[]{0x44, 0x45}); // 'D', 'E'
        tag.finaliseTag();

        Assert.assertEquals("ABCDE", tag.getAttributes().get("title"));
    }

    @Test
    public void tag_newAttribute_givenNullAttributeValue_shouldStoreNullValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("disabled");
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("disabled"));
        Assert.assertNull(tag.getAttributes().get("disabled"));
    }

    @Test
    public void tag_newAttribute_givenEmptyAttributeValue_shouldStoreEmptyString() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("checked");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("checked"));
        Assert.assertEquals("", tag.getAttributes().get("checked"));
    }

    @Test
    public void tag_newAttribute_givenWhitespaceOnlyAttributeName_shouldNotAddAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("   ");
        tag.appendAttributeValue("val");
        tag.newAttribute();

        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void tag_finaliseTag_whenPendingAttributeNameIsNull_shouldDoNothing() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.finaliseTag();

        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void tag_reset_shouldClearAllState() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.selfClosing = true;
        tag.appendAttributeName("class");
        tag.appendAttributeValue("test");
        tag.newAttribute();

        tag.reset();

        Assert.assertNull(tag.tagName);
        Assert.assertNull(tag.normalName());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertNotNull(tag.getAttributes());
        Assert.assertEquals(0, tag.getAttributes().size());
    }

    // ==========================================
    // StartTag Specific Tests
    // ==========================================

    @Test
    public void startTag_nameAttr_shouldSetTagNameAndAttributes() {
        Token.StartTag tag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("id", "main");

        Token.StartTag result = tag.nameAttr("DIV", attrs);

        Assert.assertSame(tag, result);
        Assert.assertEquals("DIV", tag.name());
        Assert.assertEquals("div", tag.normalName());
        Assert.assertSame(attrs, tag.getAttributes());
    }

    @Test
    public void startTag_toString_withAttributes_shouldFormatWithAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("content");
        tag.finaliseTag();

        String str = tag.toString();
        Assert.assertTrue(str.startsWith("<div "));
        Assert.assertTrue(str.contains("id=\"content\""));
        Assert.assertTrue(str.endsWith(">"));
    }

    @Test
    public void startTag_toString_withoutAttributes_shouldFormatSimply() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        Assert.assertEquals("<p>", tag.toString());
    }

    @Test
    public void startTag_toString_withNullAttributes_shouldFormatSimply() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        tag.attributes = null;
        Assert.assertEquals("<br>", tag.toString());
    }

    // ==========================================
    // EndTag Specific Tests
    // ==========================================

    @Test
    public void endTag_constructor_shouldInitializeAttributesAsNull() {
        Token.EndTag tag = new Token.EndTag();
        Assert.assertNull(tag.getAttributes());
    }

    @Test
    public void endTag_newAttribute_whenAttributesInitiallyNull_shouldInitializeAttributes() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("p");
        tag.appendAttributeName("class");
        tag.appendAttributeValue("test");
        tag.newAttribute();

        Assert.assertNotNull(tag.getAttributes());
        Assert.assertEquals("test", tag.getAttributes().get("class"));
    }

    @Test
    public void endTag_toString_shouldFormatAsClosingTag() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("div");
        Assert.assertEquals("</div>", tag.toString());
    }

    @Test
    public void endTag_reset_shouldResetAttributesToNull() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("span");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("s1");
        tag.newAttribute();
        Assert.assertNotNull(tag.getAttributes());

        tag.reset();

        Assert.assertNull(tag.getAttributes());
        Assert.assertNull(tag.tagName);
        Assert.assertNull(tag.normalName());
    }
}