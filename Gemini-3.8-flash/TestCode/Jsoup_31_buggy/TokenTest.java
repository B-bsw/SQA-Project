package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {

    @Test
    public void tokenType_givenDoctypeToken_shouldReturnSimpleClassName() {
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertEquals("Doctype", doctype.tokenType());
    }

    @Test
    public void tokenType_givenStartTagToken_shouldReturnSimpleClassName() {
        Token.StartTag startTag = new Token.StartTag();
        Assert.assertEquals("StartTag", startTag.tokenType());
    }

    @Test
    public void tokenType_givenEndTagToken_shouldReturnSimpleClassName() {
        Token.EndTag endTag = new Token.EndTag();
        Assert.assertEquals("EndTag", endTag.tokenType());
    }

    @Test
    public void tokenType_givenCommentToken_shouldReturnSimpleClassName() {
        Token.Comment comment = new Token.Comment();
        Assert.assertEquals("Comment", comment.tokenType());
    }

    @Test
    public void tokenType_givenCharacterToken_shouldReturnSimpleClassName() {
        Token.Character character = new Token.Character("test");
        Assert.assertEquals("Character", character.tokenType());
    }

    @Test
    public void tokenType_givenEOFToken_shouldReturnSimpleClassName() {
        Token.EOF eof = new Token.EOF();
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void doctype_givenDefaultConstructor_shouldInitializeEmptyFieldsAndFalseQuirks() {
        Token.Doctype doctype = new Token.Doctype();

        Assert.assertTrue(doctype.isDoctype());
        Assert.assertFalse(doctype.isStartTag());
        Assert.assertFalse(doctype.isEndTag());
        Assert.assertFalse(doctype.isComment());
        Assert.assertFalse(doctype.isCharacter());
        Assert.assertFalse(doctype.isEOF());

        Assert.assertEquals("", doctype.getName());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
        Assert.assertSame(doctype, doctype.asDoctype());
    }

    @Test
    public void doctype_givenPopulatedFields_shouldReturnCorrectValues() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        Assert.assertEquals("html", doctype.getName());
        Assert.assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        Assert.assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        Assert.assertTrue(doctype.isForceQuirks());
    }

    @Test(expected = ClassCastException.class)
    public void asDoctype_givenNonDoctypeToken_shouldThrowClassCastException() {
        Token token = new Token.EOF();
        token.asDoctype();
    }

    @Test
    public void startTag_givenDefaultConstructor_shouldInitializeCorrectDefaults() {
        Token.StartTag startTag = new Token.StartTag();

        Assert.assertFalse(doctypeTypeCheck(startTag));
        Assert.assertTrue(startTag.isStartTag());
        Assert.assertFalse(startTag.isEndTag());
        Assert.assertFalse(startTag.isComment());
        Assert.assertFalse(startTag.isCharacter());
        Assert.assertFalse(startTag.isEOF());

        Assert.assertNotNull(startTag.getAttributes());
        Assert.assertEquals(0, startTag.getAttributes().size());
        Assert.assertFalse(startTag.isSelfClosing());
        Assert.assertSame(startTag, startTag.asStartTag());
    }

    private boolean doctypeTypeCheck(Token token) {
        return token.isDoctype();
    }

    @Test
    public void startTag_givenNameConstructor_shouldSetTagName() {
        Token.StartTag startTag = new Token.StartTag("div");

        Assert.assertEquals("div", startTag.name());
        Assert.assertNotNull(startTag.getAttributes());
        Assert.assertEquals("<div>", startTag.toString());
    }

    @Test
    public void startTag_givenNameAndAttributesConstructor_shouldRetainBoth() {
        Attributes attributes = new Attributes();
        attributes.put("class", "container");
        Token.StartTag startTag = new Token.StartTag("span", attributes);

        Assert.assertEquals("span", startTag.name());
        Assert.assertSame(attributes, startTag.getAttributes());
        Assert.assertEquals("<span class=\"container\">", startTag.toString());
    }

    @Test
    public void startTag_toString_givenEmptyAttributes_shouldNotIncludeAttributesString() {
        Token.StartTag startTag = new Token.StartTag("p");
        Assert.assertEquals("<p>", startTag.toString());
    }

    @Test
    public void startTag_toString_givenNullAttributes_shouldNotIncludeAttributesString() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.attributes = null;

        Assert.assertEquals("<br>", startTag.toString());
    }

    @Test(expected = ClassCastException.class)
    public void asStartTag_givenNonStartTagToken_shouldThrowClassCastException() {
        Token token = new Token.Comment();
        token.asStartTag();
    }

    @Test
    public void endTag_givenDefaultConstructor_shouldInitializeCorrectDefaults() {
        Token.EndTag endTag = new Token.EndTag();

        Assert.assertFalse(endTag.isDoctype());
        Assert.assertFalse(endTag.isStartTag());
        Assert.assertTrue(endTag.isEndTag());
        Assert.assertFalse(endTag.isComment());
        Assert.assertFalse(endTag.isCharacter());
        Assert.assertFalse(endTag.isEOF());
        Assert.assertNull(endTag.getAttributes());
        Assert.assertSame(endTag, endTag.asEndTag());
    }

    @Test
    public void endTag_givenNameConstructor_shouldSetTagNameAndFormatToString() {
        Token.EndTag endTag = new Token.EndTag("div");

        Assert.assertEquals("div", endTag.name());
        Assert.assertEquals("</div>", endTag.toString());
    }

    @Test(expected = ClassCastException.class)
    public void asEndTag_givenNonEndTagToken_shouldThrowClassCastException() {
        Token token = new Token.StartTag("a");
        token.asEndTag();
    }

    @Test
    public void tag_appendTagNameString_givenNullExistingTagName_shouldSetTagName() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("input");

        Assert.assertEquals("input", tag.name());
    }

    @Test
    public void tag_appendTagNameString_givenExistingTagName_shouldConcatenate() {
        Token.StartTag tag = new Token.StartTag("in");
        tag.appendTagName("put");

        Assert.assertEquals("input", tag.name());
    }

    @Test
    public void tag_appendTagNameChar_givenNullExistingTagName_shouldSetCharAsString() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('p');

        Assert.assertEquals("p", tag.name());
    }

    @Test
    public void tag_appendTagNameChar_givenExistingTagName_shouldConcatenateChar() {
        Token.StartTag tag = new Token.StartTag("h");
        tag.appendTagName('1');

        Assert.assertEquals("h1", tag.name());
    }

    @Test
    public void tag_nameSetter_givenValidName_shouldUpdateTagNameAndReturnTag() {
        Token.StartTag tag = new Token.StartTag();
        Token.Tag result = tag.name("table");

        Assert.assertSame(tag, result);
        Assert.assertEquals("table", tag.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tag_name_givenEmptyTagName_shouldThrowValidationException() {
        Token.StartTag tag = new Token.StartTag("");
        tag.name();
    }

    @Test(expected = NullPointerException.class)
    public void tag_name_givenNullTagName_shouldThrowNullPointerException() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test
    public void tag_isSelfClosing_givenExplicitSetting_shouldReflectState() {
        Token.StartTag tag = new Token.StartTag("img");
        Assert.assertFalse(tag.isSelfClosing());

        tag.selfClosing = true;
        Assert.assertTrue(tag.isSelfClosing());
    }

    @Test
    public void tag_appendAttributeNameString_givenNullExistingAttributeName_shouldSetAttributeName() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("hr");
        tag.appendAttributeName("ef");
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("href"));
        Assert.assertEquals("", tag.getAttributes().get("href"));
    }

    @Test
    public void tag_appendAttributeNameChar_givenNullExistingAttributeName_shouldSetChar() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName('i');
        tag.appendAttributeName('d');
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("id"));
    }

    @Test
    public void tag_appendAttributeValueString_givenNullExistingAttributeValue_shouldSetValue() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://");
        tag.appendAttributeValue("example.com");
        tag.newAttribute();

        Assert.assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void tag_appendAttributeValueChar_givenNullExistingAttributeValue_shouldAppendChar() {
        Token.StartTag tag = new Token.StartTag("input");
        tag.appendAttributeName("disabled");
        tag.appendAttributeValue('t');
        tag.appendAttributeValue('r');
        tag.appendAttributeValue('u');
        tag.appendAttributeValue('e');
        tag.newAttribute();

        Assert.assertEquals("true", tag.getAttributes().get("disabled"));
    }

    @Test
    public void tag_newAttribute_givenNullAttributesContainer_shouldCreateAttributesInstance() {
        Token.EndTag endTag = new Token.EndTag("div");
        Assert.assertNull(endTag.getAttributes());

        endTag.appendAttributeName("class");
        endTag.appendAttributeValue("test");
        endTag.newAttribute();

        Assert.assertNotNull(endTag.getAttributes());
        Assert.assertTrue(endTag.getAttributes().hasKey("class"));
        Assert.assertEquals("test", endTag.getAttributes().get("class"));
    }

    @Test
    public void tag_newAttribute_givenNullPendingAttributeName_shouldNotAddAttribute() {
        Token.StartTag tag = new Token.StartTag("p");
        int initialSize = tag.getAttributes().size();

        tag.newAttribute();

        Assert.assertEquals(initialSize, tag.getAttributes().size());
    }

    @Test
    public void tag_newAttribute_givenMultipleAttributesSequentially_shouldAddAllAndResetPending() {
        Token.StartTag tag = new Token.StartTag("input");

        tag.appendAttributeName("type");
        tag.appendAttributeValue("text");
        tag.newAttribute();

        tag.appendAttributeName("name");
        tag.appendAttributeValue("username");
        tag.newAttribute();

        Attributes attributes = tag.getAttributes();
        Assert.assertEquals(2, attributes.size());
        Assert.assertEquals("text", attributes.get("type"));
        Assert.assertEquals("username", attributes.get("name"));
    }

    @Test
    public void tag_finaliseTag_givenPendingAttributeName_shouldCallNewAttribute() {
        Token.StartTag tag = new Token.StartTag("input");
        tag.appendAttributeName("checked");

        tag.finaliseTag();

        Assert.assertTrue(tag.getAttributes().hasKey("checked"));
        Assert.assertEquals("", tag.getAttributes().get("checked"));
    }

    @Test
    public void tag_finaliseTag_givenNullPendingAttributeName_shouldDoNothing() {
        Token.StartTag tag = new Token.StartTag("input");
        tag.finaliseTag();

        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void comment_givenDefaultConstructor_shouldInitializeEmptyData() {
        Token.Comment comment = new Token.Comment();

        Assert.assertFalse(comment.isDoctype());
        Assert.assertFalse(comment.isStartTag());
        Assert.assertFalse(comment.isEndTag());
        Assert.assertTrue(comment.isComment());
        Assert.assertFalse(comment.isCharacter());
        Assert.assertFalse(comment.isEOF());

        Assert.assertEquals("", comment.getData());
        Assert.assertEquals("<!---->", comment.toString());
        Assert.assertSame(comment, comment.asComment());
    }

    @Test
    public void comment_givenAppendedData_shouldReturnFormattedComment() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("sample comment");

        Assert.assertEquals("sample comment", comment.getData());
        Assert.assertEquals("<!--sample comment-->", comment.toString());
    }

    @Test(expected = ClassCastException.class)
    public void asComment_givenNonCommentToken_shouldThrowClassCastException() {
        Token token = new Token.EOF();
        token.asComment();
    }

    @Test
    public void character_givenStringData_shouldInitializeAndFormatCorrectly() {
        Token.Character character = new Token.Character("sample text");

        Assert.assertFalse(character.isDoctype());
        Assert.assertFalse(character.isStartTag());
        Assert.assertFalse(character.isEndTag());
        Assert.assertFalse(character.isComment());
        Assert.assertTrue(character.isCharacter());
        Assert.assertFalse(character.isEOF());

        Assert.assertEquals("sample text", character.getData());
        Assert.assertEquals("sample text", character.toString());
        Assert.assertSame(character, character.asCharacter());
    }

    @Test
    public void character_givenNullData_shouldReturnNullDataAndString() {
        Token.Character character = new Token.Character(null);

        Assert.assertNull(character.getData());
        Assert.assertNull(character.toString());
    }

    @Test(expected = ClassCastException.class)
    public void asCharacter_givenNonCharacterToken_shouldThrowClassCastException() {
        Token token = new Token.EOF();
        token.asCharacter();
    }

    @Test
    public void eof_givenDefaultConstructor_shouldInitializeCorrectTokenType() {
        Token.EOF eof = new Token.EOF();

        Assert.assertFalse(eof.isDoctype());
        Assert.assertFalse(eof.isStartTag());
        Assert.assertFalse(eof.isEndTag());
        Assert.assertFalse(eof.isComment());
        Assert.assertFalse(eof.isCharacter());
        Assert.assertTrue(eof.isEOF());
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void tokenTypeEnum_valuesAndValueOf_shouldContainAllTokenTypes() {
        Token.TokenType[] expectedTypes = new Token.TokenType[] {
            Token.TokenType.Doctype,
            Token.TokenType.StartTag,
            Token.TokenType.EndTag,
            Token.TokenType.Comment,
            Token.TokenType.Character,
            Token.TokenType.EOF
        };

        Token.TokenType[] actualTypes = Token.TokenType.values();
        Assert.assertEquals(expectedTypes.length, actualTypes.length);

        for (int i = 0; i < expectedTypes.length; i++) {
            Assert.assertEquals(expectedTypes[i], actualTypes[i]);
            Assert.assertEquals(expectedTypes[i], Token.TokenType.valueOf(expectedTypes[i].name()));
        }
    }
}