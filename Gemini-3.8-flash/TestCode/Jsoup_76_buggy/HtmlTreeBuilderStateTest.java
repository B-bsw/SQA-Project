package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder createBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.tracking(100), ParseSettings.htmlDefault);
        return tb;
    }

    private Token.StartTag createStartTag(String name) {
        Token.StartTag tag = new Token.StartTag();
        tag.name(name);
        return tag;
    }

    private Token.StartTag createStartTag(String name, Attributes attrs) {
        Token.StartTag tag = new Token.StartTag();
        tag.name(name);
        tag.attributes = attrs;
        return tag;
    }

    private Token.EndTag createEndTag(String name) {
        Token.EndTag tag = new Token.EndTag();
        tag.name(name);
        return tag;
    }

    private Token.Character createCharacter(String data) {
        Token.Character c = new Token.Character();
        c.data(data);
        return c;
    }

    private Token.Comment createComment(String data) {
        Token.Comment c = new Token.Comment();
        c.data(data);
        return c;
    }

    private Token.Doctype createDoctype(String name, boolean forceQuirks) {
        Token.Doctype d = new Token.Doctype();
        d.name.append(name);
        d.forceQuirks = forceQuirks;
        return d;
    }

    @Test
    public void initial_givenWhitespace_shouldReturnTrue() {
        HtmlTreeBuilder tb = createBuilder();
        Token.Character whitespace = createCharacter("   \t\r\n");

        boolean result = HtmlTreeBuilderState.Initial.process(whitespace, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void initial_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        Token.Comment comment = createComment("header comment");

        boolean result = HtmlTreeBuilderState.Initial.process(comment, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(1, tb.getDocument().childNodeSize());
        Assert.assertEquals(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void initial_givenDoctypeWithoutQuirks_shouldAppendDoctypeAndTransition() {
        HtmlTreeBuilder tb = createBuilder();
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(Document.QuirksMode.noQuirks, tb.getDocument().quirksMode());
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void initial_givenDoctypeWithForceQuirks_shouldSetQuirksMode() {
        HtmlTreeBuilder tb = createBuilder();
        Token.Doctype doctype = createDoctype("html", true);

        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void initial_givenOtherToken_shouldTransitionToBeforeHtmlAndReprocess() {
        HtmlTreeBuilder tb = createBuilder();
        Token.StartTag startHtml = createStartTag("html");

        boolean result = HtmlTreeBuilderState.Initial.process(startHtml, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void beforeHtml_givenDoctype_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void beforeHtml_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Comment comment = createComment("before html comment");

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(comment, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(1, tb.getDocument().childNodeSize());
    }

    @Test
    public void beforeHtml_givenWhitespace_shouldReturnTrue() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Character whitespace = createCharacter("  \n");

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(whitespace, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHtml_givenStartTagHtml_shouldTransitionToBeforeHead() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag tag = createStartTag("html");

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(tag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        Assert.assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void beforeHtml_givenEndTagHtmlParts_shouldHandleAnythingElse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endHead = createEndTag("head");

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(endHead, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("html", tb.getDocument().child(0).nodeName());
    }

    @Test
    public void beforeHtml_givenInvalidEndTag_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endSpan = createEndTag("span");

        boolean result = HtmlTreeBuilderState.BeforeHtml.process(endSpan, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void beforeHead_givenWhitespace_shouldReturnTrue() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Character ws = createCharacter(" ");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Comment comment = createComment("before head comment");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenDoctype_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.BeforeHead.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void beforeHead_givenStartTagHtml_shouldProcessInBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag tag = createStartTag("html");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(tag, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenStartTagHead_shouldSetHeadAndTransitionInHead() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag headTag = createStartTag("head");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(headTag, tb);

        Assert.assertTrue(result);
        Assert.assertNotNull(tb.getHeadElement());
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void beforeHead_givenEndTagHead_shouldAutoCreateHead() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endHead = createEndTag("head");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(endHead, tb);

        Assert.assertTrue(result);
        Assert.assertNotNull(tb.getHeadElement());
    }

    @Test
    public void beforeHead_givenInvalidEndTag_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endDiv = createEndTag("div");

        boolean result = HtmlTreeBuilderState.BeforeHead.process(endDiv, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHead_givenWhitespace_shouldInsertCharacter() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.Character ws = createCharacter(" \t");

        boolean result = HtmlTreeBuilderState.InHead.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.Comment comment = createComment("in head comment");

        boolean result = HtmlTreeBuilderState.InHead.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenDoctype_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.InHead.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHead_givenStartTagBaseWithHref_shouldUpdateBaseUri() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Attributes attrs = new Attributes();
        attrs.put("href", "http://jsoup.org/");
        Token.StartTag baseTag = createStartTag("base", attrs);

        boolean result = HtmlTreeBuilderState.InHead.process(baseTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("http://jsoup.org/", tb.getBaseUri());
    }

    @Test
    public void inHead_givenStartTagMeta_shouldInsertEmpty() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag metaTag = createStartTag("meta");

        boolean result = HtmlTreeBuilderState.InHead.process(metaTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("head", tb.currentElement().nodeName());
    }

    @Test
    public void inHead_givenStartTagTitle_shouldTransitionToText() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag titleTag = createStartTag("title");

        boolean result = HtmlTreeBuilderState.InHead.process(titleTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenStartTagStyle_shouldTransitionToText() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag styleTag = createStartTag("style");

        boolean result = HtmlTreeBuilderState.InHead.process(styleTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenStartTagNoscript_shouldTransitionToInHeadNoscript() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag noscript = createStartTag("noscript");

        boolean result = HtmlTreeBuilderState.InHead.process(noscript, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void inHead_givenStartTagScript_shouldTransitionToTextAndSetScriptData() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag script = createStartTag("script");

        boolean result = HtmlTreeBuilderState.InHead.process(script, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenStartTagHead_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.StartTag head = createStartTag("head");

        boolean result = HtmlTreeBuilderState.InHead.process(head, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHead_givenEndTagHead_shouldTransitionToAfterHead() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.EndTag endHead = createEndTag("head");

        boolean result = HtmlTreeBuilderState.InHead.process(endHead, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void inHead_givenEndTagOther_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        Token.EndTag endDiv = createEndTag("div");

        boolean result = HtmlTreeBuilderState.InHead.process(endDiv, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHeadNoscript_givenDoctype_shouldLogError() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHeadNoscript_givenEndTagNoscript_shouldTransitionToInHead() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.EndTag endNoscript = createEndTag("noscript");

        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(endNoscript, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void inHeadNoscript_givenEndTagBr_shouldInsertCharacter() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.EndTag endBr = createEndTag("br");

        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(endBr, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inHeadNoscript_givenStartTagNoscript_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.StartTag tag = createStartTag("noscript");

        boolean result = HtmlTreeBuilderState.InHeadNoscript.process(tag, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void afterHead_givenWhitespace_shouldInsertCharacter() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.Character ws = createCharacter(" ");

        boolean result = HtmlTreeBuilderState.AfterHead.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void afterHead_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.Comment comment = createComment("after head comment");

        boolean result = HtmlTreeBuilderState.AfterHead.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void afterHead_givenDoctype_shouldLogError() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.AfterHead.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void afterHead_givenStartTagBody_shouldTransitionToInBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.StartTag body = createStartTag("body");

        boolean result = HtmlTreeBuilderState.AfterHead.process(body, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void afterHead_givenStartTagFrameset_shouldTransitionToInFrameset() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.StartTag frameset = createStartTag("frameset");

        boolean result = HtmlTreeBuilderState.AfterHead.process(frameset, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void afterHead_givenStartTagHeadTag_shouldPushHeadAndProcess() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.StartTag meta = createStartTag("meta");

        boolean result = HtmlTreeBuilderState.AfterHead.process(meta, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void afterHead_givenStartTagHead_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.StartTag head = createStartTag("head");

        boolean result = HtmlTreeBuilderState.AfterHead.process(head, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void afterHead_givenInvalidEndTag_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        Token.EndTag endP = createEndTag("p");

        boolean result = HtmlTreeBuilderState.AfterHead.process(endP, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenNullCharacter_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        Token.Character nullChar = createCharacter(String.valueOf('\u0000'));

        boolean result = HtmlTreeBuilderState.InBody.process(nullChar, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenWhitespaceWithFramesetOk_shouldKeepFramesetOk() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.framesetOk(true);
        Token.Character ws = createCharacter("   ");

        boolean result = HtmlTreeBuilderState.InBody.process(ws, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.framesetOk());
    }

    @Test
    public void inBody_givenNonWhitespaceChar_shouldDisableFramesetOk() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.framesetOk(true);
        Token.Character ch = createCharacter("abc");

        boolean result = HtmlTreeBuilderState.InBody.process(ch, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenDoctype_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        Token.Doctype doctype = createDoctype("html", false);

        boolean result = HtmlTreeBuilderState.InBody.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenDuplicateStartTagA_shouldClosePreviousA() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("a");

        Token.StartTag tagA = createStartTag("a");
        boolean result = HtmlTreeBuilderState.InBody.process(tagA, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagPClosers_inButtonScopeP_shouldCloseP() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("p");
        Assert.assertTrue(tb.inButtonScope("p"));

        Token.StartTag divTag = createStartTag("div");
        boolean result = HtmlTreeBuilderState.InBody.process(divTag, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.inButtonScope("p"));
        Assert.assertEquals("div", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenStartTagLi_nested_shouldClosePreviousLi() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("ul");
        tb.processStartTag("li");

        Token.StartTag nextLi = createStartTag("li");
        boolean result = HtmlTreeBuilderState.InBody.process(nextLi, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenStartTagHtml_shouldMergeAttributes() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Attributes attrs = new Attributes();
        attrs.put("data-test", "val");
        Token.StartTag htmlTag = createStartTag("html", attrs);

        boolean result = HtmlTreeBuilderState.InBody.process(htmlTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("val", tb.getStack().get(0).attr("data-test"));
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagBody_validStack_shouldMergeAttributes() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Attributes attrs = new Attributes();
        attrs.put("class", "main");
        Token.StartTag bodyTag = createStartTag("body", attrs);

        boolean result = HtmlTreeBuilderState.InBody.process(bodyTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("main", tb.getStack().get(1).attr("class"));
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenStartTagBody_invalidStack_shouldReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.getStack().clear();
        tb.getStack().add(new Element(Tag.valueOf("html"), ""));

        Token.StartTag bodyTag = createStartTag("body");
        boolean result = HtmlTreeBuilderState.InBody.process(bodyTag, tb);

        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartTagFrameset_framesetOkFalse_shouldReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.framesetOk(false);

        Token.StartTag frameset = createStartTag("frameset");
        boolean result = HtmlTreeBuilderState.InBody.process(frameset, tb);

        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartTagFrameset_framesetOkTrue_shouldTransition() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.framesetOk(true);

        Token.StartTag frameset = createStartTag("frameset");
        boolean result = HtmlTreeBuilderState.InBody.process(frameset, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void inBody_givenStartTagHeading_underHeading_shouldPopOldHeading() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("h1");

        Token.StartTag h2 = createStartTag("h2");
        boolean result = HtmlTreeBuilderState.InBody.process(h2, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("h2", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenStartTagForm_alreadyHasForm_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("form");

        Token.StartTag form2 = createStartTag("form");
        boolean result = HtmlTreeBuilderState.InBody.process(form2, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagPlaintext_shouldTransitionTokeniser() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag plaintext = createStartTag("plaintext");
        boolean result = HtmlTreeBuilderState.InBody.process(plaintext, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("plaintext", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenStartTagButton_inScope_shouldCloseButton() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("button");

        Token.StartTag btn = createStartTag("button");
        boolean result = HtmlTreeBuilderState.InBody.process(btn, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagNobr_inScope_shouldCloseNobr() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("nobr");

        Token.StartTag nobr2 = createStartTag("nobr");
        boolean result = HtmlTreeBuilderState.InBody.process(nobr2, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagTable_shouldTransitionToInTable() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag table = createStartTag("table");
        boolean result = HtmlTreeBuilderState.InBody.process(table, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenStartTagInputHidden_shouldKeepFramesetOk() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.framesetOk(true);

        Attributes attrs = new Attributes();
        attrs.put("type", "hidden");
        Token.StartTag input = createStartTag("input", attrs);

        boolean result = HtmlTreeBuilderState.InBody.process(input, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.framesetOk());
    }

    @Test
    public void inBody_givenStartTagImage_noSvg_shouldConvertToImg() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag image = createStartTag("image");
        boolean result = HtmlTreeBuilderState.InBody.process(image, tb);

        Assert.assertTrue(result);
        Assert.assertNotNull(tb.getDocument().select("img").first());
    }

    @Test
    public void inBody_givenStartTagIsindex_shouldBuildForm() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag isindex = createStartTag("isindex");
        boolean result = HtmlTreeBuilderState.InBody.process(isindex, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenStartTagTextarea_shouldTransitionToText() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag textarea = createStartTag("textarea");
        boolean result = HtmlTreeBuilderState.InBody.process(textarea, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenStartTagSelect_shouldTransitionToInSelect() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag select = createStartTag("select");
        boolean result = HtmlTreeBuilderState.InBody.process(select, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenStartTagRuby_notInScope_shouldDoNothing() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag rt = createStartTag("rt");
        boolean result = HtmlTreeBuilderState.InBody.process(rt, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("body", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenStartTagDrop_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag frame = createStartTag("frame");
        boolean result = HtmlTreeBuilderState.InBody.process(frame, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenEndTagAdoptionFormatters_adoptionAgency() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("b");
        tb.processStartTag("p");

        Token.EndTag endB = createEndTag("b");
        boolean result = HtmlTreeBuilderState.InBody.process(endB, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndTagClosers_notInScope_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.EndTag endDiv = createEndTag("div");
        boolean result = HtmlTreeBuilderState.InBody.process(endDiv, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenEndTagBody_inScope_shouldTransitionAfterBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.EndTag endBody = createEndTag("body");
        boolean result = HtmlTreeBuilderState.InBody.process(endBody, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void inBody_givenEndTagForm_inScope_shouldPopForm() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("form");

        Token.EndTag endForm = createEndTag("form");
        boolean result = HtmlTreeBuilderState.InBody.process(endForm, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFormElement());
    }

    @Test
    public void inBody_givenEndTagP_notInButtonScope_shouldOpenPAndClose() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.EndTag endP = createEndTag("p");
        boolean result = HtmlTreeBuilderState.InBody.process(endP, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inBody_givenEndTagBr_shouldLogErrorAndInsertBr() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.EndTag endBr = createEndTag("br");
        boolean result = HtmlTreeBuilderState.InBody.process(endBr, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
        Assert.assertNotNull(tb.getDocument().select("br").first());
    }

    @Test
    public void inBody_givenAnyOtherEndTag_specialOnStack_shouldReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.EndTag endCustom = createEndTag("customtag");
        boolean result = HtmlTreeBuilderState.InBody.process(endCustom, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void text_givenCharacter_shouldInsertCharacter() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("title");
        tb.transition(HtmlTreeBuilderState.Text);

        Token.Character ch = createCharacter("Page Title");
        boolean result = HtmlTreeBuilderState.Text.process(ch, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("Page Title", tb.currentElement().text());
    }

    @Test
    public void text_givenEOF_shouldPopAndTransitionToOriginalState() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("title");
        tb.transition(HtmlTreeBuilderState.Text);

        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.Text.process(eof, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void text_givenEndTag_shouldPopAndTransitionToOriginalState() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("title");
        tb.transition(HtmlTreeBuilderState.Text);

        Token.EndTag endTitle = createEndTag("title");
        boolean result = HtmlTreeBuilderState.Text.process(endTitle, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("body", tb.currentElement().nodeName());
    }

    @Test
    public void inTable_givenCharacter_shouldTransitionToInTableText() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.Character ch = createCharacter("text");
        boolean result = HtmlTreeBuilderState.InTable.process(ch, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
    }

    @Test
    public void inTable_givenDoctype_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.Doctype doctype = createDoctype("html", false);
        boolean result = HtmlTreeBuilderState.InTable.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inTable_givenStartTagCaption_shouldTransitionToInCaption() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.StartTag caption = createStartTag("caption");
        boolean result = HtmlTreeBuilderState.InTable.process(caption, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void inTable_givenStartTagColgroup_shouldTransitionToInColumnGroup() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.StartTag colgroup = createStartTag("colgroup");
        boolean result = HtmlTreeBuilderState.InTable.process(colgroup, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void inTable_givenStartTagTbody_shouldTransitionToInTableBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.StartTag tbody = createStartTag("tbody");
        boolean result = HtmlTreeBuilderState.InTable.process(tbody, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void inTable_givenEndTagTable_inTableScope_shouldPopAndResetMode() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.EndTag endTable = createEndTag("table");
        boolean result = HtmlTreeBuilderState.InTable.process(endTable, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void inTable_givenEndTagDisallowed_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        Token.EndTag endTr = createEndTag("tr");
        boolean result = HtmlTreeBuilderState.InTable.process(endTr, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inTableText_givenNullChar_shouldLogErrorAndReturnFalse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.transition(HtmlTreeBuilderState.InTableText);

        Token.Character nullChar = createCharacter(String.valueOf('\u0000'));
        boolean result = HtmlTreeBuilderState.InTableText.process(nullChar, tb);

        Assert.assertFalse(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inTableText_givenValidCharThenEOF_shouldFlushPendingTableCharacters() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.newPendingTableCharacters();
        tb.transition(HtmlTreeBuilderState.InTableText);

        Token.Character validChar = createCharacter("hello");
        HtmlTreeBuilderState.InTableText.process(validChar, tb);

        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.InTableText.process(eof, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inCaption_givenEndTagCaption_inScope_shouldTransitionInTable() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("caption");

        Token.EndTag endCaption = createEndTag("caption");
        boolean result = HtmlTreeBuilderState.InCaption.process(endCaption, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inCaption_givenStartTagTableParts_shouldCloseCaption() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("caption");

        Token.StartTag tr = createStartTag("tr");
        boolean result = HtmlTreeBuilderState.InCaption.process(tr, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void inColumnGroup_givenStartTagCol_shouldInsertEmpty() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("colgroup");

        Token.StartTag col = createStartTag("col");
        boolean result = HtmlTreeBuilderState.InColumnGroup.process(col, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("colgroup", tb.currentElement().nodeName());
    }

    @Test
    public void inColumnGroup_givenEndTagColgroup_shouldTransitionInTable() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("colgroup");

        Token.EndTag endColgroup = createEndTag("colgroup");
        boolean result = HtmlTreeBuilderState.InColumnGroup.process(endColgroup, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inTableBody_givenStartTagTr_shouldTransitionToInRow() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");

        Token.StartTag tr = createStartTag("tr");
        boolean result = HtmlTreeBuilderState.InTableBody.process(tr, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inTableBody_givenEndTagTbody_inScope_shouldTransitionToInTable() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");

        Token.EndTag endTbody = createEndTag("tbody");
        boolean result = HtmlTreeBuilderState.InTableBody.process(endTbody, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inRow_givenStartTagTd_shouldTransitionToInCell() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");

        Token.StartTag td = createStartTag("td");
        boolean result = HtmlTreeBuilderState.InRow.process(td, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void inRow_givenEndTagTr_inScope_shouldTransitionToInTableBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");

        Token.EndTag endTr = createEndTag("tr");
        boolean result = HtmlTreeBuilderState.InRow.process(endTr, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void inCell_givenEndTagTd_inScope_shouldTransitionToInRow() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");
        tb.processStartTag("td");

        Token.EndTag endTd = createEndTag("td");
        boolean result = HtmlTreeBuilderState.InCell.process(endTd, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inSelect_givenStartTagOption_shouldInsertOption() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("select");

        Token.StartTag option = createStartTag("option");
        boolean result = HtmlTreeBuilderState.InSelect.process(option, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("option", tb.currentElement().nodeName());
    }

    @Test
    public void inSelect_givenEndTagSelect_shouldPopAndResetMode() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("select");

        Token.EndTag endSelect = createEndTag("select");
        boolean result = HtmlTreeBuilderState.InSelect.process(endSelect, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void inSelectInTable_givenStartTagTableParts_shouldCloseSelect() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");
        tb.processStartTag("td");
        tb.processStartTag("select");
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        Token.StartTag td = createStartTag("td");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(td, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.getErrors().isEmpty());
    }

    @Test
    public void afterBody_givenWhitespace_shouldProcessInBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");

        Token.Character ws = createCharacter("  ");
        boolean result = HtmlTreeBuilderState.AfterBody.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void afterBody_givenEndTagHtml_shouldTransitionToAfterAfterBody() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");

        Token.EndTag endHtml = createEndTag("html");
        boolean result = HtmlTreeBuilderState.AfterBody.process(endHtml, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void inFrameset_givenStartTagFrame_shouldInsertEmpty() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("frameset");

        Token.StartTag frame = createStartTag("frame");
        boolean result = HtmlTreeBuilderState.InFrameset.process(frame, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("frameset", tb.currentElement().nodeName());
    }

    @Test
    public void inFrameset_givenEndTagFrameset_valid_shouldTransitionToAfterFrameset() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("frameset");

        Token.EndTag endFrameset = createEndTag("frameset");
        boolean result = HtmlTreeBuilderState.InFrameset.process(endFrameset, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void afterFrameset_givenEndTagHtml_shouldTransitionToAfterAfterFrameset() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("frameset");
        tb.processEndTag("frameset");

        Token.EndTag endHtml = createEndTag("html");
        boolean result = HtmlTreeBuilderState.AfterFrameset.process(endHtml, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void afterAfterBody_givenComment_shouldInsertComment() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");
        tb.processEndTag("html");

        Token.Comment comment = createComment("after after body comment");
        boolean result = HtmlTreeBuilderState.AfterAfterBody.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void afterAfterFrameset_givenEOF_shouldReturnTrue() {
        HtmlTreeBuilder tb = createBuilder();
        tb.processStartTag("html");
        tb.processStartTag("frameset");
        tb.processEndTag("frameset");
        tb.processEndTag("html");

        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.AfterAfterFrameset.process(eof, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void foreignContent_givenAnyToken_shouldReturnTrue() {
        HtmlTreeBuilder tb = createBuilder();
        Token.Character ch = createCharacter("foreign content");

        boolean result = HtmlTreeBuilderState.ForeignContent.process(ch, tb);

        Assert.assertTrue(result);
    }
}