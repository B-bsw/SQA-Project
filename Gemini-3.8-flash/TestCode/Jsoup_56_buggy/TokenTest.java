/*
 * TEST MATRIX & CODE ANALYSIS:
 *
 * 1. Token (Base & Static utility):
 *    - reset(StringBuilder): null handling (boundary), non-null deletion (happy path)
 *    - tokenType(): simple class name verification for each subclass
 *    - Type check predicates (isDoctype, isStartTag, isEndTag, isComment, isCharacter, isEOF)
 *    - Type casting methods (asDoctype, asStartTag, asEndTag, asComment, asCharacter)
 *
 * 2. Doctype:
 *    - Initialization defaults (forceQuirks=false, empty StringBuilders)
 *    - Mutate fields & verify reset() restores clean state
 *    - Getters for name, publicIdentifier, systemIdentifier, forceQuirks
 *
 * 3. Tag (Abstract base for StartTag / EndTag):
 *    - Tag name & normalName handling (case sensitivity vs lower-case)
 *    - name(): exception when tagName is null or empty
 *    - appendTagName(String): null state vs concatenated state
 *    - appendTagName(char): single char append
 *    - appendAttributeName(String / char): null state vs concatenated state
 *    - appendAttributeValue(String): single shot optimization (pendingAttributeValueS)
 *    - appendAttributeValue(String) subsequent append: transfer to pendingAttributeValue builder
 *    - appendAttributeValue(char), appendAttributeValue(char[]), appendAttributeValue(int[] codepoints)
 *    - newAttribute():
 *      * pendingAttributeName == null (no-op)
 *      * attributes == null initial state (e.g. EndTag) initializes Attributes
 *      * hasPendingAttributeValue: builder length > 0 vs pendingAttributeValueS
 *      * hasEmptyAttributeValue: Attribute with empty string
 *      * boolean attribute fallback: BooleanAttribute created
 *    - finaliseTag(): invokes newAttribute() only when pendingAttributeName != null
 *    - reset(): resets all attribute and tag state
 *    - isSelfClosing(): flag verification
 *
 * 4. StartTag:
 *    - Constructor creates empty attributes container
 *    - nameAttr(name, attributes) sets name, normalName, and attributes
 *    - toString(): with empty attributes vs with attributes
 *    - reset(): ensures fresh Attributes container
 *
 * 5. EndTag:
 *    - Constructor and type verification
 *    - toString(): "</tagName>" format
 *
 * 6. Comment:
 *    - append data, bogus flag, toString() "<!--data-->", and reset()
 *
 * 7. Character:
 *    - data(String), getData(), toString(), and reset()
 *
 * 8. EOF:
 *    - Constructor, type verification, and reset()
 */

