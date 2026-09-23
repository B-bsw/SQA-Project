package org.jsoup.parser;

import org.jsoup.parser.Token.*;
import org.jsoup.parser.TokeniserState;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private HtmlTreeBuilderState state;
    private Tokeniser t;
    private Token.TokenType type;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        state = new HtmlTreeBuilderState.InBody();
    }

    @After
    public void tearDown() {
        tb = null;
        state = null;
    }

    @Test
    public void testProcessDoctype() {
        Token.Doctype dt = new Token.Doctype();
        dt.setName("html");
        dt.setForceQuirks(false);
        boolean result = state.process(dt, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessDoctypeForceQuirks() {
        Token.Doctype dt = new Token.Doctype();
        dt.setName("html");
        dt.setForceQuirks(true);
        boolean result = state.process(dt, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessWhitespace() {
        Token.Character c = new Token.Character();
        c.data(" ");
        c.type(Token.TokenType.Character);
        boolean result = state.process(c, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        boolean result = state.process(comment, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagHtml() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("html");
        boolean result = state.process(tag, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessEndTagHead() {
        Token.EndTag end = new Token.EndTag();
        end.name("head");
        boolean result = new HtmlTreeBuilderState.InHead().process(end, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessEndTagBrInInBody() {
        Token.EndTag end = new Token.EndTag();
        end.name("br");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagHeadInBody() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("head");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagHtmlInBody() {
        Token.EndTag end = new Token.EndTag();
        end.name("html");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagBase() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("base");
        tag.attributes.put("href", "test");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagMeta() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("meta");
        tag.attributes.put("charset", "utf-8");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagTitle() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("title");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagStyle() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("style");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagNoscript() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("noscript");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagScript() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("script");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagBody() {
        Token.EndTag end = new Token.EndTag();
        end.name("body");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagNoscript() {
        Token.EndTag end = new Token.EndTag();
        end.name("noscript");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagBr() {
        Token.EndTag end = new Token.EndTag();
        end.name("br");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagFrameset() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("frameset");
        boolean result = state.process(tag, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagForm() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("form");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagTable() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("table");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagSelect() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("select");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagOption() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("option");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagOptgroup() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("optgroup");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagOption() {
        Token.EndTag end = new Token.EndTag();
        end.name("option");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagSelect() {
        Token.EndTag end = new Token.EndTag();
        end.name("select");
        boolean result = state.process(end, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagInput() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.attributes.put("type", "text");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagTextarea() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("textarea");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagCaption() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("caption");
        boolean result = state.process(new HtmlTreeBuilderState.InTable(), tb);
        assertFalse(result);
    }

    @Test
    public void testProcessEndTagCaption() {
        Token.EndTag end = new Token.EndTag();
        end.name("caption");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagColgroup() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("colgroup");
        boolean result = state.process(tag, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagCol() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("col");
        boolean result = state.process(tag, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagTbody() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("tbody");
        boolean result = state.process(tag, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessEndTagTr() {
        Token.EndTag end = new Token.EndTag();
        end.name("tr");
        boolean result = state.process(end, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagTd() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("td");
        boolean result = state.process(new HtmlTreeBuilderState.InTable(), tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagTh() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("th");
        boolean result = state.process(new HtmlTreeBuilderState.InTable(), tb);
        assertFalse(result);
    }

    @Test
    public void testProcessEndTagTd() {
        Token.EndTag end = new Token.EndTag();
        end.name("td");
        boolean result = state.process(end, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagTable() {
        Token.EndTag end = new Token.EndTag();
        end.name("table");
        boolean result = state.process(end, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessStartTagFrame() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("frame");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessStartTagNoframes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("noframes");
        boolean result = state.process(tag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTagFrameset() {
        Token.EndTag end = new Token.EndTag();
        end.name("frameset");
        boolean result = state.process(end, tb);
        assertFalse(result);
    }

    @Test
    public void testProcessCharacterInInBody() {
        Token.Character c = new Token.Character();
        c.data("a");
        c.type(Token.TokenType.Character);
        boolean result = state.process(c, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessNullCharacter() {
        Token.Character c = new Token.Character();
        c.data(HtmlTreeBuilderState.InBody.nullString);
        c.type(Token.TokenType.Character);
        boolean result = state.process(c, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessWhiteSpaceCharacter() {
        Token.Character c = new Token.Character();
        c.data(" ");
        c.type(Token.TokenType.Character);
        tb.framesetOk(true);
        boolean result = state.process(c, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessEOF() {
        Token.EOF eof = new Token.EOF();
        boolean result = state.process(eof, tb);
        assertFalse(result);
    }

    @Test
    public void testIsWhitespace() {
        assertTrue(StringUtil.isWhitespace(" "));
        assertFalse(StringUtil.isWhitespace("a"));
    }

    @Test
    public void testInBodyEndAdoptionFormatters() {
        String[] formatters = new String[]{"b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        assertEquals(13, formatters.length);
    }

    @Test
    public void testInBodyEndClosers() {
        String[] closers = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        assertEquals(25, closers.length);
    }

    @Test
    public void testInBodyStartFormatters() {
        String[] formatters = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        assertEquals(12, formatters.length);
    }

    @Test
    public void testInBodyStartMedia() {
        String[] media = new String[]{"param", "source", "track"};
        assertEquals(3, media.length);
    }

    @Test
    public void testInBodyStartInputAttribs() {
        String[] attrs = new String[]{"name", "action", "prompt"};
        assertEquals(3, attrs.length);
    }

    @Test
    public void testConstantsInBodyStartToHead() {
        String[] toHead = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"};
        assertEquals(9, toHead.length);
    }

    @Test
    public void testInBodyStartPClosers() {
        String[] closers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        assertEquals(23, closers.length);
    }

    @Test
    public void testInBodyEndPClosers() {
        String[] closers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        assertEquals(23, closers.length);
    }

    @Test
    public void testInBodyStartApplets() {
        String[] applets = new String[]{"applet", "marquee", "object"};
        assertEquals(3, applets.length);
    }

    @Test
    public void testInBodyEndApplets() {
        String[] applets = new String[]{"applet", "marquee", "object"};
        assertEquals(3, applets.length);
    }

    @Test
    public void testInBodyStartDrop() {
        String[] drop = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        assertEquals(11, drop.length);
    }

    @Test
    public void testInBodyStartOptions() {
        String[] options = new String[]{"optgroup", "option"};
        assertEquals(2, options.length);
    }

    @Test
    public void testInBodyStartRuby() {
        String[] ruby = new String[]{"rp", "rt"};
        assertEquals(2, ruby.length);
    }
}