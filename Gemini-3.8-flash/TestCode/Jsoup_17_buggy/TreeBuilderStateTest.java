package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class TreeBuilderStateTest {

    private TreeBuilder createTreeBuilder() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("<html><head></head><body></body></html>", "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    private TreeBuilder createEmptyTreeBuilder() {
        TreeBuilder tb = new TreeBuilder();
        tb.initialiseParse("", "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    private Token.Doctype createDoctypeToken(String name, String pubId, String sysId, boolean forceQuirks) {
        Token.Doctype doctype = new Token.Doctype();
        if (name != null) {
            doctype.name.append(name);
        }
        if (pubId != null) {
            doctype.publicIdentifier.append(pubId);
        }
        if (sysId != null) {
            doctype.systemIdentifier.append(sysId);
        }
        doctype.forceQuirks = forceQuirks;
        return doctype;
    }

    private Token.Comment createCommentToken(String data) {
        Token.Comment comment = new Token.Comment();
        if (data != null) {
            comment.data.append(data);
        }
        return comment;
    }

    @Test
    public void initial_givenWhitespace_shouldReturnTrueAndStayInInitial() {
        TreeBuilder tb = createEmptyTreeBuilder();
        Token.Character ws = new Token.Character("   \t\r\n");

        boolean result = TreeBuilderState.Initial.process(ws, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.Initial, tb.state());
    }

    @Test
    public void initial_givenComment_shouldInsertComment() {
        TreeBuilder tb = createEmptyTreeBuilder();
        Token.Comment comment = createCommentToken("test comment");

        boolean result = TreeBuilderState.Initial.process(comment, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void initial_givenDoctypeNoQuirks_shouldAppendDoctypeAndTransitionToBeforeHtml() {
        TreeBuilder tb = createEmptyTreeBuilder();
        Token.Doctype doctype = createDoctypeToken("html", "publicId", "systemId", false);

        boolean result = TreeBuilderState.Initial.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        Assert.assertEquals(Document.QuirksMode.noQuirks, tb.getDocument().quirksMode());
        Assert.assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void initial_givenDoctypeForceQuirks_shouldSetQuirksModeAndTransitionToBeforeHtml() {
        TreeBuilder tb = createEmptyTreeBuilder();
        Token.Doctype doctype = createDoctypeToken("html", null, null, true);

        boolean result = TreeBuilderState.Initial.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void initial_givenOtherToken_shouldTransitionToBeforeHtmlAndProcess() {
        TreeBuilder tb = createEmptyTreeBuilder();
        Token.StartTag startTag = new Token.StartTag("html");

        boolean result = TreeBuilderState.Initial.process(startTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void beforeHtml_givenDoctype_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.Doctype doctype = createDoctypeToken("html", null, null, false);

        boolean result = TreeBuilderState.BeforeHtml.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void beforeHtml_givenComment_shouldInsertComment() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.Comment comment = createCommentToken("before html comment");

        boolean result = TreeBuilderState.BeforeHtml.process(comment, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(1, tb.getDocument().childNodes().size());
    }

    @Test
    public void beforeHtml_givenWhitespace_shouldReturnTrue() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.Character ws = new Token.Character(" \n ");

        boolean result = TreeBuilderState.BeforeHtml.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHtml_givenStartTagHtml_shouldInsertHtmlAndTransitionToBeforeHead() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.StartTag htmlTag = new Token.StartTag("html");

        boolean result = TreeBuilderState.BeforeHtml.process(htmlTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.BeforeHead, tb.state());
        Assert.assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void beforeHtml_givenAllowedEndTags_shouldInsertHtmlAndTransitionToBeforeHead() {
        String[] allowedTags = new String[]{"head", "body", "html", "br"};
        for (int i = 0; i < allowedTags.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.transition(TreeBuilderState.BeforeHtml);
            Token.EndTag endTag = new Token.EndTag(allowedTags[i]);

            boolean result = TreeBuilderState.BeforeHtml.process(endTag, tb);

            Assert.assertTrue(result);
            Assert.assertNotNull(tb.getFromStack("html"));
        }
    }

    @Test
    public void beforeHtml_givenDisallowedEndTag_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.EndTag endTag = new Token.EndTag("div");

        boolean result = TreeBuilderState.BeforeHtml.process(endTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void beforeHtml_givenAnythingElse_shouldInsertHtmlAndProcessToken() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHtml);
        Token.StartTag tag = new Token.StartTag("div");

        boolean result = TreeBuilderState.BeforeHtml.process(tag, tb);

        Assert.assertTrue(result);
        Assert.assertNotNull(tb.getFromStack("html"));
    }

    @Test
    public void beforeHead_givenWhitespace_shouldReturnTrue() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHead);
        Token.Character ws = new Token.Character("  ");

        boolean result = TreeBuilderState.BeforeHead.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenComment_shouldInsertComment() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.BeforeHead);
        Token.Comment comment = createCommentToken("in before head");

        boolean result = TreeBuilderState.BeforeHead.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenDoctype_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHead);
        Token.Doctype doctype = createDoctypeToken("html", null, null, false);

        boolean result = TreeBuilderState.BeforeHead.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void beforeHead_givenStartTagHtml_shouldDelegateToInBody() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.BeforeHead);
        Token.StartTag htmlTag = new Token.StartTag("html");

        boolean result = TreeBuilderState.BeforeHead.process(htmlTag, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void beforeHead_givenStartTagHead_shouldInsertHeadAndTransitionToInHead() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.BeforeHead);
        Token.StartTag headTag = new Token.StartTag("head");

        boolean result = TreeBuilderState.BeforeHead.process(headTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InHead, tb.state());
        Assert.assertNotNull(tb.getHeadElement());
        Assert.assertEquals("head", tb.getHeadElement().nodeName());
    }

    @Test
    public void beforeHead_givenAllowedEndTags_shouldInsertHeadAndProcess() {
        String[] allowedTags = new String[]{"head", "body", "html", "br"};
        for (int i = 0; i < allowedTags.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.insert("html");
            tb.transition(TreeBuilderState.BeforeHead);
            Token.EndTag endTag = new Token.EndTag(allowedTags[i]);

            boolean result = TreeBuilderState.BeforeHead.process(endTag, tb);

            Assert.assertTrue(result);
            Assert.assertNotNull(tb.getHeadElement());
        }
    }

    @Test
    public void beforeHead_givenDisallowedEndTag_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.BeforeHead);
        Token.EndTag endTag = new Token.EndTag("span");

        boolean result = TreeBuilderState.BeforeHead.process(endTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void beforeHead_givenAnythingElse_shouldAutoInsertHeadAndProcess() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.BeforeHead);
        Token.StartTag div = new Token.StartTag("div");

        boolean result = TreeBuilderState.BeforeHead.process(div, tb);

        Assert.assertTrue(result);
        Assert.assertNotNull(tb.getHeadElement());
    }

    @Test
    public void inHead_givenWhitespace_shouldInsertCharacter() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.Character ws = new Token.Character("   ");

        boolean result = TreeBuilderState.InHead.process(ws, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenComment_shouldInsertComment() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.Comment comment = createCommentToken("head comment");

        boolean result = TreeBuilderState.InHead.process(comment, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenDoctype_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.InHead);
        Token.Doctype doctype = createDoctypeToken("html", null, null, false);

        boolean result = TreeBuilderState.InHead.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inHead_givenStartTagHtml_shouldDelegateToInBody() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.StartTag htmlTag = new Token.StartTag("html");

        boolean result = TreeBuilderState.InHead.process(htmlTag, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHead_givenBaseWithHref_shouldSetBaseUri() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com/base/");
        Token.StartTag baseTag = new Token.StartTag("base", attrs);

        boolean result = TreeBuilderState.InHead.process(baseTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("http://example.com/base/", tb.getBaseUri());
    }

    @Test
    public void inHead_givenBaseEmptyTags_shouldInsertEmpty() {
        String[] tagNames = new String[]{"basefont", "bgsound", "command", "link", "meta"};
        for (int i = 0; i < tagNames.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.insert("html");
            tb.insert("head");
            tb.transition(TreeBuilderState.InHead);
            Token.StartTag tag = new Token.StartTag(tagNames[i]);

            boolean result = TreeBuilderState.InHead.process(tag, tb);

            Assert.assertTrue(result);
        }
    }

    @Test
    public void inHead_givenTitle_shouldHandleRcData() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.StartTag titleTag = new Token.StartTag("title");

        boolean result = TreeBuilderState.InHead.process(titleTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenRawTextTags_shouldHandleRawtext() {
        String[] rawTags = new String[]{"noframes", "style"};
        for (int i = 0; i < rawTags.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.insert("html");
            tb.insert("head");
            tb.transition(TreeBuilderState.InHead);
            Token.StartTag tag = new Token.StartTag(rawTags[i]);

            boolean result = TreeBuilderState.InHead.process(tag, tb);

            Assert.assertTrue(result);
            Assert.assertEquals(TreeBuilderState.Text, tb.state());
        }
    }

    @Test
    public void inHead_givenNoscript_shouldTransitionToInHeadNoscript() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.StartTag tag = new Token.StartTag("noscript");

        boolean result = TreeBuilderState.InHead.process(tag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void inHead_givenScript_shouldTransitionToScriptDataAndText() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.StartTag scriptTag = new Token.StartTag("script");

        boolean result = TreeBuilderState.InHead.process(scriptTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHead_givenHeadStartTag_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.StartTag headTag = new Token.StartTag("head");

        boolean result = TreeBuilderState.InHead.process(headTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inHead_givenHeadEndTag_shouldPopAndTransitionToAfterHead() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.EndTag endHead = new Token.EndTag("head");

        boolean result = TreeBuilderState.InHead.process(endHead, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void inHead_givenAllowedEndTags_shouldTriggerAnythingElse() {
        String[] allowedTags = new String[]{"body", "html", "br"};
        for (int i = 0; i < allowedTags.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.insert("html");
            tb.insert("head");
            tb.transition(TreeBuilderState.InHead);
            Token.EndTag endTag = new Token.EndTag(allowedTags[i]);

            boolean result = TreeBuilderState.InHead.process(endTag, tb);

            Assert.assertTrue(result);
        }
    }

    @Test
    public void inHead_givenDisallowedEndTag_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.transition(TreeBuilderState.InHead);
        Token.EndTag endTag = new Token.EndTag("div");

        boolean result = TreeBuilderState.InHead.process(endTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inHeadNoscript_givenDoctype_shouldRecordError() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.transition(TreeBuilderState.InHeadNoscript);
        Token.Doctype doctype = createDoctypeToken("html", null, null, false);

        boolean result = TreeBuilderState.InHeadNoscript.process(doctype, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inHeadNoscript_givenStartTagHtml_shouldDelegateToInBody() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.InHeadNoscript);
        Token.StartTag tag = new Token.StartTag("html");

        boolean result = TreeBuilderState.InHeadNoscript.process(tag, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inHeadNoscript_givenEndTagNoscript_shouldPopAndTransitionToInHead() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.insert("noscript");
        tb.transition(TreeBuilderState.InHeadNoscript);
        Token.EndTag tag = new Token.EndTag("noscript");

        boolean result = TreeBuilderState.InHeadNoscript.process(tag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InHead, tb.state());
        Assert.assertEquals("head", tb.currentElement().nodeName());
    }

    @Test
    public void inHeadNoscript_givenWhitespaceCommentOrSpecialStartTags_shouldDelegateToInHead() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.insert("noscript");
        tb.transition(TreeBuilderState.InHeadNoscript);

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(TreeBuilderState.InHeadNoscript.process(ws, tb));

        Token.Comment comment = createCommentToken("comment in noscript");
        Assert.assertTrue(TreeBuilderState.InHeadNoscript.process(comment, tb));

        String[] tags = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
        for (int i = 0; i < tags.length; i++) {
            Token.StartTag startTag = new Token.StartTag(tags[i]);
            Assert.assertTrue(TreeBuilderState.InHeadNoscript.process(startTag, tb));
        }
    }

    @Test
    public void inHeadNoscript_givenEndTagBr_shouldTriggerAnythingElse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.insert("noscript");
        tb.transition(TreeBuilderState.InHeadNoscript);
        Token.EndTag br = new Token.EndTag("br");

        boolean result = TreeBuilderState.InHeadNoscript.process(br, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inHeadNoscript_givenInvalidStartOrEndTags_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.insert("noscript");
        tb.transition(TreeBuilderState.InHeadNoscript);

        Token.StartTag headTag = new Token.StartTag("head");
        Assert.assertFalse(TreeBuilderState.InHeadNoscript.process(headTag, tb));

        Token.StartTag noscriptTag = new Token.StartTag("noscript");
        Assert.assertFalse(TreeBuilderState.InHeadNoscript.process(noscriptTag, tb));

        Token.EndTag divTag = new Token.EndTag("div");
        Assert.assertFalse(TreeBuilderState.InHeadNoscript.process(divTag, tb));
    }

    @Test
    public void inHeadNoscript_givenAnythingElse_shouldAutoCloseNoscriptAndProcess() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("head");
        tb.insert("noscript");
        tb.transition(TreeBuilderState.InHeadNoscript);
        Token.StartTag div = new Token.StartTag("div");

        boolean result = TreeBuilderState.InHeadNoscript.process(div, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void afterHead_givenWhitespaceCommentOrDoctype_shouldHandleCorrectly() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterHead);

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(TreeBuilderState.AfterHead.process(ws, tb));

        Token.Comment comment = createCommentToken("after head comment");
        Assert.assertTrue(TreeBuilderState.AfterHead.process(comment, tb));

        Token.Doctype doctype = createDoctypeToken("html", null, null, false);
        Assert.assertTrue(TreeBuilderState.AfterHead.process(doctype, tb));
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void afterHead_givenStartTagBody_shouldInsertBodyAndTransitionToInBody() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterHead);
        Token.StartTag body = new Token.StartTag("body");

        boolean result = TreeBuilderState.AfterHead.process(body, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InBody, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void afterHead_givenStartTagFrameset_shouldInsertFramesetAndTransitionToInFrameset() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterHead);
        Token.StartTag frameset = new Token.StartTag("frameset");

        boolean result = TreeBuilderState.AfterHead.process(frameset, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void afterHead_givenHeadTagInAfterHead_shouldRepushHeadAndProcess() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        Element head = tb.insert("head");
        tb.setHeadElement(head);
        tb.pop();
        tb.transition(TreeBuilderState.AfterHead);

        String[] tags = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"};
        for (int i = 0; i < tags.length; i++) {
            Token.StartTag tag = new Token.StartTag(tags[i]);
            Assert.assertTrue(TreeBuilderState.AfterHead.process(tag, tb));
            Assert.assertFalse(tb.onStack(head));
        }
    }

    @Test
    public void afterHead_givenStartTagHead_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterHead);
        Token.StartTag headTag = new Token.StartTag("head");

        boolean result = TreeBuilderState.AfterHead.process(headTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void afterHead_givenEndTagDisallowed_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterHead);
        Token.EndTag pTag = new Token.EndTag("p");

        boolean result = TreeBuilderState.AfterHead.process(pTag, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void afterHead_givenEndTagBodyOrHtml_shouldTriggerAnythingElse() {
        String[] tags = new String[]{"body", "html"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createEmptyTreeBuilder();
            tb.insert("html");
            tb.transition(TreeBuilderState.AfterHead);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            boolean result = TreeBuilderState.AfterHead.process(endTag, tb);

            Assert.assertTrue(result);
            Assert.assertNotNull(tb.getFromStack("body"));
        }
    }

    @Test
    public void inBody_givenNullCharacter_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.Character nullChar = new Token.Character(String.valueOf(0x0000));

        boolean result = TreeBuilderState.InBody.process(nullChar, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inBody_givenWhitespaceCharacter_shouldInsertWithoutAffectingFramesetOk() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Token.Character ws = new Token.Character("   \n");

        boolean result = TreeBuilderState.InBody.process(ws, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.framesetOk());
    }

    @Test
    public void inBody_givenNonWhitespaceCharacter_shouldSetFramesetOkFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Token.Character c = new Token.Character("Hello World");

        boolean result = TreeBuilderState.InBody.process(c, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenDoctype_shouldRecordErrorAndReturnFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.Doctype doctype = createDoctypeToken("html", null, null, false);

        boolean result = TreeBuilderState.InBody.process(doctype, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inBody_givenStartTagHtml_shouldMergeAttributes() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Attributes attrs = new Attributes();
        attrs.put("lang", "en");
        Token.StartTag htmlTag = new Token.StartTag("html", attrs);

        boolean result = TreeBuilderState.InBody.process(htmlTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("en", tb.getStack().getFirst().attr("lang"));
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inBody_givenInHeadStartTags_shouldDelegateToInHead() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        String[] tags = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "style", "title"};
        for (int i = 0; i < tags.length; i++) {
            Token.StartTag tag = new Token.StartTag(tags[i]);
            Assert.assertTrue(TreeBuilderState.InBody.process(tag, tb));
        }
    }

    @Test
    public void inBody_givenStartTagBodyWhenValid_shouldMergeAttributes() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Attributes attrs = new Attributes();
        attrs.put("class", "main");
        Token.StartTag bodyTag = new Token.StartTag("body", attrs);

        boolean result = TreeBuilderState.InBody.process(bodyTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("main", tb.getStack().get(1).attr("class"));
    }

    @Test
    public void inBody_givenStartTagBodyWhenInvalidStack_shouldReturnFalse() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag bodyTag = new Token.StartTag("body");

        boolean result = TreeBuilderState.InBody.process(bodyTag, tb);

        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartTagFramesetWhenFramesetNotOk_shouldReturnFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(false);
        Token.StartTag frameset = new Token.StartTag("frameset");

        boolean result = TreeBuilderState.InBody.process(frameset, tb);

        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenStartTagFramesetWhenFramesetOk_shouldTransitionToInFrameset() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Token.StartTag frameset = new Token.StartTag("frameset");

        boolean result = TreeBuilderState.InBody.process(frameset, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void inBody_givenBlockStartTags_shouldClosePIfInButtonScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("p");
        Assert.assertTrue(tb.inButtonScope("p"));

        Token.StartTag divTag = new Token.StartTag("div");
        boolean result = TreeBuilderState.InBody.process(divTag, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.inButtonScope("p"));
        Assert.assertEquals("div", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenHeadingTags_shouldClosePrecedingHeading() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("h1");
        Token.StartTag h2Tag = new Token.StartTag("h2");

        boolean result = TreeBuilderState.InBody.process(h2Tag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("h2", tb.currentElement().nodeName());
        Assert.assertNull(tb.getFromStack("h1"));
    }

    @Test
    public void inBody_givenPreOrListing_shouldSetFramesetOkFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Token.StartTag pre = new Token.StartTag("pre");

        boolean result = TreeBuilderState.InBody.process(pre, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenFormTag_shouldSetFormElementOrRejectIfNested() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag formTag = new Token.StartTag("form");

        boolean result1 = TreeBuilderState.InBody.process(formTag, tb);
        Assert.assertTrue(result1);
        Assert.assertNotNull(tb.getFormElement());

        boolean result2 = TreeBuilderState.InBody.process(formTag, tb);
        Assert.assertFalse(result2);
    }

    @Test
    public void inBody_givenListItem_shouldClosePreviousLi() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("ul");
        tb.insert("li");

        Token.StartTag nextLi = new Token.StartTag("li");
        boolean result = TreeBuilderState.InBody.process(nextLi, tb);

        Assert.assertTrue(result);
        Assert.assertFalse(tb.framesetOk());
        Assert.assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenDtOrDd_shouldClosePreviousDtDd() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("dl");
        tb.insert("dt");

        Token.StartTag dd = new Token.StartTag("dd");
        boolean result = TreeBuilderState.InBody.process(dd, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("dd", tb.currentElement().nodeName());
        Assert.assertNull(tb.getFromStack("dt"));
    }

    @Test
    public void inBody_givenPlaintext_shouldTransitionTokeniser() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag plaintext = new Token.StartTag("plaintext");

        boolean result = TreeBuilderState.InBody.process(plaintext, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenButton_shouldHandleScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag button = new Token.StartTag("button");

        Assert.assertTrue(TreeBuilderState.InBody.process(button, tb));
        Assert.assertEquals("button", tb.currentElement().nodeName());

        Assert.assertTrue(TreeBuilderState.InBody.process(button, tb));
        Assert.assertEquals("button", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenAnchorTag_shouldAdoptOrPushActiveFormatting() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag aTag = new Token.StartTag("a");

        Assert.assertTrue(TreeBuilderState.InBody.process(aTag, tb));
        Assert.assertNotNull(tb.getActiveFormattingElement("a"));

        Assert.assertTrue(TreeBuilderState.InBody.process(aTag, tb));
        Assert.assertNotNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void inBody_givenNobr_shouldHandleNobrInScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag nobr = new Token.StartTag("nobr");

        Assert.assertTrue(TreeBuilderState.InBody.process(nobr, tb));
        Assert.assertTrue(TreeBuilderState.InBody.process(nobr, tb));
        Assert.assertNotNull(tb.getActiveFormattingElement("nobr"));
    }

    @Test
    public void inBody_givenAppletMarqueeObject_shouldAddMarker() {
        String[] tags = new String[]{"applet", "marquee", "object"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.transition(TreeBuilderState.InBody);
            tb.framesetOk(true);
            Token.StartTag tag = new Token.StartTag(tags[i]);

            Assert.assertTrue(TreeBuilderState.InBody.process(tag, tb));
            Assert.assertFalse(tb.framesetOk());
        }
    }

    @Test
    public void inBody_givenTable_shouldTransitionToInTable() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Token.StartTag table = new Token.StartTag("table");

        boolean result = TreeBuilderState.InBody.process(table, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InTable, tb.state());
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenVoidElements_shouldInsertEmptyAndSetFramesetOkFalse() {
        String[] tags = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.transition(TreeBuilderState.InBody);
            tb.framesetOk(true);
            Token.StartTag tag = new Token.StartTag(tags[i]);

            Assert.assertTrue(TreeBuilderState.InBody.process(tag, tb));
            Assert.assertFalse(tb.framesetOk());
        }
    }

    @Test
    public void inBody_givenInput_shouldCheckTypeForFramesetOk() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.framesetOk(true);
        Attributes hiddenAttrs = new Attributes();
        hiddenAttrs.put("type", "hidden");
        Token.StartTag hiddenInput = new Token.StartTag("input", hiddenAttrs);

        Assert.assertTrue(TreeBuilderState.InBody.process(hiddenInput, tb));
        Assert.assertTrue(tb.framesetOk());

        Attributes textAttrs = new Attributes();
        textAttrs.put("type", "text");
        Token.StartTag textInput = new Token.StartTag("input", textAttrs);

        Assert.assertTrue(TreeBuilderState.InBody.process(textInput, tb));
        Assert.assertFalse(tb.framesetOk());
    }

    @Test
    public void inBody_givenParamSourceTrackHrImage_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);

        String[] tags = new String[]{"param", "source", "track"};
        for (int i = 0; i < tags.length; i++) {
            Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag(tags[i]), tb));
        }

        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("hr"), tb));

        Token.StartTag imgTag = new Token.StartTag("image");
        Assert.assertTrue(TreeBuilderState.InBody.process(imgTag, tb));
    }

    @Test
    public void inBody_givenIsIndex_shouldExpandToFormAndControls() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Attributes attrs = new Attributes();
        attrs.put("action", "/search");
        attrs.put("prompt", "Search here: ");
        Token.StartTag isindex = new Token.StartTag("isindex", attrs);

        boolean result = TreeBuilderState.InBody.process(isindex, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenIsIndexWithExistingForm_shouldReturnFalse() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.setFormElement(new Element(Tag.valueOf("form"), ""));
        Token.StartTag isindex = new Token.StartTag("isindex");

        boolean result = TreeBuilderState.InBody.process(isindex, tb);

        Assert.assertFalse(result);
    }

    @Test
    public void inBody_givenTextareaXmpIframeNoembed_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);

        Token.StartTag textarea = new Token.StartTag("textarea");
        Assert.assertTrue(TreeBuilderState.InBody.process(textarea, tb));
        Assert.assertEquals(TreeBuilderState.Text, tb.state());

        tb.transition(TreeBuilderState.InBody);
        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("xmp"), tb));
        Assert.assertEquals(TreeBuilderState.Text, tb.state());

        tb.transition(TreeBuilderState.InBody);
        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("iframe"), tb));
        Assert.assertEquals(TreeBuilderState.Text, tb.state());

        tb.transition(TreeBuilderState.InBody);
        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("noembed"), tb));
        Assert.assertEquals(TreeBuilderState.Text, tb.state());
    }

    @Test
    public void inBody_givenSelect_shouldTransitionToInSelectOrInSelectInTable() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.StartTag select = new Token.StartTag("select");

        Assert.assertTrue(TreeBuilderState.InBody.process(select, tb));
        Assert.assertEquals(TreeBuilderState.InSelect, tb.state());

        TreeBuilder tbTable = createTreeBuilder();
        tbTable.transition(TreeBuilderState.InTable);
        Token.StartTag selectInTable = new Token.StartTag("select");
        Assert.assertTrue(TreeBuilderState.InBody.process(selectInTable, tbTable));
        Assert.assertEquals(TreeBuilderState.InSelectInTable, tbTable.state());
    }

    @Test
    public void inBody_givenOptgroupOption_shouldCloseExistingOption() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("select");
        tb.insert("option");

        Token.StartTag optgroup = new Token.StartTag("optgroup");
        boolean result = TreeBuilderState.InBody.process(optgroup, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("optgroup", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenRpRt_shouldHandleRubyScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("ruby");
        tb.insert("span");

        Token.StartTag rt = new Token.StartTag("rt");
        boolean result = TreeBuilderState.InBody.process(rt, tb);

        Assert.assertTrue(result);
        Assert.assertEquals("rt", tb.currentElement().nodeName());
    }

    @Test
    public void inBody_givenMathSvg_shouldAcknowledgeSelfClosing() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);

        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("math"), tb));
        Assert.assertTrue(TreeBuilderState.InBody.process(new Token.StartTag("svg"), tb));
    }

    @Test
    public void inBody_givenTableStructureTags_shouldRecordErrorAndReturnFalse() {
        String[] tags = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.transition(TreeBuilderState.InBody);
            Token.StartTag tag = new Token.StartTag(tags[i]);

            Assert.assertFalse(TreeBuilderState.InBody.process(tag, tb));
            Assert.assertTrue(tb.errors.size() > 0);
        }
    }

    @Test
    public void inBody_givenEndTagBody_shouldTransitionToAfterBodyIfInScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.EndTag body = new Token.EndTag("body");

        boolean result = TreeBuilderState.InBody.process(body, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void inBody_givenEndTagHtml_shouldProcessBodyAndHtml() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.EndTag html = new Token.EndTag("html");

        boolean result = TreeBuilderState.InBody.process(html, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void inBody_givenEndTagBlock_shouldPopStack() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("div");

        Token.EndTag div = new Token.EndTag("div");
        boolean result = TreeBuilderState.InBody.process(div, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFromStack("div"));
    }

    @Test
    public void inBody_givenEndTagForm_shouldRemoveFormFromStack() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Element form = tb.insert("form");
        tb.setFormElement(form);

        Token.EndTag endForm = new Token.EndTag("form");
        boolean result = TreeBuilderState.InBody.process(endForm, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFormElement());
        Assert.assertNull(tb.getFromStack("form"));
    }

    @Test
    public void inBody_givenEndTagP_shouldHandleScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("p");

        Token.EndTag endP = new Token.EndTag("p");
        boolean result = TreeBuilderState.InBody.process(endP, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFromStack("p"));

        boolean resultOutOfScope = TreeBuilderState.InBody.process(endP, tb);
        Assert.assertTrue(resultOutOfScope);
    }

    @Test
    public void inBody_givenEndTagLi_shouldHandleScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("ul");
        tb.insert("li");

        Token.EndTag endLi = new Token.EndTag("li");
        Assert.assertTrue(TreeBuilderState.InBody.process(endLi, tb));
        Assert.assertFalse(TreeBuilderState.InBody.process(endLi, tb));
    }

    @Test
    public void inBody_givenEndTagDdDt_shouldHandleScope() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("dl");
        tb.insert("dd");

        Token.EndTag endDd = new Token.EndTag("dd");
        Assert.assertTrue(TreeBuilderState.InBody.process(endDd, tb));
        Assert.assertFalse(TreeBuilderState.InBody.process(endDd, tb));
    }

    @Test
    public void inBody_givenEndTagHeading_shouldCloseAnyHeading() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("h1");

        Token.EndTag endH2 = new Token.EndTag("h2");
        Assert.assertTrue(TreeBuilderState.InBody.process(endH2, tb));
        Assert.assertNull(tb.getFromStack("h1"));
    }

    @Test
    public void inBody_givenAdoptionAgencyAlgorithm_shouldReparentCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("p");
        tb.process(new Token.StartTag("b"));
        tb.insert("div");

        Token.EndTag endB = new Token.EndTag("b");
        boolean result = TreeBuilderState.InBody.process(endB, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inBody_givenEndTagAppletMarqueeObject_shouldHandleFormatting() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("object");

        Token.EndTag endObject = new Token.EndTag("object");
        Assert.assertTrue(TreeBuilderState.InBody.process(endObject, tb));
        Assert.assertNull(tb.getFromStack("object"));
    }

    @Test
    public void inBody_givenEndTagBr_shouldRecordErrorAndInsertBr() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        Token.EndTag br = new Token.EndTag("br");

        boolean result = TreeBuilderState.InBody.process(br, tb);

        Assert.assertFalse(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inBody_givenAnyOtherEndTag_shouldPopMatchingTag() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.InBody);
        tb.insert("custom");

        Token.EndTag custom = new Token.EndTag("custom");
        boolean result = TreeBuilderState.InBody.process(custom, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFromStack("custom"));
    }

    @Test
    public void text_givenCharacter_shouldInsertCharacter() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.Text);
        Token.Character c = new Token.Character("some text");

        boolean result = TreeBuilderState.Text.process(c, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void text_givenEOF_shouldPopAndTransitionToOriginalState() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("script");
        tb.originalState(TreeBuilderState.InHead);
        tb.transition(TreeBuilderState.Text);
        Token.EOF eof = new Token.EOF();

        boolean result = TreeBuilderState.Text.process(eof, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InHead, tb.state());
    }

    @Test
    public void text_givenEndTag_shouldPopAndTransitionToOriginalState() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("script");
        tb.originalState(TreeBuilderState.InHead);
        tb.transition(TreeBuilderState.Text);
        Token.EndTag endTag = new Token.EndTag("script");

        boolean result = TreeBuilderState.Text.process(endTag, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InHead, tb.state());
    }

    @Test
    public void inTable_givenCharacter_shouldTransitionToInTableText() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        Token.Character c = new Token.Character("a");

        boolean result = TreeBuilderState.InTable.process(c, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InTableText, tb.state());
    }

    @Test
    public void inTable_givenCommentOrDoctype_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);

        Token.Comment comment = createCommentToken("table comment");
        Assert.assertTrue(TreeBuilderState.InTable.process(comment, tb));

        Token.Doctype doctype = createDoctypeToken("html", null, null, false);
        Assert.assertFalse(TreeBuilderState.InTable.process(doctype, tb));
    }

    @Test
    public void inTable_givenTableStructureStartTags_shouldTransitionCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);

        Assert.assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("caption"), tb));
        Assert.assertEquals(TreeBuilderState.InCaption, tb.state());

        tb.transition(TreeBuilderState.InTable);
        Assert.assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("colgroup"), tb));
        Assert.assertEquals(TreeBuilderState.InColumnGroup, tb.state());

        tb.transition(TreeBuilderState.InTable);
        Assert.assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("col"), tb));

        tb.transition(TreeBuilderState.InTable);
        Assert.assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("tbody"), tb));
        Assert.assertEquals(TreeBuilderState.InTableBody, tb.state());

        tb.transition(TreeBuilderState.InTable);
        Assert.assertTrue(TreeBuilderState.InTable.process(new Token.StartTag("tr"), tb));
    }

    @Test
    public void inTable_givenNestedTableStartTag_shouldCloseTableAndReprocess() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        Token.StartTag table = new Token.StartTag("table");

        boolean result = TreeBuilderState.InTable.process(table, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inTable_givenInputHiddenOrOther_shouldHandleOrFosterParent() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);

        Attributes hiddenAttrs = new Attributes();
        hiddenAttrs.put("type", "hidden");
        Token.StartTag hiddenInput = new Token.StartTag("input", hiddenAttrs);
        Assert.assertTrue(TreeBuilderState.InTable.process(hiddenInput, tb));

        Attributes textAttrs = new Attributes();
        textAttrs.put("type", "text");
        Token.StartTag textInput = new Token.StartTag("input", textAttrs);
        Assert.assertTrue(TreeBuilderState.InTable.process(textInput, tb));
    }

    @Test
    public void inTable_givenFormStartTag_shouldInsertEmptyFormOrReject() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        Token.StartTag form = new Token.StartTag("form");

        Assert.assertTrue(TreeBuilderState.InTable.process(form, tb));
        Assert.assertNotNull(tb.getFormElement());

        Assert.assertFalse(TreeBuilderState.InTable.process(form, tb));
    }

    @Test
    public void inTable_givenEndTagTable_shouldPopAndReset() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.transition(TreeBuilderState.InTable);
        Token.EndTag endTable = new Token.EndTag("table");

        boolean result = TreeBuilderState.InTable.process(endTable, tb);

        Assert.assertTrue(result);
        Assert.assertNull(tb.getFromStack("table"));
    }

    @Test
    public void inTable_givenInvalidEndTags_shouldRecordErrorAndReturnFalse() {
        String[] tags = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.insert("table");
            tb.transition(TreeBuilderState.InTable);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            Assert.assertFalse(TreeBuilderState.InTable.process(endTag, tb));
            Assert.assertTrue(tb.errors.size() > 0);
        }
    }

    @Test
    public void inTableText_givenCharacters_shouldBufferAndFlush() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.newPendingTableCharacters();
        tb.originalState(TreeBuilderState.InTable);
        tb.transition(TreeBuilderState.InTableText);

        Token.Character nullChar = new Token.Character(String.valueOf(0x0000));
        Assert.assertFalse(TreeBuilderState.InTableText.process(nullChar, tb));

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(TreeBuilderState.InTableText.process(ws, tb));

        Token.Character nonWs = new Token.Character("text");
        Assert.assertTrue(TreeBuilderState.InTableText.process(nonWs, tb));

        Token.StartTag div = new Token.StartTag("div");
        Assert.assertTrue(TreeBuilderState.InTableText.process(div, tb));
    }

    @Test
    public void inCaption_givenEndTagCaption_shouldCloseAndTransitionToInTable() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("caption");
        tb.transition(TreeBuilderState.InCaption);
        Token.EndTag endCaption = new Token.EndTag("caption");

        boolean result = TreeBuilderState.InCaption.process(endCaption, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inCaption_givenInvalidTags_shouldRecordErrorAndHandle() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("caption");
        tb.transition(TreeBuilderState.InCaption);

        Token.StartTag tr = new Token.StartTag("tr");
        Assert.assertTrue(TreeBuilderState.InCaption.process(tr, tb));

        tb.insert("caption");
        tb.transition(TreeBuilderState.InCaption);
        Token.EndTag body = new Token.EndTag("body");
        Assert.assertFalse(TreeBuilderState.InCaption.process(body, tb));
    }

    @Test
    public void inColumnGroup_givenVariousTokens_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("colgroup");
        tb.transition(TreeBuilderState.InColumnGroup);

        Assert.assertTrue(TreeBuilderState.InColumnGroup.process(new Token.Character("  "), tb));
        Assert.assertTrue(TreeBuilderState.InColumnGroup.process(createCommentToken("col comment"), tb));

        Token.Doctype doctype = createDoctypeToken("html", null, null, false);
        Assert.assertTrue(TreeBuilderState.InColumnGroup.process(doctype, tb));

        Token.StartTag col = new Token.StartTag("col");
        Assert.assertTrue(TreeBuilderState.InColumnGroup.process(col, tb));

        Token.EndTag colgroup = new Token.EndTag("colgroup");
        Assert.assertTrue(TreeBuilderState.InColumnGroup.process(colgroup, tb));
        Assert.assertEquals(TreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inTableBody_givenTr_shouldTransitionToInRow() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.transition(TreeBuilderState.InTableBody);
        Token.StartTag tr = new Token.StartTag("tr");

        boolean result = TreeBuilderState.InTableBody.process(tr, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inTableBody_givenThOrTd_shouldAutoCreateTr() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.transition(TreeBuilderState.InTableBody);

        Assert.assertTrue(TreeBuilderState.InTableBody.process(new Token.StartTag("td"), tb));
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inTableBody_givenEndTagTbody_shouldTransitionToInTable() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.transition(TreeBuilderState.InTableBody);
        Token.EndTag tbody = new Token.EndTag("tbody");

        boolean result = TreeBuilderState.InTableBody.process(tbody, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inTableBody_givenInvalidEndTags_shouldRecordErrorAndReturnFalse() {
        String[] tags = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.insert("table");
            tb.insert("tbody");
            tb.transition(TreeBuilderState.InTableBody);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            Assert.assertFalse(TreeBuilderState.InTableBody.process(endTag, tb));
            Assert.assertTrue(tb.errors.size() > 0);
        }
    }

    @Test
    public void inRow_givenThOrTd_shouldTransitionToInCell() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.insert("tr");
        tb.transition(TreeBuilderState.InRow);
        Token.StartTag td = new Token.StartTag("td");

        boolean result = TreeBuilderState.InRow.process(td, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InCell, tb.state());
    }

    @Test
    public void inRow_givenEndTagTr_shouldTransitionToInTableBody() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.insert("tr");
        tb.transition(TreeBuilderState.InRow);
        Token.EndTag tr = new Token.EndTag("tr");

        boolean result = TreeBuilderState.InRow.process(tr, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void inRow_givenInvalidEndTags_shouldRecordErrorAndReturnFalse() {
        String[] tags = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.insert("table");
            tb.insert("tbody");
            tb.insert("tr");
            tb.transition(TreeBuilderState.InRow);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            Assert.assertFalse(TreeBuilderState.InRow.process(endTag, tb));
            Assert.assertTrue(tb.errors.size() > 0);
        }
    }

    @Test
    public void inCell_givenEndTagTdOrTh_shouldTransitionToInRow() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.insert("tr");
        tb.insert("td");
        tb.transition(TreeBuilderState.InCell);
        Token.EndTag td = new Token.EndTag("td");

        boolean result = TreeBuilderState.InCell.process(td, tb);

        Assert.assertTrue(result);
        Assert.assertEquals(TreeBuilderState.InRow, tb.state());
    }

    @Test
    public void inCell_givenTableStructureTags_shouldCloseCellAndProcess() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("tbody");
        tb.insert("tr");
        tb.insert("td");
        tb.transition(TreeBuilderState.InCell);
        Token.StartTag nextTd = new Token.StartTag("td");

        boolean result = TreeBuilderState.InCell.process(nextTd, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void inCell_givenInvalidEndTags_shouldRecordErrorAndReturnFalse() {
        String[] tags = new String[]{"body", "caption", "col", "colgroup", "html"};
        for (int i = 0; i < tags.length; i++) {
            TreeBuilder tb = createTreeBuilder();
            tb.insert("table");
            tb.insert("tbody");
            tb.insert("tr");
            tb.insert("td");
            tb.transition(TreeBuilderState.InCell);
            Token.EndTag endTag = new Token.EndTag(tags[i]);

            Assert.assertFalse(TreeBuilderState.InCell.process(endTag, tb));
            Assert.assertTrue(tb.errors.size() > 0);
        }
    }

    @Test
    public void inSelect_givenCharacters_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("select");
        tb.transition(TreeBuilderState.InSelect);

        Token.Character nullChar = new Token.Character(String.valueOf(0x0000));
        Assert.assertFalse(TreeBuilderState.InSelect.process(nullChar, tb));

        Token.Character normalChar = new Token.Character("Option 1");
        Assert.assertTrue(TreeBuilderState.InSelect.process(normalChar, tb));
    }

    @Test
    public void inSelect_givenStartTags_shouldHandleOptionOptgroupAndControls() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("select");
        tb.transition(TreeBuilderState.InSelect);

        Token.StartTag option = new Token.StartTag("option");
        Assert.assertTrue(TreeBuilderState.InSelect.process(option, tb));

        Token.StartTag optgroup = new Token.StartTag("optgroup");
        Assert.assertTrue(TreeBuilderState.InSelect.process(optgroup, tb));

        Token.StartTag input = new Token.StartTag("input");
        Assert.assertTrue(TreeBuilderState.InSelect.process(input, tb));
        Assert.assertNull(tb.getFromStack("select"));
    }

    @Test
    public void inSelect_givenEndTags_shouldPopAndHandleScopes() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("select");
        tb.insert("optgroup");
        tb.insert("option");
        tb.transition(TreeBuilderState.InSelect);

        Assert.assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("option"), tb));
        Assert.assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("optgroup"), tb));
        Assert.assertTrue(TreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));
        Assert.assertNull(tb.getFromStack("select"));
    }

    @Test
    public void inSelectInTable_givenTableTags_shouldCloseSelectAndReprocess() {
        TreeBuilder tb = createTreeBuilder();
        tb.insert("table");
        tb.insert("select");
        tb.transition(TreeBuilderState.InSelectInTable);

        Token.StartTag tr = new Token.StartTag("tr");
        Assert.assertTrue(TreeBuilderState.InSelectInTable.process(tr, tb));
        Assert.assertNull(tb.getFromStack("select"));

        tb.insert("select");
        tb.transition(TreeBuilderState.InSelectInTable);
        Token.EndTag table = new Token.EndTag("table");
        Assert.assertTrue(TreeBuilderState.InSelectInTable.process(table, tb));
        Assert.assertNull(tb.getFromStack("select"));
    }

    @Test
    public void afterBody_givenVariousTokens_shouldTransitionCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.AfterBody);

        Assert.assertTrue(TreeBuilderState.AfterBody.process(new Token.Character("   "), tb));
        Assert.assertTrue(TreeBuilderState.AfterBody.process(createCommentToken("after body comment"), tb));

        Token.Doctype doctype = createDoctypeToken("html", null, null, false);
        Assert.assertFalse(TreeBuilderState.AfterBody.process(doctype, tb));

        Assert.assertTrue(TreeBuilderState.AfterBody.process(new Token.StartTag("html"), tb));

        Assert.assertTrue(TreeBuilderState.AfterBody.process(new Token.EOF(), tb));

        Token.EndTag html = new Token.EndTag("html");
        Assert.assertTrue(TreeBuilderState.AfterBody.process(html, tb));
        Assert.assertEquals(TreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void afterBody_givenAnythingElse_shouldRevertToInBody() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.AfterBody);
        Token.StartTag p = new Token.StartTag("p");

        boolean result = TreeBuilderState.AfterBody.process(p, tb);

        Assert.assertTrue(result);
        Assert.assertTrue(tb.errors.size() > 0);
    }

    @Test
    public void inFrameset_givenAllowedTags_shouldHandleCorrectly() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("frameset");
        tb.transition(TreeBuilderState.InFrameset);

        Assert.assertTrue(TreeBuilderState.InFrameset.process(new Token.Character("   "), tb));
        Assert.assertTrue(TreeBuilderState.InFrameset.process(createCommentToken("frameset comment"), tb));
        Assert.assertFalse(TreeBuilderState.InFrameset.process(createDoctypeToken("html", null, null, false), tb));

        Assert.assertTrue(TreeBuilderState.InFrameset.process(new Token.StartTag("frame"), tb));
        Assert.assertTrue(TreeBuilderState.InFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertFalse(TreeBuilderState.InFrameset.process(new Token.StartTag("div"), tb));

        Token.EndTag endFrameset = new Token.EndTag("frameset");
        Assert.assertTrue(TreeBuilderState.InFrameset.process(endFrameset, tb));
        Assert.assertEquals(TreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void afterFrameset_givenTokens_shouldHandleAndTransition() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.transition(TreeBuilderState.AfterFrameset);

        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(new Token.Character("   "), tb));
        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(createCommentToken("comment"), tb));
        Assert.assertFalse(TreeBuilderState.AfterFrameset.process(createDoctypeToken("html", null, null, false), tb));

        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(new Token.EOF(), tb));

        Token.EndTag html = new Token.EndTag("html");
        Assert.assertTrue(TreeBuilderState.AfterFrameset.process(html, tb));
        Assert.assertEquals(TreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void afterAfterBody_givenTokens_shouldHandleCorrectly() {
        TreeBuilder tb = createTreeBuilder();
        tb.transition(TreeBuilderState.AfterAfterBody);

        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(createCommentToken("comment"), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(new Token.Character("   "), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(createDoctypeToken("html", null, null, false), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(new Token.EOF(), tb));

        Token.StartTag p = new Token.StartTag("p");
        Assert.assertTrue(TreeBuilderState.AfterAfterBody.process(p, tb));
        Assert.assertEquals(TreeBuilderState.InBody, tb.state());
    }

    @Test
    public void afterAfterFrameset_givenTokens_shouldHandleCorrectly() {
        TreeBuilder tb = createEmptyTreeBuilder();
        tb.insert("html");
        tb.insert("body");
        tb.transition(TreeBuilderState.AfterAfterFrameset);

        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(createCommentToken("comment"), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(new Token.Character("   "), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(createDoctypeToken("html", null, null, false), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(new Token.EOF(), tb));

        Token.StartTag nofrmes = new Token.StartTag("nofrmes");
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(nofrmes, tb));

        Token.StartTag p = new Token.StartTag("p");
        Assert.assertTrue(TreeBuilderState.AfterAfterFrameset.process(p, tb));
        Assert.assertEquals(TreeBuilderState.InBody, tb.state());
    }

    @Test
    public void foreignContent_givenAnyToken_shouldReturnTrue() {
        TreeBuilder tb = createTreeBuilder();
        Token token = new Token.StartTag("anything");

        boolean result = TreeBuilderState.ForeignContent.process(token, tb);

        Assert.assertTrue(result);
    }

    @Test
    public void enumValues_shouldContainAllTwentyThreeStates() {
        TreeBuilderState[] states = TreeBuilderState.values();
        Assert.assertEquals(23, states.length);
        Assert.assertEquals(TreeBuilderState.Initial, TreeBuilderState.valueOf("Initial"));
        Assert.assertEquals(TreeBuilderState.ForeignContent, TreeBuilderState.valueOf("ForeignContent"));
    }
}