package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {

    // ==========================================
    // Token Base & Utility Tests
    // ==========================================

    @Test
    public void resetStringBuilder_givenNullStringBuilder_shouldNotThrowException() {
        // Arrange
        StringBuilder sb = null;

        // Act
        Token.reset(sb);

        // Assert
        Assert.assertNull(sb);
    }

    @Test
    public void resetStringBuilder_givenPopulatedStringBuilder_shouldClearContent() {
        // Arrange
        StringBuilder sb = new StringBuilder("ExistingData");

        // Act
        Token.reset(sb);

        // Assert
        Assert.assertEquals(0, sb.length());
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void tokenType_givenDifferentSubclasses_shouldReturnCorrectSimpleNames() {
        // Arrange
        Token doctype = new Token.Doctype();
        Token startTag = new Token.StartTag();
        Token endTag = new Token.EndTag();
        Token comment = new Token.Comment();
        Token character = new Token.Character();
        Token eof = new Token.EOF();

        // Act & Assert
        Assert.assertEquals("Doctype", doctype.tokenType());
        Assert.assertEquals("StartTag", startTag.tokenType());
        Assert.assertEquals("EndTag", endTag.tokenType());
        Assert.assertEquals("Comment", comment.tokenType());
        Assert.assertEquals("Character", character.tokenType());
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void tokenClassification_givenEachTokenType_shouldCorrectlyIdentifyAndCast() {
        // Arrange
        Token doctype = new Token.Doctype();
        Token startTag = new Token.StartTag();
        Token endTag = new Token.EndTag();
        Token comment = new Token.Comment();
        Token character = new Token.Character();
        Token eof = new Token.EOF();

        // Act & Assert - Doctype
        Assert.assertTrue(doctype.isDoctype());
        Assert.assertFalse(doctype.isStartTag());
        Assert.assertNotNull(doctype.asDoctype());

        // Act & Assert - StartTag
        Assert.assertTrue(startTag.isStartTag());
        Assert.assertFalse(startTag.isEndTag());
        Assert.assertNotNull(startTag.asStartTag());

        // Act & Assert - EndTag
        Assert.assertTrue(endTag.isEndTag());
        Assert.assertFalse(endTag.isStartTag());
        Assert.assertNotNull(endTag.asEndTag());

        // Act & Assert - Comment
        Assert.assertTrue(comment.isComment());
        Assert.assertFalse(comment.isCharacter());
        Assert.assertNotNull(comment.asComment());

        // Act & Assert - Character
        Assert.assertTrue(character.isCharacter());
        Assert.assertFalse(character.isComment());
        Assert.assertNotNull(character.asCharacter());

        // Act & Assert - EOF
        Assert.assertTrue(eof.isEOF());
        Assert.assertFalse(eof.isDoctype());
    }

    // ==========================================
    // Doctype Token Tests
    // ==========================================

    @Test
    public void doctype_givenDefaultConstructor_shouldHaveEmptyFieldsAndNoQuirks() {
        // Arrange & Act
        Token.Doctype doctype = new Token.Doctype();

        // Assert
        Assert.assertEquals("", doctype.getName());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void doctypeReset_givenPopulatedDoctype_shouldClearAllFields() {
        // Arrange
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("public_id");
        doctype.systemIdentifier.append("system_id");
        doctype.forceQuirks = true;

        // Act
        Token result = doctype.reset();

        // Assert
        Assert.assertSame(doctype, result);
        Assert.assertEquals("", doctype.getName());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    // ==========================================
    // Tag Token Tests (StartTag & EndTag)
    // ==========================================

    @Test
    public void tag_givenValidTagName_shouldPreserveCaseAndComputeNormalName() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act
        tag.name("DIV");

        // Assert
        Assert.assertEquals("DIV", tag.name());
        Assert.assertEquals("div", tag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenNullTagName_shouldThrowException() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.name("");

        // Act
        tag.name();
    }

    @Test
    public void appendTagName_givenString_shouldAccumulateAndLowerNormalName() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act - null initial state
        tag.appendTagName("d");
        // Act - non-null subsequent state
        tag.appendTagName("IV");

        // Assert
        Assert.assertEquals("dIV", tag.name());
        Assert.assertEquals("div", tag.normalName());
    }

    @Test
    public void appendTagName_givenChar_shouldAccumulate() {
        // Arrange
        Token.EndTag tag = new Token.EndTag();

        // Act
        tag.appendTagName('s');
        tag.appendTagName('P');
        tag.appendTagName('a');
        tag.appendTagName('N');

        // Assert
        Assert.assertEquals("sPaN", tag.name());
        Assert.assertEquals("span", tag.normalName());
    }

    @Test
    public void appendAttributeName_givenStringAndChar_shouldAccumulatePendingName() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act
        tag.appendAttributeName("data");
        tag.appendAttributeName('-');
        tag.appendAttributeName("id");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        // Assert
        Assert.assertNotNull(tag.getAttributes());
        Assert.assertTrue(tag.getAttributes().hasKey("data-id"));
        Assert.assertEquals("", tag.getAttributes().get("data-id"));
    }

    @Test
    public void appendAttributeValue_givenSingleString_shouldStoreInPendingString() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("class");

        // Act
        tag.appendAttributeValue("btn-primary");
        tag.newAttribute();

        // Assert
        Assert.assertEquals("btn-primary", tag.getAttributes().get("class"));
    }

    @Test
    public void appendAttributeValue_givenMultipleStrings_shouldCombineValues() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("href");

        // Act
        tag.appendAttributeValue("/path");
        tag.appendAttributeValue("?param=1");
        tag.appendAttributeValue("&param=2");
        tag.newAttribute();

        // Assert
        Assert.assertEquals("/path?param=1&param=2", tag.getAttributes().get("href"));
    }

    @Test
    public void appendAttributeValue_givenCharAndCharArrayAndCodePoints_shouldAccumulateCorrectly() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("val");

        // Act
        tag.appendAttributeValue('A');
        tag.appendAttributeValue(new char[]{'B', 'C'});
        tag.appendAttributeValue(new int[]{0x44, 0x45}); // 'D', 'E'
        tag.newAttribute();

        // Assert
        Assert.assertEquals("ABCDE", tag.getAttributes().get("val"));
    }

    @Test
    public void newAttribute_givenNoPendingAttributeName_shouldNotAddAttribute() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act
        tag.newAttribute();

        // Assert
        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void newAttribute_givenBooleanAttribute_shouldCreateBooleanAttribute() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("disabled");

        // Act
        tag.newAttribute();

        // Assert
        Assert.assertTrue(tag.getAttributes().hasKey("disabled"));
        Attribute attr = tag.getAttributes().asList().get(0);
        Assert.assertTrue(attr instanceof BooleanAttribute);
    }

    @Test
    public void newAttribute_givenEmptyAttributeValueSet_shouldCreateEmptyStringAttribute() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("novalue");
        tag.setEmptyAttributeValue();

        // Act
        tag.newAttribute();

        // Assert
        Assert.assertTrue(tag.getAttributes().hasKey("novalue"));
        Attribute attr = tag.getAttributes().asList().get(0);
        Assert.assertFalse(attr instanceof BooleanAttribute);
        Assert.assertEquals("", attr.getValue());
    }

    @Test
    public void finaliseTag_givenPendingAttributeName_shouldCommitAttribute() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.appendAttributeName("autofocus");

        // Act
        tag.finaliseTag();

        // Assert
        Assert.assertTrue(tag.getAttributes().hasKey("autofocus"));
    }

    @Test
    public void finaliseTag_givenNoPendingAttribute_shouldDoNothing() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();

        // Act
        tag.finaliseTag();

        // Assert
        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void endTagNewAttribute_givenNullInitialAttributes_shouldInstantiateAttributes() {
        // Arrange
        Token.EndTag endTag = new Token.EndTag();
        Assert.assertNull(endTag.getAttributes());

        // Act
        endTag.appendAttributeName("attr");
        endTag.newAttribute();

        // Assert
        Assert.assertNotNull(endTag.getAttributes());
        Assert.assertTrue(endTag.getAttributes().hasKey("attr"));
    }

    @Test
    public void tagReset_givenPopulatedTag_shouldResetAllAttributesAndFlags() {
        // Arrange
        Token.StartTag tag = new Token.StartTag();
        tag.name("DIV");
        tag.selfClosing = true;
        tag.appendAttributeName("key");
        tag.appendAttributeValue("value");
        tag.newAttribute();

        // Act
        Token.Tag result = tag.reset();

        // Assert
        Assert.assertSame(tag, result);
        Assert.assertNull(tag.normalName());
        Assert.assertFalse(tag.isSelfClosing());
        Assert.assertNotNull(tag.getAttributes());
        Assert.assertEquals(0, tag.getAttributes().size());
        try {
            tag.name();
            Assert.fail("Expected IllegalArgumentException on reset tag name()");
        } catch (IllegalArgumentException e) {
            // Success: tag name was cleared
        }
    }

    @Test
    public void startTag_givenNameAttr_shouldApplyAttributes() {
        // Arrange
        Token.StartTag startTag = new Token.StartTag();
        Attributes attributes = new Attributes();
        attributes.put("class", "main");

        // Act
        startTag.nameAttr("div", attributes);

        // Assert
        Assert.assertEquals("div", startTag.name());
        Assert.assertEquals("div", startTag.normalName());
        Assert.assertSame(attributes, startTag.getAttributes());
        Assert.assertEquals("main", startTag.getAttributes().get("class"));
    }

    @Test
    public void startTagToString_givenWithAndWithoutAttributes_shouldFormatHtml() {
        // Arrange
        Token.StartTag tagWithoutAttrs = new Token.StartTag();
        tagWithoutAttrs.name("p");

        Token.StartTag tagWithAttrs = new Token.StartTag();
        tagWithAttrs.name("a");
        tagWithAttrs.appendAttributeName("href");
        tagWithAttrs.appendAttributeValue("index.html");
        tagWithAttrs.newAttribute();

        // Act & Assert
        Assert.assertEquals("<p>", tagWithoutAttrs.toString());
        Assert.assertEquals("<a href=\"index.html\">", tagWithAttrs.toString());
    }

    @Test
    public void endTagToString_givenTagName_shouldFormatClosingHtmlTag() {
        // Arrange
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("span");

        // Act & Assert
        Assert.assertEquals("</span>", endTag.toString());
    }

    // ==========================================
    // Comment Token Tests
    // ==========================================

    @Test
    public void comment_givenDataAndBogusFlag_shouldFormatCorrectlyAndReset() {
        // Arrange
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a comment");
        comment.bogus = true;

        // Act
        String stringRepresentation = comment.toString();
        String commentData = comment.getData();
        Token result = comment.reset();

        // Assert
        Assert.assertSame(comment, result);
        Assert.assertEquals("This is a comment", commentData);
        Assert.assertEquals("<!--This is a comment-->", stringRepresentation);
        Assert.assertEquals("", comment.getData());
        Assert.assertFalse(comment.bogus);
    }

    // ==========================================
    // Character Token Tests
    // ==========================================

    @Test
    public void character_givenStringData_shouldReturnDataAndReset() {
        // Arrange
        Token.Character character = new Token.Character();
        character.data("Sample Text");

        // Act
        String retrievedData = character.getData();
        String stringRepresentation = character.toString();
        Token result = character.reset();

        // Assert
        Assert.assertSame(character, result);
        Assert.assertEquals("Sample Text", retrievedData);
        Assert.assertEquals("Sample Text", stringRepresentation);
        Assert.assertNull(character.getData());
    }

    // ==========================================
    // EOF Token Tests
    // ==========================================

    @Test
    public void eof_givenResetCall_shouldReturnSameInstance() {
        // Arrange
        Token.EOF eof = new Token.EOF();

        // Act
        Token result = eof.reset();

        // Assert
        Assert.assertSame(eof, result);
        Assert.assertTrue(eof.isEOF());
    }
}