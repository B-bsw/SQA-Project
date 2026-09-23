package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder tb;
    private Tokeniser tokeniser;
    private Token.TokenListener listener;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        tokeniser = new Tokeniser(new CharacterReader(""), null);
        listener = new Token.TokenListener() {
            public void onToken(Token token) {}
        };
        tb.setTokeniser(tokeniser);
    }

    @After
    public void tearDown() {
        tb = null;
        tokeniser = null;
        listener = null;
    }

    @Test
    public void testProcessWhitespace() {
        Token.Character c = new Token.Character();
        c.data(" ");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test comment");
        assertTrue(tb.process(comment));
    }

    @Test
    public void testProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        assertTrue(tb.process(doctype));
    }

    @Test
    public void testProcessStartTagHtml() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEndTagHead() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagBody() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("body");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagBr() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("br");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessStartTagBase() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("base");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagMeta() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("meta");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagTitle() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("title");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagStyle() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("style");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagNoscript() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noscript");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagScript() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("script");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEndTagInHeadInvalid() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("body");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessStartTagBody() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("body");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagFrameset() {
        tb.state = HtmlTreeBuilderState.InHead;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("frameset");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyText() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyDiv() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyForm() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyTable() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("table");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyInput() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("input");
        startTag.attributes.put("type", "hidden");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyTextarea() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("textarea");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodySelect() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("select");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyOption() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyOptgroup() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("optgroup");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyLi() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("li");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyDd() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("dd");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyDt() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("dt");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyButton() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("button");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyNobr() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("nobr");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyA() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("a");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyImg() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyBr() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyHr() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("hr");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyXmp() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("xmp");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyIframe() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("iframe");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInBodyNoembed() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noembed");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEndTagP() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("p"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("p");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagDiv() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("div"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagForm() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("form"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("form");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagLi() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("li"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("li");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagDd() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("dd"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("dd");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagButton() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("button"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("button");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagTable() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("table");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagTr() {
        tb.state = HtmlTreeBuilderState.InTableBody;
        tb.push(new Element("tr"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tr");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagTd() {
        tb.state = HtmlTreeBuilderState.InCell;
        tb.push(new Element("td"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("td");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessStartTagInTableTr() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tr");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableTd() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("td");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableTh() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("th");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableBody() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tbody");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableCaption() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("caption");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableColgroup() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("colgroup");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInTableCol() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("col");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEndTagInTableCaption() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("caption"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("caption");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagInTableColgroup() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("colgroup"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("colgroup");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessStartTagInSelectOption() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInSelectOptgroup() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("optgroup");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInSelectSelect() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("select");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEndTagInSelectSelect() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("select");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessEndTagInFramesetFrameset() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        tb.push(new Element("frameset"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("frameset");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessStartTagInFramesetFrame() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("frame");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessStartTagInFramesetNoframes() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noframes");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessEOFInBody() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("body"), 0);
        Token.EOF eof = new Token.EOF();
        assertTrue(tb.process(eof));
    }

    @Test
    public void testIsSpecial() {
        Element el = new Element("script");
        assertTrue(tb.isSpecial(el));
    }

    @Test
    public void testIsSpecialFalse() {
        Element el = new Element("div");
        assertFalse(tb.isSpecial(el));
    }

    @Test
    public void testIsWhitespace() {
        assertTrue(HtmlTreeBuilder.isWhitespace(' '));
        assertTrue(HtmlTreeBuilder.isWhitespace('\t'));
        assertFalse(HtmlTreeBuilder.isWhitespace('a'));
    }

    @Test
    public void testIsActuallyWhitespace() {
        Token.Character c = new Token.Character();
        c.data("   ");
        assertTrue(HtmlTreeBuilder.isActuallyWhitespace(c));
        c.data("  a ");
        assertFalse(HtmlTreeBuilder.isActuallyWhitespace(c));
    }

    @Test
    public void testClearStackToTableContext() {
        tb.push(new Element("div"), 0);
        tb.clearStackToTableContext();
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableRowContext() {
        tb.push(new Element("tr"), 0);
        tb.clearStackToTableRowContext();
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        tb.push(new Element("tbody"), 0);
        tb.clearStackToTableBodyContext();
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableCells() {
        tb.push(new Element("td"), 0);
        tb.clearStackToTableCells();
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testResetInsertionMode() {
        tb.push(new Element("select"), 0);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testFramesetOkDefault() {
        assertTrue(tb.framesetOk());
    }

    @Test
    public void testSetFramesetOk() {
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testCurrentElement() {
        Element div = new Element("div");
        tb.push(div, 0);
        assertEquals(div, tb.currentElement());
    }

    @Test
    public void testGetStack() {
        tb.push(new Element("div"), 0);
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testGetActiveFormattingElement() {
        Element a = new Element("a");
        tb.getActiveFormattingElements().add(a);
        assertEquals(a, tb.getActiveFormattingElement("a"));
        assertNull(tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testGetElements() {
        Element div = new Element("div");
        tb.push(div, 0);
        assertNotNull(tb.getElements());
    }

    @Test
    public void testParseFragment() {
        String fragment = "<p>Hello";
        Element context = new Element("body");
        tb.parseFragment(fragment, context, "");
        assertNotNull(tb.getCurrentElement());
    }

    @Test
    public void testParseFragmentWithNullContext() {
        String fragment = "<p>Hello";
        assertNotNull(tb.parseFragment(fragment, null, ""));
    }

    @Test
    public void testParseEmptyFragment() {
        String fragment = "";
        Element context = new Element("body");
        tb.parseFragment(fragment, context, "");
        assertNotNull(tb.getCurrentElement());
    }

    @Test
    public void testProcessWithToken() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInTable() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tr");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInTableText() {
        tb.state = HtmlTreeBuilderState.InTableText;
        tb.push(new Element("table"), 0);
        Token.Character c = new Token.Character();
        c.data("text");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenInCell() {
        tb.state = HtmlTreeBuilderState.InCell;
        tb.push(new Element("td"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tr");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInSelectInTable() {
        tb.state = HtmlTreeBuilderState.InSelectInTable;
        tb.push(new Element("select"), 0);
        tb.push(new Element("table"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("table");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenInColumnGroup() {
        tb.state = HtmlTreeBuilderState.InColumnGroup;
        tb.push(new Element("colgroup"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("col");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenAfterBody() {
        tb.state = HtmlTreeBuilderState.AfterBody;
        tb.push(new Element("body"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInFrameset() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        tb.push(new Element("frameset"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("frameset");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInSelect() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.Character c = new Token.Character();
        c.data("a");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenInSelectEnd() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("select");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenInBody() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("body"), 0);
        Token.Character c = new Token.Character();
        c.data("test");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenCharacterInTable() {
        tb.state = HtmlTreeBuilderState.InTable;
        tb.push(new Element("table"), 0);
        Token.Character c = new Token.Character();
        c.data("t");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenComment() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.Comment comment = new Token.Comment();
        comment.data("comment");
        assertTrue(tb.process(comment));
    }

    @Test
    public void testProcessTokenEOF() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("body"), 0);
        Token.EOF eof = new Token.EOF();
        assertTrue(tb.process(eof));
    }

    @Test
    public void testProcessTokenDoctype() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        assertTrue(tb.process(doctype));
    }

    @Test
    public void testProcessTokenEndTagHtml() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("html"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("html");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenStartTagHead() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("head");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagImage() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("image");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagIsindex() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("isindex");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagTextarea() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("textarea");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagXmp() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("xmp");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagIFrame() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("iframe");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagNoembed() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noembed");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagSelect() {
        tb.state = HtmlTreeBuilderState.InBody;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("select");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenEndTagAdoption() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("div"), 0);
        tb.getActiveFormattingElements().add(new Element("span"));
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("span");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenEndTagNonAdoption() {
        tb.state = HtmlTreeBuilderState.InBody;
        tb.push(new Element("div"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenStartTagInSelectOption() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagInSelectOptgroup() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("optgroup");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagInSelectOptionWithSpace() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenEndTagInSelectOption() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("option"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("option");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenEndTagInSelectOptgroup() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("optgroup"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("optgroup");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenEndTagInSelectSelect() {
        tb.state = HtmlTreeBuilderState.InSelect;
        tb.push(new Element("select"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("select");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenStartTagInFramesetNoframes() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("noframes");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenStartTagInFramesetHtml() {
        tb.state = HtmlTreeBuilderState.InFrameset;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInColumnGroupEnd() {
        tb.state = HtmlTreeBuilderState.InColumnGroup;
        tb.push(new Element("colgroup"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenCharacterInColumnGroup() {
        tb.state = HtmlTreeBuilderState.InColumnGroup;
        tb.push(new Element("colgroup"), 0);
        Token.Character c = new Token.Character();
        c.data(" ");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenInTableTextCharacter() {
        tb.state = HtmlTreeBuilderState.InTableText;
        tb.push(new Element("table"), 0);
        Token.Character c = new Token.Character();
        c.data("a");
        assertTrue(tb.process(c));
    }

    @Test
    public void testProcessTokenInTableTextEnd() {
        tb.state = HtmlTreeBuilderState.InTableText;
        tb.push(new Element("table"), 0);
        Token.EOF eof = new Token.EOF();
        assertTrue(tb.process(eof));
    }

    @Test
    public void testProcessTokenInCellStartTag() {
        tb.state = HtmlTreeBuilderState.InCell;
        tb.push(new Element("td"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("th");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInCellEndTag() {
        tb.state = HtmlTreeBuilderState.InCell;
        tb.push(new Element("td"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("td");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenInTableBodyEndTag() {
        tb.state = HtmlTreeBuilderState.InTableBody;
        tb.push(new Element("tbody"), 0);
        tb.push(new Element("tr"), 0);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tr");
        assertTrue(tb.process(endTag));
    }

    @Test
    public void testProcessTokenInTableBodyStartTag() {
        tb.state = HtmlTreeBuilderState.InTableBody;
        tb.push(new Element("tbody"), 0);
        tb.push(new Element("tr"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("td");
        assertTrue(tb.process(startTag));
    }

    @Test
    public void testProcessTokenInColumnGroupWithTable() {
        tb.state = HtmlTreeBuilderState.InColumnGroup;
        tb.push(new Element("colgroup"), 0);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("table");
        assertTrue(tb.process(startTag));
    }
}