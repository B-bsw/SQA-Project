package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private HtmlTreeBuilderState state;
    private Token.TokenType type;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        state = new HtmlTreeBuilderState();
        type = new Token.TokenType();
    }

    @After
    public void tearDown() {
        tb = null;
        state = null;
        type = null;
    }

    @Test
    public void testProcessNullTokenReturnsFalse() {
        assertFalse(state.process(null, tb));
    }

    @Test
    public void testWhitespaceTokenReturnsTrue() {
        Token.Character c = new Token.Character();
        c.data(" ");
        c.type(Token.TokenType.Character);
        assertTrue(state.process(c, tb));
    }

    @Test
    public void testCommentTokenReturnsTrue() {
        Token.Comment comment = new Token.Comment();
        assertTrue(state.process(comment, tb));
    }

    @Test
    public void testDoctypeTokenReturnsTrue() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        assertTrue(state.process(doctype, tb));
    }

    @Test
    public void testStartTagWithValidNameReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagWithInvalidNameReturnsFalse() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("invalid123");
        assertFalse(state.process(startTag, tb));
    }

    @Test
    public void testEndTagWithValidNameReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagWithInvalidNameReturnsFalse() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("invalid123");
        assertFalse(state.process(endTag, tb));
    }

    @Test
    public void testCharacterWithWhitespaceReturnsTrue() {
        Token.Character c = new Token.Character();
        c.data(" ");
        c.type(Token.TokenType.Character);
        assertTrue(state.process(c, tb));
    }

    @Test
    public void testCharacterWithNonWhitespaceReturnsFalse() {
        Token.Character c = new Token.Character();
        c.data("a");
        c.type(Token.TokenType.Character);
        assertFalse(state.process(c, tb));
    }

    @Test
    public void testEOFTokenReturnsTrue() {
        Token.EOF eof = new Token.EOF();
        assertTrue(state.process(eof, tb));
    }

    @Test
    public void testUnknownTokenTypeReturnsFalse() {
        Token token = new Token() {};
        assertFalse(state.process(token, tb));
    }

    @Test
    public void testStartTagHtmlReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagHeadReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("head");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testEndTagBodyReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("body");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagHtmlReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("html");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagBrReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("br");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagDivReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testStartTagMediaWithNoFramesReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noframes");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagScriptReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("script");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTitleReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("title");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagStyleReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("style");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagMetaReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("meta");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagLinkReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("link");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBaseReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("base");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBasefontReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("basefont");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBgsoundReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("bgsound");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagCommandReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("command");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagFrameReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("frame");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagFramesetReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("frameset");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagNoscriptReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noscript");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagParamReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("param");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagSourceReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("source");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTrackReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("track");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBodyReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("body");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagOptionReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagOptgroupReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("optgroup");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagSelectReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("select");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagInputReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("input");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagKeygenReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("keygen");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTextareaReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("textarea");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTrReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tr");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTdReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("td");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagThReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("th");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagCaptionReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("caption");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagColgroupReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("colgroup");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagColReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("col");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTbodyReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tbody");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTfootReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tfoot");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTheadReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("thead");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTableReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("table");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagFormReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagLiReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("li");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagDdReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("dd");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagDtReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("dt");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagPlaintextReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("plaintext");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagButtonReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("button");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagAEndReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("a");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("b");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagBigReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("big");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagCodeReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("code");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagEmReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("em");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagFontReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("font");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagIReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("i");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagSReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("s");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagSmallReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("small");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagStrikeReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("strike");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagStrongReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("strong");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagTtReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tt");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagUReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("u");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagNobrReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("nobr");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagAppletReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("applet");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagObjectReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("object");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagEmbedReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("embed");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagAreaReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("area");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagImgReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagImageReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("image");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagIsindexReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("isindex");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagXmpReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("xmp");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagIframeReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("iframe");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagNoembedReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noembed");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagMathReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("math");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagSvgReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("svg");
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testEndTagFormReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("form");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTrimReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tr");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableCellReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("td");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableHeaderReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("th");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableButtonReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("button");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagParagraphReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("p");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagListItemReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("li");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagDefinitionDataReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("dd");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagDefinitionTermReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("dt");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagInsideCellReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("caption");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagColumnGroupReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("colgroup");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableRowReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tr");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableBodySectionReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tbody");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableFooterReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tfoot");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableHeaderSectionReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("thead");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testEndTagTableReturnsTrue() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("table");
        assertTrue(state.process(endTag, tb));
    }

    @Test
    public void testWhitespaceCharacterWithNullDataReturnsTrue() {
        Token.Character c = new Token.Character();
        c.type(Token.TokenType.Character);
        c.data(null);
        assertTrue(state.process(c, tb));
    }

    @Test
    public void testNonWhitespaceCharacterWithNullDataReturnsFalse() {
        Token.Character c = new Token.Character();
        c.type(Token.TokenType.Character);
        c.data("a");
        assertFalse(state.process(c, tb));
    }

    @Test
    public void testStartTagWithNullNameReturnsFalse() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name(null);
        assertFalse(state.process(startTag, tb));
    }

    @Test
    public void testEndTagWithNullNameReturnsFalse() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name(null);
        assertFalse(state.process(endTag, tb));
    }

    @Test
    public void testEndTagWithEmptyNameReturnsFalse() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("");
        assertFalse(state.process(endTag, tb));
    }

    @Test
    public void testStartTagWithEmptyNameReturnsFalse() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("");
        assertFalse(state.process(startTag, tb));
    }

    @Test
    public void testStartTagWithFormNameAndFormElementNullReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        tb.setFormElement(null);
        assertTrue(state.process(startTag, tb));
    }

    @Test
    public void testStartTagWithFormNameAndFormElementNotNullReturnsTrue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        Element form = new Element(Tag.valueOf("form"), "");
        tb.setFormElement(form);
        assertTrue(state.process(startTag, tb));
    }
}