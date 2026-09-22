package org.jsoup.parser;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder createBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<!DOCTYPE html><html><head></head><body></body></html>", "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    private Token.Character createWhitespaceToken() {
        return new Token.Character("   \t\r\n");
    }

    private Token.Character createNonWhitespaceToken() {
        return new Token.Character("content");
    }

    private Token.Character createNullCharToken() {
        return new Token.Character(String.valueOf('\u0000'));
    }

    private Token.Comment createCommentToken(String text) {
        Token.Comment comment = new Token.Comment();
        comment.data.append(text);
        return comment;
    }

    private Token.Doctype createDoctypeToken(String name, boolean forceQuirks) {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append(name);
        doctype.forceQuirks = forceQuirks;
        return doctype;
    }

    // ==========================================
    // Enum and Static Helpers
    // ==========================================

    @Test
    public void enumValues_whenInvoked_shouldContainAllStates() {
        // Arrange & Act
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();

        // Assert
        Assert.assertEquals(23, states.length);
        Assert.assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
        Assert.assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    // ==========================================
    // Initial State
    // ==========================================

    @Test
    public void initial_givenWhitespace_shouldReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Token.Character ws = createWhitespaceToken();

        // Act
        boolean result = HtmlTreeBuilderState.Initial.process(ws, tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void initial_givenComment_shouldInsertCommentAndReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Token.Comment comment = createCommentToken("test comment");

        // Act
        boolean result = HtmlTreeBuilderState.Initial.process(comment, tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void initial_givenDoctypeWithoutQuirks_shouldAppendDoctypeAndTransition() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Token.Doctype doctype = createDoctypeToken("html", false);

        // Act
        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        Assert.assertEquals(Document.QuirksMode.noQuirks, tb.getDocument().quirksMode());
    }

    @Test
    public void initial_givenDoctypeWithQuirks_shouldSetQuirksModeAndTransition() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Token.Doctype doctype = createDoctypeToken("html", true);

        // Act
        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void initial_givenOtherToken_shouldTransitionToBeforeHtmlAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Token.StartTag tag = new Token.StartTag("html");

        // Act
        boolean result = HtmlTreeBuilderState.Initial.process(tag, tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    // ==========================================
    // BeforeHtml State
    // ==========================================

    @Test
    public void beforeHtml_givenDoctype_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Doctype doctype = createDoctypeToken("html", false);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(doctype, tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void beforeHtml_givenComment_shouldInsertAndReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Comment comment = createCommentToken("comment");

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(comment, tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void beforeHtml_givenWhitespace_shouldReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Character ws = createWhitespaceToken();

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(ws, tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void beforeHtml_givenHtmlStartTag_shouldInsertAndTransition() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag start = new Token.StartTag("html");

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(start, tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void beforeHtml_givenAllowedEndTags_shouldCallAnythingElse() {
        // Arrange
        String[] tags = new String[]{"head", "body", "html", "br"};
        for (int i = 0; i < tags.length; i++) {
            HtmlTreeBuilder tb = createBuilder();
            tb.transition(HtmlTreeBuilderState.BeforeHtml);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            // Act
            boolean result = HtmlTreeBuilderState.BeforeHtml.process(endTag, tb);

            // Assert
            Assert.assertTrue(result);
        }
    }

    @Test
    public void beforeHtml_givenDisallowedEndTag_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endTag = new Token.EndTag("div");

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(endTag, tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void beforeHtml_givenAnythingElse_shouldInsertHtmlAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag start = new Token.StartTag("div");

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHtml.process(start, tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // BeforeHead State
    // ==========================================

    @Test
    public void beforeHead_givenWhitespace_shouldReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(createWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenComment_shouldInsertAndReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(createCommentToken("comment"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenDoctype_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(createDoctypeToken("html", false), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void beforeHead_givenHtmlStartTag_shouldProcessInBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenHeadStartTag_shouldTransitionToInHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        Assert.assertNotNull(tb.getHeadElement());
    }

    @Test
    public void beforeHead_givenAllowedEndTags_shouldProcessStartHeadAndTag() {
        // Arrange
        String[] tags = new String[]{"head", "body", "html", "br"};
        for (int i = 0; i < tags.length; i++) {
            HtmlTreeBuilder tb = createBuilder();
            tb.transition(HtmlTreeBuilderState.BeforeHead);

            // Act
            boolean result = HtmlTreeBuilderState.BeforeHead.process(new Token.EndTag(tags[i]), tb);

            // Assert
            Assert.assertTrue(result);
        }
    }

    @Test
    public void beforeHead_givenDisallowedEndTag_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(new Token.EndTag("span"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void beforeHead_givenAnythingElse_shouldProcessStartHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Act
        boolean result = HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("div"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // InHead State
    // ==========================================

    @Test
    public void inHead_givenWhitespace_shouldInsertCharacter() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(createWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenComment_shouldInsertComment() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(createCommentToken("comment"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenDoctype_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(createDoctypeToken("html", false), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inHead_givenHtmlStartTag_shouldDelegateToInBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(new Token.StartTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenBaseWithHref_shouldSetBaseUri() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com/base/");
        Token.StartTag baseTag = new Token.StartTag("base", attrs);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(baseTag, tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenMetaAndTitleAndScript_shouldProcessAppropriately() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Meta
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));

        // Title
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());

        // Reset to InHead
        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenHeadStartTag_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(new Token.StartTag("head"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inHead_givenEndHead_shouldTransitionToAfterHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Element head = new Element(Tag.valueOf("head"), tb.getBaseUri());
        tb.getStack().add(head);
        tb.setHeadElement(head);
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(new Token.EndTag("head"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void inHead_givenAllowedEndTags_shouldCallAnythingElse() {
        // Arrange
        String[] tags = new String[]{"body", "html", "br"};
        for (int i = 0; i < tags.length; i++) {
            HtmlTreeBuilder tb = createBuilder();
            Element head = new Element(Tag.valueOf("head"), tb.getBaseUri());
            tb.getStack().add(head);
            tb.setHeadElement(head);
            tb.transition(HtmlTreeBuilderState.InHead);

            // Act
            boolean result = HtmlTreeBuilderState.InHead.process(new Token.EndTag(tags[i]), tb);

            // Assert
            Assert.assertTrue(result);
        }
    }

    @Test
    public void inHead_givenDisallowedEndTag_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        // Act
        boolean result = HtmlTreeBuilderState.InHead.process(new Token.EndTag("span"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    // ==========================================
    // InHeadNoscript State
    // ==========================================

    @Test
    public void inHeadNoscript_givenDoctype_shouldErrorAndReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act
        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(createDoctypeToken("html", false), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHeadNoscript_givenStartHtml_shouldProcessInBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act
        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHeadNoscript_givenEndNoscript_shouldPopAndTransitionInHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("noscript"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act
        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("noscript"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void inHeadNoscript_givenAllowedInHeadTags_shouldProcessInHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(createCommentToken("comment"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("link"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("meta"), tb));
    }

    @Test
    public void inHeadNoscript_givenEndBr_shouldCallAnythingElse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("noscript"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act
        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("br"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inHeadNoscript_givenDisallowedTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Act & Assert
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("head"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("noscript"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("div"), tb));
    }

    // ==========================================
    // AfterHead State
    // ==========================================

    @Test
    public void afterHead_givenWhitespaceCommentDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(createCommentToken("comment"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void afterHead_givenStartHtml_shouldProcessInBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void afterHead_givenStartBody_shouldInsertBodyAndTransition() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("body"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void afterHead_givenStartFrameset_shouldTransitionInFrameset() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("frameset"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void afterHead_givenHeadElement_shouldPushHeadAndProcessInHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Element head = new Element(Tag.valueOf("head"), tb.getBaseUri());
        tb.setHeadElement(head);
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("meta"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void afterHead_givenStartHead_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("head"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void afterHead_givenEndBodyOrHtml_shouldCallAnythingElse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("body"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("html"), tb));
    }

    @Test
    public void afterHead_givenDisallowedEndTag_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Act
        boolean result = HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("p"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    // ==========================================
    // InBody State - Character, Comment, Doctype
    // ==========================================

    @Test
    public void inBody_givenNullCharacter_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(createNullCharToken(), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenWhitespaceCharacter_shouldInsertAndKeepFramesetOk() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.framesetOk(true);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(createWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertTrue(tb.framesetOk());
    }

    @Test
    public void inBody_givenNonWhitespaceCharacter_shouldInsertAndDisableFramesetOk() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.framesetOk(true);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(createNonWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenComment_shouldInsertComment() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(createCommentToken("comment"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenDoctype_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(createDoctypeToken("html", false), tb);

        // Assert
        Assert.assertFalse(result);
    }

    // ==========================================
    // InBody State - Start Tags
    // ==========================================

    @Test
    public void inBody_givenStartHtml_shouldMergeAttributes() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.getStack().add(html);
        tb.transition(HtmlTreeBuilderState.InBody);
        Attributes attrs = new Attributes();
        attrs.put("lang", "en");

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("html", attrs), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("en", html.attr("lang"));
    }

    @Test
    public void inBody_givenStartInHeadTags_shouldProcessInHead() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("link"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenStartBody_whenStackSizeOne_shouldReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("body"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartBody_whenStackContainsBody_shouldMergeAttributes() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        Element body = new Element(Tag.valueOf("body"), tb.getBaseUri());
        tb.getStack().add(html);
        tb.getStack().add(body);
        tb.transition(HtmlTreeBuilderState.InBody);

        Attributes attrs = new Attributes();
        attrs.put("class", "my-body");

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("body", attrs), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("my-body", body.attr("class"));
    }

    @Test
    public void inBody_givenStartFrameset_whenFramesetNotOk_shouldReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("body"), tb.getBaseUri()));
        tb.framesetOk(false);
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("frameset"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartFrameset_whenFramesetOk_shouldTransition() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        Element body = new Element(Tag.valueOf("body"), tb.getBaseUri());
        html.appendChild(body);
        tb.getStack().add(html);
        tb.getStack().add(body);
        tb.framesetOk(true);
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("frameset"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void inBody_givenBlockElements_shouldCloseButtonScopeP() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("p"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("div"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenHeadings_shouldPopExistingHeading() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("h1"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("h2"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("h2", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenPre_shouldDisableFramesetOk() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.framesetOk(true);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("pre"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenForm_whenFormAlreadyExists_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("form"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("form"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenLi_whenInsideLi_shouldClosePreviousLi() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("ul"));
        tb.process(new Token.StartTag("li"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("li"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenDdDt_whenInsideDd_shouldClosePreviousDd() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("dl"));
        tb.process(new Token.StartTag("dd"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("dt"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenPlaintext_shouldTransitionTokeniser() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("plaintext"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenButton_whenInScope_shouldCloseButton() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("button"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("button"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenA_whenActiveAExists_shouldCloseActiveA() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("a"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("a"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenNobr_whenInScope_shouldReconstruct() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("nobr"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("nobr"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenAppletMarqueeObject_shouldAddMarker() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("object"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenTable_shouldTransitionInTable() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("table"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inBody_givenVoidElements_shouldInsertEmpty() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("img"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("param"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("hr"), tb));
    }

    @Test
    public void inBody_givenInputHidden_shouldNotDisableFramesetOk() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.framesetOk(true);
        Attributes attrs = new Attributes();
        attrs.put("type", "hidden");

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("input", attrs), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertTrue(tb.framesetOk());
    }

    @Test
    public void inBody_givenInputText_shouldDisableFramesetOk() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.framesetOk(true);
        Attributes attrs = new Attributes();
        attrs.put("type", "text");

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("input", attrs), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenImage_shouldAliasToImg() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("image"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenIsindex_shouldProcessSyntheticForm() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        Attributes attrs = new Attributes();
        attrs.put("action", "/search");
        attrs.put("prompt", "Search: ");

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("isindex", attrs), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenTextarea_shouldTransitionToText() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("textarea"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inBody_givenRawtextElements_shouldHandleRawtext() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("xmp"), tb));
        tb.transition(HtmlTreeBuilderState.InBody);
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("iframe"), tb));
        tb.transition(HtmlTreeBuilderState.InBody);
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("noembed"), tb));
    }

    @Test
    public void inBody_givenSelect_whenNotInTable_shouldTransitionInSelect() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("select"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void inBody_givenOptionOptgroup_whenCurrentIsOption_shouldCloseOption() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("option"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("option"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenRubyRpRt_whenInRubyScope_shouldInsert() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("ruby"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag("rt"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenMathSvg_shouldAcknowledgeSelfClosing() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("math"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("svg"), tb));
    }

    @Test
    public void inBody_givenMisplacedTableTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        String[] misplaced = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        for (int i = 0; i < misplaced.length; i++) {
            // Act
            boolean result = HtmlTreeBuilderState.InBody.process(new Token.StartTag(misplaced[i]), tb);

            // Assert
            Assert.assertFalse(result);
        }
    }

    // ==========================================
    // InBody State - End Tags
    // ==========================================

    @Test
    public void inBody_givenEndBody_whenInScope_shouldTransitionAfterBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("body"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("body"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void inBody_givenEndBody_whenNotInScope_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("body"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenEndHtml_shouldCloseBodyAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("body"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndBlockTags_whenInScope_shouldCloseBlock() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("div"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("div"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndBlockTags_whenNotInScope_shouldReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("div"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenEndForm_whenFormInScope_shouldCloseForm() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("form"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("form"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndP_whenNotInButtonScope_shouldSynthesizeStartPAndClose() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("p"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndLi_whenInScope_shouldCloseLi() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("ul"));
        tb.process(new Token.StartTag("li"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("li"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndDdDt_whenInScope_shouldClose() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("dl"));
        tb.process(new Token.StartTag("dd"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("dd"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndHeadings_whenInScope_shouldClose() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("h1"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("h1"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndFormattingTag_whenActiveElementExists_shouldRunAdoptionAgency() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("b"));
        tb.process(new Token.StartTag("div"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("b"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndFormattingTag_whenNotActive_shouldFallbackToAnyOtherEndTag() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("b"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndBr_shouldErrorAndSynthesizeStartBr() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("br"), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenAnyOtherEndTag_whenMatchingElementOnStack_shouldPop() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.process(new Token.StartTag("span"));

        // Act
        boolean result = HtmlTreeBuilderState.InBody.process(new Token.EndTag("span"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // Text State
    // ==========================================

    @Test
    public void text_givenCharacter_shouldInsert() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.Text);

        // Act
        boolean result = HtmlTreeBuilderState.Text.process(createNonWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void text_givenEOF_shouldErrorAndPopAndReprocess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Element title = new Element(Tag.valueOf("title"), tb.getBaseUri());
        tb.getStack().add(title);
        tb.transition(HtmlTreeBuilderState.Text);

        // Act
        boolean result = HtmlTreeBuilderState.Text.process(new Token.EOF(), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void text_givenEndTag_shouldPopAndTransitionToOriginalState() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        Element title = new Element(Tag.valueOf("title"), tb.getBaseUri());
        tb.getStack().add(title);
        tb.transition(HtmlTreeBuilderState.Text);

        // Act
        boolean result = HtmlTreeBuilderState.Text.process(new Token.EndTag("title"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // InTable State
    // ==========================================

    @Test
    public void inTable_givenCharacter_shouldTransitionToInTableText() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);

        // Act
        boolean result = HtmlTreeBuilderState.InTable.process(createNonWhitespaceToken(), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
    }

    @Test
    public void inTable_givenCommentAndDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(createCommentToken("comment"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void inTable_givenStartTags_shouldTransitionOrProcess() {
        // Caption
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("caption"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCaption, tb.state());

        // Colgroup
        tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("colgroup"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());

        // Col
        tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("col"), tb));

        // Tbody
        tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("tbody"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        // Td
        tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("td"), tb));
    }

    @Test
    public void inTable_givenStartInputHidden_shouldInsertEmpty() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Attributes attrs = new Attributes();
        attrs.put("type", "hidden");

        // Act
        boolean result = HtmlTreeBuilderState.InTable.process(new Token.StartTag("input", attrs), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inTable_givenStartForm_shouldInsertForm() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);

        // Act
        boolean result = HtmlTreeBuilderState.InTable.process(new Token.StartTag("form"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inTable_givenEndTable_whenInTableScope_shouldCloseTable() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InTable);

        // Act
        boolean result = HtmlTreeBuilderState.InTable.process(new Token.EndTag("table"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inTable_givenDisallowedEndTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        String[] tags = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        for (int i = 0; i < tags.length; i++) {
            // Act
            boolean result = HtmlTreeBuilderState.InTable.process(new Token.EndTag(tags[i]), tb);

            // Assert
            Assert.assertFalse(result);
        }
    }

    // ==========================================
    // InTableText State
    // ==========================================

    @Test
    public void inTableText_givenNullCharacter_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTableText);

        // Act
        boolean result = HtmlTreeBuilderState.InTableText.process(createNullCharToken(), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inTableText_givenCharactersAndThenNonCharToken_shouldFlushPending() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.process(createWhitespaceToken());

        // Act
        boolean result = HtmlTreeBuilderState.InTableText.process(new Token.StartTag("caption"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // InCaption State
    // ==========================================

    @Test
    public void inCaption_givenEndCaption_whenInScope_shouldCloseAndTransitionInTable() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("caption"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InCaption);

        // Act
        boolean result = HtmlTreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inCaption_givenStartTableElements_shouldCloseCaptionAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("caption"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InCaption);

        // Act
        boolean result = HtmlTreeBuilderState.InCaption.process(new Token.StartTag("tbody"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inCaption_givenDisallowedEndTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);

        // Act & Assert
        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("body"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("td"), tb));
    }

    // ==========================================
    // InColumnGroup State
    // ==========================================

    @Test
    public void inColumnGroup_givenWhitespaceCommentDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(createCommentToken("comment"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void inColumnGroup_givenStartCol_shouldInsertEmpty() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);

        // Act
        boolean result = HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inColumnGroup_givenEndColgroup_whenCurrentIsNotHtml_shouldPopAndTransitionInTable() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("colgroup"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InColumnGroup);

        // Act
        boolean result = HtmlTreeBuilderState.InColumnGroup.process(new Token.EndTag("colgroup"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    // ==========================================
    // InTableBody State
    // ==========================================

    @Test
    public void inTableBody_givenStartTr_shouldTransitionInRow() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InTableBody);

        // Act
        boolean result = HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("tr"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inTableBody_givenStartThTd_shouldSynthesizeTrAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InTableBody);

        // Act
        boolean result = HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("td"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inTableBody_givenEndTableBody_whenInScope_shouldPopAndTransitionInTable() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InTableBody);

        // Act
        boolean result = HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("tbody"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inTableBody_givenDisallowedEndTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);

        // Act & Assert
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("td"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("th"), tb));
    }

    // ==========================================
    // InRow State
    // ==========================================

    @Test
    public void inRow_givenStartThTd_shouldTransitionInCell() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tr"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InRow);

        // Act
        boolean result = HtmlTreeBuilderState.InRow.process(new Token.StartTag("td"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void inRow_givenEndTr_whenInScope_shouldPopAndTransitionInTableBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tr"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InRow);

        // Act
        boolean result = HtmlTreeBuilderState.InRow.process(new Token.EndTag("tr"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void inRow_givenDisallowedEndTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);

        // Act & Assert
        Assert.assertFalse(HtmlTreeBuilderState.InRow.process(new Token.EndTag("td"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InRow.process(new Token.EndTag("body"), tb));
    }

    // ==========================================
    // InCell State
    // ==========================================

    @Test
    public void inCell_givenEndTdTh_whenInScope_shouldCloseAndTransitionInRow() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tr"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("td"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InCell);

        // Act
        boolean result = HtmlTreeBuilderState.InCell.process(new Token.EndTag("td"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inCell_givenStartTableElements_whenInTableScope_shouldCloseCellAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tbody"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("tr"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("td"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InCell);

        // Act
        boolean result = HtmlTreeBuilderState.InCell.process(new Token.StartTag("tr"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inCell_givenDisallowedEndTags_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);

        // Act & Assert
        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(new Token.EndTag("body"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(new Token.EndTag("caption"), tb));
    }

    // ==========================================
    // InSelect State
    // ==========================================

    @Test
    public void inSelect_givenNullCharacter_shouldErrorAndReturnFalse() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);

        // Act
        boolean result = HtmlTreeBuilderState.InSelect.process(createNullCharToken(), tb);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void inSelect_givenCommentAndDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(createCommentToken("comment"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void inSelect_givenOptionOptgroupSelect_shouldProcessCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("select"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InSelect);

        // Option
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));

        // Optgroup
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("optgroup"), tb));

        // Select start tag
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("select"), tb));

        // Select end tag
        tb.getStack().add(new Element(Tag.valueOf("select"), tb.getBaseUri()));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));
    }

    @Test
    public void inSelect_givenInputKeygenTextarea_whenInScope_shouldCloseSelectAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("select"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InSelect);

        // Act
        boolean result = HtmlTreeBuilderState.InSelect.process(new Token.StartTag("input"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // InSelectInTable State
    // ==========================================

    @Test
    public void inSelectInTable_givenTableStartTag_shouldCloseSelectAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("select"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        // Act
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("caption"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inSelectInTable_givenTableEndTag_whenInTableScope_shouldCloseSelectAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("table"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("select"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        // Act
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(new Token.EndTag("table"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void inSelectInTable_givenNonTableToken_shouldDelegateToInSelect() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        // Act
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("option"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    // ==========================================
    // AfterBody State
    // ==========================================

    @Test
    public void afterBody_givenWhitespaceCommentDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(createCommentToken("comment"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterBody.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void afterBody_givenStartHtml_shouldProcessInBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Act
        boolean result = HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void afterBody_givenEndHtml_whenNotFragment_shouldTransitionToAfterAfterBody() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Act
        boolean result = HtmlTreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void afterBody_givenEOF_shouldReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Act
        boolean result = HtmlTreeBuilderState.AfterBody.process(new Token.EOF(), tb);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void afterBody_givenAnythingElse_shouldTransitionInBodyAndProcess() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Act
        boolean result = HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("p"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // ==========================================
    // InFrameset State
    // ==========================================

    @Test
    public void inFrameset_givenWhitespaceCommentDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(createCommentToken("comment"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void inFrameset_givenStartTags_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frameset"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frame"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("div"), tb));
    }

    @Test
    public void inFrameset_givenEndFrameset_whenCurrentNotHtml_shouldPop() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().add(new Element(Tag.valueOf("html"), tb.getBaseUri()));
        tb.getStack().add(new Element(Tag.valueOf("frameset"), tb.getBaseUri()));
        tb.transition(HtmlTreeBuilderState.InFrameset);

        // Act
        boolean result = HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    // ==========================================
    // AfterFrameset State
    // ==========================================

    @Test
    public void afterFrameset_givenWhitespaceCommentDoctype_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(createCommentToken("comment"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(createDoctypeToken("html", false), tb));
    }

    @Test
    public void afterFrameset_givenTags_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EOF(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("div"), tb));
    }

    @Test
    public void afterFrameset_givenEndHtml_shouldTransitionToAfterAfterFrameset() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);

        // Act
        boolean result = HtmlTreeBuilderState.AfterFrameset.process(new Token.EndTag("html"), tb);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    // ==========================================
    // AfterAfterBody State
    // ==========================================

    @Test
    public void afterAfterBody_givenVariousTokens_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(createCommentToken("comment"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(createDoctypeToken("html", false), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.EOF(), tb));

        // Anything else transitions to InBody and reprocesses
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("div"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // ==========================================
    // AfterAfterFrameset State
    // ==========================================

    @Test
    public void afterAfterFrameset_givenVariousTokens_shouldHandleCorrectly() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(createCommentToken("comment"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(createDoctypeToken("html", false), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.EOF(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("div"), tb));
    }

    // ==========================================
    // ForeignContent State
    // ==========================================

    @Test
    public void foreignContent_givenAnyToken_shouldReturnTrue() {
        // Arrange
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.ForeignContent);

        // Act & Assert
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.StartTag("div"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(createWhitespaceToken(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.EOF(), tb));
    }
}