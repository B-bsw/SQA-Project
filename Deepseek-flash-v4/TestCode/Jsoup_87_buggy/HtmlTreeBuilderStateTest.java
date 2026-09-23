package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("");
        tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader(""), "", doc);
        tb.transition(HtmlTreeBuilderState.Initial);
    }

    @Test
    public void testInitialStateWithWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        assertTrue(HtmlTreeBuilderState.Initial.process(token, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void testInitialStateWithComment() {
        Token.Comment token = new Token.Comment();
        token.data("test comment");
        assertTrue(HtmlTreeBuilderState.Initial.process(token, tb));
        assertEquals(1, doc.childNodeSize());
    }

    @Test
    public void testInitialStateWithDoctype() {
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.Initial.process(token, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        assertEquals(1, doc.childNodeSize());
    }

    @Test
    public void testInitialStateWithForceQuirks() {
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        token.forceQuirks = true;
        assertTrue(HtmlTreeBuilderState.Initial.process(token, tb));
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitialStateWithOtherTokenTransitionsToBeforeHtml() {
        Token.StartTag token = new Token.StartTag();
        token.name("div");
        assertTrue(HtmlTreeBuilderState.Initial.process(token, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlWithDoctypeReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(token, tb));
    }

    @Test
    public void testBeforeHtmlWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(token, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHtmlWithEndTagThatUsesAnythingElse() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag token = new Token.EndTag();
        token.name("body");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(token, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlWithOtherEndTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(token, tb));
    }

    @Test
    public void testBeforeHtmlWithAnythingElse() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag token = new Token.StartTag();
        token.name("span");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(token, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testBeforeHeadWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(token, tb));
    }

    @Test
    public void testBeforeHeadWithHeadStartTag() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag token = new Token.StartTag();
        token.name("head");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertNotNull(tb.getHeadElement());
    }

    @Test
    public void testBeforeHeadWithEndTagHeadBodyHtmlBr() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag token = new Token.EndTag();
        token.name("br");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testBeforeHeadWithDoctypeReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(token, tb));
    }

    @Test
    public void testBeforeHeadWithOtherEndTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(token, tb));
    }

    @Test
    public void testBeforeHeadWithAnythingElse() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag token = new Token.StartTag();
        token.name("span");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadWhitespace() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.Character token = new Token.Character();
        token.data("\n");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadComment() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadDoctypeReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadWithBaseTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("base");
        token.attributes.put("href", "http://example.com");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadWithMetaTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("meta");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadWithTitleTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("title");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInHeadWithNoframesTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("noframes");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInHeadWithNoscriptTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("noscript");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void testInHeadWithScriptTag() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("script");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInHeadWithHeadStartTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag token = new Token.StartTag();
        token.name("head");
        assertFalse(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadWithEndTagHead() {
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("head");
        Token.EndTag token = new Token.EndTag();
        token.name("head");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadWithEndTagBodyHtmlBr() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag token = new Token.EndTag();
        token.name("br");
        assertTrue(HtmlTreeBuilderState.InHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadWithOtherEndTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertFalse(HtmlTreeBuilderState.InHead.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithDoctype() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithEndTagNoscript() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        tb.insertStartTag("noscript");
        Token.EndTag token = new Token.EndTag();
        token.name("noscript");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptWithWhitespace() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.Character token = new Token.Character();
        token.data(" ");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithBrEndTag() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.EndTag token = new Token.EndTag();
        token.name("br");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithInvalidTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.StartTag token = new Token.StartTag();
        token.name("head");
        assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testInHeadNoscriptWithAnythingElse() {
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Token.StartTag token = new Token.StartTag();
        token.name("div");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(token, tb));
    }

    @Test
    public void testAfterHeadWithWhitespace() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.Character token = new Token.Character();
        token.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithComment() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithDoctype() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithBodyStartTag() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag token = new Token.StartTag();
        token.name("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterHeadWithFramesetStartTag() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag token = new Token.StartTag();
        token.name("frameset");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testAfterHeadWithHeadStartTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag token = new Token.StartTag();
        token.name("head");
        assertFalse(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithBodyEndTag() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.EndTag token = new Token.EndTag();
        token.name("body");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterHeadWithOtherEndTagReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertFalse(HtmlTreeBuilderState.AfterHead.process(token, tb));
    }

    @Test
    public void testAfterHeadWithAnythingElse() {
        tb.transition(HtmlTreeBuilderState.AfterHead);
        Token.Character token = new Token.Character();
        token.data("x");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInBodyCharacterNonWhitespace() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.Character token = new Token.Character();
        token.data("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyNullCharacterReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.Character token = new Token.Character();
        token.data("\u0000");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyComment() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyDoctypeReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithAStartTagWhenActiveFormatting() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertNotNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyWithEmptyFormatter() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("br");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithPCloser() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("p");
        Token.StartTag token = new Token.StartTag();
        token.name("div");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithLiTag() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithHtmlStartTag() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("html");
        token.attributes.put("class", "test");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertTrue(tb.getDocument().select("html").first().hasClass("test"));
    }

    @Test
    public void testInBodyWithBodyStartTagInvalid() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        Token.StartTag token = new Token.StartTag();
        token.name("body");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithFramesetInvalidWhenStackSizeOne() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag token = new Token.StartTag();
        token.name("frameset");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithHeading() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("h1");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithPreTagAndNewline() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("pre");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithFormElement() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertNotNull(tb.getFormElement());
    }

    @Test
    public void testInBodyWithFormWhenAlreadyPresent() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("form");
        Token.StartTag token = new Token.StartTag();
        token.name("form");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithDdDt() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("dd");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithPlaintext() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("plaintext");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithButtonInButtonScope() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("button");
        Token.StartTag token = new Token.StartTag();
        token.name("button");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithFormatter() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("b");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertNotNull(tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testInBodyWithNobr() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("nobr");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertNotNull(tb.getActiveFormattingElement("nobr"));
    }

    @Test
    public void testInBodyWithApplet() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("applet");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithTable() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInBodyWithInputHidden() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("input");
        token.attributes.put("type", "hidden");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertTrue(tb.framesetOk());
    }

    @Test
    public void testInBodyWithInputNotHidden() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("input");
        token.attributes.put("type", "text");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithHr() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("hr");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBodyWithImageConvertsToImg() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("image");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertNotNull(tb.getFromStack("img"));
    }

    @Test
    public void testInBodyWithIsindex() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("isindex");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithIsindexWhenFormExists() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("form");
        Token.StartTag token = new Token.StartTag();
        token.name("isindex");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithTextarea() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("textarea");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInBodyWithSelect() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.StartTag token = new Token.StartTag();
        token.name("select");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInBodyWithOption() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("select");
        Token.StartTag token = new Token.StartTag();
        token.name("option");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithEndTagDiv() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        tb.processStartTag("div");
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithEndTagBody() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.EndTag token = new Token.EndTag();
        token.name("body");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInBodyWithEndTagBr() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.EndTag token = new Token.EndTag();
        token.name("br");
        assertFalse(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testInBodyWithUnknownEndTag() {
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("body");
        Token.EndTag token = new Token.EndTag();
        token.name("unknown");
        assertTrue(HtmlTreeBuilderState.InBody.process(token, tb));
    }

    @Test
    public void testTextWithCharacter() {
        tb.transition(HtmlTreeBuilderState.Text);
        Token.Character token = new Token.Character();
        token.data("x");
        assertTrue(HtmlTreeBuilderState.Text.process(token, tb));
    }

    @Test
    public void testTextWithEndTag() {
        tb.transition(HtmlTreeBuilderState.Text);
        tb.insertStartTag("head");
        Token.EndTag token = new Token.EndTag();
        token.name("head");
        assertTrue(HtmlTreeBuilderState.Text.process(token, tb));
    }

    @Test
    public void testInTableWithCharacter() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Character token = new Token.Character();
        token.data("x");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
    }

    @Test
    public void testInTableWithComment() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
    }

    @Test
    public void testInTableWithDoctypeReturnsFalse() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.InTable.process(token, tb));
    }

    @Test
    public void testInTableWithCaptionStartTag() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag token = new Token.StartTag();
        token.name("caption");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInTableWithColgroupStartTag() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag token = new Token.StartTag();
        token.name("colgroup");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInTableWithColStartTag() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag token = new Token.StartTag();
        token.name("col");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
    }

    @Test
    public void testInTableWithBodyStartTag() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag token = new Token.StartTag();
        token.name("tbody");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInTableWithFormStartTag() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.StartTag token = new Token.StartTag();
        token.name("form");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
    }

    @Test
    public void testInTableWithEndTagTable() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.EndTag token = new Token.EndTag();
        token.name("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInTableWithEndTagInvalid() {
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.EndTag token = new Token.EndTag();
        token.name("body");
        assertFalse(HtmlTreeBuilderState.InTable.process(token, tb));
    }

    @Test
    public void testInTableTextWithCharacter() {
        tb.transition(HtmlTreeBuilderState.InTableText);
        Token.Character token = new Token.Character();
        token.data("x");
        assertTrue(HtmlTreeBuilderState.InTableText.process(token, tb));
    }

    @Test
    public void testInTableTextWithNullCharacter() {
        tb.transition(HtmlTreeBuilderState.InTableText);
        Token.Character token = new Token.Character();
        token.data("\u0000");
        assertFalse(HtmlTreeBuilderState.InTableText.process(token, tb));
    }

    @Test
    public void testInCaptionWithEndTagCaption() {
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.processStartTag("caption");
        Token.EndTag token = new Token.EndTag();
        token.name("caption");
        assertTrue(HtmlTreeBuilderState.InCaption.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInCaptionWithEndTagTable() {
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.processStartTag("caption");
        Token.EndTag token = new Token.EndTag();
        token.name("table");
        assertTrue(HtmlTreeBuilderState.InCaption.process(token, tb));
    }

    @Test
    public void testInCaptionWithEndTagInvalid() {
        tb.transition(HtmlTreeBuilderState.InCaption);
        tb.insertStartTag("table");
        tb.processStartTag("caption");
        Token.EndTag token = new Token.EndTag();
        token.name("html");
        assertFalse(HtmlTreeBuilderState.InCaption.process(token, tb));
    }

    @Test
    public void testInColumnGroupWithWhitespace() {
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Token.Character token = new Token.Character();
        token.data(" ");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(token, tb));
    }

    @Test
    public void testInColumnGroupWithComment() {
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(token, tb));
    }

    @Test
    public void testInColumnGroupWithColStartTag() {
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Token.StartTag token = new Token.StartTag();
        token.name("col");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(token, tb));
    }

    @Test
    public void testInColumnGroupWithEndTagColgroup() {
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("colgroup");
        Token.EndTag token = new Token.EndTag();
        token.name("colgroup");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInColumnGroupWithEndTagColgroupWhenHtml() {
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Token.EndTag token = new Token.EndTag();
        token.name("colgroup");
        assertFalse(HtmlTreeBuilderState.InColumnGroup.process(token, tb));
    }

    @Test
    public void testInTableBodyWithTrStartTag() {
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        Token.StartTag token = new Token.StartTag();
        token.name("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyWithTdStartTag() {
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        Token.StartTag token = new Token.StartTag();
        token.name("td");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(token, tb));
    }

    @Test
    public void testInTableBodyWithOtherTableStartTag() {
        tb.transition(HtmlTreeBuilderState.InTableBody);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        Token.StartTag token = new Token.StartTag();
        token.name("caption");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(token, tb));
    }

    @Test
    public void testInRowWithTdStartTag() {
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");
        Token.StartTag token = new Token.StartTag();
        token.name("td");
        assertTrue(HtmlTreeBuilderState.InRow.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowWithTrStartTag() {
        tb.transition(HtmlTreeBuilderState.InRow);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        Token.StartTag token = new Token.StartTag();
        token.name("tr");
        assertTrue(HtmlTreeBuilderState.InRow.process(token, tb));
    }

    @Test
    public void testInCellWithEndTagTd() {
        tb.transition(HtmlTreeBuilderState.InCell);
        tb.insertStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");
        tb.processStartTag("td");
        Token.EndTag token = new Token.EndTag();
        token.name("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(token, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInSelectWithOptionStartTag() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.processStartTag("select");
        Token.StartTag token = new Token.StartTag();
        token.name("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(token, tb));
    }

    @Test
    public void testInSelectWithEndTagSelect() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.processStartTag("select");
        Token.EndTag token = new Token.EndTag();
        token.name("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(token, tb));
    }

    @Test
    public void testInSelectWithInputStartTagWhenNotInSelectScope() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.StartTag token = new Token.StartTag();
        token.name("input");
        assertFalse(HtmlTreeBuilderState.InSelect.process(token, tb));
    }

    @Test
    public void testInSelectInTableWithCaptionStartTag() {
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Token.StartTag token = new Token.StartTag();
        token.name("caption");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(token, tb));
    }

    @Test
    public void testAfterBodyWithWhitespace() {
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Token.Character token = new Token.Character();
        token.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(token, tb));
    }

    @Test
    public void testAfterBodyWithEndTagHtml() {
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Token.EndTag token = new Token.EndTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(token, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInFramesetWithFramesetStartTag() {
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Token.StartTag token = new Token.StartTag();
        token.name("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(token, tb));
    }

    @Test
    public void testInFramesetWithFrameStartTag() {
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Token.StartTag token = new Token.StartTag();
        token.name("frame");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(token, tb));
    }

    @Test
    public void testInFramesetWithEndTagFrameset() {
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.processStartTag("frameset");
        Token.EndTag token = new Token.EndTag();
        token.name("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(token, tb));
    }

    @Test
    public void testAfterFramesetWithEndTagHtml() {
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Token.EndTag token = new Token.EndTag();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(token, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterAfterBodyWithComment() {
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(token, tb));
    }

    @Test
    public void testAfterAfterBodyWithDoctype() {
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Token.Doctype token = new Token.Doctype();
        token.name("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(token, tb));
    }

    @Test
    public void testAfterAfterFramesetWithComment() {
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Token.Comment token = new Token.Comment();
        token.data("comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(token, tb));
    }

    @Test
    public void testForeignContentReturnsTrue() {
        Token.StartTag token = new Token.StartTag();
        token.name("svg");
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(token, tb));
    }
}